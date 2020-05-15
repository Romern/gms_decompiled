package p000;

import android.util.Log;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.List;

/* renamed from: bewa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewa {

    /* renamed from: a */
    private int f112775a = -1;

    /* renamed from: a */
    private final int m95974a(int i) {
        if (i == 0) {
            Log.w("TransitionAHandler", "Received car fusion result. Entering Vehicle");
            this.f112775a = 0;
            return 2;
        } else if (i != 1 || !cesk.f183403a.mo6606a().enableDrivingDndExitWithAudioFusion() || this.f112775a != 0) {
            return 1;
        } else {
            Log.w("TransitionAHandler", "Received other fusion result. Exiting Vehicle");
            this.f112775a = 1;
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        return 1;
     */
    /* renamed from: a */
    public final synchronized int mo61187a(ActivityTransitionResult activityTransitionResult, int i) {
        if (cesk.m138182e()) {
            if (cesk.f183403a.mo6606a().onlyRelyOnCarTransitionStateMachine()) {
                return m95974a(i);
            }
        }
        if (!activityTransitionResult.f79314a.isEmpty()) {
            if (activityTransitionResult.f79314a.size() > 1) {
                StringBuilder sb = new StringBuilder();
                for (ActivityTransitionEvent activityTransitionEvent : activityTransitionResult.f79314a) {
                    sb.append(activityTransitionEvent);
                }
                Log.w("TransitionAHandler", String.format("TransitionApiHandler received >1 (%d) transition results: %s", Integer.valueOf(activityTransitionResult.f79314a.size()), sb.toString()));
            }
            List list = activityTransitionResult.f79314a;
            ActivityTransitionEvent activityTransitionEvent2 = (ActivityTransitionEvent) list.get(list.size() - 1);
            if (cevc.f183451a.mo6606a().enableDndExitOnfoot()) {
                int i2 = activityTransitionEvent2.f79307a;
                if ((i2 == 8 || i2 == 7) && activityTransitionEvent2.f79308b == 0) {
                    Log.w("TransitionAHandler", String.format("Received walking/running entry transition. Exiting in vehicle %s", activityTransitionResult));
                    this.f112775a = 1;
                    return 3;
                }
            }
            int a = m95974a(i);
            if (a != 1) {
                return a;
            }
            int i3 = activityTransitionEvent2.f79307a;
            if (i3 == 0 || i3 == 16) {
                int i4 = activityTransitionEvent2.f79308b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        if (this.f112775a != 1) {
                            this.f112775a = 1;
                            return 3;
                        }
                    }
                } else if (this.f112775a != 0) {
                    this.f112775a = 0;
                    return 2;
                }
            } else {
                Log.w("TransitionAHandler", String.format("Insignificant non vehicle related transition result = %s", activityTransitionResult));
                return 1;
            }
        } else {
            Log.w("TransitionAHandler", "Transition result is empty!");
            return 1;
        }
    }
}
