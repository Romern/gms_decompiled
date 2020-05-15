package p000;

import android.content.pm.FeatureInfo;
import java.util.Comparator;

/* renamed from: src */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class src implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = ((FeatureInfo) obj).name;
        String str2 = ((FeatureInfo) obj2).name;
        if (str != null) {
            return str.compareTo(str2);
        }
        return str2 == null ? 0 : -1;
    }
}
