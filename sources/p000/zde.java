package p000;

import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zde extends zdf {
    public zde(SensorRegistrationRequest sensorRegistrationRequest) {
        super(sensorRegistrationRequest);
    }

    /* renamed from: a */
    public final List mo30945a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DataPoint dataPoint = (DataPoint) list.get(i);
            long a = dataPoint.mo18894a(TimeUnit.NANOSECONDS);
            if (!mo30946a(a)) {
                mo30947b(a);
                arrayList.add(dataPoint);
            }
        }
        return arrayList;
    }
}
