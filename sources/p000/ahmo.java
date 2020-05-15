package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ahmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahmo {

    /* renamed from: f */
    private static final Charset f67556f = Charset.forName("UTF-8");

    /* renamed from: a */
    public final int f67557a;

    /* renamed from: b */
    public final byte[] f67558b;

    /* renamed from: c */
    public final String f67559c;

    /* renamed from: d */
    public final byte[] f67560d;

    /* renamed from: e */
    public final String f67561e;

    private ahmo(int i, byte[] bArr, String str, byte[] bArr2, String str2) {
        this.f67557a = i;
        this.f67558b = bArr;
        this.f67559c = str;
        this.f67560d = bArr2;
        this.f67561e = str2;
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
    /* renamed from: a */
    public static ahmo m56179a(byte[] bArr, boolean z) {
        byte[] bArr2;
        int i;
        String str;
        if (bArr == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Cannot deserialize BleAdvertisement: null bytes passed in.");
            return null;
        }
        int i2 = !z ? 15 : 6;
        int length = bArr.length;
        if (length >= i2) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            int i3 = (b & 224) >> 5;
            if (i3 == 1) {
                byte b2 = b & 31;
                if (b2 == 2 || b2 == 1 || b2 == 3) {
                    if (!z) {
                        byte[] bArr3 = new byte[3];
                        wrap.get(bArr3);
                        bArr2 = bArr3;
                    } else {
                        bArr2 = null;
                    }
                    byte[] bArr4 = new byte[4];
                    wrap.get(bArr4);
                    String str2 = new String(bArr4, f67556f);
                    int i4 = wrap.get() & 255;
                    if (!z) {
                        i = length - 15;
                    } else {
                        i = length - 6;
                    }
                    if (i < i4) {
                        ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize BleAdvertisement: expected endpointInfo to be %d bytes, got %d bytes", i4, i);
                        return null;
                    }
                    byte[] bArr5 = new byte[i4];
                    wrap.get(bArr5);
                    if (!z) {
                        byte[] bArr6 = new byte[6];
                        wrap.get(bArr6);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 6) {
                                break;
                            } else if (bArr6[i5] != 0) {
                                str = srv.m36162b(bArr6);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        return new ahmo(b2, bArr2, str2, bArr5, str);
                    }
                    str = null;
                    return new ahmo(b2, bArr2, str2, bArr5, str);
                }
                ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize BleAdvertisement: unsupported V1 PCP %d", (int) b2);
                return null;
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize BleAdvertisement: unsupported Version %d", i3);
            return null;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize BleAdvertisement: expecting min %d raw bytes, got %d", i2, length);
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String, java.lang.Integer, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static byte[] m56180a(int i, byte[] bArr, String str, byte[] bArr2, String str2, boolean z) {
        byte[] bArr3 = null;
        if (i == 2 || i == 1 || i == 3) {
            int i2 = !z ? 131 : 17;
            int length = bArr2.length;
            if (length <= i2) {
                ByteBuffer allocate = ByteBuffer.allocate(!z ? length + 15 : length + 6);
                allocate.put((byte) ((i & 31) | 32));
                if (!z) {
                    allocate.put(bArr);
                }
                allocate.put(str.getBytes(f67556f));
                allocate.put((byte) length);
                allocate.put(bArr2);
                if (!z) {
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
                    } else {
                        bArr3 = new byte[6];
                    }
                    allocate.put(bArr3);
                }
                return allocate.array();
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot serialize BleAdvertisement: expected an endpointInfo of at most %d bytes but got %d", i2, length);
            return null;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot serialize BleAdvertisement: unsupported V1 PCP %d", i);
        return null;
    }
}
