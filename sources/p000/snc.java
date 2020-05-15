package p000;

/* renamed from: snc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class snc {
    /* renamed from: a */
    static bliy m35689a() {
        return blkh.m107280a(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
    }

    /* renamed from: a */
    public static bliy m35690a(Object obj, bliy bliy) {
        if (bliy == obj) {
            return bliy;
        }
        if (obj instanceof sna) {
            sna sna = (sna) obj;
            m35692a(bliy);
            bljj a = aach.m21085a();
            String str = sna.f44790b;
            bljf a2 = aach.m21083a(sna.f44789a);
            bmxy.m108581a(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            return a.f126673a.mo66584a(str, bljf.m107237a(a.f126674b, a2), 1, a.f126675c);
        }
        bliy bliy2 = (bliy) obj;
        blkh.m107287a(bliy2, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        return bliy2;
    }

    /* renamed from: a */
    public static Object m35691a(String str) {
        zzq b = aach.m21087b();
        if (b != null) {
            return new sna(b, str);
        }
        return null;
    }

    /* renamed from: a */
    static void m35692a(bliy bliy) {
        if (bliy != null) {
            blkh.m107287a((bliy) null, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        }
    }

    /* renamed from: a */
    public static void m35693a(Throwable th) {
        try {
            blkd.m107278a(th);
        } catch (Throwable th2) {
        }
    }
}
