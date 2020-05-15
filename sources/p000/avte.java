package p000;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: avte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avte {

    /* renamed from: b */
    private static final bmyv f93881b = bmyx.m108640a(',').mo66919b(':');

    /* renamed from: a */
    public final bnim f93882a;

    public avte(bnim bnim) {
        sdo.m34959a(bnim);
        this.f93882a = bnim;
    }

    /* renamed from: a */
    public static avtd m79303a() {
        return new avtd();
    }

    /* renamed from: b */
    public final avtd mo51598b() {
        return new avtd(this.f93882a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avte) {
            return bnmt.m109811d(((avte) obj).f93882a, this.f93882a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f93882a});
    }

    public final String toString() {
        return bnmt.m109807c(this.f93882a);
    }

    /* renamed from: a */
    static avte m79304a(String str) {
        bnik b = bnim.m109535b();
        if (str.length() > 0) {
            for (Map.Entry entry : f93881b.mo66915a(str).entrySet()) {
                try {
                    b.mo67695b(new String(sqd.m35966a((String) entry.getKey()), "UTF-8"), new String(sqd.m35966a((String) entry.getValue()), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return new avte(b.mo67618b());
    }

    /* renamed from: a */
    public static avte m79305a(avtc... avtcArr) {
        avtd a = m79303a();
        a.mo51595a(avtcArr);
        return a.mo51593a();
    }

    /* renamed from: a */
    public final Object mo51597a(avti avti) {
        return this.f93882a.containsKey(avti.f93886a) ? avti.mo51590a((String) this.f93882a.get(avti.f93886a)) : avti.f93887b;
    }
}
