package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: egb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egb {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105 A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108 A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010e A[Catch:{ Exception -> 0x0191 }] */
    /* renamed from: a */
    public static ContextDataFilterImpl m10345a(tiw tiw) {
        tit tit;
        TimeFilterImpl timeFilterImpl;
        KeyFilterImpl keyFilterImpl;
        tit tit2;
        tiw tiw2 = tiw;
        if (tiw2 == null) {
            return null;
        }
        try {
            tit tit3 = new tit();
            for (tiv tiv : tiw2.f46157b) {
                int i = tiv.f46151c;
                if ((tiv.f46149a & 4) != 0) {
                    tjb tjb = tiv.f46152d;
                    if (tjb == null) {
                        tjb = tjb.f46179c;
                    }
                    if (tjb != null) {
                        try {
                            tkb tkb = new tkb();
                            if (tjb.f46181a.size() == 0) {
                                tit = tit3;
                            } else {
                                for (tja tja : tjb.f46181a) {
                                    tit2 = tit3;
                                    try {
                                        tkb.mo26622a(tja.f46177b, tja.f46178c);
                                        tit3 = tit2;
                                    } catch (Exception e) {
                                        e = e;
                                        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                                        bnsl.mo68437a(e);
                                        bnsl.mo68432a("egb", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68405a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
                                        timeFilterImpl = null;
                                        if ((tiv.f46149a & 8) != 0) {
                                        }
                                        if (timeFilterImpl == null) {
                                        }
                                    }
                                }
                                tit = tit3;
                            }
                            if (tjb.f46182b.size() != 0) {
                                tkb.mo26623a(bqcn.m112584a(tjb.f46182b));
                            }
                            timeFilterImpl = tkb.mo26620a();
                        } catch (Exception e2) {
                            e = e2;
                            tit2 = tit3;
                            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                            bnsl2.mo68437a(e);
                            bnsl2.mo68432a("egb", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
                            timeFilterImpl = null;
                            if ((tiv.f46149a & 8) != 0) {
                            }
                            if (timeFilterImpl == null) {
                            }
                        }
                    } else {
                        tit = tit3;
                        timeFilterImpl = null;
                    }
                } else {
                    tit = tit3;
                    timeFilterImpl = null;
                }
                if ((tiv.f46149a & 8) != 0) {
                    tiy tiy = tiv.f46153e;
                    if (tiy == null) {
                        tiy = tiy.f46165b;
                    }
                    if (tiy != null) {
                        try {
                            tjv tjv = new tjv();
                            for (tix tix : tiy.f46167a) {
                                tjv.f46220a.add(new KeyFilterImpl.Inclusion((String[]) tix.f46162a.toArray(new String[0]), (String[]) tix.f46163b.toArray(new String[0]), (String[]) tix.f46164c.toArray(new String[0])));
                            }
                            keyFilterImpl = tjv.mo26612a();
                        } catch (Exception e3) {
                            bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                            bnsl3.mo68437a(e3);
                            bnsl3.mo68432a("egb", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("[ContextManagerUtil] Could not convert ContextDataFilterProto.KeyFilter proto.");
                            keyFilterImpl = null;
                        }
                    } else {
                        keyFilterImpl = null;
                    }
                } else {
                    keyFilterImpl = null;
                }
                if (timeFilterImpl == null) {
                    tit3 = tit;
                    tit3.mo26579a(i);
                } else {
                    tit3 = tit;
                    if (keyFilterImpl != null) {
                        sdo.m34959a(keyFilterImpl);
                        if (tit3.f46144a == null) {
                            tit3.f46144a = new HashSet();
                        }
                        tit3.f46144a.add(new ContextDataFilterImpl.Inclusion(-1, i, timeFilterImpl, keyFilterImpl));
                    } else {
                        tit3.mo26580a(i, timeFilterImpl);
                    }
                }
            }
            for (String str : tiw2.f46158c) {
                if (tit3.f46145b == null) {
                    tit3.f46145b = new HashSet();
                }
                tit3.f46145b.add(str);
            }
            tiz tiz = tiw2.f46159d;
            if (tiz == null) {
                tiz = tiz.f46168e;
            }
            if (tiz.f46172c > 0) {
                tiz tiz2 = tiw2.f46159d;
                if (tiz2 == null) {
                    tiz2 = tiz.f46168e;
                }
                tit3.mo26582b(tiz2.f46172c);
            }
            tiz tiz3 = tiw2.f46159d;
            if (tiz3 == null) {
                tiz3 = tiz.f46168e;
            }
            if (tiz3.f46173d.size() != 0) {
                tiz tiz4 = tiw2.f46159d;
                if (tiz4 == null) {
                    tiz4 = tiz.f46168e;
                }
                tit3.mo26581a(bqcn.m112584a(tiz4.f46173d));
            }
            return (ContextDataFilterImpl) tit3.mo26578a();
        } catch (Exception e4) {
            bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
            bnsl4.mo68437a(e4);
            bnsl4.mo68432a("egb", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("[ContextManagerUtil] Could not create ContextDataFilterImpl from proto.");
            return null;
        }
    }

    /* renamed from: a */
    public static KeyFilterImpl m10346a(tiy tiy) {
        if (tiy == null) {
            return null;
        }
        try {
            tjv tjv = new tjv();
            for (tix tix : tiy.f46167a) {
                tjv.f46220a.add(new KeyFilterImpl.Inclusion((String[]) tix.f46162a.toArray(new String[0]), (String[]) tix.f46163b.toArray(new String[0]), (String[]) tix.f46164c.toArray(new String[0])));
            }
            return tjv.mo26612a();
        } catch (Exception e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("egb", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextManagerUtil] Could not convert ContextDataFilterProto.KeyFilter proto.");
            return null;
        }
    }

    /* renamed from: a */
    public static TimeFilterImpl m10347a(tjb tjb) {
        if (tjb == null) {
            return null;
        }
        try {
            tkb tkb = new tkb();
            if (tjb.f46181a.size() != 0) {
                for (tja tja : tjb.f46181a) {
                    tkb.mo26622a(tja.f46177b, tja.f46178c);
                }
            }
            if (tjb.f46182b.size() != 0) {
                tkb.mo26623a(bqcn.m112584a(tjb.f46182b));
            }
            return tkb.mo26620a();
        } catch (Exception e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("egb", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000a  */
    /* renamed from: a */
    public static boolean m10348a(ContextData contextData, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            tlr tlr = ((dwa) it.next()).f14244d;
            if (tlr == null || tlr.mo18051a(contextData)) {
                return true;
            }
            while (it.hasNext()) {
            }
        }
        return false;
    }
}
