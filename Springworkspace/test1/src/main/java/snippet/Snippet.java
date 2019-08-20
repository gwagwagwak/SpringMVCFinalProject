package snippet;

public class Snippet {
	public static void main(String[] args) {
		<filter>
		        <filter-name>encodingFilter</filter-name>
		        <filter-class>
		            org.springframework.web.filter.CharacterEncodingFilter
		    </filter-class>
		    <init-param>
		            <param-name>encoding</param-name>
		            <param-value>UTF-8</param-value>
		        </init-param>
		</filter>
		<filter-mapping>
		        <filter-name>encodingFilter</filter-name>
		        <url-pattern>/*</url-pattern>
		</filter-mapping>
		
		
		출처: https://hellogk.tistory.com/76?category=529920 [IT Code Storage]
	}
}

