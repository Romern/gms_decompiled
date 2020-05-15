package p000;

import android.app.KeyguardManager;
import android.os.PowerManager;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: ajjk */
public final /* synthetic */ class ajjk implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService f70751a;

    /* renamed from: b */
    private final PowerManager f70752b;

    /* renamed from: c */
    private final KeyguardManager f70753c;

    public ajjk(NearbySharingChimeraService nearbySharingChimeraService, PowerManager powerManager, KeyguardManager keyguardManager) {
        this.f70751a = nearbySharingChimeraService;
        this.f70752b = powerManager;
        this.f70753c = keyguardManager;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.f70751a;
        PowerManager powerManager = this.f70752b;
        KeyguardManager keyguardManager = this.f70753c;
        boolean z = false;
        if (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked()) {
            z = true;
        }
        nearbySharingChimeraService.mo44427a(z);
    }
}
