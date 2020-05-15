package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: bhfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfh extends C1337rv {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f118469a;

    public bhfh(BottomSheetBehavior bottomSheetBehavior) {
        this.f118469a = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final int mo15824a() {
        BottomSheetBehavior bottomSheetBehavior = this.f118469a;
        return bottomSheetBehavior.f151096j ? bottomSheetBehavior.f151102p : bottomSheetBehavior.f151094h;
    }

    /* renamed from: b */
    public final boolean mo825b(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f118469a;
        int i2 = bottomSheetBehavior.f151099m;
        if (i2 == 1 || bottomSheetBehavior.f151106t) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f151105s == i) {
            WeakReference weakReference = bottomSheetBehavior.f151104r;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = this.f118469a.f151103q;
        return weakReference2 != null && weakReference2.get() == view;
    }

    /* renamed from: c */
    public final int mo826c(View view, int i) {
        return view.getLeft();
    }

    /* renamed from: d */
    public final int mo828d(View view, int i) {
        int i2;
        int c = this.f118469a.mo71036c();
        BottomSheetBehavior bottomSheetBehavior = this.f118469a;
        if (!bottomSheetBehavior.f151096j) {
            i2 = bottomSheetBehavior.f151094h;
        } else {
            i2 = bottomSheetBehavior.f151102p;
        }
        return C1183mc.m19626a(i, c, i2);
    }

    /* renamed from: a */
    public final void mo819a(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f118469a;
            if (bottomSheetBehavior.f151098l) {
                bottomSheetBehavior.mo71039d(1);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void
     arg types: [android.view.View, int, int, int]
     candidates:
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.content.Context, android.util.AttributeSet, boolean, android.content.res.ColorStateList):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int, int, boolean):void */
    /* renamed from: a */
    public final void mo821a(View view, float f, float f2) {
        int i;
        int i2;
        int i3 = 4;
        if (f2 >= 0.0f) {
            BottomSheetBehavior bottomSheetBehavior = this.f118469a;
            if (bottomSheetBehavior.f151096j && bottomSheetBehavior.mo71031a(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior2 = this.f118469a;
                    if (top <= (bottomSheetBehavior2.f151102p + bottomSheetBehavior2.mo71036c()) / 2) {
                        BottomSheetBehavior bottomSheetBehavior3 = this.f118469a;
                        if (bottomSheetBehavior3.f151087a) {
                            i = bottomSheetBehavior3.f151091e;
                        } else if (Math.abs(view.getTop() - this.f118469a.f151090d) < Math.abs(view.getTop() - this.f118469a.f151092f)) {
                            i = this.f118469a.f151090d;
                        } else {
                            i = this.f118469a.f151092f;
                            i3 = 6;
                        }
                        i3 = 3;
                    }
                }
                i = this.f118469a.f151102p;
                i3 = 5;
            } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                BottomSheetBehavior bottomSheetBehavior4 = this.f118469a;
                if (!bottomSheetBehavior4.f151087a) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f118469a.f151092f) < Math.abs(top2 - this.f118469a.f151094h)) {
                        i = this.f118469a.f151092f;
                        i3 = 6;
                    } else {
                        bottomSheetBehavior4 = this.f118469a;
                    }
                }
                i = bottomSheetBehavior4.f151094h;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior5 = this.f118469a;
                if (!bottomSheetBehavior5.f151087a) {
                    int i4 = bottomSheetBehavior5.f151092f;
                    if (top3 >= i4) {
                        if (Math.abs(top3 - i4) < Math.abs(top3 - this.f118469a.f151094h)) {
                            i = this.f118469a.f151092f;
                            i3 = 6;
                        } else {
                            i = this.f118469a.f151094h;
                        }
                    } else if (top3 < Math.abs(top3 - bottomSheetBehavior5.f151094h)) {
                        i = this.f118469a.f151090d;
                        i3 = 3;
                    } else {
                        i = this.f118469a.f151092f;
                        i3 = 6;
                    }
                } else if (Math.abs(top3 - bottomSheetBehavior5.f151091e) < Math.abs(top3 - this.f118469a.f151094h)) {
                    i = this.f118469a.f151091e;
                    i3 = 3;
                } else {
                    i = this.f118469a.f151094h;
                }
            }
        } else {
            BottomSheetBehavior bottomSheetBehavior6 = this.f118469a;
            if (!bottomSheetBehavior6.f151087a) {
                int top4 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior7 = this.f118469a;
                int i5 = bottomSheetBehavior7.f151092f;
                if (top4 <= i5) {
                    i2 = bottomSheetBehavior7.f151090d;
                } else {
                    i = i5;
                    i3 = 6;
                }
            } else {
                i2 = bottomSheetBehavior6.f151091e;
            }
            i3 = 3;
        }
        this.f118469a.mo71028a(view, i3, i, true);
    }

    /* renamed from: a */
    public final void mo823a(View view, int i, int i2) {
        this.f118469a.mo71040e(i2);
    }
}
