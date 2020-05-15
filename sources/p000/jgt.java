package p000;

/* renamed from: jgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jgt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Integer f22435a;

    /* renamed from: b */
    final /* synthetic */ jgu f22436b;

    public jgt(jgu jgu, Integer num) {
        this.f22436b = jgu;
        this.f22435a = num;
    }

    public final void run() {
        this.f22436b.deliverResult(this.f22435a);
    }
}
