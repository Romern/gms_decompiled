package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aued */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aued extends auej {

    /* renamed from: a */
    public String f91481a;

    /* renamed from: b */
    private String f91482b = "";

    public aued(String str) {
        super(str);
        String[] split;
        int length;
        Matcher matcher = Pattern.compile("icid-generated-at\\W+(\\S+)").matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            this.f91482b = group;
            if (group.contains(".") && (length = (split = this.f91482b.split("\\.", -1)).length) >= 2) {
                String str2 = split[length - 2];
                String str3 = split[length - 1];
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append(".");
                sb.append(str3);
                auek auek = new auek(sb.toString());
                this.f91482b = auek.mo50489a();
                this.f91481a = auek.f91522a;
                return;
            }
            return;
        }
        mo50487b();
    }
}
