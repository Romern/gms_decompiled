package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: aucr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aucr implements aucs {

    /* renamed from: a */
    public final CountDownLatch f91406a = new CountDownLatch(1);

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f91406a.countDown();
    }

    /* renamed from: b */
    public final void mo13386b() {
        this.f91406a.countDown();
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        this.f91406a.countDown();
    }
}
