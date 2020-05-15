package p000;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcb implements bfbx {

    /* renamed from: a */
    public final int f113359a;

    /* renamed from: b */
    public final int f113360b;

    /* renamed from: c */
    public final int f113361c;

    /* renamed from: d */
    private final bfaf f113362d;

    /* renamed from: e */
    private final long f113363e;

    public bfcb(bfaf bfaf, int i, int i2, int i3, long j) {
        this.f113362d = bfaf;
        this.f113359a = i;
        this.f113360b = i2;
        this.f113361c = i3;
        this.f113363e = j;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static final bnwe m96327a(Iterable r9, int i) {
        bnwd d = bnwd.m110619d();
        int size = r9.size();
        for (int i2 = 0; i2 < size; i2++) {
            d.mo68623a((bnwc) r9.get(i2));
        }
        bnvo a = bnvo.m110530a(bnvn.m110525c((double) i));
        bnvj bnvj = d.f132276a;
        double d2 = bnvj.f132220a;
        double d3 = bnvj.f132221b;
        bnvp bnvp = d.f132277b;
        double d4 = bnvp.f132234a;
        double d5 = bnvp.f132235b;
        d.mo68624a(bnvs.m110553a(bnwc.m110612a(d2, d4).mo68618e(), a).mo68575c());
        d.mo68624a(bnvs.m110553a(bnwc.m110612a(d2, d5).mo68618e(), a).mo68575c());
        d.mo68624a(bnvs.m110553a(bnwc.m110612a(d3, d4).mo68618e(), a).mo68575c());
        d.mo68624a(bnvs.m110553a(bnwc.m110612a(d3, d5).mo68618e(), a).mo68575c());
        return d.mo68626c();
    }

    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
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
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Collection, bfca]
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final Iterable mo61377a(Iterable r18) {
        bfah bfah;
        bupj bupj;
        bupj bupj2;
        bfae bfae;
        Throwable th;
        bnzb a;
        List list = r18;
        HashMap hashMap = new HashMap();
        int size = r18.size();
        for (int i = 0; i < size; i++) {
            bezl bezl = (bezl) list.get(i);
            hashMap.put(bezl.toString(), bezl);
        }
        bfaf bfaf = this.f113362d;
        bngx<String> a2 = bngx.m109355a(bnjd.m109575a((Iterable) list, bfbz.f113357a));
        long j = this.f113363e;
        try {
            ((bfbv) bfaf).f113349h.mo61313b(a2.size());
            ArrayList<String> arrayList = new ArrayList();
            ArrayList<String> arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (String str : a2) {
                a = bfbv.m96317a(j, str, ((bfbv) bfaf).f113347f);
                if (!((bfbv) bfaf).f113345d.contains(a)) {
                    bupy bupy = null;
                    if (((Integer) ((bfbv) bfaf).f113346e.get(a)) != null) {
                        bupy = (bupy) bxvk.m124014a(bupy.f154690c, ((bfbv) bfaf).f113348g.mo61372b(Files.readAllBytes(((bfbv) bfaf).mo61375b(a, j))));
                    }
                    if (bupy == null) {
                        arrayList.add(str);
                    } else {
                        arrayList3.add(bupy);
                    }
                } else {
                    arrayList2.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                ((bfbv) bfaf).f113349h.mo61315c(arrayList.size());
                bfaf bfaf2 = ((bfbv) bfaf).f113343b;
                bxvd da = bupp.f154663c.mo74144da();
                bupn bupn = ((bfag) bfaf2).f113233b;
                if (bupn != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bupn.getClass();
                    ((bupp) da.f164949b).f154665a = bupn;
                }
                for (String str2 : arrayList) {
                    bxvd da2 = bupw.f154682d.mo74144da();
                    bxvd da3 = bupx.f154687b.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ((bupx) da3.f164949b).f154689a = j;
                    bupx bupx = (bupx) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bupx.getClass();
                    ((bupw) da2.f164949b).f154686c = bupx;
                    bxvd da4 = bupj.f154644b.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    str2.getClass();
                    ((bupj) da4.f164949b).f154646a = str2;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bupw bupw = (bupw) da2.f164949b;
                    bupj bupj3 = (bupj) da4.mo74062i();
                    bupj3.getClass();
                    bupw.f154685b = bupj3;
                    bupw.f154684a = 5;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bupp bupp = (bupp) da.f164949b;
                    bupw bupw2 = (bupw) da2.mo74062i();
                    bupw2.getClass();
                    if (!bupp.f154666b.mo73666a()) {
                        bupp.f154666b = bxvk.m124021a(bupp.f154666b);
                    }
                    bupp.f154666b.add(bupw2);
                }
                bupp bupp2 = (bupp) da.mo74062i();
                try {
                    bfae = (bfae) ((bfag) bfaf2).f113232a.mo6445a();
                    bupq a3 = bfae.mo61340a(bupp2);
                    if (bfae != null) {
                        bfae.close();
                    }
                    if (a3.f154669a.size() == bupp2.f154666b.size()) {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (int i2 = 0; i2 < a3.f154669a.size(); i2++) {
                            bupo bupo = (bupo) a3.f154669a.get(i2);
                            bynx bynx = bupo.f154661a;
                            if (bynx == null) {
                                bynx = bynx.f167143b;
                            }
                            if (bynx.f167145a == chus.OK.f189211r) {
                                bupy bupy2 = bupo.f154662b;
                                if (bupy2 == null) {
                                    bupy2 = bupy.f154690c;
                                }
                                arrayList4.add(bupy2);
                            } else {
                                bynx bynx2 = bupo.f154661a;
                                if (bynx2 == null) {
                                    bynx2 = bynx.f167143b;
                                }
                                if (bynx2.f167145a == chus.NOT_FOUND.f189211r) {
                                    arrayList5.add((String) arrayList.get(i2));
                                } else {
                                    bynx bynx3 = bupo.f154661a;
                                    if (bynx3 == null) {
                                        bynx3 = bynx.f167143b;
                                    }
                                    String valueOf = String.valueOf(bynx3);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                                    sb.append("VoilaTile returned error: ");
                                    sb.append(valueOf);
                                    throw new IOException(sb.toString());
                                }
                            }
                        }
                        bfah = bfah.m96286a(arrayList4, arrayList5);
                        int i3 = 1;
                        if (!bfah.f113235b.isEmpty()) {
                            if (((bfbv) bfaf).f113345d.size() > 1000) {
                                ((bfbv) bfaf).f113345d.clear();
                                for (String str3 : arrayList2) {
                                    ((bfbv) bfaf).f113345d.add(bfbv.m96317a(j, str3, ((bfbv) bfaf).f113347f));
                                }
                            }
                            for (String str4 : bfah.f113235b) {
                                ((bfbv) bfaf).f113345d.add(bfbv.m96317a(j, str4, ((bfbv) bfaf).f113347f));
                            }
                            Path path = Paths.get(((bfbv) bfaf).f113344c, new String[0]);
                            if (Files.notExists(path, new LinkOption[0])) {
                                Files.createDirectories(path, new FileAttribute[0]);
                            }
                            Path path2 = Paths.get(path.toString(), bfbv.f113342a);
                            bfbu bfbu = ((bfbv) bfaf).f113348g;
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = ((bfbv) bfaf).f113345d.iterator();
                            while (it.hasNext()) {
                                sb2.append((bnzb) it.next());
                                sb2.append("\n");
                            }
                            Files.write(path2, bfbu.mo61371a(sb2.toString().getBytes(StandardCharsets.UTF_8)), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                        }
                        for (bupy bupy3 : bfah.f113234a) {
                            bupw bupw3 = bupy3.f154692a;
                            if (bupw3 == null) {
                                bupw3 = bupw.f154682d;
                            }
                            bupx bupx2 = bupw3.f154686c;
                            if (bupx2 == null) {
                                bupx2 = bupx.f154687b;
                            }
                            long j2 = bupx2.f154689a;
                            bupw bupw4 = bupy3.f154692a;
                            if (bupw4 == null) {
                                bupw4 = bupw.f154682d;
                            }
                            if (bupw4.f154684a == 5) {
                                bupj = (bupj) bupw4.f154685b;
                            } else {
                                bupj = bupj.f154644b;
                            }
                            bnzb a4 = bfbv.m96317a(j2, bupj.f154646a, ((bfbv) bfaf).f113347f);
                            String str5 = ((bfbv) bfaf).f113344c;
                            String[] strArr = new String[i3];
                            bupw bupw5 = bupy3.f154692a;
                            if (bupw5 == null) {
                                bupw5 = bupw.f154682d;
                            }
                            bupx bupx3 = bupw5.f154686c;
                            if (bupx3 == null) {
                                bupx3 = bupx.f154687b;
                            }
                            strArr[0] = Long.toString(bupx3.f154689a);
                            Path path3 = Paths.get(str5, strArr);
                            if (Files.notExists(path3, new LinkOption[0])) {
                                Files.createDirectories(path3, new FileAttribute[0]);
                            }
                            String path4 = path3.toString();
                            String[] strArr2 = new String[i3];
                            bupw bupw6 = bupy3.f154692a;
                            if (bupw6 == null) {
                                bupw6 = bupw.f154682d;
                            }
                            bupx bupx4 = bupw6.f154686c;
                            if (bupx4 == null) {
                                bupx4 = bupx.f154687b;
                            }
                            long j3 = bupx4.f154689a;
                            bupw bupw7 = bupy3.f154692a;
                            if (bupw7 == null) {
                                bupw7 = bupw.f154682d;
                            }
                            bfah bfah2 = bfah;
                            if (bupw7.f154684a == 5) {
                                bupj2 = (bupj) bupw7.f154685b;
                            } else {
                                bupj2 = bupj.f154644b;
                            }
                            strArr2[0] = bfbv.m96317a(j3, bupj2.f154646a, ((bfbv) bfaf).f113347f).toString();
                            Path path5 = Paths.get(path4, strArr2);
                            Files.write(path5, ((bfbv) bfaf).f113348g.mo61371a(bupy3.mo73642k()), StandardOpenOption.CREATE_NEW);
                            path5.toString();
                            ((bfbv) bfaf).f113346e.put(a4, Integer.valueOf((int) j));
                            bfah = bfah2;
                            i3 = 1;
                        }
                        arrayList2.addAll(bfah.f113235b);
                        arrayList3.addAll(bfah.f113234a);
                    } else {
                        throw new IOException("Invalid response from VoilaTile");
                    }
                } catch (chuw e) {
                    if (bmxi.m108538a(e.f189236a, chuv.f189220g)) {
                        bfah = bfah.m96286a(bngx.m109376e(), bngx.m109368a((Collection) arrayList));
                    } else {
                        throw new IOException("RPC call to VoilaTile failed", e);
                    }
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            bfah a5 = bfah.m96286a(arrayList3, arrayList2);
            ((bfbv) bfaf).mo61373a();
            return bngx.m109355a(bnjd.m109575a((Iterable) a5.f113234a, (bmxj) new bfca(hashMap)));
            throw th;
        } catch (IOException e2) {
            ((bfbv) bfaf).mo61374a(a, j);
        } catch (Throwable th3) {
            ((bfbv) bfaf).mo61373a();
            throw th3;
        }
    }
}
