package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: dtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtq {

    /* renamed from: a */
    public static final Comparator f14006a = new dtp();

    /* renamed from: a */
    public static int m9327a(bxcl bxcl) {
        bxcl bxcl2 = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        switch (bxcl.ordinal()) {
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                return 0;
            case 5:
                return 3;
            case 6:
                return 2;
            case 7:
                return 4;
            case 12:
                return 5;
            default:
                return 10;
        }
    }

    /* renamed from: b */
    public static dus m9331b(dus dus) {
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = dus.f14074a.ordinal();
        if (ordinal == 1) {
            ArrayList arrayList = new ArrayList();
            for (dus dus2 : dus.mo9661a()) {
                arrayList.add(m9331b(dus2));
            }
            dus dus3 = (dus) arrayList.get(0);
            for (int i = 1; i < arrayList.size(); i++) {
                dus dus4 = (dus) arrayList.get(i);
                ArrayList arrayList2 = new ArrayList();
                for (dus dus5 : dus3.mo9661a()) {
                    for (dus dus6 : dus4.mo9661a()) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(dus5.mo9661a());
                        arrayList3.addAll(dus6.mo9661a());
                        arrayList2.add(m9330a(arrayList3));
                    }
                }
                dus3 = m9332b(arrayList2);
            }
            return dus3;
        } else if (ordinal == 2) {
            ArrayList arrayList4 = new ArrayList();
            for (dus dus7 : dus.mo9661a()) {
                arrayList4.add(m9331b(dus7));
            }
            ArrayList arrayList5 = new ArrayList();
            int size = arrayList4.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList5.addAll(((dus) arrayList4.get(i2)).mo9661a());
            }
            return m9332b(arrayList5);
        } else if (ordinal == 3) {
            if (dus.mo9661a().size() == 0) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dtq", "b", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[FenceNormalizer] No valid NOT fence type defined.");
            }
            if (dus.mo9661a().size() > 1) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dtq", "b", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[FenceNormalizer] Found an invalid NOT fence with more than one fences.");
            }
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(dus);
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(m9330a(arrayList6));
            return m9332b(arrayList7);
        } else if (ordinal == 22) {
            return m9333c(m9336e(m9331b((dus) dus.mo9661a().get(0))));
        } else {
            if (dus.mo9671q()) {
                return m9333c(dus);
            }
            bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
            bnsl3.mo68432a("dtq", "b", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("[FenceNormalizer] Unknown context fence type = %s", dus.f14074a);
            return null;
        }
    }

    /* renamed from: c */
    private static dus m9333c(dus dus) {
        return m9332b(Collections.singletonList(m9330a(Collections.singletonList(dus))));
    }

    /* renamed from: d */
    private static dus m9335d(dus dus) {
        sdo.m34959a(dus);
        return new dus(m9328a(bxcl.NOT, m9334c(Collections.singletonList(dus))));
    }

    /* renamed from: e */
    private static dus m9336e(dus dus) {
        sdo.m34959a(dus);
        return new dus(m9328a(bxcl.PREDICTIVE, m9334c(Collections.singletonList(dus))));
    }

    /* renamed from: a */
    private static bxcm m9328a(bxcl bxcl, bxcm[] bxcmArr) {
        boolean z;
        if (bxcl == bxcl.AND || bxcl == bxcl.OR || bxcl == bxcl.NOT || bxcl == bxcl.PREDICTIVE) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        bxcj bxcj = (bxcj) bxcm.f162813z.mo74144da();
        if (bxcj.f164950c) {
            bxcj.mo74035c();
            bxcj.f164950c = false;
        }
        bxcm bxcm = (bxcm) bxcj.f164949b;
        bxcm.f162815b = bxcl.f162810z;
        bxcm.f162814a |= 1;
        bxcj.mo73563a(Arrays.asList(bxcmArr));
        return (bxcm) bxcj.mo74062i();
    }

    /* renamed from: c */
    private static bxcm[] m9334c(List list) {
        bxcm[] bxcmArr = new bxcm[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            bxcmArr[i] = (bxcm) ((dus) it.next()).f14076c;
            i++;
        }
        return bxcmArr;
    }

    /* renamed from: a */
    public static dus m9329a(dus dus) {
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = dus.f14074a.ordinal();
        if (ordinal == 1) {
            ArrayList arrayList = new ArrayList();
            for (dus dus2 : dus.mo9661a()) {
                arrayList.add(m9329a(dus2));
            }
            return m9330a(arrayList);
        } else if (ordinal == 2) {
            ArrayList arrayList2 = new ArrayList();
            for (dus dus3 : dus.mo9661a()) {
                arrayList2.add(m9329a(dus3));
            }
            return m9332b(arrayList2);
        } else if (ordinal != 3) {
            if (ordinal != 22) {
                if (dus.mo9671q()) {
                    return dus;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dtq", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[FenceNormalizer] Unknown context fence type = %s", dus.f14074a);
                return null;
            } else if (dus.mo9661a().size() == 1) {
                return m9336e(m9329a((dus) dus.mo9661a().get(0)));
            } else {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dtq", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[FenceNormalizer] Found an invalid PREDICTIVE fence with incorrect number of internal fences.");
                return dus;
            }
        } else if (dus.mo9661a().size() == 0) {
            bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
            bnsl3.mo68432a("dtq", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("[FenceNormalizer] No valid NOT fence type defined.");
            return dus;
        } else {
            if (dus.mo9661a().size() > 1) {
                bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                bnsl4.mo68432a("dtq", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("[FenceNormalizer] Found an invalid NOT fence with more than one fences.");
            }
            dus dus4 = (dus) dus.mo9661a().get(0);
            int ordinal2 = dus4.f14074a.ordinal();
            if (ordinal2 == 1) {
                ArrayList arrayList3 = new ArrayList();
                for (dus dus5 : dus4.mo9661a()) {
                    arrayList3.add(m9329a(m9335d(dus5)));
                }
                return m9332b(arrayList3);
            } else if (ordinal2 == 2) {
                ArrayList arrayList4 = new ArrayList();
                for (dus dus6 : dus4.mo9661a()) {
                    arrayList4.add(m9329a(m9335d(dus6)));
                }
                return m9330a(arrayList4);
            } else if (ordinal2 == 3) {
                return m9329a((dus) dus4.mo9661a().get(0));
            } else {
                if (ordinal2 == 22) {
                    return m9335d(m9329a(dus4));
                }
                if (dus4.mo9671q()) {
                    return dus;
                }
                bnsl bnsl5 = (bnsl) dss.f13961a.mo68388c();
                bnsl5.mo68432a("dtq", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("[FenceNormalizer] Unknown NOT context fence type = %s", dus4.f14074a);
                return null;
            }
        }
    }

    /* renamed from: b */
    private static dus m9332b(List list) {
        sdo.m34959a(list);
        sdo.m34974b(!list.isEmpty());
        return new dus(m9328a(bxcl.OR, m9334c(list)));
    }

    /* renamed from: a */
    private static dus m9330a(List list) {
        sdo.m34959a(list);
        sdo.m34974b(!list.isEmpty());
        return new dus(m9328a(bxcl.AND, m9334c(list)));
    }
}
