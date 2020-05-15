package p000;

/* renamed from: ayps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ayps {

    /* renamed from: d */
    byte f98209d;

    /* renamed from: e */
    byte f98210e;

    /* renamed from: f */
    public byte[] f98211f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54207a(byte[] bArr) {
        int length = bArr.length;
        if (length == 6) {
            this.f98211f = bArr;
            return;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("Incorrect verification data length: ");
        sb.append(length);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }
}
