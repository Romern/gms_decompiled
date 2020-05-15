package p000;

/* renamed from: bhgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhgr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f118622a;

    /* renamed from: b */
    final /* synthetic */ bhhb f118623b;

    public bhgr(bhhb bhhb, int i) {
        this.f118623b = bhhb;
        this.f118622a = i;
    }

    public final void run() {
        this.f118623b.f118642aa.smoothScrollToPosition(this.f118622a);
    }
}
