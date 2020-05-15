package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Date;

/* renamed from: besn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class besn extends beti implements bgnt {
    public besn(berb berb) {
        super(berb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo61092D() {
        if (this.f112396d.mo60990f()) {
            mo61107a(new besf(this.f112396d));
        }
    }

    /* renamed from: E */
    public final void mo61097E() {
        mo61099b(cese.f183399a.mo6606a().motionClearsDeepStillState());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(long, boolean):void
      berb.a(java.util.List, int[]):void
      bglw.a(long, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61098a(bfnp bfnp, bfnp bfnp2) {
        if (bfnp2.f114499b == 2 && bfnp2.f114498a >= 0.7d) {
            this.f112396d.mo60974a(false, true);
            this.f112396d.mo60972a(false);
            mo61132c(39);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(long, boolean):void
      berb.a(java.util.List, int[]):void
      bglw.a(long, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void */
    /* renamed from: b */
    public void mo61099b(boolean z) {
        String p = mo61093p();
        StringBuilder sb = new StringBuilder(String.valueOf(p).length() + 40);
        sb.append(p);
        sb.append(": onTrigger: clearDeepStillHistory=");
        sb.append(z);
        sb.toString();
        this.f112396d.mo60974a(false, true);
        if (z) {
            this.f112396d.f112198y.mo61073b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo61100c(boolean z) {
        if (!z) {
            mo61099b(false);
        }
    }

    /* renamed from: g */
    public void mo61083g() {
        super.mo61083g();
        this.f112396d.mo60991g();
        if (this.f112396d.mo60988d()) {
            besj besj = new besj(this.f112396d, this.f112399g);
            if (!cfam.f183546a.mo6606a().sleepDetectionAlarmAllowIdle()) {
                this.f112396d.mo60964a(new bfmg(besj.mo61062c(), 1));
                return;
            }
            berb berb = this.f112396d;
            long c = besj.mo61062c();
            berb.f112193t = new bfmg(c, 0);
            String valueOf = String.valueOf(new Date(bgof.m99492e() + c));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Allow-while-idle alarm set to: ");
            sb.append(c);
            sb.append(" ");
            sb.append(valueOf);
            sb.toString();
            bgns bgns = berb.f112184k;
            bgnq bgnq = bgnq.ACTIVITY_DETECTION;
            bgmj bgmj = berb.f112135W.f112233c;
            bgns.mo62915a(bgnq, c);
        }
    }

    /* renamed from: p */
    public abstract String mo61093p();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61094a(boolean z) {
        this.f112396d.mo60967a(new ActivityRecognitionResult(new DetectedActivity(3, 100), System.currentTimeMillis(), SystemClock.elapsedRealtime(), bevp.SMD_GOUDA.f112768am, (Bundle) null));
        if (this.f112402j) {
            this.f112396d.mo60972a(false);
        }
        if (!this.f112396d.mo60975a()) {
            mo61132c(39);
        }
    }
}
