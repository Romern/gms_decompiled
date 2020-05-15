package p000;

import android.os.StrictMode;
import android.os.strictmode.Violation;

/* renamed from: bdos */
final /* synthetic */ class bdos implements StrictMode.OnThreadViolationListener {

    /* renamed from: a */
    private final bdot f106161a;

    public bdos(bdot bdot) {
        this.f106161a = bdot;
    }

    public final void onThreadViolation(Violation violation) {
        this.f106161a.mo58246a(violation);
    }
}
