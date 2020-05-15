package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: bhep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhep extends C1337rv {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f118406a;

    /* renamed from: b */
    private int f118407b;

    /* renamed from: c */
    private int f118408c = -1;

    public bhep(SwipeDismissBehavior swipeDismissBehavior) {
        this.f118406a = swipeDismissBehavior;
    }

    /* renamed from: a */
    public final int mo818a(View view) {
        return view.getWidth();
    }

    /* renamed from: b */
    public final boolean mo825b(View view, int i) {
        int i2 = this.f118408c;
        return (i2 == -1 || i2 == i) && this.f118406a.mo71017d(view);
    }

    /* renamed from: c */
    public final int mo826c(View view, int i) {
        int i2;
        int i3;
        int h = C1280ps.m19923h(view);
        int i4 = this.f118406a.f151057b;
        if (i4 != 0) {
            if (i4 != 1) {
                i3 = this.f118407b - view.getWidth();
                i2 = this.f118407b + view.getWidth();
            } else if (h != 1) {
                i3 = this.f118407b - view.getWidth();
                i2 = this.f118407b;
            } else {
                i3 = this.f118407b;
                i2 = i3 + view.getWidth();
            }
        } else if (h == 1) {
            i3 = this.f118407b - view.getWidth();
            i2 = this.f118407b;
        } else {
            i3 = this.f118407b;
            i2 = i3 + view.getWidth();
        }
        return Math.min(Math.max(i3, i), i2);
    }

    /* renamed from: d */
    public final int mo828d(View view, int i) {
        return view.getTop();
    }

    /* renamed from: a */
    public final void mo819a(int i) {
        bhmx bhmx = this.f118406a.f151061f;
        if (bhmx == null) {
            return;
        }
        if (i != 0) {
            bhnk.m101210a().mo64037a(bhmx.f119094a.f119118m);
        } else {
            bhnk.m101210a().mo64041b(bhmx.f119094a.f119118m);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (java.lang.Math.abs(r6.getLeft() - r5.f118407b) >= java.lang.Math.round(((float) r6.getWidth()) * r5.f118406a.f151058c)) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r1 = r5.f118407b;
        r0 = false;
     */
    /* renamed from: a */
    public final void mo821a(View view, float f, float f2) {
        bhmx bhmx;
        this.f118408c = -1;
        int width = view.getWidth();
        boolean z = true;
        if (f != 0.0f) {
            int h = C1280ps.m19923h(view);
            int i = this.f118406a.f151057b;
            if (i != 2) {
                if (i != 0) {
                }
            }
        }
        int left = view.getLeft();
        int i2 = this.f118407b;
        int i3 = left < i2 ? i2 - width : i2 + width;
        if (this.f118406a.f151056a.mo15828a(i3, view.getTop())) {
            C1280ps.m19891a(view, new bher(this.f118406a, view, z));
        } else if (z && (bhmx = this.f118406a.f151061f) != null) {
            bhmx.mo64004a(view);
        }
    }

    /* renamed from: a */
    public final void mo822a(View view, int i) {
        this.f118408c = i;
        this.f118407b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    public final void mo823a(View view, int i, int i2) {
        float width = ((float) this.f118407b) + (((float) view.getWidth()) * this.f118406a.f151059d);
        float width2 = ((float) this.f118407b) + (((float) view.getWidth()) * this.f118406a.f151060e);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f < width2) {
            view.setAlpha(SwipeDismissBehavior.m117469a(1.0f - ((f - width) / (width2 - width))));
        } else {
            view.setAlpha(0.0f);
        }
    }
}
