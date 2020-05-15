package p000;

import android.util.Pair;
import com.google.android.gms.udc.ConsistencyInformation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: avjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjh {

    /* renamed from: a */
    private static avjh f93269a;

    /* renamed from: b */
    private final Map f93270b = new ConcurrentHashMap();

    private avjh() {
    }

    /* renamed from: a */
    public static avjh m78608a() {
        if (f93269a == null) {
            f93269a = new avjh();
        }
        return f93269a;
    }

    /* renamed from: a */
    public final void mo51289a(String str, ConsistencyInformation consistencyInformation) {
        this.f93270b.put(str, new Pair(Long.valueOf(System.currentTimeMillis()), consistencyInformation));
    }
}
