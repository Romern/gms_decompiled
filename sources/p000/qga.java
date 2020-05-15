package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* renamed from: qga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qga {
    /* renamed from: a */
    public static Intent m32112a(Context context) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.checkin.CheckinIntentOperation", "com.google.android.gms.checkin.CHECKIN_START_ACTION");
    }

    /* renamed from: a */
    public static Intent m32113a(Context context, Bundle bundle) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.checkin.CheckinIntentOperation", "com.google.android.gms.checkin.CHECKIN_START_ACTION");
        startIntent.putExtra("config_flags_bundle", bundle);
        return startIntent;
    }
}
