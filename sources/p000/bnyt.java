package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: bnyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnyt extends bnyp {
    /* renamed from: a */
    public final bnzb mo68719a(long j) {
        return mo68722a(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
    }

    /* renamed from: a */
    public final bnzb mo68720a(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer order = ByteBuffer.allocate(length + length).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            order.putChar(charSequence.charAt(i));
        }
        return mo68722a(order.array());
    }

    /* renamed from: a */
    public final bnzb mo68721a(CharSequence charSequence, Charset charset) {
        return mo68722a(charSequence.toString().getBytes(charset));
    }

    /* renamed from: a */
    public final bnzd mo68732a() {
        return mo68724a(32);
    }

    /* renamed from: a */
    public final bnzd mo68724a(int i) {
        bmxy.m108588a(i >= 0);
        return new bnyr(this, i);
    }
}
