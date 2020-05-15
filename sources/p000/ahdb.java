package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;
import java.security.SecureRandom;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ahdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahdb extends ahcy {

    /* renamed from: s */
    public static final bnsp f67040s = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: a */
    private final CountDownLatch f67041a = new CountDownLatch(1);

    /* renamed from: t */
    public boolean f67042t = false;

    /* renamed from: u */
    public String f67043u;

    /* renamed from: v */
    private bvaa f67044v = null;

    /* renamed from: w */
    private final SecureRandom f67045w = new SecureRandom();

    public ahdb(buye buye, buqb buqb, String str, String str2, byte b, ahdj ahdj, ahdm ahdm, ahcs ahcs) {
        super(buye, buqb, str, str2, b, ahdj, ahdm, ahcs);
    }

    /* renamed from: b */
    private final void m55528b(String str) {
        if (this.f67033o.mo36314c()) {
            try {
                if (m55502a(this.f67034p)) {
                    this.f67034p.mo36346a(str);
                }
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f67040s.mo68388c();
                bnsl.mo68432a("ahdb", "b", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("TargetDevice: fail to call ConnectionListener.onTokenFailure");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Device mo36291a(buyn buyn);

    /* renamed from: a */
    public final void mo36342a(buzt buzt) {
        if (this.f67025g) {
            bnsl bnsl = (bnsl) f67040s.mo68388c();
            bnsl.mo68432a("ahdb", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("TargetDevice: target device is receiving");
            return;
        }
        String str = this.f67043u;
        bxvd da = buzk.f155391e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzk buzk = (buzk) da.f164949b;
        buzt.getClass();
        buzk.f155394b = buzt;
        int i = buzk.f155393a | 1;
        buzk.f155393a = i;
        buzk.f155396d = 3;
        buzk.f155393a = i | 4;
        ByteString a = ByteString.m123258a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzk buzk2 = (buzk) da.f164949b;
        a.getClass();
        buzk2.f155393a |= 2;
        buzk2.f155395c = a;
        mo36323a((buzk) da.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo36292a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract buym mo36293b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo36294c();

    /* renamed from: d */
    public final void mo36328d() {
        String a = ahcj.m55463a(this.f67045w);
        this.f67043u = a;
        m55528b(a);
        this.f67033o.mo36313b();
    }

    /* renamed from: e */
    public final void mo36329e() {
        mo36337m();
        String a = ahcj.m55463a(this.f67045w);
        this.f67043u = a;
        m55528b(a);
        this.f67033o.mo36313b();
    }

    /* renamed from: g */
    public final void mo36331g() {
        super.mo36331g();
        this.f67041a.countDown();
    }

    /* renamed from: j */
    public final void mo36334j() {
        super.mo36334j();
        this.f67043u = ahcj.m55463a(this.f67045w);
        if (this.f67042t) {
            bnsl bnsl = (bnsl) f67040s.mo68388c();
            bnsl.mo68432a("ahdb", "j", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("TargetDevice: target device is accepting connection");
        } else {
            this.f67044v = this.f67021c.mo73251a(mo36293b(), new ahda(this));
        }
        if (!mo36292a()) {
            bnsl bnsl2 = (bnsl) f67040s.mo68388c();
            bnsl2.mo68432a("ahdb", "j", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("TargetDevice: fail to start advertising");
        }
    }

    /* renamed from: k */
    public final void mo36335k() {
        super.mo36335k();
        try {
            this.f67041a.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        this.f67043u = null;
        bvaa bvaa = this.f67044v;
        if (bvaa != null) {
            this.f67021c.mo73259a(bvaa.f155451b);
            this.f67044v = null;
        }
        mo36294c();
    }

    /* renamed from: a */
    public final boolean mo36326a(Device device) {
        Device device2 = this.f67029k;
        return device2 != null && device2.f80399d.equals(device.f80399d) && mo36338n();
    }
}
