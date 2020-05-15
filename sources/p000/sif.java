package p000;

import java.util.HashMap;

/* renamed from: sif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sif {

    /* renamed from: b */
    private static sif f44532b;

    /* renamed from: a */
    public final HashMap f44533a = new HashMap();

    private sif() {
    }

    /* renamed from: a */
    public static sif m35346a() {
        sif sif;
        synchronized (sif.class) {
            if (f44532b == null) {
                f44532b = new sif();
            }
            sif = f44532b;
        }
        return sif;
    }

    /* renamed from: a */
    public final void mo25588a(String str) {
        synchronized (this.f44533a) {
            if (!this.f44533a.containsKey(str)) {
                this.f44533a.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
