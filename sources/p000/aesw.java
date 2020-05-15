package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: aesw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aesw extends AsyncTaskLoader {

    /* renamed from: a */
    private Object f63752a;

    public aesw(Context context) {
        super(context);
    }

    public final void deliverResult(Object obj) {
        this.f63752a = obj;
        super.deliverResult(obj);
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj = this.f63752a;
        if (obj == null) {
            forceLoad();
        } else {
            super.deliverResult(obj);
        }
    }
}
