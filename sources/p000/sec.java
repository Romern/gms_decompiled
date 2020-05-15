package p000;

import android.os.Parcel;

/* renamed from: sec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sec extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public sec(String str, Parcel parcel) {
        super(r2.toString());
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(dataPosition);
        sb.append(" size=");
        sb.append(dataSize);
    }
}
