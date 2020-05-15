package p000;

import android.view.SurfaceHolder;
import com.google.android.gms.auth.authzen.magicwand.camera.CameraSourcePreview;
import java.io.IOException;

/* renamed from: iit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iit implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ CameraSourcePreview f21075a;

    public iit(CameraSourcePreview cameraSourcePreview) {
        this.f21075a = cameraSourcePreview;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        CameraSourcePreview cameraSourcePreview = this.f21075a;
        cameraSourcePreview.f10489b = true;
        try {
            cameraSourcePreview.mo7585a();
        } catch (SecurityException e) {
            CameraSourcePreview.f10487d.mo25417e("Do not have permission to start the camera", e, new Object[0]);
        } catch (IOException e2) {
            CameraSourcePreview.f10487d.mo25417e("Could not start camera source.", e2, new Object[0]);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f21075a.f10489b = false;
    }
}
