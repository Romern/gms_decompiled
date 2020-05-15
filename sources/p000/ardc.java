package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: ardc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardc {

    /* renamed from: a */
    public static final Logger f87412a = ascp.m73787a("D2D", "SourceDeviceServiceImpl");

    /* renamed from: b */
    public final armh f87413b;

    /* renamed from: c */
    public final Handler f87414c;

    /* renamed from: d */
    public final arbt f87415d;

    /* renamed from: e */
    public final ardp f87416e;

    public ardc(arai arai) {
        this.f87413b = (armh) arai.f87199c;
        this.f87414c = arai.f87198b;
        if (cgqy.m146727b()) {
            this.f87415d = new arbx(arai);
        } else {
            this.f87415d = new arbv(arai);
        }
        this.f87416e = new ardp(arai);
        this.f87414c.post(new ardb(this));
    }

    /* renamed from: a */
    public final void mo48423a() {
        sdo.m34964a(this.f87414c);
        f87412a.logVerbose("Destroying source device API service.", new Object[0]);
        this.f87415d.mo48382c();
        this.f87416e.mo48443a();
    }

    /* renamed from: a */
    public final void mo48424a(ardo ardo) {
        sdo.m34964a(this.f87414c);
        this.f87413b.mo48652e(3);
        armj.m73128a(this.f87413b, 16);
        this.f87416e.mo48444a(ardo);
    }

    /* renamed from: a */
    public final void mo48425a(ardo ardo, Bundle bundle) {
        sdo.m34964a(this.f87414c);
        this.f87413b.mo48652e(3);
        ardn ardn = this.f87416e.f87466b;
        Status status = new Status(10565);
        long j = bundle.getLong("sessionId");
        if (ardn != null) {
            status = Status.f30107a;
            long j2 = -1;
            if (j != -1) {
                BootstrapOptions bootstrapOptions = ardn.f87453q;
                if (bootstrapOptions != null) {
                    j2 = bootstrapOptions.f107839l;
                }
                if (j != j2) {
                    status = new Status(10581);
                }
            }
        }
        try {
            arit arit = ardo.f87463a;
            if (arit == null) {
                arrh arrh = ardo.f87464b;
                if (arrh != null) {
                    arrh.mo48773a(status);
                    return;
                }
                return;
            }
            arit.mo48585k(status);
        } catch (RemoteException e) {
            ardp.f87465a.mo25417e("Error calling onIsTransferInProgressResult.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo48426a(ardo ardo, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq) {
        sdo.m34964a(this.f87414c);
        this.f87413b.mo48652e(3);
        armj.m73128a(this.f87413b, 15);
        this.f87416e.mo48445a(ardo, bootstrapConfigurations, parcelFileDescriptorArr, aqzq);
    }
}
