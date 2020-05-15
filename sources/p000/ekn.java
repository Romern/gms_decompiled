package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ekn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ekn {

    /* renamed from: a */
    public final Context f15198a;

    /* renamed from: b */
    public final ekw f15199b;

    /* renamed from: c */
    public final ekt f15200c;

    /* renamed from: d */
    public final emd f15201d;

    /* renamed from: e */
    public final ejq f15202e;

    /* renamed from: f */
    private final Executor f15203f;

    public ekn(Context context, ejq ejq, ekw ekw, ekt ekt, Executor executor, emd emd) {
        this.f15198a = context;
        this.f15202e = ejq;
        this.f15199b = ekw;
        this.f15200c = ekt;
        this.f15203f = executor;
        this.f15201d = emd;
    }

    /* renamed from: a */
    public final void mo10238a(ejb ejb, int i, Runnable runnable) {
        this.f15203f.execute(new eki(this, ejb, i, runnable));
    }
}
