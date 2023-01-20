-- use banksystem;

-- select customername, customermail, accountno, accountbalance from customer left join account ON customer.id = account.customerid;
-- select customername, customermail, accountno, accountbalance from customer right join account ON customer.id = account.customerid;
-- select * from customer cross join account where customer.id = account.customerid;
-- create table transaction(transactionid int primary key auto_increment, transactiontype varchar(255) not null, 
-- transactionamount float not null, transactiondate DATE, transactionTime Time, accountid int, FOREIGN KEY(accountid) references account(accountid));

--insert into transaction(transactiontype, transactionamount, transactiondate, transactionTime, accountid) values ("deposit", 8000, CURDATE(), CURTIME(), 3);
--update account set accountbalance = accountbalance+8000 where accountid = 3;

--insert into transaction(transactiontype, transactionamount, transactiondate, transactionTime, accountid) values ("deposit", 20000, CURDATE(), CURTIME(), 1);
--update account set accountbalance = accountbalance+2000 where accountid = 2;

--select customername, customermail, accountno, accountbalance, transactionamount, transactiontype from customer inner join account ON customer.id = account.customerid inner join transaction ON account.accountid = transaction.accountid;

-- select accountno, SUM(transactionamount) as totaldeposit from account inner join transaction on account.accountid = transaction.transactionid and transaction.transactiontype = "deposit" and account.accountno = 8907657890;
-- select accountno, SUM(transactionamount) as totaldeposit from account inner join transaction on account.accountid = transaction.transactionid and transaction.transactiontype = "deposit" and account.accountno = 8745632568;