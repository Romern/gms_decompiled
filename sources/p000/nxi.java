package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: nxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nxi implements odr {

    /* renamed from: a */
    final /* synthetic */ nxj f36865a;

    public nxi(nxj nxj) {
        this.f36865a = nxj;
    }

    /* renamed from: a */
    public final void mo21789a() {
    }

    /* renamed from: b */
    public final void mo21792b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        nxj nxj = this.f36865a;
        bnsn bnsn = nxj.f36866a;
        nwy a = nxj.f36874i.mo21774a();
        a.f36851a = bufferInfo.presentationTimeUs;
        nxj nxj2 = this.f36865a;
        if (nxj2.f36870e) {
            a.f36852b.put(nxj2.mo21794a(byteBuffer.limit()));
            a.f36852b.put(byteBuffer);
            ByteBuffer byteBuffer2 = a.f36852b;
            byteBuffer2.limit(byteBuffer2.position());
        } else {
            a.f36852b.put(byteBuffer);
            ByteBuffer byteBuffer3 = a.f36852b;
            byteBuffer3.limit(byteBuffer3.position());
        }
        a.f36852b.position(10);
        this.f36865a.f36874i.mo21775a(a);
        this.f36865a.f36873h.release();
    }

    /* renamed from: a */
    public final void mo21790a(String str) {
        bnsi b = nxj.f36866a.mo68387b();
        b.mo68432a("nxi", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68420a("AAC audio encoder returned error: %s", str);
    }

    /* renamed from: a */
    public final void mo21791a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        nxj nxj = this.f36865a;
        bnsn bnsn = nxj.f36866a;
        bmxy.m108581a(nxj.f36872g);
        this.f36865a.f36872g.clear();
        this.f36865a.f36872g.put(byteBuffer);
        this.f36865a.f36872g.limit(byteBuffer.limit());
        this.f36865a.f36871f.release();
    }
}
