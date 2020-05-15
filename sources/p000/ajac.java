package p000;

import android.os.IBinder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ajac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajac {

    /* renamed from: a */
    public final Map f70218a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Set f70219b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: a */
    public final void mo38352a(String str) {
        ajab ajab = (ajab) this.f70218a.remove(str);
        if (ajab != null) {
            srn srn = ahfq.f67120a;
            ajab.f70216c = false;
            for (IBinder iBinder : ajab.f70215b.values()) {
                iBinder.unlinkToDeath(ajab, 0);
            }
        }
    }
}
