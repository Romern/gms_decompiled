package com.google.android.gms.thunderbird.config.reporters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AbstractAmlV1SmsReporter$SmsRequest$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ String f109067a;

    /* renamed from: b */
    final /* synthetic */ augj f109068b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractAmlV1SmsReporter$SmsRequest$1(Context context, String str, augj augj) {
        super(context);
        this.f109067a = str;
        this.f109068b = augj;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (getResultCode() == -1) {
            String str = this.f109067a;
            synchronized (auho.f91828a) {
                auho.f91828a.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }
            this.f109068b.mo50510a(aufs.m76993a(getResultCode()));
            return;
        }
        int resultCode = getResultCode();
        StringBuilder sb = new StringBuilder(34);
        sb.append("sms failed with error: ");
        sb.append(resultCode);
        String sb2 = sb.toString();
        Bundle resultExtras = getResultExtras(false);
        if (resultExtras != null && resultExtras.containsKey("errorCode")) {
            String valueOf = String.valueOf(sb2);
            String valueOf2 = String.valueOf(resultExtras.get("errorCode"));
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(valueOf2).length());
            sb3.append(valueOf);
            sb3.append(" [");
            sb3.append(valueOf2);
            sb3.append("]");
            sb2 = sb3.toString();
        }
        this.f109068b.mo50510a(aufs.m76994a(getResultCode(), new IOException(sb2)));
    }
}
