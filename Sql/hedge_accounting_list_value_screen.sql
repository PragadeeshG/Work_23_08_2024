create table if not exists hedge_accounting_list_value_screen(
record_id Integer not null,
ha_list_val_screen_id Integer null,
ha_list_val_screen_name varchar(255) null,
ha_list_val_screen_url varchar(255) null,
ha_list_val_page_url varchar(255) null,
actions_ids varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint hedge_accounting_list_value_screen_pk primary key(record_id));