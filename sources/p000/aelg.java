package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;

/* renamed from: aelg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aelg extends aemc {

    /* renamed from: a */
    final /* synthetic */ String f63489a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aelg(rjo rjo, rkb rkb, String str) {
        super(rjo, rkb);
        this.f63489a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aene aene = (aene) rjd;
        aenn aenn = new aenn(this);
        String str = this.f63489a;
        sdo.m34966a(aenn, "callback cannot be null");
        ((aenl) aene.mo25289B()).mo34369a(str, aene.f63536a, aenn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new PlacePhotoMetadataResult(status, null);
    }
}
