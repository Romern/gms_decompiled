package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: bjkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkh {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac  */
    /* renamed from: a */
    public static void m103770a(bjkk bjkk, View view) {
        boolean z;
        FrameLayout.LayoutParams layoutParams;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean a;
        boolean z5;
        int i;
        bjka b = bjkk.f122859d.mo65320b();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int i2 = 0;
        boolean z6 = true;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            z = false;
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            z = true;
        }
        boolean a2 = z | bjko.m103789a(bjkk, b, layoutParams);
        if (bjkk.mo65338a(b, 10)) {
            layoutParams.gravity = bjke.m103764a((bwwz) b.mo65324a(10, bjkk.f122860e, bwwz.class), 49);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z7 = a2 | z2;
        bjka a3 = b.mo65323a(14);
        if (a3 != null) {
            bjka a4 = b.mo65323a(1);
            int i3 = bjkk.f122860e;
            boolean a5 = bjkk.mo65338a(a3, 2);
            if (a4 != null) {
                if (bjkk.mo65338a(a4, 1)) {
                    z3 = true;
                    if (!a5) {
                        if (!z3) {
                            i = a4 != null ? bjkl.m103778a(a4, 1, i3) : 0;
                            layoutParams.topMargin = i + bjkl.m103778a(a3, 2, i3);
                            z4 = true;
                            a = bjkk.mo65338a(a3, 1);
                            if (a4 != null) {
                                if (bjkk.mo65338a(a4, 3)) {
                                    z5 = true;
                                    if (a) {
                                        if (!z5) {
                                            if (a4 != null) {
                                                i2 = bjkl.m103778a(a4, 3, i3);
                                            }
                                            C1260oz.m19821a(layoutParams, i2 + bjkl.m103778a(a3, 1, i3));
                                            z7 |= z6;
                                        }
                                    } else if (!z5) {
                                        z6 = z4;
                                        z7 |= z6;
                                    }
                                    i2 = C1260oz.m19820a(layoutParams);
                                    C1260oz.m19821a(layoutParams, i2 + bjkl.m103778a(a3, 1, i3));
                                    z7 |= z6;
                                }
                            }
                            z5 = false;
                            if (a) {
                            }
                            i2 = C1260oz.m19820a(layoutParams);
                            C1260oz.m19821a(layoutParams, i2 + bjkl.m103778a(a3, 1, i3));
                            z7 |= z6;
                        }
                    } else if (!z3) {
                        z4 = false;
                        a = bjkk.mo65338a(a3, 1);
                        if (a4 != null) {
                        }
                        z5 = false;
                        if (a) {
                        }
                        i2 = C1260oz.m19820a(layoutParams);
                        C1260oz.m19821a(layoutParams, i2 + bjkl.m103778a(a3, 1, i3));
                        z7 |= z6;
                    }
                    i = layoutParams.topMargin;
                    layoutParams.topMargin = i + bjkl.m103778a(a3, 2, i3);
                    z4 = true;
                    a = bjkk.mo65338a(a3, 1);
                    if (a4 != null) {
                    }
                    z5 = false;
                    if (a) {
                    }
                    i2 = C1260oz.m19820a(layoutParams);
                    C1260oz.m19821a(layoutParams, i2 + bjkl.m103778a(a3, 1, i3));
                    z7 |= z6;
                }
            }
            z3 = false;
            if (!a5) {
            }
            i = layoutParams.topMargin;
            layoutParams.topMargin = i + bjkl.m103778a(a3, 2, i3);
            z4 = true;
            a = bjkk.mo65338a(a3, 1);
            if (a4 != null) {
            }
            z5 = false;
            if (a) {
            }
            i2 = C1260oz.m19820a(layoutParams);
            C1260oz.m19821a(layoutParams, i2 + bjkl.m103778a(a3, 1, i3));
            z7 |= z6;
        }
        if (z7) {
            view.setLayoutParams(layoutParams);
        }
    }
}
