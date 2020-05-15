package p000;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.common.stats.AlarmEvent;
import java.util.List;

/* renamed from: skf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skf {

    /* renamed from: a */
    public static skf f44610a;

    /* renamed from: b */
    private static Integer f44611b;

    /* renamed from: a */
    public static final void m35529a(Context context, int i, String str, long j, long j2, long j3, List list, int i2) {
        int i3;
        if (f44611b == null) {
            slg slg = slh.f44684a;
            if (slg != null) {
                i3 = slg.mo25703a(3);
            } else {
                ComponentName componentName = skr.f44644a;
                i3 = 0;
            }
            f44611b = Integer.valueOf(i3);
        }
        int intValue = f44611b.intValue();
        ComponentName componentName2 = skr.f44644a;
        if (intValue != 0) {
            slf.m35566a().mo25704a(new AlarmEvent(1, System.currentTimeMillis(), i, str, j, j2, j3, slp.m35593a(list), i2, srf.m36091a(context), slp.m35592a(context.getPackageName()), srf.m36096e(context)));
        }
    }
}
