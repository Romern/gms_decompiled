package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: bexu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexu {

    /* renamed from: a */
    public static final List f112986a = Arrays.asList(5, 4);

    /* renamed from: b */
    private static final List f112987b = Arrays.asList(0, 16);

    /* renamed from: a */
    public static DetectedActivity m96064a(ActivityRecognitionResult activityRecognitionResult) {
        DetectedActivity b = activityRecognitionResult.mo43492b();
        int a = b.mo43513a();
        int i = b.f79320e;
        if (a == 17 || a == 16) {
            a = 0;
        }
        return new DetectedActivity(a, i);
    }

    /* renamed from: a */
    public static boolean m96067a(ActivityTransitionEvent activityTransitionEvent) {
        int i = activityTransitionEvent.f79307a;
        return i == 8 || i == 7 || i == 2;
    }

    /* renamed from: a */
    protected static List m96065a(List list, Set set) {
        bxbm.m122539a(list);
        bxbm.m122539a(set);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) list.get(i);
            if (!set.contains(Integer.valueOf(activityTransitionEvent.f79307a))) {
                arrayList.add(activityTransitionEvent);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m96066a(int i) {
        return f112987b.contains(Integer.valueOf(i));
    }
}
