package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.CountDownLatch;

/* renamed from: avqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avqb extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final CountDownLatch f93762a = new CountDownLatch(1);

    /* renamed from: b */
    final /* synthetic */ avqd f93763b;

    /* renamed from: c */
    private final Object f93764c = new Object();

    public avqb(avqd avqd) {
        this.f93763b = avqd;
        avqd.f93769e = bmvz.f131120a;
    }

    public final void onAvailable(Network network) {
        synchronized (this.f93764c) {
            avqd avqd = this.f93763b;
            Logger Logger = avqd.f93765a;
            avqa a = avqa.m79037a(network, avqd.f93766b);
            synchronized (avqd.f93767c) {
                if (!avqd.f93769e.mo66813a()) {
                    avqd.f93765a.mo25414c("Network acquired.", new Object[0]);
                    avqd.f93769e = bmxv.m108566b(a);
                } else if (!((avqa) avqd.f93769e.mo66814b()).equals(a)) {
                    avqd.f93765a.mo25416d("Releasing the network because a different network is available.", new Object[0]);
                    avqd.mo51497b();
                }
            }
            this.f93762a.countDown();
        }
    }

    public final void onLost(Network network) {
        synchronized (this.f93764c) {
            this.f93763b.mo51497b();
            this.f93762a.countDown();
        }
    }
}
