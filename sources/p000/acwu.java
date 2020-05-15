package p000;

import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.Comparator;

/* renamed from: acwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acwu implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((UsageInfo) obj).f9695b;
        long j2 = ((UsageInfo) obj2).f9695b;
        if (j <= j2) {
            return j >= j2 ? 0 : 1;
        }
        return -1;
    }
}
