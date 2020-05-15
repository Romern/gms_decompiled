package com.google.android.gms.trustlet.onbody.internal;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhonePositionTracker$PhonePositionReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auwc f109252a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhonePositionTracker$PhonePositionReceiver(auwc auwc) {
        super("trustlet_onbody");
        this.f109252a = auwc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        boolean z;
        boolean z2;
        if (!ActivityRecognitionResult.m66819a(intent)) {
            auwc.f92631a.mo50711a("Received intent %s %s without AR result", intent, intent.getExtras());
            return;
        }
        auwc auwc = this.f109252a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aunx aunx = auwc.f92631a;
        auwc.f92641k = elapsedRealtime;
        auwc auwc2 = this.f109252a;
        if (auwc2.f92641k < auwc2.f92639i + 10000) {
            aunx aunx2 = auwc.f92631a;
            auwc auwc3 = this.f109252a;
            long j = auwc3.f92639i;
            long j2 = auwc3.f92641k;
            StringBuilder sb = new StringBuilder(98);
            sb.append("On-person reset at ");
            sb.append(j);
            sb.append(", received activity result at ");
            sb.append(j2);
            sb.append(", ignore.");
            aunx2.mo50711a(sb.toString(), new Object[0]);
            return;
        }
        ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
        if (b.f79301b >= auwc2.f92642l && auwc2.f92637g) {
            DetectedActivity a = b.mo43491a();
            int a2 = a.mo43513a();
            if (a2 != 5) {
                if (a2 == 9) {
                    z2 = a.f79320e <= 50;
                    if (!z2) {
                        z = true;
                    }
                } else if (a2 == 10) {
                    if (((long) a.f79320e) > chac.f188164a.mo6606a().mo84861q()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j3 = b.f79301b;
                    if (j3 > auwc2.f92643m) {
                        auwc2.f92643m = j3;
                        z = false;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                auwc.f92631a.mo50711a(String.format("Received AR result: %s at %s", a, Long.valueOf(b.f79301b)), new Object[0]).mo50708c();
                if (!z2) {
                    auwc2.f92633c.set(-1);
                    if (a.mo43513a() == 10) {
                        auwc2.f92635e.mo50985g();
                        auwc2.mo50987a(b.f79301b, false, a.f79320e);
                    }
                } else if (z) {
                    long j4 = b.f79301b;
                    auwc2.f92642l = j4;
                    auwc2.f92633c.compareAndSet(-1, j4);
                    auwc.f92631a.mo50711a("Off body for %d millis", Long.valueOf(j4 - auwc2.f92633c.get())).mo50708c();
                    auwc.f92631a.mo50711a("Update on person state based on new OFF_BODY result", new Object[0]).mo50708c();
                    if (j4 - auwc2.f92633c.get() >= auwc.f92632b) {
                        auwc.f92631a.mo50711a("Switching to off person state", new Object[0]).mo50708c();
                        auwc2.f92635e.mo50981a();
                    }
                    if (a.mo43513a() == 9) {
                        auwc2.mo50987a(b.f79301b, true, a.f79320e);
                    }
                } else if (a.mo43513a() == 10) {
                    auwc.f92631a.mo50711a("Switching to unauthorized state because of gait.", new Object[0]).mo50708c();
                    auwc2.f92635e.mo50984f();
                    auwc2.mo50987a(b.f79301b, false, a.f79320e);
                }
                if (auwc2.f92640j.isPowerSaveMode() && auwc2.f92637g) {
                    auwc.f92631a.mo50711a("Power saving mode, disable trustlet.", new Object[0]).mo50708c();
                    auwc2.f92635e.mo50982a("On-body_detection_is_disabled_in_power_saving_mode");
                    return;
                }
            }
            z2 = a.f79320e > 50;
            z = false;
            auwc.f92631a.mo50711a(String.format("Received AR result: %s at %s", a, Long.valueOf(b.f79301b)), new Object[0]).mo50708c();
            if (!z2) {
            }
            if (auwc2.f92640j.isPowerSaveMode()) {
            }
        }
    }
}
