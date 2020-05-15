package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WaitDownloadCompleteOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        boolean z;
        if (cdjh.f180979a.mo6606a().mo77724D()) {
            qoo.m32581a(this).mo24174b();
        }
        qog b = qog.m32551b(this);
        long J = cdjh.f180979a.mo6606a().mo77730J();
        try {
            z = b.f41840d.mo24154b().await(J, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Interrupted while waiting for downloads: ");
            sb.append(valueOf);
            Log.e("ChimeraDLM", sb.toString());
            z = false;
        }
        if (!z) {
            qlp.m32393a().mo8860a(b.f41838b, 60);
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("download completed. result = ");
        sb2.append(z);
        sb2.toString();
    }
}
