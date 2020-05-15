package p000;

import android.graphics.Rect;
import android.support.p002v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: sm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1355sm implements C1270pi {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27030a;

    public C1355sm(C1372tc tcVar) {
        this.f27030a = tcVar;
    }

    /* renamed from: a */
    public final C1296qh mo761a(View view, C1296qh qhVar) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int b = qhVar.mo15733b();
        C1372tc tcVar = this.f27030a;
        int b2 = qhVar.mo15733b();
        ActionBarContextView actionBarContextView = tcVar.f27107l;
        int i3 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tcVar.f27107l.getLayoutParams();
            boolean z3 = true;
            if (tcVar.f27107l.isShown()) {
                if (tcVar.f27074B == null) {
                    tcVar.f27074B = new Rect();
                    tcVar.f27075C = new Rect();
                }
                Rect rect = tcVar.f27074B;
                Rect rect2 = tcVar.f27075C;
                rect.set(qhVar.mo15731a(), qhVar.mo15733b(), qhVar.mo15735c(), qhVar.mo15736d());
                ViewGroup viewGroup = tcVar.f27112q;
                if (aek.f339a != null) {
                    try {
                        aek.f339a.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                C1296qh u = C1280ps.m19939u(tcVar.f27112q);
                if (u != null) {
                    i = u.mo15731a();
                } else {
                    i = 0;
                }
                if (u != null) {
                    i2 = u.mo15735c();
                } else {
                    i2 = 0;
                }
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 > 0 && tcVar.f27113r == null) {
                    tcVar.f27113r = new View(tcVar.f27100e);
                    tcVar.f27113r.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = i2;
                    tcVar.f27112q.addView(tcVar.f27113r, -1, layoutParams);
                } else {
                    View view2 = tcVar.f27113r;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i && marginLayoutParams2.rightMargin == i2)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i;
                            marginLayoutParams2.rightMargin = i2;
                            tcVar.f27113r.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = tcVar.f27113r;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    View view4 = tcVar.f27113r;
                    view4.setBackgroundColor((C1280ps.m19936r(view4) & 8192) != 0 ? C1133kh.m17843b(tcVar.f27100e, C0126R.color.abc_decor_view_status_guard_light) : C1133kh.m17843b(tcVar.f27100e, C0126R.color.abc_decor_view_status_guard));
                }
                if (!tcVar.f27116u && z3) {
                    z = z3;
                    z3 = z2;
                    b2 = 0;
                } else {
                    z = z3;
                    z3 = z2;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                tcVar.f27107l.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = tcVar.f27113r;
        if (view5 != null) {
            if (z) {
                i3 = 0;
            }
            view5.setVisibility(i3);
        }
        return C1280ps.m19881a(view, b != b2 ? qhVar.mo15732a(qhVar.mo15731a(), b2, qhVar.mo15735c(), qhVar.mo15736d()) : qhVar);
    }
}
