package p000;

import android.os.Looper;

/* renamed from: rjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rjv {

    /* renamed from: a */
    private rot f43157a;

    /* renamed from: b */
    private Looper f43158b;

    /* renamed from: a */
    public final rjw mo24666a() {
        if (this.f43157a == null) {
            this.f43157a = new rky();
        }
        if (this.f43158b == null) {
            this.f43158b = Looper.getMainLooper();
        }
        return new rjw(this.f43157a, this.f43158b);
    }

    /* renamed from: a */
    public final void mo24667a(Looper looper) {
        sdo.checkIfNull(looper, "Looper must not be null.");
        this.f43158b = looper;
    }

    /* renamed from: a */
    public final void mo24668a(rot rot) {
        sdo.checkIfNull(rot, "StatusExceptionMapper must not be null.");
        this.f43157a = rot;
    }
}
