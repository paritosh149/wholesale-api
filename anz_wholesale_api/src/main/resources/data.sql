-- inserts for accounts table			
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (1, 'SGSavings726', '585309209','Savings','2018-11-08 00:00:00','SGD',84327.51);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (2, 'AUSavings933', '791066619','Savings','2018-11-08 00:00:00','SGD',88005.93);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (3, 'AUCurrent433', '321143048','Current','2018-11-08 00:00:00','SGD',38010.62);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (4, 'SGCurrent166', '347786244','Current','2018-11-08 00:00:00','SGD',50664.65);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (5, 'AUCurrent374', '680168913','Current','2018-11-08 00:00:00','SGD',41327.28);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (6, 'AUSavings938', '136056165','Savings','2018-11-08 00:00:00','SGD',48928.79);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (7, 'AUSavings253', '453963528','Savings','2018-11-08 00:00:00','SGD',72117.53);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (8, 'AUCurrent754', '334666982','Savings','2018-11-08 00:00:00','SGD',84327.51);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (9, 'AUCurrent754', '793949180','Current','2018-11-08 00:00:00','SGD',20588.16);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (10, 'SGCurrent294', '768759901','Current','2018-11-08 00:00:00','SGD',5906.55);
INSERT into account (id, account_name, account_number, account_type, balance_date, currency_code, opening_balance) values (11, 'AUCurrent591', '847257972','Current','2018-11-08 00:00:00','SGD',92561.68);

--inserts for transaction table
insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,1,9540.98,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,2,7497.82,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,3,5564.79,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,4,8136.18,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,5,9442.46,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,6,7614.45,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,7,3311.55,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,8,9186.09,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,9,1905.36,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,10,197.78,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,11,8430.49,'Cr',0,'','2012-01-12 00:00:00');

insert into transaction (fk_account_number, id, credit_amount, credit_debit_flag, debit_amount, narrative, value_date )
values (1,12,8.33,'Cr',0,'','2012-01-12 00:00:00');

