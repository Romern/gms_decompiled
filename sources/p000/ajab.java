package p000;

import android.os.IBinder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ajab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajab implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final String f70214a;

    /* renamed from: b */
    public final Map f70215b = new ConcurrentHashMap();

    /* renamed from: c */
    public boolean f70216c = true;

    /* renamed from: d */
    final /* synthetic */ ajac f70217d;

    public ajab(ajac ajac, String str) {
        this.f70217d = ajac;
        sdo.m34959a((Object) str);
        this.f70214a = str;
    }

    public final void binderDied() {
        if (this.f70216c) {
            ajac ajac = this.f70217d;
            srn srn = ahfq.f67120a;
            ajac.mo38352a(this.f70214a);
            for (ajaa ajaa : ajac.f70219b) {
                ajaa.mo38171a(this.f70214a);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("package=");
        sb.append(this.f70214a);
        if (this.f70215b.isEmpty()) {
            sb.append(", no binders");
        } else {
            sb.append(",binder=");
            for (IBinder iBinder : this.f70215b.values()) {
                sb.append(iBinder);
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
