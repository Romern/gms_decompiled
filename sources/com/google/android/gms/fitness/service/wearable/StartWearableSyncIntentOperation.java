package com.google.android.gms.fitness.service.wearable;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartWearableSyncIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final srn f32430a = zvt.m46581a();

    /* renamed from: b */
    private yzo f32431b;

    /* renamed from: a */
    static final /* synthetic */ void m23808a(aucb aucb) {
        if (!aucb.mo50384b()) {
            bnsl bnsl = (bnsl) f32430a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.service.wearable.StartWearableSyncIntentOperation", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unable to save to: %s", "/fitness/WearableSync/sync_request");
        }
    }

    public final void onCreate() {
        this.f32431b = yzq.m45107a(this).mo30893l();
    }

    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("sync_source", 0);
        String stringExtra = intent.getStringExtra("account");
        sre.m36089i(this);
        bmxy.m108600b(true);
        axov a = axov.m82850a("/fitness/WearableSync/sync_request");
        axos axos = new axos();
        axos.mo53326a("request_time", System.currentTimeMillis());
        axos.mo53325a("request_source", intExtra);
        if (stringExtra != null) {
            axos.mo53328a("request_account", stringExtra);
        }
        a.f96224a.mo53322a(axos);
        this.f32431b.mo30868a().mo24691a(a.mo53349a()).mo50371a(zpb.f55646a);
    }
}
