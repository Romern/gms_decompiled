package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: zvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvh implements zus {

    /* renamed from: a */
    public static final /* synthetic */ int f55984a = 0;

    /* renamed from: b */
    private static final srn f55985b = zvt.m46581a();

    /* renamed from: c */
    private final yrz f55986c;

    /* renamed from: d */
    private final zre f55987d;

    /* renamed from: e */
    private final caaq f55988e;

    /* renamed from: f */
    private final zus f55989f;

    /* renamed from: g */
    private final zus f55990g;

    /* renamed from: h */
    private final sqv f55991h;

    public zvh(yrz yrz, zre zre, caaq caaq, zus zus, zus zus2, sqv sqv) {
        this.f55986c = yrz;
        this.f55987d = zre;
        this.f55988e = caaq;
        this.f55989f = zus;
        this.f55990g = zus2;
        this.f55991h = sqv;
    }

    /* renamed from: a */
    private final void m46556a() {
        this.f55987d.mo31379g();
    }

    /* renamed from: a */
    private final void m46557a(zsr zsr) {
        if ((this.f55987d.mo31376e().f53655a & 1) == 0) {
            Map k = this.f55987d.mo31391k();
            ArrayList arrayList = new ArrayList();
            bngs j = bngx.m109377j();
            for (Map.Entry entry : k.entrySet()) {
                caae caae = (caae) entry.getKey();
                String str = ((yqi) entry.getValue()).f54393d;
                if (str != null) {
                    arrayList.add(str);
                    caah caah = caae.f172330f;
                    if (caah == null) {
                        caah = caah.f172333d;
                    }
                    j.mo67668c(caah.f172336b);
                }
            }
            if (arrayList.isEmpty()) {
                bnsl bnsl = (bnsl) f55985b.mo68390d();
                bnsl.mo68432a("zvh", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("No legacy tokens for exchange.");
                return;
            }
            long b = this.f55991h.mo20506b();
            zsr.mo31458b();
            yrz yrz = this.f55986c;
            cacb cacb = (cacb) yrz.f54521d.mo25819b(new yrp(yrz, arrayList)).get(ceab.m135732e(), TimeUnit.SECONDS);
            if ((cacb.f172507a & 1) == 0) {
                zsr.mo31464d();
                m46556a();
            } else {
                zre zre = this.f55987d;
                bxvd da = ydh.f53653d.mo74144da();
                String str2 = cacb.f172508b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ydh ydh = (ydh) da.f164949b;
                str2.getClass();
                ydh.f53655a |= 1;
                ydh.f53656b = str2;
                da.mo73944G(bnic.m109495a((Collection) j.mo67664a()));
                zre.mo31371a((ydh) da.mo74062i());
            }
            bnsl bnsl2 = (bnsl) f55985b.mo68390d();
            bnsl2.mo68432a("zvh", "a", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Token exchange completed, upgraded to milestone two.");
            zsr.mo31454a(this.f55991h.mo20506b() - b);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x022b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x023c  */
    /* renamed from: a */
    public final void mo31533a(zsr zsr, cadt cadt) {
        boolean c;
        cadt cadt2;
        String str;
        zsr zsr2 = zsr;
        String str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        try {
            if (!ceab.m135735h()) {
                ydh e = this.f55987d.mo31376e();
                if ((e.f53655a & 1) != 0) {
                    long b = this.f55991h.mo20506b();
                    zsr.mo31458b();
                    yrz yrz = this.f55986c;
                    cacb cacb = (cacb) yrz.f54521d.mo25819b(new yry(yrz, e.f53656b)).get(ceab.m135732e(), TimeUnit.SECONDS);
                    if ((cacb.f172507a & 2) == 0) {
                        zsr.mo31464d();
                        m46556a();
                    } else {
                        String str3 = cacb.f172509c;
                        Map k = this.f55987d.mo31391k();
                        bngs j = bngx.m109377j();
                        HashSet hashSet = new HashSet(e.f53657c);
                        Iterator it = k.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            caae caae = (caae) entry.getKey();
                            yqi yqi = (yqi) entry.getValue();
                            if (zuq.m46516a(caae, this.f55988e)) {
                                caah caah = caae.f172330f;
                                if (caah == null) {
                                    caah = caah.f172333d;
                                }
                                if (hashSet.contains(caah.f172336b)) {
                                    str = str2;
                                    try {
                                        j.mo67668c(new yqi(caae, yqi.f54391b, yqi.f54392c, str3));
                                        j = j;
                                        hashSet = hashSet;
                                        str2 = str;
                                        it = it;
                                    } catch (ExecutionException e2) {
                                        e = e2;
                                        bnsl bnsl = (bnsl) f55985b.mo68388c();
                                        bnsl.mo68437a(e);
                                        bnsl.mo68432a("zvh", "a", 76, str);
                                        bnsl.mo68405a("Exchange sync token failed, continue syncing.");
                                        c = bnjd.m109592c((Iterable) this.f55987d.mo31391k().values(), zvg.f55983a);
                                        int i = this.f55987d.mo31376e().f53655a & 1;
                                        if (!c) {
                                        }
                                        if (!c) {
                                            this.f55990g.mo31533a(zsr2, cadt2);
                                        }
                                        (!ceab.m135735h() ? this.f55989f : this.f55990g).mo31533a(zsr2, cadt2);
                                    }
                                }
                            }
                        }
                        this.f55987d.mo31386b((List) j.mo67664a());
                        this.f55987d.mo31371a(ydh.f53653d);
                    }
                    zsr2.mo31454a(this.f55991h.mo20506b() - b);
                }
            } else if ((this.f55987d.mo31376e().f53655a & 1) == 0) {
                Map k2 = this.f55987d.mo31391k();
                ArrayList arrayList = new ArrayList();
                bngs j2 = bngx.m109377j();
                for (Map.Entry entry2 : k2.entrySet()) {
                    caae caae2 = (caae) entry2.getKey();
                    String str4 = ((yqi) entry2.getValue()).f54393d;
                    if (str4 != null) {
                        arrayList.add(str4);
                        caah caah2 = caae2.f172330f;
                        if (caah2 == null) {
                            caah2 = caah.f172333d;
                        }
                        j2.mo67668c(caah2.f172336b);
                    }
                }
                if (arrayList.isEmpty()) {
                    bnsl bnsl2 = (bnsl) f55985b.mo68390d();
                    bnsl2.mo68432a("zvh", "a", 115, str2);
                    bnsl2.mo68405a("No legacy tokens for exchange.");
                } else {
                    long b2 = this.f55991h.mo20506b();
                    zsr.mo31458b();
                    yrz yrz2 = this.f55986c;
                    cacb cacb2 = (cacb) yrz2.f54521d.mo25819b(new yrp(yrz2, arrayList)).get(ceab.m135732e(), TimeUnit.SECONDS);
                    if ((cacb2.f172507a & 1) == 0) {
                        zsr.mo31464d();
                        m46556a();
                    } else {
                        zre zre = this.f55987d;
                        bxvd da = ydh.f53653d.mo74144da();
                        String str5 = cacb2.f172508b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ydh ydh = (ydh) da.f164949b;
                        str5.getClass();
                        ydh.f53655a |= 1;
                        ydh.f53656b = str5;
                        da.mo73944G(bnic.m109495a((Collection) j2.mo67664a()));
                        zre.mo31371a((ydh) da.mo74062i());
                    }
                    bnsl bnsl3 = (bnsl) f55985b.mo68390d();
                    bnsl3.mo68432a("zvh", "a", 135, str2);
                    bnsl3.mo68405a("Token exchange completed, upgraded to milestone two.");
                    zsr2.mo31454a(this.f55991h.mo20506b() - b2);
                }
            }
        } catch (ExecutionException e3) {
            e = e3;
            str = str2;
            bnsl bnsl4 = (bnsl) f55985b.mo68388c();
            bnsl4.mo68437a(e);
            bnsl4.mo68432a("zvh", "a", 76, str);
            bnsl4.mo68405a("Exchange sync token failed, continue syncing.");
            c = bnjd.m109592c((Iterable) this.f55987d.mo31391k().values(), zvg.f55983a);
            int i2 = this.f55987d.mo31376e().f53655a & 1;
            if (!c) {
            }
            if (!c) {
            }
            (!ceab.m135735h() ? this.f55989f : this.f55990g).mo31533a(zsr2, cadt2);
        }
        c = bnjd.m109592c((Iterable) this.f55987d.mo31391k().values(), zvg.f55983a);
        int i22 = this.f55987d.mo31376e().f53655a & 1;
        if (!c) {
            cadt2 = cadt;
        } else if (i22 != 0) {
            cadt2 = cadt;
        } else {
            this.f55989f.mo31533a(zsr2, cadt);
            return;
        }
        if (!c && i22 != 0) {
            this.f55990g.mo31533a(zsr2, cadt2);
        } else {
            (!ceab.m135735h() ? this.f55989f : this.f55990g).mo31533a(zsr2, cadt2);
        }
    }
}
