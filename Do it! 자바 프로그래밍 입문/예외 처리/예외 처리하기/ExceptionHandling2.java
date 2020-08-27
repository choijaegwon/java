package exception;

​

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

​

public class ExceptionHandling2 {

public static void main(String[] args) {

FileInputStream fis = null;

​

try {

fis = new FileInputStream("a.txt");

} catch (FileNotFoundException e) {

System.out.println(e);

return;

}finally{

if(fis != null){

try {

fis.close(); //파일 입력 스트림 닫기

} catch (IOException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

}

System.out.println("항상 수행 됩니다.");

}

System.out.println("여기도 수행됩니다.");

}

}

​

출력

java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)

항상 수행 됩니다.