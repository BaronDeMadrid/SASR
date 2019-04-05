import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.xquery.*;

import com.saxonica.xqj.SaxonXQDataSource;
public class Test {
public static void main(String [] args) {
	String fileName = "gimnasio.xml";
	String query = "for $x in doc (\""+fileName+"\")/clases/clase return $x";
}
private static void XQuery (String query)throws FileNotFoundException, XQException
{XQDataSource dataSource= new SaxonXQDataSource();
XQConnection connection = dataSource.getConnection();
XQPreparedExpression expression = connection.prepareExpression(query);
XQResultSequence result = expression.executeQuery();
while (result.next()){
	System.out.println(result.getItemAsString(null));
}
}
}
