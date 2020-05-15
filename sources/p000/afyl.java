package p000;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: afyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afyl implements afyi {

    /* renamed from: a */
    public final bmzi f64968a;

    /* renamed from: b */
    public final befa f64969b;

    /* renamed from: c */
    public final Uri f64970c;

    /* renamed from: d */
    private final Executor f64971d;

    public afyl(Executor executor, bmzi bmzi, befa befa, Uri uri) {
        this.f64971d = executor;
        this.f64968a = bmzi;
        this.f64969b = befa;
        this.f64970c = uri;
    }

    /* renamed from: a */
    public final bqgg mo35023a() {
        return bqdf.m112620a(bqga.m112778a(new afyj(this), this.f64971d), Exception.class, afyk.f64967a, bqfb.INSTANCE);
    }
}
