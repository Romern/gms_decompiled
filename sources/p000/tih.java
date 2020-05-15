package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: tih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tih extends AsyncTaskLoader {

    /* renamed from: a */
    public Handler f46067a;

    /* renamed from: b */
    public Runnable f46068b;

    /* renamed from: c */
    private Object f46069c;

    /* renamed from: d */
    private boolean f46070d;

    public tih(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo26559a() {
        Runnable runnable;
        Handler handler = this.f46067a;
        if (handler != null && (runnable = this.f46068b) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public final void deliverResult(Object obj) {
        if (!this.f46070d) {
            this.f46069c = obj;
            if (isStarted() && !isReset()) {
                super.deliverResult(obj);
                this.f46070d = true;
                mo26559a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        this.f46069c = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj = this.f46069c;
        if (obj != null) {
            deliverResult(obj);
        } else {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
