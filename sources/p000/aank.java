package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.gms.gcm.GcmChimeraService;
import com.google.android.gms.gcm.connection.ReconnectManager$ReconnectBroadcastReceiver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: aank */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aank {

    /* renamed from: A */
    private final sqv f28548A;

    /* renamed from: B */
    private long f28549B;

    /* renamed from: C */
    private final Random f28550C;

    /* renamed from: D */
    private ConnectivityManager.NetworkCallback f28551D;

    /* renamed from: a */
    public final Context f28552a;

    /* renamed from: b */
    public final ConnectivityManager f28553b;

    /* renamed from: c */
    public final aamz f28554c;

    /* renamed from: d */
    public final ReconnectManager$ReconnectBroadcastReceiver f28555d;

    /* renamed from: e */
    public final aani f28556e;

    /* renamed from: f */
    public boolean f28557f;

    /* renamed from: g */
    NetworkInfo.State f28558g = NetworkInfo.State.UNKNOWN;

    /* renamed from: h */
    int f28559h;

    /* renamed from: i */
    NetworkInfo.State f28560i = NetworkInfo.State.UNKNOWN;

    /* renamed from: j */
    int f28561j;

    /* renamed from: k */
    public boolean f28562k;

    /* renamed from: l */
    final boolean f28563l = true;

    /* renamed from: m */
    public aand f28564m;

    /* renamed from: n */
    public List f28565n;

    /* renamed from: o */
    public List f28566o;

    /* renamed from: p */
    public long f28567p;

    /* renamed from: q */
    public long f28568q;

    /* renamed from: r */
    public long f28569r;

    /* renamed from: s */
    public final aang f28570s;

    /* renamed from: t */
    private final aamu f28571t;

    /* renamed from: u */
    private long f28572u;

    /* renamed from: v */
    private boolean f28573v = false;

    /* renamed from: w */
    private long f28574w;

    /* renamed from: x */
    private long f28575x;

    /* renamed from: y */
    private long f28576y;

    /* renamed from: z */
    private long f28577z;

    public aank(Context context, sqv sqv, aamu aamu, Random random) {
        aajg.m21335a(context);
        Context applicationContext = context.getApplicationContext();
        this.f28552a = applicationContext;
        this.f28571t = aamu;
        this.f28550C = random;
        this.f28553b = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.f28555d = new ReconnectManager$ReconnectBroadcastReceiver(this);
        this.f28548A = sqv;
        this.f28570s = new aang(this.f28552a);
        this.f28556e = new aani(this.f28552a, this.f28570s, this.f28571t, random);
        this.f28554c = new aamz(this.f28553b);
    }

    /* renamed from: j */
    private final synchronized void m21642j() {
        this.f28551D = new aanj(this);
    }

    /* renamed from: b */
    public final void mo17123b() {
        mo17122a(false);
    }

    /* renamed from: c */
    public final void mo17125c() {
        boolean z;
        if (cecz.m136061i() >= 0) {
            NetworkInfo networkInfo = this.f28553b.getNetworkInfo(mo17131h());
            ContentResolver contentResolver = this.f28552a.getContentResolver();
            int i = Build.VERSION.SDK_INT;
            boolean z2 = false;
            if (Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.f28576y > 0) {
                z2 = true;
            }
            if (z != z2) {
                mo17124b(z);
            }
            if (!z || (networkInfo != null && networkInfo.isConnected())) {
                this.f28556e.mo17107a(networkInfo);
            }
        }
    }

    /* renamed from: d */
    public final void mo17127d() {
        synchronized (this) {
            if (cecz.f182285a.mo6606a().mo78834b()) {
                this.f28557f = false;
                this.f28556e.f28540b.mo17059d();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo17128e() {
        return this.f28559h == 1 && this.f28554c.mo17085b() == 4;
    }

    /* renamed from: f */
    public final void mo17129f() {
        this.f28572u = 0;
    }

    /* renamed from: g */
    public final boolean mo17130g() {
        NetworkInfo activeNetworkInfo = this.f28553b.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: h */
    public final int mo17131h() {
        if (!mo17128e()) {
            return this.f28559h;
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo17132i() {
        this.f28556e.f28540b.f28490b.mo49120c();
    }

    /* renamed from: b */
    public final void mo17124b(boolean z) {
        StringBuilder sb = new StringBuilder(47);
        sb.append("handleAirplaneModeChanged: airplaneModeOn=");
        sb.append(z);
        sb.toString();
        if (z) {
            this.f28576y = SystemClock.elapsedRealtime();
            this.f28577z = 0;
            if (this.f28560i == NetworkInfo.State.DISCONNECTED) {
                mo17127d();
                return;
            }
            return;
        }
        this.f28576y = 0;
        this.f28577z = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public static final List m21641a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) str)) {
            String[] split = str2.split(":");
            if (split.length != 2) {
                String valueOf = String.valueOf(str2);
                Log.e("GCM", valueOf.length() == 0 ? new String("Invalid GcmClient endpoint: ") : "Invalid GcmClient endpoint: ".concat(valueOf));
            } else {
                try {
                    Integer.parseInt(split[1]);
                    arrayList.add(split);
                } catch (NumberFormatException e) {
                    String valueOf2 = String.valueOf(str2);
                    Log.e("GCM", valueOf2.length() == 0 ? new String("Invalid GcmClient endpoint: ") : "Invalid GcmClient endpoint: ".concat(valueOf2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo17116a() {
        NetworkRequest networkRequest;
        m21642j();
        if (!cecz.f182285a.mo6606a().mo78820al()) {
            networkRequest = new NetworkRequest.Builder().build();
        } else {
            networkRequest = new NetworkRequest.Builder().removeCapability(15).removeCapability(14).build();
        }
        this.f28570s.mo17104a(networkRequest, this.f28551D);
    }

    /* renamed from: c */
    public final void mo17126c(boolean z) {
        int i = Build.VERSION.SDK_INT;
        this.f28553b.reportNetworkConnectivity(null, z);
    }

    /* renamed from: a */
    public final void mo17117a(int i, boolean z) {
        if (i == 27) {
            return;
        }
        if ((!z || this.f28564m.mo17097e() < cecz.m136068p()) && ((i != 4 || cecz.f182285a.mo6606a().mo78857y()) && !this.f28554c.mo17084a() && ((cecz.f182285a.mo6606a().mo78858z() && this.f28559h == 1) || (cect.f182268a.mo6606a().mo78769c() && aajg.m21347e(this.f28559h))))) {
            mo17122a(true);
            return;
        }
        mo17126c(false);
        if (i == 28 || i == 6 || i == 29) {
            mo17122a(false);
            return;
        }
        mo17125c();
        mo17132i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aank.a(android.net.NetworkInfo, boolean):void
     arg types: [android.net.NetworkInfo, int]
     candidates:
      aank.a(int, boolean):void
      aank.a(android.net.Network, int):void
      aank.a(android.net.NetworkInfo$State, int):void
      aank.a(android.net.NetworkInfo, boolean):void */
    /* renamed from: a */
    public final void mo17118a(Network network, int i) {
        NetworkInfo networkInfo = this.f28553b.getNetworkInfo(network);
        if (i == 1) {
            mo17120a(networkInfo, true);
        } else {
            mo17120a(networkInfo, false);
        }
    }

    /* renamed from: a */
    public final void mo17119a(NetworkInfo.State state, int i) {
        String valueOf = String.valueOf(state);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("setInternalNetworkState: type=");
        sb.append(i);
        sb.append(", state=");
        sb.append(valueOf);
        sb.toString();
        this.f28573v = state == NetworkInfo.State.SUSPENDED;
        this.f28558g = state;
        this.f28559h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0291  */
    /* renamed from: a */
    public final void mo17120a(NetworkInfo networkInfo, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        String str3;
        NetworkInfo activeNetworkInfo = this.f28553b.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (this.f28567p <= 0) {
                this.f28567p = SystemClock.elapsedRealtime();
            }
        } else if (this.f28567p > 0) {
            this.f28549B += SystemClock.elapsedRealtime() - this.f28567p;
            this.f28567p = -1;
        }
        if (z && networkInfo != null) {
            aakb.m21381a().mo16920e().mo17193a();
        }
        if (cecz.m136061i() >= 0) {
            this.f28574w = SystemClock.elapsedRealtime();
            if (networkInfo == null) {
                Log.w("GCM", "Connection event without network info, shouldn't happen !");
                this.f28561j = -1;
                this.f28560i = NetworkInfo.State.DISCONNECTED;
            } else {
                this.f28561j = networkInfo.getType();
                this.f28560i = networkInfo.getState();
            }
            NetworkInfo activeNetworkInfo2 = this.f28553b.getActiveNetworkInfo();
            if (activeNetworkInfo2 != null) {
                if (!activeNetworkInfo2.isConnected()) {
                    Log.w("GCM", "ACTIVE NETWORK NOT CONNECTED");
                }
                this.f28562k = true;
                i = activeNetworkInfo2.getType();
                this.f28568q = System.currentTimeMillis();
            } else {
                this.f28562k = false;
                this.f28569r = System.currentTimeMillis();
                i = -1;
            }
            if (this.f28561j == 1) {
                if (this.f28560i == NetworkInfo.State.DISCONNECTED) {
                    this.f28575x = SystemClock.elapsedRealtime();
                } else if (this.f28560i == NetworkInfo.State.CONNECTED) {
                    this.f28575x = 0;
                }
            }
            if (this.f28562k) {
                NetworkInfo.State state = activeNetworkInfo2.getState();
                boolean a = this.f28564m.mo17093a();
                boolean b = this.f28564m.mo17094b();
                if ((a || b) && !((aanr) this.f28564m).f28611d) {
                    int i2 = ((aanr) this.f28564m).f28608a.f28636c;
                    if (i2 != -1 && i2 != i) {
                        GcmChimeraService.m24303a("Endpoint network %d != active one: starting parallel connection", Integer.valueOf(i2));
                        mo17119a(state, i);
                        aand aand = this.f28564m;
                        aanr aanr = (aanr) aand;
                        synchronized (aanr.f28610c) {
                            if (!((aanr) aand).f28611d) {
                                if (!((aanr) aand).f28608a.f28639f) {
                                    ((aanr) aand).mo17089a((aanf) null, (aanh) null);
                                } else {
                                    ((aanr) aand).f28611d = true;
                                    aanr.mo17142a(aanr.f28608a, (aanf) null);
                                    aanr.mo17147b(aanr.f28608a, true, null);
                                }
                            }
                        }
                        if (this.f28556e.mo17111b()) {
                            this.f28556e.mo17108a(activeNetworkInfo2, false);
                            return;
                        }
                        return;
                    } else if (i == 0 && i2 == 0 && mo17128e()) {
                        GcmChimeraService.m24303a("Active network is now cellular, but already on cellular fallback.", new Object[0]);
                        mo17119a(state, 0);
                        this.f28554c.mo17086b(2);
                        if (this.f28556e.mo17111b()) {
                            this.f28556e.mo17108a(activeNetworkInfo2, false);
                            return;
                        }
                        return;
                    }
                }
                if (b) {
                    mo17126c(true);
                }
                NetworkInfo.State state2 = this.f28558g;
                if (state == state2 && i == this.f28559h) {
                    String valueOf = String.valueOf(state);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 94);
                    sb.append("### networkStateChanged: active and curr network type/state are the same(");
                    sb.append(i);
                    sb.append("/");
                    sb.append(valueOf);
                    sb.append("), ignore");
                    sb.toString();
                    return;
                }
                int i3 = this.f28559h;
                mo17119a(state, i);
                int i4 = i3;
                long j = this.f28575x;
                long j2 = this.f28577z;
                if (!(i == 1 || i == 7 || i == 9)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - j > 20000) {
                        z2 = elapsedRealtime - j2 > 60000;
                        z3 = this.f28573v;
                        if (!b && z2 && !z3) {
                            if (this.f28572u != 0) {
                                long currentTimeMillis = System.currentTimeMillis() - this.f28572u;
                                if (currentTimeMillis > cecz.f182285a.mo6606a().mo78806Y()) {
                                    long j3 = this.f28572u;
                                    StringBuilder sb2 = new StringBuilder(111);
                                    sb2.append("networkStateChanged: mLastMobileNetworkOutageTs=");
                                    sb2.append(j3);
                                    sb2.append(", diff=");
                                    sb2.append(currentTimeMillis);
                                    sb2.append(", use long delay");
                                    sb2.toString();
                                    z4 = true;
                                    this.f28556e.mo17109a(z4);
                                    Object[] objArr = new Object[3];
                                    objArr[0] = Integer.valueOf(this.f28559h);
                                    if (!z4) {
                                        str3 = "";
                                    } else {
                                        str3 = "Long";
                                    }
                                    objArr[1] = str3;
                                    objArr[2] = Long.valueOf(this.f28556e.mo17106a() / 1000);
                                    GcmChimeraService.m24303a("Network event while disconnected / throttling %d %s %d", objArr);
                                    if (this.f28556e.mo17111b()) {
                                        this.f28556e.mo17108a(activeNetworkInfo2, z4);
                                    }
                                    mo17125c();
                                }
                            }
                            z4 = false;
                            this.f28556e.mo17109a(z4);
                            Object[] objArr2 = new Object[3];
                            objArr2[0] = Integer.valueOf(this.f28559h);
                            if (!z4) {
                            }
                            objArr2[1] = str3;
                            objArr2[2] = Long.valueOf(this.f28556e.mo17106a() / 1000);
                            GcmChimeraService.m24303a("Network event while disconnected / throttling %d %s %d", objArr2);
                            if (this.f28556e.mo17111b()) {
                            }
                            mo17125c();
                        } else {
                            Object[] objArr3 = new Object[4];
                            objArr3[0] = Integer.valueOf(i4);
                            if (b) {
                                str = "";
                            } else {
                                str = "connected";
                            }
                            objArr3[1] = str;
                            objArr3[2] = state2;
                            if (z3) {
                                str2 = "";
                            } else {
                                str2 = "suspended";
                            }
                            objArr3[3] = str2;
                            GcmChimeraService.m24303a("Reconnect on network change %d %s %s %s", objArr3);
                            if (b || a) {
                                this.f28564m.mo17088a(1);
                            }
                            mo17122a(false);
                            if (!this.f28556e.mo17111b()) {
                                this.f28556e.mo17108a(activeNetworkInfo2, false);
                            } else {
                                this.f28556e.mo17109a(false);
                            }
                        }
                        mo17129f();
                        return;
                    }
                }
                z2 = false;
                z3 = this.f28573v;
                if (!b) {
                    if (this.f28572u != 0) {
                    }
                    z4 = false;
                    this.f28556e.mo17109a(z4);
                    Object[] objArr22 = new Object[3];
                    objArr22[0] = Integer.valueOf(this.f28559h);
                    if (!z4) {
                    }
                    objArr22[1] = str3;
                    objArr22[2] = Long.valueOf(this.f28556e.mo17106a() / 1000);
                    GcmChimeraService.m24303a("Network event while disconnected / throttling %d %s %d", objArr22);
                    if (this.f28556e.mo17111b()) {
                    }
                    mo17125c();
                    mo17129f();
                    return;
                }
                Object[] objArr32 = new Object[4];
                objArr32[0] = Integer.valueOf(i4);
                if (b) {
                }
                objArr32[1] = str;
                objArr32[2] = state2;
                if (z3) {
                }
                objArr32[3] = str2;
                GcmChimeraService.m24303a("Reconnect on network change %d %s %s %s", objArr32);
                this.f28564m.mo17088a(1);
                mo17122a(false);
                if (!this.f28556e.mo17111b()) {
                }
                mo17129f();
                return;
            }
            mo17119a(NetworkInfo.State.DISCONNECTED, -1);
            if (this.f28572u == 0 && (this.f28560i != NetworkInfo.State.DISCONNECTED || this.f28576y <= 0 || SystemClock.elapsedRealtime() - this.f28576y >= 20000)) {
                this.f28572u = System.currentTimeMillis();
            }
            if (this.f28564m.mo17093a()) {
                this.f28564m.mo17088a(1);
                GcmChimeraService.m24303a("Disconnect on network down", new Object[0]);
                return;
            }
            GcmChimeraService.m24303a("Network down, already disconnected", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo17121a(PrintWriter printWriter) {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a = this.f28556e.f28540b.mo17055a() - elapsedRealtime;
        String str2 = "";
        if (this.f28556e.f28540b.mo17058c()) {
            String formatElapsedTime = DateUtils.formatElapsedTime(a / 1000);
            String valueOf = String.valueOf(this.f28556e);
            StringBuilder sb = new StringBuilder(String.valueOf(formatElapsedTime).length() + 46 + String.valueOf(valueOf).length());
            sb.append("ReconnectManager: next reconnect attempt in ");
            sb.append(formatElapsedTime);
            sb.append("s ");
            sb.append(valueOf);
            printWriter.println(sb.toString());
        } else {
            String str3 = !this.f28564m.mo17094b() ? str2 : "Connected";
            String str4 = (this.f28564m.mo17093a() && !this.f28564m.mo17094b()) ? "Connecting" : str2;
            StringBuilder sb2 = new StringBuilder(str3.length() + 21 + str4.length());
            sb2.append("ReconnectManager OFF ");
            sb2.append(str3);
            sb2.append(str4);
            printWriter.println(sb2.toString());
        }
        int i = this.f28561j;
        String valueOf2 = String.valueOf(this.f28560i);
        String formatElapsedTime2 = DateUtils.formatElapsedTime((elapsedRealtime - this.f28574w) / 1000);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 58 + String.valueOf(formatElapsedTime2).length());
        sb3.append("Last network state notification: ");
        sb3.append(i);
        sb3.append("/");
        sb3.append(valueOf2);
        sb3.append(", time: ");
        sb3.append(formatElapsedTime2);
        sb3.append("s ago");
        printWriter.println(sb3.toString());
        int i2 = this.f28559h;
        StringBuilder sb4 = new StringBuilder(32);
        sb4.append("active network type: ");
        sb4.append(i2);
        printWriter.println(sb4.toString());
        NetworkInfo activeNetworkInfo = this.f28553b.getActiveNetworkInfo();
        if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == this.f28559h)) {
            printWriter.println("Type missmatch between polled and callback:");
            int type = activeNetworkInfo.getType();
            StringBuilder sb5 = new StringBuilder(41);
            sb5.append("active network type (polled): ");
            sb5.append(type);
            printWriter.println(sb5.toString());
            String valueOf3 = String.valueOf(this.f28558g);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
            sb6.append("active network state (polled): ");
            sb6.append(valueOf3);
            printWriter.println(sb6.toString());
        }
        if (this.f28567p > 0) {
            String formatElapsedTime3 = DateUtils.formatElapsedTime((SystemClock.elapsedRealtime() - this.f28567p) / 1000);
            String formatElapsedTime4 = DateUtils.formatElapsedTime(this.f28549B / 1000);
            StringBuilder sb7 = new StringBuilder(String.valueOf(formatElapsedTime3).length() + 12 + String.valueOf(formatElapsedTime4).length());
            sb7.append("Connected: ");
            sb7.append(formatElapsedTime3);
            sb7.append("/");
            sb7.append(formatElapsedTime4);
            printWriter.println(sb7.toString());
        } else {
            String valueOf4 = String.valueOf(DateUtils.formatElapsedTime(this.f28549B / 1000));
            printWriter.println(valueOf4.length() == 0 ? new String("Disconnected, connected time: ") : "Disconnected, connected time: ".concat(valueOf4));
        }
        String str5 = "OFF";
        String str6 = !mo17130g() ? str5 : "ON";
        if (this.f28562k) {
            str5 = "ON";
        }
        if (!this.f28573v) {
            str = str2;
        } else {
            str = " NetworkSuspended";
        }
        if (!this.f28563l) {
            str2 = " NoNetworkStatusIcon";
        }
        StringBuilder sb8 = new StringBuilder(str6.length() + 41 + str5.length() + str.length() + str2.length());
        sb8.append("Network status: ");
        sb8.append(str6);
        sb8.append(" Previous Network status:");
        sb8.append(str5);
        sb8.append(str);
        sb8.append(str2);
        printWriter.println(sb8.toString());
    }

    /* renamed from: a */
    public final void mo17122a(boolean z) {
        aanf aanf;
        String str;
        int i;
        if (!aajg.m21343c()) {
            return;
        }
        if (cecz.m136061i() < 0 || ((aanr) this.f28564m).f28608a.mo17149a() == -1) {
            this.f28564m.mo17088a(11);
        } else if (!this.f28564m.mo17094b() && !this.f28564m.mo17093a()) {
            int a = this.f28554c.mo17083a(z, this.f28559h);
            aanh aanh = null;
            if (a == 4) {
                int i2 = Build.VERSION.SDK_INT;
                Network[] allNetworks = this.f28553b.getAllNetworks();
                int length = allNetworks.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    Network network = allNetworks[i3];
                    NetworkInfo networkInfo = this.f28553b.getNetworkInfo(network);
                    if (networkInfo != null && networkInfo.getType() == 0 && networkInfo.isAvailable()) {
                        aanh = new aanh(network);
                        break;
                    }
                    i3++;
                }
                if (aanh == null) {
                    a = 3;
                }
            }
            if (a - 1 != 2) {
                aanf = new aanf(cecz.m136070r(), (int) cecz.m136071s(), a);
            } else {
                List list = this.f28559h == 1 ? this.f28565n : this.f28566o;
                if (!list.isEmpty()) {
                    String[] strArr = (String[]) list.get(this.f28550C.nextInt(list.size()));
                    str = strArr[0];
                    i = Integer.parseInt(strArr[1]);
                } else {
                    str = cecz.m136070r();
                    i = 443;
                }
                aanf = new aanf(str, i, 3);
            }
            this.f28554c.mo17086b(a);
            this.f28556e.f28540b.f28490b.mo49111a(aani.f28537a);
            this.f28564m.mo17089a(aanf, aanh);
        }
    }
}
