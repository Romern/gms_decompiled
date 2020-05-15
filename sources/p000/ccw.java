package p000;

import java.io.IOException;

/* renamed from: ccw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccw extends IOException {
    private static final long serialVersionUID = 1;

    public ccw(String str, int i) {
        this(str, i, null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ccw(String str, int i, Throwable th) {
        super(r1.toString(), th);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(", status code: ");
        sb.append(i);
    }
}
