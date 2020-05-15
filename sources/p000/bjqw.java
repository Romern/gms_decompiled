package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqw extends bjjk {

    /* renamed from: o */
    private bwxl f123152o;

    /* renamed from: p */
    private bxaf f123153p;

    public bjqw(bjgv bjgv) {
        super(bjgv, bjqu.class);
        this.f122685j.mo65352a(new bjqv(this));
    }

    /* renamed from: I */
    private final void m104394I() {
        bwxl bwxl;
        bwxl bwxl2;
        if (!((bjqs) ((bjqu) ((bjjm) this).f122830n)).f123148l) {
            bxaf bxaf = this.f123153p;
            if ((bxaf.f161684a & 1) != 0) {
                bwxl = bxaf.f161685b;
                if (bwxl == null) {
                    bwxl = bwxl.f161383i;
                }
                bwxl2 = this.f123152o;
                if (bwxl2 == null || bwxl.f161386b != bwxl2.f161386b) {
                    this.f123152o = bwxl;
                    mo65191v();
                    bjgv bjgv = this.f122676a;
                    mo65160a(bjgv.f122694c.mo65206a(bjgv, this.f123152o));
                }
                return;
            }
        }
        bwxl = this.f123153p.f161686c;
        if (bwxl == null) {
            bwxl = bwxl.f161383i;
        }
        bwxl2 = this.f123152o;
        if (bwxl2 == null) {
            return;
        }
        this.f123152o = bwxl;
        mo65191v();
        bjgv bjgv2 = this.f122676a;
        mo65160a(bjgv2.f122694c.mo65206a(bjgv2, this.f123152o));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        return (ViewGroup) this.f122676a.f122692a.mo65227a().inflate((int) C0126R.C0128layout.wallet_view_ripple_frame_layout, (ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104394I();
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        bjkh.m103770a(bjgt.f122686k, view);
        super.mo65212a(bjgt, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkk bjkk = this.f122686k;
        bjjz bjjz = bjkk.f122859d;
        bjkp.m103791a(bjkk, bjjz.mo65320b(), view);
        bjka a = bjjz.mo65318a();
        bjkp.m103793b(bjkk, a, view);
        bjkp.m103792a(bjkk, a, view, false, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        this.f123152o = null;
        bxvj bxvj = bxaf.f161682e;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123153p = (bxaf) b;
        m104394I();
    }
}
