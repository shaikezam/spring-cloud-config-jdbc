# spring-cloud-config-jdbc

Inside the config-server module, run the Application.java with profiles `dev` and `jdbc`

Inside the client module, run the Application.java with profile `dev`

The config server runs in `http://localhost:8888`

The client runs in `http://localhost:8088`

The client has single endpoint = `http://localhost:8088/get_value` (to get the `my.value` property)

To change the value in the server, you can change it via the H2 console: `http://localhost:8888/h2/`

To refresh the configuration in client execute `POST` in `http://localhost:8088/actuator/refresh`
