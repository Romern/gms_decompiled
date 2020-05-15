package p000;

import java.util.Queue;

/* renamed from: cjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjn {

    /* renamed from: a */
    private static final Queue f6943a = crd.m7392a(0);

    /* renamed from: b */
    private int f6944b;

    /* renamed from: c */
    private int f6945c;

    /* renamed from: d */
    private Object f6946d;

    private cjn() {
    }

    /* renamed from: a */
    public static cjn m4362a(Object obj) {
        cjn cjn;
        synchronized (f6943a) {
            cjn = (cjn) f6943a.poll();
        }
        if (cjn == null) {
            cjn = new cjn();
        }
        cjn.f6946d = obj;
        cjn.f6945c = 0;
        cjn.f6944b = 0;
        return cjn;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjn) {
            cjn cjn = (cjn) obj;
            int i = cjn.f6945c;
            int i2 = cjn.f6944b;
            if (this.f6946d.equals(cjn.f6946d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6946d.hashCode();
    }

    /* renamed from: a */
    public final void mo3946a() {
        synchronized (f6943a) {
            f6943a.offer(this);
        }
    }
}
