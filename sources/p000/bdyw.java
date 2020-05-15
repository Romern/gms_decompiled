package p000;

import android.net.Uri;

/* renamed from: bdyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdyw {

    /* renamed from: a */
    public final String f106640a;

    /* renamed from: b */
    public final Uri f106641b;

    /* renamed from: c */
    public final String f106642c;

    /* renamed from: d */
    public final String f106643d;

    /* renamed from: e */
    public final boolean f106644e;

    /* renamed from: f */
    public final boolean f106645f;

    /* renamed from: g */
    final boolean f106646g;

    /* renamed from: h */
    final boolean f106647h;

    /* renamed from: i */
    public final bmxj f106648i;

    public bdyw(Uri uri) {
        this(null, uri, "", "", false, false, false, null);
    }

    /* renamed from: a */
    public final bdyw mo58443a() {
        if (!this.f106642c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        } else if (this.f106648i == null) {
            return new bdyw(this.f106640a, this.f106641b, this.f106642c, this.f106643d, true, this.f106645f, this.f106647h, null);
        } else {
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
    }

    /* renamed from: b */
    public final bdyw mo58450b() {
        return new bdyw(this.f106640a, this.f106641b, this.f106642c, this.f106643d, this.f106644e, true, this.f106647h, this.f106648i);
    }

    public bdyw(String str) {
        this(str, null, "", "", false, false, false, null);
    }

    /* renamed from: b */
    public final bdyw mo58451b(String str) {
        return new bdyw(this.f106640a, this.f106641b, this.f106642c, str, this.f106644e, this.f106645f, this.f106647h, this.f106648i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    /* renamed from: c */
    public final bdyx mo58452c(String str) {
        return bdyx.m91605a(this, str, 0.5d);
    }

    public bdyw(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, bmxj bmxj) {
        this.f106640a = str;
        this.f106641b = uri;
        this.f106642c = str2;
        this.f106643d = str3;
        this.f106644e = z;
        this.f106645f = z2;
        this.f106646g = false;
        this.f106647h = z3;
        this.f106648i = bmxj;
    }

    /* renamed from: a */
    public final bdyw mo58444a(bmxj bmxj) {
        if (!this.f106644e) {
            return new bdyw(this.f106640a, this.f106641b, this.f106642c, this.f106643d, false, this.f106645f, this.f106647h, bmxj);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    /* renamed from: a */
    public final bdyw mo58445a(String str) {
        if (!this.f106644e) {
            return new bdyw(this.f106640a, this.f106641b, str, this.f106643d, false, this.f106645f, this.f106647h, this.f106648i);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: a */
    public final bdyx mo58446a(String str, long j) {
        return bdyx.m91607a(this, str, j);
    }

    /* renamed from: a */
    public final bdyx mo58447a(String str, Object obj, bdyv bdyv) {
        return bdyx.m91608a(this, str, obj, bdyv);
    }

    /* renamed from: a */
    public final bdyx mo58448a(String str, String str2) {
        return bdyx.m91609a(this, str, str2);
    }

    /* renamed from: a */
    public final bdyx mo58449a(String str, boolean z) {
        return bdyx.m91610a(this, str, z);
    }
}
