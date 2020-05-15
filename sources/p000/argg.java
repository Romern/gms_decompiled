package p000;

import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: argg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class argg {

    /* renamed from: c */
    private static final sek f87653c = ascp.m73787a("D2D", "TargetDeviceServiceImpl");

    /* renamed from: a */
    public final armn f87654a;

    /* renamed from: b */
    public final arfh f87655b;

    /* renamed from: d */
    private final Handler f87656d;

    /* renamed from: e */
    private final argr f87657e;

    public argg(arai arai) {
        arfh arfh;
        this.f87654a = (armn) arai.f87199c;
        this.f87656d = arai.f87198b;
        if (cgqy.m146727b()) {
            arfh = new arfj(arai);
        } else {
            arfh = new arfi(arai);
        }
        this.f87655b = arfh;
        this.f87657e = new argr(arai);
        this.f87656d.post(new argf(this, arai));
    }

    /* renamed from: a */
    public final void mo48510a() {
        f87653c.mo25409a("Destroying target device API service.", new Object[0]);
        arfh arfh = this.f87655b;
        arfh.f87583a.mo25409a("cleanup()", new Object[0]);
        arfa arfa = arfh.f87589g;
        if (arfa != null && arfh.f87591i) {
            arfa.mo48477a();
        }
        arfh.mo48481a();
        arfh.f87587e.mo49052b();
        argr argr = this.f87657e;
        argr.f87699a.mo25409a("cleanup()", new Object[0]);
        argm argm = argr.f87700b;
        if (argm != null) {
            argm.mo48519f();
        }
        argr.f87700b = null;
    }

    /* renamed from: a */
    public final void mo48511a(argq argq) {
        this.f87654a.mo48666c(3);
        arml.m73129a(this.f87654a, 16);
        this.f87657e.mo48524a(argq);
    }

    /* renamed from: a */
    public final void mo48512a(argq argq, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq) {
        this.f87654a.mo48666c(3);
        arml.m73129a(this.f87654a, 15);
        this.f87657e.mo48525a(argq, bootstrapOptions, parcelFileDescriptorArr, aqzq);
    }
}
