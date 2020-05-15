package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: akce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akce {

    /* renamed from: a */
    public final byte[] f71579a;

    /* renamed from: b */
    public final byte[] f71580b;

    /* renamed from: c */
    public final byte[] f71581c;

    /* renamed from: d */
    private final int f71582d;

    public akce(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 2 && bArr2.length == 14) {
            this.f71582d = i;
            this.f71579a = bArr3;
            this.f71580b = bArr;
            this.f71581c = bArr2;
            return;
        }
        throw new IllegalArgumentException("Advertisement's fields should be of required sizes.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public static akce m59343a(byte[] bArr) {
        int i;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = null;
        if (wrap.remaining() < 17) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akce", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse advertisement %s because it was too short.", akid.m59793b(bArr));
            return null;
        }
        byte b = wrap.get();
        if (((b >> 5) & 7) == 0) {
            int i2 = ((b >> 4) & 1) ^ 1;
            byte[] bArr3 = new byte[2];
            wrap.get(bArr3);
            byte[] bArr4 = new byte[14];
            wrap.get(bArr4);
            if (wrap.hasRemaining()) {
                i = wrap.get() & 255;
            } else {
                i = 0;
            }
            if (wrap.remaining() >= i && (i != 0 || i2 == 0)) {
                if (i > 0) {
                    byte[] bArr5 = new byte[i];
                    wrap.get(bArr5);
                    if (Arrays.equals(bArr5, new String(bArr5).getBytes())) {
                        bArr2 = bArr5;
                    } else {
                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl2.mo68432a("akce", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Failed to parse advertisement %s because the device name was corrupted", akid.m59793b(bArr));
                        return null;
                    }
                }
                return new akce(0, bArr3, bArr4, bArr2);
            }
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akce", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68422a("Failed to parse advertisement %s because the device name did not match the expected length %d", (Object) akid.m59793b(bArr), i);
            return null;
        }
        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl4.mo68432a("akce", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("Failed to parse advertisement %s because we failed to parse the version number", akid.m59793b(bArr));
        return null;
    }

    /* renamed from: a */
    public final boolean mo39182a() {
        return this.f71579a != null;
    }

    /* renamed from: a */
    public static akce m59344a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new akce(0, bArr, bArr2, bArr3);
    }

    /* renamed from: a */
    public static byte[] m59345a(akce akce) {
        int i;
        byte[] bArr = akce.f71579a;
        int i2 = 0;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (i > 0) {
            i2 = 1;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2 + 17 + i);
        allocate.put((byte) (((true ^ akce.mo39182a() ? 1 : 0) << true) | ((byte) ((akce.f71582d & 7) << 5))));
        allocate.put(akce.f71580b);
        allocate.put(akce.f71581c);
        if (bArr != null && i > 0) {
            allocate.put((byte) (i & 255));
            allocate.put(bArr);
        }
        return allocate.array();
    }
}
