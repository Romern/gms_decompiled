package p000;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

/* renamed from: okw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class okw {

    /* renamed from: a */
    final /* synthetic */ okx f37872a;

    /* renamed from: b */
    private final WritableByteChannel f37873b;

    /* renamed from: c */
    private final ParcelFileDescriptor.AutoCloseOutputStream f37874c;

    public okw(okx okx, ParcelFileDescriptor parcelFileDescriptor) {
        this.f37872a = okx;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        this.f37874c = autoCloseOutputStream;
        this.f37873b = Channels.newChannel(autoCloseOutputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22267a() {
        okx okx = this.f37872a;
        bnsn bnsn = okx.f37875a;
        synchronized (okx.f37880f) {
            try {
                this.f37874c.close();
            } catch (IOException e) {
                bnsi c = okx.f37875a.mo68388c();
                c.mo68437a(e);
                c.mo68432a("okw", "a", 523, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                int i = this.f37872a.f37882h;
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
    /* renamed from: a */
    public final synchronized void mo22268a(nqi nqi, ByteBuffer byteBuffer) {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(1);
            ByteBuffer wrap = ByteBuffer.wrap(nqi.mo73642k());
            allocate.put((byte) wrap.remaining());
            allocate.flip();
            ByteBuffer[] byteBufferArr = {allocate, wrap, byteBuffer};
            for (int i = 0; i < 3; i++) {
                ByteBuffer byteBuffer2 = byteBufferArr[i];
                int i2 = 0;
                while (byteBuffer2.hasRemaining() && i2 >= 0) {
                    i2 = this.f37873b.write(byteBuffer2);
                }
            }
        } catch (IOException e) {
            throw e;
        }
        return;
    }
}
