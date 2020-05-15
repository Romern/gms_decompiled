package com.google.android.gms.googlehelp.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InvalidateGcmTokenGcmTaskChimeraService extends aeah {
    /* renamed from: a */
    public static void m66507a(Context context) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public static void m66508a(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("REMAINING", i);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService";
        aebi.f63099k = "HEARTBEAT";
        aebi.mo34004a(ceeg.f182447a.mo6606a().mo78982ab(), ceeg.f182447a.mo6606a().mo78955W());
        aebi.f63107s = bundle;
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if (!TextUtils.equals(aecc.f63128a, "HEARTBEAT")) {
            String valueOf = String.valueOf(aecc.f63128a);
            Log.w("gH_GcmHeartbeatsService", valueOf.length() == 0 ? new String("Unrecognized task tag: ") : "Unrecognized task tag: ".concat(valueOf));
            return 0;
        }
        m66507a(this);
        int i = aecc.f63129b.getInt("REMAINING");
        if (i > 0) {
            m66508a(this, i - 1);
        }
        return 0;
    }
}
