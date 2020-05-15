package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: auea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auea extends auej {

    /* renamed from: a */
    public String f91468a = "";

    /* renamed from: b */
    private aues f91469b;

    public auea(String str) {
        super(str);
        if (cgyd.m147563f()) {
            Matcher matcher = Pattern.compile("verstat=(\\D+)").matcher(str);
            if (matcher.find()) {
                this.f91469b = new aues(matcher.group(1));
            }
        }
        Matcher matcher2 = Pattern.compile("sip\\D*(\\d+)").matcher(str);
        if (matcher2.find()) {
            matcher2.group(1);
        } else {
            Matcher matcher3 = Pattern.compile("tel\\D*(\\d+)").matcher(str);
            if (matcher3.find()) {
                matcher3.group(1);
            } else {
                mo50487b();
            }
        }
        Matcher matcher4 = Pattern.compile("@(\\S[^\\>\\;]+)").matcher(str);
        if (!matcher4.find()) {
            matcher4 = Pattern.compile("context=(\\S[^\\>\\;]+)").matcher(str);
            if (!matcher4.find()) {
                return;
            }
        }
        auek auek = new auek(matcher4.group(1));
        if (!auek.mo50489a().isEmpty()) {
            this.f91468a = auek.mo50489a();
        }
    }

    /* renamed from: a */
    public final int mo50484a() {
        aues aues = this.f91469b;
        if (aues != null) {
            return aues.f91579a;
        }
        return 4;
    }
}
