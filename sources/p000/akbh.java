package p000;

import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: akbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akbh extends ajyy {

    /* renamed from: a */
    private rod f71552a;

    public akbh(rod rod) {
        this.f71552a = rod;
    }

    /* renamed from: a */
    public final void mo39148a() {
        akbj.m59294a().mo39151a(this.f71552a);
        this.f71552a = null;
    }

    /* renamed from: a */
    public final void mo38778a(OnTransferUpdateParams onTransferUpdateParams) {
        if (this.f71552a != null) {
            if (!onTransferUpdateParams.f81094b.f81056e) {
                akbj.m59294a().mo39150a(onTransferUpdateParams.f81093a, this.f71552a);
            } else {
                akbj.m59294a().mo39149a(onTransferUpdateParams.f81093a);
            }
            this.f71552a.mo24968a(new akbg(onTransferUpdateParams));
        }
    }
}
