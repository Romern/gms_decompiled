package p000;

import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: aejq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aejq extends aejr {

    /* renamed from: a */
    final /* synthetic */ RemoveGeofencingRequest f63459a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aejq(rkb rkb, RemoveGeofencingRequest removeGeofencingRequest) {
        super(rkb);
        this.f63459a = removeGeofencingRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aekl aekl = (aekl) rjd;
        RemoveGeofencingRequest removeGeofencingRequest = this.f63459a;
        aekl.mo25288A();
        sdo.m34966a(removeGeofencingRequest, "removeGeofencingRequest can't be null.");
        sdo.m34966a(this, "ResultHolder not provided.");
        ((aekb) aekl.mo25289B()).mo34225a(removeGeofencingRequest, new aekk(this));
    }
}
