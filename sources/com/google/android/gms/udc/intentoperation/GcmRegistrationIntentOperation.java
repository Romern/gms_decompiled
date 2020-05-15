package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmRegistrationIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final bmzi f109374a;

    /* renamed from: b */
    private final bmzi f109375b;

    public GcmRegistrationIntentOperation() {
        this.f109374a = new avcz(this);
        this.f109375b = new avda(this);
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            if (chbh.m148019q()) {
                ((bboa) this.f109374a.mo6606a()).mo56267c().mo56224a(auzv.PUSH_REGISTRATION);
            }
            try {
                ((bbjm) this.f109375b.mo6606a()).mo34087e(aval.SYNC_ID_CUSTOM_CACHE).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    GcmRegistrationIntentOperation(bboa bboa, bbjm bbjm) {
        this.f109374a = new avdb(bboa);
        this.f109375b = new avdc(bbjm);
    }
}
