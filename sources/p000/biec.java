package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeoutException;

/* renamed from: biec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biec extends bien {

    /* renamed from: b */
    private final aeos f120366b;

    public biec(PlacesParams placesParams, aeos aeos, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "GetNicknames", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(aeos);
        this.f120366b = aeos;
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
        return bhqq.m101355a(this.f120388a, Arrays.asList("Nicknames"));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        biam f = mo64567f();
        try {
            PlacesParams placesParams = this.f120388a;
            this.f120366b.mo34404c(new AliasedPlacesResult(aemj.m52157b(0), bian.m101875a(f.f120053a, (bvmb) f.mo64492a(new bibh(f.f120057e, f.f120053a, f.f120054b, "getAliases", placesParams), placesParams))));
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f120366b.mo34404c(new AliasedPlacesResult(status, Collections.emptyList()));
    }
}
