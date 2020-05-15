package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcd extends aaab {

    /* renamed from: a */
    public final arit f87339a;

    /* renamed from: b */
    public final ardc f87340b;

    /* renamed from: c */
    public final D2DDevice f87341c;

    /* renamed from: d */
    public final BootstrapConfigurations f87342d;

    /* renamed from: e */
    public final arin f87343e;

    /* renamed from: f */
    private final Handler f87344f;

    public arcd(arit arit, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, arin arin, ardc ardc, Handler handler) {
        super(75, "BootstrapOperation");
        this.f87339a = arit;
        this.f87340b = ardc;
        this.f87341c = d2DDevice;
        this.f87342d = bootstrapConfigurations;
        this.f87343e = arin;
        this.f87344f = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87344f.post(new arcc(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87339a.mo48578d(status);
    }
}
