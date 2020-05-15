package p000;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

/* renamed from: grs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grs {

    /* renamed from: a */
    public final grz f18906a;

    /* renamed from: b */
    public final grt f18907b;

    /* renamed from: c */
    public final Handler f18908c = new adzt(Looper.getMainLooper());

    /* renamed from: d */
    private AsyncTask f18909d;

    public grs(grz grz, grt grt) {
        this.f18906a = grz;
        this.f18907b = grt;
    }

    /* renamed from: a */
    public final void mo12145a(String str, boolean z) {
        AsyncTask asyncTask = this.f18909d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f18909d = null;
        }
        grr grr = new grr(this, new grq(this), str, z);
        this.f18909d = grr;
        grr.execute(new Void[0]);
    }
}
