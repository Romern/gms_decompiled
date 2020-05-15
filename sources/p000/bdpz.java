package p000;

import android.os.SystemClock;

/* renamed from: bdpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdpz {

    /* renamed from: a */
    public final Object f106242a = new Object();

    /* renamed from: b */
    public int f106243b = 0;

    /* renamed from: c */
    public long f106244c = 0;

    /* renamed from: d */
    private final cijl f106245d;

    @Deprecated
    public bdpz(int i) {
        this.f106245d = new bdpy(i);
    }

    /* renamed from: a */
    public static bdpz m91271a() {
        return m91272a(new bdpx());
    }

    /* renamed from: a */
    public static bdpz m91272a(cijl cijl) {
        return new bdpz(cijl);
    }

    /* renamed from: b */
    public final boolean mo58288b() {
        int intValue = ((Integer) this.f106245d.mo6445a()).intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue != Integer.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (this.f106242a) {
                if (elapsedRealtime - this.f106244c <= 1000) {
                    if (this.f106243b < intValue) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private bdpz(cijl cijl) {
        this.f106245d = cijl;
    }
}
