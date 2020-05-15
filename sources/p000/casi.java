package p000;

/* renamed from: casi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casi {

    /* renamed from: a */
    public final byte[] f175764a;

    /* renamed from: b */
    private final casj f175765b;

    private casi(byte[] bArr, casj casj) {
        int length = bArr.length;
        if (length == 3) {
            this.f175764a = bArr;
            this.f175765b = casj;
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Invalid CVM Result length: ");
        sb.append(length);
        throw new capk(sb.toString());
    }

    /* renamed from: a */
    public static casi m127086a(byte[] bArr, casj casj) {
        if (bArr != null) {
            return new casi(bArr, casj);
        }
        throw new capk("Invalid CVM Results data");
    }

    /* renamed from: b */
    public final boolean mo74814b() {
        byte b;
        return (mo74817e() || mo74818f()) && ((b = this.f175764a[0] & 63) == 3 || b == 5);
    }

    /* renamed from: c */
    public final boolean mo74815c() {
        byte b;
        return mo74817e() && ((b = this.f175764a[0] & 63) == 1 || b == 4);
    }

    /* renamed from: d */
    public final boolean mo74816d() {
        return mo74814b() || mo74815c();
    }

    /* renamed from: e */
    public final boolean mo74817e() {
        return this.f175764a[2] == 2;
    }

    /* renamed from: f */
    public final boolean mo74818f() {
        return this.f175764a[2] == 0;
    }

    /* renamed from: a */
    public final boolean mo74813a() {
        return this.f175765b.mo74820b() ? mo74817e() && (this.f175764a[0] & 31) == 31 : (mo74817e() || mo74818f()) && (this.f175764a[0] & 63) == 31;
    }
}
