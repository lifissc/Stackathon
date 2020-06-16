FROM nginx:1.17.2

# define variable for creating user
ARG GID=8001
ARG GROUP_NAME=idpf
ARG UID=8000
ARG USER_NAME=dockadmi


# create group and user
RUN groupadd -g ${GID} ${GROUP_NAME} && \
  useradd -g ${GID} -u ${UID} ${USER_NAME}

# mkdir and chown to user nginx to run nginx
RUN mkdir /home/nginx /nonexistent && \
  touch /home/nginx/nginx.pid && \
  chown -R ${USER_NAME}:${GROUP_NAME} /home && \
  chown -R ${USER_NAME}:${GROUP_NAME} /nonexistent && \
  chown -R ${USER_NAME}:${GROUP_NAME} /var/cache/nginx && 
  

# define user_name
ARG USER_NAME=dockadmi

# update nginx.conf files
COPY ./nginx/nginx.conf /etc/nginx/nginx.conf
COPY ./nginx/default.conf /etc/nginx/conf.d/default.conf

# run command
WORKDIR /home/nginx

# start servers
nginx
npm run dev