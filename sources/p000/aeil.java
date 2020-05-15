package p000;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: aeil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeil {
    /* renamed from: a */
    public static int m51881a(int i) {
        if ((i >= 0 && i <= 1) || (i >= 1000 && i < 1006)) {
            return i;
        }
        return 1;
    }

    /* renamed from: b */
    public static Status m51882b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
