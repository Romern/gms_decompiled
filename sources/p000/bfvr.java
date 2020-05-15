package p000;

import android.hardware.Sensor;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: bfvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvr extends bfvo {

    /* renamed from: a */
    private static final DeviceOrientationRequestInternal f115436a = new DeviceOrientationRequestInternal(new DeviceOrientationRequest(), DeviceOrientationRequestInternal.f79408a, "FusionEngine");

    /* renamed from: b */
    private final bfsn f115437b;

    /* renamed from: c */
    private final bfuo f115438c;

    /* renamed from: d */
    private final AndroidInertialAnchor f115439d;

    public bfvr(bfsn bfsn, bfuo bfuo) {
        this.f115437b = bfsn;
        this.f115438c = bfuo;
        this.f115439d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        if (this.f115428u && this.f115429v) {
            bfsn bfsn = this.f115437b;
            Sensor sensor = bfsn.f115149b;
            if (sensor != null) {
                bfsn.f115148a.registerListener(bfsn, sensor, 20000, bfsn.f115150c);
                bfsn.f115151d = new bscv();
            }
            bfuo bfuo = this.f115438c;
            if (bfuo != null) {
                bfuo.mo62288a(f115436a);
            }
            AndroidInertialAnchor androidInertialAnchor = this.f115439d;
            if (androidInertialAnchor != null) {
                androidInertialAnchor.mo86637c();
                return;
            }
            return;
        }
        bfsn bfsn2 = this.f115437b;
        if (bfsn2.f115149b != null) {
            bfsn2.f115148a.unregisterListener(bfsn2);
        }
        bfsn2.f115151d = null;
        bfuo bfuo2 = this.f115438c;
        if (bfuo2 != null) {
            bfuo2.mo62289b(f115436a);
        }
        AndroidInertialAnchor androidInertialAnchor2 = this.f115439d;
        if (androidInertialAnchor2 != null) {
            androidInertialAnchor2.mo86638d();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepDetector[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }

    public bfvr(bfsn bfsn, AndroidInertialAnchor androidInertialAnchor) {
        this.f115437b = bfsn;
        this.f115438c = null;
        this.f115439d = androidInertialAnchor;
    }
}
