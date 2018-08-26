FROM airhacks/glassfish
COPY ./target/wakma-hrms.war ${DEPLOYMENT_DIR}
