package p000;

/* renamed from: afzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afzl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ afzm f65013a;

    public afzl(afzm afzm) {
        this.f65013a = afzm;
    }

    public final void run() {
        afyu.m53687a(new cake[]{cake.UNPAIR_TIMEOUT}, this.f65013a.f65022g, false, afzw.m53776a());
        this.f65013a.stopSelf();
    }
}
