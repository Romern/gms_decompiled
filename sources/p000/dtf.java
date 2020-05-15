package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtf {
    /* renamed from: a */
    private static List m9279a(dus dus) {
        boolean z;
        if (dus.f14074a == bxcl.AND) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        ArrayList arrayList = null;
        for (dus dus2 : dus.mo9661a()) {
            if (dus2.f14074a == bxcl.NOT) {
                if (dus2.mo9661a().size() == 0) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("dtf", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                } else {
                    if (dus2.mo9661a().size() > 1) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a("dtf", "a", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                    }
                    if (((dus) dus2.mo9661a().get(0)).f14074a == bxcl.TIME_FENCE) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dte.m9278a(((dus) dus2.mo9661a().get(0)).mo9664j(), 1));
                    }
                }
            } else if (dus2.f14074a == bxcl.TIME_FENCE) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dte.m9278a(dus2.mo9664j(), 2));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m9283b(dus dus, SparseArray sparseArray) {
        sdo.m34974b(dus.f14074a == bxcl.AND);
        ArrayList arrayList = null;
        for (dus dus2 : dus.mo9661a()) {
            if (dus2.f14074a == bxcl.NOT) {
                if (dus2.mo9661a().size() == 0) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("dtf", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                } else {
                    if (dus2.mo9661a().size() > 1) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a("dtf", "a", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                    }
                    if (((dus) dus2.mo9661a().get(0)).f14074a == bxcl.TIME_FENCE) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dte.m9278a(((dus) dus2.mo9661a().get(0)).mo9664j(), 1));
                    }
                }
            } else if (dus2.f14074a == bxcl.TIME_FENCE) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dte.m9278a(dus2.mo9664j(), 2));
            }
        }
        for (dus dus3 : dus.mo9661a()) {
            if (dus3.mo9671q()) {
                m9281a(dus3, arrayList, sparseArray);
            } else if (dus3.f14074a != bxcl.NOT) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                bnsl3.mo68432a("dtf", "b", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("[FenceDecomposer] Invalid AND fence type due to incorrect normalization.");
            } else if (dus3.mo9661a().size() == 0) {
                bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                bnsl4.mo68432a("dtf", "b", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("[FenceDecomposer] Invalid NOT fence without any leaves.");
            } else {
                if (dus3.mo9661a().size() > 1) {
                    bnsl bnsl5 = (bnsl) dss.f13961a.mo68388c();
                    bnsl5.mo68432a("dtf", "b", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                }
                dus dus4 = (dus) dus3.mo9661a().get(0);
                if (!dus4.mo9671q()) {
                    bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                    bnsl6.mo68432a("dtf", "b", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("[FenceDecomposer] Invalid NOT fence type due to incorrect normalization.");
                } else {
                    m9281a(dus4, arrayList, sparseArray);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9280a(dus dus, SparseArray sparseArray) {
        if (dus.f14074a != bxcl.OR) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dtf", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FenceDecomposer] Not a valid normalized ContextFenceImpl. fence type = %s", dus.f14074a);
            return;
        }
        for (dus dus2 : dus.mo9661a()) {
            if (dus2.f14074a != bxcl.AND) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dtf", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[FenceDecomposer] Expected AND.  Got fence type = %s", dus2.f14074a);
            } else {
                sdo.m34974b(dus2.f14074a == bxcl.AND);
                ArrayList arrayList = null;
                for (dus dus3 : dus2.mo9661a()) {
                    if (dus3.f14074a == bxcl.NOT) {
                        if (dus3.mo9661a().size() == 0) {
                            bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                            bnsl3.mo68432a("dtf", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                        } else {
                            if (dus3.mo9661a().size() > 1) {
                                bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                                bnsl4.mo68432a("dtf", "a", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl4.mo68405a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                            }
                            if (((dus) dus3.mo9661a().get(0)).f14074a == bxcl.TIME_FENCE) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(dte.m9278a(((dus) dus3.mo9661a().get(0)).mo9664j(), 1));
                            }
                        }
                    } else if (dus3.f14074a == bxcl.TIME_FENCE) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dte.m9278a(dus3.mo9664j(), 2));
                    }
                }
                for (dus dus4 : dus2.mo9661a()) {
                    if (dus4.mo9671q()) {
                        m9281a(dus4, arrayList, sparseArray);
                    } else if (dus4.f14074a != bxcl.NOT) {
                        bnsl bnsl5 = (bnsl) dss.f13961a.mo68388c();
                        bnsl5.mo68432a("dtf", "b", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68405a("[FenceDecomposer] Invalid AND fence type due to incorrect normalization.");
                    } else if (dus4.mo9661a().size() == 0) {
                        bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                        bnsl6.mo68432a("dtf", "b", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("[FenceDecomposer] Invalid NOT fence without any leaves.");
                    } else {
                        if (dus4.mo9661a().size() > 1) {
                            bnsl bnsl7 = (bnsl) dss.f13961a.mo68388c();
                            bnsl7.mo68432a("dtf", "b", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl7.mo68405a("[FenceDecomposer] Invalid NOT fence with more than one fences.");
                        }
                        dus dus5 = (dus) dus4.mo9661a().get(0);
                        if (!dus5.mo9671q()) {
                            bnsl bnsl8 = (bnsl) dss.f13961a.mo68388c();
                            bnsl8.mo68432a("dtf", "b", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl8.mo68405a("[FenceDecomposer] Invalid NOT fence type due to incorrect normalization.");
                        } else {
                            m9281a(dus5, arrayList, sparseArray);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9281a(dus dus, List list, SparseArray sparseArray) {
        dun dun;
        int[] g = dus.mo9652g();
        for (int i : g) {
            if (i != -2) {
                dun dun2 = (dun) sparseArray.get(i);
                if (dun2 == null) {
                    if (list != null) {
                        dun = new dun(dul.m9387a(), dui.m9371a());
                        m9282a(list, dun);
                    } else {
                        dun = dun.f14050a;
                    }
                    sparseArray.put(i, dun);
                } else if (list == null) {
                    dun2.mo9634a();
                } else {
                    m9282a(list, dun2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9282a(List list, dun dun) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dte dte = (dte) list.get(i);
            dvl dvl = dte.f13979a;
            bxew a = bxew.m122643a(dvl.f14075b);
            if (a == null) {
                a = bxew.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
            }
            bxew bxew = a;
            if (dte.f13980b != 1) {
                dun.mo9635a(bxew, dvl.mo9705a(), dvl.mo9707j(), dvl.mo9708k());
            } else {
                dun.mo9638b(bxew, dvl.mo9705a(), dvl.mo9707j(), dvl.mo9708k());
            }
        }
    }
}
