package p000;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pManager;
import java.net.InetAddress;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aimx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aimx extends airo {

    /* renamed from: a */
    public final Context f69216a;

    /* renamed from: b */
    public final WifiP2pManager f69217b;

    /* renamed from: c */
    public final aiwa f69218c;

    /* renamed from: d */
    public WifiP2pManager.Channel f69219d;

    /* renamed from: e */
    public aiwb f69220e;

    /* renamed from: f */
    private final String f69221f;

    /* renamed from: i */
    private final String f69222i;

    /* renamed from: j */
    private final int f69223j;

    /* renamed from: k */
    private final int f69224k;

    /* renamed from: l */
    private final ahfk f69225l;

    public aimx(Context context, WifiP2pManager wifiP2pManager, aiwa aiwa, String str, String str2, int i, int i2, ahfk ahfk) {
        super(72, ahfk);
        this.f69216a = context;
        this.f69217b = wifiP2pManager;
        this.f69218c = aiwa;
        this.f69221f = str;
        this.f69222i = str2;
        this.f69223j = i;
        this.f69224k = i2;
        this.f69225l = ahfk;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.net.InetAddress, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    private final aiwb m57487a(InetAddress inetAddress, int i) {
        aimw aimw = new aimw(inetAddress, i);
        butj butj = new butj(cfnv.m140767ac());
        butj.f154849a = this.f69225l.mo36402c();
        if (!butl.m120434a(aimw, "CreateSocket", butj.mo73110a())) {
            return null;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aimx", "a", 1005, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68422a("WiFi Direct successfully connected to %s:%s", (Object) inetAddress, i);
        return aimw.f69213a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.net.InetAddress, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: b */
    public final int mo37568b() {
        aiwb aiwb;
        WifiP2pManager.Channel a = this.f69218c.mo38143a(3);
        this.f69219d = a;
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aimx", "b", 795, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't connect to WifiP2pDevice because we failed to initialize a WiFi Direct channel.");
            return 3;
        }
        InetAddress a2 = m57488a(this.f69221f, this.f69222i);
        if (a2 == null) {
            this.f69218c.mo38146b(3);
            return 3;
        }
        int i = this.f69223j;
        aimw aimw = new aimw(a2, i);
        butj butj = new butj(cfnv.m140767ac());
        butj.f154849a = this.f69225l.mo36402c();
        if (butl.m120434a(aimw, "CreateSocket", butj.mo73110a())) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aimx", "a", 1005, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68422a("WiFi Direct successfully connected to %s:%s", (Object) a2, i);
            aiwb = aimw.f69213a;
        } else {
            aiwb = null;
        }
        this.f69220e = aiwb;
        if (aiwb != null) {
            aiwb.mo37637a(new aimt(this));
            srn srn = ailf.f69111a;
            return mo37899a(73);
        }
        this.f69218c.mo38146b(3);
        return 3;
    }

    /* renamed from: a */
    private final InetAddress m57488a(String str, String str2) {
        WifiP2pConfig.Builder passphrase = new WifiP2pConfig.Builder().setNetworkName(str).setPassphrase(str2);
        int i = this.f69224k;
        if (i != -1) {
            passphrase.setGroupOperatingFrequency(i);
        }
        aimv aimv = new aimv(this, passphrase.build(), str);
        butj butj = new butj(cfnv.m140767ac());
        butj.f154849a = this.f69225l.mo36402c();
        if (!butl.m120434a(aimv, "Connect", butj.mo73110a()) && aiwa.m58045b()) {
            bqgy c = bqgy.m112818c();
            this.f69217b.cancelConnect(this.f69219d, new aims(c));
            try {
                c.get(cfnv.m140768ad(), TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aimx", "a", 952, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Interrupted while waiting to connect to WiFi Direct group");
            } catch (ExecutionException e2) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("aimx", "a", 954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to connect to WiFi Direct group");
            } catch (TimeoutException e3) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68437a(e3);
                bnsl3.mo68432a("aimx", "a", 956, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Timed out waiting connect to WiFi Direct group");
            }
        }
        return aimv.f69209a;
    }
}
