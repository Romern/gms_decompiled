package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: areo */
public final /* synthetic */ class areo implements roo {

    /* renamed from: a */
    private final arez f87539a;

    /* renamed from: b */
    private final BootstrapOptions f87540b;

    /* renamed from: c */
    private final areb f87541c;

    public areo(arez arez, BootstrapOptions bootstrapOptions, areb areb) {
        this.f87539a = arez;
        this.f87540b = bootstrapOptions;
        this.f87541c = areb;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        arez arez = this.f87539a;
        BootstrapOptions bootstrapOptions = this.f87540b;
        areb areb = this.f87541c;
        arln arln = new arln((aucf) obj2);
        arjb arjb = new arjb(new arey(arez, areb));
        sdo.checkIfNull(bootstrapOptions, "bootstrapOptions cannot be null.");
        sdo.checkIfNull(arjb, "bootstrapListener cannot be null.");
        ((arji) ((arll) obj).mo25289B()).mo48495a(new arli(arln), bootstrapOptions, arjb);
    }
}
