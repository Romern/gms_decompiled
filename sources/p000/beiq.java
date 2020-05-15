package p000;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: beiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beiq implements bejx {

    /* renamed from: a */
    public static final TimeUnit f111595a = TimeUnit.SECONDS;

    /* renamed from: b */
    public final Context f111596b;

    /* renamed from: c */
    public final String f111597c;

    /* renamed from: d */
    public final String f111598d;

    /* renamed from: e */
    public final Handler f111599e;

    /* renamed from: f */
    public final bqgk f111600f;

    public beiq(Context context, Handler handler, bqgk bqgk, String str) {
        this.f111596b = context;
        this.f111597c = context.getPackageName();
        this.f111598d = str;
        this.f111599e = handler;
        this.f111600f = bqgk;
    }

    /* renamed from: a */
    public final bqgg mo60742a(bqgg bqgg) {
        return bqdx.m112674a(bqgg, new beim(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo60743a(bqgg bqgg, Runnable runnable) {
        return bqdx.m112673a(bqgg, new bein(this, runnable), bqfb.INSTANCE);
    }
}
