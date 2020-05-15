package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;

/* renamed from: bexq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexq {

    /* renamed from: a */
    final bexo f112969a = new bexo();

    /* renamed from: b */
    int f112970b = -1;

    /* renamed from: c */
    private long f112971c = 0;

    /* renamed from: d */
    private boolean f112972d = false;

    /* renamed from: e */
    private final bexz f112973e = new bexz();

    public bexq(int i) {
        this.f112970b = i;
    }

    /* renamed from: a */
    private static final bexp m96042a() {
        return new bexp(1, -1);
    }

    /* renamed from: a */
    static final boolean m96043a(int i) {
        return i == 16 || i == 0;
    }

    /* renamed from: b */
    static final boolean m96045b(int i) {
        return cery.m138142b() ? DetectedActivity.m66833b(i) : i == 0;
    }

    /* renamed from: c */
    private final bexp m96046c(int i) {
        m96047d(i);
        return new bexp(2, i);
    }

    /* renamed from: d */
    private final void m96047d(int i) {
        this.f112970b = i;
        bexo bexo = this.f112969a;
        bexo.f112964a = 0;
        bexo.f112965b = 0;
        bexo.f112966c = -1;
        if (i == 0 || i == 16 || i == 17) {
            this.f112971c = SystemClock.elapsedRealtime();
        }
        if (!m96043a(this.f112970b)) {
            this.f112972d = false;
        }
    }

    /* renamed from: a */
    private static final boolean m96044a(ActivityRecognitionResult activityRecognitionResult) {
        return ((long) aega.m51812a(activityRecognitionResult.mo43493c())) >= cesh.f183401a.mo6606a().minPersonalInVehicleConfidence();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ce, code lost:
        if (r8 == 8) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d6, code lost:
        if (r7.f112969a.mo61236c(3) < r6) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d8, code lost:
        r7.f112969a.mo61235b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e2, code lost:
        return m96042a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r2 != 6) goto L_0x00e0;
     */
    /* renamed from: a */
    public final synchronized bexp mo61238a(ActivityRecognitionResult activityRecognitionResult, boolean z, boolean z2, boolean z3) {
        int i = this.f112970b;
        StringBuilder sb = new StringBuilder(142);
        sb.append("Current activity = ");
        sb.append(i);
        sb.append(", speed = ");
        sb.append(0.0f);
        sb.append(", isWifiConnected = ");
        sb.append(z);
        sb.append(", isVehicleBluetoothConnected = ");
        sb.append(z2);
        sb.append(", isDeepStillMode = ");
        sb.append(z3);
        sb.toString();
        DetectedActivity b = activityRecognitionResult.mo43492b();
        int i2 = 0;
        if (!cery.m138142b() && DetectedActivity.m66833b(b.mo43513a())) {
            b = new DetectedActivity(0, b.f79320e);
        }
        int a = b.mo43513a();
        int i3 = b.f79320e;
        StringBuilder sb2 = new StringBuilder(66);
        sb2.append("Most probable new activity = ");
        sb2.append(a);
        sb2.append(", confidence = ");
        sb2.append(i3);
        sb2.toString();
        if (!z3) {
            if (this.f112970b != 0 && !cery.m138142b()) {
                if (Float.compare(0.0f, (float) cesh.f183401a.mo6606a().minInVehicleSpeed()) >= 0) {
                    StringBuilder sb3 = new StringBuilder(87);
                    sb3.append("Received vehicular speed measurements: ");
                    sb3.append(0.0f);
                    sb3.append("m/s. Transitioning to IN_VEHICLE.");
                    sb3.toString();
                    return m96046c(0);
                }
            }
            if (!m96043a(a)) {
                boolean a2 = m96044a(activityRecognitionResult);
                if (!z2) {
                    if (cesh.f183401a.mo6606a().arTransitionApplyPersonalConfidenceFilter()) {
                        if (a2) {
                        }
                    }
                }
                StringBuilder sb4 = new StringBuilder(174);
                sb4.append("Received vehicular speed measurements or bluetooth. Speed = ");
                sb4.append(0.0f);
                sb4.append(", isVehicleBluetoothConnected = ");
                sb4.append(z2);
                sb4.append(" . Transitioning to road vehicle (IN_VEHICLE/IN_ROAD_VEHICLE).");
                sb4.toString();
                this.f112972d = z2;
                if (cery.m138142b()) {
                    i2 = 16;
                }
                return m96046c(i2);
            }
            int i4 = this.f112970b;
            if (a == i4) {
                m96047d(i4);
                return m96042a();
            }
            if (a != 16) {
                if (a != 17) {
                    switch (a) {
                        case 0:
                            break;
                        case 1:
                            if (cesh.f183401a.mo6606a().arTransitionBikingWifiFilteringEnabled()) {
                                if (z) {
                                    i2 = 1;
                                }
                            }
                            int bikeHighConfidenceThreshold = (int) cesh.f183401a.mo6606a().bikeHighConfidenceThreshold();
                            int minBikeContinuousDetectionCount = (int) cesh.f183401a.mo6606a().minBikeContinuousDetectionCount();
                            if (i2 == 0) {
                                if ((i3 < bikeHighConfidenceThreshold || m96045b(this.f112970b)) && this.f112969a.mo61236c(1) < minBikeContinuousDetectionCount) {
                                    if (mo61239a(z2)) {
                                    }
                                }
                                return m96046c(a);
                            }
                            this.f112969a.mo61234a(1);
                            return m96042a();
                        case 2:
                        case 7:
                        case 8:
                            long footHighConfidenceThreshold = cesh.f183401a.mo6606a().footHighConfidenceThreshold();
                            int minFootContinuousDetectionCount = (int) cesh.f183401a.mo6606a().minFootContinuousDetectionCount();
                            if (i3 < ((int) footHighConfidenceThreshold) && this.f112969a.mo61236c(2) < minFootContinuousDetectionCount && !mo61239a(z2)) {
                                if (!cesh.f183401a.mo6606a().arTransitionFastVehicleexitOnfootEnabled() || !m96043a(this.f112970b)) {
                                    this.f112969a.mo61234a(2);
                                    return m96042a();
                                }
                            }
                            return m96046c(a);
                        case 3:
                            int h = (int) cesh.m138176h();
                            int minStillHighConfidenceContinuousDetectionCount = (int) cesh.f183401a.mo6606a().minStillHighConfidenceContinuousDetectionCount();
                            int minStillContinuousDetectionCount = (int) cesh.f183401a.mo6606a().minStillContinuousDetectionCount();
                            int minStillForTransitionFromFoot = (int) cesh.f183401a.mo6606a().minStillForTransitionFromFoot();
                            if (!mo61239a(z2)) {
                                if (!m96045b(this.f112970b)) {
                                    if (i3 >= h) {
                                        bexo bexo = this.f112969a;
                                        if (bexo.f112966c == 3) {
                                            i2 = bexo.f112965b;
                                        }
                                        if (i2 >= minStillHighConfidenceContinuousDetectionCount) {
                                        }
                                    }
                                }
                                if (m96045b(this.f112970b) || this.f112969a.mo61236c(3) < minStillContinuousDetectionCount) {
                                    int i5 = this.f112970b;
                                    if (i5 != 7) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            return m96046c(a);
                        case 4:
                            if (this.f112969a.mo61236c(3) > 0) {
                                this.f112969a.mo61235b(0);
                            }
                            return m96042a();
                        case 5:
                            return m96042a();
                        case 6:
                            if (i4 != 0) {
                                return m96042a();
                            }
                            return m96046c(7);
                        default:
                            String valueOf = String.valueOf(activityRecognitionResult);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                            sb5.append("Unidentifiable activity received = ");
                            sb5.append(valueOf);
                            sb5.toString();
                            return m96042a();
                    }
                } else if (cery.m138142b()) {
                    long inRailVehicleConfidenceThreshold = cesh.f183401a.mo6606a().inRailVehicleConfidenceThreshold();
                    int minInRailVehicleContinuousDetectionCount = (int) cesh.f183401a.mo6606a().minInRailVehicleContinuousDetectionCount();
                    if (i3 < ((int) inRailVehicleConfidenceThreshold) && this.f112969a.mo61236c(17) < minInRailVehicleContinuousDetectionCount) {
                        if (!mo61239a(z2)) {
                            this.f112969a.mo61234a(17);
                            return m96042a();
                        }
                    }
                    return m96046c(17);
                } else {
                    throw new IllegalStateException(String.valueOf(DetectedActivity.m66831a(17)).concat(" classification should never be used for non road and rail filter."));
                }
            }
            boolean a3 = m96044a(activityRecognitionResult);
            StringBuilder sb6 = new StringBuilder(119);
            sb6.append("Checking is ready for vehicle transition. confidence = ");
            sb6.append(i3);
            sb6.append(", is personal vehicle = ");
            sb6.append(a3);
            sb6.append(", wifi connected = ");
            sb6.append(z);
            sb6.toString();
            int inVehicleConfidenceThreshold = (int) cesh.f183401a.mo6606a().inVehicleConfidenceThreshold();
            int minInVehicleContinuousDetectionCount = (int) cesh.f183401a.mo6606a().minInVehicleContinuousDetectionCount();
            if (!a3) {
                if (!z) {
                    if (i3 < inVehicleConfidenceThreshold) {
                        if (this.f112969a.mo61236c(a) >= minInVehicleContinuousDetectionCount) {
                        }
                    }
                }
                if (!mo61239a(z2)) {
                    this.f112969a.mo61234a(a);
                    return m96042a();
                }
            }
            return m96046c(a);
        } else if (this.f112970b == 3) {
            return m96042a();
        } else {
            return m96046c(3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo61239a(boolean z) {
        String a = DetectedActivity.m66831a(this.f112970b);
        long j = this.f112971c;
        boolean z2 = this.f112972d;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 164);
        sb.append("isVehicleActivityExpired. currentActivity = ");
        sb.append(a);
        sb.append(", lastVehicleDetectionMillis = ");
        sb.append(j);
        sb.append(", carBluetoothConnected = ");
        sb.append(z);
        sb.append(", isVehicleEnterDueToBluetooth = ");
        sb.append(z2);
        sb.toString();
        return this.f112973e.mo61245a(this.f112970b, this.f112971c, SystemClock.elapsedRealtime(), z, this.f112972d);
    }
}
