package p000;

import android.app.slice.SliceManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Pair;
import androidx.slice.Slice;
import com.google.android.cast.JGCastService;
import java.util.Set;

/* renamed from: apr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apr {

    /* renamed from: a */
    protected final Context f1943a;

    /* renamed from: b */
    public final SliceManager f1944b;

    /* renamed from: c */
    private final ArrayMap f1945c;

    /* renamed from: d */
    private final C1223np f1946d;

    /* renamed from: e */
    private final C1223np f1947e;

    /* renamed from: f */
    private final Set f1948f;

    apr() {
    }

    /* renamed from: a */
    public static apr m1818a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new apr(context);
    }

    /* renamed from: b */
    public final void mo2275b(Uri uri) {
        try {
            this.f1944b.unpinSlice(uri);
        } catch (IllegalStateException e) {
        }
    }

    /* renamed from: c */
    public final Slice mo2277c(Uri uri) {
        String authority = uri.getAuthority();
        String str = (String) this.f1947e.get(authority);
        boolean z = false;
        if (str == null) {
            ProviderInfo resolveContentProvider = this.f1943a.getPackageManager().resolveContentProvider(authority, 0);
            if (resolveContentProvider != null) {
                str = resolveContentProvider.packageName;
                this.f1947e.put(authority, str);
            }
            return aph.m1807a(this.f1944b.bindSlice(uri, this.f1948f), this.f1943a);
        }
        Boolean bool = (Boolean) this.f1946d.get(str);
        if (bool == null) {
            try {
                if ((this.f1943a.getPackageManager().getApplicationInfo(str, 0).flags & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                this.f1946d.put(str, bool);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (bool.booleanValue()) {
            return null;
        }
        return aph.m1807a(this.f1944b.bindSlice(uri, this.f1948f), this.f1943a);
    }

    public apr(Context context) {
        this.f1945c = new ArrayMap();
        this.f1943a = context;
        this.f1946d = new C1223np();
        this.f1947e = new C1223np();
        this.f1944b = (SliceManager) context.getSystemService(SliceManager.class);
        this.f1948f = aph.m1809a(ara.f2048c);
    }

    /* renamed from: a */
    public final void mo2273a(Uri uri) {
        try {
            this.f1944b.pinSlice(uri, this.f1948f);
        } catch (RuntimeException e) {
            ContentProviderClient acquireContentProviderClient = this.f1943a.getContentResolver().acquireContentProviderClient(uri);
            if (acquireContentProviderClient == null) {
                throw new IllegalArgumentException("No provider found for " + uri);
            }
            acquireContentProviderClient.release();
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo2276b(Uri uri, apq apq) {
        synchronized (this.f1945c) {
            apw apw = (apw) this.f1945c.remove(new Pair(uri, apq));
            if (apw != null) {
                apw.mo2283b();
            }
        }
    }

    /* renamed from: a */
    public final void mo2274a(Uri uri, apq apq) {
        apw apw = new apw(this, uri, new aps(new Handler(Looper.getMainLooper())), apq);
        Pair pair = new Pair(uri, apq);
        synchronized (this.f1945c) {
            apw apw2 = (apw) this.f1945c.put(pair, apw);
            if (apw2 != null) {
                apw2.mo2283b();
            }
        }
        ContentProviderClient acquireContentProviderClient = apw.f1959f.f1943a.getContentResolver().acquireContentProviderClient(apw.f1954a);
        if (acquireContentProviderClient != null) {
            acquireContentProviderClient.release();
            apw.f1959f.f1943a.getContentResolver().registerContentObserver(apw.f1954a, true, apw.f1958e);
            apw.mo2282a();
        }
    }
}
