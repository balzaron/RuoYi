drop table if exists installment;
create table installment (
  id int(11) auto_increment comment '分期账单id',
  primary key (id),
  client_name varchar(100) default '' comment '客户名称',
  client_id varchar(18) default '' comment '客户身份证号',
  car_number varchar(10) default '' comment '客户车牌号',
  engine_number varchar(20) default '' comment '客户发动机号',
  register_date date default null comment '初次登记日期',
  mobile varchar(11) default '' comment '客户手机号码',
  installment_total decimal(8,2) default 0.00 comment '分期总额',
  installment_circle int(5) default 12 comment '分期周期'
) engine=innodb auto_increment=1 default charset=utf8 comment = '分期表';