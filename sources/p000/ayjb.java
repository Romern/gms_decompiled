package p000;

import com.google.android.gms.wearable.internal.PackageStorageInfo;
import java.util.Comparator;

/* renamed from: ayjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayjb implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((PackageStorageInfo) obj).f110958c;
        long j2 = ((PackageStorageInfo) obj2).f110958c;
        if (j != j2) {
            return j >= j2 ? -1 : 1;
        }
        return 0;
    }
}
