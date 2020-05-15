package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: zyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyn {

    /* renamed from: a */
    public static final Status f56200a = new Status(13, "Not found");

    /* renamed from: b */
    static final Status f56201b = new Status(8, "Too many concurrent requests");

    /* renamed from: c */
    public static final Status f56202c = new Status(13, "Unavailable");

    /* renamed from: d */
    public static final Status f56203d = new Status(23518, "Insufficient Disk Space");

    /* renamed from: e */
    public final Object f56204e = new Object();

    /* renamed from: f */
    public final Map f56205f = new HashMap();

    /* renamed from: g */
    public final zxv f56206g;

    /* renamed from: h */
    public final zxw f56207h;

    /* renamed from: i */
    public long f56208i = 0;

    /* renamed from: j */
    public zyw f56209j;

    /* renamed from: k */
    public zyw f56210k;

    /* renamed from: l */
    private final zyg f56211l;

    /* renamed from: m */
    private final Executor f56212m;

    /* renamed from: n */
    private final zyl f56213n;

    /* renamed from: o */
    private final zxn f56214o;

    public zyn(zxv zxv, zxw zxw, zyg zyg, Executor executor, zyl zyl, zyw zyw, zxn zxn) {
        sdo.m34966a(zxv, "disk");
        this.f56206g = zxv;
        sdo.m34966a(zxw, "downloader");
        this.f56207h = zxw;
        sdo.m34966a(zyg, "clearcutWrapper");
        this.f56211l = zyg;
        sdo.m34966a(executor, "executor");
        this.f56212m = executor;
        sdo.m34966a(zyl, "pendingResolverProvider");
        this.f56213n = zyl;
        this.f56210k = zyw;
        this.f56214o = zxn;
    }

    /* renamed from: a */
    private static final brtr m46698a(String str, zyu zyu) {
        brtr brtr = (brtr) brtt.f143337f.mo74144da();
        if (brtr.f164950c) {
            brtr.mo74035c();
            brtr.f164950c = false;
        }
        brtt brtt = (brtt) brtr.f164949b;
        brtt.f143340b = 1;
        int i = 1 | brtt.f143339a;
        brtt.f143339a = i;
        str.getClass();
        int i2 = i | 2;
        brtt.f143339a = i2;
        brtt.f143341c = str;
        int i3 = zyu.f56230d;
        brtt.f143339a = i2 | 4;
        brtt.f143343e = i3;
        return brtr;
    }

    /* renamed from: a */
    private final void m46699a(int i, FontMatchSpec fontMatchSpec, int i2, String str, zyu zyu) {
        m46701a(Integer.valueOf(i), fontMatchSpec, 4, Integer.valueOf(i2), str, zyu);
    }

    /* renamed from: a */
    private final void m46700a(FontMatchSpec fontMatchSpec, String str, bqgy bqgy, zyu zyu, File file) {
        zyh.m46683c("FontsServer", "fetch %s for %s SUCCESS, local cache hit %s", fontMatchSpec, str, file);
        bqgy.mo69138b(FontFetchResult.m23828a(zyk.m46689a(zyu.f56228b, zyu.f56229c), file));
        m46702a((Integer) null, fontMatchSpec, 0, 0, str, zyu);
        zxv zxv = this.f56206g;
        zxv.f56137e.execute(new zxr(zxv, fontMatchSpec));
    }

    /* renamed from: a */
    private final void m46701a(Integer num, FontMatchSpec fontMatchSpec, int i, Integer num2, String str, zyu zyu) {
        brtr a = m46698a(str, zyu);
        bxvd da = brtv.f143345g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brtv brtv = (brtv) da.f164949b;
        brtv.f143350d = i - 1;
        brtv.f143347a |= 4;
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brtv brtv2 = (brtv) da.f164949b;
            brtv2.f143347a |= 16;
            brtv2.f143352f = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brtv brtv3 = (brtv) da.f164949b;
            brtv3.f143347a |= 8;
            brtv3.f143351e = intValue2;
        }
        bxvd da2 = brtq.f143331d.mo74144da();
        brtw a2 = zyg.m46677a(fontMatchSpec);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        brtq brtq = (brtq) da2.f164949b;
        a2.getClass();
        brtq.f143334b = a2;
        brtq.f143333a |= 1;
        brtq brtq2 = (brtq) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brtv brtv4 = (brtv) da.f164949b;
        brtq2.getClass();
        brtv4.f143348b = brtq2;
        brtv4.f143347a |= 1;
        a.mo69938a(da);
        this.f56211l.mo31588a((brtt) a.mo74062i());
    }

    /* renamed from: a */
    private final void m46702a(Integer num, FontMatchSpec fontMatchSpec, long j, int i, String str, zyu zyu) {
        brtr a = m46698a(str, zyu);
        bxvd da = brtv.f143345g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brtv brtv = (brtv) da.f164949b;
        brtv.f143350d = 1;
        int i2 = brtv.f143347a | 4;
        brtv.f143347a = i2;
        int i3 = i2 | 2;
        brtv.f143347a = i3;
        brtv.f143349c = j;
        brtv.f143347a = i3 | 8;
        brtv.f143351e = i;
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brtv brtv2 = (brtv) da.f164949b;
            brtv2.f143347a |= 16;
            brtv2.f143352f = intValue;
        }
        bxvd da2 = brtq.f143331d.mo74144da();
        int i4 = zyu.f56228b.f56106c;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        brtq brtq = (brtq) da2.f164949b;
        brtq.f143333a |= 2;
        brtq.f143335c = i4;
        brtw a2 = zyg.m46677a(fontMatchSpec);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        brtq brtq2 = (brtq) da2.f164949b;
        a2.getClass();
        brtq2.f143334b = a2;
        brtq2.f143333a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brtv brtv3 = (brtv) da.f164949b;
        brtq brtq3 = (brtq) da2.mo74062i();
        brtq3.getClass();
        brtv3.f143348b = brtq3;
        brtv3.f143347a |= 1;
        a.mo69938a(da);
        this.f56211l.mo31588a((brtt) a.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zxv.a(zxi, zxh, boolean):java.io.File
     arg types: [zxi, zxh, int]
     candidates:
      zxv.a(java.io.File, zxi, zxh):java.io.File
      zxv.a(long, java.io.File, java.io.File):boolean
      zxv.a(zxi, zxh, boolean):java.io.File */
    /* renamed from: a */
    public final bqgg mo31600a(FontMatchSpec fontMatchSpec, String str) {
        zyw zyw;
        zyu zyu;
        sdo.m34966a(fontMatchSpec, "spec");
        sdo.m34966a((Object) str, (Object) "requestingPackage");
        bqgy c = bqgy.m112818c();
        if (this.f56210k != null && this.f56214o != null && fontMatchSpec.f32464b.startsWith("Google Sans") && fontMatchSpec.f32467e == 0.0f) {
            zyu zyu2 = zyu.f56227a;
            zyu a = this.f56210k.mo31611a(fontMatchSpec);
            if (a.mo31608a()) {
                zyh.m46683c("FontsServer", "fetch %s for %s resolved using bundled fonts", fontMatchSpec, str);
                zyu = a;
            } else {
                zyu = zyu2;
            }
            if (!zyu.mo31608a()) {
                zyh.m46683c("FontsServer", "Could not resolve %s from bundled assets", fontMatchSpec);
                c.mo69138b(FontFetchResult.m23827a(f56202c));
            } else {
                File a2 = this.f56206g.mo31570a(zyu.f56228b, zyu.f56229c, true);
                if (a2 == null) {
                    zxv zxv = this.f56206g;
                    zxf zxf = zyu.f56229c.f56097a;
                    if (zxf == null) {
                        zxf = zxf.f56084e;
                    }
                    if (!zxv.mo31574b(zxf.f56088c)) {
                        zyh.m46683c("FontsServer", "Insufficient space on disk to extract %s", fontMatchSpec);
                        c.mo69138b(FontFetchResult.m23827a(f56203d));
                    } else {
                        synchronized (this.f56204e) {
                            zyk zyk = (zyk) this.f56205f.get(fontMatchSpec);
                            if (zyk != null) {
                                if (zyk.mo31595a(c)) {
                                    zyh.m46683c("FontsServer", "fetch %s for %s deduplicated", fontMatchSpec, str);
                                    zyk.mo31593a();
                                }
                            }
                            zyh.m46683c("FontsServer", "fetch %s for %s will extract", fontMatchSpec, str);
                            zyk zyk2 = new zyk(this, fontMatchSpec, zyu, c, str, this.f56208i);
                            this.f56205f.put(fontMatchSpec, zyk2);
                            Executor executor = this.f56212m;
                            zxn zxn = this.f56214o;
                            zxv zxv2 = this.f56206g;
                            if (zyk2.f56189g != 0) {
                                executor.execute(new zyj(zyk2, zxn, zxv2));
                            }
                        }
                    }
                } else {
                    m46700a(fontMatchSpec, str, c, zyu, a2);
                }
            }
            return c;
        }
        synchronized (this.f56204e) {
            zyw = this.f56209j;
        }
        if (zyw == null) {
            this.f56213n.mo31598a().mo741a(new zym(this, fontMatchSpec, str, c), this.f56212m);
        } else {
            mo31603a(zyw, fontMatchSpec, str, c);
        }
        return c;
    }

    /* renamed from: a */
    public final void mo31601a(zyk zyk) {
        String str;
        int i;
        synchronized (this.f56204e) {
            Object remove = this.f56205f.remove(zyk.f56185c);
            Object[] objArr = new Object[5];
            objArr[0] = zyk.f56185c;
            if (remove != null) {
                str = " NOT";
            } else {
                str = "";
            }
            objArr[1] = str;
            objArr[2] = zyk.mo31597c();
            objArr[3] = Long.valueOf(zyk.mo31596b());
            objArr[4] = Integer.valueOf(this.f56205f.size());
            zyh.m46683c("FontsServer", "Forget %s; was%s in flight. Final status %s, latency %d. %d in flight", objArr);
        }
        FontMatchSpec fontMatchSpec = zyk.f56185c;
        Status c = zyk.mo31597c();
        long b = zyk.mo31596b();
        synchronized (zyk.f56184b) {
            i = zyk.f56188f;
        }
        String str2 = zyk.f56187e;
        zyu zyu = zyk.f56186d;
        if (c.mo17710c()) {
            m46702a(Integer.valueOf(c.f30115i), fontMatchSpec, b, i, str2, zyu);
        } else {
            m46699a(c.f30115i, fontMatchSpec, i, str2, zyu);
        }
    }

    /* renamed from: a */
    public final void mo31602a(zyw zyw) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (zyw != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        zyh.m46683c("FontsServer", "setResolver. Null? %s", objArr);
        synchronized (this.f56204e) {
            this.f56209j = zyw;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zxv.a(zxi, zxh, boolean):java.io.File
     arg types: [zxi, zxh, int]
     candidates:
      zxv.a(java.io.File, zxi, zxh):java.io.File
      zxv.a(long, java.io.File, java.io.File):boolean
      zxv.a(zxi, zxh, boolean):java.io.File */
    /* renamed from: a */
    public final void mo31603a(zyw zyw, FontMatchSpec fontMatchSpec, String str, bqgy bqgy) {
        zyu zyu = zyu.f56227a;
        if (zyw != null) {
            zyu a = zyw.mo31611a(fontMatchSpec);
            if (a.mo31608a()) {
                File a2 = this.f56206g.mo31570a(a.f56228b, a.f56229c, true);
                if (a2 != null) {
                    m46700a(fontMatchSpec, str, bqgy, a, a2);
                    return;
                }
                if (ceao.f182169a.mo6606a().mo78689c()) {
                    zxv zxv = this.f56206g;
                    zxf zxf = a.f56229c.f56097a;
                    if (zxf == null) {
                        zxf = zxf.f56084e;
                    }
                    if (!zxv.mo31574b(zxf.f56088c)) {
                        zyh.m46683c("FontsServer", "Insufficient space on disk to download %s", fontMatchSpec);
                        bqgy.mo69138b(FontFetchResult.m23827a(f56203d));
                        m46699a(f56203d.f30115i, fontMatchSpec, 0, str, a);
                        return;
                    }
                }
                synchronized (this.f56204e) {
                    zyk zyk = (zyk) this.f56205f.get(fontMatchSpec);
                    if (zyk != null) {
                        if (zyk.mo31595a(bqgy)) {
                            zyh.m46683c("FontsServer", "fetch %s for %s deduplicated", fontMatchSpec, str);
                            zyk.mo31593a();
                            return;
                        }
                    }
                    if (this.f56205f.size() <= 16) {
                        zyh.m46683c("FontsServer", "fetch %s for %s will download", fontMatchSpec, str);
                        zyk zyk2 = new zyk(this, fontMatchSpec, a, bqgy, str);
                        this.f56205f.put(fontMatchSpec, zyk2);
                        zyk2.mo31592a(this.f56206g, this.f56207h);
                        return;
                    }
                    zyh.m46683c("FontsServer", "fetch %s for %s rejected, TOO_BUSY", fontMatchSpec, str);
                    bqgy.mo69138b(FontFetchResult.m23827a(f56201b));
                    m46701a((Integer) null, fontMatchSpec, 5, (Integer) null, str, a);
                    return;
                }
            }
            zyh.m46683c("FontsServer", "fetch %s for %s resolved NOT_FOUND", fontMatchSpec, str);
            bqgy.mo69138b(FontFetchResult.m23827a(f56200a));
            m46701a((Integer) null, fontMatchSpec, 3, (Integer) null, str, a);
            return;
        }
        zyh.m46680a("FontsServer", "No resolver, short-circuit %s for %s to failure", fontMatchSpec, str);
        bqgy.mo69138b(FontFetchResult.m23827a(f56202c));
        m46699a(f56202c.f30115i, fontMatchSpec, 0, str, zyu);
    }
}
