package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.personalized.PlaceUserData;

@Deprecated
/* renamed from: aeox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeox extends rts implements rkk {

    /* renamed from: b */
    private final Status f63578b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeox(DataHolder dataHolder) {
        super(dataHolder, PlaceUserData.CREATOR);
        Status b = aemj.m52157b(dataHolder.f30165e);
        sdo.m34974b(dataHolder.f30165e == b.f30115i);
        this.f63578b = b;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f63578b;
    }
}
