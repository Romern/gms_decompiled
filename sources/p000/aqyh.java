package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;

/* renamed from: aqyh */
final /* synthetic */ class aqyh implements Runnable {

    /* renamed from: a */
    private final aqyl f87085a;

    /* renamed from: b */
    private final BootstrapCompletionResult f87086b;

    public aqyh(aqyl aqyl, BootstrapCompletionResult bootstrapCompletionResult) {
        this.f87085a = aqyl;
        this.f87086b = bootstrapCompletionResult;
    }

    public final void run() {
        aqyl aqyl = this.f87085a;
        aqyl.f87095a.mo48268a(this.f87086b);
    }
}
