package p000;

import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: ansd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansd extends spp {

    /* renamed from: b */
    final /* synthetic */ rtu f77573b;

    public ansd(rtu rtu) {
        this.f77573b = rtu;
    }

    /* renamed from: a */
    public final void onResponse(SafeParcelResponse safeParcelResponse) {
        rts.m34439a(this.f77573b, (PersonEntity) safeParcelResponse.mo17872a(PersonEntity.CREATOR));
    }
}
