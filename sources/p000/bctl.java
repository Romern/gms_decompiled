package p000;

import java.security.InvalidParameterException;

/* renamed from: bctl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctl {
    /* renamed from: a */
    public static int m89930a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new InvalidParameterException("Invalid message type.");
    }
}
