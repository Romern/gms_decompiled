package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: avl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avl implements C1270pi {

    /* renamed from: a */
    final /* synthetic */ ViewPager f2379a;

    /* renamed from: b */
    private final Rect f2380b = new Rect();

    public avl(ViewPager viewPager) {
        this.f2379a = viewPager;
    }

    /* renamed from: a */
    public final C1296qh mo761a(View view, C1296qh qhVar) {
        C1296qh a = C1280ps.m19881a(view, qhVar);
        if (a.mo15739f()) {
            return a;
        }
        Rect rect = this.f2380b;
        rect.left = a.mo15731a();
        rect.top = a.mo15733b();
        rect.right = a.mo15735c();
        rect.bottom = a.mo15736d();
        int childCount = this.f2379a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1296qh b = C1280ps.m19904b(this.f2379a.getChildAt(i), a);
            rect.left = Math.min(b.mo15731a(), rect.left);
            rect.top = Math.min(b.mo15733b(), rect.top);
            rect.right = Math.min(b.mo15735c(), rect.right);
            rect.bottom = Math.min(b.mo15736d(), rect.bottom);
        }
        C1289qa qaVar = new C1289qa(a);
        qaVar.mo15718a(C1166ln.m19403a(rect));
        return qaVar.mo15717a();
    }
}
