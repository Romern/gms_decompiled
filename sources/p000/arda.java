package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arda extends ariv implements aaai, argv {

    /* renamed from: a */
    private final arah f87400a;

    /* renamed from: b */
    private final armb f87401b;

    /* renamed from: c */
    private final Context f87402c;

    /* renamed from: d */
    private final Handler f87403d;

    /* renamed from: e */
    private final String f87404e;

    /* renamed from: f */
    private final boolean f87405f = true;

    /* renamed from: g */
    private final boolean f87406g;

    /* renamed from: h */
    private ardc f87407h;

    /* renamed from: i */
    private armh f87408i;

    /* renamed from: j */
    private long f87409j;

    /* renamed from: k */
    private final aaag f87410k;

    public arda(LifecycleSynchronizer lifecycleSynchronizer, arah arah, armb armb, Context context, Handler handler, String str, boolean z) {
        this.f87410k = aaag.m21014a(context, lifecycleSynchronizer, arpy.m73286a());
        this.f87400a = arah;
        this.f87401b = armb;
        this.f87402c = context;
        this.f87403d = handler;
        this.f87404e = str;
        this.f87406g = z;
        m72492d();
    }

    /* renamed from: a */
    private static void m72491a(armh armh, long j) {
        armh.mo48648b(System.currentTimeMillis() - j);
        if (!spn.m35859a()) {
            armh.mo48641a();
        }
    }

    /* renamed from: d */
    private final ardc m72492d() {
        ardc ardc = this.f87407h;
        if (ardc != null) {
            return ardc;
        }
        armh b = this.f87401b.mo48627b(this.f87402c);
        b.mo48645a(this.f87404e, this.f87405f, this.f87406g);
        this.f87409j = System.currentTimeMillis();
        ardc b2 = this.f87400a.mo48332b(new arai(this.f87402c, this.f87403d, b, this, this.f87404e));
        this.f87407h = b2;
        this.f87408i = b;
        return b2;
    }

    /* renamed from: a */
    public final void mo48412a(artk artk) {
    }

    /* renamed from: a */
    public final void mo48413a(artk artk, HandshakeData handshakeData) {
    }

    /* renamed from: b */
    public final synchronized void mo48415b() {
        this.f87408i = null;
        ardc ardc = this.f87407h;
        if (ardc != null) {
            this.f87403d.post(new arbz(ardc));
        }
        this.f87407h = null;
    }

    /* renamed from: b */
    public final void mo48418b(artk artk, HandshakeData handshakeData) {
    }

    /* renamed from: c */
    public final void mo48419c() {
        armh armh = this.f87408i;
        if (armh != null) {
            m72491a(armh, this.f87409j);
        }
        mo48415b();
    }

    /* renamed from: a */
    public final void mo48401a() {
        int i = spn.f44932a;
        armh armh = this.f87408i;
        if (armh != null) {
            armh.mo48649b(true);
            m72491a(armh, this.f87409j);
            long k = cgqs.m146605k();
            if (k < 0) {
                mo48415b();
            } else {
                this.f87403d.postDelayed(new arby(this), k);
            }
        }
    }

    /* renamed from: b */
    public final void mo48416b(arit arit) {
        this.f87410k.mo16658a(new arcl(arit, m72492d(), this.f87403d));
    }

    /* renamed from: b */
    public final void mo48417b(arit arit, Bundle bundle) {
        this.f87410k.mo16658a(new arcp(arit, bundle, m72492d(), this.f87403d));
    }

    /* renamed from: c */
    public final void mo48420c(arit arit) {
        this.f87410k.mo16658a(new arcn(arit, m72492d(), this.f87403d));
    }

    /* renamed from: d */
    public final void mo48421d(arit arit) {
        this.f87410k.mo16658a(new arcb(arit, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48402a(int i) {
        int i2 = spn.f44932a;
        armh armh = this.f87408i;
        if (armh != null) {
            armh.mo48649b(false);
            armh.mo48647b(i);
            m72491a(armh, this.f87409j);
            mo48415b();
        }
    }

    /* renamed from: a */
    public final void mo48403a(arit arit) {
        this.f87410k.mo16658a(new arcx(arit, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48404a(arit arit, Bundle bundle) {
        this.f87410k.mo16658a(new arcr(arit, bundle, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48405a(arit arit, ariz ariz) {
        this.f87410k.mo16658a(new arcv(arit, ariz, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48406a(arit arit, BootstrapConfigurations bootstrapConfigurations) {
        this.f87410k.mo16658a(new arcz(arit, bootstrapConfigurations, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48407a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arij arij) {
        this.f87410k.mo16658a(new arct(arit, bootstrapConfigurations, parcelFileDescriptorArr, new aqzq(arij), m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48408a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
        this.f87410k.mo16658a(new arct(arit, bootstrapConfigurations, parcelFileDescriptorArr, new aqzq(arik), m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48409a(arit arit, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, arin arin) {
        this.f87410k.mo16658a(new arcd(arit, d2DDevice, bootstrapConfigurations, arin, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48410a(arit arit, D2DDevice d2DDevice, String str, ariq ariq) {
        this.f87410k.mo16658a(new C1658arch(arit, d2DDevice, str, ariq, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48411a(arit arit, String str) {
        this.f87410k.mo16658a(new arcj(arit, str, m72492d(), this.f87403d));
    }

    /* renamed from: a */
    public final void mo48414a(ConnectParams connectParams) {
        this.f87410k.mo16658a(new arcf(connectParams, m72492d(), this.f87403d));
    }
}
