package com.google.android.gms.tapandpay.notifications;

import android.content.Context;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManageNotificationChannelsTaskOperation implements aspm {
    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        int i = Build.VERSION.SDK_INT;
        if (!cgwn.m147274x()) {
            return 0;
        }
        atbg.m75369a(context);
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public final void mo49333a(Context context) {
        aeat a = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.mo34004a(0L, 1L);
        aebi.f63099k = "manageNotificationChannels";
        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebi.mo34023a(2);
        aebi.mo34024a(0, 0);
        aebi.mo34027b(1);
        a.mo33984a(aebi.mo33974b());
    }
}
