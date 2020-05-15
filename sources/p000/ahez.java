package p000;

import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;

/* renamed from: ahez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahez implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DisableTargetRequest f67089a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67090b;

    public ahez(ahfe ahfe, DisableTargetRequest disableTargetRequest) {
        this.f67090b = ahfe;
        this.f67089a = disableTargetRequest;
    }

    public final void run() {
        ahct b = this.f67090b.mo36391b();
        if (b != null) {
            b.mo36315a(this.f67089a.f80417b);
        }
    }
}
