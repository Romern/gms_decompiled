package p000;

/* renamed from: bdgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdgg {

    /* renamed from: a */
    public final String f105583a;

    public bdgg(String str) {
        this.f105583a = str;
    }

    /* renamed from: a */
    public static bdgg m90733a(bdgg bdgg, bdgg bdgg2) {
        String valueOf = String.valueOf(bdgg.f105583a);
        String valueOf2 = String.valueOf(bdgg2.f105583a);
        return new bdgg(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: a */
    public static String m90735a(bdgg bdgg) {
        if (bdgg != null) {
            return bdgg.f105583a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdgg) {
            return this.f105583a.equals(((bdgg) obj).f105583a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f105583a.hashCode();
    }

    public final String toString() {
        return this.f105583a;
    }

    /* renamed from: a */
    public static bdgg m90734a(String str) {
        bmxy.m108581a(str);
        return new bdgg(str);
    }
}
