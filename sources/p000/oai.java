package p000;

import android.media.MediaCodec;
import android.os.SystemClock;
import com.google.android.projection.common.BufferPool;
import java.nio.ByteBuffer;

/* renamed from: oai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oai implements odr {

    /* renamed from: a */
    final /* synthetic */ oak f37051a;

    public oai(oak oak) {
        this.f37051a = oak;
    }

    /* renamed from: a */
    public final void mo21789a() {
    }

    /* renamed from: b */
    public final void mo21792b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (bufferInfo.size > 4096) {
            bnsn bnsn = oak.f37052a;
            int i = bufferInfo.size;
        }
        odw.m28521b(byteBuffer);
        oak oak = this.f37051a;
        bnsn bnsn2 = oak.f37052a;
        oal oal = oak.f37062i;
        boolean e = ccur.f180000a.mo6606a().mo76854e();
        oah oah = null;
        if (oal != null) {
            synchronized (((nvk) oal).f36612M) {
                if (((nvk) oal).f36613N.isEmpty()) {
                    bnsi c = nvk.f36599a.mo68388c();
                    c.mo68432a("nvk", "l", 1068, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("More frames are encoded than they were sent to the encoder");
                } else {
                    ((nvk) oal).f36625Z.f37703f.mo20695d((int) ((SystemClock.elapsedRealtimeNanos() - ((Long) ((nvk) oal).f36613N.peek()).longValue()) / 1000));
                }
            }
            if (e) {
                oal.getClass();
                oah = new oah(oal);
            }
        }
        ByteBuffer buffer = BufferPool.getBuffer(byteBuffer.limit() + 10);
        buffer.putShort(0);
        buffer.position(10);
        byteBuffer.rewind();
        buffer.put(byteBuffer);
        okf okf = this.f37051a.f37059f;
        bmxy.m108581a(okf);
        okf.mo22185a(bufferInfo.presentationTimeUs, buffer, oah);
        if (oal != null) {
            synchronized (((nvk) oal).f36612M) {
                if (!((nvk) oal).f36613N.isEmpty()) {
                    long longValue = ((Long) ((nvk) oal).f36613N.pop()).longValue();
                    while (!((nvk) oal).f36614O.isEmpty() && ((Long) ((C1240of) ((nvk) oal).f36614O.peek()).f26798a).longValue() <= longValue) {
                        ((nvk) oal).f36625Z.mo22243a((biwb) ((C1240of) ((nvk) oal).f36614O.pop()).f26799b);
                    }
                } else {
                    bnsi c2 = nvk.f36599a.mo68388c();
                    c2.mo68432a("nvk", "m", 1081, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("More frames are encoded than they were sent to the encoder");
                }
            }
        }
        if (bufferInfo.size > 4096) {
            int i2 = bufferInfo.size;
        }
        if (oal != null && !e) {
            oal.mo21696k();
        }
    }

    /* renamed from: a */
    public final void mo21790a(String str) {
        bnsi d = oak.f37052a.mo68390d();
        d.mo68432a("oai", "a", 673, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("video encoder returned error %s", str);
    }

    /* renamed from: a */
    public final void mo21791a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        odo odo;
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
        allocate.put(byteBuffer);
        bnsn bnsn = oak.f37052a;
        int i = bufferInfo.size;
        oak oak = this.f37051a;
        bmxy.m108581a(oak.f37060g);
        byte[] array = allocate.array();
        byte[] bArr = null;
        if (array != null) {
            odo = null;
            int i2 = 0;
            while (odo == null && i2 <= array.length - 5) {
                if (array[i2] == 0 && array[i2 + 1] == 0 && array[i2 + 2] == 0 && array[i2 + 3] == 1) {
                    byte b = array[i2 + 4];
                    if (!((b & 128) == 128 || (b & 96) == 0 || (b & 31) != 7)) {
                        try {
                            odo = new odo(array, i2 + 5);
                        } catch (Exception e) {
                        }
                    }
                }
                i2++;
            }
        } else {
            odo = null;
        }
        if (odo != null && (odo.mo22025a(5) == 0 || odo.mo22025a(6) == 0)) {
            bnsi c = odp.f37288a.mo68388c();
            c.mo68432a("odp", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Codec configuration missing VUI/bitstream restriction flag");
            byte[] bArr2 = {0, -38, 8, -124, 106};
            if (odo.f37285a.get(5) == 1) {
                bnsi d = odp.f37288a.mo68390d();
                d.mo68432a("odo", "a", 487, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("VUI already present");
                if (odo.f37285a.get(6) == 1) {
                    bArr = odo.f37286b;
                }
            } else {
                int i3 = odo.f37287c;
                int i4 = (i3 + 8) / 8;
                int i5 = (i3 + 47) / 8;
                byte[] bArr3 = odo.f37286b;
                byte[] bArr4 = new byte[((bArr3.length - i4) + i5)];
                odo.m28496a(bArr4, 0, bArr3, 0, i3 - 1);
                int i6 = odo.f37287c;
                int i7 = i6 / 8;
                bArr4[i7] = (byte) (bArr4[i7] | (128 >>> (i6 % 8)));
                odo.m28496a(bArr4, i6 + 1, bArr2, 0, 39);
                byte[] bArr5 = odo.f37286b;
                odo.m28496a(bArr4, i5 * 8, bArr5, i4 * 8, (bArr5.length - i4) * 8);
                bArr = bArr4;
            }
            if (bArr == null) {
                bnsi b2 = odp.f37288a.mo68387b();
                b2.mo68432a("odp", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Could not add low latency VUI to SPS");
            }
        }
        if (bArr == null) {
            bArr = allocate.array();
        }
        oak.f37061h = bArr;
        okf okf = this.f37051a.f37059f;
        bmxy.m108581a(okf);
        okf.mo22186a(this.f37051a.f37061h);
    }
}
