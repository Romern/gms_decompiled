package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: arfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arfd implements arfa {

    /* renamed from: a */
    public static final sek f87557a = ascp.m73787a("D2D", "TargetDeviceConnectorNearbyConnections");

    /* renamed from: b */
    public final arpx f87558b;

    /* renamed from: c */
    public final Context f87559c;

    /* renamed from: d */
    public final armn f87560d;

    /* renamed from: e */
    public final ahie f87561e;

    /* renamed from: f */
    public final arrv f87562f;

    /* renamed from: g */
    public String f87563g;

    /* renamed from: h */
    public arnt f87564h;

    /* renamed from: i */
    public arnz f87565i;

    /* renamed from: j */
    public String f87566j;

    /* renamed from: k */
    public armu f87567k;

    /* renamed from: l */
    public boolean f87568l;

    /* renamed from: m */
    public boolean f87569m = false;

    /* renamed from: n */
    public String f87570n;

    /* renamed from: o */
    public byte[] f87571o;

    /* renamed from: p */
    public byte[] f87572p;

    /* renamed from: q */
    public arhn f87573q;

    /* renamed from: r */
    public final Handler f87574r;

    /* renamed from: s */
    public final ahia f87575s = new arfb(this);

    /* renamed from: t */
    public final ahir f87576t = new arfc(this);

    public arfd(arai arai) {
        ahie a = arqd.m73295a(arai.f87197a);
        this.f87559c = arai.f87197a;
        this.f87561e = a;
        this.f87574r = arai.f87198b;
        this.f87560d = (armn) arai.f87199c;
        this.f87558b = new arpx(this.f87559c);
        int i = Build.VERSION.SDK_INT;
        aqxm.m72204e();
        this.f87562f = new arrv(this.f87559c);
    }

    /* renamed from: b */
    public static byte[] m72634b() {
        cgpy.m146528c();
        try {
            return arhn.m72768b().getEncoded();
        } catch (NoSuchAlgorithmException e) {
            f87557a.mo25417e("AES key generator not supported.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final aucb mo48477a() {
        arrv arrv = this.f87562f;
        if (arrv != null) {
            arrv.mo48779b();
            this.f87562f.mo48778a();
        }
        if (this.f87567k != null) {
            f87557a.mo25412b("Stopping advertising.", new Object[0]);
            this.f87561e.mo36524a();
        }
        this.f87567k = null;
        String str = this.f87563g;
        if (str == null) {
            return aucu.m76778a((Object) null);
        }
        if (!cgpa.f187426a.mo6606a().mo84209c() && !this.f87568l) {
            f87557a.mo25412b("Rejecting connection", new Object[0]);
            this.f87561e.mo36519a(str);
        } else {
            f87557a.mo25412b("Disconnecting from %s", str);
            this.f87561e.mo36529n(str);
        }
        this.f87568l = false;
        this.f87563g = null;
        return aucu.m76778a((Object) null);
    }

    /* renamed from: a */
    public final void mo48478a(String str) {
        try {
            arhn arhn = this.f87573q;
            if (arhn != null) {
                this.f87561e.mo36526a(str, ahiq.m55840a(arhn.mo48551a()));
                f87557a.mo25409a("Sent encrypted auth token", new Object[0]);
                this.f87569m = true;
            }
        } catch (GeneralSecurityException e) {
            f87557a.mo25417e("Encryption error", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo48479a(byte[] bArr, String str) {
        try {
            this.f87569m = false;
            arhn arhn = this.f87573q;
            if (arhn != null) {
                arhn.mo48550a(bArr);
                f87557a.mo25409a("Verified auth token", new Object[0]);
            }
            armu armu = this.f87567k;
            if (armu != null) {
                armu.mo48349a(new arhb(this.f87561e, str), new TargetConnectionArgs());
            }
        } catch (GeneralSecurityException e) {
            f87557a.mo25417e("Failed to validate authentication token", e, new Object[0]);
            this.f87561e.mo36529n(str);
        }
    }
}
