package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1682xe6e79f6 extends aim {

    /* renamed from: a */
    private Rect f151179a;

    /* renamed from: b */
    private boolean f151180b;

    /* renamed from: c */
    private boolean f151181c;

    public C1682xe6e79f6() {
        this.f151180b = false;
        this.f151181c = true;
    }

    /* renamed from: a */
    private final boolean m117570a(View view, bhik bhik) {
        aip aip = (aip) bhik.getLayoutParams();
        if ((!this.f151180b && !this.f151181c) || aip.f601f != view.getId()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m117572b(View view, bhik bhik) {
        if (!m117570a(view, bhik)) {
            return false;
        }
        if (view.getTop() < (bhik.getHeight() / 2) + ((aip) bhik.getLayoutParams()).topMargin) {
            mo71162a(bhik);
            return true;
        }
        mo71163b(bhik);
        return true;
    }

    /* renamed from: d */
    private static boolean m117573d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof aip) {
            return ((aip) layoutParams).f596a instanceof BottomSheetBehavior;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo764a(aip aip) {
        if (aip.f603h == 0) {
            aip.f603h = 80;
        }
    }

    public C1682xe6e79f6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhiz.f118777a);
        this.f151180b = obtainStyledAttributes.getBoolean(0, false);
        this.f151181c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.a(android.view.View, bhik):boolean
     arg types: [com.google.android.material.appbar.AppBarLayout, bhik]
     candidates:
      com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.a(android.view.View, android.graphics.Rect):boolean
      aim.a(android.view.View, android.os.Parcelable):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View):void
      aim.a(android.view.View, android.graphics.Rect):boolean
      aim.a(android.view.View, android.view.View):boolean
      com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.a(android.view.View, bhik):boolean */
    /* renamed from: a */
    private final boolean m117571a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, bhik bhik) {
        if (!m117570a((View) appBarLayout, bhik)) {
            return false;
        }
        if (this.f151179a == null) {
            this.f151179a = new Rect();
        }
        Rect rect = this.f151179a;
        bhjf.m101008a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.mo70982f()) {
            mo71162a(bhik);
            return true;
        }
        mo71163b(bhik);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71163b(bhik bhik) {
        if (this.f151181c) {
            int i = bhik.f118723j;
            bhiy bhiy = bhik.f118725g;
        } else {
            int i2 = bhik.f118723j;
            bhiy bhiy2 = bhik.f118726h;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71162a(bhik bhik) {
        if (this.f151181c) {
            int i = bhik.f118723j;
            bhiy bhiy = bhik.f118724c;
        } else {
            int i2 = bhik.f118723j;
            bhiy bhiy2 = bhik.f118727i;
        }
        throw null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo771a(View view, Rect rect) {
        bhik bhik = (bhik) view;
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
        bhik bhik = (bhik) view;
        List b = coordinatorLayout.mo1875b(bhik);
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) b.get(i2);
            if (!(view2 instanceof AppBarLayout)) {
                if (m117573d(view2) && m117572b(view2, bhik)) {
                    break;
                }
            } else if (m117571a(coordinatorLayout, (AppBarLayout) view2, bhik)) {
                break;
            }
        }
        coordinatorLayout.mo1876b(bhik, i);
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo777a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        bhik bhik = (bhik) view;
        if (view2 instanceof AppBarLayout) {
            m117571a(coordinatorLayout, (AppBarLayout) view2, bhik);
            return false;
        } else if (!m117573d(view2)) {
            return false;
        } else {
            m117572b(view2, bhik);
            return false;
        }
    }
}
