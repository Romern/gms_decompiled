package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ackq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ackq {
    /* renamed from: a */
    public static Status m49337a(String str, int i, String str2) {
        achw achw = achs.f59871a;
        achs.f59875e.mo25418e("%s: %d", str, Integer.valueOf(i));
        return new Status(i, str2);
    }

    /* renamed from: a */
    public static Status m49338a(String str, azzp azzp) {
        int i;
        int i2 = azzp.f100336a;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1) {
                i = 10;
            } else if (i3 != 2) {
                i = i3 != 3 ? 13 : 31500;
            } else {
                i = 8;
            }
            return m49337a(str, i, azzp.getMessage());
        }
        throw null;
    }

    /* renamed from: a */
    public static Status m49339a(String str, String str2) {
        return m49337a(str, 13, str2);
    }
}
