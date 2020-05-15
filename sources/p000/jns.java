package p000;

import java.util.concurrent.Executor;

/* renamed from: jns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jns {

    /* renamed from: a */
    private final Executor f22906a;

    protected jns(Executor executor) {
        this.f22906a = executor;
    }

    /* renamed from: a */
    public abstract void mo13779a(jnt jnt, int i, int i2);

    /* renamed from: a */
    public abstract void mo13780a(jnt jnt, String str, byte[] bArr);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13918b(jnt jnt, int i, int i2) {
        this.f22906a.execute(new jnq(this, jnt, i, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13919b(jnt jnt, String str, byte[] bArr) {
        this.f22906a.execute(new jnr(this, jnt, str, bArr));
    }
}
