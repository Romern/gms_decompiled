package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ayxm */
final /* synthetic */ class ayxm implements ayvt {

    /* renamed from: a */
    private final ayxq f98682a;

    public ayxm(ayxq ayxq) {
        this.f98682a = ayxq;
    }

    /* renamed from: a */
    public final List mo54455a() {
        Throwable th;
        Throwable th2;
        Throwable th3;
        int i;
        boolean z;
        ayxq ayxq = this.f98682a;
        ayxt ayxt = ayxq.f98687b;
        bljb a = blkh.m107281a("GIL:CreateInsertGrafts");
        try {
            for (aywp aywp : ayxt.f98702a) {
                if (aywp.f98638c == -1) {
                    ayxt.mo54521a(aywp);
                }
            }
            ayxt.f98702a.clear();
            for (aywp aywp2 : ayxt.f98705d) {
                aywp2.f98638c = -1;
            }
            ayxt.f98705d.clear();
            if (a != null) {
                a.close();
            }
            bljb a2 = blkh.m107281a("GIL:CreateVisibilityGrafts");
            try {
                Iterator it = ayxt.f98703b.iterator();
                while (true) {
                    int i2 = 1;
                    if (it.hasNext()) {
                        aywp aywp3 = (aywp) it.next();
                        bmxy.m108605b(aywp3.mo54486c(), "Not impressed: %s", aywp3);
                        int d = aywp3.mo54487d();
                        bxvf bxvf = aywp3.f98639e;
                        int a3 = bpca.m111766a(((aywu) bxvf.f164949b).f98655d);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        if (a3 != d) {
                            int a4 = bpca.m111766a(((aywu) bxvf.f164949b).f98655d);
                            if (a4 == 0) {
                                a4 = 1;
                            }
                            int i3 = a4 - 1;
                            if (i3 == 2 || i3 == 4) {
                                if (d == 2) {
                                    continue;
                                } else {
                                    if (d != 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    bmxy.m108601b(z, "Repressed VE was visible.");
                                }
                            }
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            aywu aywu = (aywu) bxvf.f164949b;
                            aywu aywu2 = aywu.f98650f;
                            int i4 = d - 1;
                            if (d != 0) {
                                aywu.f98655d = i4;
                                aywu.f98652a |= 2;
                                ArrayList arrayList = new ArrayList();
                                ayxk.m85037a(aywp3, arrayList);
                                ayxs a5 = ayxt.mo54522a(arrayList, 0);
                                int a6 = bpca.m111766a(((aywu) arrayList.get(0)).f98655d);
                                if (a6 != 0) {
                                    if (a6 != 1) {
                                        a5.mo54520a(new ayye(3, arrayList, -1));
                                    }
                                }
                                a5.mo54520a(new ayye(2, arrayList, a5.f98699e.size()));
                                ayxr ayxr = new ayxr(a5);
                                bptu bptu = ((aywu) aywp3.f98639e.f164949b).f98654c;
                                if (bptu == null) {
                                    bptu = bptu.f139179e;
                                }
                                bptv bptv = bptu.f139184d;
                                if (bptv == null) {
                                    bptv = bptv.f139186d;
                                }
                                if ((bptv.f139188a & 2) != 0) {
                                    ayxr.mo54518a(aywp3);
                                }
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        ayxt.f98703b.clear();
                        if (a2 != null) {
                            a2.close();
                        }
                        if (!ayxt.f98706e.isEmpty()) {
                            bljb a7 = blkh.m107281a("GIL:CreateRemoveGrafts");
                            try {
                                for (Map.Entry entry : ayxt.f98706e.entrySet()) {
                                    Collection<aywu> collection = (Collection) entry.getValue();
                                    for (aywu aywu3 : collection) {
                                        aywp aywp4 = (aywp) entry.getKey();
                                        int a8 = bpca.m111766a(aywu3.f98655d);
                                        if (a8 != 0) {
                                            if (a8 != i) {
                                                i = 1;
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        bxvd bxvd = (bxvd) aywu3.mo74142c(5);
                                        bxvd.mo73625a((GeneratedMessageLite) aywu3);
                                        bxvf bxvf2 = (bxvf) bxvd;
                                        if (bxvf2.f164950c) {
                                            bxvf2.mo74035c();
                                            bxvf2.f164950c = false;
                                        }
                                        aywu aywu4 = (aywu) bxvf2.f164949b;
                                        aywu aywu5 = aywu.f98650f;
                                        aywu4.f98655d = i;
                                        aywu4.f98652a |= 2;
                                        arrayList2.add((aywu) bxvf2.mo74062i());
                                        if (aywp4 != null) {
                                            ayxk.m85037a(aywp4, arrayList2);
                                        }
                                        ayxt.mo54522a(arrayList2, 0).mo54520a(new ayye(3, arrayList2, -1));
                                        i = 1;
                                    }
                                    collection.clear();
                                    ayxt.f98707f = collection;
                                    i2 = 1;
                                }
                                if (a7 != null) {
                                    a7.close();
                                }
                                ayxt.f98706e.clear();
                            } catch (Throwable th4) {
                                bqye.m113761a(th3, th4);
                            }
                        }
                        if (ayxq.f98691f <= ayxq.f98689d) {
                            return ayxq.f98687b.mo54523a();
                        }
                        if (ayxq.f98692g != null) {
                            return null;
                        }
                        ayxq.f98692g = new ayxn(ayxq);
                        beel.m91853a(ayxq.f98692g, (long) (ayxq.f98691f - ayxq.f98689d));
                        return null;
                    }
                }
            } catch (Throwable th5) {
                bqye.m113761a(th2, th5);
            }
            throw th3;
            throw th;
            throw th2;
        } catch (Throwable th6) {
            bqye.m113761a(th, th6);
        }
    }
}
