import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
	
public class Page1 {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface NeedBrowser {

		String name() default "";
		String remoteUrl() default "";
		String capabilityFilePath() default "";}
}
