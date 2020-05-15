package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: zwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwd {
    static {
        zvt.m46581a();
        new C1223np();
    }

    /* renamed from: a */
    public static Intent m46606a(Context context, String str, cadu cadu) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.fitness.service.wearable.StartWearableSyncIntentOperation", "com.google.android.gms.fitness.wearables.START_WEARABLE_SYNC");
        bmxy.m108582a(startIntent, "Error getting intent operation.");
        startIntent.putExtra("sync_source", cadu.f172744k);
        if (str != null) {
            startIntent.putExtra("account", str);
        }
        return startIntent;
    }
}
