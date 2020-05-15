package p000;

/* renamed from: aach */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aach {

    /* renamed from: a */
    public static final bljj f27932a;

    /* renamed from: b */
    private static final bmzi f27933b;

    /* renamed from: c */
    private static volatile bmzi f27934c;

    static {
        bljj a = new bljl().mo66594a();
        f27932a = a;
        bmzi a2 = bmzn.m108683a(a);
        f27933b = a2;
        f27934c = a2;
    }

    /* renamed from: a */
    public static bljf m21083a(zzq zzq) {
        return m21084a(zzq, false);
    }

    /* renamed from: b */
    public static zzq m21087b() {
        aabk c = m21088c();
        if (c == null) {
            return null;
        }
        bmxv bmxv = c.f27886b;
        if (!bmxv.mo66813a() || (((cimz) bmxv.mo66814b()).f190880a & 32) == 0) {
            return null;
        }
        zzq zzq = ((cimz) bmxv.mo66814b()).f190881b;
        return zzq == null ? zzq.f56322f : zzq;
    }

    /* renamed from: c */
    public static aabk m21088c() {
        bljc a = blkh.m107284a(blkn.f126753a);
        if (a.mo66589b()) {
            return (aabk) a.mo66588a();
        }
        return null;
    }

    /* renamed from: a */
    public static bljf m21084a(zzq zzq, boolean z) {
        bxvf bxvf = (bxvf) cimz.f190878c.mo74144da();
        if (zzq != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cimz cimz = (cimz) bxvf.f164949b;
            zzq.getClass();
            cimz.f190881b = zzq;
            cimz.f190880a |= 32;
        }
        aabk aabk = new aabk(z, (cimz) bxvf.mo74062i());
        blje blje = new blje(blje.f126668a, new C1245ok());
        bljd bljd = blkn.f126753a;
        bmxy.m108601b(!blje.f126671c, "Can't mutate after handing to trace");
        bmxy.m108581a(aabk);
        bmxy.m108601b(!blje.mo66591a(bljd), "Key already present");
        blje.f126670b.put(bljd, aabk);
        return blje.mo66590a();
    }

    /* renamed from: a */
    public static bljj m21085a() {
        return (bljj) ((bmzm) f27934c).f131273a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    static synchronized void m21086a(bmzi bmzi) {
        synchronized (aach.class) {
            sdo.m34971a(f27934c == f27933b, (Object) "Duplicate init");
            f27934c = bmzi;
        }
    }
}
