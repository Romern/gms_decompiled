package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: asd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asd extends atf {

    /* renamed from: u */
    private static final String[] f2115u = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: v */
    private static final Property f2116v = new arv(PointF.class, "topLeft");

    /* renamed from: w */
    private static final Property f2117w = new arw(PointF.class, "bottomRight");

    /* renamed from: x */
    private static final Property f2118x = new arx(PointF.class, "bottomRight");

    /* renamed from: y */
    private static final Property f2119y = new ary(PointF.class, "topLeft");

    /* renamed from: z */
    private static final Property f2120z = new arz(PointF.class, "position");

    static {
        new aru(PointF.class, "boundsOrigin");
    }

    /* renamed from: d */
    private static final void m1926d(atq atq) {
        View view = atq.f2216b;
        if (C1280ps.m19868C(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            atq.f2215a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            atq.f2215a.put("android:changeBounds:parent", atq.f2216b.getParent());
        }
    }

    /* renamed from: a */
    public final Animator mo2376a(ViewGroup viewGroup, atq atq, atq atq2) {
        int i;
        Animator animator;
        atq atq3 = atq;
        atq atq4 = atq2;
        if (atq3 == null || atq4 == null) {
            return null;
        }
        Map map = atq3.f2215a;
        Map map2 = atq4.f2215a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = atq4.f2216b;
        Rect rect = (Rect) atq3.f2215a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) atq4.f2215a.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) atq3.f2215a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) atq4.f2215a.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = i2 != i3 ? 1 : i4 != i5 ? 1 : 0;
            if (!(i6 == i7 && i8 == i9)) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        aty.m2102a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            if (i2 == i3 && i4 == i5) {
                animator = asu.m1976a(view, f2118x, asv.m1977a((float) i6, (float) i8, (float) i7, (float) i9));
            } else {
                animator = asu.m1976a(view, f2119y, asv.m1977a((float) i2, (float) i4, (float) i3, (float) i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            animator = asu.m1976a(view, f2120z, asv.m1977a((float) i2, (float) i4, (float) i3, (float) i5));
        } else {
            asc asc = new asc(view);
            ObjectAnimator a = asu.m1976a(asc, f2116v, asv.m1977a((float) i2, (float) i4, (float) i3, (float) i5));
            ObjectAnimator a2 = asu.m1976a(asc, f2117w, asv.m1977a((float) i6, (float) i8, (float) i7, (float) i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a, a2);
            animatorSet.addListener(new asa(asc));
            animator = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            atv.m2098a(viewGroup4, true);
            mo2463a(new asb(viewGroup4));
        }
        return animator;
    }

    /* renamed from: a */
    public final String[] mo2378a() {
        return f2115u;
    }

    /* renamed from: b */
    public final void mo2379b(atq atq) {
        m1926d(atq);
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        m1926d(atq);
    }
}
