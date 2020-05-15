package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: aelf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aelf extends aemc {

    /* renamed from: a */
    final /* synthetic */ String f63485a;

    /* renamed from: b */
    final /* synthetic */ int f63486b;

    /* renamed from: c */
    final /* synthetic */ int f63487c;

    /* renamed from: m */
    final /* synthetic */ int f63488m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aelf(rjo rjo, rkb rkb, String str, int i, int i2, int i3) {
        super(rjo, rkb);
        this.f63485a = str;
        this.f63486b = i;
        this.f63487c = i2;
        this.f63488m = i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aene aene = (aene) rjd;
        aenn aenn = new aenn(this);
        String str = this.f63485a;
        int i = this.f63486b;
        int i2 = this.f63487c;
        int i3 = this.f63488m;
        sdo.m34966a(aenn, "callback cannot be null");
        ((aenl) aene.mo25289B()).mo34368a(str, i, i2, i3, aene.f63536a, aenn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new PlacePhotoResult(status, null);
    }
}
