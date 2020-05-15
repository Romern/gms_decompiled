package p000;

import com.google.android.gms.location.DetectedActivity;
import java.util.Comparator;

/* renamed from: beqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beqq implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.f79320e).compareTo(Integer.valueOf(detectedActivity.f79320e));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo43513a()).compareTo(Integer.valueOf(detectedActivity2.mo43513a())) : compareTo;
    }
}
