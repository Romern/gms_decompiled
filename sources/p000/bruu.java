package p000;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bruu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bruu {
    /* renamed from: a */
    public abstract Context mo69960a();

    /* renamed from: b */
    public abstract URI mo69961b();

    /* renamed from: c */
    public abstract Executor mo69962c();

    /* renamed from: d */
    public abstract Executor mo69963d();

    /* renamed from: e */
    public abstract ScheduledExecutorService mo69964e();

    /* renamed from: f */
    public abstract bmzi mo69966f();

    /* renamed from: g */
    public abstract brui mo69967g();

    /* renamed from: h */
    public abstract Integer mo69968h();

    /* renamed from: i */
    public abstract Integer mo69970i();

    /* renamed from: j */
    public abstract long mo69971j();

    /* renamed from: k */
    public final String mo69991k() {
        return mo69961b().getHost();
    }

    /* renamed from: l */
    public final int mo69992l() {
        return mo69961b().getPort();
    }
}
