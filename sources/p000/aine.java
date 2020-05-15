package p000;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aine */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aine {

    /* renamed from: a */
    public final aiwa f69243a;

    /* renamed from: b */
    public ainc f69244b;

    /* renamed from: c */
    public final bqgj f69245c = ahhr.m55806b();

    /* renamed from: d */
    private final Context f69246d;

    /* renamed from: e */
    private final WifiP2pManager f69247e;

    /* renamed from: f */
    private final airs f69248f;

    /* renamed from: g */
    private ServerSocket f69249g;

    public aine(Context context, airs airs) {
        Context applicationContext = context.getApplicationContext();
        this.f69246d = applicationContext;
        this.f69247e = (WifiP2pManager) applicationContext.getSystemService("wifip2p");
        this.f69248f = airs;
        this.f69243a = new aiwa(this.f69246d);
    }

    /* renamed from: a */
    private static boolean m57497a(airr airr) {
        airr airr2 = airr.UNKNOWN;
        int ordinal = airr.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError(String.format("Unknown RegistrationResult %s", airr));
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final WifiP2pDevice m57498g() {
        aiwa aiwa;
        WifiP2pManager.Channel a = this.f69243a.mo38143a(2);
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aine", "g", 395, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't get local WifiP2pDevice because we failed to initialize a WiFi Direct channel.");
            return null;
        }
        bqgy c = bqgy.m112818c();
        WifiP2pManager wifiP2pManager = this.f69247e;
        c.getClass();
        wifiP2pManager.requestDeviceInfo(a, new aimp(c));
        try {
            WifiP2pDevice wifiP2pDevice = (WifiP2pDevice) c.get(cfnv.f184625a.mo6606a().mo81830bv(), TimeUnit.SECONDS);
            this.f69243a.mo38146b(2);
            return wifiP2pDevice;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aine", "g", 408, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Interrupted while getting WiFi Direct device");
            aiwa = this.f69243a;
        } catch (ExecutionException e2) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("aine", "g", 410, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to get WiFi Direct device");
            aiwa = this.f69243a;
        } catch (TimeoutException e3) {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68437a(e3);
            bnsl4.mo68432a("aine", "g", 412, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Timed out waiting to get WiFi Direct device");
            aiwa = this.f69243a;
        } catch (Throwable th) {
            this.f69243a.mo38146b(2);
            throw th;
        }
        aiwa.mo38146b(2);
        return null;
    }

    /* renamed from: b */
    public final synchronized boolean mo37711b() {
        return this.f69244b != null;
    }

    /* renamed from: c */
    public final synchronized void mo37712c() {
        if (!mo37711b()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aine", "c", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop WiFi Direct group because a WiFi Direct isn't hosted.");
            return;
        }
        this.f69248f.mo37910c(this.f69244b);
        this.f69244b = null;
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aine", "c", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Successfully stopped WiFi Direct group");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* renamed from: d */
    public final synchronized aind mo37713d() {
        String str;
        if (mo37714e() && mo37711b()) {
            WifiP2pDevice g = m57498g();
            if (g != null) {
                str = g.deviceAddress;
                if (!TextUtils.isEmpty(str)) {
                    if (str != null) {
                        ainc ainc = this.f69244b;
                        String str2 = ainc.f69233b;
                        String str3 = ainc.f69234c;
                        return new aind(this.f69249g.getLocalPort(), this.f69244b.f69235d);
                    }
                }
            }
            str = null;
            if (str != null) {
            }
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo37714e() {
        return this.f69249g != null;
    }

    /* renamed from: f */
    public final synchronized void mo37715f() {
        if (!mo37714e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aine", "f", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop accepting WiFi Direct connections because we are not currently accepting WiFi Direct connections.");
            return;
        }
        try {
            this.f69249g.close();
            this.f69249g = null;
        } catch (IOException e) {
            try {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("aine", "f", 327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to stop accepting WiFi Direct connections because we were unable to close the ServerSocket.");
                this.f69249g = null;
            } catch (Throwable th) {
                this.f69249g = null;
                ails.m57447b();
                throw th;
            }
        }
        ails.m57447b();
        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
        bnsl3.mo68432a("aine", "f", 335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("Stopped accepting WiFi Direct connections.");
    }

    /* renamed from: a */
    public final synchronized aiwb mo37705a(String str, String str2, int i, int i2, ahfk ahfk) {
        String str3 = str;
        synchronized (this) {
            if (str3 == null || str2 == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aine", "a", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Refusing to connect to a WiFi Direct device because a null ssid, and/or password was passed in.");
                return null;
            } else if (!mo37708a()) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aine", "a", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Can't connect to %s because WiFi Direct is not supported.", str3);
                return null;
            } else {
                aimx aimx = new aimx(this.f69246d, this.f69247e, this.f69243a, str, str2, i, i2, ahfk);
                if (!m57497a(this.f69248f.mo37908b(aimx))) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl3.mo68432a("aine", "a", 372, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Failed to connect to WifiP2pDevice because we failed to register the MediumOperation.");
                    return null;
                }
                aiwb aiwb = aimx.f69220e;
                aiwb.mo37637a(new aimo(this, aimx));
                return aiwb;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo37706a(ahof ahof, aiwb aiwb) {
        if (!mo37714e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aine", "a", 306, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoting incoming WiFi Direct socket because we are not currently accepting WiFi Direct connections.");
            ails.m57440a(aiwb, "WifiDirect", aiwb.f69126a);
            return;
        }
        ((ahri) ahof.f67652a).f67874a.mo36783a(new ahlj(ahrj.m56422a(aiwb), aiwb));
    }

    /* renamed from: a */
    public final synchronized void mo37707a(airo airo) {
        this.f69248f.mo37910c(airo);
    }

    /* renamed from: a */
    public final boolean mo37708a() {
        if (!cfnv.f184625a.mo6606a().mo81751aJ()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return this.f69246d.getPackageManager().hasSystemFeature("android.hardware.wifi.direct") && this.f69247e != null;
    }

    /* renamed from: a */
    public final synchronized boolean mo37709a(ahof ahof) {
        if (ahof == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aine", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start accepting WiFi Direct connections because a null serviceName and/or callback was passed in.");
            return false;
        } else if (mo37714e()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aine", "a", 258, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Can't start accepting WiFi Direct connections because we're already accepting Wifi Direct connections.");
            return false;
        } else if (!mo37708a()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aine", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Can't start accepting WiFi Direct connections because WiFi Direct is not supported.");
            return false;
        } else {
            try {
                ails.m57439a();
                ServerSocket serverSocket = new ServerSocket(0);
                new aimr(this, ahof, serverSocket).start();
                this.f69249g = serverSocket;
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                bnsl4.mo68432a("aine", "a", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68409a("Started accepting WiFi Direct connections on port %s.", serverSocket.getLocalPort());
                return true;
            } catch (IOException e) {
                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                bnsl5.mo68437a(e);
                bnsl5.mo68432a("aine", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Failed to start accepting WiFi Direct connections.");
                return false;
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37710a(String str, String str2, boolean z, ahfk ahfk) {
        synchronized (this) {
            if (str == null || str2 == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aine", "a", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Refusing to host WiFi Direct group because a null ssid, and/or password was passed in.");
                return false;
            } else if (mo37711b()) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aine", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Can't host WiFi Direct group because WiFi Direct is already hosted.");
                return false;
            } else if (!mo37708a()) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aine", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Can't host WiFi Direct group because WiFi Direct is not supported.");
                return false;
            } else {
                ainc ainc = new ainc(this.f69246d, this.f69247e, this.f69243a, str, str2, z, ahfk);
                if (!m57497a(this.f69248f.mo37908b(ainc))) {
                    srn srn = ailf.f69111a;
                    return false;
                }
                this.f69244b = ainc;
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                bnsl4.mo68432a("aine", "a", 203, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Successfully hosted WiFi Direct group");
                return true;
            }
        }
    }
}
