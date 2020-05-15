package p000;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: bbfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfl implements beib, bdcc {

    /* renamed from: a */
    public final ayte f102544a;

    /* renamed from: b */
    public final Executor f102545b;

    /* renamed from: c */
    public final HashMap f102546c = new HashMap();

    /* renamed from: d */
    public final HashMap f102547d = new HashMap();

    public bbfl(ayte ayte, Executor executor) {
        this.f102544a = ayte;
        this.f102545b = bqgs.m112813a(executor);
    }

    /* renamed from: a */
    public final behl mo56096a(Uri uri) {
        synchronized (bbfl.class) {
            String str = (String) this.f102546c.get(uri);
            if (str == null) {
                return null;
            }
            if (this.f102547d.get(str) != null) {
                behl behl = (behl) this.f102547d.get(str);
                return behl;
            }
            bbev.m87906a("%s: Can't find file group for uri: %s", "DownloadProgressMonitor", uri);
            return null;
        }
    }

    /* renamed from: a */
    public final beia mo56097a() {
        return null;
    }

    /* renamed from: b */
    public final behl mo56100b(Uri uri) {
        return mo56096a(uri);
    }

    /* renamed from: c */
    public final void mo24155c() {
        synchronized (bbfl.class) {
            for (behl behl : this.f102547d.values()) {
                bbkg bbkg = ((bbfk) behl.f111562a).f102542c.f102804a;
                synchronized (bbkg.f102806a) {
                    bbkg.f102807b = true;
                    bqgg bqgg = bbkg.f102808c;
                    if (bqgg != null) {
                        bqgg.cancel(true);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo24156d() {
    }

    /* renamed from: e */
    public final void mo24157e() {
    }

    /* renamed from: a */
    public final void mo56098a(String str) {
        synchronized (bbfl.class) {
            this.f102547d.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo56099a(String str, long j) {
        synchronized (bbfl.class) {
            if (this.f102547d.containsKey(str)) {
                ((behl) this.f102547d.get(str)).f111562a.mo56095a((int) j);
            }
        }
    }
}
