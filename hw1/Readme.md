1. Создать приложение с вложенностью пакетов не менее 3х, где будет класс для входа и несколько классов с логикой. Пример: приложение для внесения заметок во внешний файл с обязательной фиксацией времени

пример:

*Введите заметку: Hello, world!*

*Дозапись в файл: 16.07.2023 -> Hello, world*

Скомпилируйте и запустите посредством CLI

Решение: 

**javac -sourcepath src -d out src/com/test1/Main.java**

**java -classpath out com/test1/Main**

2(доп).Создать два Docker-образа. Один должен компилировать Java-проект обратно в папку на компьютере пользователя, а второй забирать скомпилированные классы и исполнять их. Пример листинга для docker-compose приведен в презентации семинара

Решение:
Создаем файл docker-compose.yaml:

version: '2.22.0'
services:
my-app1:
image: openjdk:11
command: javac -sourcepath /app/src -d /app/out /app/src/com/test1/Main.java
volumes:
- ./src:/app/src
- ./bin:/app/out

my-app2:
image: openjdk:11
command: java -classpath /app/out com/test1/Main && bash
stdin_open: true
volumes:
- ./bin:/app/out

Запускаем:
docker-compose up

Открываем новый терминал и работаем с командной строкой в приложении:
docker attach notes-app-my-app2-1
