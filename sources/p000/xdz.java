package p000;

import android.util.MutableBoolean;
import java.util.concurrent.CountDownLatch;

/* renamed from: xdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdz implements xeg {

    /* renamed from: a */
    final /* synthetic */ MutableBoolean f52040a;

    /* renamed from: b */
    final /* synthetic */ xwn f52041b;

    /* renamed from: c */
    final /* synthetic */ CountDownLatch f52042c;

    /* renamed from: d */
    final /* synthetic */ xea f52043d;

    public xdz(xea xea, MutableBoolean mutableBoolean, xwn xwn, CountDownLatch countDownLatch) {
        this.f52043d = xea;
        this.f52040a = mutableBoolean;
        this.f52041b = xwn;
        this.f52042c = countDownLatch;
    }

    /* renamed from: a */
    public final void mo29667a(xma xma) {
        xea.f52044b.mo25417e("User verification failed", xma, new Object[0]);
        this.f52040a.value = false;
        this.f52041b.mo30184a(this.f52043d.f52054c, xma);
        this.f52042c.countDown();
    }

    /* renamed from: a */
    public final void mo29668a(xpj xpj) {
        xea.f52044b.mo25412b("User verification succeeded", new Object[0]);
        this.f52040a.value = true;
        this.f52042c.countDown();
    }
}
