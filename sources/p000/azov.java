package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: azov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azov {

    /* renamed from: a */
    private static final bngx f99801a = bngx.m109365a("senderNumber", "productName", "formattedRecipientNumber", "senderName", "numberOfMessages", "numberMembers", "namesOfMembers", "callRemoteName", "photoNumber", "albumName");

    /* renamed from: a */
    public static String m85980a(String str, bnhe bnhe) {
        bnre i = f99801a.listIterator();
        while (i.hasNext()) {
            String str2 = (String) i.next();
            if (bnhe.containsKey(str2)) {
                String c = azpi.m86083c((String) bnhe.get(str2));
                String quote = Pattern.quote("$");
                StringBuilder sb = new StringBuilder(String.valueOf(quote).length() + 15 + String.valueOf(str2).length());
                sb.append(quote);
                sb.append(str2);
                sb.append("(?![a-zA-Z0-9])");
                str = str.replaceAll(sb.toString(), Matcher.quoteReplacement(c));
            }
        }
        return str.replaceAll(Pattern.quote("\\u00A0"), Matcher.quoteReplacement(" "));
    }
}
