package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwr {

    /* renamed from: a */
    public static final AtomicInteger f40518a = new AtomicInteger(new Random().nextInt());

    /* renamed from: i */
    private static final qav f40519i = new qav("RCNControllerManager");

    /* renamed from: b */
    public final Context f40520b;

    /* renamed from: c */
    public final phy f40521c;

    /* renamed from: d */
    public final pzz f40522d;

    /* renamed from: e */
    public final boolean f40523e;

    /* renamed from: f */
    public final Map f40524f = new HashMap();

    /* renamed from: g */
    public final Map f40525g = new HashMap();

    /* renamed from: h */
    public final Map f40526h = new HashMap();

    public pwr(Context context, phy phy, pzz pzz, boolean z) {
        this.f40520b = context;
        this.f40521c = phy;
        this.f40522d = pzz;
        this.f40523e = z;
    }

    /* renamed from: a */
    public final pjs mo23779a(String str) {
        return (pjs) this.f40524f.get(str);
    }

    /* renamed from: b */
    public final pjs mo23782b(String str) {
        pjs pjs;
        synchronized (this.f40524f) {
            pjs = (pjs) this.f40524f.remove(str);
        }
        if (pjs != null) {
            pzz pzz = this.f40522d;
            int i = pjs.f39376d;
            Set<String> stringSet = pzz.f40767a.getStringSet("googlecast-RCNIds", Collections.emptySet());
            if (!stringSet.isEmpty()) {
                HashSet hashSet = new HashSet();
                String num = Integer.toString(i);
                for (String str2 : stringSet) {
                    if (!str2.equals(num)) {
                        hashSet.add(str2);
                    }
                }
                pzz.f40767a.edit().putStringSet("googlecast-RCNIds", hashSet).apply();
                pzz.f40773g.mo23856a("Removed RCN ID: %d", Integer.valueOf(i));
            }
        }
        return pjs;
    }

    /* renamed from: a */
    public final pjs mo23780a(String str, boolean z, bpfe bpfe) {
        pjs b = mo23782b(str);
        if (b != null) {
            b.mo23280a(z, bpfe);
        }
        return b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjs.a(boolean, bpfe):void
     arg types: [int, bpfe]
     candidates:
      pjs.a(android.content.Intent, int):android.app.PendingIntent
      pjs.a(boolean, bpfe):void */
    /* renamed from: a */
    public final void mo23781a(bpfe bpfe) {
        for (pjs pjs : new HashSet(this.f40524f.values())) {
            if (pjs != null) {
                pjs.mo23280a(false, bpfe);
            }
        }
        this.f40524f.clear();
        sex a = sex.m35104a(rpr.m34216b());
        Set<Integer> a2 = this.f40522d.mo23834a();
        if (!a2.isEmpty()) {
            f40519i.mo23857a("Removing %d RCNs: %s", Integer.valueOf(a2.size()), TextUtils.join(", ", a2));
            for (Integer num : a2) {
                a.mo25444a("CastRCN", num.intValue());
            }
        }
    }
}
