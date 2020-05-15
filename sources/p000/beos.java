package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: beos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beos implements qwq {

    /* renamed from: a */
    public final blui f111955a;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0287, code lost:
        r0 = th;
     */
    public beos(beoq beoq) {
        boolean z;
        ArrayList arrayList;
        brzn brzn;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        beoq beoq2 = beoq;
        ArrayList arrayList4 = new ArrayList();
        synchronized (beoq2.f111952b) {
            Iterator it = beoq2.f111951a.values().iterator();
            while (true) {
                z = false;
                if (it.hasNext()) {
                    beon beon = (beon) it.next();
                    if (beon.f111943c.length > 0) {
                        i = 10;
                    } else {
                        i = 1;
                    }
                    HashMap hashMap = new HashMap(i);
                    beom beom = new beom(beon.f111942b, beon.f111943c);
                    synchronized (beon.f111941a) {
                        beom.f111939c = beon.f111944d;
                        beom.f111940d = beon.f111945e;
                        beon.f111944d = hashMap;
                        beon.f111945e = 0;
                    }
                    arrayList4.add(beom);
                }
            }
            while (true) {
            }
        }
        bxvd da = blui.f127810b.mo74144da();
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            beom beom2 = (beom) arrayList4.get(i2);
            if (beom2.f111940d != 0) {
                bxvd da2 = brzn.f143761e.mo74144da();
                long b = beoq.m95365b(beom2.f111937a);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                brzn brzn2 = (brzn) da2.f164949b;
                brzn2.f143763a |= 2;
                brzn2.f143764b = b;
                for (beol beol : beom2.f111938b) {
                    long b2 = beoq.m95365b(beol.f111935a);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z;
                    }
                    brzn brzn3 = (brzn) da2.f164949b;
                    if (!brzn3.f143765c.mo73666a()) {
                        brzn3.f143765c = bxvk.m124020a(brzn3.f143765c);
                    }
                    brzn3.f143765c.mo74161a(b2);
                }
                for (Map.Entry entry : beom2.f111939c.entrySet()) {
                    bxvd da3 = brzm.f143756d.mo74144da();
                    beoc beoc = (beoc) entry.getKey();
                    beod beod = (beod) entry.getValue();
                    if (beom2.f111938b.length > 0) {
                        String str = beom2.f111937a;
                        ArrayList arrayList5 = new ArrayList(beoc.f111925c.length);
                        int i3 = 0;
                        while (i3 < beoc.f111925c.length) {
                            bxvd da4 = brzk.f143748c.mo74144da();
                            Object obj = beoc.f111925c[i3];
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                brzk brzk = (brzk) da4.f164949b;
                                str2.getClass();
                                arrayList3 = arrayList4;
                                brzk.f143750a = 1;
                                brzk.f143751b = str2;
                            } else {
                                arrayList3 = arrayList4;
                                if (obj instanceof Integer) {
                                    int intValue = ((Integer) obj).intValue();
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    brzk brzk2 = (brzk) da4.f164949b;
                                    brzk2.f143750a = 2;
                                    brzk2.f143751b = Integer.valueOf(intValue);
                                } else if (obj instanceof Boolean) {
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    brzk brzk3 = (brzk) da4.f164949b;
                                    brzk3.f143750a = 3;
                                    brzk3.f143751b = Boolean.valueOf(booleanValue);
                                } else {
                                    String valueOf = String.valueOf(obj);
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(valueOf).length());
                                    sb.append("Metric ");
                                    sb.append(str);
                                    sb.append(" has field ");
                                    sb.append(i3);
                                    sb.append(" with an unexpected value: ");
                                    sb.append(valueOf);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                            arrayList5.add((brzk) da4.mo74062i());
                            i3++;
                            arrayList4 = arrayList3;
                        }
                        arrayList2 = arrayList4;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        brzm brzm = (brzm) da3.f164949b;
                        if (!brzm.f143759b.mo73666a()) {
                            brzm.f143759b = bxvk.m124021a(brzm.f143759b);
                        }
                        bxsy.m123078a(arrayList5, brzm.f143759b);
                    } else {
                        arrayList2 = arrayList4;
                    }
                    brzl a = beod.mo60845a();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    brzm brzm2 = (brzm) da3.f164949b;
                    a.getClass();
                    brzm2.f143760c = a;
                    brzm2.f143758a |= 1;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brzn brzn4 = (brzn) da2.f164949b;
                    brzm brzm3 = (brzm) da3.mo74062i();
                    brzm3.getClass();
                    if (!brzn4.f143766d.mo73666a()) {
                        brzn4.f143766d = bxvk.m124021a(brzn4.f143766d);
                    }
                    brzn4.f143766d.add(brzm3);
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                brzn = (brzn) da2.mo74062i();
            } else {
                arrayList = arrayList4;
                brzn = null;
            }
            if (brzn != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blui blui = (blui) da.f164949b;
                brzn.getClass();
                if (!blui.f127812a.mo73666a()) {
                    blui.f127812a = bxvk.m124021a(blui.f127812a);
                }
                blui.f127812a.add(brzn);
            }
            i2++;
            arrayList4 = arrayList;
            z = false;
        }
        this.f111955a = (blui) da.mo74062i();
        return;
        while (true) {
        }
    }

    /* renamed from: a */
    public final byte[] mo14930a() {
        return this.f111955a.mo73642k();
    }
}
