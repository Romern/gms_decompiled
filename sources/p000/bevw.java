package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* renamed from: bevw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevw {

    /* renamed from: a */
    public final Context f112769a;

    /* renamed from: b */
    public final bevv f112770b;

    /* renamed from: c */
    public final bewa f112771c = new bewa();

    public bevw(Context context, bevv bevv) {
        this.f112769a = context;
        this.f112770b = bevv;
        if (ceut.f183445a.mo6606a().arDndDecisionEngineEnabled()) {
            PendingIntent service = PendingIntent.getService(context, 0, bevu.m95969a(context), 0);
            rjx a = aefo.m51797a(context);
            ArrayList arrayList = new ArrayList();
            if (!cesk.f183403a.mo6606a().enableDrivingDndWithRoadRail() || !cery.m138142b() || !cery.m138143c()) {
                aegc aegc = new aegc();
                aegc.f63352a = 0;
                aegc.mo34122a(0);
                arrayList.add(aegc.mo34121a());
                aegc aegc2 = new aegc();
                aegc2.f63352a = 0;
                aegc2.mo34122a(1);
                arrayList.add(aegc2.mo34121a());
            } else {
                aegc aegc3 = new aegc();
                aegc3.f63352a = 16;
                aegc3.mo34122a(0);
                arrayList.add(aegc3.mo34121a());
                aegc aegc4 = new aegc();
                aegc4.f63352a = 16;
                aegc4.mo34122a(1);
                arrayList.add(aegc4.mo34121a());
            }
            aegc aegc5 = new aegc();
            aegc5.f63352a = 8;
            aegc5.mo34122a(0);
            arrayList.add(aegc5.mo34121a());
            aegc aegc6 = new aegc();
            aegc6.f63352a = 7;
            aegc6.mo34122a(0);
            arrayList.add(aegc6.mo34121a());
            aucb a2 = a.mo24683a(new ActivityTransitionRequest(arrayList, "ardnd", null), service);
            a2.mo50373a(new bevq());
            a2.mo50372a(new bevr());
        }
    }
}
