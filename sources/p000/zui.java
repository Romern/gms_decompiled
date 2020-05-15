package p000;

import android.content.Context;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: zui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zui {

    /* renamed from: e */
    public static final /* synthetic */ int f55923e = 0;

    /* renamed from: f */
    private static final srn f55924f = zvt.m46581a();

    /* renamed from: a */
    public final caaq f55925a;

    /* renamed from: b */
    public final sqv f55926b;

    /* renamed from: c */
    public final snf f55927c = snp.m35703a(1, 10);

    /* renamed from: d */
    public final zsr f55928d;

    /* renamed from: g */
    private final zum f55929g;

    static {
        bnic.m109492a("com.google.internal.goal", "com.google.height", "com.google.weight", "com.google.body.fat.percentage");
    }

    public zui(zsr zsr, zum zum, caaq caaq, sqv sqv) {
        this.f55928d = zsr;
        this.f55925a = caaq;
        this.f55929g = zum;
        this.f55926b = sqv;
    }

    /* renamed from: a */
    private static int m46482a(cabc cabc) {
        if ((cabc.f172413a & 1) == 0) {
            return cabc.f172415c ? 2 : 3;
        }
        int a = cabf.m126442a(cabc.f172414b);
        if (a != 0) {
            return a;
        }
        return 1;
    }

    /* renamed from: b */
    private final void m46487b(Context context, List list, zra zra, zuu zuu, int i) {
        zra zra2 = zra;
        yvq.m44915h(context);
        bngx a = zuq.m46511a(list, zra2, zud.f55919a);
        if (!a.isEmpty()) {
            zsr zsr = this.f55928d;
            int size = a.size();
            bxvd bxvd = zsr.f55829a;
            int i2 = ((bpgw) bxvd.f164949b).f137580h + size;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpgw bpgw = (bpgw) bxvd.f164949b;
            bpgw bpgw2 = bpgw.f137569C;
            bpgw.f137573a |= 64;
            bpgw.f137580h = i2;
            if (cdza.m135455c()) {
                int size2 = a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    cabc cabc = (cabc) a.get(i3);
                    int i4 = -1;
                    boolean z = true;
                    if (!zuq.m46517a(cabc)) {
                        caae a2 = yyd.m44985a(cabc.f172416d, true);
                        zsr zsr2 = this.f55928d;
                        caah caah = a2.f172330f;
                        if (caah == null) {
                            caah = caah.f172333d;
                        }
                        String str = caah.f172336b;
                        if ((a2.f172325a & 64) != 0) {
                            bzzz bzzz = a2.f172332h;
                            if (bzzz == null) {
                                bzzz = bzzz.f172298f;
                            }
                            if (!bzzz.equals(yxy.f54800b)) {
                                z = false;
                            }
                        }
                        int a3 = m46482a(cabc);
                        int i5 = cabc.f164961ai;
                        if (i5 == -1) {
                            i5 = bxxm.f165037a.mo74228a(cabc).mo74223b(cabc);
                            cabc.f164961ai = i5;
                        }
                        zsr2.mo31457a(str, z, a3, i5);
                    } else {
                        bxwc bxwc = cabc.f172422j;
                        int size3 = bxwc.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            String str2 = (String) bxwc.get(i6);
                            zsr zsr3 = this.f55928d;
                            int a4 = m46482a(cabc);
                            int i7 = cabc.f164961ai;
                            if (i7 == i4) {
                                i7 = bxxm.f165037a.mo74228a(cabc).mo74223b(cabc);
                                cabc.f164961ai = i7;
                            }
                            zsr3.mo31457a(str2, true, a4, i7);
                            i6++;
                            i4 = -1;
                        }
                    }
                }
            }
            a.size();
            try {
                cabb cabb = (cabb) zuu.mo30710b(a).get((long) i, TimeUnit.SECONDS);
                bxvw bxvw = cabb.f172408b;
                bxvw bxvw2 = cabb.f172409c;
                try {
                    zra2.mo31344a(bxvw);
                    zra2.mo31348a(bnic.m109495a((Collection) bxvw2));
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) f55924f.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("zui", "a", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Unable to apply data point changes result");
                }
                zsr zsr4 = this.f55928d;
                int size4 = cabb.f172408b.size();
                bxvd bxvd2 = zsr4.f55829a;
                int i8 = ((bpgw) bxvd2.f164949b).f137582j + size4;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bpgw bpgw3 = (bpgw) bxvd2.f164949b;
                bpgw3.f137573a |= 128;
                bpgw3.f137582j = i8;
                zsr4.mo31452a(cabb.f172409c.size());
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                bnsl bnsl2 = (bnsl) f55924f.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("zui", "b", 262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Unable to applyChange");
                zvj.m46564a(zvk.UPLOAD_CHANGE, e2);
                this.f55928d.mo31452a(a.size());
                throw yqh.m44583a(e2);
            }
        }
    }

    /* renamed from: a */
    public static bmxz m46483a() {
        String c = cdzd.f182003a.mo6606a().mo78579c();
        String af = cdzd.f182003a.mo6606a().mo78566af();
        try {
            bmxz a = m46484a(c);
            bmxz a2 = m46484a(af);
            bmxz a3 = bmyf.m108613a(a);
            bmxy.m108581a(a3);
            bmxy.m108581a(a2);
            return new bmye(Arrays.asList(a3, a2));
        } catch (PatternSyntaxException e) {
            bnsl bnsl = (bnsl) f55924f.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zui", "a", 867, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Problem parsing regex.");
            return bmyd.ALWAYS_TRUE;
        }
    }

    /* renamed from: a */
    private static bmxz m46484a(String str) {
        if (!str.isEmpty()) {
            return new zug(Pattern.compile(str));
        }
        return bmyd.ALWAYS_FALSE;
    }

    /* renamed from: a */
    public static bngx m46485a(zra zra, int i, long j) {
        bngs b = bngx.m109371b(i);
        bngx a = zra.mo31346a(i, j);
        b.mo67666b((Iterable) a);
        if (a.size() < i) {
            b.mo67666b((Iterable) zra.mo31350b(i - a.size(), j));
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    private static void m46486a(zra zra, List list, List list2) {
        try {
            zra.mo31344a(list);
            zra.mo31348a(bnic.m109495a((Collection) list2));
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55924f.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zui", "a", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to apply data point changes result");
        }
    }

    /* renamed from: a */
    public final bnic mo31520a(zre zre, zqx zqx, boolean z) {
        bnic b = zqx.mo31338b();
        if (b.isEmpty()) {
            return bnon.f131923a;
        }
        Map k = zre.mo31391k();
        bnia j = bnic.m109500j();
        bnrd a = b.iterator();
        while (a.hasNext()) {
            yqe yqe = (yqe) a.next();
            caae caae = yqe.f54381b.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            if (!yhj.m44108a(caae)) {
                if (yqe.f54384e != 2) {
                    if (z) {
                        caae caae2 = yqe.f54381b.f172720b;
                        if (caae2 == null) {
                            caae2 = caae.f172323i;
                        }
                        if (!yhk.m44110a(caae2, this.f55925a)) {
                        }
                    }
                }
                yqi yqi = (yqi) k.get(caae);
                if (yqi == null) {
                    bnsl bnsl = (bnsl) f55924f.mo68388c();
                    bnsl.mo68432a("zui", "a", 498, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Data source [%s] is not found.", caae.f172326b);
                } else if (!zuq.m46516a(caae, this.f55925a)) {
                    bnsl bnsl2 = (bnsl) f55924f.mo68387b();
                    bnsl2.mo68432a("zui", "a", 503, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Skipping download of local data source: %s", caae.f172326b);
                } else {
                    j.mo67629b(yqi);
                }
            }
        }
        return j.mo67751a();
    }

    /* renamed from: a */
    public final void mo31521a(Context context, List list, zra zra, zuu zuu, int i) {
        bmxj bmxj = zuc.f55918a;
        int y = (int) ceab.f182124a.mo6606a().mo78674y();
        bngx a = bngx.m109368a((Collection) list);
        bngs j = bngx.m109377j();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < list.size()) {
            int intValue = ((Integer) bmxj.apply(list.get(i2))).intValue();
            if (i2 != i3 && i4 + intValue > y) {
                j.mo67668c(a.subList(i3, i2));
                i3 = i2;
                i4 = 0;
            } else {
                i2++;
                i4 += intValue;
            }
        }
        if (i3 < i2) {
            j.mo67668c(a.subList(i3, i2));
        }
        bnre i5 = j.mo67664a().listIterator();
        while (i5.hasNext()) {
            m46487b(context, (List) i5.next(), zra, zuu, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(caae, java.util.List, boolean):void
     arg types: [caae, bngx, int]
     candidates:
      zrc.a(caae, long, int):cadp
      zrc.a(caae, long, long):cadp
      zrc.a(caae, java.util.List, boolean):void */
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
     method: zrc.a(long, long, caae, boolean):void
     arg types: [long, long, caae, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      zrc.a(long, long, caae, boolean):void */
    /* renamed from: a */
    public final void mo31522a(zre zre, caae caae, String str, caaq caaq, yre yre) {
        long j;
        yre yre2 = yre;
        bngx bngx = yre2.f54482b;
        bngx.size();
        try {
            zre.mo31369a(caae, (List) bngx, false);
            this.f55929g.mo31531a(bngx);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f55924f.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zui", "a", 650, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("could not delete batch: %s", bngx.size());
        }
        bngx bngx2 = yre2.f54481a;
        bngx2.size();
        zre.mo31361a((List) bngx2, false);
        this.f55929g.mo31531a(bngx2);
        bnre i = yre2.f54484d.listIterator();
        while (i.hasNext()) {
            caat caat = (caat) i.next();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            caas caas = caat.f172375a;
            if (caas == null) {
                caas = caas.f172369b;
            }
            long nanos = timeUnit.toNanos(caas.f172371a);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            caas caas2 = caat.f172376b;
            if (caas2 == null) {
                caas2 = caas.f172369b;
            }
            zre.mo31367a(nanos, timeUnit2.toNanos(caas2.f172371a), caae, false);
            zum zum = this.f55929g;
            long j2 = zum.f55941a;
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            caas caas3 = caat.f172375a;
            if (caas3 == null) {
                caas3 = caas.f172369b;
            }
            zum.f55941a = Math.min(j2, timeUnit3.toNanos(caas3.f172371a));
            long j3 = zum.f55942b;
            TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
            caas caas4 = caat.f172376b;
            if (caas4 == null) {
                caas4 = caas.f172369b;
            }
            zum.f55942b = Math.max(j3, timeUnit4.toNanos(caas4.f172371a));
        }
        boolean a = zuq.m46516a(caae, caaq);
        long j4 = -1;
        if (str != null) {
            j = -1;
        } else {
            if (a) {
                j4 = zre.mo31372b(caae);
            }
            j = j4;
        }
        zre.mo31382a(new yqi(caae, this.f55926b.mo20505a(), j, yre2.f54486f));
    }

    /* renamed from: a */
    public final void mo31523a(zre zre, zuu zuu, caae caae, String str, caaq caaq) {
        yre yre;
        if (ceab.m135729b()) {
            String str2 = str;
            do {
                try {
                    yre = (yre) zuu.mo30702a(caae, str2).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
                    this.f55928d.mo31459b(yre.f54482b.size() + yre.f54481a.size());
                    mo31522a(zre, caae, str2, caaq, yre);
                    str2 = yre.f54486f;
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    zvj.m46564a(zvk.DOWNLOAD_CHANGE, e);
                    bnsl bnsl = (bnsl) f55924f.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("zui", "a", 553, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("Unable to list: %s pageToken: %s", caae.f172326b, str2);
                    throw yqh.m44583a(e);
                }
            } while (mo31524a(yre, caae));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo31524a(yre yre, caae caae) {
        caap caap = caap.WATCH;
        caap a = caap.m126421a(this.f55925a.f172360c);
        if (a == null) {
            a = caap.UNKNOWN;
        }
        if (caap.equals(a)) {
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (caah.f172336b.equals("com.google.internal.goal")) {
                return false;
            }
        }
        return yre.mo30686a();
    }
}
