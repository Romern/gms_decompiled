package p000;

import java.util.Collections;

/* renamed from: wsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wsk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ wsl f51243a;

    public wsk(wsl wsl) {
        this.f51243a = wsl;
    }

    public final void run() {
        wtu wtu = this.f51243a.f51245b;
        Collections.sort(wtu.f51329c, new wtt(wtu));
        wtu.f51328b.clear();
        wtu.f51328b.addAll(wtu.f51329c);
        wtu.f51329c.clear();
        wtu.mo29406a();
        this.f51243a.getContext().startService(butb.m120413a(this.f51243a.getContext()));
        this.f51243a.f51246c.postDelayed(this, 12000);
    }
}
