package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: jxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jxi extends AsyncTaskLoader {

    /* renamed from: a */
    private final boolean f23446a;

    /* renamed from: b */
    private Object f23447b;

    public jxi(Context context) {
        this(context, false);
    }

    public final void deliverResult(Object obj) {
        this.f23447b = obj;
        if (isStarted()) {
            super.deliverResult(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.f23447b = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj;
        super.onStartLoading();
        if (this.f23446a && (obj = this.f23447b) != null) {
            deliverResult(obj);
        }
        if (takeContentChanged() || this.f23447b == null) {
            forceLoad();
        }
    }

    public jxi(Context context, boolean z) {
        super(context);
        this.f23446a = z;
    }
}
