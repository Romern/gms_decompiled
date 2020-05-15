package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.personalized.UserPlacesResult;
import java.util.Collections;

/* renamed from: aepa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepa extends aemc {
    public aepa(rjo rjo, rkb rkb) {
        super(rjo, rkb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aene aene = (aene) rjd;
        aeou aeou = new aeou(this);
        sdo.m34966a(aeou, "callback == null");
        ((aenl) aene.mo25289B()).mo34364a(aene.f63536a, aeou);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new UserPlacesResult(status, Collections.emptyList());
    }
}
