package p000;

/* renamed from: mej */
public final /* synthetic */ class mej implements Runnable {

    /* renamed from: a */
    private final mgj f33513a;

    public mej(mgj mgj) {
        this.f33513a = mgj;
    }

    public final void run() {
        mgj mgj = this.f33513a;
        mgj.f33623a.mo25412b("The user has been authenticated via lock screen.", new Object[0]);
        int i = mgj.f33632j;
        if (i == 0) {
            mgj.f33623a.mo25409a("Expected state: AUTHORIZATION_REQUESTED, reported state: INITIAL. Changing state to AWAITING_USB.", new Object[0]);
            mgj.f33632j = 5;
            mgj.mo19985b();
        } else if (i == 3) {
            mgj.f33632j = 4;
            mgj.f33638p.mo19912b();
        } else if (i != 5) {
            mgj.f33623a.mo25412b("proceedAfterScreenUnlock was called in an unexpected state: %d", Integer.valueOf(mgj.f33632j));
        } else {
            mgj.f33623a.mo25409a("proceedAfterScreenUnlock was called after the cable was unplugged, not proceeding with authorization.", new Object[0]);
        }
    }
}
