import { TestBed } from '@angular/core/testing';
import { LoginService } from './login.service';
import { HttpClientModule } from "@angular/common/http"
import { defer } from 'rxjs';

describe('LoginstbService', () => {
  let service: LoginService;
  let httpClientSpy: { get: jasmine.Spy };

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientModule],
    });
    httpClientSpy = jasmine.createSpyObj('HttpClient', ['get']);
    service = TestBed.inject(LoginService);
  });

  it('login service will be created', () => {
    expect(service).toBeTruthy();
  });

  it('login service should return expected userInfo', async (done) => {

    const expectedUserInfo = {"userID": "0000001","userName": "Json","birthday": "2000/01/01"}
    httpClientSpy.get.and.returnValue(asyncData(expectedUserInfo));

    const userinfo = await service.doLogin({"userID": "0000001","userName": "Json"}).toPromise();
    expect(userinfo).toEqual(expectedUserInfo, 'expected userinfo'),
    done()
  });
});

export function asyncData<T>(data: T) {
  return defer(() => Promise.resolve(data));
}
