package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bkpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpx {

    /* renamed from: a */
    public final String f125104a;

    /* renamed from: b */
    public final int f125105b;

    /* renamed from: c */
    public final String f125106c;

    /* renamed from: d */
    public final List f125107d;

    public bkpx(int i, String str, List list) {
        this(null, i, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bkpx)) {
            return false;
        }
        bkpx bkpx = (bkpx) obj;
        return bkwv.m106780a(this.f125104a, bkpx.f125104a, Integer.valueOf(this.f125105b), Integer.valueOf(bkpx.f125105b), this.f125106c, bkpx.f125106c, this.f125107d, bkpx.f125107d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125104a, Integer.valueOf(this.f125105b), this.f125106c, this.f125107d});
    }

    public final String toString() {
        String str = this.f125104a;
        int i = this.f125105b;
        String str2 = this.f125106c;
        String valueOf = String.valueOf(this.f125107d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 81 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("OtManagerState [modelId=");
        sb.append(str);
        sb.append(", revision=");
        sb.append(i);
        sb.append(", meSessionId=");
        sb.append(str2);
        sb.append(", pendingOperations=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public bkpx(String str, int i, String str2, List list) {
        this.f125104a = str;
        this.f125105b = i;
        try {
            long parseLong = Long.parseLong(str2, 16);
            if (parseLong < 0) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid negative session ID: ") : "Invalid negative session ID: ".concat(valueOf));
            }
            this.f125106c = Long.toHexString(parseLong);
            this.f125107d = list;
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid session ID: ") : "Invalid session ID: ".concat(valueOf2));
        }
    }
}
