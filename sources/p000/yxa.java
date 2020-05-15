package p000;

import com.google.android.gms.fitness.data.Goal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxa {

    /* renamed from: a */
    public long f54718a;

    /* renamed from: b */
    public long f54719b;

    /* renamed from: c */
    public final List f54720c = new ArrayList();

    /* renamed from: d */
    public Goal.Recurrence f54721d;

    /* renamed from: e */
    public int f54722e;

    /* renamed from: f */
    public Goal.MetricObjective f54723f;

    /* renamed from: g */
    public Goal.DurationObjective f54724g;

    /* renamed from: h */
    public Goal.FrequencyObjective f54725h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo30820a(Goal.MetricObjective metricObjective) {
        sdo.m34971a(this.f54722e == 0, (Object) "Objective already set.");
        sdo.m34966a(metricObjective, "Attempting to use a null objective");
        this.f54722e = 1;
        this.f54723f = metricObjective;
    }
}
