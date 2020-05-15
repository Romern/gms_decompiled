package p000;

import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* renamed from: aegf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aegf implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int i = activityTransition.f79305a;
        int i2 = activityTransition2.f79305a;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        int i3 = activityTransition.f79306b;
        int i4 = activityTransition2.f79306b;
        if (i3 == i4) {
            return 0;
        }
        return i3 >= i4 ? 1 : -1;
    }
}
