package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arkp */
public final /* synthetic */ class arkp implements roo {

    /* renamed from: a */
    private final D2DDevice f87826a;

    /* renamed from: b */
    private final BootstrapConfigurations f87827b;

    /* renamed from: c */
    private final arao f87828c;

    /* renamed from: d */
    private final arba f87829d;

    public arkp(arba arba, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, arao arao) {
        this.f87829d = arba;
        this.f87826a = d2DDevice;
        this.f87827b = bootstrapConfigurations;
        this.f87828c = arao;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        arba arba = this.f87829d;
        D2DDevice d2DDevice = this.f87826a;
        BootstrapConfigurations bootstrapConfigurations = this.f87827b;
        arao arao = this.f87828c;
        arlb arlb = new arlb((aucf) obj2);
        ((ariw) ((arkb) obj).mo25289B()).mo48409a(new arjr(arlb), d2DDevice, bootstrapConfigurations, new arim(new arkz(arba, arao)));
    }
}
