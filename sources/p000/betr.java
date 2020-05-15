package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: betr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betr extends betv {

    /* renamed from: a */
    final /* synthetic */ beua f112428a;

    /* renamed from: b */
    private long f112429b;

    /* renamed from: c */
    private long f112430c = -1;

    /* renamed from: d */
    private int f112431d = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public betr(beua beua) {
        super(beua);
        this.f112428a = beua;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(long, boolean):void
     arg types: [int, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(long, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61137a() {
        bgmk bgmk = this.f112428a.f112448a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f112429b = elapsedRealtime;
        this.f112430c = elapsedRealtime;
        this.f112428a.f112450c.mo60962a(120000L, false);
    }

    /* renamed from: b */
    public final String mo61140b() {
        return "ConfirmingInVehicle";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61138a(betv betv) {
        super.mo61138a(betv);
        this.f112428a.f112450c.mo60985c(120000);
    }

    /* renamed from: a */
    public final void mo61139a(ActivityRecognitionResult activityRecognitionResult) {
        if (beua.m95855b(activityRecognitionResult)) {
            bgmk bgmk = this.f112428a.f112448a;
            if (SystemClock.elapsedRealtime() - this.f112430c >= 60000) {
                bgmk bgmk2 = this.f112428a.f112448a;
                this.f112430c = SystemClock.elapsedRealtime();
                int i = this.f112431d + 1;
                this.f112431d = i;
                StringBuilder sb = new StringBuilder(26);
                sb.append("inVehicleCount=");
                sb.append(i);
                sb.toString();
                if (this.f112431d > 1) {
                    bgmk bgmk3 = this.f112428a.f112448a;
                    if (SystemClock.elapsedRealtime() - this.f112429b > 180000) {
                        beua beua = this.f112428a;
                        beua.mo61146a(new bets(beua));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!beua.m95854a(activityRecognitionResult)) {
            bgmk bgmk4 = this.f112428a.f112448a;
            if (SystemClock.elapsedRealtime() - this.f112430c <= 900000) {
                return;
            }
        }
        beua beua2 = this.f112428a;
        beua2.mo61146a(new betz(beua2));
    }
}
