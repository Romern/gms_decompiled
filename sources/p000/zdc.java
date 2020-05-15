package p000;

import android.content.Context;
import android.os.Handler;
import java.util.List;

/* renamed from: zdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdc {

    /* renamed from: a */
    public final Context f54932a;

    /* renamed from: b */
    public final zdi f54933b;

    /* renamed from: c */
    public final zdi f54934c;

    /* renamed from: d */
    public final Handler f54935d;

    public zdc(Context context, Handler handler, zgf zgf) {
        bmxy.m108581a(context);
        this.f54932a = context;
        this.f54933b = new zdi(zgf);
        this.f54934c = new zdi(zgf);
        bmxy.m108581a(handler);
        this.f54935d = handler;
    }

    /* renamed from: a */
    public final List mo30944a(yxh yxh) {
        return this.f54933b.mo30952a(new zcz(null, yxh, null));
    }
}
