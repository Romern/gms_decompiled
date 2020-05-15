package p000;

import java.util.ArrayList;

/* renamed from: asta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asta {
    /* renamed from: a */
    public static assr m74730a(int i, ArrayList arrayList) {
        try {
            assr assr = new assr(i);
            assr.f89614a.addAll(arrayList);
            return assr;
        } catch (assv e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static asss m74735b(int i, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return m74733a(i, bArr);
    }

    /* renamed from: a */
    public static assr m74731a(int i, assu... assuArr) {
        ArrayList arrayList = new ArrayList();
        for (assu assu : assuArr) {
            if (assu != null) {
                arrayList.add(assu);
            }
        }
        return m74730a(i, arrayList);
    }

    /* renamed from: a */
    public static asss m74732a(int i, byte b) {
        try {
            return asss.m74706a(i, 1, new byte[]{b}, 0);
        } catch (assv e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static asss m74733a(int i, byte[] bArr) {
        try {
            return asss.m74706a(i, bArr.length, bArr, 0);
        } catch (assv e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m74734a(assu assu) {
        try {
            return assu.mo49449d();
        } catch (assv e) {
            throw new RuntimeException(e);
        }
    }
}
