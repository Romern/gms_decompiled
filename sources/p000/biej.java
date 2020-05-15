package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: biej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biej extends bien {

    /* renamed from: b */
    private final aeos f120385b;

    public biej(PlacesParams placesParams, aeos aeos, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "GetStandardAliases", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(aeos);
        this.f120385b = aeos;
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
        return bhqq.m101355a(this.f120388a, Arrays.asList("Home", "Work"));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        List list;
        String str;
        super.mo6502a(context);
        biam f = mo64567f();
        bibq g = mo64568g();
        try {
            if (!cghh.f186930a.mo6606a().mo83794k()) {
                list = f.mo64493a(this.f120388a);
            } else {
                bvtw bvtw = (bvtw) g.mo64508a(new bicg(g.f120156c, g.f120157d, "GMS_CORE_PLACES"), this.f120388a);
                if (bvtw == null || bvtw.f157628a.size() == 0) {
                    list = bngx.m109376e();
                } else {
                    ArrayList arrayList = new ArrayList(bvtw.f157628a.size());
                    for (bvud bvud : bvtw.f157628a) {
                        int i = bvud.f157656a;
                        if (!((i & 1) == 0 || (i & 2) == 0)) {
                            bvuc a = bvuc.m121468a(bvud.f157657b);
                            if (a == null) {
                                a = bvuc.UNKNOWN_TYPE;
                            }
                            if (a != bvuc.CONFIRMED_HOME) {
                                str = a == bvuc.CONFIRMED_WORK ? "Work" : null;
                            } else {
                                str = "Home";
                            }
                            arrayList.add(AliasedPlace.m66969a(bvud.f157658c, Arrays.asList(str)));
                        }
                    }
                    list = bngx.m109368a((Collection) arrayList);
                }
            }
            this.f120385b.mo34404c(new AliasedPlacesResult(aemj.m52157b(0), list));
        } catch (chuw | VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f120385b.mo34404c(new AliasedPlacesResult(status, Collections.emptyList()));
    }
}
