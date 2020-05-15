package p000;

import android.text.TextUtils;

/* renamed from: bjvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvf {

    /* renamed from: a */
    public int f123377a;

    /* renamed from: b */
    public int f123378b;

    /* renamed from: c */
    public int f123379c;

    /* renamed from: d */
    public int f123380d;

    /* renamed from: e */
    public final int f123381e;

    /* renamed from: f */
    private final String f123382f;

    public bjvf(String str, int i, String str2) {
        if (i == 3) {
            this.f123381e = 2;
        } else if (i == 2) {
            this.f123381e = 3;
        } else {
            String valueOf = String.valueOf(Integer.toString(0));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append(valueOf);
            sb.append(" not a supported DateField.type");
            throw new IllegalArgumentException(sb.toString());
        }
        if (TextUtils.isEmpty(str2)) {
            this.f123382f = "/";
        } else {
            this.f123382f = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f123377a = -1;
            this.f123378b = -1;
            this.f123379c = -1;
            String[] split = str.split("/");
            int length = split.length;
            int i2 = this.f123381e;
            if (length == i2) {
                int i3 = 0;
                while (i3 < this.f123381e) {
                    String str3 = split[i3];
                    boolean z = true;
                    if (!str3.equals("d")) {
                        if (str3.equals("M")) {
                            z = this.f123378b < 0 ? false : z;
                            this.f123378b = i3;
                        } else if (str3.equals("yyyy")) {
                            this.f123380d = 4;
                            z = this.f123379c < 0 ? false : z;
                            this.f123379c = i3;
                        } else if (str3.equals("yy")) {
                            this.f123380d = 2;
                            z = this.f123379c < 0 ? false : z;
                            this.f123379c = i3;
                        } else {
                            throw new IllegalArgumentException(String.valueOf(str3).concat(" is not a supported date component. Supported date components: d, M, yy, yyyy"));
                        }
                    } else if (i == 2) {
                        z = this.f123377a < 0 ? false : z;
                        this.f123377a = i3;
                    } else {
                        throw new IllegalArgumentException("Days are only supported with DateField.YEAR_MONTH_DAY");
                    }
                    if (!z) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException("Only one of each date component is allowed");
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("Invalid number of date components. Expected ");
            sb2.append(i2);
            sb2.append(" based on the DateField.type, but found ");
            sb2.append(length);
            sb2.append(" in the format");
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("Must provide a DateField.format");
    }

    /* renamed from: a */
    public final String mo65561a(int i, int i2, int i3) {
        return mo65562a(Integer.toString(i), Integer.toString(i2), Integer.toString(i3));
    }

    /* renamed from: a */
    public final String mo65562a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder(10);
        int i = 0;
        int i2 = 0;
        while (i < this.f123381e) {
            if (i != this.f123377a) {
                str4 = i == this.f123378b ? str2 : str3;
            } else {
                str4 = str;
            }
            if (TextUtils.isEmpty(str4)) {
                i2++;
            } else {
                while (i2 > 0) {
                    sb.append(this.f123382f);
                    i2--;
                }
                sb.append(str4);
                if (i < this.f123381e - 1) {
                    sb.append(this.f123382f);
                }
            }
            i++;
        }
        return sb.toString();
    }
}
