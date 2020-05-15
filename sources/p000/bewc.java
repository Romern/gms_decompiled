package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: bewc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewc {

    /* renamed from: a */
    public static final long f112781a = (TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / 16);

    /* renamed from: b */
    public final bevd f112782b;

    /* renamed from: c */
    public final bewg f112783c;

    public bewc(ByteBuffer byteBuffer, bevd bevd) {
        this.f112782b = bevd;
        this.f112783c = new bewg(byteBuffer);
    }
}
