package p000;

import android.os.Build;
import android.support.p001v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: bjqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqp extends bjjk implements Runnable, bjqm, C1331rp {

    /* renamed from: o */
    private bwzo f123144o;

    public bjqp(bjgv bjgv) {
        super(bjgv, bjqn.class);
    }

    /* renamed from: a */
    private static int m104362a(NestedScrollView nestedScrollView) {
        if (nestedScrollView.getChildCount() != 0) {
            return nestedScrollView.getChildAt(0).getHeight();
        }
        return 0;
    }

    /* renamed from: c */
    private final void m104363c(int i) {
        m104364d(i + ((NestedScrollView) ((bjjk) this).f122827m).getScrollY());
    }

    /* renamed from: d */
    private final void m104364d(int i) {
        NestedScrollView nestedScrollView = (NestedScrollView) ((bjjk) this).f122827m;
        int a = m104362a(nestedScrollView);
        if (i <= 0) {
            i = 0;
        } else if (i >= a) {
            i = a;
        }
        nestedScrollView.scrollTo(nestedScrollView.getScrollX(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        NestedScrollView nestedScrollView = new NestedScrollView(this.f122676a.f122692a.f122732i);
        nestedScrollView.f1053a = this;
        nestedScrollView.mo1134a(true);
        return nestedScrollView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
    }

    /* renamed from: b */
    public final void mo65455b() {
        if (mo65174h()) {
            NestedScrollView nestedScrollView = (NestedScrollView) ((bjjk) this).f122827m;
            if (nestedScrollView.getChildCount() != 0) {
                m104364d(nestedScrollView.getChildAt(0).getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        int i = Build.VERSION.SDK_INT;
        ((bjjk) this).f122827m.setClipToOutline(true);
    }

    public final void run() {
        if (mo65174h()) {
            NestedScrollView nestedScrollView = (NestedScrollView) ((bjjk) this).f122827m;
            mo65458a(nestedScrollView, nestedScrollView.getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo65187s() {
        ArrayList arrayList;
        super.mo65187s();
        ViewGroup viewGroup = ((bjjk) this).f122827m;
        if (viewGroup != null) {
            viewGroup.removeCallbacks(this);
        }
        bjgd bjgd = ((bjjm) this).f122830n;
        if (bjgd != null && (arrayList = ((bjqn) bjgd).f123142p) != null) {
            arrayList.remove(this);
        }
    }

    /* renamed from: a */
    public final void mo65454a() {
        if (mo65174h()) {
            m104364d(0);
        }
    }

    /* renamed from: c */
    public final void mo65456c() {
        if (mo65174h()) {
            m104363c(-((bjjk) this).f122827m.getHeight());
        }
    }

    /* renamed from: a */
    public final void mo65458a(NestedScrollView nestedScrollView, int i) {
        bjgd bjgd;
        if (nestedScrollView.getChildCount() == 0) {
            return;
        }
        if (C1280ps.m19867B(nestedScrollView)) {
            nestedScrollView.post(this);
            return;
        }
        if (i >= m104362a(nestedScrollView) - nestedScrollView.getHeight() && (bjgd = ((bjjm) this).f122830n) != null) {
            bjqo bjqo = (bjqo) ((bjhy) ((bjqn) bjgd)).f122754m;
            if (bjqo.f123143d != 3) {
                bjqo.f123143d = 3;
                bjqo.mo65244a((bjgf) null);
            }
        }
        nestedScrollView.removeCallbacks(this);
    }

    /* renamed from: d */
    public final void mo65457d() {
        if (mo65174h()) {
            m104363c(((bjjk) this).f122827m.getHeight());
        }
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
        bjgd bjgd = ((bjjm) this).f122830n;
        if (bjgd != null) {
            bjqn bjqn = (bjqn) bjgd;
            if (bjqn.f123142p == null) {
                bjqn.f123142p = new ArrayList(1);
            }
            bjqn.f123142p.add(this);
        }
        bxvj bxvj = bwzo.f161628d;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bwzo bwzo = (bwzo) b;
        this.f123144o = bwzo;
        if ((bwzo.f161630a & 1) != 0) {
            bjgv bjgv = this.f122676a;
            bjgy bjgy = bjgv.f122694c;
            bwxl bwxl3 = bwzo.f161631b;
            if (bwxl3 == null) {
                bwxl3 = bwxl.f161383i;
            }
            mo65160a(bjgy.mo65206a(bjgv, bwxl3));
        }
    }
}
