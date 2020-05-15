package p000;

import android.os.Handler;
import java.nio.ByteBuffer;

/* renamed from: oli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oli extends oiv {

    /* renamed from: e */
    private static final bnsn f37899e = odk.m28481a("XFER.Lite");

    /* renamed from: d */
    public final oft f37900d;

    public oli(int i, oko oko, oft oft, Handler handler) {
        super(i, oko, handler);
        this.f37900d = oft;
    }

    /* renamed from: a */
    public final void mo22249a(int i) {
        this.f37729c.post(new olg(this, i));
    }

    /* renamed from: b */
    public final void mo22251b() {
        this.f37729c.post(new olf(this));
    }

    /* renamed from: a */
    public final void mo22113a(ByteBuffer byteBuffer, ogv ogv) {
        byteBuffer.flip();
        short s = byteBuffer.getShort();
        byteBuffer.remaining();
        if (!this.f37728b.mo22257a(this.f37727a, ogv, (char) s, byteBuffer)) {
            bnsi c = f37899e.mo68388c();
            c.mo68432a("oli", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Forward throttled, dropping packet");
        }
    }

    /* renamed from: b */
    public final void mo22252b(int i) {
        this.f37729c.post(new olh(this, i));
    }

    /* renamed from: a */
    public final void mo22250a(nqi nqi, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int i = nqi.f36413c;
        int i2 = nqi.f36412b;
        this.f37729c.post(new ole(this, byteBuffer));
    }

    /* renamed from: a */
    public final void mo22274a(ogv ogv, int i, ByteBuffer byteBuffer) {
        byteBuffer.remaining();
        if (!this.f37728b.mo22257a(this.f37727a, ogv, i, byteBuffer)) {
            bnsi c = f37899e.mo68388c();
            c.mo68432a("oli", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Forward throttled, dropping packet");
        }
    }
}
