package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

/* renamed from: bjhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjhc implements bjgx, bjgz {

    /* renamed from: a */
    public final bjha f122717a = bjha.m103465a(this);

    /* renamed from: b */
    final CoordinatorLayout f122718b;

    /* renamed from: c */
    public bjgt f122719c;

    /* renamed from: d */
    public final ArrayList f122720d = new ArrayList(0);

    public bjhc(CoordinatorLayout coordinatorLayout) {
        this.f122718b = coordinatorLayout;
        coordinatorLayout.setClipChildren(false);
        this.f122718b.setClipToPadding(false);
    }

    /* renamed from: a */
    public final void mo65219a() {
        bjgt bjgt = this.f122719c;
        if (bjgt != null) {
            bjgt.mo65161a((bjgx) null);
            this.f122717a.mo65217a(this.f122719c.f122679d);
            this.f122719c = null;
        }
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
    }

    /* renamed from: b */
    public final void mo65220b() {
        ArrayList arrayList = this.f122720d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjgt) arrayList.get(i)).mo65161a((bjgx) null);
        }
        this.f122720d.clear();
    }

    /* renamed from: y */
    public final boolean mo65195y() {
        return true;
    }

    /* renamed from: a */
    public final void mo65210a(View view) {
        this.f122718b.removeView(view);
    }

    /* renamed from: a */
    public final void mo65211a(View view, int i) {
        this.f122718b.addView(view, i);
    }
}
