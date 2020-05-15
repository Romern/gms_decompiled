package p000;

import android.hardware.Camera;

/* renamed from: akpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akpy {

    /* renamed from: a */
    private final srl f72419a = new akpw();

    /* renamed from: b */
    public static Camera.CameraInfo m60232b(Camera.CameraInfo[] cameraInfoArr, int i) {
        Camera.CameraInfo cameraInfo = cameraInfoArr[i];
        if (cameraInfo != null) {
            return cameraInfo;
        }
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo2);
        cameraInfoArr[i] = cameraInfo2;
        return cameraInfo2;
    }

    /* renamed from: a */
    public final akpx mo39692a(Camera.CameraInfo[] cameraInfoArr, int i) {
        try {
            srl srl = this.f72419a;
            Integer valueOf = Integer.valueOf(i);
            Camera.CameraInfo b = m60232b(cameraInfoArr, i);
            new Object[1][0] = valueOf;
            return new akpx((Camera) srl.mo21850a(valueOf), b);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unable to open camera ");
            sb.append(i);
            akvj.m60557a("CameraFinder", e, sb.toString());
            return null;
        }
    }
}
