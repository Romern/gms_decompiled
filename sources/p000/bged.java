package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bged */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bged implements bgmn {

    /* renamed from: a */
    final /* synthetic */ bgef f116217a;

    /* renamed from: b */
    private final bgee f116218b;

    /* renamed from: c */
    private final bsax f116219c;

    public bged(bgef bgef, bgee bgee, bsax bsax) {
        this.f116217a = bgef;
        this.f116218b = bgee;
        this.f116219c = bsax;
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d5  */
    /* renamed from: a */
    public final void mo62706a(bgmk bgmk, bsax bsax) {
        boolean z;
        bfmu bfmu;
        int i;
        int i2;
        int i3;
        int i4;
        bsax bsax2 = bsax;
        if (this.f116217a.f116223a == this.f116218b) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bmxy.m108581a(this.f116217a.f116223a);
        bgef bgef = this.f116217a;
        bfmu bfmu2 = bgef.f116223a.f116220a;
        bgef.f116223a = bgef.f116224b;
        bgef.f116224b = null;
        if (bgef.f116223a != null) {
            bgef.mo62707a();
        }
        bfmu2.f114429b.clear();
        boolean b = bhcn.m100638b(bsax);
        int i5 = 2;
        if (b) {
            bmxy.m108581a(bsax);
            int j = bsax2.mo70138j(2);
            for (int i6 = 0; i6 < j; i6++) {
                bfmu2.mo61958a(bsax2.mo70131f(2, i6));
            }
        }
        bgef bgef2 = this.f116217a;
        bfcn bfcn = bgef2.f116228f;
        if (bfcn == null) {
            bfmu = bfmu2;
        } else {
            bsax bsax3 = this.f116219c;
            boolean z2 = bgef2.f116226d;
            boolean z3 = bgef2.f116225c;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i7 < bsax3.mo70138j(4)) {
                bsax f = bsax3.mo70131f(4, i7);
                i9 += f.mo70137i(i5) ? 1 : 0;
                bfcn.mo61397a(6, f, i5);
                if (f.mo70137i(17)) {
                    bsax e = f.mo70129e(17);
                    if (e.mo70137i(5)) {
                        i10++;
                        bsax e2 = e.mo70129e(5);
                        if (!cewj.m138360c()) {
                            e = e2;
                        }
                        bfcn.mo61397a(8, e, 5);
                    }
                }
                i8 += f.mo70137i(1) ? 1 : 0;
                bfcn.mo61397a(10, f, 1);
                i7++;
                i5 = 2;
            }
            if (bsax2 != null) {
                int i11 = 0;
                i3 = 0;
                i2 = 0;
                int i12 = 0;
                while (i11 < bsax2.mo70138j(2)) {
                    bsax f2 = bsax2.mo70131f(2, i11);
                    int j2 = f2.mo70138j(3);
                    int i13 = 0;
                    while (i13 < j2) {
                        bsax f3 = f2.mo70131f(3, i13);
                        i12 += f3.mo70137i(3) ? 1 : 0;
                        bfcn.mo61397a(7, f3, 3);
                        i2 += f3.mo70137i(2) ? 1 : 0;
                        bfcn.mo61397a(17, f3, 2);
                        i13++;
                        j2 = j2;
                        bfmu2 = bfmu2;
                    }
                    bfmu bfmu3 = bfmu2;
                    if (f2.mo70137i(11)) {
                        bsax e3 = f2.mo70129e(11);
                        if (e3.mo70137i(9)) {
                            bsax e4 = e3.mo70129e(9);
                            i3++;
                            if (!cewj.m138360c()) {
                                e3 = e4;
                            }
                            bfcn.mo61397a(9, e3, 9);
                        }
                    }
                    i11++;
                    bsax2 = bsax;
                    bfmu2 = bfmu3;
                }
                bfmu = bfmu2;
                i4 = i12;
            } else {
                bfmu = bfmu2;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            }
            int b2 = bfcn.mo61403b(6);
            int b3 = bfcn.mo61403b(7);
            StringBuilder sb = new StringBuilder(193);
            sb.append("Wifi cluster counts and sizes: wifiClusterQueryCount is ");
            sb.append(i9);
            sb.append(", bytesUploadedByWifiCluster is ");
            sb.append(b2);
            sb.append(", wifiClusterReplyCount is ");
            sb.append(i4);
            sb.append(", bytesDownloadedByWifiCluster is ");
            sb.append(b3);
            sb.toString();
            int b4 = bfcn.mo61403b(10);
            int b5 = bfcn.mo61403b(17);
            StringBuilder sb2 = new StringBuilder((int) MfiClientException.TYPE_CARD_NOT_CACHED);
            sb2.append("Cell counts and sizes: cellQueryCount is ");
            sb2.append(i8);
            sb2.append(", bytesUploadedByCell is ");
            sb2.append(b4);
            sb2.append(", cellReplyCount is ");
            sb2.append(i2);
            sb2.append(", bytesDownloadedByCell is ");
            sb2.append(b5);
            sb2.toString();
            int b6 = bfcn.mo61403b(8);
            int b7 = bfcn.mo61403b(9);
            StringBuilder sb3 = new StringBuilder(167);
            sb3.append("Frewle counts and sizes: frewleQueryCount is ");
            sb3.append(i10);
            sb3.append(", bytesUploadedByFrewle is ");
            sb3.append(b6);
            sb3.append(", frewleReplyCount is ");
            sb3.append(i3);
            sb3.append(", bytesDownloadedByFrewle is ");
            sb3.append(b7);
            sb3.toString();
            if (!b) {
                if (z3) {
                    bfcn.mo61395a(16);
                } else if (z2) {
                    bfcn.mo61395a(14);
                }
                bfcn.mo61395a(19);
            } else {
                if (z3) {
                    bfcn.mo61395a(15);
                } else if (z2) {
                    bfcn.mo61395a(13);
                }
                bfcn.mo61395a(18);
            }
            if (i9 > 0) {
                if (i4 > 0 && b) {
                    bfcn.mo61395a(1);
                } else {
                    bfcn.mo61395a(2);
                }
            }
            if (i8 > 0) {
                if (i2 > 0 && b) {
                    bfcn.mo61395a(11);
                } else {
                    bfcn.mo61395a(12);
                }
            }
            if (i10 > 0) {
                if (i3 > 0 && b) {
                    bfcn.mo61395a(3);
                } else {
                    bfcn.mo61395a(4);
                }
            }
        }
        bgdy bgdy = this.f116217a.f116227e;
        bgdy.f116204e.mo61864a();
        bfmu bfmu4 = bfmu;
        bgdy.f116203d.mo61423a(bfmu4, true, bgdy.f116201b.mo62775b());
        bulp bulp = bgdy.f116205f.f116209a.f153981a;
        bulp.f154171l = false;
        bulp.f154172m = true;
        ArrayList arrayList = bfmu4.f114429b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            bsax bsax4 = (bsax) arrayList.get(i14);
            if (bsax4.mo70137i(11)) {
                bsax e5 = bsax4.mo70129e(11);
                if (e5 != null) {
                    if (e5.mo70137i(9)) {
                        bulp.f154181v.mo72775b(bulp.f154162c.mo62775b());
                        bsax e6 = e5.mo70129e(9);
                        if (e6.mo70137i(1)) {
                            bsax e7 = e6.mo70129e(1);
                            if (e7.mo70137i(2)) {
                                bsax e8 = e7.mo70129e(2);
                                bulp.mo72821a(e8);
                                bult bult = bulp.f154167h;
                                if (!(bult.f154187d == null || bult.f154188e || e8 == null)) {
                                    try {
                                        if (Arrays.equals(e8.mo70120b(), bult.f154187d.mo70120b())) {
                                            i = 1;
                                            if (e7.mo70138j(i) > 0) {
                                                bulp.f154170k = 3000;
                                            }
                                            bulp.f154168i.mo72833a(e7, bulp.f154162c.mo62775b(), bulp.f154181v);
                                        }
                                    } catch (IOException e9) {
                                    }
                                }
                                bult.f154187d = e8;
                                i = 1;
                                bult.f154188e = true;
                                if (e7.mo70138j(i) > 0) {
                                }
                                bulp.f154168i.mo72833a(e7, bulp.f154162c.mo62775b(), bulp.f154181v);
                            }
                        }
                    }
                }
                bulp.f154172m = false;
            }
        }
        if (bgdy.mo62699a()) {
            bgdw bgdw = bgdy.f116200a;
            if (bgdw.mo62693a()) {
                bmxy.m108581a(bgdw.f116186b);
                bubk bubk = ((bubi) bgdw.f116186b.f153219a).f153227b;
                bubk.f153234b = false;
                long j3 = 1;
                bubk.f153243k++;
                ArrayList arrayList2 = bfmu4.f114429b;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    bsax bsax5 = (bsax) arrayList2.get(i15);
                    if (bsax5.mo70137i(11)) {
                        bsax e10 = bsax5.mo70129e(11);
                        if (e10 != null) {
                            if (e10.mo70137i(10)) {
                                bsax e11 = e10.mo70129e(10);
                                if (e11.mo70137i(1)) {
                                    bsax e12 = e11.mo70129e(1);
                                    if (e12.mo70138j(1) != 0) {
                                        bubk.f153244l += j3;
                                        bubk.f153237e.f153229d.f153211g++;
                                        int i16 = bubk.f153239g;
                                        bubk.f153240h = 3000;
                                        long b8 = bubk.f153238f.mo62775b();
                                        bubk.f153236d = b8;
                                        bubl bubl = bubk.f153237e.f153226a;
                                        if (e12.mo70137i(1)) {
                                            bsax e13 = e12.mo70129e(1);
                                            if (e13.mo70138j(1) == e13.mo70138j(2)) {
                                                int b9 = e13.mo70114b(3) + (e13.mo70138j(1) * 8);
                                                StringBuilder sb4 = new StringBuilder(39);
                                                sb4.append("Total download byte counts: ");
                                                sb4.append(b9);
                                                sb4.toString();
                                                bubl.f153250e.f153229d.f153212h += b9;
                                                for (int i17 = 0; i17 < e13.mo70138j(1); i17++) {
                                                    bubl.f153247b.mo72615a(e13.mo70127d(1, i17), b8, e13.mo70121b(2, i17));
                                                }
                                                bubl.f153251f = null;
                                            } else {
                                                bubl.f153251f = null;
                                            }
                                        }
                                        int a = bubl.mo72617a();
                                        if (a > 500000) {
                                            bumj a2 = bubl.f153247b.entrySet().iterator();
                                            int i18 = 0;
                                            while (true) {
                                                if (!a2.hasNext()) {
                                                    break;
                                                }
                                                a2.mo72556f();
                                                i18 += a2.mo72502a().length;
                                                a2.remove();
                                                int i19 = a - i18;
                                                if (i19 <= 500000) {
                                                    bubl.f153250e.f153229d.mo72611a(i19);
                                                    break;
                                                }
                                            }
                                        } else {
                                            bubl.f153250e.f153229d.mo72611a(a);
                                        }
                                        long j4 = bubk.f153236d;
                                        long j5 = bubk.f153245m;
                                        if (j4 > j5 && j5 != 0) {
                                            bubk.f153237e.f153229d.f153213i += j4 - j5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i15++;
                    j3 = 1;
                }
                bubk.f153245m = 0;
            }
        }
        this.f116218b.f116222c.mo62705a(bgmk, bsax);
    }
}
