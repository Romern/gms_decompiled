package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: rmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rmc {

    /* renamed from: a */
    public final Map f43271a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f43272b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo24890a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f43271a) {
            hashMap = new HashMap(this.f43271a);
        }
        synchronized (this.f43272b) {
            hashMap2 = new HashMap(this.f43272b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo17719d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((aucf) entry2.getKey()).mo50392b((Exception) new rjp(status));
            }
        }
    }
}
