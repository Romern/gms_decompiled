package p000;

/* renamed from: aao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aap f55a;

    public aao(aap aap) {
        this.f55a = aap;
    }

    public final void run() {
        C1543zl zlVar = this.f55a.f60e;
        if (zlVar != null && C1280ps.m19871F(zlVar) && this.f55a.f60e.getCount() > this.f55a.f60e.getChildCount()) {
            int childCount = this.f55a.f60e.getChildCount();
            aap aap = this.f55a;
            if (childCount <= aap.f66k) {
                aap.f72q.setInputMethodMode(2);
                this.f55a.mo101aI();
            }
        }
    }
}
