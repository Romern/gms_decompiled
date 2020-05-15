package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableSyncConnectionChimeraService extends axpp {

    /* renamed from: a */
    private static final srn f32434a = zvt.m46581a();

    /* renamed from: h */
    private static boolean f32435h = false;

    /* renamed from: a */
    private static boolean m23814a(Context context) {
        boolean z = false;
        try {
            aucu.m76783a(axoz.m82855c(yzq.m45107a(context).mo30893l().f54853a).mo24757l("com.google.android.gms.fitness.service.wearable.RECEIVE_WEAR_DATA_CAPABILITY"), cdzd.m135494w(), TimeUnit.SECONDS);
            try {
                z = context.getPackageManager().getApplicationInfo("com.google.android.apps.fitness", 0).enabled;
            } catch (PackageManager.NameNotFoundException e) {
            }
            return FitAppPackageIntentOperation.m23806a(context, z);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            bnsl bnsl = (bnsl) f32434a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("com.google.android.gms.fitness.service.wearable.WearableSyncConnectionChimeraService", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to add Capability RECEIVE_WEAR_DATA_CAPABILITY");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo19177a() {
        sre.m36089i(getApplicationContext());
        Context applicationContext = getApplicationContext();
        if (!f32435h) {
            f32435h = m23814a(applicationContext);
        }
    }
}
