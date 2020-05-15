package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: bjkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkp {
    /* renamed from: a */
    public static void m103790a(bjkk bjkk, View view) {
        bjjz bjjz = bjkk.f122859d;
        m103791a(bjkk, bjjz.mo65320b(), view);
        bjka a = bjjz.mo65318a();
        m103793b(bjkk, a, view);
        m103792a(bjkk, a, view, false, false);
    }

    /* renamed from: b */
    public static void m103793b(bjkk bjkk, bjka bjka, View view) {
        float f;
        int i = 1;
        if (bjkk.mo65338a(bjka, 6)) {
            if (bjka.mo65327a(6, bjkk.f122860e)) {
                f = bjka.mo65328b(6, bjkk.f122860e);
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
        }
        if (bjkk.mo65338a(bjka, 13)) {
            bwyl bwyl = bwyl.MATERIAL_ELEVATION_UNKNOWN;
            int ordinal = ((bwyl) bjka.mo65329b(13, bjkk.f122860e, bwyl.class)).ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i = ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? 0 : 12 : 8 : 6;
                } else {
                    i = 3;
                }
            }
            C1280ps.m19918f(view, (float) bjkl.m103777a((float) i));
        }
    }

    /* renamed from: a */
    public static void m103791a(bjkk bjkk, bjka bjka, View view) {
        int i = bjkk.f122860e;
        if (bjkk.mo65338a(bjka, 4)) {
            view.setMinimumWidth(bjkl.m103778a(bjka, 4, i));
        }
        if (bjkk.mo65338a(bjka, 7)) {
            view.setMinimumHeight(bjkl.m103778a(bjka, 7, i));
        }
        bjka a = bjka.mo65323a(2);
        if (a != null) {
            int i2 = bjkk.f122860e;
            if (bjkk.mo65338a(a, 1, 2, 3, 4)) {
                C1280ps.m19885a(view, bjkl.m103778a(a, 3, i2), bjkl.m103778a(a, 1, i2), bjkl.m103778a(a, 4, i2), bjkl.m103778a(a, 2, i2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if ((r3.getDrawable(1) instanceof p000.bhlr) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ((r0 instanceof p000.bhlr) == false) goto L_0x0038;
     */
    /* renamed from: a */
    public static void m103792a(bjkk bjkk, bjka bjka, View view, boolean z, boolean z2) {
        if (bjkk.mo65338a(bjka, 1, 3, 2, 5)) {
            Drawable background = view.getBackground();
            if (z2) {
                int i = Build.VERSION.SDK_INT;
                if (background instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 1) {
                        if (rippleDrawable.getDrawable(0) instanceof bhlr) {
                        }
                    }
                }
            }
            if (z2) {
                int i2 = Build.VERSION.SDK_INT;
                bhlr bhlr = new bhlr();
                C1173lt.m19599a(bhlr, -1);
                background = new RippleDrawable(ColorStateList.valueOf(0), new bhlr(), bhlr);
            } else {
                background = new bhlr();
            }
            int i3 = bjkk.f122860e;
            int c = bjka.mo65330c(3, i3);
            int a = bjkl.m103778a(bjka, 5, i3);
            int a2 = bjkl.m103778a(bjka, 2, bjkk.f122860e);
            int i4 = !z ? a2 : 0;
            float f = (float) a2;
            bhlw a3 = bhlx.m101155a();
            a3.mo63975c(f);
            a3.mo63976d(f);
            float f2 = (float) i4;
            a3.mo63973a(f2);
            a3.mo63974b(f2);
            bhlx a4 = a3.mo63972a();
            bhlr a5 = bjkf.m103766a(background, 0);
            a5.mo63916a(a4);
            a5.mo63940a((float) a, c);
            a5.mo63948c(ColorStateList.valueOf(bjka.mo65330c(1, bjkk.f122860e)));
            if (z2) {
                ColorStateList a6 = bjkf.m103765a(bjkk, bjka);
                bjkf.m103766a(background, 1).mo63916a(a4);
                int i5 = Build.VERSION.SDK_INT;
                ((RippleDrawable) background).setColor(a6);
            }
            view.setBackground(background);
        }
    }
}
