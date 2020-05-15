package p000;

import java.util.List;

/* renamed from: apcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apcm {

    /* renamed from: g */
    private static apcm f84130g;

    /* renamed from: a */
    public List f84131a;

    /* renamed from: b */
    public List f84132b;

    /* renamed from: c */
    public boolean f84133c;

    /* renamed from: d */
    public boolean f84134d;

    /* renamed from: e */
    public String f84135e;

    /* renamed from: f */
    public String f84136f;

    private apcm() {
    }

    /* renamed from: a */
    public static synchronized apcm m70044a() {
        apcm apcm;
        synchronized (apcm.class) {
            if (f84130g == null) {
                f84130g = new apcm();
            }
            apcm = f84130g;
        }
        return apcm;
    }

    /* renamed from: b */
    public final void mo47111b() {
        this.f84131a = null;
        this.f84132b = null;
        this.f84133c = false;
        this.f84134d = false;
        this.f84135e = null;
        this.f84136f = null;
    }
}
