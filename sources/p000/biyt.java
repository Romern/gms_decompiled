package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: biyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyt implements biyr {

    /* renamed from: a */
    public final TemplateLayout f122344a;

    /* renamed from: b */
    public final Window f122345b;

    /* renamed from: c */
    public final boolean f122346c;

    /* renamed from: d */
    public int f122347d = 0;

    public biyt(TemplateLayout templateLayout, Window window) {
        boolean z = false;
        this.f122344a = templateLayout;
        this.f122345b = window;
        if ((templateLayout instanceof bixl) && ((bixl) templateLayout).mo64840c()) {
            z = true;
        }
        this.f122346c = z;
    }

    /* renamed from: a */
    public static final void m103011a(Window window) {
        int i = Build.VERSION.SDK_INT;
        bizb.m103018a(window, 5634);
        bizb.m103022c(window, 5634);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
    }

    /* renamed from: a */
    public final void mo64892a(Window window, Context context) {
        int i = Build.VERSION.SDK_INT;
        bizb.m103021b(window, 5634);
        bizb.m103023d(window, 5634);
        int i2 = 0;
        if (this.f122346c) {
            int a = biyk.m102977a(context).mo64868a(context, biyj.CONFIG_NAVIGATION_BAR_BG_COLOR);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(a);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843857, 16843858});
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        if (this.f122344a instanceof bixl) {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            color2 = this.f122347d;
        } else {
            i2 = color;
        }
        window.setStatusBarColor(i2);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
    }
}
