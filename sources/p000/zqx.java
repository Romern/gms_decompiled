package p000;

import android.content.Context;
import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: zqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zqx implements yga {

    /* renamed from: b */
    public static final /* synthetic */ int f55726b = 0;

    /* renamed from: c */
    private static final srn f55727c = zvt.m46581a();

    /* renamed from: d */
    private static final yuw f55728d = yuq.m44880a(zqu.f55723a);

    /* renamed from: e */
    private static final yuw f55729e = yuq.m44881a(zqv.f55724a, zqw.f55725a);

    /* renamed from: m */
    private static final bnic f55730m = bnic.m109489a("com.google.activity.transition");

    /* renamed from: n */
    private static final bmyx f55731n = bmyx.m108640a(',').mo66917a();

    /* renamed from: a */
    public final zre f55732a;

    /* renamed from: f */
    private final Context f55733f;

    /* renamed from: g */
    private final zrk f55734g;

    /* renamed from: h */
    private final zgf f55735h;

    /* renamed from: i */
    private final yii f55736i;

    /* renamed from: j */
    private final zql f55737j;

    /* renamed from: k */
    private final yim f55738k;

    /* renamed from: l */
    private final caaq f55739l;

    private zqx(Context context, zre zre, zrk zrk, zql zql, zgf zgf, yim yim, yii yii, caaq caaq) {
        this.f55733f = context;
        this.f55732a = zre;
        this.f55734g = zrk;
        this.f55737j = zql;
        this.f55738k = yim;
        this.f55735h = zgf;
        this.f55736i = yii;
        this.f55739l = caaq;
    }

    /* renamed from: a */
    public static bnhe m45979a(String str) {
        bnha h = bnhe.m109414h();
        try {
            for (Map.Entry entry : zvr.m46577a(str).entrySet()) {
                h.mo67695b((String) entry.getKey(), bnic.m109488a(f55731n.mo66918a((CharSequence) entry.getValue())));
            }
            return h.mo67618b();
        } catch (IllegalArgumentException e) {
            return bnoj.f131912b;
        }
    }

    /* renamed from: b */
    private final bngx m45985b(List list, long j, long j2, int i, ygc ygc) {
        bngx bngx;
        long j3 = j;
        long j4 = j2;
        int i2 = i;
        ygc ygc2 = ygc;
        bngs j5 = bngx.m109377j();
        bngs j6 = bngx.m109377j();
        HashSet<caae> hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            caae caae = (caae) it.next();
            if (this.f55736i.mo30545a(caae)) {
                j5.mo67668c(this.f55736i.mo30546b(caae));
                hashSet.add(caae);
            } else if (ygc2.mo30461a(new yfr(caae))) {
                j6.mo67668c(caae);
            }
        }
        bngs b = bngx.m109371b(list.size());
        bngx a = j5.mo67664a();
        yhd a2 = yhe.m44086a();
        a2.mo30492b(j3);
        a2.mo30491a(j4);
        a2.f53814c = i2;
        yhe a3 = a2.mo30490a();
        bnhe a4 = mo31335a(ygc2.f53751b);
        bngs j7 = bngx.m109377j();
        yim yim = this.f55738k;
        yir yir = yim.f53869b;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        bngs j8 = bngx.m109377j();
        int size = a.size();
        int i3 = 0;
        while (i3 < size) {
            yln yln = (yln) a.get(i3);
            yim yim2 = yim;
            bnrd a5 = yir.f53876a.entrySet().iterator();
            while (a5.hasNext()) {
                Map.Entry entry = (Map.Entry) a5.next();
                bnrd bnrd = a5;
                if (((yln) entry.getValue()).equals(yln)) {
                    yiq a6 = yir.m44199a(hashMap, yln, a3, (caae) yir.f53877b.get(entry.getKey()));
                    yir.mo30548a(hashMap, hashMap2, new LinkedHashSet(), a6, a4, ygc);
                    j8.mo67668c(a6.mo30524a());
                    i3++;
                    b = b;
                    yim = yim2;
                    j7 = j7;
                    a3 = a3;
                    yir = yir;
                    size = size;
                    a4 = a4;
                    a = a;
                    hashMap = hashMap;
                } else {
                    a5 = bnrd;
                    hashMap = hashMap;
                    yim2 = yim2;
                    size = size;
                }
            }
            String valueOf = String.valueOf(yln.mo30564b());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown transformation ") : "Unknown transformation ".concat(valueOf));
        }
        yim yim3 = yim;
        bngs bngs = j7;
        bnhe bnhe = a4;
        bngs bngs2 = b;
        bngx a7 = j8.mo67664a();
        if (ypq.m44541a(Level.FINE)) {
            yin yin = new yin();
            int size2 = a7.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((yig) a7.get(i4)).mo30534a(yin);
            }
        }
        yfy yfy = new yfy();
        bnre i5 = a7.listIterator();
        while (i5.hasNext()) {
            ((yig) i5.next()).mo30534a(new yil(yfy, bnhe));
        }
        yfz a8 = yfy.mo30452a();
        if (a8.mo30454a().isEmpty() && !ygc2.f53751b) {
            bngx = bngx.m109356a((Object) bngx.m109376e());
        } else {
            zqy zqy = yim3.f53871d;
            boolean z = ygc2.f53751b;
            HashMap hashMap3 = new HashMap();
            zql zql = (zql) zqy;
            bnre i6 = zql.f55699a.mo31362a(a8).listIterator();
            while (i6.hasNext()) {
                cadp cadp = (cadp) i6.next();
                caae caae2 = cadp.f172713b;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                hashMap3.put(caae2, cadp);
            }
            for (caae caae3 : a8.mo30454a()) {
                if (!hashMap3.containsKey(caae3)) {
                    hashMap3.put(caae3, yyl.m45028a(caae3));
                }
            }
            bnha h = bnhe.m109414h();
            for (Map.Entry entry2 : hashMap3.entrySet()) {
                caae caae4 = (caae) entry2.getKey();
                h.mo67695b(caae4, zql.mo31331a((cadp) entry2.getValue(), a8.mo30455a(caae4), z));
            }
            bnhe b2 = h.mo67618b();
            b2.values();
            yiu yiu = yim3.f53870c;
            yik yik = yim3.f53868a;
            HashMap hashMap4 = new HashMap();
            bngs j9 = bngx.m109377j();
            int size3 = a7.size();
            for (int i7 = 0; i7 < size3; i7++) {
                j9.mo67668c(yiu.mo30549a(hashMap4, (yie) a7.get(i7), b2, yik));
            }
            bngx = j9.mo67664a();
        }
        bnre i8 = bngx.listIterator();
        while (i8.hasNext()) {
            for (yhz yhz : (List) i8.next()) {
                bngs.mo67668c(yhz.mo30522c());
            }
        }
        bngx a9 = bngs.mo67664a();
        bngs2.mo67666b((Iterable) a9);
        bnre i9 = a9.listIterator();
        while (i9.hasNext()) {
            caae caae5 = ((cadp) i9.next()).f172713b;
            if (caae5 == null) {
                caae5 = caae.f172323i;
            }
            hashSet.remove(caae5);
        }
        for (caae caae6 : hashSet) {
            bngs2.mo67668c(yyl.m45028a(caae6));
        }
        bnre i10 = j6.mo67664a().listIterator();
        while (i10.hasNext()) {
            caae caae7 = (caae) i10.next();
            zql zql2 = this.f55737j;
            boolean z2 = ygc2.f53751b;
            cadp a10 = zql2.f55699a.mo31365a(caae7, j, j2, i);
            yhd a11 = yhe.m44086a();
            a11.mo30492b(j);
            a11.mo30491a(j2);
            a11.f53814c = i;
            bngs2.mo67668c(zql2.mo31331a(a10, a11.mo30490a(), z2));
            bngs2 = bngs2;
        }
        return bngs2.mo67664a();
    }

    /* renamed from: a */
    private final bnic m45980a(caah caah, Map map, ynn ynn, int i) {
        bnia j = bnic.m109500j();
        if (i == 1) {
            j.mo67752b((Iterable) this.f55735h.mo19161b(caah));
        }
        bnrd a = this.f55736i.mo30544a().iterator();
        while (a.hasNext()) {
            caae caae = (caae) a.next();
            caah caah2 = caae.f172330f;
            if (caah2 == null) {
                caah2 = caah.f172333d;
            }
            if (bzzn.m126363a(caah2, caah)) {
                j.mo67629b(caae);
            }
        }
        if (i == 2) {
            bnia j2 = bnic.m109500j();
            ynn ynn2 = ynn.LOCAL_AND_REMOTE;
            for (Map.Entry entry : map.entrySet()) {
                caae caae2 = (caae) entry.getKey();
                boolean z = !((ygw) entry.getValue()).f53782b;
                if (caah != null) {
                    caah caah3 = caae2.f172330f;
                    if (caah3 == null) {
                        caah3 = caah.f172333d;
                    }
                    if (!bzzn.m126363a(caah, caah3)) {
                    }
                }
                if ((ynn == ynn2 || z || yhk.m44110a(caae2, this.f55739l)) && !yhj.m44108a(caae2)) {
                    j2.mo67629b(caae2);
                }
            }
            j.mo67752b((Iterable) j2.mo67751a());
        }
        return j.mo67751a();
    }

    /* renamed from: a */
    private final bnic m45981a(yqe yqe, Map map, yqe yqe2, int i) {
        return m45982a(yqe, map, yqe2, i, new HashSet());
    }

    /* renamed from: a */
    private final bnic m45982a(yqe yqe, Map map, yqe yqe2, int i, Set set) {
        caae caae;
        cadr cadr = yqe.f54381b;
        if ((cadr.f172719a & 1) != 0) {
            caae = cadr.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
        } else {
            caah caah = cadr.f172721c;
            if (caah == null) {
                caah = caah.f172333d;
            }
            caae = mo30459a(caah);
        }
        if (this.f55736i.mo30545a(caae)) {
            yln b = this.f55736i.mo30546b(caae);
            if (set.contains(b)) {
                return bnon.f131923a;
            }
            set.add(b);
            bnia j = bnic.m109500j();
            bnre i2 = b.mo30552a().listIterator();
            while (i2.hasNext()) {
                ygz ygz = (ygz) i2.next();
                bnia j2 = bnic.m109500j();
                bnia j3 = bnic.m109500j();
                caah a = bzzn.m126359a(ygz.f53800e);
                ygd ygd = ygz.f53801f;
                bnrd a2 = m45980a(a, map, ygz.f53803h, i).iterator();
                while (a2.hasNext()) {
                    caae caae2 = (caae) a2.next();
                    if (ygd.mo30462a(new yfr(caae2))) {
                        j3.mo67629b(caae2);
                    }
                }
                bnrd a3 = j3.mo67751a().iterator();
                while (a3.hasNext()) {
                    j2.mo67629b(m45983a(yqe, (caae) a3.next(), map, yqe2));
                }
                bnrd a4 = j2.mo67751a().iterator();
                while (a4.hasNext()) {
                    j.mo67752b((Iterable) m45982a((yqe) a4.next(), map, yqe2, i, set));
                }
            }
            return j.mo67751a();
        } else if (this.f55735h.mo19158a(caae)) {
            return i == 1 ? bnic.m109489a(m45983a(yqe, caae, map, yqe2)) : bnon.f131923a;
        } else {
            if (i == 2) {
                return bnic.m109489a(m45983a(yqe, caae, map, yqe2));
            }
            return bnon.f131923a;
        }
    }

    /* renamed from: a */
    private final yqe m45983a(yqe yqe, caae caae, Map map, yqe yqe2) {
        int i;
        caae caae2 = yqe.f54381b.f172720b;
        if (caae2 == null) {
            caae2 = caae.f172323i;
        }
        if (caae.equals(caae2)) {
            return yqe;
        }
        String str = yqe.f54380a;
        yyn yyn = new yyn(yqe.f54381b);
        yyn.f54825a = caae;
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        yyn.f54826b = caah;
        cadr a = yyn.mo30864a();
        if (!yhk.m44111a(caae, (ygw) map.get(caae), this.f55739l)) {
            i = 1;
        } else {
            i = 2;
        }
        return new yqe(str, a, i, yqe2.f54381b, -1);
    }

    /* renamed from: a */
    public static zqx m45984a(Context context, ceae ceae, zre zre, zrk zrk, zuu zuu, zgf zgf, yii yii, caaq caaq, Handler handler) {
        zqq zqq;
        if (cdzd.f182003a.mo6606a().mo78540G()) {
            zqq = new zqq(zre, handler, (int) cdzd.f182003a.mo6606a().mo78578b());
        } else {
            zqq = new zqr();
        }
        zql zql = new zql(zre, zuu, (int) ceab.m135732e(), TimeUnit.SECONDS, zqq);
        return new zqx(context, zre, zrk, zql, zgf, new yim(zql, yii, caaq, new yiu(), yik.f53865a), yii, caaq);
    }

    /* renamed from: b */
    public final bnic mo31338b() {
        bnia j = bnic.m109500j();
        bnhe a = mo31335a(true);
        bnrd a2 = this.f55734g.mo31396a().iterator();
        while (a2.hasNext()) {
            yqe yqe = (yqe) a2.next();
            j.mo67752b((Iterable) m45981a(yqe, a, yqe, 2));
        }
        return j.mo67751a();
    }

    /* renamed from: b */
    public final caae mo31339b(caah caah) {
        return (caae) bnjd.m109589b(this.f55735h.mo19161b(caah), (Object) null);
    }

    /* renamed from: a */
    public final bngx mo30456a(long j, long j2) {
        return this.f55732a.mo31392a(null, null, null, j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r5.f172301b.equals("com.google.android.gms") != false) goto L_0x0059;
     */
    /* renamed from: a */
    public final bngx mo30457a(List list, long j, long j2, int i, ygc ygc) {
        if (cdzj.m135639b().isEmpty()) {
            return m45985b(list, j, j2, i, ygc);
        }
        bngs b = bngx.m109371b(list.size());
        bngs j3 = bngx.m109377j();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            caae caae = (caae) it.next();
            String str = ygc.f53750a;
            if (!rfz.m33557a(this.f55733f).mo24610b(str)) {
                if (!cdzj.f182077a.mo6606a().mo78606a()) {
                    bzzz bzzz = caae.f172332h;
                    if (bzzz == null) {
                        bzzz = bzzz.f172298f;
                    }
                }
                bnhe bnhe = (bnhe) f55729e.mo30787a();
                caah caah = caae.f172330f;
                if (caah == null) {
                    caah = caah.f172333d;
                }
                bnic bnic = (bnic) bnhe.get(caah.f172336b);
                if (bnic != null && !bnic.contains(str)) {
                    j3.mo67668c(caae);
                }
            }
            b.mo67668c(caae);
        }
        bngx a = b.mo67664a();
        bngx a2 = j3.mo67664a();
        bngs b2 = bngx.m109371b(list.size());
        if (!a.isEmpty()) {
            b2.mo67666b((Iterable) m45985b(a, j, j2, i, ygc));
        }
        bnre i2 = a2.listIterator();
        while (i2.hasNext()) {
            b2.mo67668c(yyl.m45028a((caae) i2.next()));
        }
        return b2.mo67664a();
    }

    /* renamed from: a */
    public final bnhe mo31335a(boolean z) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f55732a.mo31389i().entrySet()) {
            if (!yhj.m44108a((caae) entry.getKey())) {
                hashMap.put((caae) entry.getKey(), (ygw) entry.getValue());
            }
        }
        if (z) {
            for (Map.Entry entry2 : this.f55732a.mo31390j().entrySet()) {
                caae caae = (caae) entry2.getKey();
                long longValue = ((Long) entry2.getValue()).longValue();
                if (!yhj.m44108a(caae) && !hashMap.containsKey(caae) && !this.f55736i.mo30545a(caae)) {
                    hashMap.put(caae, new ygw(longValue, true, 0, 0, 0));
                }
            }
        }
        return bnhe.m109413a(hashMap);
    }

    /* renamed from: a */
    public final bnic mo31336a() {
        bnia j = bnic.m109500j();
        j.mo67752b((Iterable) this.f55732a.mo31388h());
        j.mo67752b((Iterable) this.f55736i.mo30544a());
        return j.mo67751a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zqt]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bnic, zqs]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final bnic mo31337a(yqe yqe) {
        Map i = this.f55732a.mo31389i();
        bnic bnic = (bnic) f55728d.mo30787a();
        bnic a = m45981a(yqe, i, yqe, 1);
        String str = yyo.m45042a(yqe.f54381b).f172336b;
        if (!cdyu.f181962a.mo6606a().mo78520x()) {
            return !bnic.contains(str) ? bnic.m109488a(bnjd.m109586b((Iterable) a, (bmxz) new zqt(bnic))) : a;
        }
        return bnic.m109488a(bnjd.m109586b((Iterable) a, (bmxz) new zqs(str, bnic)));
    }

    /* renamed from: a */
    public final caae mo30458a(caae caae, String str) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        if (!this.f55736i.mo30545a(caae)) {
            bnre i = this.f55735h.mo19161b(caah).listIterator();
            while (i.hasNext()) {
                caae caae2 = (caae) i.next();
                if (yxw.m44961a(caae2, caae, str)) {
                    return caae2;
                }
            }
            for (caae caae3 : this.f55732a.mo31389i().keySet()) {
                if (yxw.m44961a(caae3, caae, str)) {
                    return caae3;
                }
            }
        }
        return caae;
    }

    /* renamed from: a */
    public final caae mo30459a(caah caah) {
        Object obj;
        caae caae = (caae) this.f55736i.f53864c.get(caah.f172336b);
        if (caae != null || (caae = mo31339b(caah)) != null) {
            return caae;
        }
        try {
            bnic a = m45980a(caah, this.f55732a.mo31389i(), ynn.LOCAL_AND_REMOTE, 2);
            if (!a.isEmpty()) {
                return (caae) a.iterator().next();
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55727c.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Couldn't read default data source from DB");
        }
        if (!f55730m.contains(caah.f172336b)) {
            if (bzzn.m126366b(caah.f172336b)) {
                obj = bryx.m114908a(caah.f172336b);
            } else {
                obj = caah.f172336b;
            }
            ((bnsl) f55727c.mo68387b()).mo68420a("No default data source found for %s, creating a fake one", obj);
        }
        yyc a2 = yyd.m44987a();
        a2.mo30856a(caad.DERIVED);
        a2.mo30857a(caah);
        return a2.mo30854a();
    }
}
