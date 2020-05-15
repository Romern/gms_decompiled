package p000;

/* renamed from: bhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhz implements Comparable {

    /* renamed from: a */
    public String f3263a;

    /* renamed from: b */
    public String f3264b;

    /* renamed from: c */
    public String f3265c;

    /* renamed from: d */
    public int f3266d = 0;

    public bhz() {
    }

    /* renamed from: a */
    public static bhz m3068a(String str) {
        String[] split = str.split("-");
        bhz bhz = new bhz();
        int length = split.length;
        if (length == 3) {
            bhz.f3263a = split[0];
            bhz.f3264b = split[1];
            bhz.f3266d = Integer.parseInt(split[2]);
        } else if (length != 2) {
            return null;
        } else {
            bhz.f3265c = split[0];
            bhz.f3266d = Integer.parseInt(split[1]);
        }
        return bhz;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f3266d, ((bhz) obj).f3266d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bhz bhz = (bhz) obj;
        String str = this.f3263a;
        if (str != null) {
            if (!str.equals(bhz.f3263a)) {
                return false;
            }
        } else if (bhz.f3263a != null) {
            return false;
        }
        String str2 = this.f3264b;
        if (str2 != null) {
            if (!str2.equals(bhz.f3264b)) {
                return false;
            }
        } else if (bhz.f3264b != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f3263a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.f3265c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3264b;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f3266d;
    }

    public final String toString() {
        String str;
        String str2 = this.f3265c;
        if (str2 != null && !str2.isEmpty()) {
            str = this.f3265c;
        } else {
            String str3 = this.f3263a;
            String str4 = this.f3264b;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("-");
            sb.append(str4);
            str = sb.toString();
        }
        int i = this.f3266d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append(str);
        sb2.append("-");
        sb2.append(i);
        return sb2.toString();
    }

    public bhz(String str, String str2) {
        this.f3263a = str;
        this.f3264b = str2;
    }
}
