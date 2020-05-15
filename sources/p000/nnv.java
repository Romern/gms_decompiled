package p000;

import com.google.android.gms.car.diagnostics.CriticalError;

/* renamed from: nnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ noj f36120a;

    public nnv(noj noj) {
        this.f36120a = noj;
    }

    public final void run() {
        this.f36120a.mo21188a(CriticalError.m22086a(bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_USER, bpdo.BYEBYE_BY_USER));
    }
}
