package p000;

import android.content.Context;
import android.service.quicksettings.TileService;

/* renamed from: des */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class des extends TileService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.TileService f12984a;

    public des(com.google.android.chimera.TileService tileService) {
        this.f12984a = tileService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onClick() {
        this.f12984a.onClick();
    }

    public final void onStartListening() {
        this.f12984a.onStartListening();
    }

    public final void onStopListening() {
        this.f12984a.onStopListening();
    }

    public final void onTileAdded() {
        this.f12984a.onTileAdded();
    }

    public final void onTileRemoved() {
        this.f12984a.onTileRemoved();
    }
}
