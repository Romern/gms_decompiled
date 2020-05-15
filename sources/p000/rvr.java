package p000;

import java.util.List;

/* renamed from: rvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvr extends ruq {
    public rvr() {
        super("FixesNeedToBeLogged");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25185a(rvl rvl) {
        if (!rvz.m34545b()) {
            return false;
        }
        ruf ruf = new ruf();
        try {
            List b = ruf.mo25178b();
            ruf.close();
            if (!b.isEmpty()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
