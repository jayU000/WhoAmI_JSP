<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로필 리스트</title>
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/css/expert/solo/expert.css">
</head>
<body>

   <!-- Header -->
   <jsp:include page="/app/fix/managementHeader.jsp" />

   <section class="management_wrapper managelist">
      <table class="management_profileList">
         <caption>관리자 관리</caption>
         <colgroup>
				<col width="10%">
				<col width="15%">
				<col width="15%">
				<col width="15%">
				<col width="3%">
				<col width="2%">
				<col width="40%">
         </colgroup>
         <thead>
            <tr>
               <th>관리자 번호</th>
               <th>이름</th>
               <th>소속</th>
               <th>직책</th>
               <th></th>
               <th colspan="2">
               <input type="button" value="추가" onclick="location.href ='#'">
               </th>
            </tr>
         </thead>
         <tbody>
            <tr>
               <td>4</td>
               <td>유정화</td>
               <td>인사팀</td>
               <td>회원관리</td>
               <td></td>
               <td colspan="2">
	               <input type="button" value="상세정보">
	               <input type="button" value="삭제">
	               <input type="button" value="권한설정">
                </td>
            </tr>
            <tr>
               <td>3</td>
               <td>유정하</td>
               <td>인사팀 </td>
               <td>신고관리</td>
               <td></td>
               <td colspan="2">
	               <input type="button" value="상세정보">
	               <input type="button" value="삭제">
	               <input type="button" value="권한설정">
            </tr>
            <tr>
               <td>2</td>
               <td>유정호</td>
               <td>인사팀</td>
               <td>상담자관리</td>
               <td></td>
               <td colspan="2">
	               <input type="button" value="상세정보">
	               <input type="button" value="삭제">
	               <input type="button" value="권한설정">
            </tr>
            <tr>
               <td>1</td>
               <td>유정홍</td>
               <td>인사팀 </td>
               <td>팀장 </td>
               <td></td>
               <td colspan="2">
	               <input type="button" value="상세정보">
	               <input type="button" value="삭제">
	               <input type="button" value="권한설정">
            </tr>
            
         <!--    <tr>
               <td colspan="7" align="center">등록된 게시물이 없습니다.</td>
            </tr> -->
         </tbody>
      </table>

   </section>

</body>
</html>