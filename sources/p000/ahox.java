package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ahox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahox {

    /* renamed from: a */
    static final Charset f67677a = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final byte[] f67678g = new byte[6];

    /* renamed from: b */
    public final int f67679b;

    /* renamed from: c */
    public final String f67680c;

    /* renamed from: d */
    public final byte[] f67681d;

    /* renamed from: e */
    public final byte[] f67682e;

    /* renamed from: f */
    public final String f67683f;

    public ahox(int i, String str, byte[] bArr, byte[] bArr2, String str2) {
        this.f67679b = i;
        this.f67680c = str;
        this.f67681d = bArr;
        this.f67682e = bArr2;
        this.f67683f = str2;
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
    public static ahox m56302a(byte[] bArr) {
        String str;
        if (bArr == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Cannot deserialize NfcTag: null bytes");
            return null;
        }
        int length = bArr.length;
        if (length > 146) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize NfcTag: expecting max %d raw bytes, got %d", 146, length);
            return null;
        } else if (length >= 15) {
            int i = (bArr[0] & 224) >> 5;
            if (i != 1) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize NfcTag: unsupported Version %d", i);
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get() & 31;
            if (b == 1 || b == 2 || b == 3) {
                byte[] bArr2 = new byte[4];
                wrap.get(bArr2);
                String str2 = new String(bArr2, f67677a);
                byte[] bArr3 = new byte[3];
                wrap.get(bArr3);
                byte b2 = wrap.get() & 255;
                int i2 = 131 - (146 - length);
                if (i2 != b2) {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize NfcTag: expected endpointInfo to be %d bytes, got %d bytes", (int) b2, i2);
                    return null;
                }
                byte[] bArr4 = new byte[i2];
                wrap.get(bArr4);
                byte[] bArr5 = new byte[6];
                wrap.get(bArr5);
                if (!Arrays.equals(bArr5, f67678g)) {
                    str = srv.m36162b(bArr5);
                } else {
                    str = null;
                }
                return new ahox(b, str2, bArr3, bArr4, str);
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize NfcTag: unsupported V1 PCP %d", (int) b);
            return null;
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize NfcTag: expecting min %d raw bytes, got %d", 15, length);
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
    public static byte[] m56303a(int i, String str, byte[] bArr, byte[] bArr2, String str2) {
        int length = bArr2.length;
        if (length > 131) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("While serializing Advertisement, truncating Endpoint Info %s (%d bytes) down to %d bytesbytes", (Object) ahkm.m55981a(bArr2), (Object) Integer.valueOf(length), (Object) 131);
            bArr2 = Arrays.copyOf(bArr2, 131);
        }
        int length2 = bArr2.length;
        ByteBuffer allocate = ByteBuffer.allocate(146 - (131 - length2));
        allocate.put((byte) ((i & 31) | 32));
        byte[] bArr3 = null;
        if (i != 1 && i != 2 && i != 3) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot serialize NfcTag: unsupported V1 PCP %d", i);
            return null;
        } else if (str.length() != 4) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Cannot serialize NfcTag: V1 Endpoint ID %s (%d bytes) should be exactly %d bytes", (Object) str, (Object) Integer.valueOf(str.length()), (Object) 4);
            return null;
        } else {
            allocate.put(str.getBytes(f67677a));
            int length3 = bArr.length;
            if (length3 != 3) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot serialize NfcTag: V1 ServiceID hash (%d bytes) should be exactly %d bytes", length3, 3);
                return null;
            }
            allocate.put(bArr);
            allocate.put((byte) (length2 & 255));
            allocate.put(bArr2);
            if (str2 != null) {
                String replace = str2.replace(":", "");
                if (replace.length() == 12) {
                    try {
                        bArr3 = srv.m36161a(replace);
                    } catch (NumberFormatException e) {
                        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Cannot serialize Advertisement: Bluetooth MAC Address %s is not valid hex", str2);
                    }
                } else {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Cannot serialize Advertisement: Bluetooth MAC Address %s (%d characters) should be exactly %d characters", (Object) str2, (Object) Integer.valueOf(str2.length()), (Object) 12);
                }
            }
            if (bArr3 == null) {
                bArr3 = new byte[6];
            }
            allocate.put(bArr3);
            return allocate.array();
        }
    }
}
