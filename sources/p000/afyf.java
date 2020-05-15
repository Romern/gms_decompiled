package p000;

import java.util.Locale;

/* renamed from: afyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afyf {
    /* renamed from: a */
    public static afyf m53667a(afyd afyd, afye afye) {
        return new afxx(afyd, afye);
    }

    /* renamed from: a */
    public abstract afyd mo35058a();

    /* renamed from: b */
    public abstract afye mo35059b();

    /* renamed from: c */
    public final String mo35063c() {
        Locale locale = Locale.ROOT;
        afye b = mo35059b();
        afye afye = afye.PERIODIC;
        return String.format(locale, "%d%s%s", Integer.valueOf(mo35058a().f64959d), '_', b.f64963c);
    }

    public final String toString() {
        int i = mo35058a().f64959d;
        String valueOf = String.valueOf(mo35059b());
        String c = mo35063c();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(c).length());
        sb.append(i);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(" (");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
