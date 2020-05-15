package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: avat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avat extends aaab {

    /* renamed from: a */
    protected final wfy f92872a;

    /* renamed from: b */
    protected final avgm f92873b;

    /* renamed from: c */
    protected final ClientContext f92874c;

    /* renamed from: d */
    protected final bbjm f92875d;

    /* renamed from: e */
    protected final Executor f92876e;

    /* renamed from: f */
    protected final FacsInternalSyncCallOptions f92877f;

    protected avat(String str, wfy wfy, avgm avgm, ClientContext clientContext, bbjm bbjm, Executor executor, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        super(220, str);
        this.f92872a = wfy;
        this.f92873b = avgm;
        this.f92874c = clientContext;
        this.f92875d = bbjm;
        this.f92876e = executor;
        this.f92877f = facsInternalSyncCallOptions;
    }

    /* renamed from: a */
    static final Object m78156a(bqgg bqgg) {
        try {
            return bqgg.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw new IllegalStateException("ExecutionException without cause", e);
            }
            bmzo.m108687a(cause, gid.class);
            bmzo.m108687a(cause, chuw.class);
            bmzo.m108687a(cause, chux.class);
            bmzo.m108686a(cause);
            throw new IllegalStateException(cause);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51127a() {
        if (this.f92874c.f30213c == null) {
            throw new aaaj(5, "Provided client context doesn't have a resolved account!");
        }
    }
}
