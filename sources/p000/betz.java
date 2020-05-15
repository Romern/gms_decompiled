package p000;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: betz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betz extends betv {

    /* renamed from: a */
    final /* synthetic */ beua f112447a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public betz(beua beua) {
        super(beua);
        this.f112447a = beua;
    }

    /* renamed from: b */
    public final String mo61140b() {
        return "WaitingForInVehicle";
    }

    /* renamed from: a */
    public final void mo61139a(ActivityRecognitionResult activityRecognitionResult) {
        if (beua.m95855b(activityRecognitionResult)) {
            beua beua = this.f112447a;
            beua.mo61146a(new betr(beua));
        }
    }
}
