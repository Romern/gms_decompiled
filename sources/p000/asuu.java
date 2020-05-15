package p000;

import android.content.Context;
import android.os.Bundle;

/* renamed from: asuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asuu {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public static void m74874a(Context context, int i, boolean z) {
        if (cgwd.m147195c()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("register_if_changed_only", z);
            bundle.putInt("registration_reason", i - 1);
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
            aebi.f63099k = "hce.dynamic_aid_registration.oneoff";
            aebi.mo34023a(2);
            aebi.mo34004a(0L, 1L);
            aebi.mo34027b(1);
            aebi.f63102n = true;
            aebi.f63107s = bundle;
            aeat.m51532a(context).mo33984a(aebi.mo33974b());
        }
    }
}
