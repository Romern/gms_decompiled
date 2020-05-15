package p000;

/* renamed from: agm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agm implements C0011ai {

    /* renamed from: a */
    final /* synthetic */ ago f506a;

    public agm(ago ago) {
        this.f506a = ago;
    }

    /* renamed from: a */
    public final void mo136a(C0013ak akVar, C0005ad adVar) {
        if (adVar == C0005ad.ON_DESTROY && !this.f506a.isChangingConfigurations()) {
            this.f506a.getViewModelStore().mo3468a();
        }
    }
}
