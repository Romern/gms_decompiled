package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Subscription extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract PendingIntent mo7801a();

    /* renamed from: a */
    public final void mo7812a(Context context, Bundle bundle) {
        Intent intent = new Intent();
        intent.setPackage(mo7803c());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        mo7801a().send(context, 0, intent);
    }

    /* renamed from: c */
    public abstract String mo7803c();
}
