package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: bjqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqz extends bjjk implements bjqt {

    /* renamed from: o */
    private bxai f123155o;

    /* renamed from: p */
    private bwxl f123156p = null;

    /* renamed from: q */
    private boolean f123157q = false;

    public bjqz(bjgv bjgv) {
        super(bjgv, bjqr.class);
    }

    /* renamed from: I */
    private final void m104406I() {
        long j = ((bjqy) ((bjhy) ((bjqr) ((bjjm) this).f122830n)).f122754m).f123154d;
        bwxl bwxl = this.f123156p;
        if (bwxl == null || bwxl.f161388d != j) {
            mo65191v();
            bxwc bxwc = this.f123155o.f161693b;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                bwxl bwxl2 = (bwxl) bxwc.get(i);
                i++;
                if (bwxl2.f161388d == j) {
                    this.f123156p = bwxl2;
                    bjgv bjgv = this.f122676a;
                    mo65160a(bjgv.f122694c.mo65206a(bjgv, bwxl2));
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private final void m104407c(boolean z) {
        bjqy bjqy = (bjqy) ((bjhy) ((bjqr) ((bjjm) this).f122830n)).f122754m;
        if (!z && bjqy.mo65464e()) {
            this.f123157q = false;
            m104406I();
        } else if (!this.f123157q) {
            this.f123157q = true;
            mo65191v();
            this.f123156p = null;
            bxwc bxwc = this.f123155o.f161692a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bjgv bjgv = this.f122676a;
                mo65160a(bjgv.f122694c.mo65206a(bjgv, (bwxl) bxwc.get(i)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        LinearLayout linearLayout = new LinearLayout(this.f122676a.f122692a.f122732i);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        if (this.f123157q) {
            return;
        }
        if (!((bjqy) ((bjhy) ((bjqr) ((bjjm) this).f122830n)).f122754m).mo65464e()) {
            m104407c(true);
        } else {
            m104406I();
        }
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        bjkh.m103770a(bjgt.f122686k, view);
        super.mo65212a(bjgt, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo65186r() {
        ArrayList arrayList = ((bjqr) ((bjjm) this).f122830n).f123146p;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        super.mo65186r();
    }

    /* renamed from: a */
    public final void mo65461a(bjqs bjqs) {
        m104407c(!this.f123157q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        boolean z;
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bxai.f161690e;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bxai bxai = (bxai) b;
        this.f123155o = bxai;
        int a = bxah.m122490a(bxai.f161694c);
        if (a == 0) {
            a = 1;
        }
        if (a != 2) {
            z = true;
        } else {
            z = false;
        }
        m104407c(z);
        bjqr bjqr = (bjqr) ((bjjm) this).f122830n;
        if (bjqr.f123146p == null) {
            bjqr.f123146p = new ArrayList(1);
        }
        bjqr.f123146p.add(this);
    }
}
