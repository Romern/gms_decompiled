package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: bhdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdu implements C1314qz {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f118348a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f118349b;

    /* renamed from: c */
    final /* synthetic */ View f118350c;

    /* renamed from: d */
    final /* synthetic */ int f118351d;

    /* renamed from: e */
    final /* synthetic */ AppBarLayout.BaseBehavior f118352e;

    public bhdu(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f118352e = baseBehavior;
        this.f118348a = coordinatorLayout;
        this.f118349b = appBarLayout;
        this.f118350c = view;
        this.f118351d = i;
    }

    /* renamed from: a */
    public final boolean mo812a(View view) {
        this.f118352e.mo70996a(this.f118348a, this.f118349b, this.f118350c, this.f118351d, new int[]{0, 0});
        return true;
    }
}
