package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SeismicDataCollectionManager$QuakeAlarmsManager$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgrl f150845a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeismicDataCollectionManager$QuakeAlarmsManager$1(bgrl bgrl, String str) {
        super(str);
        this.f150845a = bgrl;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        bgrl bgrl = this.f150845a;
        String action = intent.getAction();
        if (bgrl.f117342e && "com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM".equals(action)) {
            srn srn = bgrw.f117381a;
            bgrl.f117339b.mo63119d();
            bgrl.f117341d = ((Long) bgrl.f117338a.mo6606a()).longValue();
            bgrl.mo63116c();
        }
    }
}
