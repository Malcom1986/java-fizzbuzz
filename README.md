# FizzBuzz CLI Utility

[![Java CI](https://github.com/Malcom1986/java-fizzbuzz/actions/workflows/java_ci.yml/badge.svg)](https://github.com/Malcom1986/java-fizzbuzz/actions/workflows/java_ci.yml)

При запуске эта CLI утилита запрашивает у пользователя число и даёт пользователю ответ. 
Вместо чисел, кратных трем, программа должна выводить слово «Fizz», а вместо чисел, кратных пяти — слово «Buzz». Если число кратно и 3, и 5, то программа должна выводить слово «FizzBuzz»

## Пример работы приложения
```bash

./bin/fizzbuzz
Welcome to Fizz Buzz!
Submit a number and get an answer!
Number: 9
Fizz!
Number: 5
Buzz!
Number: 15
FizzBuzz!
Number: 7
7
Number: 133
133
```

## Установка

```bash
make build
```

## Запуск

```bash
make run
```

## Запуск тестов

```bash
make test
```
