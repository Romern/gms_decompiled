package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: arcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arcr f87374a;

    public arcq(arcr arcr) {
        this.f87374a = arcr;
    }

    public final void run() {
        arcr arcr = this.f87374a;
        ardc ardc = arcr.f87376b;
        arit arit = arcr.f87375a;
        Bundle bundle = arcr.f87377c;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 8);
        arbt arbt = ardc.f87415d;
        if (!arbt.mo48381b()) {
            arbt.f87315a.mo25418e("No connection in progress.", new Object[0]);
            arbt.m72427h(arit, new Status(10567));
            return;
        }
        try {
            arbt.mo48378a(bundle);
        } finally {
            arbt.m72427h(arit, new Status(0));
        }
    }
}
