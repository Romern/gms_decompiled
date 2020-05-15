package p000;

/* renamed from: cijv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cijv extends cijt {

    /* renamed from: c */
    public String f190469c;

    /* renamed from: d */
    public String f190470d;

    /* renamed from: e */
    public String f190471e;

    /* renamed from: f */
    public final String f190472f;

    /* renamed from: g */
    public boolean f190473g = false;

    public cijv(String str, int i, int i2, int i3, boolean z, String str2) {
        super(str, i, i2, i3, z);
        this.f190472f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cijv) || !super.equals(obj)) {
            return false;
        }
        cijv cijv = (cijv) obj;
        String str = this.f190469c;
        if (str == null ? cijv.f190469c != null : !str.equals(cijv.f190469c)) {
            return false;
        }
        String str2 = this.f190470d;
        if (str2 == null ? cijv.f190470d != null : !str2.equals(cijv.f190470d)) {
            return false;
        }
        String str3 = this.f190471e;
        if (str3 == null ? cijv.f190471e != null : !str3.equals(cijv.f190471e)) {
            return false;
        }
        String str4 = this.f190472f;
        if (str4 != null) {
            return str4.equals(cijv.f190472f);
        }
        return cijv.f190472f == null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = super.hashCode() * 31;
        String str = this.f190469c;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        String str2 = this.f190470d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f190471e;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.f190472f;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        String str = this.f190469c;
        String str2 = this.f190470d;
        String str3 = this.f190471e;
        String str4 = this.f190472f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("ReadDefaultCardDataResult{idm='");
        sb.append(str);
        sb.append("', icCode='");
        sb.append(str2);
        sb.append("', container='");
        sb.append(str3);
        sb.append("', identifiableBlockData='");
        sb.append(str4);
        sb.append("'}");
        return sb.toString();
    }
}
