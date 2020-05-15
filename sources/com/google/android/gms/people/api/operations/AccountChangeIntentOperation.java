package com.google.android.gms.people.api.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangeIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final anbw f81701a;

    public AccountChangeIntentOperation() {
        this(anbx.INSTANCE);
    }

    public final void onHandleIntent(Intent intent) {
        intent.getAction();
        this.f81701a.mo41675a();
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            gre.m13766a(intent);
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            gre.m13768b(intent);
        }
    }

    public AccountChangeIntentOperation(anbw anbw) {
        this.f81701a = anbw;
    }
}
