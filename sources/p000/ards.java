package p000;

import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: ards */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ards extends aqyl {

    /* renamed from: c */
    public static final Logger f87470c = ascp.m73787a("D2D", ards.class.getSimpleName());

    /* renamed from: d */
    private final BootstrapConfigurations f87471d;

    /* renamed from: e */
    private final arba f87472e;

    public ards(Handler handler, BootstrapConfigurations bootstrapConfigurations, arib arib, arba arba) {
        super(handler, arib);
        this.f87472e = arba;
        bootstrapConfigurations.f107824p = true;
        bootstrapConfigurations.f107811c.add(14);
        this.f87471d = bootstrapConfigurations;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48272b() {
        f87470c.logVerbose("startBootstrapByDirectTransferImpl", new Object[0]);
        arba arba = this.f87472e;
        BootstrapConfigurations bootstrapConfigurations = this.f87471d;
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f87096b;
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{aqwz.f87020h};
        b.f43472a = new arkh(bootstrapConfigurations, parcelFileDescriptorArr, this);
        aucb b2 = arba.mo24732b(b.mo24977a());
        b2.mo50373a(ardq.f87468a);
        b2.mo50372a(new ardr(this));
    }
}
