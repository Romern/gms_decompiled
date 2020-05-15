package p000;

import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajoi */
public final /* synthetic */ class ajoi implements aubw {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71057a;

    /* renamed from: b */
    private final boolean f71058b;

    /* renamed from: c */
    private final boolean f71059c;

    /* renamed from: d */
    private final boolean f71060d;

    public ajoi(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, boolean z, boolean z2, boolean z3) {
        this.f71057a = receiveSurfaceChimeraActivity;
        this.f71058b = z;
        this.f71059c = z2;
        this.f71060d = z3;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71057a;
        boolean z = this.f71058b;
        boolean z2 = this.f71059c;
        boolean z3 = this.f71060d;
        if (((Boolean) obj).booleanValue() && z && z2 && z3) {
            receiveSurfaceChimeraActivity.mo44466k();
        } else {
            receiveSurfaceChimeraActivity.mo44467l();
        }
    }
}
