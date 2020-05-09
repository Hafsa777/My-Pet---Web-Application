<%-- 
    Document   : emailSending
    Created on : May 3, 2019, 11:08:26 PM
    Author     : Zahrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h2>Vaccine Sending Details</h2>
        
        <form action="emailServlet" method="GET">
        <<select name="year">
           
            <option>2019</option>
            <option>2020</option>
             <option>2021</option>
            <option>2022</option> 
            
        </select>
        <select name="month">
            <option>January</option>
            <option>February</option>
            <option>March</option>
            <option>April</option>
            <option>May</option>
            <option>June</option>
            <option>July</option>
            <option>August</option>
            <option>September</option>
            <option>October</option>
            <option>November</option>
            <option>December</option>
        </select>
        <select name="date">
            <option>01</option>
            <option>02</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
            <option>6</option>
            <option>7</option>
            <option>8</option>
            <option>9</option>
            <option>10</option>
            <option>11</option>
            <option>12</option>
            <option>13</option>
            <option>14</option>
            <option>15</option>
            <option>16</option>
            <option>17</option>
            <option>18</option>
            <option>19</option>
            <option>20</option>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
            <option></option>
        </select>
        <input type="submit" value="select" />
        </form>
        
       
       
    </body>
</html>
