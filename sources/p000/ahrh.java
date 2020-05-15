package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ahrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahrh {

    /* renamed from: a */
    static final Charset f67869a = Charset.forName("UTF-8");

    /* renamed from: b */
    public final int f67870b;

    /* renamed from: c */
    public final String f67871c;

    /* renamed from: d */
    public final byte[] f67872d;

    /* renamed from: e */
    public final byte[] f67873e;

    public ahrh(int i, String str, byte[] bArr, byte[] bArr2) {
        this.f67870b = i;
        this.f67871c = str;
        this.f67872d = bArr;
        this.f67873e = bArr2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int):void
     arg types: [java.lang.String, byte]
     candidates:
      bnsi.a(java.lang.String, byte):void
      bnsi.a(java.lang.String, long):void
      bnsi.a(java.lang.String, java.lang.Object):void
      bnsi.a(java.lang.String, short):void
      bnsi.a(java.lang.String, java.lang.Object[]):void
      bnsi.a(java.lang.String, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, int):void
     arg types: [java.lang.String, byte, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, int):void */
    /* renamed from: a */
    public static ahrh m56417a(byte[] bArr) {
        if (bArr == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Cannot deserialize WifiAwareServiceInfo: null bytes");
            return null;
        }
        int length = bArr.length;
        if (length > 147) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize WifiAwareServiceInfo: expecting max %d raw bytes, got %d", 147, length);
            return null;
        } else if (length >= 16) {
            int i = (bArr[0] & 224) >> 5;
            if (i != 1) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize WifiAwareServiceInfo: unsupported Version %d", i);
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get() & 31;
            if (b == 1 || b == 2 || b == 3) {
                byte[] bArr2 = new byte[4];
                wrap.get(bArr2);
                String str = new String(bArr2, f67869a);
                byte[] bArr3 = new byte[3];
                wrap.get(bArr3);
                wrap.position(wrap.position() + 7);
                byte b2 = wrap.get() & 255;
                int i2 = 131 - (147 - length);
                if (i2 != b2) {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize WifiAwareServiceInfo: expected endpointInfo to be %d bytes, got %d bytes", (int) b2, i2);
                    return null;
                }
                byte[] bArr4 = new byte[i2];
                wrap.get(bArr4);
                return new ahrh(b, str, bArr3, bArr4);
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize WifiAwareServiceInfo: unsupported V1 PCP %d", (int) b);
            return null;
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize WifiAwareServiceInfo: expecting min %d raw bytes, got %d", 16, length);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String, java.lang.Integer, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static byte[] m56418a(String str, byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (length > 131) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("While serializing Advertisement, truncating Endpoint Info %s (%d bytes) down to %d bytesbytes", (Object) ahkm.m55981a(bArr2), (Object) Integer.valueOf(length), (Object) 131);
            bArr2 = Arrays.copyOf(bArr2, 131);
        }
        int length2 = bArr2.length;
        ByteBuffer allocate = ByteBuffer.allocate(147 - (131 - length2));
        allocate.put((byte) 35);
        if (str.length() != 4) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Cannot serialize WifiAwareServiceInfo: V1 Endpoint ID %s (%d bytes) should be exactly %d bytes", (Object) str, (Object) Integer.valueOf(str.length()), (Object) 4);
            return null;
        }
        allocate.put(str.getBytes(f67869a));
        int length3 = bArr.length;
        if (length3 != 3) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot serialize WifiAwareServiceInfo: V1 ServiceID hash (%d bytes) should be exactly %d bytes", length3, 3);
            return null;
        }
        allocate.put(bArr);
        allocate.position(allocate.position() + 7);
        allocate.put((byte) (length2 & 255));
        allocate.put(bArr2);
        return allocate.array();
    }
}
