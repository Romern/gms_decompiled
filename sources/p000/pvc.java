package p000;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pvc extends pun {

    /* renamed from: k */
    public static final String f40333k = ccxs.m132043d();

    /* renamed from: l */
    public static final String f40334l = ccxs.m132041b();

    /* renamed from: m */
    public final Set f40335m = new CopyOnWriteArraySet();

    public pvc(Context context, CastDevice castDevice, ScheduledExecutorService scheduledExecutorService, pvv pvv, pmx pmx, String str, pwd pwd) {
        super(context, castDevice, scheduledExecutorService, pvv, pmx, 0, str, pwd, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23698a(int i, int i2, Object obj) {
        for (pvb pvb : this.f40335m) {
            pvb.mo23724a(this.f40381p, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23701a(boolean z) {
        for (pvb pvb : this.f40335m) {
            pvb.mo23725a(this.f40381p, z);
        }
    }
}
