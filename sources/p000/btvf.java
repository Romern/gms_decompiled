package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;
import com.google.location.bluemoon.inertialanchor.ThreeAxisCalibrationData;

/* renamed from: btvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AndroidInertialAnchor f152599a;

    public btvf(AndroidInertialAnchor androidInertialAnchor) {
        this.f152599a = androidInertialAnchor;
    }

    public final void run() {
        synchronized (this.f152599a.f191729h) {
            try {
                AndroidInertialAnchor androidInertialAnchor = this.f152599a;
                ThreeAxisCalibrationData threeAxisCalibrationData = androidInertialAnchor.f191719d;
                if (threeAxisCalibrationData == null) {
                    throw new IllegalArgumentException("outCalibrationData cannot be null.");
                } else if (androidInertialAnchor.f191728g.getLatestCalibration(androidInertialAnchor.mo86647e(), threeAxisCalibrationData)) {
                    for (btvl btvl : this.f152599a.f191729h) {
                        btvl.mo62286d();
                    }
                } else {
                    throw new IllegalStateException("Error occurred when querying calibration data from native.");
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                e.getMessage();
            }
        }
    }
}
