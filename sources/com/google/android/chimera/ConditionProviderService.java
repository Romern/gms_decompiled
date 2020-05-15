package com.google.android.chimera;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.service.notification.Condition;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ConditionProviderService extends Service {
    public static final String PERMISSION_BIND = "android.permission.BIND_CONDITION_PROVIDER_SERVICE";

    /* renamed from: a */
    private ded f7612a;

    public static void requestRebind(ComponentName componentName) {
        ded.requestRebind(componentName);
    }

    public final void notifyCondition(Condition condition) {
        this.f7612a.notifyCondition(condition);
    }

    public final void notifyConditions(Condition... conditionArr) {
        this.f7612a.notifyConditions(conditionArr);
    }

    public IBinder onBind(Intent intent) {
        return this.f7612a.onBind(intent);
    }

    public abstract void onConnected();

    public void onRequestConditions(int i) {
    }

    public abstract void onSubscribe(Uri uri);

    public abstract void onUnsubscribe(Uri uri);

    public final void requestUnbind() {
        this.f7612a.requestUnbind();
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        ded ded = new ded(this);
        this.f7612a = ded;
        ded.attachBaseContext(context);
    }
}
