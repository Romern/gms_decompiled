package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Set;

/* renamed from: aste */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aste {

    /* renamed from: a */
    public final byte f89647a;

    /* renamed from: b */
    public final byte f89648b;

    /* renamed from: c */
    public final byte f89649c;

    /* renamed from: d */
    public final byte f89650d;

    /* renamed from: e */
    private final int f89651e;

    /* renamed from: f */
    private final int f89652f;

    /* renamed from: g */
    private final byte[] f89653g;

    /* renamed from: h */
    private final Set f89654h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    public aste(int i, int i2, int i3, int i4, byte[] bArr, int i5, astg... astgArr) {
        boolean z;
        boolean z2 = false;
        if (astgArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        this.f89647a = (byte) (i & 255);
        this.f89648b = (byte) (i2 & 255);
        this.f89649c = (byte) (i3 & 255);
        this.f89650d = (byte) (i4 & 255);
        byte[] bArr2 = bArr != null ? (byte[]) bArr.clone() : new byte[0];
        this.f89653g = bArr2;
        int length = bArr2.length;
        this.f89651e = length;
        this.f89652f = i5;
        bmxy.m108591a((length >> 16) == 0 ? true : z2, "Lc must be between 0 and 65,535: %s", length);
        bmxy.m108591a(true, "Le must be between 0 and 65,535: %s", i5);
        bnic a = bnic.m109496a((Object[]) astgArr);
        this.f89654h = a;
        bmxy.m108588a(astg.m74759a(a));
    }

    /* renamed from: a */
    public static aste m74751a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap((byte[]) bmxy.m108581a(bArr));
        astd astd = new astd(wrap.get(), wrap.get(), wrap.get(), wrap.get());
        if (wrap.hasRemaining()) {
            int a = bqcw.m112606a(wrap.get());
            if (wrap.hasRemaining()) {
                byte[] bArr2 = new byte[a];
                wrap.get(bArr2);
                astd.f89646f = bArr2;
                if (wrap.hasRemaining()) {
                    astd.f89645e = bqcw.m112606a(wrap.get());
                }
            } else {
                astd.f89645e = a;
            }
        }
        if (wrap.hasRemaining()) {
            String valueOf = String.valueOf(asti.m74760a(bArr));
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid APDU: ") : "Invalid APDU: ".concat(valueOf));
        }
        return new aste(astd.f89641a, astd.f89642b, astd.f89643c, astd.f89644d, astd.f89646f, astd.f89645e, astg.f89658a);
    }

    /* renamed from: b */
    public final byte[] mo49457b() {
        return (byte[]) this.f89653g.clone();
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            aste aste = (aste) obj;
            if (this.f89647a == aste.f89647a && this.f89648b == aste.f89648b && this.f89649c == aste.f89649c && this.f89650d == aste.f89650d && Arrays.equals(this.f89653g, aste.f89653g) && this.f89652f == aste.f89652f && this.f89654h.equals(aste.f89654h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.f89647a), Byte.valueOf(this.f89648b), Byte.valueOf(this.f89649c), Byte.valueOf(this.f89650d), Integer.valueOf(Arrays.hashCode(this.f89653g)), Integer.valueOf(this.f89652f), this.f89654h});
    }

    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.printf("Command : CLA=%02x, INS=%02x, P1=%02x, P2=%02x", Byte.valueOf(this.f89647a), Byte.valueOf(this.f89648b), Byte.valueOf(this.f89649c), Byte.valueOf(this.f89650d));
        int i = this.f89651e;
        if (i > 0) {
            printWriter.printf(", Lc=%04x [%s]", Integer.valueOf(i), asti.m74760a(this.f89653g));
        }
        int i2 = this.f89652f;
        if (i2 >= 0) {
            printWriter.printf(", Le=%04x", Integer.valueOf(i2));
        }
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final int mo49456a() {
        bmxy.m108600b(this.f89652f != -1);
        return this.f89652f;
    }
}
