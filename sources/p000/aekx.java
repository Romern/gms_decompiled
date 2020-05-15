package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@Deprecated
/* renamed from: aekx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekx extends rtm implements rkk {
    public aekx(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: b */
    public final aekw mo24661a(int i) {
        return new aemr(this.f43665a, i);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return aemj.m52157b(this.f43665a.f30165e);
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", mo7183bo());
        return a.toString();
    }
}
