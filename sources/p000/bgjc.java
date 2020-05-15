package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bgjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgjc implements bugt {

    /* renamed from: a */
    final /* synthetic */ bgje f116584a;

    public bgjc(bgje bgje) {
        this.f116584a = bgje;
    }

    /* renamed from: a */
    public final void mo61879a(int i) {
        if (i == 0) {
            synchronized (this.f116584a) {
                this.f116584a.f116586b = new bgjb(this);
                bgje bgje = this.f116584a;
                bgje.f116585a.postDelayed(bgje.f116586b, TimeUnit.SECONDS.toMillis(2));
            }
            return;
        }
        this.f116584a.mo62883c(5);
    }
}
