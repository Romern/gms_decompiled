package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Comparator;

/* renamed from: bgnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgnc implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((ActivityRecognitionResult) obj).f79302c;
        long j2 = ((ActivityRecognitionResult) obj2).f79302c;
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        }
        return 0;
    }
}
