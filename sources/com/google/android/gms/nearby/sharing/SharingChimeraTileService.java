package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.service.quicksettings.Tile;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.TileService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SharingChimeraTileService extends TileService {

    /* renamed from: b */
    public static final /* synthetic */ int f81042b = 0;

    /* renamed from: c */
    private static final AtomicInteger f81043c = new AtomicInteger(new SecureRandom().nextInt());

    /* renamed from: a */
    public ajty f81044a;

    /* renamed from: d */
    private BroadcastReceiver f81045d;

    /* renamed from: e */
    private boolean f81046e = false;

    /* renamed from: a */
    private final void m67593a() {
        Icon icon;
        Tile qsTile = getQsTile();
        if (qsTile == null) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to invalidate tile state.");
            return;
        }
        if (this.f81046e) {
            icon = akia.m59781a(getResources().getDrawable(C0126R.C0127drawable.sharing_ic_tile));
            srn srn = ajvp.f71371a;
        } else {
            icon = akia.m59781a(getResources().getDrawable(C0126R.C0127drawable.sharing_ic_tile_disabled));
            srn srn2 = ajvp.f71371a;
        }
        qsTile.setIcon(icon);
        qsTile.setState(1);
        qsTile.updateTile();
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onClick() {
        if (cfov.f185185a.mo6606a().mo82334aq()) {
            mo44505a("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity");
        } else if (!this.f81046e) {
            this.f81044a.mo38894a().mo50373a(new ajsp(this));
        } else {
            mo44505a("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity");
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.f81044a = ahcb.m55442c(this);
        this.f81045d = new aacn("nearby") {
            /* class com.google.android.gms.nearby.sharing.SharingChimeraTileService.C16231 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                int i = SharingChimeraTileService.f81042b;
                sharingChimeraTileService.f81044a.mo38904b().mo50373a(new ajsq(this));
            }
        };
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SharingTileService created.");
    }

    public final void onDestroy() {
        super.onDestroy();
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SharingTileService destroyed");
    }

    public final void onStartListening() {
        m67593a();
        ahhd.m55767a(this, this.f81045d, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        this.f81044a.mo38904b().mo50373a(new ajso(this));
    }

    public final void onStopListening() {
        ahhd.m55766a(this, this.f81045d);
    }

    /* renamed from: a */
    public final void mo44505a(String str) {
        try {
            PendingIntent.getActivity(this, f81043c.getAndIncrement(), new Intent().addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT).setClassName(this, str), 134217728).send();
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (PendingIntent.CanceledException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("SharingTileService failed to launch %s", str);
        }
    }

    /* renamed from: a */
    public final void mo44506a(boolean z) {
        this.f81046e = z;
        m67593a();
    }
}
