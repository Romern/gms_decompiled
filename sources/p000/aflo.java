package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aflo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aflo {

    /* renamed from: a */
    public final Executor f64329a;

    /* renamed from: b */
    public final Executor f64330b;

    /* renamed from: c */
    public final afno f64331c;

    /* renamed from: d */
    public final afnr f64332d;

    public aflo(Context context, Executor executor, Executor executor2) {
        this.f64329a = executor;
        this.f64330b = executor2;
        this.f64331c = new afno(context);
        this.f64332d = new afnr(context);
    }
}
