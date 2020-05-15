package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: bets */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bets extends betv {

    /* renamed from: a */
    final /* synthetic */ beua f112432a;

    /* renamed from: b */
    private long f112433b;

    /* renamed from: c */
    private boolean f112434c;

    public bets(beua beua) {
        this(beua, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61137a() {
        bgmk bgmk = this.f112432a.f112448a;
        this.f112433b = SystemClock.elapsedRealtime();
        berb berb = this.f112432a.f112450c;
        StringBuilder sb = new StringBuilder(59);
        sb.append("addLowPowerTiltDetectionInternalClient 30000");
        sb.toString();
        if (!berb.f112151aa && berb.f112130R.isEmpty() && berb.f112176az.mo62933b()) {
            berb.f112176az.mo62932a(berb);
        }
        berb.f112130R.add(30000L);
        boolean z = true;
        berb.mo60982b(true, false);
        bfmt bfmt = this.f112432a.f112450c.f112118F.f112473b;
        if (bfmt != null) {
            if (bfmt.mo61154a().isEmpty() && !this.f112434c) {
                z = false;
            }
            this.f112434c = z;
        }
    }

    /* renamed from: b */
    public final String mo61140b() {
        return "InVehicle";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo61141c() {
        this.f112434c = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bets(beua beua, boolean z) {
        super(beua);
        this.f112432a = beua;
        this.f112433b = -1;
        this.f112434c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61138a(betv betv) {
        super.mo61138a(betv);
        berb berb = this.f112432a.f112450c;
        StringBuilder sb = new StringBuilder(62);
        sb.append("removeLowPowerTiltDetectionInternalClient 30000");
        sb.toString();
        berb.f112130R.remove(30000L);
        if (berb.f112130R.isEmpty() && berb.f112176az.mo62933b()) {
            berb.f112176az.mo62931a();
        }
        berb.mo60982b(false, false);
    }

    /* renamed from: a */
    public final void mo61139a(ActivityRecognitionResult activityRecognitionResult) {
        if (beua.m95854a(activityRecognitionResult)) {
            this.f112432a.mo61147a(this.f112434c);
        } else if (activityRecognitionResult.mo43491a().mo43513a() == 5) {
            beua beua = this.f112432a;
            beua.mo61146a(new bett(beua, this.f112434c));
        } else if (!beua.m95855b(activityRecognitionResult)) {
            bgmk bgmk = this.f112432a.f112448a;
            if (SystemClock.elapsedRealtime() - this.f112433b > 900000) {
                beua beua2 = this.f112432a;
                beua2.mo61146a(new betz(beua2));
            }
        } else {
            bgmk bgmk2 = this.f112432a.f112448a;
            this.f112433b = SystemClock.elapsedRealtime();
        }
    }
}
