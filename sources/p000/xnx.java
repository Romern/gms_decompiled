package p000;

import android.util.MutableBoolean;
import java.util.concurrent.CountDownLatch;

/* renamed from: xnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xnx implements xeg {

    /* renamed from: a */
    final /* synthetic */ MutableBoolean f52814a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f52815b;

    /* renamed from: c */
    final /* synthetic */ xnz f52816c;

    public xnx(xnz xnz, MutableBoolean mutableBoolean, CountDownLatch countDownLatch) {
        this.f52816c = xnz;
        this.f52814a = mutableBoolean;
        this.f52815b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo29667a(xma xma) {
        xnz.f52817c.mo25417e("User verification failed", xma, new Object[0]);
        this.f52814a.value = false;
        xnz xnz = this.f52816c;
        xnz.f52818a.mo30184a(xnz.f52819b, xma);
        this.f52815b.countDown();
    }

    /* renamed from: a */
    public final void mo29668a(xpj xpj) {
        xnz.f52817c.mo25412b("User verification succeeded", new Object[0]);
        this.f52814a.value = true;
        this.f52815b.countDown();
    }
}
