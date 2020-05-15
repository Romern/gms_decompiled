package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.text.TextUtils;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.identifier.settings.u */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0303u {

    /* renamed from: a */
    private final Map f8046a;

    public C0303u(Context context) {
        HashMap hashMap;
        try {
            bqpu.m113219a();
            hashMap = new HashMap();
        } catch (GeneralSecurityException e) {
            C0288f.m5215a(context, "HybridConfig.register", e);
            hashMap = null;
        }
        this.f8046a = hashMap;
    }

    /* renamed from: b */
    public static final boolean m5230b(String str) {
        return "doubleclick.net".equals(str) || Collections.unmodifiableMap(cbvp.m128517d().f141033a).containsKey(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e9, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3 A[Catch:{ bxwf -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4 A[Catch:{ bxwf -> 0x00d2 }] */
    /* renamed from: a */
    public final synchronized bqnk mo6526a(String str) {
        bqsd bqsd;
        int b;
        bqsd bqsd2;
        bqsd bqsd3;
        int b2;
        bqsd bqsd4;
        int b3;
        bqnk bqnk = null;
        if (m5230b(str)) {
            String str2 = (String) Collections.unmodifiableMap(cbvp.m128517d().f141033a).get(str);
            Map map = this.f8046a;
            bqnk bqnk2 = map != null ? (bqnk) map.get(str2) : null;
            if (bqnk2 == null) {
                if (!TextUtils.isEmpty(str2) && str2.length() % 2 == 0) {
                    try {
                        bqsj a = new C0290h(srv.m36161a(str2), bqqa.f141351a).mo6519a();
                        for (bqsi bqsi : a.f141534b) {
                            bqsd bqsd5 = bqsi.f141527a;
                            if (bqsd5 == null) {
                                bqsd5 = bqsd.f141509d;
                            }
                            int b4 = bqsc.m113309b(bqsd5.f141513c);
                            if (b4 == 0) {
                                bqsd3 = bqsi.f141527a;
                                if (bqsd3 == null) {
                                    bqsd3 = bqsd.f141509d;
                                }
                                b2 = bqsc.m113309b(bqsd3.f141513c);
                                if (b2 == 0) {
                                    if (b2 == 3) {
                                    }
                                }
                                bqsd4 = bqsi.f141527a;
                                if (bqsd4 != null) {
                                    bqsd4 = bqsd.f141509d;
                                }
                                b3 = bqsc.m113309b(bqsd4.f141513c);
                                if (b3 == 0 && b3 == 4) {
                                    Object[] objArr = new Object[2];
                                    bqsd = bqsi.f141527a;
                                    if (bqsd != null) {
                                        bqsd = bqsd.f141509d;
                                    }
                                    b = bqsc.m113309b(bqsd.f141513c);
                                    if (b != 0) {
                                        b = 1;
                                    }
                                    objArr[0] = Integer.toString(bqsc.m113308a(b));
                                    bqsd2 = bqsi.f141527a;
                                    if (bqsd2 != null) {
                                        bqsd2 = bqsd.f141509d;
                                    }
                                    objArr[1] = bqsd2.f141511a;
                                    throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", objArr));
                                }
                            } else {
                                if (b4 == 2) {
                                }
                                bqsd3 = bqsi.f141527a;
                                if (bqsd3 == null) {
                                }
                                b2 = bqsc.m113309b(bqsd3.f141513c);
                                if (b2 == 0) {
                                }
                                bqsd4 = bqsi.f141527a;
                                if (bqsd4 != null) {
                                }
                                b3 = bqsc.m113309b(bqsd4.f141513c);
                                if (b3 == 0) {
                                }
                            }
                            Object[] objArr2 = new Object[2];
                            bqsd = bqsi.f141527a;
                            if (bqsd != null) {
                            }
                            b = bqsc.m113309b(bqsd.f141513c);
                            if (b != 0) {
                            }
                            objArr2[0] = Integer.toString(bqsc.m113308a(b));
                            bqsd2 = bqsi.f141527a;
                            if (bqsd2 != null) {
                            }
                            objArr2[1] = bqsd2.f141511a;
                            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", objArr2));
                        }
                        bqnk = (bqnk) bqns.m113055a(a).mo69305a(bqnk.class);
                    } catch (bxwf e) {
                        throw new GeneralSecurityException("invalid keyset");
                    }
                }
                if (bqnk == null) {
                    bqnk2 = bqnk;
                } else {
                    this.f8046a.put(str2, bqnk);
                }
            }
        }
    }
}
