package p000;

import android.view.View;
import com.google.android.chimera.Fragment;

/* renamed from: bjlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlv extends bjjn {
    public bjlv(bjgv bjgv) {
        super(bjgv, bjgd.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        bjkh.m103770a(bjgt.f122686k, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Fragment mo65308b(bwxl bwxl) {
        int i;
        bjlu bjlu = (bjlu) mo65307F();
        if (bjlu == null) {
            if ((bwxl.f161385a & 32) != 0) {
                bxbb bxbb = bwxl.f161391g;
                if (bxbb == null) {
                    bxbb = bxbb.f161772d;
                }
                i = bxbb.f161774a;
            } else {
                i = 0;
            }
            long j = bwxl.f161386b;
            bjlu bjlu2 = new bjlu();
            bjlu2.setArguments(bjlx.m103882a(i, j));
            bjlu = bjlu2;
        }
        bjlu.f122948a = this;
        return bjlu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwoh.f160446c;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bjgv bjgv = this.f122676a;
        bjgy bjgy = bjgv.f122694c;
        bwxl bwxl3 = ((bwoh) b).f160448a;
        if (bwxl3 == null) {
            bwxl3 = bwxl.f161383i;
        }
        mo65160a(bjgy.mo65206a(bjgv, bwxl3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkp.m103790a(this.f122686k, view);
    }
}
