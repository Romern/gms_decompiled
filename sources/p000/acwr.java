package p000;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: acwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwr {

    /* renamed from: a */
    public static final long f60984a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public final acwp f60985b = new acwp();

    /* renamed from: a */
    public final boolean mo33175a() {
        return this.f60985b.size() == 0;
    }

    /* renamed from: b */
    public final void mo33176b() {
        if (!mo33175a()) {
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry entry : this.f60985b.entrySet()) {
                if (currentTimeMillis - ((acwq) entry.getValue()).f60983a < f60984a) {
                    break;
                }
                arrayList.add((String) entry.getKey());
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f60985b.remove((String) arrayList.get(i));
            }
        }
    }
}
