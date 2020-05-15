package p000;

import android.content.Context;
import com.google.android.chimera.LoaderManager;

/* renamed from: tie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tie {

    /* renamed from: a */
    public final Context f46062a;

    /* renamed from: b */
    private final LoaderManager f46063b;

    public tie(LoaderManager loaderManager, Context context) {
        this.f46063b = loaderManager;
        this.f46062a = context;
    }

    /* renamed from: a */
    public final void mo26557a(String str, int i, tid tid) {
        if (str.startsWith("android.resource")) {
            this.f46063b.initLoader(i, null, new tia(this, tid, str));
        } else {
            this.f46063b.initLoader(i, null, new tib(this, tid, str));
        }
    }
}
