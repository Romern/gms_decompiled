package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;

/* renamed from: arbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbr implements arbb {

    /* renamed from: a */
    public static final Strategy f87298a = Strategy.f80482c;

    /* renamed from: b */
    public static final sek f87299b = ascp.m73787a("D2D", "SourceDeviceConnectorNearbyConnections");

    /* renamed from: c */
    public final ahie f87300c;

    /* renamed from: d */
    public final Handler f87301d;

    /* renamed from: e */
    public armu f87302e;

    /* renamed from: f */
    public ardt f87303f;

    /* renamed from: g */
    public String f87304g;

    /* renamed from: h */
    public arhn f87305h;

    /* renamed from: i */
    public bowh f87306i = bowh.DEFAULT;

    /* renamed from: j */
    public final C1223np f87307j = new C1223np();

    /* renamed from: k */
    public aqze f87308k = aqze.f87139a;

    /* renamed from: l */
    public final ahin f87309l = new arbl(this);

    /* renamed from: m */
    public final ahia f87310m = new arbm(this);

    /* renamed from: n */
    public final ahir f87311n = new arbn(this);

    /* renamed from: o */
    private arqm f87312o;

    /* renamed from: p */
    private final arai f87313p;

    /* renamed from: q */
    private int f87314q;

    public arbr(ahie ahie, arai arai) {
        this.f87300c = ahie;
        this.f87301d = arai.f87198b;
        this.f87313p = arai;
    }

    /* renamed from: b */
    private final void m72411b(String str) {
        this.f87300c.mo36529n(str);
    }

    /* renamed from: c */
    private final void m72412c(String str) {
        try {
            arhn arhn = this.f87305h;
            if (arhn != null) {
                ahiq a = ahiq.m55840a(arhn.mo48551a());
                ahie ahie = this.f87300c;
                if (ahie != null) {
                    ahie.mo36526a(str, a);
                }
                f87299b.mo25409a("Sent encrypted auth token", new Object[0]);
            }
        } catch (GeneralSecurityException e) {
            f87299b.mo25417e("Encryption error", e, new Object[0]);
        }
    }

    /* renamed from: a */
    private static final rke m72409a(aucb aucb) {
        Status status = Status.f30107a;
        try {
            aucu.m76782a(aucb);
        } catch (InterruptedException | ExecutionException e) {
            Exception e2 = aucb.mo50387e();
            if (e2 instanceof rjp) {
                status = new Status(((rjp) e2).mo24655a());
            }
            f87299b.mo25410a(e);
        }
        sdo.m34966a(status, "Result must not be null");
        rou rou = new rou(Looper.getMainLooper());
        rou.mo17716a(status);
        return rou;
    }

    /* renamed from: b */
    public final void mo48373b() {
        aqzd a = this.f87308k.mo48295a();
        a.f87137c = false;
        this.f87308k = a.mo48294a();
        f87299b.mo25412b("Stopping discovery.", new Object[0]);
        arqm arqm = this.f87312o;
        if (arqm != null) {
            arqm.mo48751b();
        }
        this.f87300c.mo36527b();
    }

    /* renamed from: a */
    private final rke m72410a(String str, ahia ahia) {
        arnz arnz = new arnz();
        byte b = this.f87308k.f87141c;
        byte[] bArr = arnz.f87991a;
        bArr[1] = b;
        bArr[2] = (byte) this.f87314q;
        try {
            return m72409a(this.f87300c.mo36522a(new String(Base64.encode(bArr, 3), "UTF-8"), str, ahia));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final aucb mo48353a() {
        if (!cgpg.m146449c() || !this.f87308k.f87142d) {
            String str = this.f87304g;
            if (str == null) {
                f87299b.mo25418e("No connection in progress to disconnect.", new Object[0]);
                return aucu.m76777a((Exception) new rjp(new Status(10567)));
            }
            if (this.f87308k.f87140b || cgpa.f187426a.mo6606a().mo84210d()) {
                f87299b.mo25412b(str.length() == 0 ? new String("Disconnecting from endpoint ") : "Disconnecting from endpoint ".concat(str), new Object[0]);
                m72411b(str);
            } else {
                f87299b.mo25412b("Rejecting endpoint %s", str);
                m72409a(this.f87300c.mo36519a(str)).mo9455a();
            }
            this.f87308k = aqze.f87139a;
            this.f87304g = null;
            return aucu.m76778a((Object) null);
        }
        mo48373b();
        this.f87308k = aqze.f87139a;
        return aucu.m76778a((Object) null);
    }

    /* renamed from: a */
    public final aucb mo48369a(ConnectionRequest connectionRequest, armu armu) {
        ahin ahin;
        int i;
        String str = this.f87304g;
        if (str != null) {
            sek sek = f87299b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Already connected to another device ");
            sb.append(str);
            sb.append(". Refusing to connect.");
            sek.mo25409a(sb.toString(), new Object[0]);
            return aucu.m76777a((Exception) new rjp(new Status(10566)));
        }
        if (cgql.m146579d()) {
            D2DDevice d2DDevice = connectionRequest.f107865a;
            this.f87314q = connectionRequest.f107870f;
            if (d2DDevice != null) {
                return mo48354a(d2DDevice, armu, connectionRequest.f107866b);
            }
        }
        String str2 = connectionRequest.f107869e;
        String str3 = connectionRequest.f107867c;
        byte[] bArr = connectionRequest.f107868d;
        if (this.f87300c == null) {
            return aucu.m76777a(new Exception("GoogleApiClient is not supported."));
        }
        this.f87302e = armu;
        ahik ahik = new ahik();
        ahik.mo36534a(f87298a);
        DiscoveryOptions discoveryOptions = ahik.f67244a;
        if (bArr != null) {
            ahin = new arbo(this, bArr);
        } else if (str3 == null) {
            return aucu.m76777a((Exception) new rjp(new Status(10594)));
        } else {
            ahin = new arbp(this, str3, str2);
        }
        arnj arnj = new arnj(this.f87301d, ahin);
        boolean isEmpty = TextUtils.isEmpty(str2);
        aqzd aqzd = new aqzd();
        aqzd.f87136b = !isEmpty;
        aqzd.f87137c = true;
        this.f87308k = aqzd.mo48294a();
        if (!cgpg.m146448b()) {
            i = 15;
        } else {
            i = 10595;
        }
        arqm arqm = new arqm(snp.m35704b(10), null, cgpg.f187448a.mo6606a().mo84232f(), new arbk(this, armu, i));
        this.f87312o = arqm;
        arqm.mo48750a();
        return this.f87300c.mo36520a(cgqs.m146601g(), arnj, discoveryOptions);
    }

    /* renamed from: a */
    public final aucb mo48354a(D2DDevice d2DDevice, armu armu, String str) {
        String str2 = this.f87304g;
        if (str2 == null) {
            aqzd aqzd = new aqzd();
            aqzd.f87136b = false;
            this.f87308k = aqzd.mo48294a();
            sek sek = f87299b;
            String str3 = d2DDevice.f107874c;
            String str4 = d2DDevice.f107875d;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 36 + String.valueOf(str4).length());
            sb.append("Requesting connection to device: ");
            sb.append(str3);
            sb.append(" (");
            sb.append(str4);
            sb.append(")");
            sek.mo25409a(sb.toString(), new Object[0]);
            this.f87302e = armu;
            this.f87304g = d2DDevice.f107875d;
            this.f87306i = bowh.m111606a(d2DDevice.f107879h);
            bmxy.m108582a(this.f87304g, "Connection endpoint ID is null.");
            return mo48370a(this.f87304g, cgql.m146578c(), this.f87310m);
        }
        sek sek2 = f87299b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 58);
        sb2.append("Already connected to another device ");
        sb2.append(str2);
        sb2.append(". Refusing to connect.");
        sek2.mo25418e(sb2.toString(), new Object[0]);
        return aucu.m76777a((Exception) new rjp(new Status(10566)));
    }

    /* renamed from: a */
    public final aucb mo48370a(String str, long j, ahia ahia) {
        arng arng = new arng(this.f87301d, ahia);
        Status status = (Status) m72410a(str, arng).mo9455a();
        int i = status.f30115i;
        int i2 = 0;
        while (!status.mo17710c() && ((long) i2) < j) {
            status = (Status) m72410a(str, arng).mo9455a();
            i2++;
        }
        ((beon) this.f87313p.f87202f.f87039f.mo6606a()).mo60861b(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(status.f30115i));
        if (!status.mo17710c()) {
            this.f87304g = null;
        }
        return status.mo17710c() ? aucu.m76778a((Object) null) : aucu.m76777a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final void mo48371a(String str) {
        if (this.f87304g != null) {
            sek sek = f87299b;
            String valueOf = String.valueOf(str);
            sek.mo25409a(valueOf.length() == 0 ? new String("Disconnected from device endpoint ") : "Disconnected from device endpoint ".concat(valueOf), new Object[0]);
            this.f87304g = null;
            this.f87303f = null;
            armu armu = this.f87302e;
            if (armu != null) {
                armu.mo48347a();
            }
        }
    }

    /* renamed from: a */
    public final void mo48372a(byte[] bArr, String str) {
        try {
            aqzd a = this.f87308k.mo48295a();
            a.f87138d = false;
            this.f87308k = a.mo48294a();
            arhn arhn = this.f87305h;
            if (arhn != null) {
                arhn.mo48550a(bArr);
                f87299b.mo25409a("Verified auth token", new Object[0]);
            }
            armu armu = this.f87302e;
            ahie ahie = this.f87300c;
            bmxy.m108582a(armu, "connectionCallbacks must not be null!");
            bmxy.m108582a(ahie, "connectionsClient must not be null!");
            m72412c(str);
            armu.mo48349a(new arhb(ahie, str), new TargetConnectionArgs());
            f87299b.mo25409a("Connection complete.", new Object[0]);
        } catch (GeneralSecurityException e) {
            f87299b.mo25417e("Failed to validate authentication token", e, new Object[0]);
            m72411b(str);
            this.f87308k = aqze.f87139a;
        }
    }
}
