package p000;

/* renamed from: akqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akql f72434a;

    public akqh(akql akql) {
        this.f72434a = akql;
    }

    public final void run() {
        akql akql = this.f72434a;
        float f = akql.f72448j;
        if (f != Float.MAX_VALUE) {
            if (f < akql.f72439a && akql.f72451m == 1) {
                akql.mo39704a(2);
            }
            akql akql2 = this.f72434a;
            if (akql2.f72448j > akql2.f72440b && akql2.f72451m == 2) {
                akql2.mo39704a(1);
            }
            akql akql3 = this.f72434a;
            int i = akql3.f72450l + 1;
            akql3.f72450l = i;
            float f2 = akql3.f72449k + akql3.f72448j;
            akql3.f72449k = f2;
            akql3.f72447i.mo39754a(f2 / ((float) i));
        }
        this.f72434a.f72441c.postDelayed(this, 1000);
    }
}
