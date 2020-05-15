package p000;

import android.view.ViewGroup;

/* renamed from: bjko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjko {
    /* renamed from: a */
    public static boolean m103789a(bjkk bjkk, bjka bjka, ViewGroup.MarginLayoutParams marginLayoutParams) {
        boolean z;
        int i = bjkk.f122860e;
        if (bjkk.mo65338a(bjka, 3)) {
            marginLayoutParams.width = bjkl.m103779a(bjka, 3, i, marginLayoutParams.width);
            z = true;
        } else {
            z = false;
        }
        if (bjkk.mo65338a(bjka, 6)) {
            marginLayoutParams.height = bjkl.m103779a(bjka, 6, i, marginLayoutParams.height);
            z = true;
        }
        bjka a = bjka.mo65323a(1);
        if (a != null) {
            if (bjkk.mo65338a(a, 1)) {
                marginLayoutParams.topMargin = bjkl.m103778a(a, 1, i);
                z = true;
            }
            if (bjkk.mo65338a(a, 2)) {
                marginLayoutParams.bottomMargin = bjkl.m103778a(a, 2, i);
                z = true;
            }
            if (bjkk.mo65338a(a, 3)) {
                C1260oz.m19821a(marginLayoutParams, bjkl.m103778a(a, 3, i));
                z = true;
            }
            if (bjkk.mo65338a(a, 4)) {
                C1260oz.m19823b(marginLayoutParams, bjkl.m103778a(a, 4, i));
                return true;
            }
        }
        return z;
    }
}
