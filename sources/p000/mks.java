package p000;

/* renamed from: mks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mks implements Runnable {

    /* renamed from: a */
    final /* synthetic */ mkt f33909a;

    /* renamed from: b */
    private boolean f33910b = false;

    public mks(mkt mkt) {
        this.f33909a = mkt;
    }

    public final void run() {
        if (!this.f33910b) {
            this.f33910b = true;
            this.f33909a.mo20098b();
        }
    }
}
