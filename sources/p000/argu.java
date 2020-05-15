package p000;

import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: argu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class argu extends aqyl {

    /* renamed from: c */
    public static final sek f87704c = ascp.m73787a("D2D", argu.class.getSimpleName());

    /* renamed from: d */
    private final BootstrapOptions f87705d;

    /* renamed from: e */
    private final arez f87706e;

    public argu(Handler handler, BootstrapOptions bootstrapOptions, arib arib, arez arez) {
        super(handler, arib);
        bootstrapOptions.mo59049b(2);
        bootstrapOptions.mo59062e(true);
        this.f87705d = bootstrapOptions;
        this.f87706e = arez;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48272b() {
        f87704c.mo25409a("startBootstrapByDirectTransferImpl", new Object[0]);
        arez arez = this.f87706e;
        BootstrapOptions bootstrapOptions = this.f87705d;
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f87096b;
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{aqwz.f87021i};
        b.f43472a = new areu(bootstrapOptions, parcelFileDescriptorArr, this);
        aucb b2 = arez.mo24732b(b.mo24977a());
        b2.mo50373a(args.f87702a);
        b2.mo50372a(new argt(this));
    }
}
