package p000;

import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdd extends zdf {

    /* renamed from: b */
    private cadn f54936b = null;

    public zdd(SensorRegistrationRequest sensorRegistrationRequest) {
        super(sensorRegistrationRequest);
    }

    /* renamed from: a */
    private final void m45308a(DataPoint dataPoint) {
        cadm cadm = (cadm) cadn.f172699j.mo74144da();
        long a = dataPoint.mo18894a(TimeUnit.NANOSECONDS);
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        cadn.f172701a |= 1;
        cadn.f172702b = a;
        long b = dataPoint.mo18896b(TimeUnit.NANOSECONDS);
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn2 = (cadn) cadm.f164949b;
        cadn2.f172701a |= 2;
        cadn2.f172703c = b;
        cadm.mo74614a(ywh.m44944a(Arrays.asList(dataPoint.f31995d)));
        caae a2 = yvx.m44925a(dataPoint.f31992a);
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn3 = (cadn) cadm.f164949b;
        a2.getClass();
        cadn3.f172705e = a2;
        int i = cadn3.f172701a | 4;
        cadn3.f172701a = i;
        long j = dataPoint.f31997f;
        cadn3.f172701a = i | 16;
        cadn3.f172707g = j;
        cadn cadn4 = (cadn) cadm.mo74062i();
        if (this.f54936b != null) {
            caae caae = cadn4.f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            yey a3 = yef.m43885a(caae);
            a3.mo30381a(this.f54936b);
            a3.mo30381a(cadn4);
            cadn4 = a3.mo30384c();
        }
        this.f54936b = cadn4;
    }

    /* renamed from: a */
    public final List mo30945a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DataPoint dataPoint = (DataPoint) list.get(i);
            long a = dataPoint.mo18894a(TimeUnit.NANOSECONDS);
            if (mo30946a(a)) {
                m45308a(dataPoint);
            } else {
                mo30947b(a);
                if (this.f54936b != null) {
                    m45308a(dataPoint);
                    dataPoint = ywd.m44937a(this.f54936b, dataPoint.f31992a, dataPoint.f31996e);
                    this.f54936b = null;
                }
                arrayList.add(dataPoint);
            }
        }
        return arrayList;
    }
}
