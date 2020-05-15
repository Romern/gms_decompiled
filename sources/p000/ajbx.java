package p000;

/* renamed from: ajbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajbx extends ajbu {
    public final String toString() {
        String a = mo38463a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 26);
        sb.append("EddystoneUidPrefix{bytes=");
        sb.append(a);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajbx(byte[] bArr) {
        super(bArr);
        int length = bArr.length;
        boolean z = true;
        if (!(length == 10 || length == 16)) {
            z = false;
        }
        sdo.m34975b(z, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
    }
}
