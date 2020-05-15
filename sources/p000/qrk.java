package p000;

import java.util.Locale;

/* renamed from: qrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrk {
    /* renamed from: a */
    public static qrj m32721a(int i) {
        if (i == 1) {
            return new qrn();
        }
        if (i == 2) {
            return new qrm();
        }
        if (i == 4) {
            return new qri();
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Unable to create the processor with data type: %d.", Integer.valueOf(i)));
    }
}
