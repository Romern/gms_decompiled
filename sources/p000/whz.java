package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: whz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class whz extends AsyncTaskLoader {

    /* renamed from: a */
    protected Object f50697a;

    public whz(Context context) {
        super(context);
    }

    public final void deliverResult(Object obj) {
        this.f50697a = obj;
        if (isStarted()) {
            super.deliverResult(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.f50697a = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj = this.f50697a;
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
