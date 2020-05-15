package p000;

import android.os.Handler;
import com.google.android.projection.common.BufferPool;
import java.nio.ByteBuffer;

/* renamed from: olj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class olj extends ojh {

    /* renamed from: a */
    private static final bnsn f37901a = odk.m28481a("Lite.EP");

    /* renamed from: b */
    private final ojh f37902b;

    /* renamed from: c */
    private final ofu f37903c;

    /* renamed from: d */
    private okl f37904d;

    /* renamed from: e */
    private final ola f37905e;

    public olj(ojh ojh, ofu ofu, ola ola) {
        super(ojh.f37753n, null, null, ojh.f37754o);
        this.f37902b = ojh;
        this.f37903c = ofu;
        this.f37905e = ola;
    }

    /* renamed from: a */
    public final void mo22084a(int i) {
        bnsi d = f37901a.mo68390d();
        d.mo68432a("olj", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Rcvd msg %d:channel closed", this.f37755p.mo22112a());
        this.f37903c.mo22084a(i);
        this.f37902b.mo22084a(i);
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
        this.f37902b.mo22087b(i);
    }

    /* renamed from: d */
    public final void mo22149d() {
        okl okl = this.f37904d;
        if (okl != null) {
            oiv oiv = (oiv) okl;
            oiv.f37728b.mo22254a(oiv.f37727a);
            this.f37904d = null;
        }
        super.mo22149d();
        this.f37902b.mo22149d();
    }

    /* renamed from: i */
    public final void mo22088i() {
        bnsi d = f37901a.mo68390d();
        d.mo68432a("olj", "i", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Rcvd msg %d:channel opened", this.f37755p.mo22112a());
        this.f37903c.mo22088i();
        this.f37902b.mo22088i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        this.f37755p.mo22112a();
        byteBuffer.remaining();
    }

    /* renamed from: a */
    public final void mo22108a(ByteBuffer byteBuffer) {
        byteBuffer = BufferPool.f151458a.mo71339a(byteBuffer.capacity());
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            byteBuffer.put(byteBuffer);
            byteBuffer.order(byteBuffer.order());
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            super.mo22108a(byteBuffer);
            this.f37902b.mo22108a(byteBuffer);
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: a */
    public final void mo22210a(ogw ogw) {
        this.f37755p = ogw;
        ola ola = this.f37905e;
        int a = ogw.mo22112a();
        oli oli = new oli(a, ola.f37887b, this, (Handler) ola.f37886a.get(Integer.valueOf(a)));
        oli.f37728b.mo22255a(oli.f37727a, oli);
        this.f37904d = oli;
        this.f37902b.mo22210a(oli);
        this.f37902b.getClass().getName();
        ogw.mo22112a();
    }
}
