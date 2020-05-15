package p000;

import java.util.concurrent.Executor;

/* renamed from: jjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjs extends jns {

    /* renamed from: a */
    final /* synthetic */ jju f22637a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jjs(jju jju, Executor executor) {
        super(executor);
        this.f22637a = jju;
    }

    /* renamed from: a */
    public final void mo13796a(jnt jnt) {
        if (this.f22637a.f22646i.contains(jnt.mo13824d())) {
            this.f22637a.f22641d.add(jnt.mo13824d());
        }
        this.f22637a.mo13798a(jnt.mo13824d());
        this.f22637a.f22646i.remove(jnt.mo13824d());
        this.f22637a.f22642e.remove(jnt);
        this.f22637a.mo13802c();
    }

    /* renamed from: a */
    public final void mo13780a(jnt jnt, String str, byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo13779a(jnt jnt, int i, int i2) {
        this.f22637a.f22647j.post(new jjr(this, i2, jnt));
    }
}
