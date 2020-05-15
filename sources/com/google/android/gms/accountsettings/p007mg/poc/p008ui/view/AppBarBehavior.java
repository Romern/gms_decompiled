package com.google.android.gms.accountsettings.p007mg.poc.p008ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.ui.view.AppBarBehavior */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppBarBehavior extends AppBarLayout.Behavior {

    /* renamed from: a */
    public eyu f7780a;

    /* renamed from: d */
    private boolean f7781d;

    public AppBarBehavior(Context context, AttributeSet attributeSet) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo770a(View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        eyu eyu = this.f7780a;
        if (eyu == null || !eyu.mo10597a()) {
            return false;
        }
        this.f7781d = true;
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo776a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if (this.f7781d && motionEvent.getActionMasked() == 0) {
            this.f7781d = false;
        }
        return super.mo776a(coordinatorLayout, appBarLayout, motionEvent);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo778a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return mo778a(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
    }

    /* renamed from: a */
    public final boolean mo6334a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return !this.f7781d && super.mo778a(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }
}
