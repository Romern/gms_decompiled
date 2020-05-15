package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DialerSecretCodeIntentOperation extends qlh {

    /* renamed from: b */
    public static final sek f31631b = new sek(new String[]{"DialerSecretCodeIntentOperation"}, (short[]) null);

    /* renamed from: c */
    private xby f31632c;

    public DialerSecretCodeIntentOperation() {
        super("3436375");
        this.f31632c = new xby();
    }

    /* renamed from: a */
    public final void mo18633a(Intent intent) {
        f31631b.mo25414c("Secret code activated, intent=%s", intent);
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, FidoEnrollmentIntentOperation.class, "com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE"));
        this.f31632c.mo29624a();
    }

    DialerSecretCodeIntentOperation(xby xby) {
        super("3436375");
        this.f31632c = xby;
    }
}
