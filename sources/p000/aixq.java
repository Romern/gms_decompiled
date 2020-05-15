package p000;

import android.content.Intent;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;

/* renamed from: aixq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aixq extends buqn {

    /* renamed from: a */
    final /* synthetic */ ajgp f70008a;

    /* renamed from: b */
    final /* synthetic */ bvae f70009b;

    /* renamed from: c */
    final /* synthetic */ aixs f70010c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aixq(aixs aixs, String str, ajgp ajgp, bvae bvae) {
        super(str);
        this.f70010c = aixs;
        this.f70008a = ajgp;
        this.f70009b = bvae;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection], assign insn: 0x05eb: IGET  (r1v2 ? I:java.util.Collection) = (r1v1 ajai) ajai.k java.util.Collection */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.Collection], assign insn: 0x008c: IGET  (r1v4 ? I:java.util.Collection) = (r1v3 ajai) ajai.k java.util.Collection */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhe.a(double, int):int
     arg types: [int, int]
     candidates:
      nhe.a(int, int):int
      nhe.a(double, int):int */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0328, code lost:
        if (r9 < (r10.f70212h.intValue() - r10.f70206b.intValue())) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03b0, code lost:
        if (r14 > (r12 + r4)) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        if (r12 == 1) goto L_0x01a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01bf  */
    public final void run() {
        ajag ajag;
        byys byys;
        aizv aizv;
        buyw buyw;
        nek nek;
        ajag ajag2;
        byys byys2;
        double d;
        int i;
        int i2;
        ajag ajag3;
        int i3;
        int i4;
        int a;
        buyw buyw2;
        nek nek2;
        byte[] a2;
        boolean z;
        String str;
        int i5;
        byyr byyr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double d2;
        int i12;
        int i13;
        double d3;
        double d4;
        Integer num;
        byyr byyr2;
        bgfc a3;
        aixs aixs = this.f70010c;
        ajgp ajgp = this.f70008a;
        buyw buyw3 = this.f70009b.f155477d;
        if (buyw3 == null) {
            buyw3 = buyw.f155343h;
        }
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int a4 = buzd.m120800a(buyw3.f155350f);
        if (a4 == 0) {
            a4 = 1;
        }
        int i14 = a4 - 1;
        int i15 = 3;
        if (i14 == 1) {
            buzq buzq = buyw3.f155346b;
            if (buzq == null) {
                buzq = buzq.f155418c;
            }
            ahfv a5 = aiyu.m58240a(nek.m26028a(buzq.f155421b.mo73780k()));
            if (a5 != null) {
                ajgp.mo38311a(a5, aixs.m58132a(bzbu.BLE_ADVERTISING_PACKET, a5));
            }
            ajai ajai = aixs.f70020g;
            ajai.f70251l.mo72984b();
            buzu buzu = buyw3.f155347c;
            if (buzu == null) {
                buzu = buzu.f155430c;
            }
            String a6 = bvau.m120845a(buzu.f155433b.mo73780k());
            buzq buzq2 = buyw3.f155346b;
            if (buzq2 == null) {
                buzq2 = buzq.f155418c;
            }
            aizv a7 = aizv.m58305a(buzq2.f155421b.mo73780k());
            ajai.f70251l.mo72984b();
            ajag ajag4 = (ajag) ajai.f70246g.get(a6);
            if (ajag4 == null) {
                if (ajai.f70246g.size() < ajai.f70245f) {
                    ajag4 = new ajag(SystemClock.elapsedRealtime(), a6);
                    ajai.f70246g.put(a6, ajag4);
                } else {
                    srn srn = ahfq.f67120a;
                    ajai.f70246g.size();
                }
            }
            if (ajag4 != null) {
                ajag = new ajag(ajag4);
            } else {
                ajag = null;
            }
            if (ajag != null) {
                buzq buzq3 = buyw3.f155346b;
                if (buzq3 == null) {
                    buzq3 = buzq.f155418c;
                }
                nek a8 = nek.m26028a(buzq3.f155421b.mo73780k());
                ney a9 = ajai.f70242c.mo20560a(a8);
                if (ahfo.m55646a(ajai.f70243d) && a9 == null) {
                    a9 = ahfo.m55650b(a8.mo20526a(ahfo.f67117a)) ? ajai.f70240a : null;
                }
                if (a9 != null && a9.mo20557c()) {
                    int a10 = a9.mo20552a();
                    if (a10 == 1) {
                        i15 = 2;
                    } else if (a10 != 2) {
                        i15 = a10 != 3 ? a10 != 106 ? 1 : 107 : 5;
                    }
                    if (aixs.m58136a(ajai.f70243d, ajai.f70244e, i15)) {
                        byys = aizs.m58300a(i15, a9.mo20554a(a8));
                        if ((byys.f169004a & 2) != 0) {
                            int a11 = bzaj.m125580a(byys.f169005b);
                            if (a11 == 0) {
                                byys = null;
                            }
                            double d5 = Double.NaN;
                            if ((buyw3.f155345a & 8) != 0) {
                                buyw = buyw3;
                                aizv = a7;
                                byys2 = byys;
                                ajag2 = ajag;
                                nek = a8;
                                d = Double.NaN;
                                i2 = Integer.MIN_VALUE;
                                i = Integer.MIN_VALUE;
                            } else {
                                if (byys != null) {
                                    if (!ajai.f70248i.containsKey(byys)) {
                                        ajaf ajaf = ajai.f70249j;
                                        ajae ajae = new ajae(byys);
                                        if (!ajaf.mo38365c() || (a3 = ajaf.mo38357a(ajae)) == null) {
                                            byyr2 = null;
                                        } else {
                                            byyr2 = a3.f116339d;
                                            if (byyr2 == null) {
                                                byyr2 = byyr.f168996d;
                                            }
                                        }
                                        if (byyr2 != null) {
                                            ajai.f70248i.put(byys, byyr2);
                                        }
                                    }
                                    byyr = (byyr) ajai.f70248i.get(byys);
                                } else {
                                    byyr = null;
                                }
                                if (byyr == null || (byyr.f168998a & 2) == 0) {
                                    if (a9 != null) {
                                        num = a9.mo20555b(a8);
                                    } else {
                                        num = null;
                                    }
                                    if (num == null) {
                                        num = Integer.valueOf(BleSignalImpl.m67401b(a8.f35400c));
                                    }
                                    i6 = BleSignalImpl.m67400a(num.intValue());
                                } else {
                                    i6 = BleSignalImpl.m67401b(byyr.f169000c);
                                }
                                if (byyr == null || (byyr.f168998a & 2) == 0) {
                                    byys2 = byys;
                                    i7 = ((int) cfop.f185115a.mo6606a().mo82220X()) + i6;
                                } else {
                                    byys2 = byys;
                                    i7 = i6;
                                }
                                ajag2 = ajag;
                                int P = (int) cfop.f185115a.mo6606a().mo82212P();
                                int i16 = buyw3.f155349e;
                                aizw aizw = ajai.f70241b;
                                int i17 = i16 + P;
                                if (i7 != Integer.MIN_VALUE) {
                                    i8 = i7;
                                } else {
                                    i8 = -77;
                                }
                                aizz aizz = aizw.f70196a;
                                String str2 = aizz.f70211g;
                                int a12 = nhe.m26253a(i17, i8);
                                double b = nhe.m26254b(i17, i8);
                                int a13 = nhe.m26251a(b);
                                if (aizz.f70213i.get(a6) == null) {
                                    aizz.f70213i.put(a6, new aizy());
                                }
                                aizy aizy = (aizy) aizz.f70213i.get(a6);
                                double d6 = (double) i17;
                                int i18 = i6;
                                nek = a8;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                aizy.f70202d = d6;
                                buyw = buyw3;
                                aizv = a7;
                                int i19 = P;
                                if (!aizy.f70204f) {
                                    long j = elapsedRealtime - aizy.f70201c;
                                    i10 = i7;
                                    i9 = a12;
                                    int i20 = aizy.f70203e < d6 ? aizy.f70199a : aizy.f70200b;
                                    if (i20 != 0) {
                                        double d7 = (double) j;
                                        double d8 = (double) i20;
                                        Double.isNaN(d7);
                                        Double.isNaN(d8);
                                        double d9 = d7 / d8;
                                        d4 = 1.0d;
                                        d3 = Math.min(d9, 1.0d);
                                    } else {
                                        d4 = 1.0d;
                                        d3 = 1.0d;
                                    }
                                    d6 = ((d4 - d3) * aizy.f70203e) + (aizy.f70202d * d3);
                                    aizy.f70203e = d6;
                                } else {
                                    i10 = i7;
                                    i9 = a12;
                                    aizy.f70203e = d6;
                                    aizy.f70204f = false;
                                }
                                aizy.f70201c = elapsedRealtime;
                                int i21 = (int) d6;
                                if (b >= 1.0d) {
                                    i11 = nhe.m26253a(i21, i8);
                                } else {
                                    i11 = i9;
                                }
                                if (b >= 1.0d) {
                                    d2 = nhe.m26254b(i21, i8);
                                } else {
                                    d2 = b;
                                }
                                if (b >= 1.0d) {
                                    i12 = nhe.m26251a(d2);
                                } else {
                                    i12 = a13;
                                }
                                if (a6.equals(str2)) {
                                    if (a13 != 0) {
                                        aizz.f70211g = null;
                                        aizz.f70212h = 0;
                                    } else {
                                        aizz.f70212h = Integer.valueOf(i9);
                                    }
                                } else if (a13 == 0) {
                                    if (aizz.f70211g != null) {
                                        i13 = i9;
                                    } else {
                                        i13 = i9;
                                    }
                                    aizz.f70211g = a6;
                                    aizz.f70212h = Integer.valueOf(i13);
                                }
                                if (!aizz.f70205a.containsKey(a6)) {
                                    aizz.f70205a.put(a6, new aizx(i12, d2));
                                } else {
                                    aizx aizx = (aizx) aizz.f70205a.get(a6);
                                    int i22 = aizx.f70197a;
                                    aizx.f70198b = d2;
                                    double a14 = (double) nhe.m26253a(nhe.m26252a(0.5d, i8), i8);
                                    double a15 = (double) nhe.m26253a(nhe.m26252a(2.0d, i8), i8);
                                    if (i12 != i22) {
                                        if (i22 == 0) {
                                            aizx aizx2 = aizx;
                                            double d10 = (double) i11;
                                            double intValue = (double) aizz.f70209e.intValue();
                                            Double.isNaN(a14);
                                            Double.isNaN(intValue);
                                            if (d10 > a14 + intValue) {
                                                aizx2.f70197a = i12;
                                            }
                                        } else if (i22 == 1) {
                                            double d11 = (double) i11;
                                            aizx aizx3 = aizx;
                                            double intValue2 = (double) aizz.f70207c.intValue();
                                            Double.isNaN(a14);
                                            Double.isNaN(intValue2);
                                            if (d11 >= a14 - intValue2) {
                                                double intValue3 = (double) aizz.f70210f.intValue();
                                                Double.isNaN(a15);
                                                Double.isNaN(intValue3);
                                            }
                                            aizx3.f70197a = i12;
                                        } else if (i22 == 2) {
                                            double intValue4 = (double) aizz.f70208d.intValue();
                                            Double.isNaN(a15);
                                            Double.isNaN(intValue4);
                                            if (((double) i11) < a15 - intValue4) {
                                                aizx.f70197a = i12;
                                            }
                                        }
                                    }
                                }
                                i2 = ((int) ((aizy) ajai.f70241b.f70196a.f70213i.get(a6)).f70203e) - i19;
                                aizw aizw2 = ajai.f70241b;
                                if (i10 != Integer.MIN_VALUE) {
                                    aizz aizz2 = aizw2.f70196a;
                                    d5 = aizz2.f70205a.containsKey(a6) ? ((aizx) aizz2.f70205a.get(a6)).f70198b : 0.0d;
                                }
                                d = d5;
                                i = i18;
                            }
                            if (Double.isNaN(d)) {
                                ajag3 = ajag2;
                                double d12 = ajag3.f70237g;
                                if ((!Double.isNaN(d12) || !Double.isNaN(d)) && (Double.isNaN(d12) || Double.isNaN(d) || Math.abs(d12 - d) >= cfop.f185115a.mo6606a().mo82237p())) {
                                    ajag3.f70237g = d;
                                    i3 = 4;
                                    BleSignalImpl bleSignalImpl = i2 != Integer.MIN_VALUE ? new BleSignalImpl(1, i2, i) : null;
                                    if (((long) ajag3.f70235e.size()) >= cfop.f185115a.mo6606a().mo82247z()) {
                                        ajag3.f70235e.remove((aizv) ajag3.f70235e.keySet().iterator().next());
                                        srn srn2 = ahfq.f67120a;
                                        i4 = 64;
                                    } else {
                                        i4 = 0;
                                    }
                                    a = i3 | i4 | ajag.m58331a(aizv, bleSignalImpl, ajag3.f70235e, 32);
                                    if (a9 != null) {
                                        if (aixs.m58136a(ajai.f70243d, ajai.f70244e, (int) ErrorInfo.TYPE_SDU_FAILED)) {
                                            nek2 = nek;
                                            str = a9.mo20559d(nek2);
                                        } else {
                                            nek2 = nek;
                                            str = null;
                                        }
                                        a |= ajai.mo38382a(ajag3, bleSignalImpl, byys2, str, a9.mo20558c(nek2));
                                        if (byys2 != null) {
                                            byys byys3 = byys2;
                                            int a16 = bzaj.m125580a(byys3.f169005b);
                                            if (a16 == 0) {
                                                buyw2 = buyw;
                                            } else if (a16 == 107) {
                                                byys byys4 = byys3;
                                                a |= ajai.mo38382a(ajag3, bleSignalImpl, ajag3.mo38379i(), null, null);
                                                if (ajai.m58348a(a, 1)) {
                                                    buyw2 = buyw;
                                                    int b2 = bzal.m125583b(buyw2.f155351g);
                                                    if (b2 != 0) {
                                                        i5 = b2;
                                                    } else {
                                                        i5 = 1;
                                                    }
                                                    ajai.mo38389a(a6, i2, i, d, byys4, i5);
                                                }
                                            } else {
                                                buyw2 = buyw;
                                            }
                                        } else {
                                            buyw2 = buyw;
                                        }
                                        if (ahfo.m55646a(ajai.f70243d) && !cfoj.m141550ae()) {
                                            a2 = ahfo.m55649a(nek2.mo20526a(ahfo.f67117a), 0);
                                            if (a2 != null) {
                                                a2 = ahfo.m55657e(nek2);
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (a2 != null) {
                                                byte[] g = ahfo.m55659g(nek2);
                                                int i23 = i;
                                                int i24 = i2;
                                                ajai.f70243d.startService(new Intent("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BLOOM_FILTER_DETECTED").setClassName("com.google.android.gms", "com.google.android.gms.nearby.discovery.service.DiscoveryService").putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER", a2).putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SUPPRESS_NOTIFICATION", z).putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SALT", ahfo.m55649a(nek2.mo20526a(ahfo.f67117a), 1)).putExtra("com.google.android.gms.nearby.discovery.BATTERY_VALUES", (g != null && g.length > 0) ? g : ahfo.m55658f(nek2)).putExtra("com.google.android.gms.nearby.discovery.BATTERY_SUPPRESS_NOTIFICATION", g != null && g.length > 0).putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", a6).putExtra("com.google.android.gms.nearby.discovery.DISTANCE_ESTIMATE", d));
                                                if (cfop.f185115a.mo6606a().mo82246y() && d <= ((double) cfop.f185115a.mo6606a().mo82245x())) {
                                                    a |= ajai.mo38382a(ajag3, bleSignalImpl, ajag3.mo38379i(), null, null);
                                                    int i25 = 1;
                                                    if (ajai.m58348a(a, 1)) {
                                                        byys i26 = ajag3.mo38379i();
                                                        int b3 = bzal.m125583b(buyw2.f155351g);
                                                        if (b3 != 0) {
                                                            i25 = b3;
                                                        }
                                                        ajai.mo38389a(a6, i24, i23, d, i26, i25);
                                                    }
                                                    ajai.f70251l.mo72984b();
                                                    ajag ajag5 = (ajag) ajai.f70246g.put(a6, ajag3);
                                                    if ((a & 55) != 0) {
                                                        ? r1 = ajai.f70250k;
                                                        int size = r1.size();
                                                        for (int i27 = 0; i27 < size; i27++) {
                                                            ((ajah) r1.get(i27)).mo38310a(ajag5, ajag3, a);
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                        ajai.f70251l.mo72984b();
                                        ajag ajag52 = (ajag) ajai.f70246g.put(a6, ajag3);
                                        if ((a & 55) != 0) {
                                        }
                                    } else {
                                        nek2 = nek;
                                    }
                                    buyw2 = buyw;
                                    a2 = ahfo.m55649a(nek2.mo20526a(ahfo.f67117a), 0);
                                    if (a2 != null) {
                                    }
                                    if (a2 != null) {
                                    }
                                    ajai.f70251l.mo72984b();
                                    ajag ajag522 = (ajag) ajai.f70246g.put(a6, ajag3);
                                    if ((a & 55) != 0) {
                                    }
                                }
                            } else {
                                ajag3 = ajag2;
                            }
                            i3 = 0;
                            if (i2 != Integer.MIN_VALUE) {
                            }
                            if (((long) ajag3.f70235e.size()) >= cfop.f185115a.mo6606a().mo82247z()) {
                            }
                            a = i3 | i4 | ajag.m58331a(aizv, bleSignalImpl, ajag3.f70235e, 32);
                            if (a9 != null) {
                            }
                            buyw2 = buyw;
                            a2 = ahfo.m55649a(nek2.mo20526a(ahfo.f67117a), 0);
                            if (a2 != null) {
                            }
                            if (a2 != null) {
                            }
                            ajai.f70251l.mo72984b();
                            ajag ajag5222 = (ajag) ajai.f70246g.put(a6, ajag3);
                            if ((a & 55) != 0) {
                            }
                        }
                    }
                }
                byys = null;
                double d52 = Double.NaN;
                if ((buyw3.f155345a & 8) != 0) {
                }
                if (Double.isNaN(d)) {
                }
                i3 = 0;
                if (i2 != Integer.MIN_VALUE) {
                }
                if (((long) ajag3.f70235e.size()) >= cfop.f185115a.mo6606a().mo82247z()) {
                }
                a = i3 | i4 | ajag.m58331a(aizv, bleSignalImpl, ajag3.f70235e, 32);
                if (a9 != null) {
                }
                buyw2 = buyw;
                a2 = ahfo.m55649a(nek2.mo20526a(ahfo.f67117a), 0);
                if (a2 != null) {
                }
                if (a2 != null) {
                }
                ajai.f70251l.mo72984b();
                ajag ajag52222 = (ajag) ajai.f70246g.put(a6, ajag3);
                if ((a & 55) != 0) {
                }
            }
        } else if (i14 == 2) {
            ajai ajai2 = aixs.f70020g;
            buzu buzu2 = buyw3.f155347c;
            if (buzu2 == null) {
                buzu2 = buzu.f155430c;
            }
            String a17 = bvau.m120845a(buzu2.f155433b.mo73780k());
            ajai2.f70251l.mo72984b();
            aizz aizz3 = ajai2.f70241b.f70196a;
            aizz3.f70205a.remove(a17);
            aizz3.f70213i.remove(a17);
            if (a17.equals(aizz3.f70211g)) {
                aizz3.f70211g = null;
                aizz3.f70212h = 0;
            }
            ajag ajag6 = (ajag) ajai2.f70246g.remove(a17);
            if (ajag6 != null) {
                srn srn3 = ahfq.f67120a;
                for (byys byys5 : ajag6.mo38371b()) {
                    ajai2.mo38388a(byys5, (ajag) null);
                }
                ? r12 = ajai2.f70250k;
                int size2 = r12.size();
                for (int i28 = 0; i28 < size2; i28++) {
                    ((ajah) r12.get(i28)).mo38309a(ajag6);
                }
            }
        } else if (i14 != 3) {
            srn srn4 = ahfq.f67120a;
            if ((buyw3.f155345a & 16) != 0) {
                int i29 = buyw3.f155350f;
            }
        } else {
            aixs.f70020g.mo38392b();
        }
    }
}
