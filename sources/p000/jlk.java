package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jlk {

    /* renamed from: c */
    private static final sek f22755c = jsy.m17256a("GcmMessageBus");

    /* renamed from: d */
    private static jlk f22756d;

    /* renamed from: a */
    public final Object f22757a = new Object();

    /* renamed from: b */
    public final Map f22758b = new HashMap();

    private jlk() {
    }

    /* renamed from: a */
    public static synchronized jlk m16878a() {
        jlk jlk;
        synchronized (jlk.class) {
            if (f22756d == null) {
                f22756d = new jlk();
            }
            jlk = f22756d;
        }
        return jlk;
    }

    /* renamed from: a */
    public final Collection mo13860a(String str, String str2) {
        synchronized (this.f22757a) {
            Map map = (Map) this.f22758b.get(str);
            if (map == null) {
                f22755c.mo25414c(String.format("No listeners are subscribed to listen for messages to %s", str), new Object[0]);
                ArrayList arrayList = new ArrayList();
                return arrayList;
            } else if (str2 != null) {
                jlj jlj = (jlj) map.get(str2);
                if (jlj != null) {
                    List asList = Arrays.asList(jlj);
                    return asList;
                }
                ArrayList arrayList2 = new ArrayList();
                return arrayList2;
            } else {
                Collection values = map.values();
                return values;
            }
        }
    }

    /* renamed from: a */
    public final void mo13861a(String str, String str2, jlj jlj) {
        f22755c.mo25414c("Subscribing deviceId: %s to topicName: %s", str, str2);
        synchronized (this.f22757a) {
            if (!this.f22758b.containsKey(str)) {
                this.f22758b.put(str, new HashMap());
            }
            Map map = (Map) this.f22758b.get(str);
            if (!map.containsKey(str2)) {
                map.put(str2, jlj);
            }
        }
    }
}
