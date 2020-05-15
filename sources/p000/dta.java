package p000;

import java.util.Iterator;

/* renamed from: dta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dta {
    /* renamed from: a */
    private static dus m9270a(dus dus) {
        if (dus.f14074a != bxcl.NOT) {
            return null;
        }
        if (dus.mo9661a().size() == 0) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dta", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FenceComparator] Invalid NOT fence without any leaves.");
            return null;
        }
        if (dus.mo9661a().size() > 1) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("dta", "a", 171, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[FenceComparator] Invalid NOT fence with more than one fences.");
        }
        dus dus2 = (dus) dus.mo9661a().get(0);
        if (dus2.mo9671q()) {
            return dus2;
        }
        bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
        bnsl3.mo68432a("dta", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("[FenceComparator] Invalid NOT fence type due to incorrect normalization.");
        return null;
    }

    /* renamed from: b */
    private static boolean m9273b(dus dus, dus dus2) {
        for (dus dus3 : dus2.mo9661a()) {
            if (dus3.f14074a != bxcl.AND) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dta", "b", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[FenceComparator] findMatching: Expected AND. Got %s", dus3.f14074a);
            } else if (dus.mo9661a().size() == dus3.mo9661a().size()) {
                for (dus dus4 : dus.mo9661a()) {
                    if (!dus4.mo9671q()) {
                        if (dus4.f14074a == bxcl.NOT && !m9272a((dus) dus4.mo9661a().get(0), true, dus3)) {
                        }
                    } else if (!m9272a(dus4, false, dus3)) {
                    }
                }
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m9274c(dus dus, dus dus2) {
        String valueOf = String.valueOf(dus);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Primitive1: ");
        sb.append(valueOf);
        sb.toString();
        String valueOf2 = String.valueOf(dus2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
        sb2.append("Primitive2: ");
        sb2.append(valueOf2);
        sb2.toString();
        bxcl bxcl = dus.f14074a;
        if (bxcl != dus2.f14074a) {
            Object[] objArr = {Integer.valueOf(bxcl.f162810z), Integer.valueOf(dus2.f14074a.f162810z)};
            return false;
        }
        duv o = dus.mo9669o();
        duv o2 = dus2.mo9669o();
        if (o != null && o2 != null) {
            return o.equals(o2);
        }
        new Object[1][0] = Integer.valueOf(dus.f14074a.f162810z);
        return false;
    }

    /* renamed from: a */
    public static boolean m9271a(dus dus, dus dus2) {
        dus t = dus.mo9674t();
        dus t2 = dus2.mo9674t();
        if (t.f14074a != bxcl.OR || t2.f14074a != bxcl.OR) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dta", "a", 33, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("[FenceComparator] Expected OR. fence1 type=%s, fence2 type=%s", dus.f14074a, dus2.f14074a);
            return false;
        } else if (t.mo9661a().size() != t2.mo9661a().size()) {
            return false;
        } else {
            for (dus dus3 : t.mo9661a()) {
                if (dus3.f14074a == bxcl.AND) {
                    Iterator it = t2.mo9661a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        dus dus4 = (dus) it.next();
                        if (dus4.f14074a != bxcl.AND) {
                            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                            bnsl2.mo68432a("dta", "b", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68420a("[FenceComparator] findMatching: Expected AND. Got %s", dus4.f14074a);
                        } else if (dus3.mo9661a().size() == dus4.mo9661a().size()) {
                            Iterator it2 = dus3.mo9661a().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    dus dus5 = (dus) it2.next();
                                    if (!dus5.mo9671q()) {
                                        if (dus5.f14074a == bxcl.NOT && !m9272a((dus) dus5.mo9661a().get(0), true, dus4)) {
                                            break;
                                        }
                                    } else if (!m9272a(dus5, false, dus4)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                    bnsl3.mo68432a("dta", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("[FenceComparator] areEquivalent: Expected AND. Got %s", dus3.f14074a);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m9272a(dus dus, boolean z, dus dus2) {
        for (dus dus3 : dus2.mo9661a()) {
            if (z) {
                if (dus3.f14074a == bxcl.NOT) {
                    dus dus4 = null;
                    if (dus3.f14074a == bxcl.NOT) {
                        if (dus3.mo9661a().size() == 0) {
                            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                            bnsl.mo68432a("dta", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("[FenceComparator] Invalid NOT fence without any leaves.");
                        } else {
                            if (dus3.mo9661a().size() > 1) {
                                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                                bnsl2.mo68432a("dta", "a", 171, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("[FenceComparator] Invalid NOT fence with more than one fences.");
                            }
                            dus dus5 = (dus) dus3.mo9661a().get(0);
                            if (!dus5.mo9671q()) {
                                bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                                bnsl3.mo68432a("dta", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("[FenceComparator] Invalid NOT fence type due to incorrect normalization.");
                            } else {
                                dus4 = dus5;
                            }
                        }
                    }
                    if (dus4 != null && dus.f14074a == dus4.f14074a) {
                        return m9274c(dus, dus4);
                    }
                } else {
                    continue;
                }
            } else if (dus3.mo9671q() && dus3.f14074a == dus.f14074a) {
                return m9274c(dus, dus3);
            }
        }
        return false;
    }
}
