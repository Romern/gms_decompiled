package p000;

/* renamed from: bwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bwy extends byv {
    public bwy(bze bze, byte[] bArr, bzc bzc) {
        super(bze, bArr, bzc);
        cbb.m3881a((bArr.length & 15) == 0, "DES keys with length %d are expected", 16);
    }
}
