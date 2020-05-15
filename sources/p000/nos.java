package p000;

import com.google.android.gms.car.diagnostics.CriticalError;

/* renamed from: nos */
final /* synthetic */ class nos implements Runnable {

    /* renamed from: a */
    private final nov f36252a;

    public nos(nov nov) {
        this.f36252a = nov;
    }

    public final void run() {
        this.f36252a.f36257a.mo21371b(CriticalError.m22086a(bpdn.UNKNOWN_CODE, bpdo.UNKNOWN_DETAIL));
    }
}
