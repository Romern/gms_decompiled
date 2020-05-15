package p000;

import android.view.View;
import java.util.Comparator;

/* renamed from: avu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avu implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        avo avo = (avo) ((View) obj).getLayoutParams();
        avo avo2 = (avo) ((View) obj2).getLayoutParams();
        boolean z = avo.f2386a;
        if (z == avo2.f2386a) {
            return avo.f2390e - avo2.f2390e;
        }
        return !z ? -1 : 1;
    }
}
