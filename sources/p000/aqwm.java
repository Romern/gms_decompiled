package p000;

import android.content.Context;
import com.google.android.chimera.LoaderManager;

/* renamed from: aqwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwm {

    /* renamed from: a */
    public final LoaderManager f86977a;

    /* renamed from: b */
    public final Context f86978b;

    /* renamed from: c */
    public final int f86979c;

    /* renamed from: d */
    public final String f86980d;

    /* renamed from: e */
    public final String f86981e;

    /* renamed from: f */
    public final String f86982f;

    public aqwm(LoaderManager loaderManager, Context context, int i, String str, String str2, String str3) {
        this.f86977a = loaderManager;
        this.f86978b = context;
        this.f86979c = i;
        this.f86980d = str;
        this.f86981e = str2;
        this.f86982f = str3;
    }

    /* renamed from: a */
    public final void mo48200a(int i, aqwl aqwl) {
        this.f86977a.initLoader(i, null, new aqwk(this, aqwl));
    }
}
