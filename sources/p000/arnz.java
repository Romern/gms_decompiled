package p000;

/* renamed from: arnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arnz {

    /* renamed from: a */
    public final byte[] f87991a;

    public arnz() {
        byte[] bArr = new byte[3];
        this.f87991a = bArr;
        bArr[0] = 1;
    }

    /* renamed from: a */
    public final boolean mo48703a() {
        return this.f87991a[1] != 0;
    }

    public final String toString() {
        return String.format("SourceDeviceEndpointInfo[outOfBand=%s]", Boolean.valueOf(mo48703a()));
    }

    public arnz(byte[] bArr) {
        this.f87991a = bArr;
    }
}
