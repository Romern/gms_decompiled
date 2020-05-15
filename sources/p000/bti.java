package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bti extends cam {

    /* renamed from: a */
    private static final Set f5573a = new HashSet(Arrays.asList((byte) 0, (byte) 0, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE));

    /* renamed from: b */
    private final cat f5574b;

    public bti(cat cat) {
        this.f5574b = cat;
    }

    /* renamed from: a */
    public final cao mo3484a(Byte b) {
        if (b.equals((byte) -92)) {
            return new btp(this.f5574b);
        }
        if (b.equals((byte) -78)) {
            return new bto(this.f5574b);
        }
        if (b.equals((byte) -88)) {
            return new btj(this.f5574b);
        }
        if (b.equals((byte) -82)) {
            return new btk(this.f5574b);
        }
        if (b.equals((byte) -54)) {
            return new btl(this.f5574b);
        }
        throw new bon("Sw Ins Not Supported", bop.f5268h);
    }

    /* renamed from: a */
    public final cao mo3485a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length - 1;
            byte b = bArr[1];
            if (b == -92) {
                int i = btp.f5577a;
                btp.m3601a(bArr[length]);
            } else if (b == -78) {
                new bto(this.f5574b);
                bto.m3599a(bArr[length]);
            } else if (b == -88) {
                new btj(this.f5574b);
                btj.m3586a(bArr[length]);
            } else if (b == -54) {
                new btl(this.f5574b);
                btl.m3594a(bArr[length]);
            } else if (b == -82) {
                int i2 = btk.f5575a;
                btk.m3590a(bArr[length]);
            }
        }
        bok bok = new bok(bArr);
        Byte valueOf = Byte.valueOf(bok.mo3326b());
        byte c = bok.mo3327c();
        if (!f5573a.contains(valueOf)) {
            throw new bon("Cla Not Supported", bop.f5262b);
        } else if (valueOf.byteValue() == 0 && c == -92) {
            return new btp(this.f5574b);
        } else {
            if (valueOf.byteValue() == 0 && c == -78) {
                return new bto(this.f5574b);
            }
            if (valueOf.byteValue() == Byte.MIN_VALUE && c == -88) {
                return new btj(this.f5574b);
            }
            if (valueOf.byteValue() == Byte.MIN_VALUE && c == -82) {
                return new btk(this.f5574b);
            }
            if (valueOf.byteValue() == Byte.MIN_VALUE && c == -54) {
                return new btl(this.f5574b);
            }
            throw new bon("Sw Ins Not Supported", bop.f5268h);
        }
    }
}
