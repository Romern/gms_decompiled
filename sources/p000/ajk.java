package p000;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: ajk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajk extends C1337rv {

    /* renamed from: a */
    public final int f646a;

    /* renamed from: b */
    public C1338rw f647b;

    /* renamed from: c */
    final /* synthetic */ DrawerLayout f648c;

    /* renamed from: d */
    private final Runnable f649d = new ajj(this);

    public ajk(DrawerLayout drawerLayout, int i) {
        this.f648c = drawerLayout;
        this.f646a = i;
    }

    /* renamed from: a */
    public final int mo818a(View view) {
        if (this.f648c.mo1923d(view)) {
            return view.getWidth();
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo824b() {
        return false;
    }

    /* renamed from: c */
    public final int mo826c(View view, int i) {
        if (this.f648c.mo1915a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f648c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    /* renamed from: d */
    public final int mo828d(View view, int i) {
        return view.getTop();
    }

    /* renamed from: e */
    public final void mo830e() {
        int i = 3;
        if (this.f646a == 3) {
            i = 5;
        }
        View a = this.f648c.mo1910a(i);
        if (a != null) {
            this.f648c.mo1926e(a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      androidx.drawerlayout.widget.DrawerLayout.a(int, int):void
      androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, float):void
      androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, int):boolean
      androidx.drawerlayout.widget.DrawerLayout.a(android.view.View, boolean):void */
    /* renamed from: a */
    public final void mo819a(int i) {
        View rootView;
        DrawerLayout drawerLayout = this.f648c;
        View view = this.f647b.f26943k;
        int i2 = drawerLayout.f1512b.f26933a;
        int i3 = drawerLayout.f1513c.f26933a;
        int i4 = 2;
        if (i2 == 1) {
            i4 = 1;
        } else if (i3 == 1) {
            i4 = 1;
        } else if (!(i2 == 2 || i3 == 2)) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f = ((ajh) view.getLayoutParams()).f642b;
            if (f == 0.0f) {
                ajh ajh = (ajh) view.getLayoutParams();
                if ((ajh.f644d & 1) == 1) {
                    ajh.f644d = 0;
                    drawerLayout.mo1913a(view, false);
                    drawerLayout.mo1919b(view);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                ajh ajh2 = (ajh) view.getLayoutParams();
                if ((ajh2.f644d & 1) == 0) {
                    ajh2.f644d = 1;
                    drawerLayout.mo1913a(view, true);
                    drawerLayout.mo1919b(view);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != drawerLayout.f1514d) {
            drawerLayout.f1514d = i4;
        }
    }

    /* renamed from: b */
    public final boolean mo825b(View view, int i) {
        return this.f648c.mo1923d(view) && this.f648c.mo1915a(view, this.f646a) && this.f648c.mo1908a(view) == 0;
    }

    /* renamed from: d */
    public final void mo829d() {
        this.f648c.removeCallbacks(this.f649d);
    }

    /* renamed from: c */
    public final void mo827c() {
        this.f648c.postDelayed(this.f649d, 160);
    }

    /* renamed from: a */
    public final void mo820a(int i, int i2) {
        View view;
        if ((i & 1) != 1) {
            view = this.f648c.mo1910a(5);
        } else {
            view = this.f648c.mo1910a(3);
        }
        if (view != null && this.f648c.mo1908a(view) == 0) {
            this.f647b.mo15826a(view, i2);
        }
    }

    /* renamed from: a */
    public final void mo821a(View view, float f, float f2) {
        float f3 = ((ajh) view.getLayoutParams()).f642b;
        int width = view.getWidth();
        int i = 0;
        if (!this.f648c.mo1915a(view, 3)) {
            i = this.f648c.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                i -= width;
            }
        } else if (f <= 0.0f && (f != 0.0f || f3 <= 0.5f)) {
            i = -width;
        }
        this.f647b.mo15828a(i, view.getTop());
        this.f648c.invalidate();
    }

    /* renamed from: a */
    public final void mo822a(View view, int i) {
        ((ajh) view.getLayoutParams()).f643c = false;
        mo830e();
    }

    /* renamed from: a */
    public final void mo823a(View view, int i, int i2) {
        float f;
        int width = view.getWidth();
        if (!this.f648c.mo1915a(view, 3)) {
            f = ((float) (this.f648c.getWidth() - i)) / ((float) width);
        } else {
            f = ((float) (i + width)) / ((float) width);
        }
        this.f648c.mo1912a(view, f);
        view.setVisibility(f == 0.0f ? 4 : 0);
        this.f648c.invalidate();
    }
}
