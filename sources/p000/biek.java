package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.UserPlace;
import com.google.android.gms.location.places.personalized.UserPlacesResult;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: biek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biek extends bien {

    /* renamed from: b */
    private final aeov f120386b;

    public biek(PlacesParams placesParams, aeov aeov, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "GetUserPlaces", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(aeov);
        this.f120386b = aeov;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 3;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        PlacesParams placesParams = this.f120388a;
        List<Integer> asList = Arrays.asList(1, 2);
        bpqk c = bhqq.m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = bhqq.m101359a(14, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bpqt bpqt = (bpqt) bpqu.f138787b.mo74144da();
        for (Integer num : asList) {
            int intValue = num.intValue();
            if (intValue == 1) {
                bpqt.mo68973a(bpry.INFERRED_HOME);
            } else if (intValue == 2) {
                bpqt.mo68973a(bpry.INFERRED_WORK);
            }
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bpqu bpqu = (bpqu) bpqt.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bpqu.getClass();
        bprg.f138847q = bpqu;
        bprg.f138831a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprg bprg3 = (bprg) bxvd2.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprg3.getClass();
        bpqk.f138742i = bprg3;
        bpqk.f138734a |= 64;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        List list;
        super.mo6502a(context);
        biam f = mo64567f();
        bibq g = mo64568g();
        try {
            if (cghh.f186930a.mo6606a().mo83788e()) {
                bvtw bvtw = (bvtw) g.mo64508a(new bich(g.f120156c, g.f120157d, "GMS_CORE_PLACES"), this.f120388a);
                if (bvtw == null || bvtw.f157628a.size() == 0) {
                    list = bngx.m109376e();
                } else {
                    ArrayList arrayList = new ArrayList(bvtw.f157628a.size());
                    HashMap hashMap = new HashMap();
                    for (bvud bvud : bvtw.f157628a) {
                        int i = bvud.f157656a;
                        if (!((i & 1) == 0 || (i & 2) == 0)) {
                            bvuc a = bvuc.m121468a(bvud.f157657b);
                            if (a == null) {
                                a = bvuc.UNKNOWN_TYPE;
                            }
                            int i2 = a != bvuc.INFERRED_HOME ? a == bvuc.INFERRED_WORK ? 2 : -1 : 1;
                            if (i2 >= 0) {
                                if (!hashMap.containsKey(bvud.f157658c)) {
                                    hashMap.put(bvud.f157658c, new ArrayList(Arrays.asList(Integer.valueOf(i2))));
                                } else {
                                    ((List) hashMap.get(bvud.f157658c)).add(Integer.valueOf(i2));
                                }
                            }
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        arrayList.add(UserPlace.m66972a(str, (List) hashMap.get(str)));
                    }
                    list = bngx.m109368a((Collection) arrayList);
                }
            } else {
                PlacesParams placesParams = this.f120388a;
                bvmb bvmb = (bvmb) f.mo64492a(new bibk(f.f120057e, f.f120053a, f.f120054b, "getAliases", placesParams), placesParams);
                Context context2 = f.f120053a;
                if (bvmb != null) {
                    if (bvmb.f156633b.size() != 0) {
                        bvow bvow = bvmb.f156632a;
                        if (bvow == null) {
                            bvow = bvow.f157230c;
                        }
                        bian.m101877a(context2, bvow);
                        list = new ArrayList(bvmb.f156633b.size());
                        HashMap hashMap2 = new HashMap();
                        for (bvkx bvkx : bvmb.f156633b) {
                            int i3 = bvkx.f156487a;
                            if (!((i3 & 1) == 0 || (i3 & 2) == 0)) {
                                bvkz a2 = bvkz.m121221a(bvkx.f156488b);
                                if (a2 == null) {
                                    a2 = bvkz.HOME;
                                }
                                int i4 = a2 != bvkz.INFERRED_HOME ? a2 == bvkz.INFERRED_WORK ? 2 : -1 : 1;
                                if (i4 >= 0) {
                                    if (!hashMap2.containsKey(bvkx.f156489c)) {
                                        hashMap2.put(bvkx.f156489c, new ArrayList(Arrays.asList(Integer.valueOf(i4))));
                                    } else {
                                        ((List) hashMap2.get(bvkx.f156489c)).add(Integer.valueOf(i4));
                                    }
                                }
                            }
                        }
                        for (String str2 : hashMap2.keySet()) {
                            list.add(UserPlace.m66972a(str2, (List) hashMap2.get(str2)));
                        }
                    }
                }
                list = new ArrayList();
            }
            this.f120386b.mo34405a(new UserPlacesResult(aemj.m52157b(0), list));
        } catch (chuw | VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f120386b.mo34405a(new UserPlacesResult(status, Collections.emptyList()));
    }
}
