package p000;

import java.util.Locale;

/* renamed from: xpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpt extends Exception {
    public xpt(int i) {
        super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i)));
    }
}
