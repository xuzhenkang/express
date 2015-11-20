##########################mysql5.0############################

#注：所有关键字均使用小写
#创建数据库express
create database express
	character set 'utf8'
	collate 'utf8_general_ci';
use express;

###创建用户表###
create table users (
	id bigint primary key, #用户ID即学号
	username varchar(50),#用户名
	password varchar(20) not null,#密码
	id_card varchar(20) not null,#绑定身份证号码
	department varchar(20) not null,#寝室
	tel bigint, #绑定手机号码
	email varchar(50), #绑定邮箱
	honor varchar(20), #信用级别
	get_times int, #取货次数
	permission int default 0 #用户权限，0代表普通用户，1代表管理员
);

###创建快递表###
create table express_items (
	id int auto_increment primary key,#主键，自增长
	p_id bigint not null, #用户ID，学号
	g_id bigint, #接单ID,学号
	express_id varchar(20), #快递单号
	express_name varchar(20) not null, #快递公司名称
	get_address varchar(50), #取件地址
	tel bigint not null, #预留电话号码
	get_number int not null, #取货号码
	send_address varchar(50), #送往地址
	remark varchar(50) not null, #备注，填写物品信息，尽量详细。
	money int, #费用精确到1元
	get_time date, #接单者接单时间
	isfinished int default 0, #是否完成
	isfailed int default 0, #该单是否作废
	foreign key(p_id) references users(id),
	foreign key(g_id) references users(id)
);

###快递公司名称字典###
create table express_names (
	express_name varchar(20)
);

###寝室名称字典####
create table departments (
	department_name varchar(50) #寝室：例：十舍
);
###快递网点###
create table express_outlets (
	outlets_name varchar(50) #快递网点名称
);

##插入数据：管理员
insert into users (id,username,password,id_card,department,tel,email,honor,get_times,permission) 
values (1571038, '徐振康', 'xzk', '21102219920513511X', '十舍', 13234040959, 'xuzhenkang@hotmail.com', '传说', 0, 1);
insert into users (id,username,password,id_card,department,tel,email,honor,get_times,permission) 
values (1571036, '辛秉哲', 'xbz', '211022199205135113', '十舍', 13234040958, 'xinbingzhe@hotmail.com', '传说', 0, 1);
insert into users (id,username,password,id_card,department,tel,email,honor,get_times,permission) 
values (1571032, '王泽众', 'wzz', '211022199205135110', '十舍', 18842564379, 'wangzezhong@hotmail.com', '传说', 0, 1);
##插入数据：学生
insert into users (id,username,password,id_card,department,tel,email,honor,get_times,permission) 
values (1571034, '骚逼亮', 'sbl', '211022199205135116', '十舍', 18842564379, 'saobiliang@hotmail.com', '骚逼', 0, 0);


##插入寝室名称字典数据##
insert into departments(department_name) values ('一舍');
insert into departments(department_name) values ('二舍');
insert into departments(department_name) values ('三舍');
insert into departments(department_name) values ('四舍');
insert into departments(department_name) values ('五舍');
insert into departments(department_name) values ('六舍');
insert into departments(department_name) values ('七舍');
insert into departments(department_name) values ('八舍');
insert into departments(department_name) values ('九舍');
insert into departments(department_name) values ('十舍');

##插入快递网点数据
insert into express_outlets(outlets_name) values ('美容店（西门）');
insert into express_outlets(outlets_name) values ('知行楼后');
insert into express_outlets(outlets_name) values ('小麦公社');
insert into express_outlets(outlets_name) values ('四舍楼下下京东派');
insert into express_outlets(outlets_name) values ('小北门');
