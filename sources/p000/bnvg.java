package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bnvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvg {

    /* renamed from: a */
    public final InputStream f132219a;

    public bnvg(InputStream inputStream) {
        this.f132219a = inputStream;
    }

    /* renamed from: a */
    public final byte mo68512a() {
        return bnvf.m110486a(this.f132219a);
    }

    /* renamed from: b */
    public final int mo68513b() {
        return (mo68512a() & 255) | ((mo68512a() & 255) << 8) | ((mo68512a() & 255) << 16) | ((mo68512a() & 255) << 24);
    }

    /* renamed from: d */
    public final int mo68515d() {
        return (int) mo68516e();
    }

    /* renamed from: e */
    public final long mo68516e() {
        InputStream inputStream = this.f132219a;
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = bnvf.m110486a(inputStream);
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw new IOException("Malformed varint.");
    }

    /* renamed from: c */
    public final double mo68514c() {
        return Double.longBitsToDouble((((long) mo68512a()) & 255) | ((((long) mo68512a()) & 255) << 8) | ((((long) mo68512a()) & 255) << 16) | ((((long) mo68512a()) & 255) << 24) | ((((long) mo68512a()) & 255) << 32) | ((((long) mo68512a()) & 255) << 40) | ((((long) mo68512a()) & 255) << 48) | ((255 & ((long) mo68512a())) << 56));
    }
}
