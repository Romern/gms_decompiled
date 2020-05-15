package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import com.google.android.gms.nearby.mediums.WifiDirect$CreateGroupOperation$1;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ainc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ainc extends airo {

    /* renamed from: a */
    public final WifiP2pManager f69232a;

    /* renamed from: b */
    public final String f69233b;

    /* renamed from: c */
    public final String f69234c;

    /* renamed from: d */
    public int f69235d = -1;

    /* renamed from: e */
    private final Context f69236e;

    /* renamed from: f */
    private final aiwa f69237f;

    /* renamed from: i */
    private WifiP2pManager.Channel f69238i;

    /* renamed from: j */
    private final boolean f69239j;

    /* renamed from: k */
    private final ahfk f69240k;

    public ainc(Context context, WifiP2pManager wifiP2pManager, aiwa aiwa, String str, String str2, boolean z, ahfk ahfk) {
        super(71, ahfk);
        this.f69236e = context;
        this.f69232a = wifiP2pManager;
        this.f69237f = aiwa;
        this.f69233b = str;
        this.f69234c = str2;
        this.f69239j = z;
        this.f69240k = ahfk;
    }

    /* renamed from: g */
    private final void m57490g() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        WifiP2pManager.Channel channel = this.f69238i;
        this.f69232a.requestGroupInfo(channel, new aimz(this, countDownLatch, channel));
        try {
            if (!countDownLatch.await(cfnv.m140769ae(), TimeUnit.SECONDS)) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("ainc", "g", 718, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Timed out while waiting on latch to signal successful stopping of Wifi direct.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("ainc", "g", 723, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Interrupted while disabling Wifi Direct.");
        }
    }

    /* renamed from: a */
    public final void mo37566a() {
        mo37704c();
        this.f69237f.mo38146b(1);
        this.f69238i = null;
    }

    /* renamed from: b */
    public final int mo37568b() {
        WifiP2pManager.Channel a = this.f69237f.mo38143a(1);
        this.f69238i = a;
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("ainc", "b", 531, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't create a WiFi Direct group because we failed to initialize a WiFi Direct channel.");
            return 3;
        }
        String str = this.f69233b;
        WifiP2pConfig.Builder passphrase = new WifiP2pConfig.Builder().setNetworkName(str).setPassphrase(this.f69234c);
        if (this.f69239j) {
            passphrase.setGroupOperatingBand(2);
        } else {
            passphrase.setGroupOperatingBand(1);
        }
        aimy aimy = new aimy(this, passphrase);
        butj butj = new butj(cfnv.f184625a.mo6606a().mo81828bt());
        butj.f154849a = this.f69240k.mo36402c();
        if (butl.m120434a(aimy, "CreateGroup", butj.mo73110a())) {
            return 2;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("ainc", "b", 539, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Failed to create a WiFi Direct group");
        this.f69237f.mo38146b(1);
        return 3;
    }

    /* renamed from: c */
    public final void mo37704c() {
        if (cfnv.f184625a.mo6606a().mo81832bx()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            WifiP2pManager.Channel channel = this.f69238i;
            this.f69232a.requestGroupInfo(channel, new aimz(this, countDownLatch, channel));
            try {
                if (!countDownLatch.await(cfnv.m140769ae(), TimeUnit.SECONDS)) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                    bnsl.mo68432a("ainc", "g", 718, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Timed out while waiting on latch to signal successful stopping of Wifi direct.");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("ainc", "g", 723, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Interrupted while disabling Wifi Direct.");
            }
        } else {
            bqgy c = bqgy.m112818c();
            this.f69232a.removeGroup(this.f69238i, new aims(c));
            try {
                c.get(cfnv.m140769ae(), TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68432a("ainc", "c", 668, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Interrupted while removing WiFi Direct group");
            } catch (ExecutionException e3) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68437a(e3);
                bnsl4.mo68432a("ainc", "c", 670, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Failed to remove WiFi Direct group");
            } catch (TimeoutException e4) {
                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                bnsl5.mo68437a(e4);
                bnsl5.mo68432a("ainc", "c", 672, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Timed out waiting to remove WiFi Direct group");
            }
        }
    }

    /* renamed from: a */
    public final void mo37567a(PrintWriter printWriter) {
        super.mo37567a(printWriter);
        printWriter.write(String.format("    Use 5Ghz: %s\n", Boolean.valueOf(this.f69239j)));
        printWriter.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo37702a(CountDownLatch countDownLatch, WifiP2pManager.Channel channel, WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup != null && wifiP2pGroup.isGroupOwner()) {
            this.f69232a.removeGroup(channel, new ainb(countDownLatch));
            return;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("ainc", "a", 690, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to stop Wifi Direct hotspot because no group was found.");
        countDownLatch.countDown();
    }

    /* renamed from: a */
    public final boolean mo37703a(WifiP2pConfig wifiP2pConfig) {
        Context context;
        bqgy c = bqgy.m112818c();
        WifiDirect$CreateGroupOperation$1 wifiDirect$CreateGroupOperation$1 = new WifiDirect$CreateGroupOperation$1(this, "nearby", c);
        this.f69236e.registerReceiver(wifiDirect$CreateGroupOperation$1, new IntentFilter("android.net.wifi.p2p.CONNECTION_STATE_CHANGE"));
        try {
            this.f69232a.createGroup(this.f69238i, wifiP2pConfig, new aina(c));
            c.get(cfnv.f184625a.mo6606a().mo81829bu(), TimeUnit.SECONDS);
            ahhd.m55766a(this.f69236e, wifiDirect$CreateGroupOperation$1);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ainc", "a", 642, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted while creating WiFi Direct group");
            context = this.f69236e;
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ainc", "a", 644, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to create WiFi Direct group");
            context = this.f69236e;
        } catch (TimeoutException e3) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("ainc", "a", 646, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Timed out waiting to create WiFi Direct group");
            context = this.f69236e;
        } catch (Throwable th) {
            ahhd.m55766a(this.f69236e, wifiDirect$CreateGroupOperation$1);
            throw th;
        }
        ahhd.m55766a(context, wifiDirect$CreateGroupOperation$1);
        return false;
    }
}
