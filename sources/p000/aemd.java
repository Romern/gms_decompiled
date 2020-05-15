package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlaceFilter;

/* renamed from: aemd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemd extends aemc {

    /* renamed from: a */
    final /* synthetic */ PlaceFilter f63509a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aemd(rjo rjo, rkb rkb, PlaceFilter placeFilter) {
        super(rjo, rkb);
        this.f63509a = placeFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aeoa aeoa = (aeoa) rjd;
        aemf aemf = new aemf(this);
        PlaceFilter placeFilter = this.f63509a;
        sdo.m34966a(aemf, "callback == null");
        ((aeni) aeoa.mo25289B()).mo34350a(placeFilter, aeoa.f63545a, aemf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new aelr(DataHolder.m22539b(status.f30115i), 100);
    }
}
