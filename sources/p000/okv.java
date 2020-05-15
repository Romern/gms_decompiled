package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.projection.common.BufferPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* renamed from: okv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class okv {

    /* renamed from: a */
    final /* synthetic */ okx f37868a;

    /* renamed from: b */
    private final ReadableByteChannel f37869b;

    /* renamed from: c */
    private final ParcelFileDescriptor.AutoCloseInputStream f37870c;

    /* renamed from: d */
    private final ByteBuffer f37871d = ByteBuffer.allocate(65);

    public okv(okx okx, ParcelFileDescriptor parcelFileDescriptor) {
        this.f37868a = okx;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f37870c = autoCloseInputStream;
        this.f37869b = Channels.newChannel(autoCloseInputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo22263a(int i, ByteBuffer byteBuffer) {
        int read;
        byteBuffer.clear();
        byteBuffer.limit(i);
        read = this.f37869b.read(byteBuffer);
        byteBuffer.flip();
        return read;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22265b() {
        bnsi d = okx.f37875a.mo68390d();
        d.mo68432a("okv", "b", 446, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        int i = this.f37868a.f37882h;
        String a = ofp.m28659a(i);
        if (i != 0) {
            d.mo68420a("%s Start executor and read messages", a);
            this.f37868a.f37878d.execute(new oku(this));
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22266c() {
        okx okx = this.f37868a;
        bnsn bnsn = okx.f37875a;
        synchronized (okx.f37880f) {
            try {
                this.f37870c.close();
            } catch (IOException e) {
                bnsi c = okx.f37875a.mo68388c();
                c.mo68437a(e);
                c.mo68432a("okv", "c", 455, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                int i = this.f37868a.f37882h;
                String a = ofp.m28659a(i);
                if (i != 0) {
                    c.mo68420a("%s Closing with exception", a);
                } else {
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0128, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo22264a() {
        okm okm;
        okm okm2;
        try {
            this.f37871d.clear();
            ByteBuffer duplicate = this.f37871d.duplicate();
            if (mo22263a(1, duplicate) == 1) {
                byte b = duplicate.get() & 255;
                ByteBuffer duplicate2 = this.f37871d.duplicate();
                if (mo22263a(b, duplicate2) == b) {
                    nqi nqi = (nqi) GeneratedMessageLite.m124012a(nqi.f36409i, duplicate2);
                    if ((nqi.f36411a & 16) != 0) {
                        bmxy.m108588a(true);
                        okx okx = this.f37868a;
                        bnsn bnsn = okx.f37875a;
                        synchronized (okx.f37880f) {
                            boolean containsKey = this.f37868a.f37879e.containsKey(Integer.valueOf(nqi.f36415e));
                            int i = nqi.f36415e;
                            StringBuilder sb = new StringBuilder(55);
                            sb.append("Endpoint doesnt have a listener for channel ");
                            sb.append(i);
                            bmxy.m108589a(containsKey, sb.toString());
                            okm2 = (okm) this.f37868a.f37879e.get(Integer.valueOf(nqi.f36415e));
                        }
                        nqf nqf = nqi.f36416f;
                        if (nqf == null) {
                            nqf = nqf.f36402e;
                        }
                        int a = nqh.m27309a(nqf.f36405b);
                        if (a != 0) {
                            if (a == 3) {
                                nqf nqf2 = nqi.f36416f;
                                if (nqf2 == null) {
                                    nqf2 = nqf.f36402e;
                                }
                                okm2.mo22249a(nqf2.f36406c);
                            }
                        }
                        nqf nqf3 = nqi.f36416f;
                        if (nqf3 == null) {
                            nqf3 = nqf.f36402e;
                        }
                        int a2 = nqh.m27309a(nqf3.f36405b);
                        if (a2 == 0 || a2 != 4) {
                            okm2.mo22251b();
                        } else {
                            nqf nqf4 = nqi.f36416f;
                            if (nqf4 == null) {
                                nqf4 = nqf.f36402e;
                            }
                            okm2.mo22252b(nqf4.f36407d);
                        }
                    } else {
                        ByteBuffer buffer = BufferPool.getBuffer(nqi.f36412b + 2);
                        buffer.putShort((short) nqi.f36413c);
                        while (true) {
                            if (this.f37869b.read(buffer) <= 0 && !buffer.hasRemaining()) {
                                break;
                            }
                        }
                        okx okx2 = this.f37868a;
                        bnsn bnsn2 = okx.f37875a;
                        synchronized (okx2.f37880f) {
                            boolean containsKey2 = this.f37868a.f37879e.containsKey(Integer.valueOf(nqi.f36415e));
                            int i2 = nqi.f36415e;
                            StringBuilder sb2 = new StringBuilder(55);
                            sb2.append("Endpoint doesnt have a listener for channel ");
                            sb2.append(i2);
                            bmxy.m108589a(containsKey2, sb2.toString());
                            okm = (okm) this.f37868a.f37879e.get(Integer.valueOf(nqi.f36415e));
                        }
                        okm.mo22250a(nqi, buffer);
                    }
                    this.f37868a.f37878d.execute(new okt(this));
                }
            }
        } catch (IOException e) {
            bnsi c = okx.f37875a.mo68388c();
            c.mo68432a("okv", "a", 435, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            int i3 = this.f37868a.f37882h;
            String a3 = ofp.m28659a(i3);
            if (i3 != 0) {
                c.mo68420a("%s Read EOF or exception", a3);
                if (ccpv.m131197f()) {
                    this.f37868a.f37877c.mo21328b(bpdn.CAR_SERVICE_CONNECTION_ERROR, bpdo.READER_IO_ERROR, "Failed to read message");
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
