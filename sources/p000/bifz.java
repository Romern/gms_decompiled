package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: bifz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bifz extends bhpv {

    /* renamed from: b */
    final /* synthetic */ ActivityRecognitionRequest f120487b;

    /* renamed from: c */
    final /* synthetic */ bigb f120488c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bifz(bigb bigb, rkb rkb, ActivityRecognitionRequest activityRecognitionRequest) {
        super(rkb);
        this.f120488c = bigb;
        this.f120487b = activityRecognitionRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rke mo64140a() {
        bigb bigb = this.f120488c;
        aeja aeja = bigb.f120495e;
        return aeja.m51918a(bigb.f120491a, this.f120487b, bigb.mo64587b());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        super.mo9454a(status);
        if (status.mo17710c()) {
            this.f120488c.f120493c = true;
        }
    }
}
