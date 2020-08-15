.PHONY: all build test ping-mysql

all: build

build:
	@gradlew.bat build --warning-mode all

test:
	@gradlew.bat --warning-mode all

run:
	@gradlew.bat :run

ping-mysql:
	@docker exec codelytv-java_ddd_skeleton-mysql mysqladmin  --user=root --password= --host "127.0.0.1" ping --silent

# Start the app
start-mooc_backend:
	@./gradlew :run --args='mooc_backend server'

start-backoffice_frontend:
	@./gradlew :run --args='backoffice_frontend server'
