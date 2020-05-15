package p000;

import com.google.android.gms.beacon.BleSighting;
import java.util.Comparator;

/* renamed from: ngt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ngt implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long a = ((BleSighting) obj).mo17302a() - ((BleSighting) obj2).mo17302a();
        if (a >= 0) {
            return a <= 0 ? 0 : 1;
        }
        return -1;
    }
}
