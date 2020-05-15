package p000;

import java.io.IOException;

/* renamed from: bkow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkow extends Exception {

    /* renamed from: a */
    public final int f125035a;

    /* renamed from: b */
    public final String f125036b;

    /* renamed from: c */
    private final Throwable f125037c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public bkow(IOException iOException, int i, String str) {
        super(r0, iOException);
        String str2;
        if (i == 0) {
            String valueOf = String.valueOf(iOException);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("HTTP connection error: ");
            sb.append(valueOf);
            str2 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder(62);
            sb2.append("HTTP connection error: server returned HTTP error: ");
            sb2.append(i);
            str2 = sb2.toString();
        }
        this.f125037c = iOException;
        this.f125035a = i;
        this.f125036b = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125037c);
        int i = this.f125035a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("HttpChannelException [cause=");
        sb.append(valueOf);
        sb.append(", statusCode=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
