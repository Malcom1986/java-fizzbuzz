clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run:
	./build/install/fizbuzz/bin/fizbuzz

test:
	./gradlew test

.PHONY: build