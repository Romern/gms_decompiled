package p000;

import android.content.Context;
import android.content.Intent;

@Deprecated
/* renamed from: addj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class addj extends addh {
    /* renamed from: a */
    static void m50213a(Context context, adea adea) {
        adea.mo33379a();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    public final void handleIntent(Intent intent) {
        throw null;
    }
}
