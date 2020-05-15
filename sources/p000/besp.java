package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;
import java.util.Locale;

/* renamed from: besp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class besp {

    /* renamed from: a */
    public final ActivityRecognitionResult f112316a;

    /* renamed from: b */
    public final beqt f112317b;

    /* renamed from: c */
    public final List f112318c;

    public besp(ActivityRecognitionResult activityRecognitionResult, beqt beqt, List list) {
        this.f112316a = activityRecognitionResult;
        this.f112317b = beqt;
        this.f112318c = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.US, "OffBodyDetection [result=%s, error=%s, ", this.f112316a, this.f112317b));
        sb.append("accelWindowResults=[");
        List list = this.f112318c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = (beso) list.get(i);
            if (obj == null) {
                obj = "null";
            }
            sb.append(obj);
            sb.append(", ");
        }
        sb.append(']');
        return sb.toString();
    }
}
