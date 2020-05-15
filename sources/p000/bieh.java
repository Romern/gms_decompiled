package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.location.places.personalized.PlaceUserData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: bieh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bieh extends bien {

    /* renamed from: b */
    private final UserDataType f120381b;

    /* renamed from: c */
    private final aenr f120382c;

    public bieh(UserDataType userDataType, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "GetPlaceUserData", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(userDataType);
        sdo.m34959a(aenr);
        this.f120381b = userDataType;
        this.f120382c = aenr;
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
        PlaceUserData placeUserData;
        super.mo6502a(context);
        if (this.f120381b.equals(UserDataType.f79502b)) {
            try {
                List<AliasedPlace> a = mo64567f().mo64493a(this.f120388a);
                ArrayList arrayList = new ArrayList(a.size());
                for (AliasedPlace aliasedPlace : a) {
                    String str = (String) aliasedPlace.f79579b.get(0);
                    if (str.equals("Home")) {
                        placeUserData = PlaceUserData.m66971a(this.f120388a.f79574d, aliasedPlace.f79578a, Arrays.asList(PlaceAlias.f79582a));
                    } else if (str.equals("Work")) {
                        placeUserData = PlaceUserData.m66971a(this.f120388a.f79574d, aliasedPlace.f79578a, Arrays.asList(PlaceAlias.f79583b));
                    } else {
                        placeUserData = null;
                    }
                    if (placeUserData != null) {
                        arrayList.add(placeUserData);
                    }
                }
                bioc.m102651c(0, arrayList, this.f120382c);
            } catch (VolleyError | gid | TimeoutException e) {
                throw bien.m102124a(e);
            }
        } else {
            throw new biem(9004);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102651c(status.f30115i, Collections.emptyList(), this.f120382c);
    }
}
