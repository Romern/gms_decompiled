package p000;

/* renamed from: cisn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ citi f191334a;

    /* renamed from: b */
    final /* synthetic */ int f191335b;

    public cisn(citi citi, int i) {
        this.f191334a = citi;
        this.f191335b = i;
    }

    public final void run() {
        this.f191334a.onStatus(this.f191335b);
    }
}
