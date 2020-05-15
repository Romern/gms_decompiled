package p000;

import com.google.android.gms.location.DetectedActivity;

/* renamed from: bexz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bexz {

    /* renamed from: a */
    private long f112998a = -1;

    /* renamed from: a */
    private final void m96077a() {
        this.f112998a = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* renamed from: a */
    public final boolean mo61245a(int i, long j, long j2, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (!DetectedActivity.m66832a(i, false)) {
            m96077a();
            return false;
        }
        long j3 = j2 - j;
        if (j3 > cesh.f183401a.mo6606a().maxTimeWithoutInVehicleDetectionMillis()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cesh.f183401a.mo6606a().arTransitionVehicleBluetoothTimeoutOptimizations() && bexu.m96066a(i)) {
            StringBuilder sb = new StringBuilder(116);
            sb.append("isVehicleActivityExpired. apply bluetooth optimized expiration., vehicle bluetooth = ");
            sb.append(z);
            sb.append(", expirationStatus = ");
            sb.append(z3);
            sb.toString();
            if (z2 && !z && j3 > cesh.f183401a.mo6606a().maxTimeWithoutInCarDetectionMillis()) {
                StringBuilder sb2 = new StringBuilder(168);
                sb2.append("bluetoothOptimizedVehicleExpiration. apply bluetooth optimized expiration. isVehicleEnterDueToBluetooth = true, lastInRoadVehicleDetectionMillis = ");
                sb2.append(j);
                sb2.toString();
                z4 = true;
                if (z4) {
                }
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("isVehicleActivityExpired. expiration status = ");
                sb3.append(z4);
                sb3.toString();
                return z4;
            } else if (z3 && z) {
                long j4 = this.f112998a;
                StringBuilder sb4 = new StringBuilder(205);
                sb4.append("bluetoothOptimizedVehicleExpiration. expirationStatus true, vehicleBluetoothConnected = true, elapsedTime = ");
                sb4.append(j2);
                sb4.append(", connectedBluetoothVehicleExpirationMillisSinceBoot = ");
                sb4.append(j4);
                sb4.toString();
                long j5 = this.f112998a;
                if (j5 == -1) {
                    StringBuilder sb5 = new StringBuilder(113);
                    sb5.append("bluetoothOptimizedVehicleExpiration.set connectedBluetoothVehicleExpirationMillisSinceBoot = ");
                    sb5.append(j2);
                    sb5.toString();
                    this.f112998a = j2;
                } else if (j2 - j5 > cesh.f183401a.mo6606a().maxTimeVehicleExitWithConnectedBluetoothMillis()) {
                    m96077a();
                    z4 = true;
                }
                if (z4) {
                    m96077a();
                }
                StringBuilder sb32 = new StringBuilder(51);
                sb32.append("isVehicleActivityExpired. expiration status = ");
                sb32.append(z4);
                sb32.toString();
                return z4;
            } else {
                StringBuilder sb6 = new StringBuilder(61);
                sb6.append("bluetoothOptimizedVehicleExpiration. Returning status = ");
                sb6.append(z3);
                sb6.toString();
                m96077a();
            }
        }
        z4 = z3;
        if (z4) {
        }
        StringBuilder sb322 = new StringBuilder(51);
        sb322.append("isVehicleActivityExpired. expiration status = ");
        sb322.append(z4);
        sb322.toString();
        return z4;
    }
}
