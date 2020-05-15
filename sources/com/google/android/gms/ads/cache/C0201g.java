package com.google.android.gms.ads.cache;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.ads.cache.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0201g {

    /* renamed from: a */
    public final String f7853a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public C0201g(C0217p pVar) {
        this(r0, r1, (r3 == null ? C0213l.f7887d : r3).f7891c);
        String str = pVar.f7914b;
        C0213l lVar = pVar.f7915c;
        String str2 = (lVar == null ? C0213l.f7887d : lVar).f7890b;
        C0213l lVar2 = pVar.f7915c;
    }

    /* renamed from: a */
    public final byte[] mo6394a() {
        try {
            return this.f7853a.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new C0200f("unable to encode cache key as UTF-8 bytes", e);
        }
    }

    public final String toString() {
        return this.f7853a;
    }

    public C0201g(String str, String str2, String str3) {
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        sdo.m34959a((Object) str3);
        this.f7853a = str.length() + "P" + str + str2.length() + "N" + str2 + str3.length() + "I" + str3;
    }
}
