package p000;

/* renamed from: jha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jha implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Integer f22463a;

    /* renamed from: b */
    final /* synthetic */ jhb f22464b;

    public jha(jhb jhb, Integer num) {
        this.f22464b = jhb;
        this.f22463a = num;
    }

    public final void run() {
        this.f22464b.deliverResult(this.f22463a);
    }
}
