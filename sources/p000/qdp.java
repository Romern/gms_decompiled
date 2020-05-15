package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.CountDownLatch;

/* renamed from: qdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qdp extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final CountDownLatch f40996a = new CountDownLatch(1);

    /* renamed from: b */
    final /* synthetic */ qdq f40997b;

    /* renamed from: c */
    private final Object f40998c = new Object();

    public qdp(qdq qdq) {
        this.f40997b = qdq;
        qdq.f41002d = bmvz.f131120a;
    }

    public final void onAvailable(Network network) {
        synchronized (this.f40998c) {
            qdq qdq = this.f40997b;
            sek sek = qdq.f40999a;
            synchronized (qdq.f41001c) {
                if (!qdq.f41002d.mo66813a()) {
                    qdq.f40999a.mo25414c("Network acquired.", new Object[0]);
                    qdq.f41002d = bmxv.m108566b(network);
                } else if (!((Network) qdq.f41002d.mo66814b()).equals(network)) {
                    qdq.f40999a.mo25416d("Releasing the network because a different network is available.", new Object[0]);
                    qdq.mo23962b();
                }
            }
            this.f40996a.countDown();
        }
    }

    public final void onLost(Network network) {
        synchronized (this.f40998c) {
            this.f40997b.mo23962b();
            this.f40996a.countDown();
        }
    }
}
