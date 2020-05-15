package p000;

import android.content.Context;
import android.os.Binder;
import java.io.PrintWriter;

/* renamed from: zlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zlz {

    /* renamed from: a */
    public final Context f55428a;

    /* renamed from: b */
    public final String f55429b;

    /* renamed from: c */
    protected final yzs f55430c;

    /* renamed from: d */
    private final sns f55431d;

    protected zlz(zmb zmb, String str, yzs yzs) {
        this.f55429b = str;
        this.f55430c = yzs;
        this.f55428a = zmb;
        this.f55431d = zmb.f55435c;
    }

    /* renamed from: a */
    public Binder mo31232a(ytt ytt) {
        return mo31233a(this.f55430c.mo30871a(ytt, mo31234a(), this.f55431d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Binder mo31233a(ytu ytu);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ytv mo31234a();

    /* renamed from: a */
    public void mo31235a(PrintWriter printWriter) {
    }

    /* renamed from: a */
    public abstract void mo31236a(String str);

    /* renamed from: b */
    public final void mo31237b(ytt ytt) {
        rfz.m33557a(this.f55428a).mo24605a(ytt.f54617a);
    }
}
