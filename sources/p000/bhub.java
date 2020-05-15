package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: bhub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhub {

    /* renamed from: a */
    public final int f119605a;

    /* renamed from: b */
    public final int f119606b;

    /* renamed from: c */
    public final int f119607c;

    /* renamed from: d */
    public final float f119608d;

    /* renamed from: e */
    public final int f119609e;

    /* renamed from: f */
    public final long f119610f;

    /* renamed from: g */
    public final float f119611g;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public bhub(int i, int i2, int i3, float f, String str, long j, float f2) {
        char c;
        this.f119605a = i;
        this.f119606b = i2;
        this.f119607c = i3;
        this.f119608d = f;
        String lowerCase = str.toLowerCase(Locale.US);
        int i4 = 0;
        switch (lowerCase.hashCode()) {
            case -1364081155:
                if (lowerCase.equals("cellid")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 102570:
                if (lowerCase.equals("gps")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3049826:
                if (lowerCase.equals("cell")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3649301:
                if (lowerCase.equals("wifi")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i4 = 1;
        } else if (c == 1 || c == 2) {
            i4 = 2;
        } else if (c == 3) {
            i4 = 3;
        }
        this.f119609e = i4;
        this.f119610f = j;
        this.f119611g = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bhub)) {
            return false;
        }
        bhub bhub = (bhub) obj;
        return this.f119605a == bhub.f119605a && this.f119606b == bhub.f119606b && this.f119607c == bhub.f119607c && ((Float.isNaN(this.f119608d) && Float.isNaN(bhub.f119608d)) ? true : (this.f119608d > bhub.f119608d ? 1 : (this.f119608d == bhub.f119608d ? 0 : -1)) == 0) && this.f119609e == bhub.f119609e && this.f119610f == bhub.f119610f && this.f119611g == bhub.f119611g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f119605a), Integer.valueOf(this.f119606b), Long.valueOf(this.f119610f)});
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.f119605a;
        int i2 = this.f119606b;
        int i3 = this.f119607c;
        String str3 = "";
        if (i3 != 0) {
            StringBuilder sb = new StringBuilder(24);
            sb.append(", accuracyMm=");
            sb.append(i3);
            str = sb.toString();
        } else {
            str = str3;
        }
        if (!Float.isNaN(this.f119608d)) {
            float f = this.f119608d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(", altitudeMeters=");
            sb2.append(f);
            str2 = sb2.toString();
        } else {
            str2 = str3;
        }
        int i4 = this.f119609e;
        long j = this.f119610f;
        float f2 = this.f119611g;
        if (f2 != -1.0f) {
            StringBuilder sb3 = new StringBuilder(38);
            sb3.append(", speedMetersPerSecond=");
            sb3.append(f2);
            str3 = sb3.toString();
        }
        int length = String.valueOf(str).length();
        StringBuilder sb4 = new StringBuilder(length + 113 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb4.append("Position [latE7=");
        sb4.append(i);
        sb4.append(", lngE7=");
        sb4.append(i2);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(", source=");
        sb4.append(i4);
        sb4.append(", positionTimestampMillis=");
        sb4.append(j);
        sb4.append(str3);
        sb4.append("]");
        return sb4.toString();
    }
}
