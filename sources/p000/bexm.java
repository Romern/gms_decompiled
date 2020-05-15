package p000;

import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: bexm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bexm extends ArrayList {
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (!super.add(activityTransitionEvent)) {
            return false;
        }
        if (!DetectedActivity.m66833b(activityTransitionEvent.f79307a)) {
            return true;
        }
        return super.add(new ActivityTransitionEvent(0, activityTransitionEvent.f79308b, activityTransitionEvent.f79309c));
    }
}
