package p000;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: bcdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcdp {

    /* renamed from: a */
    private static bcdp f104015a = null;

    /* renamed from: b */
    private final Map f104016b = new HashMap();

    /* renamed from: a */
    public static synchronized bcdp m88848a() {
        bcdp bcdp;
        synchronized (bcdp.class) {
            if (f104015a == null) {
                f104015a = new bcdp();
            }
            bcdp = f104015a;
        }
        return bcdp;
    }

    /* renamed from: a */
    public final synchronized void mo56717a(Uri uri) {
        if (this.f104016b.containsKey(uri)) {
            for (ContentObserver contentObserver : (Set) this.f104016b.get(uri)) {
                contentObserver.dispatchChange(false, uri);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo56718a(Uri uri, ContentObserver contentObserver) {
        Set set;
        if (!this.f104016b.containsKey(uri)) {
            set = Collections.newSetFromMap(new WeakHashMap());
            this.f104016b.put(uri, set);
        } else {
            set = (Set) this.f104016b.get(uri);
        }
        set.add(contentObserver);
    }
}
