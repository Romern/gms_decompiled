package p000;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* renamed from: beab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beab implements bmzi {

    /* renamed from: a */
    private final String f106716a;

    /* renamed from: b */
    private final String f106717b;

    /* renamed from: c */
    private final Object f106718c;

    /* renamed from: d */
    private bdzp f106719d;

    /* renamed from: e */
    private final Object f106720e = new Object();

    /* renamed from: f */
    private volatile Object f106721f;

    public beab(String str, String str2, Object obj, bdzp bdzp) {
        bmxy.m108581a(obj);
        this.f106716a = str;
        this.f106717b = str2;
        this.f106718c = obj;
        this.f106719d = bdzp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, java.lang.Object):void
     arg types: [int, java.lang.String, java.lang.String]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, int):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final Object mo6606a() {
        Object obj;
        bmxv bmxv;
        bdym.f106632b = true;
        if (bdym.f106631a != null) {
            bdym bdym = bdym.f106631a;
            if (this.f106721f != null) {
                return this.f106721f;
            }
            synchronized (this.f106720e) {
                if (this.f106721f == null) {
                    bdym.f106633c = true;
                    bdzp bdzp = this.f106719d;
                    String str = this.f106716a;
                    String str2 = this.f106717b;
                    Context context = bdym.f106636d;
                    bmxv bmxv2 = bdzb.f106667b;
                    if (bmxv2 == null) {
                        synchronized (bdzb.class) {
                            if (bdzb.f106667b == null) {
                                bdzb.f106667b = bdyh.m91579a(context);
                            }
                            bmxv = bdzb.f106667b;
                        }
                        bmxv2 = bmxv;
                    }
                    if (bmxv2.mo66813a()) {
                        String a = ((bdyg) bmxv2.mo66814b()).mo58439a(bdyj.m91581a(str), null, null, str2);
                        if (a != null) {
                            try {
                                beac beac = ((bdzb) bdzp).f106668c;
                                obj = beac.m91655a(a);
                            } catch (IOException | IllegalArgumentException e) {
                                Log.e("ProcessStablePhenotypeFlag", str2.length() == 0 ? new String("Invalid Phenotype flag value for flag ") : "Invalid Phenotype flag value for flag ".concat(str2), e);
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                    } else {
                        Context context2 = bdym.f106636d;
                        if (bdzb.f106666a == 0) {
                            synchronized (bdzb.class) {
                                if (bdzb.f106666a == 0) {
                                    int i = rfj.f42871c;
                                    bdzb.f106666a = rfy.m33553j(context2);
                                }
                            }
                        }
                        int i2 = bdzb.f106666a;
                        if (i2 >= 13000000) {
                            bdzj bdzj = (bdzj) bdzj.f106687b.get(str);
                            if (bdzj == null) {
                                bdzj = new bdzj(bdym, str);
                                bdzj bdzj2 = (bdzj) bdzj.f106687b.putIfAbsent(str, bdzj);
                                if (bdzj2 == null) {
                                    bdzx.m91650a(bdym.f106636d, str, new bdzd(bdzj));
                                } else {
                                    bdzj = bdzj2;
                                }
                            }
                            boolean z = bdzj.f106692g;
                            bmxy.m108596a(true, "Package %s cannot be registered both with and without stickyAccountSupport", (Object) str);
                            String str3 = (String) bdzj.f106693h.mo58473a(str2);
                            if (str3 != null) {
                                try {
                                    beac beac2 = ((bdzb) bdzp).f106668c;
                                    obj = beac.m91655a(str3);
                                } catch (IOException | IllegalArgumentException e2) {
                                    Log.e("ProcessStablePhenotypeFlag", str2.length() == 0 ? new String("Invalid Phenotype flag value for flag ") : "Invalid Phenotype flag value for flag ".concat(str2), e2);
                                    obj = null;
                                }
                            } else {
                                obj = null;
                            }
                        } else if (i2 > 0) {
                            bdzo bdzo = (bdzo) bdzo.f106698a.get(str);
                            if (bdzo == null) {
                                bdzo = new bdzo(bdym, str);
                                bdzo bdzo2 = (bdzo) bdzo.f106698a.putIfAbsent(str, bdzo);
                                if (bdzo2 == null) {
                                    bdzx.m91650a(bdym.f106636d, str, new bdzl(bdzo));
                                } else {
                                    bdzo = bdzo2;
                                }
                            }
                            boolean z2 = bdzo.f106700c;
                            bmxy.m108596a(true, "Package %s cannot be registered both with and without stickyAccountSupport", (Object) str);
                            Object a2 = bdzo.f106701d.mo58473a(str2);
                            if (a2 != null) {
                                try {
                                    obj = (Boolean) a2;
                                } catch (IOException | ClassCastException e3) {
                                    Log.e("ProcessStablePhenotypeFlag", str2.length() == 0 ? new String("Invalid Phenotype flag value for flag ") : "Invalid Phenotype flag value for flag ".concat(str2), e3);
                                    obj = null;
                                }
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    this.f106719d = null;
                    if (obj == null) {
                        obj = this.f106718c;
                    }
                    this.f106721f = obj;
                    return this.f106721f;
                }
                Object obj2 = this.f106721f;
                return obj2;
            }
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
