package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {

    /* renamed from: b */
    public final Rect f151064b = new Rect();

    /* renamed from: c */
    public WeakReference f151065c;

    public BottomAppBar$Behavior() {
        new bhes(this);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f151065c = new WeakReference((bhet) view);
        throw null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo778a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        bhet bhet = (bhet) view;
        throw null;
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new bhes(this);
    }
}
