package p000;

import java.util.concurrent.TimeoutException;

/* renamed from: zhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zhs extends zhv {

    /* renamed from: a */
    final /* synthetic */ String f55103a;

    /* renamed from: b */
    final /* synthetic */ bqgy f55104b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zhs(zhw zhw, String str, bqgy bqgy) {
        super(zhw);
        this.f55103a = str;
        this.f55104b = bqgy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31141a() {
        this.f55104b.mo69136a((Throwable) new TimeoutException("Scan stopped before device found"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31142a(cacv cacv) {
        if (this.f55103a.equals(cacv.f172631b)) {
            mo31144b();
            this.f55104b.mo69138b(cacv);
        }
    }
}
