package p000;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: yir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yir {

    /* renamed from: a */
    public final bnhe f53876a;

    /* renamed from: b */
    public final bnhe f53877b;

    /* renamed from: c */
    private final caaq f53878c;

    public yir(yii yii, caaq caaq) {
        this.f53878c = caaq;
        this.f53876a = yii.f53862a;
        this.f53877b = yii.f53863b;
    }

    /* renamed from: a */
    public static yiq m44199a(Map map, yln yln, yhe yhe, caae caae) {
        yie yie = (yie) map.get(yln);
        if (yie != null) {
            yie.f53856b = yie.f53856b.mo30493a(yhe);
            return yiq.m44196a(yie, false);
        }
        yie yie2 = new yie(yln, yhe, caae);
        map.put(yln, yie2);
        return yiq.m44196a(yie2, true);
    }

    /* renamed from: a */
    private static boolean m44200a(ygz ygz, caae caae, boolean z) {
        return (!z || ygz.f53803h == ynn.LOCAL_AND_REMOTE) && ygz.f53801f.mo30462a(new yfr(caae));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.LinkedHashSet, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x030b A[Catch:{ all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0317 A[Catch:{ all -> 0x0346 }] */
    /* renamed from: a */
    public final yip mo30548a(Map map, Map map2, LinkedHashSet linkedHashSet, yiq yiq, Map map3, ygc ygc) {
        caah caah;
        boolean z;
        long j;
        HashMap hashMap;
        caah caah2;
        Map map4;
        yip yip;
        HashMap hashMap2;
        boolean z2;
        caae caae;
        ygw ygw;
        long j2;
        Map map5 = map2;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        HashMap hashMap3 = new HashMap();
        yln yln = yiq.mo30524a().f53855a;
        yhe yhe = yiq.mo30524a().f53856b;
        linkedHashSet2.add(yln);
        try {
            bnre i = yln.mo30552a().listIterator();
            while (i.hasNext()) {
                ygz ygz = (ygz) i.next();
                HashMap hashMap4 = new HashMap();
                caah a = bzzn.m126359a(ygz.f53800e);
                for (Map.Entry entry : map3.entrySet()) {
                    caae caae2 = (caae) entry.getKey();
                    ygw ygw2 = (ygw) entry.getValue();
                    if (!yhj.m44108a(caae2)) {
                        String str = a.f172336b;
                        caah caah3 = caae2.f172330f;
                        if (caah3 == null) {
                            caah3 = caah.f172333d;
                        }
                        if (str.equals(caah3.f172336b) && m44200a(ygz, caae2, yhk.m44111a(caae2, ygw2, this.f53878c))) {
                            hashMap4.put(caae2.f172326b, caae2);
                        }
                    }
                }
                bnrd a2 = this.f53876a.entrySet().iterator();
                while (a2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) a2.next();
                    caae caae3 = (caae) this.f53877b.get(entry2.getKey());
                    yln yln2 = (yln) entry2.getValue();
                    caah caah4 = caae3.f172330f;
                    if (caah4 == null) {
                        caah4 = caah.f172333d;
                    }
                    if (bzzn.m126363a(a, caah4) && m44200a(ygz, caae3, false)) {
                        if (!linkedHashSet2.contains(yln2)) {
                            hashMap4.put(caae3.f172326b, caae3);
                        } else if (((Boolean) yno.f54167ad.mo58455c()).booleanValue()) {
                            String b = yln2.mo30564b();
                            String valueOf = String.valueOf(bnjd.m109575a((Iterable) linkedHashSet2, yio.f53873a));
                            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 41 + String.valueOf(valueOf).length());
                            sb.append("Cycle detected in transformation graph: ");
                            sb.append(b);
                            sb.append(" ");
                            sb.append(valueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
                for (caae caae4 : hashMap4.values()) {
                    caah caah5 = caae4.f172330f;
                    if (caah5 != null) {
                        caah = caah5;
                    } else {
                        caah = caah.f172333d;
                    }
                    if (!ygz.f53802g || !hashMap3.containsKey(caah.f172336b)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        j = ((yip) hashMap3.get(caah.f172336b)).f53875b;
                    } else {
                        j = yhe.mo30494b();
                    }
                    yhd a3 = yhe.m44086a();
                    a3.mo30492b(yhe.mo30494b());
                    a3.mo30491a(yhe.mo30495c());
                    a3.f53814c = yhe.f53820b;
                    a3.f53815d = yhe.f53821c;
                    a3.mo30492b(j);
                    yhe a4 = a3.mo30490a();
                    ygw ygw3 = (ygw) map3.get(caae4);
                    boolean containsKey = this.f53876a.containsKey(caae4.f172326b);
                    caah caah6 = caah;
                    long c = a4.mo30495c();
                    yhe yhe2 = yhe;
                    bnre bnre = i;
                    if (!containsKey) {
                        if (!ygc.mo30461a(new yfr(caae4))) {
                            hashMap = hashMap3;
                            caah2 = caah6;
                            map4 = map5;
                            yip = new yip();
                            hashMap2 = hashMap;
                            if (!hashMap2.containsKey(caah2.f172336b)) {
                                ((yip) hashMap2.get(caah2.f172336b)).mo30547a(yip);
                            } else if (yip.f53875b > 0) {
                                hashMap2.put(caah2.f172336b, yip);
                                map5 = map4;
                                hashMap3 = hashMap2;
                                yhe = yhe2;
                                i = bnre;
                            }
                            map5 = map4;
                            hashMap3 = hashMap2;
                            yhe = yhe2;
                            i = bnre;
                        } else {
                            c = ygw3 != null ? Math.min(c, ygw3.mo30469b()) : 0;
                        }
                    }
                    int max = Math.max(a4.f53821c, ygz.f53798c);
                    hashMap = hashMap3;
                    boolean z3 = ygz.f53797b > 0 || ygz.f53799d.mo66813a();
                    if (a4.mo30494b() < c || max > 0 || z3) {
                        if (z) {
                            if (a4.mo30494b() == c) {
                                if (!z3) {
                                    caah2 = caah6;
                                    map4 = map5;
                                    yip = new yip();
                                    hashMap2 = hashMap;
                                    if (!hashMap2.containsKey(caah2.f172336b)) {
                                    }
                                    map5 = map4;
                                    hashMap3 = hashMap2;
                                    yhe = yhe2;
                                    i = bnre;
                                }
                            }
                        }
                        long j3 = ygz.f53796a;
                        if (ygz.f53799d.mo66813a()) {
                            caae = caae4;
                            j2 = ((yhs) ygz.f53799d.mo66814b()).mo30502a(a4.mo30494b());
                            ygw = ygw3;
                            z2 = containsKey;
                        } else {
                            caae = caae4;
                            ygw = ygw3;
                            z2 = containsKey;
                            j2 = Math.max(0L, a4.mo30494b() - ygz.f53797b);
                        }
                        long d = bqbs.m112528d(c, j3);
                        yhd a5 = yhe.m44086a();
                        a5.mo30492b(j2);
                        a5.mo30491a(d);
                        a5.f53814c = a4.f53820b;
                        a5.f53815d = max;
                        yhe a6 = a5.mo30490a();
                        if (z2) {
                            yiq a7 = m44199a(map, (yln) this.f53876a.get(caae.f172326b), a6, caae);
                            if (yiq.mo30525b()) {
                                yiq.mo30524a().mo30536a(a7.mo30524a());
                            }
                            caah2 = caah6;
                            yip = mo30548a(map, map2, linkedHashSet, a7, map3, ygc);
                            map4 = map2;
                        } else {
                            caah2 = caah6;
                            caae caae5 = caae;
                            if (!yiq.mo30525b()) {
                                map4 = map2;
                            } else {
                                map4 = map2;
                                if (map4.containsKey(caae5)) {
                                    yid yid = (yid) map4.get(caae5);
                                    yid.f53854b = yid.f53854b.mo30493a(a6);
                                    yiq.mo30524a().mo30536a(yid);
                                } else {
                                    yid yid2 = new yid(caae5, a6);
                                    map4.put(caae5, yid2);
                                    yiq.mo30524a().mo30536a(yid2);
                                }
                            }
                            yip = new yip(ygw.mo30468a(), c);
                        }
                        hashMap2 = hashMap;
                        if (!hashMap2.containsKey(caah2.f172336b)) {
                        }
                        map5 = map4;
                        hashMap3 = hashMap2;
                        yhe = yhe2;
                        i = bnre;
                    } else {
                        caah2 = caah6;
                        map4 = map5;
                        yip = new yip();
                        hashMap2 = hashMap;
                        if (!hashMap2.containsKey(caah2.f172336b)) {
                        }
                        map5 = map4;
                        hashMap3 = hashMap2;
                        yhe = yhe2;
                        i = bnre;
                    }
                }
                linkedHashSet2 = linkedHashSet;
            }
            linkedHashSet2.remove(yln);
            yip yip2 = new yip();
            for (yip yip3 : hashMap3.values()) {
                yip2.mo30547a(yip3);
            }
            return yip2;
        } catch (Throwable th) {
            linkedHashSet.remove(yln);
            throw th;
        }
    }
}
