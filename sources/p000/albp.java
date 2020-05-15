package p000;

import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.Display;

/* renamed from: albp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albp {

    /* renamed from: a */
    public int f73304a;

    /* renamed from: b */
    private final albs f73305b;

    /* renamed from: c */
    private boolean f73306c = true;

    /* renamed from: d */
    private float f73307d;

    /* renamed from: e */
    private boolean f73308e = false;

    /* renamed from: f */
    private final boolean f73309f;

    public albp(Display display, albs albs) {
        boolean z = true;
        this.f73305b = albs;
        int rotation = display.getRotation();
        int i = -90;
        if (rotation == 0) {
            this.f73304a = 0;
            i = 0;
        } else if (rotation == 1) {
            this.f73304a = 90;
            i = 90;
        } else if (rotation == 2) {
            this.f73304a = 180;
            i = 180;
        } else if (rotation != 3) {
            this.f73304a = 0;
            i = 0;
        } else {
            this.f73304a = -90;
        }
        this.f73307d = (float) i;
        int i2 = Build.VERSION.SDK_INT;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(0, cameraInfo);
        this.f73309f = cameraInfo.orientation != 0 ? false : z;
        mo40095a();
    }

    /* renamed from: a */
    public final void mo40095a() {
        boolean z;
        boolean z2;
        albs albs = this.f73305b;
        if (albs != null && albs.f73350d) {
            alaz alaz = albs.f73349c;
            if (!this.f73308e) {
                boolean z3 = !this.f73309f;
                if (Math.abs(alaz.f73239a) <= Math.abs(alaz.f73240b)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z3 ^ z2;
                this.f73306c = z;
                this.f73308e = true;
            } else {
                if (this.f73309f ^ this.f73306c) {
                    if (Math.abs(alaz.f73240b) <= Math.abs(alaz.f73239a) * 1.5f) {
                        return;
                    }
                } else if (Math.abs(alaz.f73239a) <= Math.abs(alaz.f73240b) * 1.5f) {
                    return;
                }
                z = !this.f73306c;
                this.f73306c = z;
            }
            float f = 0.0f;
            if (z ^ this.f73309f) {
                f = alaz.f73239a > 0.0f ? 90.0f : -90.0f;
            } else if (alaz.f73240b <= 0.0f) {
                f = 180.0f;
            }
            this.f73307d = f;
            return;
        }
        Log.e("LightCycle", "Sensor reader is not initialized.");
    }

    /* renamed from: b */
    public final void mo40096b() {
        mo40095a();
        this.f73304a = (int) this.f73307d;
    }
}
