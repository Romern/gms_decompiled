package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: bjlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlz extends bjjk {
    public bjlz(bjgv bjgv) {
        super(bjgv, bjgd.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this.f122676a.f122692a.f122732i);
        coordinatorLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        coordinatorLayout.setFitsSystemWindows(true);
        return coordinatorLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        bjkh.m103770a(bjgt.f122686k, view);
        super.mo65212a(bjgt, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwpe.f160527d;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bjgv bjgv = this.f122676a;
        bjgy bjgy = bjgv.f122694c;
        bwxl bwxl3 = ((bwpe) b).f160530b;
        if (bwxl3 == null) {
            bwxl3 = bwxl.f161383i;
        }
        mo65160a(bjgy.mo65206a(bjgv, bwxl3));
    }
}
