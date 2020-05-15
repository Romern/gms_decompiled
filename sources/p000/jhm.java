package p000;

import android.content.Context;

/* renamed from: jhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhm {

    /* renamed from: b */
    private static jhm f22494b;

    /* renamed from: a */
    public final qws f22495a;

    private jhm(Context context) {
        this.f22495a = new qws(context, "AUTH_MANAGED", null);
    }

    /* renamed from: a */
    public static cilx m16711a() {
        bxvd da = cilx.f190679c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cilx cilx = (cilx) da.f164949b;
        cilx.f190681a |= 1;
        cilx.f190682b = 0;
        return (cilx) da.mo74062i();
    }

    /* renamed from: b */
    public static int m16713b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 5;
            }
            if (i == 3) {
                return 6;
            }
            if (i == 4) {
                return 7;
            }
            if (i != 5) {
                return (i == 65536 || i == 196608 || i == 327680) ? 2 : 1;
            }
            return 8;
        }
    }

    /* renamed from: a */
    public static synchronized jhm m16712a(Context context) {
        jhm jhm;
        synchronized (jhm.class) {
            if (f22494b == null) {
                f22494b = new jhm(context.getApplicationContext());
            }
            jhm = f22494b;
        }
        return jhm;
    }

    /* renamed from: a */
    public final void mo13743a(int i) {
        bxvd da = cilz.f190690g.mo74144da();
        cilx a = m16711a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cilz cilz = (cilz) da.f164949b;
        a.getClass();
        cilz.f190693b = a;
        int i2 = cilz.f190692a | 1;
        cilz.f190692a = i2;
        int i3 = i - 1;
        cilz.f190694c = i3;
        cilz.f190692a = i2 | 2;
        cilz cilz2 = (cilz) da.mo74062i();
        if (ccgz.m129649c()) {
            qwo a2 = this.f22495a.mo24335a(cilz2.serializeToBytes());
            a2.mo24328b(i3);
            a2.mo24327b();
            return;
        }
        this.f22495a.mo24335a(cilz2.serializeToBytes()).mo24327b();
    }

    /* renamed from: a */
    public final void mo13744a(int i, camd camd) {
        if (!ccgz.m129648b() || camd == null || (camd.f175247a & 1) == 0) {
            mo13743a(i);
            return;
        }
        String str = camd.f175248b;
        bxvd da = cilz.f190690g.mo74144da();
        cilx a = m16711a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cilz cilz = (cilz) da.f164949b;
        a.getClass();
        cilz.f190693b = a;
        int i2 = cilz.f190692a | 1;
        cilz.f190692a = i2;
        int i3 = i - 1;
        cilz.f190694c = i3;
        int i4 = i2 | 2;
        cilz.f190692a = i4;
        str.getClass();
        cilz.f190692a = i4 | 16;
        cilz.f190697f = str;
        qwo a2 = this.f22495a.mo24335a(((cilz) da.mo74062i()).serializeToBytes());
        a2.mo24328b(i3);
        a2.mo24327b();
    }

    /* renamed from: a */
    public final void mo13745a(int i, cily cily) {
        bxvd da = cilz.f190690g.mo74144da();
        cilx a = m16711a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cilz cilz = (cilz) da.f164949b;
        a.getClass();
        cilz.f190693b = a;
        int i2 = cilz.f190692a | 1;
        cilz.f190692a = i2;
        int i3 = i - 1;
        cilz.f190694c = i3;
        int i4 = i2 | 2;
        cilz.f190692a = i4;
        cily.getClass();
        cilz.f190695d = cily;
        cilz.f190692a = i4 | 4;
        cilz cilz2 = (cilz) da.mo74062i();
        if (ccgz.m129649c()) {
            qwo a2 = this.f22495a.mo24335a(cilz2.serializeToBytes());
            a2.mo24328b(i3);
            a2.mo24327b();
            return;
        }
        this.f22495a.mo24335a(cilz2.serializeToBytes()).mo24327b();
    }
}
