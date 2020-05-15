package p000;

import java.io.ByteArrayOutputStream;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: xmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmj {

    /* renamed from: a */
    public final List f52744a;

    /* renamed from: b */
    public final int f52745b;

    /* renamed from: c */
    public final int f52746c;

    /* renamed from: d */
    public int f52747d;

    /* renamed from: e */
    public byte f52748e;

    public xmj(int i, xmf xmf, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i2;
        bmxy.m108581a(bArr);
        bmxy.m108581a(xmf);
        int length = bArr.length;
        if (length <= 7609) {
            this.f52744a = new ArrayList();
            this.f52746c = i;
            this.f52745b = length;
            int i3 = 57;
            if (length > 57) {
                bArr2 = Arrays.copyOf(bArr, 57);
            } else {
                bArr2 = bArr;
            }
            int i4 = length - 57;
            this.f52744a.add(new xmi(this.f52746c, xmf, bArr2, length));
            this.f52748e = 0;
            while (i4 > 0) {
                if (i4 > 59) {
                    i2 = i3 + 59;
                    bArr3 = Arrays.copyOfRange(bArr, i3, i2);
                    i4 -= 59;
                } else {
                    int i5 = i4 + i3;
                    bArr3 = Arrays.copyOfRange(bArr, i3, i5);
                    i2 = i5;
                    i4 = 0;
                }
                int i6 = this.f52746c;
                byte b = this.f52748e;
                this.f52748e = (byte) (b + 1);
                this.f52744a.add(new xmg(i6, b, bArr3));
                i3 = i2;
            }
            return;
        }
        throw new InvalidParameterException("Data size cannot be larger than 7609");
    }

    /* renamed from: a */
    public final boolean mo29946a() {
        return this.f52745b - this.f52747d == 0;
    }

    /* renamed from: b */
    public final List mo29947b() {
        return bngx.m109368a((Collection) this.f52744a);
    }

    /* renamed from: c */
    public final byte[] mo29948c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        List b = mo29947b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            byteArrayOutputStream.write(((xmk) b.get(i)).f52749c);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xmj) {
            return this.f52744a.equals(((xmj) obj).f52744a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52744a.hashCode();
    }

    public xmj(byte[] bArr) {
        if (bArr.length == 64) {
            this.f52744a = new ArrayList();
            try {
                xmi xmi = new xmi(bArr);
                this.f52746c = xmi.f52750d;
                this.f52745b = xmi.f52743b;
                this.f52744a.add(xmi);
                this.f52747d = xmi.f52749c.length;
            } catch (xml e) {
                throw new InvalidParameterException("Data array is not a valid HidInputPacket");
            }
        } else {
            throw new InvalidParameterException("Data array is invalid");
        }
    }
}
