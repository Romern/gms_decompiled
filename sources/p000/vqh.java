package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.drivingmode.LocationActivityTransitionIntentOperation;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* renamed from: vqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqh {

    /* renamed from: a */
    final PendingIntent f49791a;

    /* renamed from: b */
    final rjx f49792b;

    /* renamed from: c */
    private final Context f49793c;

    public vqh(Context context) {
        this.f49793c = context;
        Intent startIntent = IntentOperation.getStartIntent(context, LocationActivityTransitionIntentOperation.class, "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION");
        bmxy.m108581a(startIntent);
        PendingIntent service = PendingIntent.getService(this.f49793c, 0, startIntent, 134217728);
        bmxy.m108581a(service);
        this.f49791a = service;
        this.f49792b = aefo.m51797a(context);
    }

    /* renamed from: a */
    public final void mo28738a() {
        rjx rjx = this.f49792b;
        ArrayList arrayList = new ArrayList();
        aegc aegc = new aegc();
        aegc.f63352a = 0;
        aegc.mo34122a(0);
        arrayList.add(aegc.mo34121a());
        aegc aegc2 = new aegc();
        aegc2.f63352a = 0;
        aegc2.mo34122a(1);
        arrayList.add(aegc2.mo34121a());
        aegc aegc3 = new aegc();
        aegc3.f63352a = 8;
        aegc3.mo34122a(0);
        arrayList.add(aegc3.mo34121a());
        aegc aegc4 = new aegc();
        aegc4.f63352a = 7;
        aegc4.mo34122a(0);
        arrayList.add(aegc4.mo34121a());
        if (ccra.m131310b()) {
            aegc aegc5 = new aegc();
            aegc5.f63352a = 3;
            aegc5.mo34122a(0);
            arrayList.add(aegc5.mo34121a());
            aegc aegc6 = new aegc();
            aegc6.f63352a = 3;
            aegc6.mo34122a(1);
            arrayList.add(aegc6.mo34121a());
        }
        aucb a = rjx.mo24683a(new ActivityTransitionRequest(arrayList, "DrivingMode", null), this.f49791a);
        a.mo50373a(vqb.f49785a);
        a.mo50372a(vqc.f49786a);
    }
}
