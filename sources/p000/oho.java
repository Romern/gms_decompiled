package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import com.google.android.projection.common.BufferPool;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: oho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oho {

    /* renamed from: a */
    public final boolean f37665a;

    /* renamed from: b */
    public final OutputStream f37666b;

    /* renamed from: c */
    final /* synthetic */ ohp f37667c;

    /* renamed from: d */
    private final ByteBuffer f37668d = ByteBuffer.allocate(8);

    /* renamed from: e */
    private byte[] f37669e = new byte[8];

    public oho(ohp ohp, Bundle bundle) {
        this.f37667c = ohp;
        this.f37666b = (OutputStream) ojq.m28925a(OutputStream.class, bundle.getBinder("output_stream"));
        this.f37665a = bundle.getBoolean("use_buffered_output_stream");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22172a(ChannelMessage channelMessage, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        ChannelMessage channelMessage2 = channelMessage;
        bnsn bnsn = ohp.f37670a;
        int i7 = channelMessage2.f29508a;
        if (!channelMessage2.f29512e) {
            z2 = false;
        } else if (channelMessage2.f29511d > this.f37667c.f37678i - 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i8 = channelMessage2.f29511d;
        boolean z4 = true;
        while (i7 < i8) {
            int i9 = i7 == 0 ? 1 : 0;
            int i10 = 8;
            int i11 = 4;
            if (i9 == 0) {
                i = 4;
            } else {
                i = z2 ? 8 : 4;
            }
            int min = Math.min(i8 - i7, this.f37667c.f37678i - i);
            if (!z2 || i7 + min >= i8) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            int i12 = i2 | i9;
            if (!channelMessage2.f29513f) {
                i11 = 0;
            }
            int i13 = i11 | i12;
            if (!channelMessage2.f29515h) {
                i10 = 0;
            }
            int i14 = i10 | i13;
            ByteBuffer byteBuffer = channelMessage2.f29510c;
            int arrayOffset = byteBuffer.arrayOffset() + i7;
            if (!channelMessage2.f29515h) {
                i4 = i + min;
                i3 = arrayOffset;
                i5 = min;
            } else {
                oka oka = this.f37667c.f37674e;
                if (oka != null) {
                    byteBuffer = oka.mo22239a(byteBuffer, i7, min, i);
                    i4 = byteBuffer.remaining();
                    i5 = i4 - i;
                    i3 = byteBuffer.arrayOffset();
                } else {
                    throw new IllegalStateException("Cannot send an encrypted frame with no ssl context.");
                }
            }
            this.f37668d.clear();
            this.f37668d.limit(i);
            this.f37668d.put((byte) (channelMessage2.f29509b & 255));
            this.f37668d.put((byte) i14);
            this.f37668d.putShort((short) i5);
            if (i9 != 0 && z2) {
                this.f37668d.putInt(i8);
            }
            ofo ofo = this.f37667c.f37675f;
            if (ofo != null) {
                ofo.mo22102a(channelMessage2.f29509b, i14, i5);
            }
            if (channelMessage2.f29515h) {
                this.f37668d.flip();
                byteBuffer.put(this.f37668d);
                i6 = byteBuffer.arrayOffset();
                bArr = byteBuffer.array();
            } else {
                if (this.f37669e.length < i4) {
                    this.f37669e = new byte[i4];
                }
                System.arraycopy(this.f37668d.array(), this.f37668d.arrayOffset(), this.f37669e, 0, i);
                System.arraycopy(byteBuffer.array(), i3, this.f37669e, i, i5);
                bArr = this.f37669e;
                i6 = 0;
            }
            this.f37666b.write(bArr, i6, i4);
            if (this.f37665a && z) {
                this.f37666b.flush();
            }
            ogo ogo = this.f37667c.f37679j;
            SystemClock.elapsedRealtime();
            ogs ogs = ogo.f37575a;
            bnsn bnsn2 = ogs.f37577a;
            ogs.f37592p.mo21319ay();
            ofo ofo2 = this.f37667c.f37675f;
            if (ofo2 != null) {
                ofo2.mo22106b(SystemClock.elapsedRealtime(), i4);
            }
            if (channelMessage2.f29515h) {
                if (byteBuffer != this.f37667c.f37674e.f37837i[0]) {
                    BufferPool.m117794a(byteBuffer);
                }
            }
            i7 += min;
            z4 = z3;
            if (this.f37667c.f37676g != null) {
                break;
            }
        }
        if (z4) {
            BufferPool.f151458a.mo71340b(channelMessage2.f29510c);
            int i15 = channelMessage2.f29516i;
            if (i15 != 0) {
                ogo ogo2 = this.f37667c.f37679j;
                int i16 = channelMessage2.f29509b;
                ogs ogs2 = ogo2.f37575a;
                bnsn bnsn3 = ogs.f37577a;
                ogs2.mo22126a(i16, i15);
            }
        }
    }

    public oho(ohp ohp, OutputStream outputStream) {
        this.f37667c = ohp;
        this.f37666b = outputStream;
        this.f37665a = false;
    }

    public oho(ohp ohp, OutputStream outputStream, int i) {
        this.f37667c = ohp;
        this.f37666b = new BufferedOutputStream(outputStream, i);
        this.f37665a = true;
    }
}
