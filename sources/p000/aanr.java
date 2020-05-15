package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.format.DateUtils;
import android.util.EventLog;
import android.util.Log;
import com.google.android.gms.gcm.GcmChimeraService;
import com.google.android.gms.gcm.GcmSenderChimeraProxy;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.net.ssl.SSLException;

/* renamed from: aanr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aanr implements aand {

    /* renamed from: A */
    private int f28597A;

    /* renamed from: B */
    private int f28598B;

    /* renamed from: C */
    private final aamg f28599C;

    /* renamed from: D */
    private final aakw f28600D;

    /* renamed from: E */
    private final aanm f28601E;

    /* renamed from: F */
    private final aamt f28602F;

    /* renamed from: G */
    private final aakl f28603G;

    /* renamed from: H */
    private final aarc f28604H;

    /* renamed from: I */
    private final long f28605I;

    /* renamed from: J */
    private int f28606J;

    /* renamed from: K */
    private String f28607K;

    /* renamed from: a */
    public final aans f28608a;

    /* renamed from: b */
    public final aanb f28609b;

    /* renamed from: c */
    public final Object f28610c = new Object();

    /* renamed from: d */
    public volatile boolean f28611d = false;

    /* renamed from: e */
    protected final List f28612e = new ArrayList();

    /* renamed from: f */
    public boolean f28613f = false;

    /* renamed from: g */
    protected long f28614g;

    /* renamed from: h */
    public final List f28615h = new ArrayList();

    /* renamed from: i */
    public int f28616i;

    /* renamed from: j */
    public int f28617j;

    /* renamed from: k */
    public int f28618k;

    /* renamed from: l */
    protected long f28619l;

    /* renamed from: m */
    public int f28620m;

    /* renamed from: n */
    public int f28621n;

    /* renamed from: o */
    public final Context f28622o;

    /* renamed from: p */
    public final aamc f28623p;

    /* renamed from: q */
    public final HeartbeatChimeraAlarm f28624q;

    /* renamed from: r */
    public final aajt f28625r;

    /* renamed from: s */
    public final aank f28626s;

    /* renamed from: t */
    public final asfb f28627t;

    /* renamed from: u */
    public volatile aabl f28628u;

    /* renamed from: v */
    protected int f28629v = 0;

    /* renamed from: w */
    private Socket f28630w;

    /* renamed from: x */
    private long f28631x;

    /* renamed from: y */
    private Thread f28632y;

    /* renamed from: z */
    private long f28633z;

    public aanr(Context context, aanb aanb, aamc aamc, HeartbeatChimeraAlarm heartbeatChimeraAlarm, aank aank, aajt aajt, aamg aamg, aakw aakw, aanm aanm, aamt aamt, aakl aakl, aarc aarc) {
        aans aans = new aans(new aanf());
        this.f28608a = aans;
        this.f28609b = aanb;
        this.f28623p = aamc;
        aans.mo17151a("mtalk.google.com");
        this.f28608a.mo17150a(-1);
        asfb asfb = new asfb(context, 1, "GCM_READ", null, "com.google.android.gms");
        this.f28627t = asfb;
        asfb.mo49115a(false);
        this.f28624q = heartbeatChimeraAlarm;
        heartbeatChimeraAlarm.f32812b = this;
        this.f28626s = aank;
        aank.f28564m = this;
        this.f28625r = aajt;
        aajt.f28313p = this;
        this.f28599C = aamg;
        this.f28612e.addAll(this.f28623p.mo17006c());
        this.f28600D = aakw;
        this.f28622o = context;
        this.f28601E = aanm;
        aanm.mo17136a(this);
        this.f28602F = aamt;
        this.f28603G = aakl;
        this.f28604H = aarc;
        this.f28605I = System.currentTimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r4.f28613f = false;
     */
    /* renamed from: k */
    private final void m21671k() {
        synchronized (this.f28610c) {
            if (this.f28611d) {
                this.f28608a.f28639f = true;
                this.f28611d = false;
                Thread thread = this.f28632y;
                if (thread != null) {
                    this.f28608a.f28637d = thread;
                    this.f28608a.f28635b = this.f28630w;
                    this.f28632y = null;
                    this.f28630w = null;
                }
            }
        }
    }

    /* renamed from: l */
    private final long m21672l() {
        long j = this.f28614g;
        if (j <= 0 || j <= this.f28631x) {
            return -1;
        }
        return System.currentTimeMillis() - this.f28614g;
    }

    /* renamed from: a */
    public final void mo17092a(boolean z) {
        this.f28608a.f28644k = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r13.f28640g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r13.f28635b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0.close();
        r13.f28635b = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014d  */
    /* renamed from: b */
    public final void mo17146b(aans aans, int i) {
        boolean z;
        aamv aamv;
        bxvd da;
        long e;
        if (aans.f28634a.f28532b != -1) {
            if (this.f28613f) {
                this.f28629v = i;
                this.f28619l = (System.currentTimeMillis() - this.f28614g) / 1000;
            }
            synchronized (this.f28610c) {
                if (aans.f28639f) {
                    aans.f28639f = false;
                } else {
                    return;
                }
            }
        } else {
            return;
        }
        this.f28631x = System.currentTimeMillis();
        synchronized (this.f28615h) {
            this.f28615h.clear();
        }
        if (aans.f28637d != null && aans.f28637d.isAlive() && aans.f28648o.isEmpty()) {
            aans.f28648o.add((blmm) blmn.f126862a.mo74144da());
        }
        if (aans.f28638e != null && aans.f28638e.isAlive() && !Thread.currentThread().equals(aans.f28638e)) {
            aans.f28638e.interrupt();
            try {
                aans.f28638e.join(1000);
            } catch (InterruptedException e2) {
            }
        }
        if (this.f28613f) {
            this.f28633z += mo17097e();
        }
        z = this.f28613f;
        HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.f28624q;
        heartbeatChimeraAlarm.mo19574f();
        heartbeatChimeraAlarm.mo19571c();
        aamv = heartbeatChimeraAlarm.f32818h;
        if (aamv != null && heartbeatChimeraAlarm.mo19569a(aamv) && !heartbeatChimeraAlarm.f32820j && (i == 6 || i == 21 || i == 28)) {
            aamv.mo17067a(2);
        }
        da = blml.f126850k.mo74144da();
        int i2 = aans.f28636c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blml blml = (blml) da.f164949b;
        int i3 = blml.f126852a | 4;
        blml.f126852a = i3;
        blml.f126855d = i2;
        int i4 = this.f28606J;
        int i5 = i3 | 8;
        blml.f126852a = i5;
        blml.f126856e = i4;
        long j = aans.f28641h;
        blml.f126852a = i5 | 16;
        blml.f126857f = j;
        long currentTimeMillis = System.currentTimeMillis() - this.f28605I;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blml blml2 = (blml) da.f164949b;
        int i6 = blml2.f126852a | 32;
        blml2.f126852a = i6;
        blml2.f126858g = currentTimeMillis;
        int i7 = i6 | 64;
        blml2.f126852a = i7;
        blml2.f126859h = i;
        if (!z) {
            blml2.f126853b = 3;
            int i8 = i7 | 1;
            blml2.f126852a = i8;
            long j2 = this.f28614g;
            long j3 = this.f28605I;
            blml2.f126852a = i8 | 128;
            blml2.f126860i = j2 - j3;
        } else {
            blml2.f126853b = 2;
            blml2.f126852a = i7 | 1;
        }
        this.f28602F.mo17063a(da);
        int i9 = aans.f28636c;
        aans.f28636c = -1;
        this.f28601E.mo17134a();
        this.f28626s.mo17117a(i, z);
        e = mo17097e();
        if (e <= 0) {
            aamy.m21596a(this.f28603G, i, i9, (int) (e / 1000));
        } else {
            aamy.m21595a(this.f28603G, i, i9);
        }
        this.f28622o.sendBroadcast(new Intent("com.google.android.gcm.DISCONNECTED"));
        if (this.f28613f) {
        }
        z = this.f28613f;
        HeartbeatChimeraAlarm heartbeatChimeraAlarm2 = this.f28624q;
        heartbeatChimeraAlarm2.mo19574f();
        heartbeatChimeraAlarm2.mo19571c();
        aamv = heartbeatChimeraAlarm2.f32818h;
        aamv.mo17067a(2);
        da = blml.f126850k.mo74144da();
        int i22 = aans.f28636c;
        if (da.f164950c) {
        }
        blml blml3 = (blml) da.f164949b;
        int i32 = blml3.f126852a | 4;
        blml3.f126852a = i32;
        blml3.f126855d = i22;
        int i42 = this.f28606J;
        int i52 = i32 | 8;
        blml3.f126852a = i52;
        blml3.f126856e = i42;
        long j4 = aans.f28641h;
        blml3.f126852a = i52 | 16;
        blml3.f126857f = j4;
        long currentTimeMillis2 = System.currentTimeMillis() - this.f28605I;
        if (da.f164950c) {
        }
        blml blml22 = (blml) da.f164949b;
        int i62 = blml22.f126852a | 32;
        blml22.f126852a = i62;
        blml22.f126858g = currentTimeMillis2;
        int i72 = i62 | 64;
        blml22.f126852a = i72;
        blml22.f126859h = i;
        if (!z) {
        }
        this.f28602F.mo17063a(da);
        int i92 = aans.f28636c;
        aans.f28636c = -1;
        this.f28601E.mo17134a();
        this.f28626s.mo17117a(i, z);
        e = mo17097e();
        if (e <= 0) {
        }
        this.f28622o.sendBroadcast(new Intent("com.google.android.gcm.DISCONNECTED"));
    }

    /* renamed from: c */
    public final String mo17095c() {
        WifiInfo connectionInfo;
        StringBuilder sb = new StringBuilder();
        sb.append("Server: ");
        aans aans = this.f28608a;
        if (!aans.f28640g || aans.f28635b == null) {
            if (aans.f28639f) {
                sb.append("Connecting");
            } else {
                sb.append("Not connected");
            }
            sb.append("\nHost: ");
            sb.append(this.f28608a.f28634a.f28531a);
            sb.append("\nPort: ");
            sb.append(this.f28608a.f28634a.f28532b);
            long j = this.f28614g;
            if (j > 0) {
                long j2 = this.f28619l;
                sb.append("\nTime disconnected: ");
                sb.append(DateUtils.formatElapsedTime((System.currentTimeMillis() - (j + (j2 * 1000))) / 1000));
            } else {
                sb.append("\nNo previous connection");
            }
            if (this.f28629v != 0) {
                sb.append("\nLast close code: ");
                int i = this.f28629v;
                String a = bydk.m124682a(i);
                if (i != 0) {
                    sb.append(a);
                } else {
                    throw null;
                }
            }
        } else {
            sb.append("Connected\nHost: ");
            sb.append(this.f28608a.f28635b.getInetAddress());
            sb.append("\nPort: ");
            sb.append(this.f28608a.f28635b.getPort());
            sb.append("\nTime connected: ");
            sb.append(DateUtils.formatElapsedTime(m21672l() / 1000));
            if (this.f28608a.f28636c == 1 && (connectionInfo = ((WifiManager) this.f28622o.getApplicationContext().getSystemService("wifi")).getConnectionInfo()) != null) {
                sb.append("\nSignalLevel: ");
                sb.append(WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5));
                sb.append(" / 4");
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public final boolean mo17096d() {
        return this.f28608a.f28640g || this.f28613f;
    }

    /* renamed from: e */
    public final long mo17097e() {
        if (!this.f28613f) {
            return -1;
        }
        long j = this.f28614g;
        if (j == 0) {
            return -1;
        }
        long j2 = this.f28631x;
        if (j <= j2) {
            return j2 - j;
        }
        return -1;
    }

    /* renamed from: f */
    public final InetAddress mo17098f() {
        Socket socket = this.f28608a.f28635b;
        if (socket != null) {
            return socket.getInetAddress();
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo17099g() {
        return this.f28608a.f28644k;
    }

    /* renamed from: h */
    public final boolean mo17100h() {
        return this.f28608a.f28645l;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ aans mo17101i() {
        return this.f28608a;
    }

    /* renamed from: j */
    public final void mo17148j() {
        this.f28627t.mo49120c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        aans aans = this.f28608a;
        if (aans.f28640g && aans.f28635b != null) {
            sb.append("connected=");
            sb.append(this.f28608a.f28635b.getInetAddress());
            sb.append(",port=");
            sb.append(this.f28608a.f28635b.getPort());
        } else if (aans.f28639f) {
            sb.append("connecting=");
            sb.append(this.f28608a.f28634a.f28531a);
            sb.append(":");
            sb.append(this.f28608a.f28634a.f28532b);
        } else {
            sb.append("pending=");
            sb.append(new Date(this.f28631x));
            sb.append(",host=");
            sb.append(this.f28608a.f28634a.f28531a);
            sb.append(":");
            sb.append(this.f28608a.f28634a.f28532b);
        }
        sb.append("\nstreamId=");
        sb.append(this.f28608a.f28650q);
        sb.append("/");
        sb.append(this.f28608a.f28651r);
        int i = this.f28616i;
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append(",connects=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.f28617j;
        StringBuilder sb3 = new StringBuilder(28);
        sb3.append(",connectAttempts=");
        sb3.append(i2);
        sb.append(sb3.toString());
        int i3 = this.f28618k;
        StringBuilder sb4 = new StringBuilder(25);
        sb4.append(",failedLogins=");
        sb4.append(i3);
        sb.append(sb4.toString());
        long j = this.f28619l;
        StringBuilder sb5 = new StringBuilder(45);
        sb5.append(",lastConnectionDurationS=");
        sb5.append(j);
        sb.append(sb5.toString());
        int i4 = this.f28629v;
        if (i4 != 0) {
            String a = bydk.m124682a(i4);
            sb.append(a.length() == 0 ? new String(",lastConnectionErrorCode=") : ",lastConnectionErrorCode=".concat(a));
        }
        int i5 = this.f28620m;
        int i6 = this.f28597A;
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append(",packets=");
        sb6.append(i5);
        sb6.append("/");
        sb6.append(i6);
        sb.append(sb6.toString());
        int i7 = this.f28621n;
        int i8 = this.f28598B;
        StringBuilder sb7 = new StringBuilder(30);
        sb7.append(",bytes=");
        sb7.append(i7);
        sb7.append("/");
        sb7.append(i8);
        sb.append(sb7.toString());
        aans aans2 = this.f28608a;
        if (!aans2.f28640g || aans2.f28635b == null) {
            String formatElapsedTime = DateUtils.formatElapsedTime((System.currentTimeMillis() - this.f28631x) / 1000);
            String formatElapsedTime2 = DateUtils.formatElapsedTime(this.f28633z / 1000);
            StringBuilder sb8 = new StringBuilder(String.valueOf(formatElapsedTime).length() + 17 + String.valueOf(formatElapsedTime2).length());
            sb8.append("\ndisconnectTime=");
            sb8.append(formatElapsedTime);
            sb8.append("/");
            sb8.append(formatElapsedTime2);
            sb.append(sb8.toString());
            String valueOf = String.valueOf(new Date(this.f28631x));
            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb9.append("\nlostConnection=");
            sb9.append(valueOf);
            sb.append(sb9.toString());
        } else {
            String formatElapsedTime3 = DateUtils.formatElapsedTime(m21672l() / 1000);
            String formatElapsedTime4 = DateUtils.formatElapsedTime(this.f28633z / 1000);
            StringBuilder sb10 = new StringBuilder(String.valueOf(formatElapsedTime3).length() + 14 + String.valueOf(formatElapsedTime4).length());
            sb10.append("\nconnectTime=");
            sb10.append(formatElapsedTime3);
            sb10.append("/");
            sb10.append(formatElapsedTime4);
            sb.append(sb10.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    protected static final void m21665a(aans aans) {
        blmy blmy = (blmy) blna.f126922g.mo74144da();
        if (blmy.f164950c) {
            blmy.mo74035c();
            blmy.f164950c = false;
        }
        blna blna = (blna) blmy.f164949b;
        blna.f126925b = 1;
        int i = blna.f126924a | 2;
        blna.f126924a = i;
        "".getClass();
        blna.f126924a = i | 4;
        blna.f126926c = "";
        bxvd da = blmr.f126891d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blmr blmr = (blmr) da.f164949b;
        int i2 = 1 | blmr.f126893a;
        blmr.f126893a = i2;
        blmr.f126894b = 13;
        "".getClass();
        blmr.f126893a = i2 | 2;
        blmr.f126895c = "";
        if (blmy.f164950c) {
            blmy.mo74035c();
            blmy.f164950c = false;
        }
        blna blna2 = (blna) blmy.f164949b;
        blmr blmr2 = (blmr) da.mo74062i();
        blmr2.getClass();
        blna2.f126927d = blmr2;
        blna2.f126924a |= 64;
        m21668a(aans, blmy);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = r0.f28630w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* renamed from: a */
    private final void m21666a(aans aans, int i, boolean z) {
        if (!z || !this.f28611d) {
            mo17146b(aans, i);
            return;
        }
        synchronized (this.f28610c) {
            if (this.f28611d) {
                this.f28611d = false;
                this.f28632y = null;
            } else {
                return;
            }
        }
        this.f28630w = null;
    }

    /* renamed from: a */
    private final synchronized void m21667a(aans aans, bxuk bxuk, bxxb bxxb) {
        boolean z = bxxb instanceof blmo;
        ArrayList arrayList = null;
        String str = z ? ((blmp) ((blmo) bxxb).f164949b).f126873h : null;
        aans.f28651r++;
        if (!bmxx.m108577a(str)) {
            aanc aanc = new aanc(aans.f28651r, str);
            synchronized (aans.f28646m) {
                aans.f28646m.add(aanc);
            }
        }
        synchronized (this.f28612e) {
            if (this.f28612e.size() > 0) {
                arrayList = new ArrayList(this.f28612e);
                this.f28612e.clear();
            }
        }
        synchronized (aans.f28647n) {
            if (arrayList != null) {
                aans.f28647n.put(Integer.valueOf(aans.f28651r), arrayList);
            }
        }
        synchronized (aans.f28646m) {
            int i = aans.f28650q;
            if (i > aans.f28649p) {
                if (bxxb instanceof blmy) {
                    blmy blmy = (blmy) bxxb;
                    if (blmy.f164950c) {
                        blmy.mo74035c();
                        blmy.f164950c = false;
                    }
                    blna blna = (blna) blmy.f164949b;
                    blna blna2 = blna.f126922g;
                    blna.f126924a |= 512;
                    blna.f126928e = i;
                } else if (bxxb instanceof blmv) {
                    blmv blmv = (blmv) bxxb;
                    if (blmv.f164950c) {
                        blmv.mo74035c();
                        blmv.f164950c = false;
                    }
                    blmw blmw = (blmw) blmv.f164949b;
                    blmw blmw2 = blmw.f126907e;
                    blmw.f126909a |= 2;
                    blmw.f126910b = i;
                } else if (bxxb instanceof blms) {
                    blms blms = (blms) bxxb;
                    if (blms.f164950c) {
                        blms.mo74035c();
                        blms.f164950c = false;
                    }
                    blmt blmt = (blmt) blms.f164949b;
                    blmt blmt2 = blmt.f126897e;
                    blmt.f126899a |= 2;
                    blmt.f126900b = i;
                } else if (z) {
                    blmo blmo = (blmo) bxxb;
                    if (blmo.f164950c) {
                        blmo.mo74035c();
                        blmo.f164950c = false;
                    }
                    blmp blmp = (blmp) blmo.f164949b;
                    blmp blmp2 = blmp.f126864r;
                    blmp.f126866a |= 512;
                    blmp.f126874i = i;
                }
                aans.f28649p = aans.f28650q;
            }
        }
        long j = !aame.m21503a(this.f28622o) ? 0 : 8;
        if (bxxb instanceof blmy) {
            blmy blmy2 = (blmy) bxxb;
            if (blmy2.f164950c) {
                blmy2.mo74035c();
                blmy2.f164950c = false;
            }
            blna blna3 = (blna) blmy2.f164949b;
            blna blna4 = blna.f126922g;
            blna3.f126924a |= 2048;
            blna3.f126929f = j;
        } else if (bxxb instanceof blnc) {
            blnc blnc = (blnc) bxxb;
            if (blnc.f164950c) {
                blnc.mo74035c();
                blnc.f164950c = false;
            }
            blnf blnf = (blnf) blnc.f164949b;
            blnf blnf2 = blnf.f126936z;
            blnf.f126938a |= 8192;
            blnf.f126952o = j;
        } else if (bxxb instanceof blmv) {
            blmv blmv2 = (blmv) bxxb;
            if (blmv2.f164950c) {
                blmv2.mo74035c();
                blmv2.f164950c = false;
            }
            blmw blmw3 = (blmw) blmv2.f164949b;
            blmw blmw4 = blmw.f126907e;
            blmw3.f126909a |= 4;
            blmw3.f126911c = j;
        } else if (bxxb instanceof blms) {
            blms blms2 = (blms) bxxb;
            if (blms2.f164950c) {
                blms2.mo74035c();
                blms2.f164950c = false;
            }
            blmt blmt3 = (blmt) blms2.f164949b;
            blmt blmt4 = blmt.f126897e;
            blmt3.f126899a |= 4;
            blmt3.f126901c = j;
        } else if (z) {
            blmo blmo2 = (blmo) bxxb;
            if (blmo2.f164950c) {
                blmo2.mo74035c();
                blmo2.f164950c = false;
            }
            blmp blmp3 = (blmp) blmo2.f164949b;
            blmp blmp4 = blmp.f126864r;
            blmp3.f126866a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            blmp3.f126879n = j;
        }
        if (z) {
            blmo blmo3 = (blmo) bxxb;
            if ((((blmp) blmo3.f164949b).f126866a & 4) == 0) {
                if (blmo3.f164950c) {
                    blmo3.mo74035c();
                    blmo3.f164950c = false;
                }
                blmp blmp5 = (blmp) blmo3.f164949b;
                blmp blmp6 = blmp.f126864r;
                "".getClass();
                blmp5.f126866a |= 4;
                blmp5.f126868c = "";
            }
            if ((((blmp) blmo3.f164949b).f126866a & 16) == 0) {
                if (blmo3.f164950c) {
                    blmo3.mo74035c();
                    blmo3.f164950c = false;
                }
                blmp blmp7 = (blmp) blmo3.f164949b;
                blmp blmp8 = blmp.f126864r;
                "".getClass();
                blmp7.f126866a |= 16;
                blmp7.f126870e = "";
            }
        }
        bxxc i2 = bxxb.mo74062i();
        byte a = aane.m21624a(i2);
        int db = i2.mo74145db();
        bxuk.mo73843b(a);
        bxuk.mo73855d(db);
        i2.mo73644a(bxuk);
        bxuk.mo73851c();
        this.f28598B += db;
        this.f28597A++;
        aamy.m21597a(bxxb);
        if (z) {
            GcmSenderChimeraProxy.m24315a();
        }
        if (!aytw.m84813a(this.f28622o) && !this.f28626s.mo17128e()) {
            Context context = this.f28622o;
            if (aebw.m51603a()) {
                aebw.m51602a(context, aapx.CLOUD_MESSAGE_SENT);
            } else {
                aphm.m70303b();
            }
        }
        HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.f28624q;
        heartbeatChimeraAlarm.f32822l = SystemClock.elapsedRealtime();
        if (cedc.f182364a.mo6606a().mo78868i() && heartbeatChimeraAlarm.f32812b.mo17100h() && !heartbeatChimeraAlarm.f32812b.mo17099g()) {
            heartbeatChimeraAlarm.f32815e.mo17056a(heartbeatChimeraAlarm.mo19567a());
        }
        aamy.m21599a(true, aane.m21624a(i2), i2, aans.f28650q, aans.f28651r);
    }

    /* renamed from: b */
    public final void mo17147b(aans aans, boolean z, aanh aanh) {
        Thread thread = new Thread(new aanp(this, aans, z, aanh), "GCMWriter");
        if (z) {
            this.f28632y = thread;
        } else {
            aans.f28637d = thread;
        }
        thread.start();
    }

    /* renamed from: b */
    public final boolean mo17094b() {
        return this.f28608a.f28639f && this.f28608a.f28640g;
    }

    /* renamed from: a */
    public static final void m21668a(aans aans, bxxb bxxb) {
        synchronized (aans.f28648o) {
            aans.f28648o.add(bxxb);
        }
    }

    /* renamed from: a */
    private static void m21669a(blnc blnc, String str, long j) {
        m21670a(blnc, str, Long.toString(j));
    }

    /* renamed from: a */
    private static void m21670a(blnc blnc, String str, String str2) {
        bxvd da = blni.f126975d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blni blni = (blni) da.f164949b;
        str.getClass();
        int i = blni.f126977a | 1;
        blni.f126977a = i;
        blni.f126978b = str;
        str2.getClass();
        blni.f126977a = i | 2;
        blni.f126979c = str2;
        if (blnc.f164950c) {
            blnc.mo74035c();
            blnc.f164950c = false;
        }
        blnf blnf = (blnf) blnc.f164949b;
        blni blni2 = (blni) da.mo74062i();
        blnf blnf2 = blnf.f126936z;
        blni2.getClass();
        if (!blnf.f126945h.mo73666a()) {
            blnf.f126945h = GeneratedMessageLite.m124021a(blnf.f126945h);
        }
        blnf.f126945h.add(blni2);
    }

    /* renamed from: a */
    public final void mo17088a(int i) {
        new Thread(new aanq(this, i)).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        mo17142a(r3.f28608a, r4);
        mo17147b(r3.f28608a, false, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo17089a(aanf aanf, aanh aanh) {
        synchronized (this.f28610c) {
            if (this.f28608a.f28639f) {
                return;
            }
            if (!this.f28611d) {
                this.f28608a.f28639f = true;
                if (aanf != null) {
                    this.f28608a.f28634a = aanf;
                }
            } else {
                m21671k();
            }
        }
    }

    /* renamed from: a */
    public final void mo17141a(aans aans, int i) {
        if (i != -1) {
            ArrayList arrayList = new ArrayList();
            synchronized (aans.f28646m) {
                Iterator it = aans.f28646m.iterator();
                while (it.hasNext()) {
                    aanc aanc = (aanc) it.next();
                    if (i < aanc.f28529a) {
                        break;
                    }
                    if (!bmxx.m108577a(aanc.f28530b)) {
                        arrayList.add(aanc.f28530b);
                    }
                    it.remove();
                }
            }
            mo17143a(aans, arrayList);
            ArrayList arrayList2 = new ArrayList();
            synchronized (aans.f28647n) {
                Iterator it2 = aans.f28647n.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        break;
                    }
                    arrayList2.addAll((Collection) entry.getValue());
                    it2.remove();
                }
            }
            if (!arrayList2.isEmpty()) {
                this.f28623p.mo16997a("s2dRmqIds", arrayList2);
            }
        }
    }

    /* renamed from: a */
    public final void mo17142a(aans aans, aanf aanf) {
        aans.f28641h = System.currentTimeMillis() - this.f28605I;
        if (aanf == null) {
            aans.f28636c = this.f28626s.mo17131h();
            aanf aanf2 = aans.f28634a;
            this.f28606J = aanf2.f28532b;
            aanf2.f28533c = this.f28626s.f28554c.mo17085b();
            return;
        }
        this.f28606J = aanf.f28532b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17143a(aans aans, List list) {
        this.f28623p.mo17001a(new aann(this, list));
        int a = this.f28623p.mo16998a(list);
        int I = (int) cecz.f182285a.mo6606a().mo78790I();
        if (I > 0 && a >= I) {
            m21665a(aans);
        }
        this.f28626s.mo17126c(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06db, code lost:
        m21666a(r2, 10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x06e0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x06da A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:5:0x0018] */
    /* renamed from: a */
    public final void mo17144a(aans aans, boolean z, aanh aanh) {
        aanb aanb;
        String str;
        int i;
        InetAddress[] allByName;
        InetAddress inetAddress;
        aana aana;
        int i2;
        boolean z2;
        blji a;
        Throwable th;
        int i3;
        String networkOperator;
        aans aans2 = aans;
        boolean z3 = z;
        aanh aanh2 = aanh;
        if (!z3) {
            this.f28613f = false;
        }
        int i4 = 1;
        this.f28617j++;
        if (aanh2 == null) {
            try {
                aans2.f28636c = this.f28626s.mo17131h();
            } catch (IOException e) {
                IOException iOException = e;
                boolean z4 = inetAddress instanceof Inet4Address;
                while (i4 < allByName.length) {
                    InetAddress inetAddress2 = allByName[i4];
                    if (!z4) {
                        if (!(inetAddress2 instanceof Inet4Address)) {
                            i4++;
                        }
                    } else if (!(inetAddress2 instanceof Inet6Address)) {
                        i4++;
                    }
                    GcmChimeraService.m24303a("Failed to connect to %s, trying %s", inetAddress, inetAddress2);
                    aana = aanb.mo17087a(new InetSocketAddress(inetAddress2, i), str, aanh2);
                }
                throw iOException;
            } catch (Exception e2) {
            } catch (UnknownHostException e3) {
                m21666a(aans2, 3, z3);
                return;
            } catch (NoRouteToHostException e4) {
                m21666a(aans2, 22, z3);
                return;
            } catch (PortUnreachableException e5) {
                m21666a(aans2, 23, z3);
                return;
            } catch (SocketTimeoutException e6) {
                m21666a(aans2, 24, z3);
                return;
            } catch (ConnectException e7) {
                m21666a(aans2, 25, z3);
                return;
            } catch (SSLException e8) {
                m21666a(aans2, 26, z3);
                return;
            } catch (IOException e9) {
                m21666a(aans2, 16, z3);
                return;
            }
        } else {
            aans2.f28636c = 0;
        }
        aanb = this.f28609b;
        aanf aanf = aans2.f28634a;
        str = aanf.f28531a;
        i = aanf.f28532b;
        allByName = InetAddress.getAllByName(str);
        if (allByName.length != 0) {
            inetAddress = allByName[0];
            aana = aanb.mo17087a(new InetSocketAddress(inetAddress, i), str, aanh2);
            aans2.f28645l = aana.f28520b;
            if (z3) {
                this.f28630w = aana.f28519a;
            } else {
                aans2.f28635b = aana.f28519a;
            }
            if (z3) {
                if (!Thread.currentThread().equals(this.f28608a.f28637d)) {
                    mo17146b(this.f28608a, 27);
                    if (this.f28608a.f28637d.isAlive()) {
                        try {
                            this.f28608a.f28637d.join(1000);
                        } catch (InterruptedException e10) {
                        }
                    }
                }
                m21671k();
            }
            aans2.f28648o.clear();
            try {
                bxuk a2 = bxuk.m123634a(aans2.f28635b.getOutputStream());
                bxuc a3 = bxuc.m123416a(aans2.f28635b.getInputStream());
                a2.mo73872g(39);
                aans2.f28649p = 0;
                aans2.f28650q = 1;
                aans2.f28651r = 0;
                synchronized (aans2.f28646m) {
                    aans2.f28646m.clear();
                }
                synchronized (aans2.f28647n) {
                    for (List list : aans2.f28647n.values()) {
                        this.f28612e.addAll(list);
                    }
                    aans2.f28647n.clear();
                }
                blnc blnc = (blnc) blnf.f126936z.mo74144da();
                if (blnc.f164950c) {
                    blnc.mo74035c();
                    blnc.f164950c = false;
                }
                blnf blnf = (blnf) blnc.f164949b;
                "".getClass();
                int i5 = blnf.f126938a | 1;
                blnf.f126938a = i5;
                blnf.f126939b = "";
                "mcs.android.com".getClass();
                blnf.f126938a = i5 | 2;
                blnf.f126940c = "mcs.android.com";
                if (!aytw.m84813a(this.f28622o)) {
                    String b = this.f28600D.mo16954b();
                    String c = this.f28600D.mo16955c();
                    if (b != null) {
                        if (blnc.f164950c) {
                            blnc.mo74035c();
                            blnc.f164950c = false;
                        }
                        blnf blnf2 = (blnf) blnc.f164949b;
                        b.getClass();
                        blnf2.f126938a |= 8;
                        blnf2.f126942e = b;
                        try {
                            String valueOf = String.valueOf(Long.toHexString(Long.parseLong(b)));
                            String str2 = valueOf.length() == 0 ? new String("android-") : "android-".concat(valueOf);
                            if (blnc.f164950c) {
                                blnc.mo74035c();
                                blnc.f164950c = false;
                            }
                            blnf blnf3 = (blnf) blnc.f164949b;
                            str2.getClass();
                            blnf3.f126938a |= 32;
                            blnf3.f126944g = str2;
                        } catch (Exception e11) {
                        }
                        if (blnc.f164950c) {
                            blnc.mo74035c();
                            blnc.f164950c = false;
                        }
                        blnf blnf4 = (blnf) blnc.f164949b;
                        b.getClass();
                        int i6 = blnf4.f126938a | 4;
                        blnf4.f126938a = i6;
                        blnf4.f126941d = b;
                        c.getClass();
                        blnf4.f126938a = i6 | 16;
                        blnf4.f126943f = c;
                    } else {
                        if (blnc.f164950c) {
                            blnc.mo74035c();
                            blnc.f164950c = false;
                        }
                        blnf blnf5 = (blnf) blnc.f164949b;
                        "".getClass();
                        int i7 = blnf5.f126938a | 4;
                        blnf5.f126938a = i7;
                        blnf5.f126941d = "";
                        "".getClass();
                        int i8 = i7 | 32;
                        blnf5.f126938a = i8;
                        blnf5.f126944g = "";
                        "".getClass();
                        blnf5.f126938a = i8 | 16;
                        blnf5.f126943f = "";
                    }
                    blnf blnf6 = (blnf) blnc.f164949b;
                    blnf6.f126950m = 2;
                    blnf6.f126938a |= 2048;
                } else {
                    sdo.m34970a(ceck.m135995e());
                    if (blnc.f164950c) {
                        blnc.mo74035c();
                        blnc.f164950c = false;
                    }
                    blnf blnf7 = (blnf) blnc.f164949b;
                    "".getClass();
                    int i9 = blnf7.f126938a | 8;
                    blnf7.f126938a = i9;
                    blnf7.f126942e = "";
                    "".getClass();
                    blnf7.f126938a = i9 | 4;
                    blnf7.f126941d = "";
                    Context context = this.f28622o;
                    aytw.m84814b();
                    String string = ceck.m135995e() ? aaoe.m21748d(context).getString("gcm_local_directboot_token", null) : null;
                    if (blnc.f164950c) {
                        blnc.mo74035c();
                        blnc.f164950c = false;
                    }
                    blnf blnf8 = (blnf) blnc.f164949b;
                    string.getClass();
                    int i10 = blnf8.f126938a | 16;
                    blnf8.f126938a = i10;
                    blnf8.f126943f = string;
                    blnf8.f126950m = 3;
                    blnf8.f126938a = i10 | 2048;
                }
                blnf blnf9 = (blnf) blnc.f164949b;
                int i11 = blnf9.f126938a | 1024;
                blnf9.f126938a = i11;
                blnf9.f126949l = 1;
                blnf9.f126938a = i11 | 512;
                blnf9.f126948k = true;
                int i12 = this.f28629v;
                if (i12 != 0) {
                    m21669a(blnc, "ERR", (long) i12);
                }
                long j = this.f28619l;
                if (j > 0) {
                    m21669a(blnc, "CT", j);
                }
                int i13 = this.f28618k;
                if (i13 > 0) {
                    m21669a(blnc, "CONERR", (long) i13);
                }
                m21669a(blnc, "CONOK", (long) this.f28616i);
                for (String str3 : this.f28612e) {
                    if (blnc.f164950c) {
                        blnc.mo74035c();
                        blnc.f164950c = false;
                    }
                    blnf blnf10 = (blnf) blnc.f164949b;
                    str3.getClass();
                    if (!blnf10.f126946i.mo73666a()) {
                        blnf10.f126946i = GeneratedMessageLite.m124021a(blnf10.f126946i);
                    }
                    blnf10.f126946i.add(str3);
                }
                this.f28623p.mo16999a();
                if (blnc.f164950c) {
                    blnc.mo74035c();
                    blnc.f164950c = false;
                }
                blnf blnf11 = (blnf) blnc.f164949b;
                "gms-20.15.15-000".getClass();
                int i14 = blnf11.f126938a | 1;
                blnf11.f126938a = i14;
                blnf11.f126939b = "gms-20.15.15-000";
                int i15 = aans2.f28636c;
                blnf11.f126938a = i14 | 4096;
                blnf11.f126951n = i15;
                if (aytw.m84815b(this.f28622o)) {
                    String a4 = aakw.m21414a(this.f28622o);
                    if (blnc.f164950c) {
                        blnc.mo74035c();
                        blnc.f164950c = false;
                    }
                    blnf blnf12 = (blnf) blnc.f164949b;
                    a4.getClass();
                    blnf12.f126938a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    blnf12.f126953p = a4;
                }
                boolean a5 = aamz.m21600a(aans2.f28634a.f28533c);
                if (blnc.f164950c) {
                    blnc.mo74035c();
                    blnc.f164950c = false;
                }
                blnf blnf13 = (blnf) blnc.f164949b;
                int i16 = blnf13.f126938a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                blnf13.f126938a = i16;
                blnf13.f126956s = a5;
                if (a5) {
                    int i17 = aans2.f28634a.f28533c;
                    int i18 = i17 - 1;
                    if (i17 != 0) {
                        blnf13.f126959v = i18;
                        blnf13.f126938a = 1048576 | i16;
                    } else {
                        throw null;
                    }
                }
                if (cecz.f182285a.mo6606a().mo78815ag()) {
                    int nextInt = new Random().nextInt();
                    if (blnc.f164950c) {
                        blnc.mo74035c();
                        blnc.f164950c = false;
                    }
                    blnf blnf14 = (blnf) blnc.f164949b;
                    blnf14.f126938a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    blnf14.f126958u = nextInt;
                    this.f28601E.mo17135a(nextInt);
                }
                int i19 = Build.VERSION.SDK_INT;
                StringBuilder sb = new StringBuilder(19);
                sb.append("android-");
                sb.append(i19);
                m21670a(blnc, "os_ver", sb.toString());
                if (aans2.f28636c == 0) {
                    switch (((TelephonyManager) this.f28622o.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            i3 = 2;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i3 = 3;
                            break;
                        case 13:
                        case 18:
                            i3 = 4;
                            break;
                        default:
                            i3 = 1;
                            break;
                    }
                    if (i3 != 1) {
                        if (blnc.f164950c) {
                            blnc.mo74035c();
                            blnc.f164950c = false;
                        }
                        blnf blnf15 = (blnf) blnc.f164949b;
                        blnf15.f126961x = i3 - 1;
                        blnf15.f126938a |= 4194304;
                    }
                    if (cedi.f182388a.mo6606a().mo78882a() && (networkOperator = ((TelephonyManager) this.f28622o.getSystemService("phone")).getNetworkOperator()) != null) {
                        try {
                            int parseInt = Integer.parseInt(networkOperator);
                            if (blnc.f164950c) {
                                blnc.mo74035c();
                                blnc.f164950c = false;
                            }
                            blnf blnf16 = (blnf) blnc.f164949b;
                            blnf16.f126938a |= 2097152;
                            blnf16.f126960w = parseInt;
                        } catch (NumberFormatException e12) {
                            if (networkOperator.length() == 0) {
                                new String("Unable to parse MCC-MNC code: ");
                            } else {
                                "Unable to parse MCC-MNC code: ".concat(networkOperator);
                            }
                        }
                    }
                }
                if (cecz.m136058f()) {
                    List a6 = this.f28604H.mo17203a();
                    if (blnc.f164950c) {
                        blnc.mo74035c();
                        blnc.f164950c = false;
                    }
                    blnf blnf17 = (blnf) blnc.f164949b;
                    if (!blnf17.f126962y.mo73666a()) {
                        blnf17.f126962y = GeneratedMessageLite.m124021a(blnf17.f126962y);
                    }
                    bxsy.m123078a(a6, blnf17.f126962y);
                }
                if (this.f28599C != null) {
                    C1245ok okVar = new C1245ok();
                    this.f28599C.mo17014a(okVar, -1);
                    for (int i20 = 0; i20 < okVar.f26809h; i20++) {
                        m21670a(blnc, (String) okVar.mo15620b(i20), (String) okVar.mo15621c(i20));
                    }
                }
                if (this.f28626s.f28568q > 0) {
                    m21669a(blnc, "networkOn", (System.currentTimeMillis() - this.f28626s.f28568q) / 1000);
                }
                if (this.f28626s.f28569r > 0) {
                    m21669a(blnc, "networkOff", (System.currentTimeMillis() - this.f28626s.f28569r) / 1000);
                }
                if (!this.f28626s.mo17130g()) {
                    m21670a(blnc, "networkAvailability", Boolean.toString(false));
                }
                long j2 = this.f28605I;
                if (blnc.f164950c) {
                    blnc.mo74035c();
                    blnc.f164950c = false;
                }
                blnf blnf18 = (blnf) blnc.f164949b;
                blnf18.f126938a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                blnf18.f126954q = j2;
                if (cecz.m136064l() > 0) {
                    this.f28602F.mo17062a(blnc);
                    bxvd da = blml.f126850k.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    blml blml = (blml) da.f164949b;
                    blml.f126853b = 3;
                    int i21 = blml.f126852a | 1;
                    blml.f126852a = i21;
                    int i22 = aans2.f28636c;
                    int i23 = i21 | 4;
                    blml.f126852a = i23;
                    blml.f126855d = i22;
                    int i24 = this.f28606J;
                    int i25 = i23 | 8;
                    blml.f126852a = i25;
                    blml.f126856e = i24;
                    long j3 = aans2.f28641h;
                    blml.f126852a = i25 | 16;
                    blml.f126857f = j3;
                    blnc.mo66685a(da);
                }
                String str4 = this.f28607K;
                if (str4 != null) {
                    m21670a(blnc, "cookie", str4);
                }
                aamc aamc = this.f28623p;
                aamc.mo16999a();
                synchronized (aamc.f28441d) {
                    i2 = ((C1245ok) aamc.f28442e).f26809h;
                }
                if (i2 <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (blnc.f164950c) {
                    blnc.mo74035c();
                    blnc.f164950c = false;
                }
                blnf blnf19 = (blnf) blnc.f164949b;
                blnf19.f126938a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                blnf19.f126957t = z2;
                HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.f28624q;
                int b2 = (int) heartbeatChimeraAlarm.mo19570b();
                bxvd da2 = blmx.f126913f.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blmx blmx = (blmx) da2.f164949b;
                "".getClass();
                int i26 = blmx.f126915a | 1;
                blmx.f126915a = i26;
                blmx.f126916b = "";
                int i27 = i26 | 2;
                blmx.f126915a = i27;
                blmx.f126917c = false;
                blmx.f126915a = i27 | 4;
                blmx.f126918d = b2;
                boolean g = heartbeatChimeraAlarm.mo19575g();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blmx blmx2 = (blmx) da2.f164949b;
                blmx2.f126915a |= 8;
                blmx2.f126919e = g;
                heartbeatChimeraAlarm.f32819i = b2;
                if (blnc.f164950c) {
                    blnc.mo74035c();
                    blnc.f164950c = false;
                }
                blnf blnf20 = (blnf) blnc.f164949b;
                blmx blmx3 = (blmx) da2.mo74062i();
                blmx3.getClass();
                blnf20.f126947j = blmx3;
                blnf20.f126938a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                heartbeatChimeraAlarm.f32820j = false;
                heartbeatChimeraAlarm.f32812b.mo17092a(false);
                synchronized (aans2.f28648o) {
                    aans2.f28648o.clear();
                    mo17091a(blnc);
                }
                Thread thread = new Thread(new aano(this, aans2, a3), "GCMReader");
                thread.start();
                aans2.f28638e = thread;
                while (aans2.f28639f) {
                    try {
                        bxxb bxxb = (bxxb) aans2.f28648o.take();
                        a = aabl.m21058a(this.f28628u, "writeMessage");
                        if (bxxb instanceof blnc) {
                            aans2.f28642i = false;
                        } else if (aans2.f28642i) {
                            aans2.f28642i = false;
                            blmv blmv = (blmv) blmw.f126907e.mo74144da();
                            int e13 = this.f28624q.mo19573e();
                            if (e13 != -1) {
                                if (blmv.f164950c) {
                                    blmv.mo74035c();
                                    blmv.f164950c = false;
                                }
                                blmw blmw = (blmw) blmv.f164949b;
                                blmw.f126909a |= 16;
                                blmw.f126912d = e13;
                                this.f28624q.f32819i = e13;
                            }
                            m21667a(aans2, a2, blmv);
                            this.f28624q.mo19574f();
                        }
                        if (!(bxxb instanceof blmv)) {
                            if (!(bxxb instanceof blmm)) {
                                if (aans2.f28639f) {
                                    m21667a(aans2, a2, bxxb);
                                }
                                if (a == null) {
                                }
                            } else if (a != null) {
                                a.close();
                                return;
                            } else {
                                return;
                            }
                        } else if (a == null) {
                        }
                        a.close();
                    } catch (InterruptedException e14) {
                        Thread.currentThread().interrupt();
                        return;
                    } catch (IOException e15) {
                        if (aans2.f28639f) {
                            mo17146b(aans2, 21);
                            return;
                        }
                        return;
                    } catch (Exception e16) {
                        mo17146b(aans2, 10);
                        return;
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                }
                return;
            } catch (IOException e17) {
                if (aans2.f28639f) {
                    mo17146b(aans2, 21);
                    return;
                }
                return;
            } catch (Exception e18) {
                mo17146b(aans2, 10);
                return;
            } catch (Throwable th3) {
                while (true) {
                    throw th3;
                }
            }
        } else {
            throw new UnknownHostException("No addresses for host");
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo17090a(Context context) {
        this.f28628u = new aabl(context, getClass(), 16, "GcmClient");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aank.a(int, boolean):void
     arg types: [int, int]
     candidates:
      aank.a(android.net.Network, int):void
      aank.a(android.net.NetworkInfo$State, int):void
      aank.a(android.net.NetworkInfo, boolean):void
      aank.a(int, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17145a(blng blng) {
        String str;
        blng blng2 = blng;
        blmq blmq = blng2.f126965a;
        if (blmq == null) {
            blmq = blmq.f126884c;
        }
        int i = blmq.f126886a;
        if (i != 0) {
            GcmChimeraService.m24303a("Login error %d %s", Integer.valueOf(i), blmq.f126887b);
            this.f28626s.mo17117a(4, false);
            return;
        }
        this.f28602F.mo17061a();
        HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.f28624q;
        blmu blmu = blng2.f126968d;
        if (blmu == null) {
            blmu = blmu.f126903b;
        }
        heartbeatChimeraAlarm.f32817g = Math.max(0, blmu.f126905a);
        synchronized (heartbeatChimeraAlarm) {
            heartbeatChimeraAlarm.f32816f = 0;
            heartbeatChimeraAlarm.mo19572d();
        }
        int i2 = (int) (heartbeatChimeraAlarm.f32815e.f28491c / 1000);
        int h = heartbeatChimeraAlarm.f32813c.mo17131h();
        aanr aanr = (aanr) heartbeatChimeraAlarm.f32812b;
        InetAddress f = aanr.mo17098f();
        if (f != null) {
            String hostAddress = f.getHostAddress();
            if (f instanceof Inet6Address) {
                int i3 = aanr.f28608a.f28634a.f28532b;
                StringBuilder sb = new StringBuilder(String.valueOf(hostAddress).length() + 14);
                sb.append('[');
                sb.append(hostAddress);
                sb.append("]:");
                sb.append(i3);
                str = sb.toString();
            } else {
                int i4 = aanr.f28608a.f28634a.f28532b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(hostAddress).length() + 12);
                sb2.append(hostAddress);
                sb2.append(':');
                sb2.append(i4);
                str = sb2.toString();
            }
        } else {
            str = null;
        }
        EventLog.writeEvent(204004, Integer.valueOf((h << 16) + i2), str);
        aank aank = this.f28626s;
        aank.mo17127d();
        aank.mo17132i();
        aank.mo17126c(true);
        if (aank.f28556e.mo17111b()) {
            NetworkInfo networkInfo = aank.f28553b.getNetworkInfo(aank.mo17131h());
            aani aani = aank.f28556e;
            aani.mo17109a(false);
            aani.mo17110b(networkInfo);
        }
        bxwc bxwc = blng2.f126966b;
        int size = bxwc.size();
        for (int i5 = 0; i5 < size; i5++) {
            blni blni = (blni) bxwc.get(i5);
            String str2 = blni.f126978b;
            String str3 = blni.f126979c;
            if ("appid".equals(str2)) {
                aakw aakw = this.f28600D;
                String[] split = str3.split(":");
                if (split.length < 2) {
                    Log.w("GCM", "Invalid appId");
                } else {
                    String str4 = split[0];
                    String str5 = split[1];
                    if (!str4.equals(aakw.f28391b) || !str5.equals(aakw.f28392c)) {
                        Log.i("GCM", "Got new GCM ID/token");
                        SharedPreferences.Editor edit = aakw.f28390a.getSharedPreferences("GcmId", 0).edit();
                        edit.putString("gcmappid", str3);
                        edit.commit();
                        aakw.f28391b = split[0];
                        aakw.f28392c = split[1];
                        Context context = aakw.f28390a;
                        StringBuilder sb3 = new StringBuilder(28);
                        sb3.append("Sending IID SYNC to all apps");
                        Log.w("GCM", sb3.toString());
                        Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
                        intent.putExtra("from", "google.com/iid");
                        intent.putExtra("CMD", "SYNC");
                        List<Object> b = aajg.m21341b();
                        int i6 = Build.VERSION.SDK_INT;
                        if (b.isEmpty()) {
                            for (Intent intent2 : aalp.m21471a(intent, context.getPackageManager().queryBroadcastReceivers(intent, 0))) {
                                context.sendOrderedBroadcast(intent2, null);
                            }
                        } else {
                            for (Object obj : b) {
                                int a = aajg.m21333a(obj);
                                for (Intent intent3 : aalp.m21471a(intent, aajg.m21334a(intent, a, 0))) {
                                    aajg.m21336a(context, a, intent3, null, null, null);
                                    a = a;
                                }
                            }
                        }
                    }
                }
            } else if ("cookie".equals(str2)) {
                this.f28607K = str3;
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        aamy.m21594a(this.f28603G, this.f28608a.f28636c);
        this.f28622o.sendBroadcast(new Intent("com.google.android.gcm.CONNECTED"));
        aajt aajt = this.f28625r;
        aajt.f28304g.mo17188a(aajt.f28303f);
    }

    /* renamed from: a */
    public final void mo17091a(bxxb bxxb) {
        m21668a(this.f28608a, bxxb);
        aucu.m76778a((Object) null);
    }

    /* renamed from: a */
    public final boolean mo17093a() {
        return this.f28608a.f28639f;
    }
}
