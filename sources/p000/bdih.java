package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bdih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdih {
    /* renamed from: a */
    public static String m90858a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        bqye.m113760a(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        StringBuilder sb = new StringBuilder();
        Matcher matcher = Pattern.compile("([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+)(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?").matcher(stringWriter2);
        if (matcher.find()) {
            int i = 1;
            while (i <= matcher.groupCount() && matcher.group(i) != null) {
                sb.append(matcher.group(i));
                i++;
            }
        }
        return sb.toString();
    }
}
