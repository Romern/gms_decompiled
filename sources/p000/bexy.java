package p000;

import com.google.android.gms.location.ActivityTransitionEvent;
import java.util.List;

/* renamed from: bexy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexy {

    /* renamed from: a */
    public final bgmk f112993a;

    /* renamed from: b */
    public boolean f112994b = false;

    /* renamed from: c */
    public boolean f112995c = false;

    /* renamed from: d */
    public long f112996d = 0;

    /* renamed from: e */
    public final bexz f112997e = new bexz();

    public bexy(bgmk bgmk) {
        this.f112993a = bgmk;
    }

    /* renamed from: a */
    public static ActivityTransitionEvent m96075a(int i, int i2, long j) {
        return new ActivityTransitionEvent(i, i2, j);
    }

    /* renamed from: a */
    public static final ActivityTransitionEvent m96076a(List list) {
        if (!list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) list.get(size);
                if (activityTransitionEvent.f79308b == 1) {
                    return activityTransitionEvent;
                }
            }
        }
        return null;
    }
}
