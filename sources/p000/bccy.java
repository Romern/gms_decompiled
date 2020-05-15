package p000;

import android.net.Uri;

/* renamed from: bccy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bccy extends bcdo {

    /* renamed from: a */
    private final Uri f103967a;

    /* renamed from: b */
    private final bngx f103968b;

    /* renamed from: c */
    private final String f103969c;

    /* renamed from: d */
    private final bngx f103970d;

    /* renamed from: e */
    private final String f103971e;

    /* renamed from: f */
    private final int f103972f;

    /* renamed from: g */
    private final int f103973g;

    /* renamed from: h */
    private final bmxz f103974h;

    public bccy(Uri uri, bngx bngx, String str, bngx bngx2, String str2, int i, int i2, bmxz bmxz) {
        this.f103967a = uri;
        this.f103968b = bngx;
        this.f103969c = str;
        this.f103970d = bngx2;
        this.f103971e = str2;
        this.f103972f = i;
        this.f103973g = i2;
        this.f103974h = bmxz;
    }

    /* renamed from: a */
    public final Uri mo56686a() {
        return this.f103967a;
    }

    /* renamed from: b */
    public final bngx mo56687b() {
        return this.f103968b;
    }

    /* renamed from: c */
    public final String mo56688c() {
        return this.f103969c;
    }

    /* renamed from: d */
    public final bngx mo56689d() {
        return this.f103970d;
    }

    /* renamed from: e */
    public final String mo56690e() {
        return this.f103971e;
    }

    public final boolean equals(Object obj) {
        bngx bngx;
        String str;
        bngx bngx2;
        String str2;
        bmxz bmxz;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcdo)) {
            return false;
        }
        bcdo bcdo = (bcdo) obj;
        return this.f103967a.equals(bcdo.mo56686a()) && ((bngx = this.f103968b) == null ? bcdo.mo56687b() == null : bnkn.m109669a(bngx, bcdo.mo56687b())) && ((str = this.f103969c) == null ? bcdo.mo56688c() == null : str.equals(bcdo.mo56688c())) && ((bngx2 = this.f103970d) == null ? bcdo.mo56689d() == null : bnkn.m109669a(bngx2, bcdo.mo56689d())) && ((str2 = this.f103971e) == null ? bcdo.mo56690e() == null : str2.equals(bcdo.mo56690e())) && this.f103972f == bcdo.mo56692f() && this.f103973g == bcdo.mo56693g() && ((bmxz = this.f103974h) == null ? bcdo.mo56694h() == null : bmxz.equals(bcdo.mo56694h()));
    }

    /* renamed from: f */
    public final int mo56692f() {
        return this.f103972f;
    }

    /* renamed from: g */
    public final int mo56693g() {
        return this.f103973g;
    }

    /* renamed from: h */
    public final bmxz mo56694h() {
        return this.f103974h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.f103967a.hashCode() ^ 1000003) * 1000003;
        bngx bngx = this.f103968b;
        int i5 = 0;
        if (bngx != null) {
            i = bngx.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode ^ i) * 1000003;
        String str = this.f103969c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 ^ i2) * 1000003;
        bngx bngx2 = this.f103970d;
        if (bngx2 != null) {
            i3 = bngx2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str2 = this.f103971e;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (((((i8 ^ i4) * 1000003) ^ this.f103972f) * 1000003) ^ this.f103973g) * 1000003;
        bmxz bmxz = this.f103974h;
        if (bmxz != null) {
            i5 = bmxz.hashCode();
        }
        return i9 ^ i5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103967a);
        String valueOf2 = String.valueOf(this.f103968b);
        String str = this.f103969c;
        String valueOf3 = String.valueOf(this.f103970d);
        String str2 = this.f103971e;
        int i = this.f103972f;
        int i2 = this.f103973g;
        String valueOf4 = String.valueOf(this.f103974h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + String.valueOf(str2).length() + String.valueOf(valueOf4).length());
        sb.append("QueryParams{tableUri=");
        sb.append(valueOf);
        sb.append(", projection=");
        sb.append(valueOf2);
        sb.append(", selection=");
        sb.append(str);
        sb.append(", selectionArgs=");
        sb.append(valueOf3);
        sb.append(", orderBy=");
        sb.append(str2);
        sb.append(", limit=");
        sb.append(i);
        sb.append(", offset=");
        sb.append(i2);
        sb.append(", filterPredicate=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
