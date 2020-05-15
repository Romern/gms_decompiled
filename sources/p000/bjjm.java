package p000;

import android.text.TextUtils;
import android.view.View;

/* renamed from: bjjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjjm extends bjgt implements bjgf {

    /* renamed from: m */
    private final Class f122829m;

    /* renamed from: n */
    public bjgd f122830n;

    protected bjjm(bjgv bjgv, Class cls) {
        super(bjgv);
        this.f122829m = cls;
        this.f122685j.mo65354a(new bjjl(this));
    }

    /* renamed from: E */
    private final void mo65299E() {
        bjgd bjgd = this.f122830n;
        mo65304c(bjgd != null ? bjgd.f122645g : null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo65155B() {
        super.mo65155B();
        mo65299E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo65302G();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo65303H() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        if (bwxl == null || bwxl.f161388d != bwxl2.f161388d) {
            bjgd bjgd = this.f122830n;
            if (bjgd != null) {
                bjgd.mo65116c(this);
            }
            if ((bwxl2.f161385a & 4) != 0) {
                this.f122830n = this.f122676a.f122693b.mo65131a(bwxl2.f161388d, this.f122829m);
            } else {
                this.f122830n = null;
            }
            bjgd bjgd2 = this.f122830n;
            if (bjgd2 != null) {
                bjgd2.f122640b.add(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo65171b(int i) {
        bjgd bjgd;
        if (i != 3 || (bjgd = this.f122830n) == null) {
            return super.mo65171b(i);
        }
        if (bjgd.mo65095a(false).f122654a) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo65304c(String str) {
        View view = this.f122682g;
        if (view != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            view.setContentDescription(str);
        }
    }

    /* renamed from: cH */
    public final void mo65136cH() {
        if (mo65173g()) {
            mo65302G();
        }
    }

    /* renamed from: cI */
    public final void mo65137cI() {
        if (mo65174h()) {
            mo65299E();
        }
    }

    /* renamed from: cJ */
    public final void mo65138cJ() {
        if (mo65173g()) {
            bjgd bjgd = this.f122830n;
            bjgh bjgh = bjgd.f122647i;
            mo65305d((!bjgh.f122654a && !bjgh.f122656c) ? null : bjgd.mo65127m());
        }
    }

    /* renamed from: cK */
    public final void mo65139cK() {
        if (mo65173g()) {
            mo65303H();
        }
    }

    /* renamed from: d */
    public final void mo65305d(String str) {
        boolean z = !TextUtils.isEmpty(str);
        if (!z) {
            str = null;
        }
        mo65306e(str);
        this.f122830n.f122647i.f122657d = z;
    }

    /* renamed from: e */
    public final void mo65140e() {
        if (mo65173g()) {
            mo65156C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo65306e(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo65184p() {
        bjgh bjgh;
        super.mo65184p();
        bjgd bjgd = this.f122830n;
        if (bjgd != null && (bjgh = bjgd.f122647i) != null && bjgh.f122657d) {
            mo65306e(bjgd.mo65127m());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo65187s() {
        super.mo65187s();
        bjgd bjgd = this.f122830n;
        if (bjgd != null) {
            bjgd.mo65116c(this);
        }
    }

    /* renamed from: y */
    public final boolean mo65195y() {
        bjgd bjgd = this.f122830n;
        return (bjgd == null || bjgd.f122649k != 3) && super.mo65195y();
    }

    /* renamed from: a */
    public final boolean mo65135a(bwpd bwpd) {
        int a = bwpc.m122177a(bwpd.f160525c);
        if (a == 0) {
            a = 1;
        }
        return mo65164a(a);
    }
}
