package p000;

import java.util.List;

/* renamed from: cwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwz {
    /* renamed from: a */
    public static cwn m7800a(byte[] bArr) {
        return bArr == null ? new cwn(2) : new cwn(bArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwn.a(cwl, boolean):void
     arg types: [cxa, int]
     candidates:
      cwn.a(int, byte):void
      cwn.a(int, int):void
      cwn.a(cwl, boolean):void */
    /* renamed from: b */
    public static void m7803b(cwf cwf) {
        cwn a = m7800a(cwf.f12232c);
        a.mo8366a((cwl) cxa.LAST_CONTACTLESS_TRANSACTION_COMPLETED, true);
        cwf.f12232c = a.mo8368a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwn.a(cwl, boolean):void
     arg types: [cxa, int]
     candidates:
      cwn.a(int, byte):void
      cwn.a(int, int):void
      cwn.a(cwl, boolean):void */
    /* renamed from: a */
    public static void m7801a(cwf cwf) {
        cwn a = m7800a(cwf.f12232c);
        a.mo8366a((cwl) cxa.LAST_CONTACTLESS_TRANSACTION_COMPLETED, false);
        cwf.f12232c = a.mo8368a();
    }

    /* renamed from: a */
    public static void m7802a(cwf cwf, byte[] bArr) {
        List<cwh> list = new cwi(bArr).f12239a;
        int i = 0;
        if (list != null) {
            for (cwh cwh : list) {
                i += (cwh.f12238c - cwh.f12237b) + 1;
            }
        }
        cwf.f12233d = Integer.valueOf(i);
    }
}
