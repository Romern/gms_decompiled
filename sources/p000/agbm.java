package p000;

import android.content.IntentFilter;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.util.List;

/* renamed from: agbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbm {

    /* renamed from: a */
    static final int f65157a = ((int) cczu.m132315b());

    /* renamed from: b */
    public static final InetSocketAddress f65158b = new InetSocketAddress(agaj.m53801a(), f65157a);

    /* renamed from: c */
    public static final InetSocketAddress f65159c = new InetSocketAddress(agaj.m53802b(), f65157a);

    /* renamed from: f */
    public static boolean f65160f = false;

    /* renamed from: d */
    public final agbv f65161d;

    /* renamed from: e */
    public final MulticastSocket f65162e;

    public agbm(agbv agbv, int i) {
        this.f65161d = agbv;
        if (!agbv.f65203e) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            agbv.f65200b.registerReceiver(agbv.f65201c, intentFilter);
            agbv.f65203e = true;
        }
        MulticastSocket multicastSocket = new MulticastSocket(i);
        this.f65162e = multicastSocket;
        multicastSocket.setTimeToLive(255);
        f65160f = false;
    }

    /* renamed from: a */
    public final void mo35191a() {
        List a = this.f65161d.mo35209a();
        InetSocketAddress inetSocketAddress = f65158b;
        if (this.f65161d.mo35210a(a)) {
            inetSocketAddress = f65159c;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f65162e.leaveGroup(inetSocketAddress, ((agbw) a.get(i)).f65205a);
        }
    }

    /* renamed from: b */
    public final void mo35192b() {
        this.f65162e.close();
        agbv agbv = this.f65161d;
        if (agbv.f65203e) {
            agbv.f65200b.unregisterReceiver(agbv.f65201c);
            agbv.f65203e = false;
        }
    }
}
