package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: zu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1552zu implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        C1554zw zwVar = (C1554zw) obj;
        C1554zw zwVar2 = (C1554zw) obj2;
        RecyclerView recyclerView = zwVar.f27809d;
        if (recyclerView != null) {
            z = false;
        } else {
            z = true;
        }
        if (zwVar2.f27809d != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            boolean z3 = zwVar.f27806a;
            if (z3 != zwVar2.f27806a) {
                return !z3 ? 1 : -1;
            }
            int i = zwVar2.f27807b - zwVar.f27807b;
            if (i != 0) {
                return i;
            }
            int i2 = zwVar.f27808c - zwVar2.f27808c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        } else if (recyclerView != null) {
            return -1;
        } else {
            return 1;
        }
    }
}
