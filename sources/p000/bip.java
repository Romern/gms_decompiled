package p000;

/* renamed from: bip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bip extends bin {

    /* renamed from: a */
    public int f3325a = 0;

    /* renamed from: b */
    public boolean f3326b = true;

    /* renamed from: f */
    public int f3327f = 0;

    /* renamed from: g */
    public long f3328g = -1;

    /* renamed from: h */
    public String f3329h = null;

    /* renamed from: i */
    public final String f3330i = "2.1.0-1.0.12";

    /* renamed from: j */
    public String f3331j = "00";

    /* renamed from: k */
    public int f3332k = 0;

    /* renamed from: l */
    public String f3333l;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    public final String toString() {
        int i;
        String str;
        String str2 = "00";
        if (this.f3331j.compareToIgnoreCase(str2) != 0) {
            int parseInt = Integer.parseInt(this.f3331j);
            int[] iArr = {1, 2, 3, 4, 5};
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    i = 0;
                    break;
                }
                i = iArr[i2];
                if (i != 0) {
                    if (parseInt == i) {
                        break;
                    }
                    i2++;
                } else {
                    throw null;
                }
            }
            if (i == 1) {
                str = "ACTIVE";
            } else if (i == 2) {
                str = "SUSPEND";
            } else if (i == 3) {
                str = "DELETE";
            } else if (i == 4) {
                str = "BLOCKED";
            } else if (i != 5) {
                str2 = "null";
                if (i == 0) {
                    throw null;
                }
            } else {
                str = "TERMINATE";
            }
            str2 = str;
            if (i == 0) {
            }
        }
        String format = String.format("%04x", Integer.valueOf(this.f3325a & 255));
        boolean z = this.f3326b;
        String format2 = String.format("%04x", Integer.valueOf(this.f3327f));
        long j = this.f3328g;
        int i3 = this.f3332k;
        String str3 = this.f3329h;
        String str4 = this.f3330i;
        String str5 = this.f3333l;
        int length = String.valueOf(format).length();
        int length2 = String.valueOf(format2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = str4.length();
        StringBuilder sb = new StringBuilder(length + 193 + length2 + length3 + length4 + str2.length() + String.valueOf(str5).length());
        sb.append("TokenStatus{lupcCount=");
        sb.append(format);
        sb.append(", refreshRequired=");
        sb.append(z);
        sb.append(", maxATC=");
        sb.append(format2);
        sb.append(", lupcRefreshCheckBack=");
        sb.append(j);
        sb.append(", healthyLupcCount=");
        sb.append(i3);
        sb.append(", tokenDataVersion='");
        sb.append(str3);
        sb.append("', clientVersion='");
        sb.append(str4);
        sb.append("', tokenState='");
        sb.append(str2);
        sb.append("', apiLog='");
        sb.append(str5);
        sb.append("'}");
        return sb.toString();
    }
}
