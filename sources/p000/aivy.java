package p000;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: aivy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aivy extends soa {

    /* renamed from: a */
    final /* synthetic */ long f69914a;

    /* renamed from: b */
    final /* synthetic */ WifiP2pManager.Channel f69915b;

    /* renamed from: c */
    final /* synthetic */ String f69916c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aivy(int i, long j, WifiP2pManager.Channel channel, String str) {
        super(i);
        this.f69914a = j;
        this.f69915b = channel;
        this.f69916c = str;
    }

    public final void run() {
        WifiP2pManager.Channel channel;
        try {
            Thread.sleep(this.f69914a);
            channel = this.f69915b;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            channel = this.f69915b;
        } catch (Throwable th) {
            this.f69915b.close();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivy", "run", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Closed channel %s", this.f69916c);
            throw th;
        }
        channel.close();
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aivy", "run", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Closed channel %s", this.f69916c);
    }
}
