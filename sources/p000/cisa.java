package p000;

import java.nio.ByteBuffer;

/* renamed from: cisa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f191314a;

    /* renamed from: b */
    final /* synthetic */ cisx f191315b;

    public cisa(cisx cisx, ByteBuffer byteBuffer) {
        this.f191315b = cisx;
        this.f191314a = byteBuffer;
    }

    public final void run() {
        cisx cisx = this.f191315b;
        cisx.f191361c.execute(cisx.mo86473a(new cirz(this)));
    }
}
