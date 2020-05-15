package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: buit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buit {

    /* renamed from: a */
    public int f153971a;

    /* renamed from: b */
    private int f153972b;

    /* renamed from: c */
    private int f153973c;

    /* renamed from: d */
    private int f153974d;

    /* renamed from: e */
    private final Map f153975e = new HashMap();

    public buit() {
        mo72710a();
    }

    /* renamed from: a */
    public static void m119578a(double d) {
        Math.min(((int) (d / 11.0d)) * 11, 88);
    }

    /* renamed from: a */
    public final void mo72710a() {
        this.f153972b = 0;
        this.f153973c = 0;
        this.f153974d = 0;
        this.f153971a = 0;
    }

    /* renamed from: b */
    public final void mo72711b() {
        this.f153972b++;
    }

    /* renamed from: c */
    public final void mo72712c() {
        this.f153974d++;
    }

    /* renamed from: d */
    public final void mo72713d() {
        this.f153973c++;
    }

    /* renamed from: a */
    public final buis mo72709a(String str) {
        buis buis;
        synchronized (this.f153975e) {
            buis = (buis) this.f153975e.get(str);
            if (buis == null) {
                buis = new buis();
                this.f153975e.put(str, buis);
            }
        }
        return buis;
    }
}
