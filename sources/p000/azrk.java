package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* renamed from: azrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azrk {

    /* renamed from: a */
    protected final Context f99942a;

    /* renamed from: b */
    public final List f99943b = new ArrayList();

    public azrk(Context context) {
        this.f99942a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final String m86199a(String str, bdar bdar, int i, bmxj bmxj) {
        azqf.m86130a(this.f99942a);
        bmxv a = azqf.m86131a(bdar);
        if (a.mo66813a()) {
            return (String) bmxj.apply(a.mo66814b());
        }
        azoj.m85933c("LTJSBridgeInterface", "Monitor did not return value %s", str);
        azph.m85998a(this.f99942a).mo55173d(i, 57, str);
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Could not get value from monitor", new Object[0]);
    }

    /* renamed from: b */
    private final azrg m86200b(String str, bmxj bmxj, bmxj bmxj2, azrh azrh, int i, int i2) {
        azph.m85998a(this.f99942a).mo55168b(i, str);
        azqf.m86130a(this.f99942a);
        bmxv b = azqf.m86144b(str, bmxj);
        if (!b.mo66813a()) {
            azoj.m85933c("LTJSBridgeInterface", "Could not parse Web app query %s", str);
            azph.m85998a(this.f99942a).mo55126a(i2, 60);
            return azrg.m86196a();
        }
        Object b2 = b.mo66814b();
        bmxv bmxv = (bmxv) bmxj2.apply(b2);
        if (bmxv.mo66813a()) {
            return new azrg(azrh.mo55247a((bcoh) bmxv.mo66814b(), b2));
        }
        azoj.m85933c("LTJSBridgeInterface", "Could not get account for %s", str);
        azph.m85998a(this.f99942a).mo55173d(i2, 56, str);
        return azrg.m86196a();
    }

    /* renamed from: a */
    public abstract String mo55250a();

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public final azrg mo55248a(String str, bmxj bmxj, bmxj bmxj2, azrh azrh, int i, int i2) {
        return m86200b(str, bmxj, new azrd(this, bmxj2), azrh, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final azrg mo55249a(String str, String str2, bmxj bmxj, azrh azrh, int i, int i2) {
        return m86200b(str2, bmxj, new azrc(this, str), azrh, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo55251a(bqgg bqgg, int i) {
        try {
            azqf.m86130a(this.f99942a);
            return azqf.m86141a(((Boolean) bqgg.get()).booleanValue());
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("LTJSBridgeInterface", e, "Failed to get value from Future", new Object[0]);
            azph.m85998a(this.f99942a).mo55126a(i, 59);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Failed to get future value from Lighter", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public final String mo55259b(String str, bmxj bmxj, bmxj bmxj2, ConcurrentMap concurrentMap, azrj azrj, azrh azrh, bdaq bdaq, bmxj bmxj3, int i, int i2) {
        String str2 = str;
        ConcurrentMap concurrentMap2 = concurrentMap;
        bdaq bdaq2 = bdaq;
        bmxj bmxj4 = bmxj3;
        int i3 = i2;
        bdax bdax = new bdax();
        Integer valueOf = Integer.valueOf(azrj.f99940a.intValue());
        bdar bdar = (bdar) concurrentMap2.putIfAbsent(valueOf, bdax);
        if (bdar == null) {
            azrg a = mo55248a(str, bmxj, bmxj2, azrh, i, i2);
            if (a.f99936a) {
                bdar bdar2 = (bdar) a.f99937b;
                concurrentMap2.put(valueOf, bdar2);
                if (cfgs.m139406l()) {
                    bdar2.mo56710a((bdaq) new azri(bdaq2));
                } else {
                    bdar2.mo56710a(bdaq2);
                }
                bdar2.mo57830c(new azrb(bdax));
                return m86199a(str2, bdar2, i3, bmxj4);
            }
            concurrentMap2.remove(valueOf);
            azqf.m86130a(this.f99942a);
            String a2 = azqf.m86138a("Failed to get value monitor.", new Object[0]);
            azoj.m85933c("LTJSBridgeInterface", "Failed to get value monitor for %s", str2);
            return a2;
        }
        azph.m85998a(this.f99942a).mo55168b(i, str2);
        return m86199a(str2, bdar, i3, bmxj4);
    }

    /* renamed from: a */
    public final String mo55252a(Object obj, bmxj bmxj, String str, int i) {
        bmxv bmxv = (bmxv) bmxj.apply(obj);
        if (!bmxv.mo66813a()) {
            azoj.m85933c("LTJSBridgeInterface", "Error when converting %s to JSON", obj);
            azph.m85998a(this.f99942a).mo55173d(i, 58, str);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Could not convert %s to JSON", obj);
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86140a((JSONObject) bmxv.mo66814b());
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public final String mo55253a(String str, azrh azrh, int i, int i2) {
        return mo55254a(str, azre.f99934a, azrf.f99935a, azrh, new azqv(this), i, i2);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public final String mo55254a(String str, bmxj bmxj, bmxj bmxj2, azrh azrh, bmxj bmxj3, int i, int i2) {
        azrg a = mo55248a(str, bmxj, bmxj2, azrh, i, i2);
        if (a.f99936a) {
            return (String) bmxj3.apply(a.f99937b);
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Failed to call lighter function.", new Object[0]);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public final String mo55255a(String str, bmxj bmxj, bmxj bmxj2, ConcurrentMap concurrentMap, azrj azrj, azrh azrh, bdaq bdaq, bmxj bmxj3, int i, int i2) {
        return mo55259b(str, bmxj, bmxj2, concurrentMap, azrj, azrh, bdaq, new azqz(this, bmxj3, str, i2), i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo55256a(String str, String str2, azrh azrh, int i, int i2) {
        return mo55257a(str, str2, azqu.f99917a, azrh, new azqx(this), i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo55257a(String str, String str2, bmxj bmxj, azrh azrh, bmxj bmxj2, int i, int i2) {
        azrg a = mo55249a(str, str2, bmxj, azrh, i, i2);
        if (a.f99936a) {
            return (String) bmxj2.apply(a.f99937b);
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Failed to call lighter function.", new Object[0]);
    }

    /* renamed from: a */
    public final String mo55258a(String str, String str2, bmxj bmxj, ConcurrentMap concurrentMap, azrj azrj, azrh azrh, bdaq bdaq, bmxj bmxj2, int i, int i2) {
        String str3 = str2;
        ConcurrentMap concurrentMap2 = concurrentMap;
        bdaq bdaq2 = bdaq;
        bmxj bmxj3 = bmxj2;
        int i3 = i2;
        bdax bdax = new bdax();
        Integer valueOf = Integer.valueOf(azrj.f99940a.intValue());
        bdar bdar = (bdar) concurrentMap2.putIfAbsent(valueOf, bdax);
        if (bdar == null) {
            azrg a = mo55249a(str, str2, bmxj, azrh, i, i2);
            if (a.f99936a) {
                bdar bdar2 = (bdar) a.f99937b;
                concurrentMap2.put(valueOf, bdar2);
                if (cfgs.m139406l()) {
                    bdar2.mo56710a((bdaq) new azri(bdaq2));
                } else {
                    bdar2.mo56710a(bdaq2);
                }
                bdar2.mo57830c(new azra(bdax));
                return m86199a(str3, bdar2, i3, bmxj3);
            }
            concurrentMap2.remove(valueOf);
            azqf.m86130a(this.f99942a);
            String a2 = azqf.m86138a("Failed to get value monitor.", new Object[0]);
            azoj.m85933c("LTJSBridgeInterface", "Failed to get value monitor for %s", str3);
            return a2;
        }
        azph.m85998a(this.f99942a).mo55168b(i, str3);
        return m86199a(str3, bdar, i3, bmxj3);
    }
}
