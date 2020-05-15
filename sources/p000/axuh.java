package p000;

import android.os.ParcelFileDescriptor;

/* renamed from: axuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axuh {

    /* renamed from: a */
    public final byte[] f96386a;

    /* renamed from: b */
    public final String f96387b;

    /* renamed from: c */
    public final ParcelFileDescriptor f96388c;

    public axuh(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor) {
        this.f96386a = bArr;
        this.f96387b = str;
        this.f96388c = parcelFileDescriptor;
    }

    /* renamed from: a */
    public static axuh m83243a(String str) {
        return new axuh(null, str, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[");
        String str = this.f96387b;
        if (str == null) {
            sb.append("nodigest");
        } else {
            sb.append(str);
        }
        if (this.f96386a != null) {
            sb.append(", size=");
            sb.append(this.f96386a.length);
        }
        if (this.f96388c != null) {
            sb.append(", fd=");
            sb.append(this.f96388c);
        }
        sb.append("]");
        return sb.toString();
    }
}
