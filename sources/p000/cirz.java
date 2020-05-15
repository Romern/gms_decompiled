package p000;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* renamed from: cirz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirz implements cisy {

    /* renamed from: a */
    final /* synthetic */ cisa f191313a;

    public cirz(cisa cisa) {
        this.f191313a = cisa;
    }

    /* renamed from: a */
    public final void mo86442a() {
        int i;
        cisa cisa = this.f191313a;
        ReadableByteChannel readableByteChannel = cisa.f191315b.f191372n;
        if (readableByteChannel != null) {
            i = readableByteChannel.read(cisa.f191314a);
        } else {
            i = -1;
        }
        cisa cisa2 = this.f191313a;
        cisx cisx = cisa2.f191315b;
        ByteBuffer byteBuffer = cisa2.f191314a;
        if (i != -1) {
            cisu cisu = cisx.f191360b;
            cisu.mo86470a(new cisq(cisu, cisx.f191373o, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel2 = cisx.f191372n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (cisx.f191365g.compareAndSet(5, 7)) {
            cisx.mo86485d();
            cisu cisu2 = cisx.f191360b;
            cisu2.f191351b.execute(new ciss(cisu2, cisx.f191373o));
        }
    }
}
