package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: chn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chn {

    /* renamed from: a */
    public final Map f6868a = new HashMap();

    /* renamed from: b */
    public final chm f6869b = new chm();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3904a(String str) {
        chl chl;
        synchronized (this) {
            chl = (chl) this.f6868a.get(str);
            crb.m7382a(chl);
            int i = chl.f6866b;
            if (i > 0) {
                int i2 = i - 1;
                chl.f6866b = i2;
                if (i2 == 0) {
                    chl chl2 = (chl) this.f6868a.remove(str);
                    if (chl2.equals(chl)) {
                        chm chm = this.f6869b;
                        synchronized (chm.f6867a) {
                            if (chm.f6867a.size() < 10) {
                                chm.f6867a.offer(chl2);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(chl);
                        String valueOf2 = String.valueOf(chl2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79 + String.valueOf(valueOf2).length() + str.length());
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(valueOf);
                        sb.append(", but actually removed: ");
                        sb.append(valueOf2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(str.length() + 81);
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
        }
        chl.f6865a.unlock();
    }
}
