package p000;

import android.content.Context;
import android.view.Surface;
import com.google.android.cast.JGCastService;
import com.google.android.gms.cast.CastDevice;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pvj extends pun {

    /* renamed from: k */
    public final Set f40363k = new CopyOnWriteArraySet();

    public pvj(Context context, CastDevice castDevice, ScheduledExecutorService scheduledExecutorService, pvv pvv, pmx pmx, String str, pwd pwd, boolean z) {
        super(context, castDevice, scheduledExecutorService, pvv, pmx, JGCastService.FLAG_PRIVATE_DISPLAY, str, pwd, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23698a(int i, int i2, Object obj) {
        for (pvi pvi : this.f40363k) {
            pvi.mo23727a(this.f40381p, i, i2, (Surface) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23701a(boolean z) {
        for (pvi pvi : this.f40363k) {
            pvi.mo23728a(this.f40381p, z);
        }
    }
}
