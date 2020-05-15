package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: e */
    private boolean f111261e = false;

    public OpenSearchBar$ScrollingViewBehavior() {
    }

    /* renamed from: a */
    public final boolean mo777a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean a = super.mo777a(coordinatorLayout, view, view2);
        if (!this.f111261e && (view2 instanceof AppBarLayout)) {
            this.f111261e = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            bhek.m100715a(appBarLayout, 0.0f);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo60440b() {
        return true;
    }

    public OpenSearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
