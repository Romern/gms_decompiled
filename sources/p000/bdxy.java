package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bdxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdxy implements bdyc {

    /* renamed from: c */
    public static final String[] f106612c = {"key", "value"};

    /* renamed from: d */
    private static final Map f106613d = new C1223np();

    /* renamed from: a */
    public final ContentResolver f106614a;

    /* renamed from: b */
    public final Uri f106615b;

    /* renamed from: e */
    private final ContentObserver f106616e = new bdxx(this);

    /* renamed from: f */
    private final Object f106617f = new Object();

    /* renamed from: g */
    private volatile Map f106618g;

    /* renamed from: h */
    private final List f106619h = new ArrayList();

    private bdxy(ContentResolver contentResolver, Uri uri) {
        this.f106614a = contentResolver;
        this.f106615b = uri;
        contentResolver.registerContentObserver(uri, false, this.f106616e);
    }

    /* renamed from: a */
    public static bdxy m91563a(ContentResolver contentResolver, Uri uri) {
        bdxy bdxy;
        synchronized (bdxy.class) {
            bdxy = (bdxy) f106613d.get(uri);
            if (bdxy == null) {
                try {
                    bdxy bdxy2 = new bdxy(contentResolver, uri);
                    try {
                        f106613d.put(uri, bdxy2);
                    } catch (SecurityException e) {
                    }
                    bdxy = bdxy2;
                } catch (SecurityException e2) {
                }
            }
        }
        return bdxy;
    }

    /* renamed from: c */
    static synchronized void m91565c() {
        synchronized (bdxy.class) {
            for (bdxy bdxy : f106613d.values()) {
                bdxy.f106614a.unregisterContentObserver(bdxy.f106616e);
            }
            f106613d.clear();
        }
    }

    /* renamed from: b */
    public final void mo58435b() {
        synchronized (this.f106617f) {
            this.f106618g = null;
            bdyx.m91613a();
        }
        synchronized (this) {
            for (bdxz bdxz : this.f106619h) {
                bdxz.mo58436a();
            }
        }
    }

    /* renamed from: a */
    public static void m91564a(Uri uri) {
        synchronized (bdxy.class) {
            bdxy bdxy = (bdxy) f106613d.get(uri);
            if (bdxy != null) {
                bdxy.mo58435b();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo58433a(String str) {
        return (String) mo58434a().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Map mo58434a() {
        Map map;
        Map map2 = this.f106618g;
        if (map2 == null) {
            synchronized (this.f106617f) {
                map2 = this.f106618g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) bdya.m91570a(new bdxw(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f106618g = map;
                    map2 = map;
                }
            }
        }
        return map2 == null ? Collections.emptyMap() : map2;
    }
}
