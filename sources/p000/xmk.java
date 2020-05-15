package p000;

import java.util.Arrays;

/* renamed from: xmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xmk {

    /* renamed from: c */
    protected byte[] f52749c;

    /* renamed from: d */
    protected int f52750d;

    protected xmk() {
        this.f52749c = new byte[0];
    }

    /* renamed from: a */
    public abstract byte[] mo29940a();

    public boolean equals(Object obj) {
        if (obj instanceof xmk) {
            xmk xmk = (xmk) obj;
            if (!Arrays.equals(this.f52749c, xmk.f52749c) || this.f52750d != xmk.f52750d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52749c)), Integer.valueOf(this.f52750d)});
    }

    protected xmk(byte[] bArr) {
        if (bArr == null) {
            this.f52749c = new byte[0];
        } else {
            this.f52749c = bArr;
        }
    }
}
