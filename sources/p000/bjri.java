package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;

/* renamed from: bjri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjri extends bjjk {
    public bjri(bjgv bjgv) {
        super(bjgv, bjqr.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        return new FlexboxLayout(this.f122676a.f122692a.f122732i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        bjkg.m103768a(bjgt.f122686k, view);
        super.mo65212a(bjgt, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkg.m103769a(this.f122686k, (FlexboxLayout) view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bxam.f161719c;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bxwc bxwc = ((bxam) b).f161721a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bjgv bjgv = this.f122676a;
            mo65160a(bjgv.f122694c.mo65206a(bjgv, (bwxl) bxwc.get(i)));
        }
    }
}
