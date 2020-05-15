package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: audx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audx extends auej {

    /* renamed from: a */
    public auek f91461a;

    /* renamed from: b */
    private String f91462b = "";

    static {
        audg.m76790a("SciFi_CallId");
    }

    public audx(String str) {
        super(str);
        Matcher matcher = Pattern.compile("%(\\S+)@xxx").matcher(str);
        if (matcher.find()) {
            this.f91462b = matcher.group(1);
        } else {
            Matcher matcher2 = Pattern.compile("@(\\S+)").matcher(str);
            if (matcher2.find()) {
                this.f91462b = matcher2.group(1);
            } else {
                mo50487b();
                return;
            }
        }
        if (this.f91462b.contains(".")) {
            String[] split = this.f91462b.split("\\.", -1);
            int length = split.length;
            if (length >= 2) {
                String str2 = split[length - 2];
                String str3 = split[length - 1];
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append(".");
                sb.append(str3);
                this.f91461a = new auek(sb.toString());
            } else {
                this.f91461a = new auek(this.f91462b);
            }
        } else {
            this.f91461a = new auek(String.valueOf(this.f91462b).concat(".com"));
        }
        String valueOf = String.valueOf(this.f91462b);
        if (valueOf.length() == 0) {
            new String("host: ");
        } else {
            "host: ".concat(valueOf);
        }
    }
}
