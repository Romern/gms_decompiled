package com.google.android.gms.tapandpay.selfdestruct;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScheduleSelfDestructOperation extends asjx {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        char c;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 1166493549) {
            if (hashCode != 1313020140) {
                if (hashCode == 2137235274 && action.equals("com.google.android.gms.tapandpay.selfdestruct.SCHEDULE_SELF_DESTRUCT_ACTION")) {
                    c = 2;
                    if (c != 0) {
                        asjj.m74219a(this);
                        return;
                    } else if (c == 1) {
                        asjj.m74222b(this);
                        return;
                    } else if (c == 2) {
                        startService(IntentOperation.getStartIntent(this, "com.google.android.gms.tapandpay.selfdestruct.SelfDestructIntentOperation", "com.google.android.gms.tapandpay.selfdestruct.SELF_DESTRUCT_ACTION"));
                        return;
                    } else {
                        return;
                    }
                }
            } else if (action.equals("com.google.android.gms.tapandpay.SETUP_KEYGUARD_TIMEOUT")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (action.equals("com.google.android.gms.tapandpay.SETUP_ADMIN_TIMEOUT")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}
