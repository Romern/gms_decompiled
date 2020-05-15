package p000;

import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* renamed from: bexw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexw {
    static {
        bexw.class.getSimpleName();
    }

    /* renamed from: a */
    public static ActivityTransitionRequest m96073a(bexx bexx, bexv bexv, ActivityTransitionRequest activityTransitionRequest) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (activityTransitionRequest != null) {
            for (ActivityTransition activityTransition : activityTransitionRequest.f79311b) {
                if (activityTransition.f79305a == 22) {
                    arrayList.add(activityTransition);
                }
            }
        }
        Object[] objArr = new Object[1];
        if (!arrayList.isEmpty()) {
            str = "requested";
        } else {
            str = "did not request";
        }
        objArr[0] = str;
        if (bexx != null) {
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Received car crash transition requests? ");
            sb.append(valueOf);
            sb.toString();
            bexx.f112990a = arrayList;
            bexx.mo61244a();
        }
        if (bexv != null) {
            bexv.mo61243a(arrayList);
        }
        if (arrayList.isEmpty()) {
            return activityTransitionRequest;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ActivityTransition activityTransition2 : activityTransitionRequest.f79311b) {
            if (activityTransition2.f79305a != 22) {
                arrayList2.add(activityTransition2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new ActivityTransitionRequest(arrayList2, activityTransitionRequest.f79312c, activityTransitionRequest.f79313d);
        }
        return null;
    }
}
