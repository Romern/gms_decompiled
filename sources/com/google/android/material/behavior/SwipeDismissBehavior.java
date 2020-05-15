package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwipeDismissBehavior extends aim {

    /* renamed from: a */
    public C1338rw f151056a;

    /* renamed from: b */
    public int f151057b = 2;

    /* renamed from: c */
    public float f151058c = 0.5f;

    /* renamed from: d */
    public float f151059d = 0.0f;

    /* renamed from: e */
    public float f151060e = 0.5f;

    /* renamed from: f */
    public bhmx f151061f;

    /* renamed from: g */
    private boolean f151062g;

    /* renamed from: h */
    private final C1337rv f151063h = new bhep(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public static float m117469a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    /* renamed from: b */
    public final boolean mo780b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C1338rw rwVar = this.f151056a;
        if (rwVar == null) {
            return false;
        }
        rwVar.mo15833b(motionEvent);
        return true;
    }

    /* renamed from: d */
    public boolean mo71017d(View view) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (C1280ps.m19917f(view) != 0) {
            return false;
        }
        C1280ps.m19906b(view, 1);
        C1280ps.m19910c(view, 1048576);
        if (!mo71017d(view)) {
            return false;
        }
        C1280ps.m19898a(view, C1298qj.f26868i, new bheq(this));
        return false;
    }

    /* renamed from: a */
    public boolean mo776a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f151062g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo1874a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f151062g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f151062g = false;
        }
        if (!z) {
            return false;
        }
        if (this.f151056a == null) {
            this.f151056a = C1338rw.m20124a(coordinatorLayout, this.f151063h);
        }
        return this.f151056a.mo15829a(motionEvent);
    }
}
