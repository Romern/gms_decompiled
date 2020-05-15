package com.google.android.chimera;

import android.app.Dialog;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.quicksettings.Tile;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TileService extends Service {
    public static final String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";

    /* renamed from: a */
    private des f7667a;

    public static final void requestListeningState(Context context, ComponentName componentName) {
        des.requestListeningState(context, componentName);
    }

    public final Tile getQsTile() {
        return this.f7667a.getQsTile();
    }

    public final boolean isLocked() {
        return this.f7667a.isLocked();
    }

    public final boolean isSecure() {
        return this.f7667a.isSecure();
    }

    public IBinder onBind(Intent intent) {
        try {
            return this.f7667a.onBind(intent);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof RemoteException) {
                return null;
            }
            throw e;
        }
    }

    public void onClick() {
    }

    public void onStartListening() {
    }

    public void onStopListening() {
    }

    public void onTileAdded() {
    }

    public void onTileRemoved() {
    }

    public boolean onUnbind(Intent intent) {
        return this.f7667a.onUnbind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        des des = new des(this);
        this.f7667a = des;
        des.attachBaseContext(context);
    }

    public final void setStatusIcon(Icon icon, String str) {
        this.f7667a.setStatusIcon(icon, str);
    }

    public final void showDialog(Dialog dialog) {
        this.f7667a.showDialog(dialog);
    }

    public final void startActivityAndCollapse(Intent intent) {
        this.f7667a.startActivityAndCollapse(intent);
    }

    public final void unlockAndRun(Runnable runnable) {
        this.f7667a.unlockAndRun(runnable);
    }
}
