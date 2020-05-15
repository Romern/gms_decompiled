package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;

/* renamed from: apur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apur extends bjdp {

    /* renamed from: a */
    public final CountDownLatch f84944a = new CountDownLatch(1);

    /* renamed from: b */
    public final Context f84945b;

    /* renamed from: c */
    public final int f84946c;

    /* renamed from: d */
    public final boolean f84947d;

    /* renamed from: e */
    public apup f84948e;

    /* renamed from: f */
    public final apuq f84949f = new apuq(this);

    public apur(Context context, int i, boolean z) {
        this.f84945b = context;
        this.f84946c = i;
        this.f84947d = z;
    }

    /* renamed from: a */
    public final void mo47613a(boolean z, Bundle bundle) {
        CountDownLatch countDownLatch;
        if (z && bundle != null) {
            try {
                this.f84948e = new apup(bundle);
            } catch (RuntimeException e) {
                countDownLatch = this.f84944a;
            } catch (Throwable th) {
                this.f84944a.countDown();
                throw th;
            }
        }
        countDownLatch = this.f84944a;
        countDownLatch.countDown();
    }
}
