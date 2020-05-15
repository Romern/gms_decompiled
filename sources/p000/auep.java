package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: auep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auep extends auej {

    /* renamed from: a */
    public auek f91564a;

    /* renamed from: b */
    public String f91565b = "";

    /* renamed from: c */
    public String f91566c = "";

    public auep(String str) {
        super(str);
        Matcher matcher = Pattern.compile("sip\\D*(\\d+)").matcher(str);
        if (matcher.find()) {
            matcher.group(1);
        } else {
            Matcher matcher2 = Pattern.compile("tel\\D*(\\d+)").matcher(str);
            if (matcher2.find()) {
                this.f91566c = matcher2.group(1);
            } else {
                mo50487b();
            }
        }
        Matcher matcher3 = Pattern.compile("@(\\S[^\\>\\;]+)").matcher(str);
        if (!matcher3.find()) {
            matcher3 = Pattern.compile("context=(\\S[^\\>\\;]+)").matcher(str);
            if (!matcher3.find()) {
                return;
            }
        }
        auek auek = new auek(matcher3.group(1));
        this.f91564a = auek;
        if (!auek.mo50489a().isEmpty()) {
            this.f91565b = this.f91564a.mo50489a();
        }
    }
}
