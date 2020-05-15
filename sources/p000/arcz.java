package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: arcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcz extends aaab {

    /* renamed from: a */
    public final arit f87396a;

    /* renamed from: b */
    public final ardc f87397b;

    /* renamed from: c */
    public final BootstrapConfigurations f87398c;

    /* renamed from: d */
    private final Handler f87399d;

    public arcz(arit arit, BootstrapConfigurations bootstrapConfigurations, ardc ardc, Handler handler) {
        super(75, "UpdateBootstrapConfigurationOperation");
        this.f87396a = arit;
        this.f87397b = ardc;
        this.f87398c = bootstrapConfigurations;
        this.f87399d = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87399d.post(new arcy(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87396a.mo48582h(status);
    }
}
