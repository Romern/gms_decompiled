package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: zvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvf implements zus {

    /* renamed from: a */
    private static final srn f55975a = zvt.m46581a();

    /* renamed from: b */
    private final yrz f55976b;

    /* renamed from: c */
    private final zre f55977c;

    /* renamed from: d */
    private final zqx f55978d;

    /* renamed from: e */
    private final sqv f55979e;

    /* renamed from: f */
    private final caaq f55980f;

    /* renamed from: g */
    private final Context f55981g;

    /* renamed from: h */
    private final String f55982h;

    public zvf(Context context, String str, yrz yrz, zre zre, zqx zqx, caaq caaq, sqv sqv) {
        this.f55981g = context;
        this.f55982h = str;
        this.f55976b = yrz;
        this.f55977c = zre;
        this.f55978d = zqx;
        this.f55979e = sqv;
        this.f55980f = caaq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zvb]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zvc]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zvd]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(long, long, caae, boolean):void
     arg types: [long, long, caae, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      zrc.a(long, long, caae, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bxwc, zuz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.List, boolean):bngx
     arg types: [bngx, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(java.util.List, boolean):bngx */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x033f A[LOOP:1: B:51:0x01df->B:106:0x033f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0344 A[EDGE_INSN: B:112:0x0344->B:107:0x0344 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f5  */
    /* renamed from: a */
    private final void m46553a(zsr zsr) {
        long j;
        zva zva;
        ydh e;
        String str;
        cacg a;
        int size;
        int i;
        bxvd da;
        int i2;
        ydh ydh;
        bxwc bxwc;
        cabn cabn;
        cabn cabn2;
        cabg cabg;
        if (ceab.m135729b()) {
            long b = this.f55979e.mo20506b();
            try {
                zve zve = r3;
                int i3 = 1;
                zve zve2 = new zve(zsr, this.f55976b, this.f55977c, this.f55978d, this.f55980f, this.f55979e);
                bnic b2 = zve.f55970c.mo31338b();
                bnia j2 = bnic.m109500j();
                bnrd a2 = b2.iterator();
                while (a2.hasNext()) {
                    long j3 = b;
                    j2.mo67629b(yyo.m45042a(((yqe) a2.next()).f54381b).f172336b);
                    b = j3;
                    i3 = 1;
                }
                bnic a3 = j2.mo67751a();
                ydh e2 = zve.f55969b.mo31376e();
                String str2 = e2.f53656b;
                long a4 = zve.f55971d.mo20505a();
                bnic a5 = bnic.m109488a(bnjd.m109586b((Iterable) a3, (bmxz) new zvb(e2)));
                if (a5.isEmpty()) {
                    j = b;
                } else {
                    long b3 = zve.f55971d.mo20506b();
                    if ((e2.f53655a & i3) == 0) {
                        str2 = zve.mo31535a();
                        zve.f55968a.mo31462c(2);
                    } else {
                        zve.f55968a.mo31462c(3);
                    }
                    bnic bnic = (bnic) yvq.f54693b.mo30787a();
                    bnic a6 = bnic.m109488a(bnjd.m109586b((Iterable) a5, (bmxz) new zvc(bnic)));
                    j = b;
                    try {
                        bnic a7 = bnic.m109488a(bnjd.m109586b((Iterable) a5, (bmxz) new zvd(bnic)));
                        if (!a6.isEmpty()) {
                            long j4 = a4 - zve.f55972e;
                            bxvd da2 = cacu.f172623d.mo74144da();
                            bxyk a8 = bxzt.m124580a(j4);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cacu cacu = (cacu) da2.f164949b;
                            a8.getClass();
                            cacu.f172626b = a8;
                            cacu.f172625a |= 1;
                            bxyk a9 = bxzt.m124580a(a4);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cacu cacu2 = (cacu) da2.f164949b;
                            a9.getClass();
                            cacu2.f172627c = a9;
                            cacu2.f172625a |= 2;
                            zve.mo31537a(a6, bmxv.m108566b((cacu) da2.mo74062i()));
                            zve.mo31536a(TimeUnit.MILLISECONDS.toNanos(j4), a4, a6);
                        }
                        if (!a7.isEmpty()) {
                            zve.mo31537a(a7, bmvz.f131120a);
                            zve.mo31536a(-1, a4, a7);
                        }
                        zre zre = zve.f55969b;
                        bxvd da3 = ydh.f53653d.mo74144da();
                        da3.mo73944G(a3);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ydh ydh2 = (ydh) da3.f164949b;
                        str2.getClass();
                        ydh2.f53655a |= 1;
                        ydh2.f53656b = str2;
                        zre.mo31371a((ydh) da3.mo74062i());
                        bxvd bxvd = zve.f55968a.f55829a;
                        int b4 = (int) (zve.f55971d.mo20506b() - b3);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpgw bpgw = (bpgw) bxvd.f164949b;
                        bpgw bpgw2 = bpgw.f137569C;
                        bpgw.f137573a |= 16777216;
                        bpgw.f137597y = b4;
                    } catch (yqh e3) {
                        e = e3;
                        bnsl bnsl = (bnsl) f55975a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("zvf", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Initial down sync failed, continue incremental sync.");
                        zsr zsr2 = zsr;
                        zva = new zva(zsr2, this.f55976b, this.f55977c);
                        e = zva.f55963c.mo31376e();
                        Map k = zva.f55963c.mo31391k();
                        str = e.f53656b;
                        while (true) {
                            zva.f55962b.mo31458b();
                            a = zva.mo31534a(str, e.f53657c);
                            bxwc bxwc2 = e.f53657c;
                            bxwc bxwc3 = a.f172544a;
                            size = bxwc3.size();
                            i = 0;
                            while (i < size) {
                            }
                            ydh ydh3 = e;
                            zre zre2 = zva.f55963c;
                            da = ydh.f53653d.mo74144da();
                            String str3 = a.f172545b;
                            if (da.f164950c) {
                            }
                            ydh ydh4 = (ydh) da.f164949b;
                            str3.getClass();
                            ydh4.f53655a |= 1;
                            ydh4.f53656b = str3;
                            da.mo73944G(bxwc2);
                            zre2.mo31371a((ydh) da.mo74062i());
                            String str4 = a.f172545b;
                            if (!a.f172546c) {
                            }
                            str = str4;
                            e = ydh3;
                        }
                        zsr2.mo31460b(this.f55979e.mo20506b() - j);
                    }
                }
            } catch (yqh e4) {
                e = e4;
                j = b;
                bnsl bnsl2 = (bnsl) f55975a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("zvf", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Initial down sync failed, continue incremental sync.");
                zsr zsr22 = zsr;
                zva = new zva(zsr22, this.f55976b, this.f55977c);
                e = zva.f55963c.mo31376e();
                Map k2 = zva.f55963c.mo31391k();
                str = e.f53656b;
                while (true) {
                    zva.f55962b.mo31458b();
                    a = zva.mo31534a(str, e.f53657c);
                    bxwc bxwc22 = e.f53657c;
                    bxwc bxwc32 = a.f172544a;
                    size = bxwc32.size();
                    i = 0;
                    while (i < size) {
                    }
                    ydh ydh32 = e;
                    zre zre22 = zva.f55963c;
                    da = ydh.f53653d.mo74144da();
                    String str32 = a.f172545b;
                    if (da.f164950c) {
                    }
                    ydh ydh42 = (ydh) da.f164949b;
                    str32.getClass();
                    ydh42.f53655a |= 1;
                    ydh42.f53656b = str32;
                    da.mo73944G(bxwc22);
                    zre22.mo31371a((ydh) da.mo74062i());
                    String str42 = a.f172545b;
                    if (!a.f172546c) {
                    }
                    str = str42;
                    e = ydh32;
                }
                zsr22.mo31460b(this.f55979e.mo20506b() - j);
            }
            zsr zsr222 = zsr;
            zva = new zva(zsr222, this.f55976b, this.f55977c);
            e = zva.f55963c.mo31376e();
            if ((e.f53655a & 1) != 0 && e.f53657c.size() != 0) {
                Map k22 = zva.f55963c.mo31391k();
                str = e.f53656b;
                while (true) {
                    zva.f55962b.mo31458b();
                    a = zva.mo31534a(str, e.f53657c);
                    bxwc bxwc222 = e.f53657c;
                    bxwc bxwc322 = a.f172544a;
                    size = bxwc322.size();
                    i = 0;
                    while (i < size) {
                        cabm cabm = (cabm) bxwc322.get(i);
                        int a10 = cabl.m126448a(cabm.f172452a);
                        int i4 = a10 - 1;
                        if (a10 != 0) {
                            if (i4 == 0) {
                                ydh = e;
                                bxwc = bxwc322;
                                i2 = size;
                                zsr zsr3 = zva.f55962b;
                                if (cabm.f172452a == 1) {
                                    cabn = (cabn) cabm.f172453b;
                                } else {
                                    cabn = cabn.f172454c;
                                }
                                zsr3.mo31459b(cabn.f172457b.size());
                                if (cabm.f172452a == 1) {
                                    cabn2 = (cabn) cabm.f172453b;
                                } else {
                                    cabn2 = cabn.f172454c;
                                }
                                caae caae = cabn2.f172456a;
                                if (caae == null) {
                                    caae = caae.f172323i;
                                }
                                yqi yqi = (yqi) k22.get(caae);
                                if (yqi == null) {
                                    zva.f55962b.mo31461c();
                                    bnsl bnsl3 = (bnsl) zva.f55961a.mo68388c();
                                    bnsl3.mo68432a("zva", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    caae caae2 = cabn2.f172456a;
                                    if (caae2 == null) {
                                        caae2 = caae.f172323i;
                                    }
                                    bnsl3.mo68420a("Missing sync status for data source %s", caae2.f172326b);
                                } else {
                                    bngx a11 = bngx.m109355a(bnjd.m109586b((Iterable) cabn2.f172457b, (bmxz) new zuz(yqi)));
                                    zre zre3 = zva.f55963c;
                                    caae caae3 = cabn2.f172456a;
                                    if (caae3 == null) {
                                        caae3 = caae.f172323i;
                                    }
                                    zre3.mo31361a((List) yrm.m44667a(a11, caae3, zva.f55963c), false);
                                }
                            } else if (i4 != 1) {
                                ydh = e;
                                bxwc = bxwc322;
                                i2 = size;
                            } else {
                                if (cabm.f172452a == 2) {
                                    cabg = (cabg) cabm.f172453b;
                                } else {
                                    cabg = cabg.f172429c;
                                }
                                caae a12 = zva.f55963c.mo31377a(cabg.f172431a);
                                if (a12 != null) {
                                    bxwc bxwc4 = cabg.f172432b;
                                    int size2 = bxwc4.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        ydh ydh5 = e;
                                        cabh cabh = (cabh) bxwc4.get(i5);
                                        bxwc bxwc5 = bxwc322;
                                        zre zre4 = zva.f55963c;
                                        int i6 = size;
                                        bxyk bxyk = cabh.f172436a;
                                        if (bxyk == null) {
                                            bxyk = bxyk.f165095c;
                                        }
                                        long b5 = bxzt.m124582b(bxyk);
                                        bxyk bxyk2 = cabh.f172437b;
                                        if (bxyk2 == null) {
                                            bxyk2 = bxyk.f165095c;
                                        }
                                        zre4.mo31367a(b5, bxzt.m124582b(bxyk2), a12, false);
                                        i5++;
                                        bxwc322 = bxwc5;
                                        e = ydh5;
                                        size = i6;
                                    }
                                    ydh = e;
                                    bxwc = bxwc322;
                                    i2 = size;
                                } else {
                                    ydh = e;
                                    bxwc = bxwc322;
                                    i2 = size;
                                    zva.f55962b.mo31461c();
                                }
                            }
                            i++;
                            bxwc322 = bxwc;
                            e = ydh;
                            size = i2;
                        } else {
                            throw null;
                        }
                    }
                    ydh ydh322 = e;
                    zre zre222 = zva.f55963c;
                    da = ydh.f53653d.mo74144da();
                    String str322 = a.f172545b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ydh ydh422 = (ydh) da.f164949b;
                    str322.getClass();
                    ydh422.f53655a |= 1;
                    ydh422.f53656b = str322;
                    da.mo73944G(bxwc222);
                    zre222.mo31371a((ydh) da.mo74062i());
                    String str422 = a.f172545b;
                    if (!a.f172546c) {
                        break;
                    }
                    str = str422;
                    e = ydh322;
                }
            }
            zsr222.mo31460b(this.f55979e.mo20506b() - j);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zul.a(android.content.Context, zuu, zre):void
     arg types: [android.content.Context, yrz, zre]
     candidates:
      zul.a(android.content.Context, zuu, zra):void
      zul.a(android.content.Context, zuu, zre):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zvb]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zvc]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zvd]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(long, long, caae, boolean):void
     arg types: [long, long, caae, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      zrc.a(long, long, caae, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bxwc, zuz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.List, boolean):bngx
     arg types: [bngx, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(java.util.List, boolean):bngx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zul.a(android.content.Context, zuu, zra):void
     arg types: [android.content.Context, yrz, zre]
     candidates:
      zul.a(android.content.Context, zuu, zre):void
      zul.a(android.content.Context, zuu, zra):void */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03aa A[LOOP:1: B:65:0x024b->B:120:0x03aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03af A[EDGE_INSN: B:129:0x03af->B:121:0x03af ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0261  */
    /* renamed from: a */
    public final void mo31533a(zsr zsr, cadt cadt) {
        zul zul;
        zun zun;
        zva zva;
        ydh e;
        String str;
        cacg a;
        int size;
        int i;
        bxvd da;
        int i2;
        ydh ydh;
        bxwc bxwc;
        cabn cabn;
        cabn cabn2;
        cabg cabg;
        zvf zvf = this;
        zum zum = new zum();
        SharedPreferences d = zuw.m46538d(zvf.f55981g, zvf.f55982h);
        zul zul2 = new zul(zsr, d, zum, zvf.f55980f, zvf.f55979e);
        zun zun2 = new zun(d, zum, zsr);
        long a2 = zvf.f55979e.mo20505a();
        bxvd bxvd = zsr.f55829a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 8388608;
        int i3 = 1;
        bpgw.f137596x = true;
        zul2.mo31527a(zvf.f55981g, (zuu) zvf.f55976b, zvf.f55977c);
        zul2.mo31528a(zvf.f55981g, zvf.f55976b, zvf.f55977c, a2);
        if (ceab.m135729b()) {
            long b = zvf.f55979e.mo20506b();
            try {
                zve zve = r3;
                zve zve2 = new zve(zsr, zvf.f55976b, zvf.f55977c, zvf.f55978d, zvf.f55980f, zvf.f55979e);
                bnic b2 = zve.f55970c.mo31338b();
                bnia j = bnic.m109500j();
                bnrd a3 = b2.iterator();
                while (a3.hasNext()) {
                    zul = zul2;
                    zun zun3 = zun2;
                    j.mo67629b(yyo.m45042a(((yqe) a3.next()).f54381b).f172336b);
                    zun2 = zun3;
                    zul2 = zul;
                    i3 = 1;
                }
                bnic a4 = j.mo67751a();
                ydh e2 = zve.f55969b.mo31376e();
                String str2 = e2.f53656b;
                long a5 = zve.f55971d.mo20505a();
                bnic a6 = bnic.m109488a(bnjd.m109586b((Iterable) a4, (bmxz) new zvb(e2)));
                if (a6.isEmpty()) {
                    zul = zul2;
                    zun = zun2;
                } else {
                    long b3 = zve.f55971d.mo20506b();
                    if ((e2.f53655a & i3) == 0) {
                        str2 = zve.mo31535a();
                        zve.f55968a.mo31462c(2);
                    } else {
                        zve.f55968a.mo31462c(3);
                    }
                    bnic bnic = (bnic) yvq.f54693b.mo30787a();
                    bnic a7 = bnic.m109488a(bnjd.m109586b((Iterable) a6, (bmxz) new zvc(bnic)));
                    zun = zun2;
                    try {
                        bnic a8 = bnic.m109488a(bnjd.m109586b((Iterable) a6, (bmxz) new zvd(bnic)));
                        if (!a7.isEmpty()) {
                            zul zul3 = zul2;
                            try {
                                long j2 = a5 - zve.f55972e;
                                zul = zul3;
                                try {
                                    bxvd da2 = cacu.f172623d.mo74144da();
                                    bxyk a9 = bxzt.m124580a(j2);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    cacu cacu = (cacu) da2.f164949b;
                                    a9.getClass();
                                    cacu.f172626b = a9;
                                    cacu.f172625a |= 1;
                                    bxyk a10 = bxzt.m124580a(a5);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    cacu cacu2 = (cacu) da2.f164949b;
                                    a10.getClass();
                                    cacu2.f172627c = a10;
                                    cacu2.f172625a |= 2;
                                    zve.mo31537a(a7, bmxv.m108566b((cacu) da2.mo74062i()));
                                    zve.mo31536a(TimeUnit.MILLISECONDS.toNanos(j2), a5, a7);
                                } catch (yqh e3) {
                                    e = e3;
                                    bnsl bnsl = (bnsl) f55975a.mo68388c();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68432a("zvf", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68405a("Initial down sync failed, continue incremental sync.");
                                    zvf = this;
                                    zsr zsr2 = zsr;
                                    zva = new zva(zsr2, zvf.f55976b, zvf.f55977c);
                                    e = zva.f55963c.mo31376e();
                                    Map k = zva.f55963c.mo31391k();
                                    str = e.f53656b;
                                    while (true) {
                                        zva.f55962b.mo31458b();
                                        a = zva.mo31534a(str, e.f53657c);
                                        bxwc bxwc2 = e.f53657c;
                                        bxwc bxwc3 = a.f172544a;
                                        size = bxwc3.size();
                                        i = 0;
                                        while (i < size) {
                                        }
                                        ydh ydh2 = e;
                                        zre zre = zva.f55963c;
                                        da = ydh.f53653d.mo74144da();
                                        String str3 = a.f172545b;
                                        if (da.f164950c) {
                                        }
                                        ydh ydh3 = (ydh) da.f164949b;
                                        str3.getClass();
                                        ydh3.f53655a |= 1;
                                        ydh3.f53656b = str3;
                                        da.mo73944G(bxwc2);
                                        zre.mo31371a((ydh) da.mo74062i());
                                        String str4 = a.f172545b;
                                        if (!a.f172546c) {
                                        }
                                        str = str4;
                                        e = ydh2;
                                    }
                                    zsr2.mo31460b(zvf.f55979e.mo20506b() - b);
                                    if (zul.m46500a(zvf.f55981g, cadt)) {
                                    }
                                    zun.mo31532a(zvf.f55976b, zvf.f55977c);
                                }
                            } catch (yqh e4) {
                                e = e4;
                                zul = zul3;
                                bnsl bnsl2 = (bnsl) f55975a.mo68388c();
                                bnsl2.mo68437a(e);
                                bnsl2.mo68432a("zvf", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Initial down sync failed, continue incremental sync.");
                                zvf = this;
                                zsr zsr22 = zsr;
                                zva = new zva(zsr22, zvf.f55976b, zvf.f55977c);
                                e = zva.f55963c.mo31376e();
                                Map k2 = zva.f55963c.mo31391k();
                                str = e.f53656b;
                                while (true) {
                                    zva.f55962b.mo31458b();
                                    a = zva.mo31534a(str, e.f53657c);
                                    bxwc bxwc22 = e.f53657c;
                                    bxwc bxwc32 = a.f172544a;
                                    size = bxwc32.size();
                                    i = 0;
                                    while (i < size) {
                                    }
                                    ydh ydh22 = e;
                                    zre zre2 = zva.f55963c;
                                    da = ydh.f53653d.mo74144da();
                                    String str32 = a.f172545b;
                                    if (da.f164950c) {
                                    }
                                    ydh ydh32 = (ydh) da.f164949b;
                                    str32.getClass();
                                    ydh32.f53655a |= 1;
                                    ydh32.f53656b = str32;
                                    da.mo73944G(bxwc22);
                                    zre2.mo31371a((ydh) da.mo74062i());
                                    String str42 = a.f172545b;
                                    if (!a.f172546c) {
                                    }
                                    str = str42;
                                    e = ydh22;
                                }
                                zsr22.mo31460b(zvf.f55979e.mo20506b() - b);
                                if (zul.m46500a(zvf.f55981g, cadt)) {
                                }
                                zun.mo31532a(zvf.f55976b, zvf.f55977c);
                            }
                        } else {
                            zul = zul2;
                        }
                        if (!a8.isEmpty()) {
                            zve.mo31537a(a8, bmvz.f131120a);
                            zve.mo31536a(-1, a5, a8);
                        }
                        zre zre3 = zve.f55969b;
                        bxvd da3 = ydh.f53653d.mo74144da();
                        da3.mo73944G(a4);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ydh ydh4 = (ydh) da3.f164949b;
                        str2.getClass();
                        ydh4.f53655a |= 1;
                        ydh4.f53656b = str2;
                        zre3.mo31371a((ydh) da3.mo74062i());
                        bxvd bxvd2 = zve.f55968a.f55829a;
                        int b4 = (int) (zve.f55971d.mo20506b() - b3);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bpgw bpgw3 = (bpgw) bxvd2.f164949b;
                        bpgw3.f137573a |= 16777216;
                        bpgw3.f137597y = b4;
                    } catch (yqh e5) {
                        e = e5;
                        zul = zul2;
                        bnsl bnsl22 = (bnsl) f55975a.mo68388c();
                        bnsl22.mo68437a(e);
                        bnsl22.mo68432a("zvf", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl22.mo68405a("Initial down sync failed, continue incremental sync.");
                        zvf = this;
                        zsr zsr222 = zsr;
                        zva = new zva(zsr222, zvf.f55976b, zvf.f55977c);
                        e = zva.f55963c.mo31376e();
                        Map k22 = zva.f55963c.mo31391k();
                        str = e.f53656b;
                        while (true) {
                            zva.f55962b.mo31458b();
                            a = zva.mo31534a(str, e.f53657c);
                            bxwc bxwc222 = e.f53657c;
                            bxwc bxwc322 = a.f172544a;
                            size = bxwc322.size();
                            i = 0;
                            while (i < size) {
                            }
                            ydh ydh222 = e;
                            zre zre22 = zva.f55963c;
                            da = ydh.f53653d.mo74144da();
                            String str322 = a.f172545b;
                            if (da.f164950c) {
                            }
                            ydh ydh322 = (ydh) da.f164949b;
                            str322.getClass();
                            ydh322.f53655a |= 1;
                            ydh322.f53656b = str322;
                            da.mo73944G(bxwc222);
                            zre22.mo31371a((ydh) da.mo74062i());
                            String str422 = a.f172545b;
                            if (!a.f172546c) {
                            }
                            str = str422;
                            e = ydh222;
                        }
                        zsr222.mo31460b(zvf.f55979e.mo20506b() - b);
                        if (zul.m46500a(zvf.f55981g, cadt)) {
                        }
                        zun.mo31532a(zvf.f55976b, zvf.f55977c);
                    }
                }
            } catch (yqh e6) {
                e = e6;
                zul = zul2;
                zun = zun2;
                bnsl bnsl222 = (bnsl) f55975a.mo68388c();
                bnsl222.mo68437a(e);
                bnsl222.mo68432a("zvf", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl222.mo68405a("Initial down sync failed, continue incremental sync.");
                zvf = this;
                zsr zsr2222 = zsr;
                zva = new zva(zsr2222, zvf.f55976b, zvf.f55977c);
                e = zva.f55963c.mo31376e();
                Map k222 = zva.f55963c.mo31391k();
                str = e.f53656b;
                while (true) {
                    zva.f55962b.mo31458b();
                    a = zva.mo31534a(str, e.f53657c);
                    bxwc bxwc2222 = e.f53657c;
                    bxwc bxwc3222 = a.f172544a;
                    size = bxwc3222.size();
                    i = 0;
                    while (i < size) {
                    }
                    ydh ydh2222 = e;
                    zre zre222 = zva.f55963c;
                    da = ydh.f53653d.mo74144da();
                    String str3222 = a.f172545b;
                    if (da.f164950c) {
                    }
                    ydh ydh3222 = (ydh) da.f164949b;
                    str3222.getClass();
                    ydh3222.f53655a |= 1;
                    ydh3222.f53656b = str3222;
                    da.mo73944G(bxwc2222);
                    zre222.mo31371a((ydh) da.mo74062i());
                    String str4222 = a.f172545b;
                    if (!a.f172546c) {
                    }
                    str = str4222;
                    e = ydh2222;
                }
                zsr2222.mo31460b(zvf.f55979e.mo20506b() - b);
                if (zul.m46500a(zvf.f55981g, cadt)) {
                }
                zun.mo31532a(zvf.f55976b, zvf.f55977c);
            }
            zvf = this;
            zsr zsr22222 = zsr;
            zva = new zva(zsr22222, zvf.f55976b, zvf.f55977c);
            e = zva.f55963c.mo31376e();
            if ((e.f53655a & 1) != 0 && e.f53657c.size() != 0) {
                Map k2222 = zva.f55963c.mo31391k();
                str = e.f53656b;
                while (true) {
                    zva.f55962b.mo31458b();
                    a = zva.mo31534a(str, e.f53657c);
                    bxwc bxwc22222 = e.f53657c;
                    bxwc bxwc32222 = a.f172544a;
                    size = bxwc32222.size();
                    i = 0;
                    while (i < size) {
                        cabm cabm = (cabm) bxwc32222.get(i);
                        int a11 = cabl.m126448a(cabm.f172452a);
                        int i4 = a11 - 1;
                        if (a11 != 0) {
                            if (i4 == 0) {
                                ydh = e;
                                bxwc = bxwc32222;
                                i2 = size;
                                zsr zsr3 = zva.f55962b;
                                if (cabm.f172452a == 1) {
                                    cabn = (cabn) cabm.f172453b;
                                } else {
                                    cabn = cabn.f172454c;
                                }
                                zsr3.mo31459b(cabn.f172457b.size());
                                if (cabm.f172452a == 1) {
                                    cabn2 = (cabn) cabm.f172453b;
                                } else {
                                    cabn2 = cabn.f172454c;
                                }
                                caae caae = cabn2.f172456a;
                                if (caae == null) {
                                    caae = caae.f172323i;
                                }
                                yqi yqi = (yqi) k2222.get(caae);
                                if (yqi == null) {
                                    zva.f55962b.mo31461c();
                                    bnsl bnsl3 = (bnsl) zva.f55961a.mo68388c();
                                    bnsl3.mo68432a("zva", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    caae caae2 = cabn2.f172456a;
                                    if (caae2 == null) {
                                        caae2 = caae.f172323i;
                                    }
                                    bnsl3.mo68420a("Missing sync status for data source %s", caae2.f172326b);
                                } else {
                                    bngx a12 = bngx.m109355a(bnjd.m109586b((Iterable) cabn2.f172457b, (bmxz) new zuz(yqi)));
                                    zre zre4 = zva.f55963c;
                                    caae caae3 = cabn2.f172456a;
                                    if (caae3 == null) {
                                        caae3 = caae.f172323i;
                                    }
                                    zre4.mo31361a((List) yrm.m44667a(a12, caae3, zva.f55963c), false);
                                }
                            } else if (i4 != 1) {
                                ydh = e;
                                bxwc = bxwc32222;
                                i2 = size;
                            } else {
                                if (cabm.f172452a == 2) {
                                    cabg = (cabg) cabm.f172453b;
                                } else {
                                    cabg = cabg.f172429c;
                                }
                                caae a13 = zva.f55963c.mo31377a(cabg.f172431a);
                                if (a13 != null) {
                                    bxwc bxwc4 = cabg.f172432b;
                                    int size2 = bxwc4.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        ydh ydh5 = e;
                                        cabh cabh = (cabh) bxwc4.get(i5);
                                        bxwc bxwc5 = bxwc32222;
                                        zre zre5 = zva.f55963c;
                                        int i6 = size;
                                        bxyk bxyk = cabh.f172436a;
                                        if (bxyk == null) {
                                            bxyk = bxyk.f165095c;
                                        }
                                        long b5 = bxzt.m124582b(bxyk);
                                        bxyk bxyk2 = cabh.f172437b;
                                        if (bxyk2 == null) {
                                            bxyk2 = bxyk.f165095c;
                                        }
                                        zre5.mo31367a(b5, bxzt.m124582b(bxyk2), a13, false);
                                        i5++;
                                        bxwc32222 = bxwc5;
                                        e = ydh5;
                                        size = i6;
                                    }
                                    ydh = e;
                                    bxwc = bxwc32222;
                                    i2 = size;
                                } else {
                                    ydh = e;
                                    bxwc = bxwc32222;
                                    i2 = size;
                                    zva.f55962b.mo31461c();
                                }
                            }
                            i++;
                            bxwc32222 = bxwc;
                            e = ydh;
                            size = i2;
                        } else {
                            throw null;
                        }
                    }
                    ydh ydh22222 = e;
                    zre zre2222 = zva.f55963c;
                    da = ydh.f53653d.mo74144da();
                    String str32222 = a.f172545b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ydh ydh32222 = (ydh) da.f164949b;
                    str32222.getClass();
                    ydh32222.f53655a |= 1;
                    ydh32222.f53656b = str32222;
                    da.mo73944G(bxwc22222);
                    zre2222.mo31371a((ydh) da.mo74062i());
                    String str42222 = a.f172545b;
                    if (!a.f172546c) {
                        break;
                    }
                    str = str42222;
                    e = ydh22222;
                }
            }
            zsr22222.mo31460b(zvf.f55979e.mo20506b() - b);
        } else {
            zul = zul2;
            zun = zun2;
        }
        if (zul.m46500a(zvf.f55981g, cadt)) {
            zul.mo31526a(zvf.f55981g, (zuu) zvf.f55976b, (zra) zvf.f55977c);
        }
        zun.mo31532a(zvf.f55976b, zvf.f55977c);
    }
}
