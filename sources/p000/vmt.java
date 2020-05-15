package p000;

/* renamed from: vmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vmt {

    /* renamed from: a */
    final /* synthetic */ vmy f49534a;

    public vmt(vmy vmy) {
        this.f49534a = vmy;
    }

    /* renamed from: a */
    public final void mo28645a() {
        vmy vmy = this.f49534a;
        vmy.f49557m.removeCallbacks(vmy.f49546b);
        this.f49534a.f49557m.mo2090a(false);
    }

    /* renamed from: a */
    public final void mo28646a(boolean z) {
        if (z) {
            this.f49534a.f49558n.scrollToPosition(0);
        }
        this.f49534a.f49558n.setEnabled(true);
        this.f49534a.f49556l.mo15877p();
        vmy vmy = this.f49534a;
        if (vmy.f49555k != null && (vmy.f49554j.mo161a() > 1 || !this.f49534a.f49554j.f49494g)) {
            vcy vcy = this.f49534a.f49555k;
            vcy.mo28307h();
            vcy.mo28274a();
            this.f49534a.f49555k = null;
        }
        mo28645a();
        vmy vmy2 = this.f49534a;
        vmy2.f49558n.setAdapter(vmy2.f49554j);
        vmy vmy3 = this.f49534a;
        vmy3.f49558n.f31223b = vmy3.f49547c;
    }
}
