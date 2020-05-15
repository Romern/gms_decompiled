package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;

/* renamed from: bjkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkg {
    /* renamed from: a */
    static int m103767a(bwwy bwwy) {
        bwwy bwwy2 = bwwy.ALIGNMENT_UNKNOWN;
        bwxb bwxb = bwxb.DIRECTION_UNKNOWN;
        switch (bwwy.ordinal()) {
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 3;
            case 7:
                throw new IllegalArgumentException("Stretch not yet supported");
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public static void m103768a(bjkk bjkk, View view) {
        boolean z;
        FlexboxLayout.LayoutParams layoutParams;
        boolean z2;
        float f;
        float f2;
        bjka b = bjkk.f122859d.mo65320b();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof FlexboxLayout.LayoutParams) {
            layoutParams = (FlexboxLayout.LayoutParams) layoutParams2;
            z = false;
        } else {
            layoutParams = new FlexboxLayout.LayoutParams(-1, -2);
            z = true;
        }
        boolean z3 = bjko.m103789a(bjkk, b, layoutParams) ? true : z;
        bjka a = b.mo65323a(12);
        if (a != null) {
            int i = bjkk.f122860e;
            if (bjkk.mo65338a(a, 1)) {
                layoutParams.f7739a = a.mo65328b(1, i);
                z2 = true;
            } else {
                z2 = false;
            }
            if (bjkk.mo65338a(a, 2)) {
                if (a.mo65327a(2, i)) {
                    f2 = a.mo65328b(2, i);
                } else {
                    f2 = 1.0f;
                }
                layoutParams.f7740b = f2;
                z2 = true;
            }
            if (bjkk.mo65338a(a, 3)) {
                if (a.mo65327a(3, i)) {
                    f = a.mo65328b(3, i);
                } else {
                    f = -1.0f;
                }
                layoutParams.f7742d = f;
                z2 = true;
            }
            if (bjkk.mo65338a(a, 4)) {
                layoutParams.f7741c = m103767a((bwwy) a.mo65329b(4, i, bwwy.class));
            } else if (!z2 && !z3) {
                return;
            }
        } else if (!z3) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static void m103769a(bjkk bjkk, FlexboxLayout flexboxLayout) {
        bjkp.m103790a(bjkk, flexboxLayout);
        bjka b = bjkk.f122859d.mo65320b();
        if (bjkk.mo65338a(b, 9)) {
            bwwy bwwy = bwwy.ALIGNMENT_UNKNOWN;
            bwxb bwxb = bwxb.DIRECTION_UNKNOWN;
            int ordinal = ((bwxb) b.mo65329b(9, bjkk.f122860e, bwxb.class)).ordinal();
            int i = 3;
            if (ordinal == 2) {
                i = 1;
            } else if (ordinal == 3) {
                i = 2;
            } else if (ordinal != 4) {
                i = 0;
            }
            flexboxLayout.mo6307d(i);
        }
        if (bjkk.mo65338a(b, 10)) {
            bwwz bwwz = (bwwz) b.mo65324a(10, bjkk.f122860e, bwwz.class);
            boolean f = flexboxLayout.mo6310f();
            bwwy bwwy2 = bwwy.ALIGNMENT_START;
            if (f) {
                if ((bwwz.f161310a & 1) != 0 && (bwwy2 = bwwy.m122385a(bwwz.f161311b)) == null) {
                    bwwy2 = bwwy.ALIGNMENT_UNKNOWN;
                }
            } else if ((bwwz.f161310a & 2) != 0 && (bwwy2 = bwwy.m122385a(bwwz.f161312c)) == null) {
                bwwy2 = bwwy.ALIGNMENT_UNKNOWN;
            }
            int a = m103767a(bwwy2);
            if (flexboxLayout.f7722a != a) {
                flexboxLayout.f7722a = a;
                flexboxLayout.requestLayout();
            }
        }
    }
}
