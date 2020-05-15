package com.google.android.chimera;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.List;

@ChimeraApiVersion(added = 102)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ChooserTargetService extends Service {

    /* renamed from: a */
    private C0928dec f7611a;

    public IBinder onBind(Intent intent) {
        return this.f7611a.onBind(intent);
    }

    public abstract List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter);

    public boolean onUnbind(Intent intent) {
        return this.f7611a.onUnbind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        this.f7611a = new C0928dec(this, context);
    }
}
