package com.google.android.gms.scheduler.execution;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TaskExecutionDelegator$TaskCompletingReceiver extends aacn {

    /* renamed from: a */
    private final aucf f107340a;

    public TaskExecutionDelegator$TaskCompletingReceiver(aucf aucf) {
        super("scheduler");
        this.f107340a = aucf;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int resultCode = getResultCode();
        aucf aucf = this.f107340a;
        if (resultCode == 0) {
            resultCode = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        aucf.mo50391a(Integer.valueOf(resultCode));
    }
}
