package p000;

import android.content.Context;
import com.google.android.gms.fitness.service.maintenance.StoreMaintenanceIntentOperation;
import java.util.concurrent.TimeUnit;

/* renamed from: znq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znq {
    /* renamed from: a */
    public static void m45815a(Context context, String str) {
        if (((int) cdzv.m135695c()) > 0) {
            synchronized (StoreMaintenanceIntentOperation.f32394a) {
                boolean z = !StoreMaintenanceIntentOperation.f32394a.isEmpty();
                StoreMaintenanceIntentOperation.f32394a.add(str);
                if (!z) {
                    skc skc = new skc(context);
                    long millis = TimeUnit.SECONDS.toMillis(cdzv.m135695c());
                    skc.mo25671a("StoreMaintenanceChimeraService:Trim", 3, millis, millis, StoreMaintenanceIntentOperation.m23774a(context), "com.google.android.gms");
                }
            }
        }
    }
}
