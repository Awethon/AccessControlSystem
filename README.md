# AccessControlSystem
### Запуск проекта

```
git clone https://github.com/et4/AccessControlSystem.git
sbt docker:publishLocal
docker-compose -f src/main/resources/docker-compose.yml up
```

### API
* __Прикладывание карты к турникету__

  0.0.0.0:8182/action?cardId=&date=&event=
  
* __Получить id всех карт__

  0.0.0.0:8182/getAllCards
  
* __Проверить имеет ли доступ карта__

  0.0.0.0:8182/hasAccess?cardId=

* __Установка личных прав доступа__

  0.0.0.0:8182/setIndividualAccess?cardId=&access=

* __Установка прав доступа группы__

  0.0.0.0:8182/setGroupAccess?groupId=&access=
  
* __Установка исключительных прав карты в рамках группы__

  0.0.0.0:8182/setExceptionalAccess?cardId=&groupId=&access=
  
* __Создание пустой группы__

  0.0.0.0:8182/addEmptyGroup?access=
  
* __Создание новой группы и добавление её картам__

  id карт передаются разделенными через ";"
  
  0.0.0.0:8182/addGroup?cardIds=&access=
  
* __Удаление карты из группы__

  0.0.0.0:8182/kickFromGroup?cardId=&groupId=
  
* __Установка существующей группы карте__

  0.0.0.0:8182/setGroupToCard?cardId=&groupId=

* __Установка существующей группы картам__

  id карт передаются разделенными через ";"
  
  0.0.0.0:8182/setGroupToCards?cardIds=&groupId=  
  
* __Создание новой группы и добавление карт в нее__

  id карт передаются разделенными через ";"
  
  0.0.0.0:8182/createGroupForCards?cardIds=&access=

* __Получение карт, которые совершили больше times неудачных попыток с fromDateTime по toDateTime__

  0.0.0.0:8182/getAnomalies?fromDateTime=&toDateTime=&times=

* __Получение времени проведенного cardId внутри с fromDateTime по toDateTime__

  0.0.0.0:8182/getTimeInside?cardId=&fromDateTime=&toDateTime=
  
* __Получение всех логов входа__

  0.0.0.0:8182/getComeInLogs
  
* __Получение всех логов выхода__

  0.0.0.0:8182/getComeOutLogs
  
* __Получение всех логов карты__

  0.0.0.0:8182/getLogs?cardId=
