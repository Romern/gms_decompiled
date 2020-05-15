package com.google.android.gms.telephonyspam.sync;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TelephonySpamChimeraService extends aeah {

    /* renamed from: a */
    private static final audg f109048a = audg.m76790a("TelephonySpamChimeraService");

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        f109048a.mo50423b("Running Telephony Spam Chimera Service");
        audk audk = new audk(getApplicationContext());
        Bundle bundle = aecc.f63129b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = 2;
        if (bundle.getDouble("Action") == 1.0d) {
            if (cgyd.f188020a.mo6606a().mo84738o()) {
                f109048a.mo50423b("Cleaning SIP Header local table of old entries");
                auey.m76965a(getApplicationContext());
                f109048a.mo50423b("Syncing Call Spam List");
                Bundle bundle2 = aecc.f63129b;
                bundle2.putInt("SpamList Type", 0);
                i = auey.m76958a(new aecc(aecc.f63128a, bundle2), audk, getApplicationContext());
            }
            if (cgyd.f188020a.mo6606a().mo84739p()) {
                f109048a.mo50423b("Syncing Sms Spam List");
                Bundle bundle3 = aecc.f63129b;
                bundle3.putInt("SpamList Type", 1);
                return auey.m76958a(new aecc(aecc.f63128a, bundle3), new audk(getApplicationContext()), getApplicationContext());
            }
        }
        return i;
    }
}
