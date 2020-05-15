package p000;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: betv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class betv {

    /* renamed from: e */
    final /* synthetic */ beua f112440e;

    public betv(beua beua) {
        this.f112440e = beua;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61137a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61138a(betv betv) {
        beua beua = this.f112440e;
        if (beua.f112453f != -1) {
            beua.f112449b.mo62914a(bgnq.VEHICLE_EXIT_DETECTOR);
            beua.f112453f = -1;
        }
    }

    /* renamed from: a */
    public void mo61139a(ActivityRecognitionResult activityRecognitionResult) {
    }

    /* renamed from: b */
    public abstract String mo61140b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo61141c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo61142d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61143a(boolean z) {
        if (!z) {
            beua beua = this.f112440e;
            beua.mo61146a(new betu(beua));
        }
    }
}
