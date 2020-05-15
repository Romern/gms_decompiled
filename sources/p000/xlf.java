package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: xlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlf {

    /* renamed from: a */
    public final short f52655a;

    /* renamed from: b */
    private final bxtx f52656b;

    private xlf(short s, bxtx bxtx) {
        this.f52655a = s;
        this.f52656b = bxtx;
    }

    /* renamed from: a */
    public static xlf m43136a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 2) {
            int i = length - 2;
            return new xlf(boav.m111014a(bArr, i).readShort(), bxtx.m123262a(bArr, 0, i));
        }
        throw new IOException("Invalid response length");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xlf) {
            xlf xlf = (xlf) obj;
            if (this.f52655a != xlf.f52655a || !bmxi.m108538a(this.f52656b, xlf.f52656b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Short.valueOf(this.f52655a), this.f52656b});
    }

    /* renamed from: a */
    public final byte[] mo29900a() {
        return this.f52656b.mo73780k();
    }
}
