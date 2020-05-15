package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: rrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rrj extends AsyncTaskLoader {

    /* renamed from: a */
    private Object f43547a;

    public rrj(Context context) {
        super(context);
    }

    public final void deliverResult(Object obj) {
        this.f43547a = obj;
        if (isStarted()) {
            super.deliverResult(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.f43547a = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        Object obj = this.f43547a;
        if (obj != null) {
            deliverResult(obj);
        }
        if (takeContentChanged() || this.f43547a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        super.onStopLoading();
        cancelLoad();
    }
}
