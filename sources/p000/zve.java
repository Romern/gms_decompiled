package p000;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zve {

    /* renamed from: a */
    public final zsr f55968a;

    /* renamed from: b */
    public final zre f55969b;

    /* renamed from: c */
    public final zqx f55970c;

    /* renamed from: d */
    public final sqv f55971d;

    /* renamed from: e */
    public final long f55972e = TimeUnit.DAYS.toMillis(ceab.f182124a.mo6606a().mo78660k());

    /* renamed from: f */
    private final yrz f55973f;

    /* renamed from: g */
    private final caaq f55974g;

    public zve(zsr zsr, yrz yrz, zre zre, zqx zqx, caaq caaq, sqv sqv) {
        this.f55968a = zsr;
        this.f55973f = yrz;
        this.f55969b = zre;
        this.f55970c = zqx;
        this.f55974g = caaq;
        this.f55971d = sqv;
    }

    /* renamed from: a */
    public final String mo31535a() {
        try {
            this.f55968a.mo31458b();
            yrz yrz = this.f55973f;
            return (String) yrz.f54521d.mo25819b(new yrw(yrz)).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            zvj.m46564a(zvk.FETCH_INITIAL_SYNC_TOKEN, e);
            throw yqh.m44583a(e);
        }
    }

    /* renamed from: a */
    public final void mo31536a(long j, long j2, bnic bnic) {
        bngs j3 = bngx.m109377j();
        bnrd a = this.f55970c.mo31336a().iterator();
        while (a.hasNext()) {
            caae caae = (caae) a.next();
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            String str = caah.f172336b;
            if (zuq.m46516a(caae, this.f55974g) && bnic.contains(str)) {
                j3.mo67668c(new yqi(caae, j2, j, null));
            }
        }
        this.f55969b.mo31386b((List) j3.mo67664a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(long, long, caae, boolean):void
     arg types: [int, int, caae, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      zrc.a(long, long, caae, boolean):void */
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
    /* renamed from: a */
    public final void mo31537a(Iterable iterable, bmxv bmxv) {
        caci caci;
        caae caae;
        HashSet hashSet = new HashSet();
        do {
            this.f55968a.mo31458b();
            try {
                yrz yrz = this.f55973f;
                bxvd da = cach.f172548e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cach cach = (cach) da.f164949b;
                "me".getClass();
                cach.f172550a |= 1;
                cach.f172551b = "me";
                bxvd da2 = cabk.f172444e.mo74144da();
                bxvd da3 = cabj.f172440c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cabj cabj = (cabj) da3.f164949b;
                cabj.f172443b = 1;
                cabj.f172442a |= 1;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cabk cabk = (cabk) da2.f164949b;
                cabj cabj2 = (cabj) da3.mo74062i();
                cabj2.getClass();
                cabk.f172448c = cabj2;
                cabk.f172447b = 2;
                cabu cabu = (cabu) cabv.f172481b.mo74144da();
                cabu.mo74608a(iterable);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cabk cabk2 = (cabk) da2.f164949b;
                cabv cabv = (cabv) cabu.mo74062i();
                cabv.getClass();
                cabk2.f172449d = cabv;
                cabk2.f172446a |= 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cach cach2 = (cach) da.f164949b;
                cabk cabk3 = (cabk) da2.mo74062i();
                cabk3.getClass();
                cach2.f172552c = cabk3;
                cach2.f172550a |= 2;
                if (bmxv.mo66813a()) {
                    cacu cacu = (cacu) bmxv.mo66814b();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cach cach3 = (cach) da.f164949b;
                    cacu.getClass();
                    cach3.f172553d = cacu;
                    cach3.f172550a |= 4;
                }
                caci = (caci) yrz.f54521d.mo25819b(new yrv(yrz, da)).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
                bxwc bxwc = caci.f172556a;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    cabn cabn = (cabn) bxwc.get(i);
                    caae caae2 = cabn.f172456a;
                    if (caae2 == null) {
                        caae2 = caae.f172323i;
                    }
                    if (!hashSet.contains(caae2)) {
                        zre zre = this.f55969b;
                        caae caae3 = cabn.f172456a;
                        if (caae3 != null) {
                            caae = caae3;
                        } else {
                            caae = caae.f172323i;
                        }
                        zre.mo31367a(0L, Long.MAX_VALUE, caae, false);
                        caae caae4 = cabn.f172456a;
                        if (caae4 == null) {
                            caae4 = caae.f172323i;
                        }
                        hashSet.add(caae4);
                    }
                    this.f55968a.mo31459b(cabn.f172457b.size());
                    zre zre2 = this.f55969b;
                    bxwc bxwc2 = cabn.f172457b;
                    caae caae5 = cabn.f172456a;
                    if (caae5 == null) {
                        caae5 = caae.f172323i;
                    }
                    zre2.mo31361a((List) yrm.m44667a(bxwc2, caae5, this.f55969b), false);
                }
            } catch (ExecutionException | TimeoutException e) {
                zvj.m46564a(zvk.LIST_DATA_POINTS, e);
                throw yqh.m44583a(e);
            }
        } while (!caci.f172557b.isEmpty());
    }
}
