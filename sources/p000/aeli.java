package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@Deprecated
/* renamed from: aeli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeli extends rtm implements rkk {

    /* renamed from: b */
    public final Status f63490b;

    /* renamed from: c */
    public final String f63491c;

    public aeli(DataHolder dataHolder) {
        super(dataHolder);
        Bundle bundle;
        this.f63490b = aemj.m52157b(dataHolder.f30165e);
        this.f63491c = (dataHolder == null || (bundle = dataHolder.f30166f) == null) ? null : bundle.getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
    }

    /* renamed from: b */
    public final aelh mo24661a(int i) {
        return new aeoj(this.f43665a, i);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f63490b;
    }
}
