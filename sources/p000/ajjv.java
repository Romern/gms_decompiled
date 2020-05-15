package p000;

import android.app.KeyguardManager;
import android.os.PowerManager;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;

/* renamed from: ajjv */
public final /* synthetic */ class ajjv implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService.C16122 f70768a;

    /* renamed from: b */
    private final PowerManager f70769b;

    /* renamed from: c */
    private final KeyguardManager f70770c;

    public ajjv(NearbySharingChimeraService.C16122 r1, PowerManager powerManager, KeyguardManager keyguardManager) {
        this.f70768a = r1;
        this.f70769b = powerManager;
        this.f70770c = keyguardManager;
    }

    public final void run() {
        NearbySharingChimeraService.C16122 r0 = this.f70768a;
        PowerManager powerManager = this.f70769b;
        KeyguardManager keyguardManager = this.f70770c;
        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
        boolean z = false;
        if (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked()) {
            z = true;
        }
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44427a(z);
    }
}
