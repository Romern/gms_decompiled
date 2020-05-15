package p000;

/* renamed from: aicm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aicm extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f68693a;

    /* renamed from: b */
    final /* synthetic */ aics f68694b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicm(aics aics, String str, String str2) {
        super(str);
        this.f68694b = aics;
        this.f68693a = str2;
    }

    public final void run() {
        bqgg bqgg = (bqgg) this.f68694b.f68719p.remove(this.f68693a);
        if (bqgg != null && !bqgg.isDone()) {
            bqgg.cancel(true);
        }
    }
}
