package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {

    /* renamed from: g */
    public final bhna f151224g = new bhna(this);

    /* renamed from: a */
    public final boolean mo776a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        bhna bhna = this.f151224g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                bhnk.m101210a().mo64041b(bhna.f119096a);
            }
        } else if (coordinatorLayout.mo1874a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            bhnk.m101210a().mo64037a(bhna.f119096a);
        }
        return super.mo776a(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: d */
    public final boolean mo71017d(View view) {
        return view instanceof bhnc;
    }
}
