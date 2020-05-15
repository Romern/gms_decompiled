package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pdz implements pec {

    /* renamed from: a */
    public static final bnsn f38896a = odk.m28481a("CAR.WIFI");

    /* renamed from: A */
    public Handler f38897A;

    /* renamed from: B */
    public final boolean f38898B;

    /* renamed from: C */
    public final boolean f38899C;

    /* renamed from: D */
    public final boolean f38900D;

    /* renamed from: E */
    public final boolean f38901E;

    /* renamed from: F */
    final pcj f38902F;

    /* renamed from: G */
    public pce f38903G;

    /* renamed from: H */
    public final pcl f38904H;

    /* renamed from: I */
    public final UUID f38905I;

    /* renamed from: J */
    public final Set f38906J;

    /* renamed from: K */
    public final pco f38907K;

    /* renamed from: L */
    public final Runnable f38908L;

    /* renamed from: M */
    final Runnable f38909M;

    /* renamed from: N */
    public final BroadcastReceiver f38910N;

    /* renamed from: O */
    public final ota f38911O;

    /* renamed from: P */
    public final osy f38912P;

    /* renamed from: Q */
    private final List f38913Q = new ArrayList();

    /* renamed from: R */
    private int f38914R;

    /* renamed from: S */
    private bixd f38915S;

    /* renamed from: T */
    private String f38916T;

    /* renamed from: U */
    private volatile int f38917U;

    /* renamed from: V */
    private final boolean f38918V;

    /* renamed from: W */
    private final boolean f38919W;

    /* renamed from: X */
    private final boolean f38920X;

    /* renamed from: Y */
    private final boolean f38921Y;

    /* renamed from: Z */
    private final bngj f38922Z;

    /* renamed from: aa */
    private final Runnable f38923aa;

    /* renamed from: ab */
    private final otb f38924ab;

    /* renamed from: b */
    public final Object f38925b = new Object();

    /* renamed from: c */
    pdx f38926c;

    /* renamed from: d */
    public dcm f38927d;

    /* renamed from: e */
    public final Set f38928e = new HashSet();

    /* renamed from: f */
    public final Context f38929f;

    /* renamed from: g */
    public boolean f38930g;

    /* renamed from: h */
    public String f38931h;

    /* renamed from: i */
    public int f38932i;

    /* renamed from: j */
    int f38933j = -1;

    /* renamed from: k */
    int f38934k = -1;

    /* renamed from: l */
    public final AtomicBoolean f38935l;

    /* renamed from: m */
    BluetoothDevice f38936m;

    /* renamed from: n */
    boolean f38937n;

    /* renamed from: o */
    public int f38938o;

    /* renamed from: p */
    public boolean f38939p;

    /* renamed from: q */
    public volatile long f38940q;

    /* renamed from: r */
    public volatile long f38941r;

    /* renamed from: s */
    public volatile boolean f38942s;

    /* renamed from: t */
    public WifiManager.WifiLock f38943t;

    /* renamed from: u */
    public final Handler f38944u;

    /* renamed from: v */
    public final HandlerThread f38945v;

    /* renamed from: w */
    public final HandlerThread f38946w;

    /* renamed from: x */
    public final HandlerThread f38947x;

    /* renamed from: y */
    public Handler f38948y;

    /* renamed from: z */
    public Handler f38949z;

    public pdz(Context context, HandlerThread handlerThread, HandlerThread handlerThread2, HandlerThread handlerThread3, ota ota, osy osy, pcl pcl, otb otb, UUID uuid, bngj bngj, boolean z, pco pco, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Set set) {
        pcl pcl2 = pcl;
        pco pco2 = pco;
        boolean z8 = false;
        this.f38935l = new AtomicBoolean(false);
        this.f38942s = true;
        this.f38908L = new pcv(this);
        this.f38923aa = new pdo(this);
        this.f38909M = new pdp(this);
        new pdr(this);
        this.f38910N = new pdu(this);
        this.f38929f = context;
        this.f38945v = handlerThread;
        this.f38946w = handlerThread2;
        this.f38947x = handlerThread3;
        this.f38911O = ota;
        this.f38912P = osy;
        this.f38904H = pcl2;
        this.f38924ab = otb;
        this.f38905I = uuid;
        this.f38922Z = bngj;
        this.f38898B = z;
        this.f38899C = pco2 != null ? true : z8;
        this.f38907K = pco2;
        this.f38921Y = z7;
        this.f38927d = dcm.IDLE;
        this.f38944u = new adzt(Looper.getMainLooper());
        pci pci = new pci();
        pci.f38830a = pcl2;
        pci.f38831b = 1500;
        pci.f38832c = 25000;
        pci.f38833d = 2.0d;
        this.f38902F = new pcj(pci);
        this.f38900D = z2;
        this.f38918V = z3;
        this.f38901E = z4;
        this.f38919W = z5;
        this.f38920X = z6;
        this.f38906J = set;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
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
    private final int m30226a(WifiConfiguration wifiConfiguration, WifiManager wifiManager) {
        this.f38939p = false;
        if (wifiManager.getConfiguredNetworks() != null) {
            for (WifiConfiguration wifiConfiguration2 : wifiManager.getConfiguredNetworks()) {
                if (wifiConfiguration2.SSID != null && pcm.m30212a(wifiConfiguration2.SSID, wifiConfiguration.SSID)) {
                    wifiConfiguration.networkId = wifiConfiguration2.networkId;
                    int updateNetwork = wifiManager.updateNetwork(wifiConfiguration);
                    if (updateNetwork != -1) {
                        return updateNetwork;
                    }
                    bnsi b = f38896a.mo68387b();
                    b.mo68432a("pdz", "a", 1094, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68422a("Unable to update network: %s, %s", (Object) wifiConfiguration.SSID, wifiConfiguration.networkId);
                    this.f38939p = true;
                    return wifiConfiguration2.networkId;
                }
            }
        }
        int addNetwork = wifiManager.addNetwork(wifiConfiguration);
        wifiManager.saveConfiguration();
        return addNetwork;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = r6.f38943t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0.isHeld() == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r6.f38943t.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r6.f38902F.mo22904b();
        r6.f38929f.unregisterReceiver(r6.f38910N);
        r2 = r6.f38925b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0 = r6.f38928e.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r0.hasNext() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        r3 = (p000.otc) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r6.f38901E == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r6.f38948y.post(new p000.pda(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r3.mo22598a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r6.f38945v.quitSafely();
        r6.f38946w.quitSafely();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r6.f38900D == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        r6.f38947x.quitSafely();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        r0 = r6.f38903G;
        r2 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r2 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r2.isEnabled() == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r3 = r0.f38817g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r3 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r2.closeProfileProxy(1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        r2 = r0.f38815e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r2 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r2.clear();
        r0.f38815e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r0.f38816f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = r6.f38926c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.mo22937a();
        r6.f38926c = null;
     */
    /* renamed from: b */
    public final void mo22953b() {
        synchronized (this.f38925b) {
            if (!dcm.SHUTDOWN.equals(this.f38927d)) {
                this.f38927d = dcm.SHUTDOWN;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22956c() {
        bnsi b = f38896a.mo68387b();
        b.mo68432a("pdz", "c", 517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Failed to connect with provided wifi credentials");
        this.f38904H.mo22695a(this.f38942s, this.f38915S, ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
        mo22944a(9);
        mo22948a(dcm.ABORTED_WIFI);
        dcm dcm = dcm.CONNECTED_BT;
        this.f38927d = dcm;
        mo22948a(dcm);
        if (this.f38939p) {
            mo22959f();
        }
    }

    /* renamed from: d */
    public final void mo22957d() {
        this.f38912P.mo22596a();
        mo22947a(bixa.f122152a, 2);
        this.f38930g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo22958e() {
        int i = Build.VERSION.SDK_INT;
        try {
            if (C1133kh.m17835a(this.f38929f, "android.permission.READ_PHONE_STATE") != 0) {
                return "unknown";
            }
            return Build.getSerial();
        } catch (SecurityException e) {
            return "unknown";
        }
    }

    /* renamed from: f */
    public final void mo22959f() {
        Bundle bundle = new Bundle();
        bundle.putString("PARAM_ACCESS_POINT_NAME", pcm.m30207a(this.f38916T));
        m30232a(dcm.START_WIFI_REQUEST_FAILED_INVALID_CREDENTIALS, bundle);
        this.f38939p = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r3.f38948y.post(new p000.pcx(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* renamed from: g */
    public final void mo22960g() {
        synchronized (this.f38925b) {
            if (!dcm.SHUTDOWN.equals(this.f38927d)) {
                dcm dcm = this.f38927d;
                if (dcm != null && dcm.mo8533a(dcm.CONNECTED_BT)) {
                    dcm dcm2 = dcm.IDLE;
                    this.f38927d = dcm2;
                    mo22948a(dcm2);
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo22961h() {
        return !this.f38937n;
    }

    /* renamed from: a */
    public static final Handler m30227a(Looper looper) {
        return new adzt(looper);
    }

    /* renamed from: a */
    public static bxxc m30228a(bxxk bxxk, byte[] bArr, int i, int i2) {
        try {
            return (bxxc) bxxk.mo73664c(bArr, i, i2, bxus.m123742a());
        } catch (bxwf e) {
            throw new IllegalArgumentException("Unable to parse protocol buffer", e);
        }
    }

    /* renamed from: a */
    private final void m30229a(int i, int i2, byte[] bArr, int i3) {
        bixd bixd;
        int i4;
        int i5 = i;
        int i6 = i2;
        byte[] bArr2 = bArr;
        int i7 = i3;
        this.f38912P.mo22596a();
        if (i6 == 1) {
            bixe bixe = (bixe) m30228a((bxxk) bixe.f122174d.mo74142c(7), bArr2, i7, i5);
            if (pcm.m30215d(bixe.f122177b)) {
                this.f38931h = bixe.f122177b;
                if ((bixe.f122176a & 2) != 0) {
                    this.f38932i = bixe.f122178c;
                }
                this.f38942s = true;
                this.f38941r = SystemClock.elapsedRealtime();
                mo22948a(dcm.WIFI_PROJECTION_START_REQUESTED);
                mo22949a(this.f38931h, this.f38932i);
                this.f38912P.mo22596a();
                bxvd da = bixf.f122179e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bixf bixf = (bixf) da.f164949b;
                bixf.f122184d = 0;
                bixf.f122181a |= 4;
                mo22947a((bixf) da.mo74062i(), 7);
                return;
            }
            mo22944a(5);
        } else if (i6 == 7) {
            this.f38935l.set(false);
            bixf bixf2 = (bixf) m30228a((bxxk) bixf.f122179e.mo74142c(7), bArr2, i7, i5);
            if (bixf2 != null) {
                int a = biwy.m102920a(bixf2.f122184d);
                if (a == 0) {
                    a = 13;
                }
                int i8 = a - 12;
                if (i8 != -6) {
                    if (i8 == -5) {
                        this.f38902F.mo22904b();
                        mo22948a(dcm.START_WIFI_REQUEST_FAILED_WIFI_DISABLED);
                    } else if (i8 == -4) {
                        this.f38902F.mo22904b();
                        mo22948a(dcm.START_WIFI_REQUEST_FAILED_ALREADY_STARTED);
                    } else if (i8 != 0) {
                        bnsi b = f38896a.mo68387b();
                        b.mo68432a("pdz", "a", 1578, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("Unexpected Wifi Response Message");
                    } else {
                        this.f38902F.mo22904b();
                        if (pcm.m30215d(bixf2.f122182b)) {
                            this.f38931h = bixf2.f122182b;
                            if ((bixf2.f122181a & 2) != 0) {
                                this.f38932i = bixf2.f122183c;
                            }
                            mo22948a(dcm.START_WIFI_REQUEST_SUCCESS);
                            mo22949a(this.f38931h, this.f38932i);
                            return;
                        }
                        mo22944a(9);
                    }
                } else if (!this.f38898B || !this.f38902F.mo22903a()) {
                    mo22948a(dcm.START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED);
                    this.f38902F.mo22904b();
                }
            }
        } else if (i6 == 3) {
            bixb bixb = (bixb) m30228a((bxxk) bixb.f122154e.mo74142c(7), bArr2, i7, i5);
            String a2 = pcm.m30207a(bixb.f122156a);
            String str = bixb.f122158c;
            String a3 = pcm.m30207a(bixb.f122157b);
            bixd a4 = bixd.m102925a(bixb.f122159d);
            if (a4 != null) {
                bixd = a4;
            } else {
                bixd = bixd.UNKNOWN_SECURITY_MODE;
            }
            mo22951a(a2, str, a3, bixd, this.f38931h, this.f38932i);
        } else if (i6 != 4) {
            bnsi b2 = f38896a.mo68387b();
            b2.mo68432a("pdz", "a", 1044, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68409a("Unexpected message type: %s", i6);
        } else {
            bixg bixg = (bixg) m30228a((bxxk) bixg.f122185d.mo74142c(7), bArr2, i7, i5);
            int i9 = bixg.f122187a;
            this.f38933j = i9;
            int i10 = bixg.f122188b;
            this.f38934k = i10;
            int[] a5 = bqcn.m112584a(bixg.f122189c);
            bxvd da2 = bixh.f122191f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bixh bixh = (bixh) da2.f164949b;
            int i11 = bixh.f122193a | 1;
            bixh.f122193a = i11;
            bixh.f122194b = i9;
            bixh.f122193a = i11 | 2;
            bixh.f122195c = i10;
            if (i9 == 0) {
                i4 = 12;
            } else {
                i4 = 11;
            }
            if (i9 == 1) {
                if (a5 != null) {
                    if (this.f38899C) {
                    }
                    i4 = 12;
                }
                i4 = 4;
            }
            if (i10 <= 0) {
                this.f38912P.mo22596a();
            }
            String e = mo22958e();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bixh bixh2 = (bixh) da2.f164949b;
            e.getClass();
            int i12 = bixh2.f122193a | 4;
            bixh2.f122193a = i12;
            bixh2.f122196d = e;
            bixh2.f122197e = i4 - 12;
            bixh2.f122193a = i12 | 8;
            mo22947a(da2.mo74062i(), 5);
            if (i4 == 12) {
                this.f38904H.mo22692a(this.f38938o, i9, i10, SystemClock.elapsedRealtime() - this.f38940q, this.f38936m);
                mo22948a(dcm.FOUND_COMPATIBLE_WIFI_NETWORK);
            } else if (i4 == 4) {
                this.f38904H.mo22691a(this.f38938o, i9, i10, 305, this.f38936m);
                mo22948a(dcm.NO_COMPATIBLE_WIFI_CHANNEL_FOUND);
                bnsi b3 = f38896a.mo68387b();
                b3.mo68432a("pdz", "a", 900, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68420a("WiFi channels not supported: %s", Arrays.toString(a5));
                this.f38944u.post(new pdn(this));
            } else {
                this.f38904H.mo22691a(this.f38938o, i9, i10, 2, this.f38936m);
                mo22948a(dcm.NO_COMPATIBLE_WIFI_VERSION_FOUND);
                bnsi b4 = f38896a.mo68387b();
                b4.mo68432a("pdz", "a", 911, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b4.mo68411a("HU version mismatch, requested major version: %d, phone using version: %d", i9, 1);
                this.f38944u.post(new pcw(this));
            }
            mo22948a(dcm.VERSION_CHECK_COMPLETE);
        }
    }

    /* renamed from: b */
    public final void mo22954b(BluetoothSocket bluetoothSocket) {
        this.f38912P.mo22596a();
        synchronized (this.f38925b) {
            dcm dcm = dcm.CONNECTED_BT;
            this.f38927d = dcm;
            mo22948a(dcm);
        }
        try {
            pdx pdx = new pdx(this, bluetoothSocket);
            this.f38926c = pdx;
            pdx.f38893d.f38949z.post(new pdv(pdx));
            List list = this.f38913Q;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f38948y.post((Runnable) list.get(i));
            }
            Handler handler = this.f38948y;
            List list2 = this.f38913Q;
            list2.getClass();
            handler.post(new pdl(list2));
        } catch (IOException e) {
            bnsi b = f38896a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pdz", "b", 767, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("failed to establish communication with connected socket");
            mo22948a(dcm.RFCOMM_START_IO_FAILURE);
            mo22960g();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pcl.a(boolean, boolean, bixd, int, long):void
     arg types: [boolean, int, bixd, int, long]
     candidates:
      pcl.a(int, int, int, int, android.bluetooth.BluetoothDevice):void
      pcl.a(int, int, int, long, android.bluetooth.BluetoothDevice):void
      pcl.a(boolean, boolean, bixd, int, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
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
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ef, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c9 A[SYNTHETIC, Splitter:B:75:0x01c9] */
    /* renamed from: b */
    public final void mo22955b(String str, String str2, String str3, bixd bixd, String str4, int i) {
        int i2;
        String str5 = str;
        bixd bixd2 = bixd;
        synchronized (this.f38925b) {
            WifiManager wifiManager = (WifiManager) this.f38929f.getApplicationContext().getSystemService("wifi");
            if (wifiManager.getWifiState() == 3) {
                this.f38904H.mo22693a(bpdh.WIFI_WAS_ENABLED);
            } else {
                this.f38904H.mo22693a(bpdh.WIFI_WAS_DISABLED);
            }
            if (wifiManager.getWifiState() == 1) {
                if (this.f38920X) {
                    mo22948a(dcm.WIFI_AUTOMATICALLY_ENABLED);
                    if (wifiManager.setWifiEnabled(true)) {
                    }
                } else {
                    int i3 = Build.VERSION.SDK_INT;
                }
                pcg pcg = pcg.WIFI_DISABLED;
                if (this.f38919W) {
                    bxvd da = biwz.f122147d.mo74144da();
                    int i4 = pcg.f38828c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    biwz biwz = (biwz) da.f164949b;
                    int i5 = i4 - 12;
                    if (i4 != 0) {
                        biwz.f122150b = i5;
                        biwz.f122149a |= 1;
                        String string = this.f38929f.getString(pcg.f38827b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        biwz biwz2 = (biwz) da.f164949b;
                        string.getClass();
                        biwz2.f122149a |= 2;
                        biwz2.f122151c = string;
                        mo22947a(da.mo74062i(), 6);
                    } else {
                        throw null;
                    }
                }
                mo22948a(dcm.WIFI_DISABLED);
                return;
            }
            if (!this.f38918V) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    if (connectionInfo.getNetworkId() >= 0 && pcm.m30212a(str5, connectionInfo.getSSID())) {
                        this.f38912P.mo22596a();
                        this.f38904H.mo22696a(this.f38942s, true, bixd, wifiManager.getConnectionInfo().getFrequency(), SystemClock.elapsedRealtime() - this.f38941r);
                        dcm dcm = dcm.CONNECTED_WIFI;
                        this.f38927d = dcm;
                        mo22948a(dcm);
                        mo22944a(12);
                        this.f38943t.acquire();
                        mo22950a(str4, i, wifiManager.getConnectionInfo());
                        return;
                    }
                }
            } else {
                this.f38912P.mo22596a();
            }
            WifiConfiguration wifiConfiguration = new WifiConfiguration();
            wifiConfiguration.BSSID = str2;
            wifiConfiguration.SSID = pcm.m30213b(str);
            wifiConfiguration.preSharedKey = pcm.m30213b(str3);
            if ((bixd2.f122173k & 16) == 0) {
                wifiConfiguration.allowedKeyManagement.set(1);
            } else {
                wifiConfiguration.allowedKeyManagement.set(2);
            }
            wifiConfiguration.allowedProtocols.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            if (this.f38912P.mo22596a()) {
                String str6 = wifiConfiguration.SSID;
            }
            this.f38939p = false;
            int i6 = -1;
            if (wifiManager.getConfiguredNetworks() != null) {
                Iterator<WifiConfiguration> it = wifiManager.getConfiguredNetworks().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WifiConfiguration next = it.next();
                    if (next.SSID == null || !pcm.m30212a(next.SSID, wifiConfiguration.SSID)) {
                        i6 = -1;
                    } else {
                        wifiConfiguration.networkId = next.networkId;
                        i2 = wifiManager.updateNetwork(wifiConfiguration);
                        if (i2 == i6) {
                            bnsi b = f38896a.mo68387b();
                            b.mo68432a("pdz", "a", 1094, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b.mo68422a("Unable to update network: %s, %s", (Object) wifiConfiguration.SSID, wifiConfiguration.networkId);
                            this.f38939p = true;
                            i2 = next.networkId;
                        }
                    }
                }
                this.f38917U = i2;
                this.f38916T = str5;
                this.f38915S = bixd2;
                if (this.f38917U == -1) {
                    wifiManager.disconnect();
                    wifiManager.enableNetwork(this.f38917U, true);
                    dcm dcm2 = dcm.CONNECTING_WIFI;
                    this.f38927d = dcm2;
                    mo22948a(dcm2);
                    this.f38914R = 0;
                    wifiManager.reconnect();
                    this.f38944u.postDelayed(this.f38923aa, 25000);
                    return;
                }
                this.f38904H.mo22695a(this.f38942s, bixd2, 102);
                mo22944a(10);
                bnsi b2 = f38896a.mo68387b();
                b2.mo68432a("pdz", "b", 1222, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("failed to connect to network");
                if (!this.f38930g) {
                    mo22957d();
                }
            }
            i2 = wifiManager.addNetwork(wifiConfiguration);
            wifiManager.saveConfiguration();
            this.f38917U = i2;
            this.f38916T = str5;
            this.f38915S = bixd2;
            if (this.f38917U == -1) {
            }
        }
    }

    /* renamed from: a */
    private final void m30230a(int i, int i2, int[] iArr) {
        int i3;
        int i4 = i;
        int i5 = i2;
        int[] iArr2 = iArr;
        bxvd da = bixh.f122191f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bixh bixh = (bixh) da.f164949b;
        int i6 = bixh.f122193a | 1;
        bixh.f122193a = i6;
        bixh.f122194b = i4;
        bixh.f122193a = i6 | 2;
        bixh.f122195c = i5;
        if (i4 == 0) {
            i3 = 12;
        } else {
            i3 = 11;
        }
        if (i4 == 1) {
            if (iArr2 != null) {
                if (this.f38899C) {
                }
                i3 = 12;
            }
            i3 = 4;
        }
        if (i5 <= 0) {
            this.f38912P.mo22596a();
        }
        String e = mo22958e();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bixh bixh2 = (bixh) da.f164949b;
        e.getClass();
        int i7 = bixh2.f122193a | 4;
        bixh2.f122193a = i7;
        bixh2.f122196d = e;
        bixh2.f122197e = i3 - 12;
        bixh2.f122193a = i7 | 8;
        mo22947a(da.mo74062i(), 5);
        if (i3 == 12) {
            this.f38904H.mo22692a(this.f38938o, i, i2, SystemClock.elapsedRealtime() - this.f38940q, this.f38936m);
            mo22948a(dcm.FOUND_COMPATIBLE_WIFI_NETWORK);
        } else if (i3 == 4) {
            this.f38904H.mo22691a(this.f38938o, i, i2, 305, this.f38936m);
            mo22948a(dcm.NO_COMPATIBLE_WIFI_CHANNEL_FOUND);
            bnsi b = f38896a.mo68387b();
            b.mo68432a("pdz", "a", 900, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("WiFi channels not supported: %s", Arrays.toString(iArr));
            this.f38944u.post(new pdn(this));
        } else {
            this.f38904H.mo22691a(this.f38938o, i, i2, 2, this.f38936m);
            mo22948a(dcm.NO_COMPATIBLE_WIFI_VERSION_FOUND);
            bnsi b2 = f38896a.mo68387b();
            b2.mo68432a("pdz", "a", 911, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68411a("HU version mismatch, requested major version: %d, phone using version: %d", i, 1);
            this.f38944u.post(new pcw(this));
        }
    }

    /* renamed from: a */
    private final void m30231a(bixf bixf) {
        if (bixf != null) {
            int a = biwy.m102920a(bixf.f122184d);
            if (a == 0) {
                a = 13;
            }
            int i = a - 12;
            if (i != -6) {
                if (i == -5) {
                    this.f38902F.mo22904b();
                    mo22948a(dcm.START_WIFI_REQUEST_FAILED_WIFI_DISABLED);
                } else if (i == -4) {
                    this.f38902F.mo22904b();
                    mo22948a(dcm.START_WIFI_REQUEST_FAILED_ALREADY_STARTED);
                } else if (i != 0) {
                    bnsi b = f38896a.mo68387b();
                    b.mo68432a("pdz", "a", 1578, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Unexpected Wifi Response Message");
                } else {
                    this.f38902F.mo22904b();
                    if (pcm.m30215d(bixf.f122182b)) {
                        this.f38931h = bixf.f122182b;
                        if ((bixf.f122181a & 2) != 0) {
                            this.f38932i = bixf.f122183c;
                        }
                        mo22948a(dcm.START_WIFI_REQUEST_SUCCESS);
                        mo22949a(this.f38931h, this.f38932i);
                        return;
                    }
                    mo22944a(9);
                }
            } else if (!this.f38898B || !this.f38902F.mo22903a()) {
                mo22948a(dcm.START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED);
                this.f38902F.mo22904b();
            }
        }
    }

    /* renamed from: a */
    private final void m30232a(dcm dcm, Bundle bundle) {
        this.f38948y.post(new pcz(this));
    }

    /* renamed from: a */
    public final ByteBuffer mo22942a(int i, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 4);
        allocate.putShort((short) length);
        allocate.putShort((short) i);
        allocate.put(bArr);
        return allocate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r0 = ((android.net.wifi.WifiManager) r7.f38929f.getApplicationContext().getSystemService("wifi")).createWifiLock(3, "Car wifi lock");
        r0.setReferenceCounted(false);
        r7.f38943t = r0;
        r7.f38948y = m30227a(r7.f38945v.getLooper());
        r7.f38949z = m30227a(r7.f38946w.getLooper());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        if (r7.f38900D == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r7.f38897A = m30227a(r7.f38947x.getLooper());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        r0 = new p000.pce(r7.f38929f, r7.f38944u, r7.f38948y, new p000.pdy(r7), r7.f38912P);
        r7.f38903G = r0;
        r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        if (r1 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0098, code lost:
        if (r1.isEnabled() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        r0.f38816f = new p000.pcd(r0);
        r1.getProfileProxy(r0.f38812b, r0.f38816f, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        r0 = new android.content.IntentFilter("android.net.wifi.supplicant.STATE_CHANGE");
        r0.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        r0.addAction("android.net.wifi.STATE_CHANGE");
        r0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        r0.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        r0.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        r0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        r7.f38929f.registerReceiver(r7.f38910N, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d5, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo22943a() {
        synchronized (this.f38925b) {
            if (dcm.IDLE.equals(this.f38927d) || dcm.SHUTDOWN.equals(this.f38927d)) {
                this.f38927d = dcm.IDLE;
            } else {
                bnsi b = f38896a.mo68387b();
                b.mo68432a("pdz", "a", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68420a("Not the right mostRecentSetupEvent to start: %s", this.f38927d);
            }
        }
    }

    /* renamed from: a */
    public final void mo22944a(int i) {
        bxvd da = biwz.f122147d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biwz biwz = (biwz) da.f164949b;
        biwz.f122150b = i - 12;
        biwz.f122149a |= 1;
        mo22947a(da.mo74062i(), 6);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22945a(BluetoothSocket bluetoothSocket) {
        bnsi b = f38896a.mo68387b();
        b.mo68432a("pdz", "a", 713, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68409a("failed to start Bluetooth connection after %d attempts", this.f38938o);
        if (this.f38938o >= 5 || !mo22961h()) {
            this.f38904H.mo22690a();
            mo22948a(dcm.RFCOMM_TIMED_OUT);
            this.f38944u.post(new pdj(this));
            return;
        }
        this.f38938o++;
        this.f38948y.postDelayed(new pdk(this, bluetoothSocket), 5000);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pcl.a(boolean, boolean, bixd, int, long):void
     arg types: [boolean, int, bixd, int, long]
     candidates:
      pcl.a(int, int, int, int, android.bluetooth.BluetoothDevice):void
      pcl.a(int, int, int, long, android.bluetooth.BluetoothDevice):void
      pcl.a(boolean, boolean, bixd, int, long):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0204, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo22946a(Intent intent) {
        char c;
        BluetoothSocket bluetoothSocket;
        String action = intent.getAction();
        bmxy.m108581a(action);
        switch (action.hashCode()) {
            case -1530327060:
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -343630553:
                if (action.equals("android.net.wifi.STATE_CHANGE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 233521600:
                if (action.equals("android.net.wifi.supplicant.STATE_CHANGE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 545516589:
                if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1244161670:
                if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1821585647:
                if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            WifiManager wifiManager = (WifiManager) this.f38929f.getSystemService("wifi");
            WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifiInfo");
            SupplicantState supplicantState = (SupplicantState) intent.getParcelableExtra("newState");
            if (wifiInfo == null && SupplicantState.COMPLETED.equals(supplicantState)) {
                wifiInfo = wifiManager.getConnectionInfo();
            }
            if (wifiInfo != null) {
                synchronized (this.f38925b) {
                    if (dcm.CONNECTING_WIFI.equals(this.f38927d)) {
                        this.f38944u.removeCallbacks(this.f38923aa);
                        if (pcm.m30212a(this.f38916T, pcm.m30206a(wifiInfo))) {
                            dcm dcm = dcm.CONNECTED_WIFI;
                            this.f38927d = dcm;
                            mo22948a(dcm);
                            mo22944a(12);
                            this.f38904H.mo22696a(this.f38942s, false, this.f38915S, wifiInfo.getFrequency(), SystemClock.elapsedRealtime() - this.f38941r);
                            this.f38943t.acquire();
                            mo22950a(this.f38931h, this.f38932i, wifiInfo);
                        } else {
                            wifiInfo.getSSID();
                            if (!this.f38930g) {
                                dcm dcm2 = dcm.CONNECTED_BT;
                                this.f38927d = dcm2;
                                mo22948a(dcm2);
                                mo22957d();
                            } else {
                                int i = this.f38914R;
                                if (i >= 3) {
                                    bnsi b = f38896a.mo68387b();
                                    b.mo68432a("pdz", "c", 517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    b.mo68405a("Failed to connect with provided wifi credentials");
                                    this.f38904H.mo22695a(this.f38942s, this.f38915S, ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                                    mo22944a(9);
                                    mo22948a(dcm.ABORTED_WIFI);
                                    dcm dcm3 = dcm.CONNECTED_BT;
                                    this.f38927d = dcm3;
                                    mo22948a(dcm3);
                                    if (this.f38939p) {
                                        mo22959f();
                                    }
                                } else {
                                    this.f38914R = i + 1;
                                    wifiManager.disconnect();
                                    wifiManager.enableNetwork(this.f38917U, true);
                                    wifiManager.reconnect();
                                }
                            }
                        }
                    }
                }
            }
        } else if (c == 2) {
            mo22948a(dcm.CONNECTION_LOST_BT);
            this.f38903G.mo22900a((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
        } else if (c == 3 || c == 4) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && intExtra == 2) {
                if (this.f38912P.mo22596a()) {
                    bluetoothDevice.getName();
                }
                this.f38948y.post(new pdg(this, bluetoothDevice));
                mo22948a(dcm.BT_HFP_A2DP_CONNECTED);
                pce pce = this.f38903G;
                pce.mo22901a(pce.f38818h);
            } else if (bluetoothDevice != null && intExtra == 0 && "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                pdx pdx = this.f38926c;
                if (pdx == null || (bluetoothSocket = pdx.f38890a) == null || !bluetoothSocket.isConnected() || !this.f38921Y) {
                    if (this.f38912P.mo22596a()) {
                        bluetoothDevice.getName();
                    }
                    this.f38948y.post(new pdh(this, bluetoothDevice));
                    this.f38903G.mo22900a(bluetoothDevice);
                } else if (!this.f38912P.mo22596a()) {
                }
            }
        } else if (c != 5) {
            bnsi b2 = f38896a.mo68387b();
            b2.mo68432a("pdz", "a", 445, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68420a("Received unknown intent action: %s", intent.getAction());
        } else {
            if (this.f38912P.mo22596a()) {
                intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            }
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 10) {
                mo22948a(dcm.DISCONNECTED_BT);
                mo22953b();
            }
        }
    }

    /* renamed from: a */
    public final void mo22947a(bxxc bxxc, int i) {
        synchronized (this.f38925b) {
            if (!dcm.SHUTDOWN.equals(this.f38927d)) {
                byte[] k = bxxc.mo73642k();
                int length = k.length;
                int i2 = length + 4;
                ByteBuffer a = mo22942a(i, k);
                boolean z = true;
                if (this.f38911O != null) {
                    Pair a2 = pcm.m30203a(a.array(), a.arrayOffset() + 2, length + 2);
                    if (a2 != null) {
                        a = mo22942a(((Integer) a2.first).intValue(), ((bxxc) a2.second).mo73642k());
                        i2 = a.limit();
                    } else {
                        z = false;
                    }
                }
                pdx pdx = this.f38926c;
                if (pdx != null) {
                    if (z) {
                        try {
                            pdx.f38891b.write(a.array(), a.arrayOffset(), i2);
                            pdx.f38891b.flush();
                        } catch (IOException e) {
                            bnsi b = f38896a.mo68387b();
                            b.mo68432a("pdx", "b", 1418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b.mo68405a("failure to write over Bluetooth");
                            pdx.f38893d.mo22948a(dcm.RFCOMM_WRITE_FAILURE);
                            pdx.f38893d.mo22960g();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo22948a(dcm dcm) {
        m30232a(dcm, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo22949a(String str, int i) {
        pcf pcf;
        String str2;
        otb otb = this.f38924ab;
        BluetoothDevice bluetoothDevice = this.f38936m;
        pbp pbp = new pbp(otb.f38374a.getApplicationContext());
        List a = pbp.mo22881a();
        pbp.close();
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                pcf = null;
                break;
            }
            CarInfoInternal carInfoInternal = (CarInfoInternal) it.next();
            if (carInfoInternal != null && (str2 = carInfoInternal.f29544f) != null && str2.equals(bluetoothDevice.getAddress())) {
                pcf = new pcf(carInfoInternal.f29545g, carInfoInternal.f29546h, carInfoInternal.f29547i, carInfoInternal.f29548j);
                break;
            }
        }
        if (pcf != null) {
            if (this.f38912P.mo22596a()) {
                this.f38936m.getName();
            }
            mo22951a(pcf.f38821a, pcf.f38822b, pcf.f38823c, pcm.m30204a(this.f38922Z, pcf.f38824d), str, i);
            return;
        }
        mo22957d();
    }

    /* renamed from: a */
    public final void mo22950a(String str, int i, WifiInfo wifiInfo) {
        mo22948a(dcm.PROJECTION_INITIATED);
        this.f38948y.post(new pdb(this, str, i, wifiInfo));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pcl.a(boolean, boolean, bixd, int, long):void
     arg types: [boolean, int, bixd, int, long]
     candidates:
      pcl.a(int, int, int, int, android.bluetooth.BluetoothDevice):void
      pcl.a(int, int, int, long, android.bluetooth.BluetoothDevice):void
      pcl.a(boolean, boolean, bixd, int, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
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
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0228, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo22951a(String str, String str2, String str3, bixd bixd, String str4, int i) {
        boolean z;
        int i2;
        String str5 = str;
        String str6 = str2;
        bixd bixd2 = bixd;
        if (!bixd2.equals(bixd.UNKNOWN_SECURITY_MODE)) {
            int i3 = bixd2.f122173k;
            if ((i3 & 7) != 0) {
                z = true;
            } else if ((i3 & 8) == 0) {
                z = true;
            }
            if (z) {
                mo22948a(dcm.WIFI_SECURITY_NOT_SUPPORTED);
            }
            if (!TextUtils.isEmpty(str) && ((str6 == null || pcm.m30214c(str2)) && !TextUtils.isEmpty(str3) && !z)) {
                synchronized (this.f38925b) {
                    WifiManager wifiManager = (WifiManager) this.f38929f.getApplicationContext().getSystemService("wifi");
                    if (wifiManager.getWifiState() == 3) {
                        this.f38904H.mo22693a(bpdh.WIFI_WAS_ENABLED);
                    } else {
                        this.f38904H.mo22693a(bpdh.WIFI_WAS_DISABLED);
                    }
                    if (wifiManager.getWifiState() == 1) {
                        if (this.f38920X) {
                            mo22948a(dcm.WIFI_AUTOMATICALLY_ENABLED);
                            if (wifiManager.setWifiEnabled(true)) {
                            }
                        } else {
                            int i4 = Build.VERSION.SDK_INT;
                        }
                        pcg pcg = pcg.WIFI_DISABLED;
                        if (this.f38919W) {
                            bxvd da = biwz.f122147d.mo74144da();
                            int i5 = pcg.f38828c;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            biwz biwz = (biwz) da.f164949b;
                            int i6 = i5 - 12;
                            if (i5 != 0) {
                                biwz.f122150b = i6;
                                biwz.f122149a |= 1;
                                String string = this.f38929f.getString(pcg.f38827b);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                biwz biwz2 = (biwz) da.f164949b;
                                string.getClass();
                                biwz2.f122149a |= 2;
                                biwz2.f122151c = string;
                                mo22947a(da.mo74062i(), 6);
                            } else {
                                throw null;
                            }
                        }
                        mo22948a(dcm.WIFI_DISABLED);
                        return;
                    }
                    if (!this.f38918V) {
                        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                        if (connectionInfo != null) {
                            if (connectionInfo.getNetworkId() >= 0 && pcm.m30212a(str5, connectionInfo.getSSID())) {
                                this.f38912P.mo22596a();
                                this.f38904H.mo22696a(this.f38942s, true, bixd, wifiManager.getConnectionInfo().getFrequency(), SystemClock.elapsedRealtime() - this.f38941r);
                                dcm dcm = dcm.CONNECTED_WIFI;
                                this.f38927d = dcm;
                                mo22948a(dcm);
                                mo22944a(12);
                                this.f38943t.acquire();
                                mo22950a(str4, i, wifiManager.getConnectionInfo());
                                return;
                            }
                        }
                    } else {
                        this.f38912P.mo22596a();
                    }
                    WifiConfiguration wifiConfiguration = new WifiConfiguration();
                    wifiConfiguration.BSSID = str6;
                    wifiConfiguration.SSID = pcm.m30213b(str);
                    wifiConfiguration.preSharedKey = pcm.m30213b(str3);
                    if ((bixd2.f122173k & 16) != 0) {
                        wifiConfiguration.allowedKeyManagement.set(2);
                    } else {
                        wifiConfiguration.allowedKeyManagement.set(1);
                    }
                    wifiConfiguration.allowedProtocols.set(1);
                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                    if (this.f38912P.mo22596a()) {
                        String str7 = wifiConfiguration.SSID;
                    }
                    this.f38939p = false;
                    if (wifiManager.getConfiguredNetworks() != null) {
                        Iterator<WifiConfiguration> it = wifiManager.getConfiguredNetworks().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            WifiConfiguration next = it.next();
                            if (next.SSID != null && pcm.m30212a(next.SSID, wifiConfiguration.SSID)) {
                                wifiConfiguration.networkId = next.networkId;
                                i2 = wifiManager.updateNetwork(wifiConfiguration);
                                if (i2 == -1) {
                                    bnsi b = f38896a.mo68387b();
                                    b.mo68432a("pdz", "a", 1094, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    b.mo68422a("Unable to update network: %s, %s", (Object) wifiConfiguration.SSID, wifiConfiguration.networkId);
                                    this.f38939p = true;
                                    i2 = next.networkId;
                                }
                            }
                        }
                    }
                    i2 = wifiManager.addNetwork(wifiConfiguration);
                    wifiManager.saveConfiguration();
                    this.f38917U = i2;
                    this.f38916T = str5;
                    this.f38915S = bixd2;
                    if (this.f38917U != -1) {
                        wifiManager.disconnect();
                        wifiManager.enableNetwork(this.f38917U, true);
                        dcm dcm2 = dcm.CONNECTING_WIFI;
                        this.f38927d = dcm2;
                        mo22948a(dcm2);
                        this.f38914R = 0;
                        wifiManager.reconnect();
                        this.f38944u.postDelayed(this.f38923aa, 25000);
                        return;
                    }
                    this.f38904H.mo22695a(this.f38942s, bixd2, 102);
                    mo22944a(10);
                    bnsi b2 = f38896a.mo68387b();
                    b2.mo68432a("pdz", "b", 1222, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68405a("failed to connect to network");
                    if (!this.f38930g) {
                        mo22957d();
                    }
                }
            } else {
                mo22944a(9);
            }
        }
        z = false;
        if (z) {
        }
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f38925b) {
            }
        }
        mo22944a(9);
    }

    /* renamed from: a */
    public final void mo22952a(boolean z) {
        synchronized (this.f38925b) {
            this.f38944u.removeCallbacks(this.f38909M, null);
            dcm dcm = this.f38927d;
            if (dcm != null) {
                if (dcm.mo8533a(dcm.CONNECTING_BT)) {
                    bnsi b = f38896a.mo68387b();
                    b.mo68432a("pdz", "a", 691, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Bluetooth device already connecting or connected");
                    return;
                }
            }
            dcm dcm2 = dcm.CONNECTING_BT;
            this.f38927d = dcm2;
            mo22948a(dcm2);
            this.f38912P.mo22596a();
            this.f38938o = 1;
            if (!z) {
                this.f38930g = false;
                this.f38948y.post(new pcy(this));
            }
            this.f38940q = SystemClock.elapsedRealtime();
            this.f38930g = false;
            this.f38948y.post(this.f38908L);
        }
    }
}
