package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportChannel;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: agsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agsc {

    /* renamed from: a */
    private static final bnhe f66347a;

    /* renamed from: b */
    private static final String[] f66348b = {"Unspecified", "2G", "3G", "4G", "ALL"};

    /* renamed from: c */
    private static final String[] f66349c = {"UNSPECIFIED", "ZERO", "LOW", "HIGH"};

    /* renamed from: d */
    private static final srn f66350d = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(btaz.PLAN_TYPE_UNSPECIFIED, "Unspecified");
        h.mo67695b(btaz.GENERIC, "Generic");
        h.mo67695b(btaz.VDP, "Video");
        h.mo67695b(btaz.COMPOSITE, "Composite");
        h.mo67695b(btaz.GOOGLE_ONE_MEMBERSHIP, "Google One");
        h.mo67695b(btaz.UNRECOGNIZED, "Unrecognized");
        f66347a = h.mo67618b();
    }

    /* renamed from: a */
    public static long m55038a(bzrw bzrw) {
        return (bzrw.f171213b * 1000000) + (((long) bzrw.f171214c) / 1000);
    }

    /* renamed from: a */
    public static MdpDataPlanStatusResponse m55039a(btag btag, String str, Bundle bundle) {
        String str2;
        WalletBalanceInfo walletBalanceInfo;
        int i;
        int i2;
        agor agor;
        bxwc bxwc;
        String str3;
        int i3;
        bxwc bxwc2;
        String str4;
        char c;
        boolean z;
        String str5;
        String str6;
        int i4;
        agor agor2;
        int i5;
        String str7;
        btag btag2 = btag;
        agor agor3 = new agor();
        agor3.f66188a = str;
        agor3.f66190c = bundle;
        if (!btag2.f147969e.isEmpty()) {
            str2 = btag2.f147969e;
        } else {
            str2 = null;
        }
        agor3.f66191d = str2;
        btbp btbp = btag2.f147970f;
        if (btbp == null) {
            btbp = btbp.f148186l;
        }
        if (btbp != null) {
            bzrw bzrw = btbp.f148190c;
            if (bzrw == null) {
                bzrw = bzrw.f171210d;
            }
            if (bzrw != null && !TextUtils.isEmpty(bzrw.f171212a)) {
                agpi agpi = new agpi();
                bzrw bzrw2 = btbp.f148190c;
                if (bzrw2 == null) {
                    bzrw2 = bzrw.f171210d;
                }
                agpi.f66238a.f80243a = m55038a(bzrw2);
                bzrw bzrw3 = btbp.f148190c;
                if (bzrw3 == null) {
                    bzrw3 = bzrw.f171210d;
                }
                String str8 = bzrw3.f171212a;
                WalletBalanceInfo walletBalanceInfo2 = agpi.f66238a;
                walletBalanceInfo2.f80244b = str8;
                int i6 = btbp.f148191d;
                int i7 = i6 != 0 ? i6 != 1 ? 0 : 3 : 2;
                if (i7 == 0) {
                    i7 = 1;
                }
                int i8 = i7 - 2;
                walletBalanceInfo2.f80245c = i8 != 0 ? i8 != 1 ? 0 : 2 : 1;
                walletBalanceInfo2.f80247e = btbp.f148193f;
                walletBalanceInfo2.f80248f = btbp.f148194g;
                bxyk bxyk = btbp.f148192e;
                if (bxyk != null && bxyk.mo74020aS()) {
                    bxyk bxyk2 = btbp.f148192e;
                    if (bxyk2 == null) {
                        bxyk2 = bxyk.f165095c;
                    }
                    agpi.f66238a.f80246d = Long.valueOf(TimeUnit.SECONDS.toMillis(bxyk2.f165097a) + TimeUnit.NANOSECONDS.toMillis((long) bxyk2.f165098b));
                }
                if (cfnm.m140631b()) {
                    bzrw bzrw4 = btbp.f148195h;
                    if (bzrw4 != null) {
                        String str9 = bzrw4.f171212a;
                        bzrw bzrw5 = btbp.f148190c;
                        if (bzrw5 == null) {
                            bzrw5 = bzrw.f171210d;
                        }
                        if (str9.equals(bzrw5.f171212a)) {
                            bzrw bzrw6 = btbp.f148195h;
                            if (bzrw6 == null) {
                                bzrw6 = bzrw.f171210d;
                            }
                            agpi.f66238a.f80249g = Long.valueOf(m55038a(bzrw6));
                        }
                    }
                    bzrw bzrw7 = btbp.f148197j;
                    if (bzrw7 != null) {
                        String str10 = bzrw7.f171212a;
                        bzrw bzrw8 = btbp.f148190c;
                        if (bzrw8 == null) {
                            bzrw8 = bzrw.f171210d;
                        }
                        if (str10.equals(bzrw8.f171212a)) {
                            bzrw bzrw9 = btbp.f148197j;
                            if (bzrw9 == null) {
                                bzrw9 = bzrw.f171210d;
                            }
                            agpi.f66238a.f80250h = Long.valueOf(m55038a(bzrw9));
                        }
                    }
                    bzrw bzrw10 = btbp.f148196i;
                    if (bzrw10 != null) {
                        String str11 = bzrw10.f171212a;
                        bzrw bzrw11 = btbp.f148190c;
                        if (bzrw11 == null) {
                            bzrw11 = bzrw.f171210d;
                        }
                        if (str11.equals(bzrw11.f171212a)) {
                            bzrw bzrw12 = btbp.f148196i;
                            if (bzrw12 == null) {
                                bzrw12 = bzrw.f171210d;
                            }
                            agpi.f66238a.f80251i = Long.valueOf(m55038a(bzrw12));
                            if (!btbp.f148198k.isEmpty()) {
                                agpi.f66238a.f80252j = btbp.f148198k;
                            }
                        }
                    }
                }
                walletBalanceInfo = agpi.f66238a;
            } else {
                ((bnsl) f66350d.mo68388c()).mo68405a("Rpc wallet info passed invalid remaining balance which cannot be converted");
                walletBalanceInfo = null;
            }
        } else {
            walletBalanceInfo = null;
        }
        agor3.f66192e = walletBalanceInfo;
        if (cfmq.m140247r()) {
            int i9 = btag2.f147972h;
            if (i9 != 0) {
                agor3.f66193f = Integer.valueOf(i9);
            }
            long j = btag2.f147971g;
            if (j != 0) {
                agor3.f66194g = Long.valueOf(j);
            }
        }
        bxwc bxwc3 = btag2.f147966b;
        bxyk bxyk3 = btag2.f147968d;
        if (bxyk3 == null) {
            bxyk3 = bxzt.m124580a(System.currentTimeMillis());
        }
        agor3.mo35801a(bxyk3);
        int size = bxwc3.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            bszj bszj = (bszj) bxwc3.get(i11);
            i10 = bszj.f147838j.size() > 0 ? i10 + bszj.f147838j.size() : i10 + 1;
        }
        MdpDataPlanStatus[] mdpDataPlanStatusArr = new MdpDataPlanStatus[i10];
        if (i10 != 0) {
            int size2 = bxwc3.size();
            int i12 = 0;
            int i13 = 0;
            while (i12 < size2) {
                bszj bszj2 = (bszj) bxwc3.get(i12);
                if (bszj2.f147838j.size() != 0) {
                    bxwc bxwc4 = bszj2.f147838j;
                    int size3 = bxwc4.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        btay btay = (btay) bxwc4.get(i14);
                        int i15 = i13 + 1;
                        agon agon = new agon();
                        agon.mo35793f(bszj2.f147829a);
                        if (btay.f148063g.isEmpty()) {
                            str3 = bszj2.f147834f;
                        } else {
                            str3 = btay.f148063g;
                        }
                        agon.mo35788c(str3);
                        btaz a = btaz.m116383a(bszj2.f147831c);
                        if (a == null) {
                            a = btaz.UNRECOGNIZED;
                        }
                        bxwc bxwc5 = bxwc3;
                        agon.mo35794g(m55043a(a, new bxvv(btay.f148060c, btay.f148055d)));
                        agon.mo35782a(Long.valueOf(btay.f148058a).longValue());
                        agon.mo35785b(Long.valueOf(btay.f148061e).longValue());
                        bszt[] bsztArr = (bszt[]) btay.f148066j.toArray(new bszt[0]);
                        int length = bsztArr.length;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < length) {
                            agor agor4 = agor3;
                            int i18 = size2;
                            int i19 = i12;
                            bxwc bxwc6 = bxwc4;
                            int i20 = size3;
                            if (!bsztArr[i16].f147889b) {
                                i17++;
                            }
                            i16++;
                            size2 = i18;
                            bxwc4 = bxwc6;
                            size3 = i20;
                            agor3 = agor4;
                            i12 = i19;
                        }
                        MdpFlexTimeWindow[] mdpFlexTimeWindowArr = new MdpFlexTimeWindow[i17];
                        int i21 = 0;
                        int i22 = 0;
                        while (true) {
                            i3 = size2;
                            int i23 = 5;
                            bxwc2 = bxwc4;
                            if (i21 >= bsztArr.length) {
                                break;
                            }
                            bszt bszt = bsztArr[i21];
                            if (!bszt.f147889b) {
                                int i24 = i22 + 1;
                                i5 = size3;
                                int i25 = bszt.f147888a;
                                if (i25 != 0) {
                                    agor2 = agor3;
                                    if (i25 == 1) {
                                        i23 = 3;
                                    } else if (i25 == 2) {
                                        i23 = 4;
                                    } else if (i25 != 3) {
                                        i23 = 0;
                                    }
                                } else {
                                    agor2 = agor3;
                                    i23 = 2;
                                }
                                if (i23 == 0) {
                                    i23 = 1;
                                }
                                int i26 = i23 - 2;
                                if (i26 != 1) {
                                    str7 = i26 != 2 ? i26 != 3 ? null : "WEEKENDS" : "WEEKDAYS";
                                } else {
                                    str7 = "DAILY";
                                }
                                String str12 = bszt.f147890c;
                                i4 = i12;
                                String str13 = bszt.f147891d;
                                int i27 = bszt.f147892e;
                                if (i27 == 0) {
                                    i27 = 100;
                                }
                                mdpFlexTimeWindowArr[i22] = new MdpFlexTimeWindow(str7, str12, str13, i27);
                                i22 = i24;
                            } else {
                                agor2 = agor3;
                                i4 = i12;
                                i5 = size3;
                            }
                            i21++;
                            size2 = i3;
                            bxwc4 = bxwc2;
                            size3 = i5;
                            agor3 = agor2;
                            i12 = i4;
                        }
                        agor agor5 = agor3;
                        int i28 = i12;
                        int i29 = size3;
                        agon.mo35784a(mdpFlexTimeWindowArr);
                        int b = btav.m116379b(btay.f148064h);
                        if (b == 0) {
                            b = 1;
                        }
                        agon.mo35781a(btav.m116378a(b));
                        agon.mo35792e(bszj2.f147830b);
                        if (!btay.f148068l.isEmpty()) {
                            str4 = btay.f148068l;
                        } else {
                            str4 = null;
                        }
                        agon.mo35790d(str4);
                        agon.mo35791e(bxzt.m124578a(bxyk3));
                        agon.mo35787c(btay.f148059b);
                        agon.mo35789d(btay.f148062f);
                        agon.mo35786b(btay.f148065i);
                        int a2 = btaw.m116380a(btay.f148067k);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        agon.mo35783a(m55042a(a2));
                        int i30 = btay.f148069m;
                        if (i30 != 0) {
                            c = i30 != 1 ? i30 != 2 ? i30 != 3 ? i30 != 4 ? (char) 0 : 6 : 5 : 4 : 3;
                        } else {
                            c = 2;
                        }
                        if (c == 0) {
                            z = true;
                        } else {
                            z = c != 3;
                        }
                        agon.f66186a.f80181t = z;
                        if (!btay.f148070n.isEmpty()) {
                            str5 = btay.f148070n;
                        } else {
                            str5 = null;
                        }
                        agon.f66186a.f80172k = str5;
                        if (!btay.f148071o.isEmpty()) {
                            str6 = btay.f148071o;
                        } else {
                            str6 = null;
                        }
                        MdpDataPlanStatus mdpDataPlanStatus = agon.f66186a;
                        mdpDataPlanStatus.f80173l = str6;
                        mdpDataPlanStatus.f80174m = bszj2.f147831c;
                        mdpDataPlanStatus.f80175n = btay.f148060c;
                        mdpDataPlanStatusArr[i13] = mdpDataPlanStatus;
                        i14++;
                        size2 = i3;
                        i13 = i15;
                        bxwc3 = bxwc5;
                        bxwc4 = bxwc2;
                        size3 = i29;
                        agor3 = agor5;
                        i12 = i28;
                    }
                    agor = agor3;
                    bxwc = bxwc3;
                    i = size2;
                    i2 = i12;
                } else {
                    agor = agor3;
                    bxwc = bxwc3;
                    i = size2;
                    i2 = i12;
                    int i31 = i13 + 1;
                    agon agon2 = new agon();
                    agon2.mo35793f(bszj2.f147829a);
                    agon2.mo35788c(bszj2.f147834f);
                    btaz a3 = btaz.m116383a(bszj2.f147831c);
                    if (a3 == null) {
                        a3 = btaz.UNRECOGNIZED;
                    }
                    agon2.mo35794g(m55043a(a3, null));
                    agon2.mo35782a(Long.valueOf(bszj2.f147832d).longValue());
                    agon2.mo35785b(Long.valueOf(bszj2.f147833e).longValue());
                    agon2.mo35784a(new MdpFlexTimeWindow[0]);
                    int b2 = btav.m116379b(bszj2.f147835g);
                    if (b2 == 0) {
                        b2 = 1;
                    }
                    agon2.mo35781a(btav.m116378a(b2));
                    agon2.mo35792e(bszj2.f147830b);
                    agon2.mo35790d((String) null);
                    agon2.mo35791e(bxzt.m124578a(bxyk3));
                    agon2.mo35787c(bszj2.f147836h);
                    agon2.mo35789d(Long.valueOf(bszj2.f147837i).longValue());
                    agon2.mo35786b((String) null);
                    int a4 = btaw.m116380a(bszj2.f147839k);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    agon2.mo35783a(m55042a(a4));
                    mdpDataPlanStatusArr[i13] = agon2.f66186a;
                    i13 = i31;
                }
                size2 = i;
                i12 = i2 + 1;
                bxwc3 = bxwc;
                agor3 = agor;
            }
            agor3.f66189b = mdpDataPlanStatusArr;
            return agor3.mo35800a();
        }
        agor3.f66189b = mdpDataPlanStatusArr;
        return agor3.mo35800a();
    }

    /* renamed from: a */
    public static MdpUpsellOfferResponse m55040a(btbm btbm) {
        MdpUpsellPlan[] mdpUpsellPlanArr;
        Bundle bundle;
        btbm btbm2;
        bxwc bxwc;
        int i;
        bxwc bxwc2 = btbm.f148161b;
        long j = 0;
        List list = null;
        if (!bxwc2.isEmpty()) {
            ArrayList arrayList = new ArrayList(bxwc2.size());
            int size = bxwc2.size();
            int i2 = 0;
            while (i2 < size) {
                btbn btbn = (btbn) bxwc2.get(i2);
                if (btbn.f148170b.isEmpty()) {
                    bxwc = bxwc2;
                    i = size;
                } else if (btbn.f148169a.isEmpty()) {
                    bxwc = bxwc2;
                    i = size;
                } else if (btbn.f148171c.isEmpty()) {
                    bxwc = bxwc2;
                    i = size;
                } else if (btbn.f148174f.isEmpty() || btbn.f148173e < j) {
                    bxwc = bxwc2;
                    i = size;
                } else {
                    agpc agpc = new agpc();
                    agpc.f66230a = btbn.f148170b;
                    agpc.f66231b = btbn.f148169a;
                    btaz a = btaz.m116383a(btbn.f148172d);
                    if (a == null) {
                        a = btaz.UNRECOGNIZED;
                    }
                    agpc.f66232c = m55043a(a, list);
                    agpc.f66233d = btbn.f148173e;
                    agpc.f66234e = btbn.f148174f;
                    int i3 = btbn.f148175g;
                    int i4 = 4;
                    if (i3 == 0) {
                        i4 = 2;
                    } else if (i3 == 1) {
                        i4 = 3;
                    } else if (i3 != 2) {
                        i4 = i3 != 3 ? i3 != 4 ? 0 : 6 : 5;
                    }
                    if (i4 == 0) {
                        i4 = 1;
                    }
                    String[] strArr = f66348b;
                    if (i4 != 1) {
                        agpc.f66235f = strArr[i4 - 2];
                        long j2 = btbn.f148176h;
                        long j3 = btbn.f148177i;
                        agpc.f66236g = btbn.f148178j;
                        agpc.f66237h = btbn.f148171c;
                        i = size;
                        bxwc = bxwc2;
                        arrayList.add(new MdpUpsellPlan(agpc.f66230a, agpc.f66231b, agpc.f66232c, agpc.f66233d, agpc.f66234e, agpc.f66235f, j2, j3, agpc.f66236g, agpc.f66237h, btbn.f148179k));
                    } else {
                        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                }
                i2++;
                size = i;
                bxwc2 = bxwc;
                j = 0;
                list = null;
            }
            mdpUpsellPlanArr = (MdpUpsellPlan[]) arrayList.toArray(new MdpUpsellPlan[arrayList.size()]);
        } else {
            mdpUpsellPlanArr = new MdpUpsellPlan[0];
        }
        if (agqg.m54839F().booleanValue()) {
            bundle = new Bundle();
            btbm2 = btbm;
            if (!btbm2.f148162c.isEmpty()) {
                bundle.putString("purchase_term_html", btbm2.f148162c);
            }
            if (!btbm2.f148163d.isEmpty()) {
                bundle.putString("purchase_method_description", btbm2.f148163d);
            }
            bszw bszw = btbm2.f148164e;
            if (bszw != null) {
                for (Map.Entry entry : Collections.unmodifiableMap(bszw.f147896a).entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } else {
            btbm2 = btbm;
            bundle = null;
        }
        if (btbm2.f148160a != null) {
            agpa agpa = new agpa();
            btbl btbl = btbm2.f148160a;
            if (btbl == null) {
                btbl = btbl.f148152e;
            }
            agpa.f66221a = btbl.f148156c;
            btbl btbl2 = btbm2.f148160a;
            if (btbl2 == null) {
                btbl2 = btbl.f148152e;
            }
            agpa.f66222b = btbl2.f148157d;
            btbl btbl3 = btbm2.f148160a;
            if (btbl3 == null) {
                btbl3 = btbl.f148152e;
            }
            agpa.f66223c = btbl3.f148154a;
            btbl btbl4 = btbm2.f148160a;
            if (btbl4 == null) {
                btbl4 = btbl.f148152e;
            }
            agpa.f66224d = btbl4.f148155b;
            agpa.f66225e = mdpUpsellPlanArr;
            agpa.f66226f = bundle;
            if (cfmq.m140247r()) {
                int i5 = btbm2.f148166g;
                if (i5 != 0) {
                    agpa.f66227g = Integer.valueOf(i5);
                }
                long j4 = btbm2.f148165f;
                if (j4 != 0) {
                    agpa.f66228h = Long.valueOf(j4);
                }
            }
            return agpa.mo35814a();
        }
        agpa agpa2 = new agpa();
        agpa2.f66225e = mdpUpsellPlanArr;
        agpa2.f66226f = bundle;
        return agpa2.mo35814a();
    }

    /* renamed from: a */
    public static CarrierSupportInfo m55041a(bszh bszh) {
        int b;
        if (bszh == null) {
            return null;
        }
        agqb agqb = new agqb();
        if (!bszh.f147824a.isEmpty()) {
            agqb.f66260a.f80259a = bszh.f147824a;
        }
        if (!bszh.f147825b.isEmpty()) {
            agqb.f66260a.f80260b = bszh.f147825b;
        }
        int size = bszh.f147826c.size();
        if (size == 0) {
            return agqb.f66260a;
        }
        CarrierSupportChannel[] carrierSupportChannelArr = new CarrierSupportChannel[size];
        for (int i = 0; i < size; i++) {
            agpz agpz = new agpz();
            bszg bszg = (bszg) bszh.f147826c.get(i);
            if (!bszg.f147816a.isEmpty()) {
                agpz.f66259a.f80253a = bszg.f147816a;
            }
            if (!bszg.f147817b.isEmpty()) {
                agpz.f66259a.f80254b = bszg.f147817b;
            }
            if (!bszg.f147818c.isEmpty()) {
                agpz.f66259a.f80255c = bszg.f147818c;
            }
            if (!bszg.f147819d.isEmpty()) {
                agpz.f66259a.f80256d = bszg.f147819d;
            }
            if (!bszg.f147820e.isEmpty()) {
                agpz.f66259a.f80257e = bszg.f147820e;
            }
            int b2 = btbi.m116395b(bszg.f147821f);
            if ((b2 == 0 || b2 != 2) && (b = btbi.m116395b(bszg.f147821f)) != 0) {
                int i2 = 1;
                if (b != 1) {
                    int b3 = btbi.m116395b(bszg.f147821f);
                    if (b3 != 0) {
                        i2 = b3;
                    }
                    agpz.f66259a.f80258f = btbi.m116394a(i2);
                }
            }
            carrierSupportChannelArr[i] = agpz.f66259a;
        }
        CarrierSupportInfo carrierSupportInfo = agqb.f66260a;
        carrierSupportInfo.f80261c = carrierSupportChannelArr;
        return carrierSupportInfo;
    }

    /* renamed from: a */
    private static String m55042a(int i) {
        String[] strArr = f66349c;
        if (i != 1) {
            return strArr[i - 2];
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static String m55043a(btaz btaz, List list) {
        int i;
        String str;
        String str2 = (String) f66347a.get(btaz);
        if (str2 == null) {
            str2 = (String) f66347a.get(btaz.PLAN_TYPE_UNSPECIFIED);
        }
        if (list == null || list.size() <= 0) {
            return str2;
        }
        String concat = String.valueOf(str2).concat("[");
        Iterator it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                return String.valueOf(concat.substring(0, concat.length() - 1)).concat("]");
            }
            btba btba = (btba) it.next();
            if (!(btba == null || btba == btba.UNRECOGNIZED)) {
                int a = btba.mo3214a();
                int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                while (true) {
                    if (i2 < 10) {
                        i = iArr[i2];
                        int i3 = i - 2;
                        if (i == 0) {
                            throw null;
                        } else if (i3 != a) {
                            i2++;
                        }
                    }
                }
            }
            i = 1;
            if (i != 1) {
                String valueOf = String.valueOf(concat);
                switch (i) {
                    case 1:
                        str = "UNRECOGNIZED";
                        break;
                    case 2:
                        str = "UNSPECIFIED";
                        break;
                    case 3:
                        str = "GENERIC";
                        break;
                    case 4:
                        str = "VIDEO";
                        break;
                    case 5:
                        str = "VIDEO_BROWSING";
                        break;
                    case 6:
                        str = "MUSIC";
                        break;
                    case 7:
                        str = "GAMING";
                        break;
                    case 8:
                        str = "SOCIAL";
                        break;
                    case 9:
                        str = "MESSAGING";
                        break;
                    case 10:
                        str = "VIDEO_OFFLINE";
                        break;
                    default:
                        str = "null";
                        break;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + str.length());
                sb.append(valueOf);
                sb.append(str);
                sb.append(",");
                concat = sb.toString();
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int[] m55044a(String str) {
        char c;
        String str2 = str;
        if (str2 != null) {
            int indexOf = str2.indexOf("[");
            int indexOf2 = str2.indexOf("]");
            if (indexOf == -1 || indexOf2 == -1) {
                return null;
            }
            if (indexOf < indexOf2) {
                List c2 = bmyx.m108643a(",").mo66925c((CharSequence) str2.substring(indexOf + 1, indexOf2));
                int size = c2.size();
                int[] iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    try {
                        String str3 = (String) c2.get(i);
                        int i2 = 6;
                        switch (str3.hashCode()) {
                            case -1843721363:
                                if (str3.equals("SOCIAL")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1102183381:
                                if (str3.equals("VIDEO_BROWSING")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -765275681:
                                if (str3.equals("VIDEO_OFFLINE")) {
                                    c = 9;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 73725445:
                                if (str3.equals("MUSIC")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 81665115:
                                if (str3.equals("VIDEO")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 526786327:
                                if (str3.equals("UNSPECIFIED")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 573789423:
                                if (str3.equals("UNRECOGNIZED")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 637834679:
                                if (str3.equals("GENERIC")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1346586340:
                                if (str3.equals("MESSAGING")) {
                                    c = 8;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2095065135:
                                if (str3.equals("GAMING")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                i2 = 1;
                                iArr[i] = i2;
                                break;
                            case 1:
                                i2 = 2;
                                iArr[i] = i2;
                                break;
                            case 2:
                                i2 = 3;
                                iArr[i] = i2;
                                break;
                            case 3:
                                i2 = 4;
                                iArr[i] = i2;
                                break;
                            case 4:
                                i2 = 5;
                                iArr[i] = i2;
                                break;
                            case 5:
                                iArr[i] = i2;
                                break;
                            case 6:
                                i2 = 7;
                                iArr[i] = i2;
                                break;
                            case 7:
                                i2 = 8;
                                iArr[i] = i2;
                                break;
                            case 8:
                                i2 = 9;
                                iArr[i] = i2;
                                break;
                            case 9:
                                i2 = 10;
                                iArr[i] = i2;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } catch (IllegalArgumentException e) {
                        iArr[i] = 1;
                    }
                }
                return iArr;
            }
            throw new IllegalArgumentException(str2.concat(" format error"));
        }
        throw new IllegalArgumentException("category string is null");
    }
}
