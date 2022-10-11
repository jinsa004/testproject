<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="../layout/header.jsp"%>

request_number = request("number")
count_check = request("count_check")
event_type = request("event_type")
uid = request.cookies("sub_id")
member_kind = request("member_kind")
phone1 = request("phone1")
phone2 = request("phone2")
phone3 = request("phone3")
tell = request("tell")

result_flag = 0

if request_number <> "" then
    q_pro = "insert join(uid, uname, receive_name, member_kind, product_count " _
    & " , address, address2, zipcode, event_nm, mobile, mobile2, mobile3, phone " _
    & " , reg_ip, pay_date )" _
    & " values ('2022', '"& uid &"', '"& user_name &"', '"& receive_name &"', '"& member_kind & "','"& product_count
    &"'" _
    & " , '"& addr &"', '"& addr_detail &"', '"& zipcode & "', '"& event_nm & "', '"& phone1 &"', '"& phone2 &"', '"&
    phone3 &"', '"& tell &"'" _
    & " , '"& reg_ip &"', '"& reg_date &"' )"
    dbcon.execute(q_pro)
    response.write result_flag = 1
    end if