package p000;

import android.util.Log;
import android.util.Pair;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: citc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class citc extends ExperimentalUrlRequest.Builder {

    /* renamed from: a */
    private static final String f191382a = citc.class.getSimpleName();

    /* renamed from: b */
    private final cirf f191383b;

    /* renamed from: c */
    private final String f191384c;

    /* renamed from: d */
    private final UrlRequest.Callback f191385d;

    /* renamed from: e */
    private final Executor f191386e;

    /* renamed from: f */
    private String f191387f;

    /* renamed from: g */
    private final ArrayList f191388g = new ArrayList();

    /* renamed from: h */
    private Collection f191389h;

    /* renamed from: i */
    private UploadDataProvider f191390i;

    /* renamed from: j */
    private Executor f191391j;

    /* renamed from: k */
    private boolean f191392k;

    /* renamed from: l */
    private boolean f191393l;

    /* renamed from: m */
    private int f191394m;

    /* renamed from: n */
    private boolean f191395n;

    /* renamed from: o */
    private int f191396o;

    public citc(String str, UrlRequest.Callback callback, Executor executor, cirf cirf) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (callback == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor != null) {
            this.f191384c = str;
            this.f191385d = callback;
            this.f191386e = executor;
            this.f191383b = cirf;
        } else {
            throw new NullPointerException("Executor is required.");
        }
    }

    /* renamed from: a */
    public final citb build() {
        citb a = this.f191383b.mo86391a(this.f191384c, this.f191385d, this.f191386e, this.f191392k, this.f191393l, this.f191394m, this.f191395n, this.f191396o);
        String str = this.f191387f;
        if (str != null) {
            a.mo86476a(str);
        }
        ArrayList arrayList = this.f191388g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            a.mo86477a((String) pair.first, (String) pair.second);
        }
        UploadDataProvider uploadDataProvider = this.f191390i;
        if (uploadDataProvider != null) {
            a.mo86480a(uploadDataProvider, this.f191391j);
        }
        return a;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.f191389h == null) {
                this.f191389h = new ArrayList();
            }
            this.f191389h.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    /* renamed from: b */
    public final void mo86500b() {
        this.f191392k = true;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        if (str != null) {
            this.f191387f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.f191393l = true;
        this.f191394m = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.f191395n = true;
        this.f191396o = i;
        return this;
    }

    /* renamed from: a */
    public final void mo86495a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else if ("Accept-Encoding".equalsIgnoreCase(str)) {
            Log.w(f191382a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
        } else {
            this.f191388g.add(Pair.create(str, str2));
        }
    }

    /* renamed from: a */
    public final void mo86496a(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (executor != null) {
            if (this.f191387f == null) {
                this.f191387f = DataParser.CONNECT_TYPE_POST;
            }
            this.f191390i = uploadDataProvider;
            this.f191391j = executor;
        } else {
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
    }
}
