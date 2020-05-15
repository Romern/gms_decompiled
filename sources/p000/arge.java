package p000;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arge extends arjh implements aaai, argv {

    /* renamed from: a */
    public static final asco f87642a = ascp.m73787a("TargetServiceDelegate");

    /* renamed from: b */
    public final Handler f87643b;

    /* renamed from: c */
    public final argg f87644c;

    /* renamed from: d */
    public final armn f87645d;

    /* renamed from: e */
    private final arly f87646e;

    /* renamed from: f */
    private final aqzy f87647f;

    /* renamed from: g */
    private final long f87648g = System.currentTimeMillis();

    /* renamed from: h */
    private boolean f87649h;

    /* renamed from: i */
    private final aaag f87650i;

    public arge(LifecycleSynchronizer lifecycleSynchronizer, arah arah, armb armb, Context context, Handler handler, String str, boolean z, boolean z2) {
        this.f87650i = aaag.m21014a(context, lifecycleSynchronizer, arpy.m73286a());
        this.f87643b = handler;
        armn a = armb.mo48626a(context);
        this.f87645d = a;
        a.mo48661a(str, z, z2);
        this.f87646e = new arly(context, handler);
        this.f87647f = new aqzy(context);
        this.f87644c = arah.mo48331a(new arai(context, handler, this.f87645d, this));
    }

    /* renamed from: d */
    private final void m72686d() {
        this.f87645d.mo48664b(System.currentTimeMillis() - this.f87648g);
        this.f87649h = true;
    }

    /* renamed from: a */
    public final String mo48492a(BootstrapOptions bootstrapOptions) {
        argg argg = this.f87644c;
        argg.f87654a.mo48666c(2);
        arml.m73129a(argg.f87654a, 13);
        arfh arfh = argg.f87655b;
        sdo.m34959a(bootstrapOptions);
        if (arfh.f87593k) {
            return arfh.f87592j;
        }
        throw new RuntimeException("getAdvertisedDeviceName should only be called after resources have been initialized");
    }

    /* renamed from: a */
    public final void mo48498a(artk artk) {
    }

    /* renamed from: a */
    public final void mo48499a(artk artk, HandshakeData handshakeData) {
    }

    /* renamed from: b */
    public final void mo48500b() {
        mo48504c();
        this.f87643b.post(new arfl(this));
    }

    /* renamed from: b */
    public final void mo48502b(artk artk) {
    }

    /* renamed from: b */
    public final void mo48503b(artk artk, HandshakeData handshakeData) {
    }

    /* renamed from: c */
    public final void mo48504c() {
        if (!this.f87649h) {
            m72686d();
        }
        if (!spn.m35859a()) {
            this.f87645d.mo48657a();
        }
    }

    /* renamed from: e */
    public final void mo48507e(arjf arjf) {
        armn armn = this.f87645d;
        arml.m73129a(armn, 23);
        armn.mo48666c(4);
        this.f87650i.mo16658a(new arfx(arjf, this.f87646e, this.f87643b));
    }

    /* renamed from: f */
    public final void mo48508f(arjf arjf) {
        armn armn = this.f87645d;
        arml.m73129a(armn, 22);
        armn.mo48666c(5);
        this.f87650i.mo16658a(new arfv(arjf, this.f87647f, this.f87643b));
    }

    /* renamed from: b */
    public final void mo48501b(arjf arjf) {
        this.f87650i.mo16658a(new arfz(arjf, this.f87644c, this.f87643b));
    }

    /* renamed from: d */
    public final void mo48506d(arjf arjf) {
        this.f87650i.mo16658a(new arfn(arjf, this.f87644c, this.f87643b));
    }

    /* renamed from: c */
    public final void mo48505c(arjf arjf) {
        this.f87650i.mo16658a(new arft(arjf, this.f87644c, this.f87643b));
    }

    /* renamed from: a */
    public final void mo48401a() {
        int i = spn.f44932a;
        f87642a.mo25414c("Completed", new Object[0]);
        this.f87645d.mo48665b(true);
        m72686d();
    }

    /* renamed from: a */
    public final void mo48402a(int i) {
        int i2 = spn.f44932a;
        f87642a.mo25418e("error %d", Integer.valueOf(i));
        f87642a.mo25412b("%s", araj.m72321a(i));
        armn armn = this.f87645d;
        armn.mo48665b(false);
        armn.mo48658a(i);
        m72686d();
    }

    /* renamed from: a */
    public final void mo48493a(arjf arjf) {
        this.f87650i.mo16658a(new arfp(arjf, this.f87644c, this.f87643b));
    }

    /* renamed from: a */
    public final void mo48494a(arjf arjf, arjc arjc) {
        this.f87650i.mo16658a(new argb(arjf, this.f87644c, arjc, this.f87643b));
    }

    /* renamed from: a */
    public final void mo48495a(arjf arjf, BootstrapOptions bootstrapOptions, arjc arjc) {
        this.f87650i.mo16658a(new arfr(arjf, this.f87644c, bootstrapOptions, arjc, this.f87643b));
    }

    /* renamed from: a */
    public final void mo48496a(arjf arjf, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arij arij) {
        this.f87650i.mo16658a(new argd(arjf, this.f87644c, bootstrapOptions, parcelFileDescriptorArr, new aqzq(arij), this.f87643b));
    }

    /* renamed from: a */
    public final void mo48497a(arjf arjf, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
        this.f87650i.mo16658a(new argd(arjf, this.f87644c, bootstrapOptions, parcelFileDescriptorArr, new aqzq(arik), this.f87643b));
    }
}
