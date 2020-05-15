package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: zn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1545zn extends abz {

    /* renamed from: a */
    final /* synthetic */ C1548zq f27756a;

    public C1545zn(C1548zq zqVar) {
        this.f27756a = zqVar;
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        C1548zq zqVar = this.f27756a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = zqVar.f27778l.computeVerticalScrollRange();
        int i3 = zqVar.f27777k;
        zqVar.f27779m = computeVerticalScrollRange - i3 > 0 ? i3 >= zqVar.f27767a : false;
        int computeHorizontalScrollRange = zqVar.f27778l.computeHorizontalScrollRange();
        int i4 = zqVar.f27776j;
        if (computeHorizontalScrollRange - i4 > 0) {
            z = i4 >= zqVar.f27767a;
        } else {
            z = false;
        }
        zqVar.f27780n = z;
        if (zqVar.f27779m) {
            float f = (float) i3;
            zqVar.f27771e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
            zqVar.f27770d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (zqVar.f27781o != 0) {
                zqVar.mo16632a(0);
                return;
            }
            return;
        }
        if (zqVar.f27780n) {
            float f2 = (float) i4;
            zqVar.f27774h = (int) ((f2 * (((float) computeHorizontalScrollOffset) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
            zqVar.f27773g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = zqVar.f27781o;
        if (i5 == 0 || i5 == 1) {
            zqVar.mo16632a(1);
        }
    }
}
