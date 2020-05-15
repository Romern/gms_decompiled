package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: axhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axhz implements axli {

    /* renamed from: a */
    final /* synthetic */ axic f95967a;

    public axhz(axic axic) {
        this.f95967a = axic;
    }

    /* renamed from: a */
    public final void mo53154a() {
    }

    /* renamed from: b */
    public final void mo53156b() {
        if (this.f95967a.f95970a.length() != 0) {
            StringBuilder sb = this.f95967a.f95970a;
            sb.deleteCharAt(sb.length() - 1);
            axic axic = this.f95967a;
            axic.f95971b.mo60215a(axic.f95970a.length());
            axic axic2 = this.f95967a;
            axic2.f95971b.announceForAccessibility(axic2.getString(C0126R.string.walletp2p_dot_deleted));
            this.f95967a.f95972c.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo53155a(int i) {
        if (this.f95967a.f95970a.length() < 4) {
            this.f95967a.f95970a.append(i);
            axic axic = this.f95967a;
            axic.f95971b.mo60215a(axic.f95970a.length());
            axic axic2 = this.f95967a;
            axic2.f95971b.announceForAccessibility(axic2.getString(C0126R.string.walletp2p_dot));
            this.f95967a.f95972c.setVisibility(4);
            if (this.f95967a.f95970a.length() == 4) {
                this.f95967a.f95973d.showNext();
                axic axic3 = this.f95967a;
                axif axif = axic3.f95976g;
                axif.f95983b.execute(new axie(axif.f95982a, axif.f95984c, axic3.f95975f.mo53137a(), this.f95967a.f95970a.toString(), new axhx(this), new axhy(this)));
            }
        }
    }
}
