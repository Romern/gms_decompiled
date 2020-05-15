package p000;

import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ahcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahcy {

    /* renamed from: b */
    public static final bnsp f67020b = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: c */
    public final buye f67021c;

    /* renamed from: d */
    ahcx f67022d;

    /* renamed from: e */
    public buzo f67023e = null;

    /* renamed from: f */
    public bvaa f67024f = null;

    /* renamed from: g */
    public boolean f67025g = false;

    /* renamed from: h */
    public boolean f67026h = false;

    /* renamed from: i */
    public boolean f67027i = false;

    /* renamed from: j */
    public boolean f67028j;

    /* renamed from: k */
    public Device f67029k;

    /* renamed from: l */
    protected final String f67030l;

    /* renamed from: m */
    protected final String f67031m;

    /* renamed from: n */
    public final byte f67032n;

    /* renamed from: o */
    protected final ahcs f67033o;

    /* renamed from: p */
    protected final ahdj f67034p;

    /* renamed from: q */
    protected final ahdm f67035q;

    /* renamed from: r */
    protected final buqb f67036r;

    public ahcy(buye buye, buqb buqb, String str, String str2, byte b, ahdj ahdj, ahdm ahdm, ahcs ahcs) {
        sdo.m34959a(buye);
        this.f67021c = buye;
        sdo.m34959a(buqb);
        this.f67036r = buqb;
        this.f67030l = str;
        this.f67031m = str2;
        this.f67032n = b;
        this.f67033o = ahcs;
        this.f67034p = ahdj;
        this.f67035q = ahdm;
    }

    /* renamed from: a */
    static final boolean m55502a(IInterface iInterface) {
        return (iInterface == null || iInterface.asBinder() == null || !iInterface.asBinder().isBinderAlive()) ? false : true;
    }

    /* renamed from: a */
    public abstract boolean mo36326a(Device device);

    /* renamed from: b */
    public final boolean mo36327b(byte[] bArr) {
        buzo buzo = this.f67023e;
        if (buzo == null) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "b", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: device is not connected before send");
            return false;
        }
        bxvd da = bval.f155487d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bval bval = (bval) da.f164949b;
        buzo.getClass();
        bval.f155490b = buzo;
        bval.f155489a |= 1;
        bxvd da2 = buzq.f155418c.mo74144da();
        bxtx a = bxtx.m123261a(bArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        buzq buzq = (buzq) da2.f164949b;
        a.getClass();
        buzq.f155420a |= 1;
        buzq.f155421b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bval bval2 = (bval) da.f164949b;
        buzq buzq2 = (buzq) da2.mo74062i();
        buzq2.getClass();
        bval2.f155491c = buzq2;
        bval2.f155489a |= 2;
        this.f67021c.mo73256a((bval) da.mo74062i(), new ahcw());
        return true;
    }

    /* renamed from: d */
    public abstract void mo36328d();

    /* renamed from: e */
    public abstract void mo36329e();

    /* renamed from: f */
    public final void mo36330f() {
        try {
            SystemClock.elapsedRealtime();
            if (m55502a(this.f67034p)) {
                this.f67036r.mo72973a(12, this);
                this.f67034p.mo36345a(this.f67029k, null);
            }
            this.f67033o.mo36313b();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "f", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: fail to call ConnectionListener.onConnected");
        }
    }

    /* renamed from: g */
    public void mo36331g() {
        try {
            if (m55502a(this.f67034p)) {
                this.f67036r.mo72973a(13, this);
                this.f67034p.mo36343a();
            }
            this.f67033o.mo36313b();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "g", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: fail to call ConnectionListener.onDisconnected");
        }
    }

    /* renamed from: h */
    public final void mo36332h() {
        try {
            if (m55502a(this.f67034p)) {
                this.f67034p.mo36344a(13);
            }
            this.f67033o.mo36313b();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "h", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: fail to call ConnectionListener.onError(ERROR)");
        }
    }

    /* renamed from: i */
    public final void mo36333i() {
        try {
            if (m55502a(this.f67034p)) {
                this.f67034p.mo36344a(16);
            }
            this.f67033o.mo36313b();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "i", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: fail to call ConnectionListener.onError(CANCELED)");
        }
    }

    /* renamed from: j */
    public void mo36334j() {
        this.f67028j = true;
    }

    /* renamed from: k */
    public void mo36335k() {
        this.f67028j = false;
        mo36337m();
    }

    /* renamed from: l */
    public final void mo36336l() {
        if (this.f67024f == null) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "l", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: unable to confirm before connect");
            return;
        }
        bxvd da = bvaq.f155504d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvaq bvaq = (bvaq) da.f164949b;
        bvaq.f155507b = 1;
        int i = 1 | bvaq.f155506a;
        bvaq.f155506a = i;
        String str = this.f67024f.f155451b;
        str.getClass();
        bvaq.f155506a = i | 2;
        bvaq.f155508c = str;
        this.f67021c.mo73258a((bvaq) da.mo74062i());
    }

    /* renamed from: m */
    public final void mo36337m() {
        bvaa bvaa = this.f67024f;
        if (bvaa != null) {
            this.f67027i = true;
            this.f67021c.mo73259a(bvaa.f155451b);
            this.f67024f = null;
        }
    }

    /* renamed from: n */
    public final boolean mo36338n() {
        return this.f67023e != null;
    }

    /* renamed from: a */
    public final void mo36323a(buzk buzk) {
        ahcx ahcx = new ahcx(this);
        this.f67022d = ahcx;
        this.f67026h = false;
        this.f67027i = false;
        this.f67024f = this.f67021c.mo73253a(buzk, ahcx);
    }

    /* renamed from: a */
    public final void mo36324a(String str) {
        try {
            SystemClock.elapsedRealtime();
            if (m55502a(this.f67034p)) {
                this.f67034p.mo36347b(str);
            }
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: fail to call DataListener.onDataReceived");
        }
    }

    /* renamed from: a */
    public final void mo36325a(byte[] bArr) {
        try {
            SystemClock.elapsedRealtime();
            if (m55502a(this.f67035q)) {
                this.f67035q.mo36349a(bArr);
            }
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f67020b.mo68388c();
            bnsl.mo68432a("ahcy", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SocketDevice: fail to call DataListener.onDataReceived");
        }
    }
}
