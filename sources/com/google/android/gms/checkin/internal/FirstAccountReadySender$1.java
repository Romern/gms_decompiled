package com.google.android.gms.checkin.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FirstAccountReadySender$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f29953a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirstAccountReadySender$1(String str, SharedPreferences sharedPreferences) {
        super(str);
        this.f29953a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (getResultCode() == -1) {
            SharedPreferences.Editor edit = this.f29953a.edit();
            edit.putBoolean("first.account.ready.received", true);
            edit.apply();
        }
    }
}
