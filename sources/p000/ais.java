package p000;

import android.view.View;
import java.util.Comparator;

/* renamed from: ais */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ais implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float D = C1280ps.m19869D((View) obj);
        float D2 = C1280ps.m19869D((View) obj2);
        if (D <= D2) {
            return D < D2 ? 1 : 0;
        }
        return -1;
    }
}
