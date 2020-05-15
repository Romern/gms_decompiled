package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: apod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apod extends sbm {

    /* renamed from: a */
    private final String f84758a;

    public apod(Context context, Looper looper, int i, sat sat, rlz rlz, rof rof, aplz aplz) {
        super(context, looper, i, sat, rlz, rof);
        this.f84758a = aplz != null ? aplz.f84723a : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle f = super.mo12238f();
        f.putString("ComponentName", this.f84758a);
        return f;
    }
}
