SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status = 'Active';
SELECT * FROM jaegers WHERE mark = 'Mark-1' AND mark = 'Mark-4';
SELECT * FROM jaegers WHERE mark NE 'Mark-1' AND mark NE 'Mark-4';
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT MIN(launch) FROM jaegers;
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);
SELECT AVG(weight) FROM jaegers;
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active'
DELETE * FROM jaegers WHERE status = 'Destroyed';

/*
выведите всю таблицу
отобразите только не уничтоженных роботов
отобразите роботов нескольких серий: Mark-1 и Mark-4
отобразите всех роботов, кроме Mark-1 и Mark-4
отсортируйте таблицу по убыванию по столбцу mark
отобразите информацию о самом старом роботе
отобразите роботов, которые уничтожили больше всех kaiju
отобразите средний вес роботов
увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
удалите уничтоженных роботов
*/
