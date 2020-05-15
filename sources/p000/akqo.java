package p000;

import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akrb f72457a;

    /* renamed from: b */
    final /* synthetic */ akpo f72458b;

    /* renamed from: c */
    final /* synthetic */ SurfaceHolder f72459c;

    /* renamed from: d */
    final /* synthetic */ akrj f72460d;

    public akqo(akrj akrj, akrb akrb, akpo akpo, SurfaceHolder surfaceHolder) {
        this.f72460d = akrj;
        this.f72457a = akrb;
        this.f72458b = akpo;
        this.f72459c = surfaceHolder;
    }

    public final void run() {
        akpx akpx;
        Camera.Size size;
        int i;
        boolean z;
        int i2;
        akpx a;
        akpx a2;
        this.f72460d.mo39726b(1);
        akrj akrj = this.f72460d;
        akpy akpy = akrj.f72486b;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            akpx = new akpx("No cameras available on device");
        } else {
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            int i3 = 0;
            while (true) {
                if (i3 >= numberOfCameras) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= numberOfCameras) {
                            StringBuilder sb = new StringBuilder(65);
                            sb.append(numberOfCameras);
                            sb.append(" cameras offered, but we're unable to open any of them");
                            akpx = new akpx(sb.toString());
                            break;
                        } else if (akpy.m60232b(cameraInfoArr, i4).facing != 0 && (a = akpy.mo39692a(cameraInfoArr, i4)) != null) {
                            akpx = a;
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (akpy.m60232b(cameraInfoArr, i3).facing == 0 && (a2 = akpy.mo39692a(cameraInfoArr, i3)) != null) {
                    akpx = a2;
                    break;
                } else {
                    i3++;
                }
            }
        }
        akrj.f72496l = akpx;
        akrj akrj2 = this.f72460d;
        String str = akrj2.f72496l.f72418c;
        if (str == null) {
            akrj2.mo39728c(1);
            akrj akrj3 = this.f72460d;
            Camera camera = akrj3.f72496l.f72416a;
            sdo.m34959a(camera);
            akrj3.f72497m = camera;
            akrj akrj4 = this.f72460d;
            Camera.CameraInfo cameraInfo = akrj4.f72496l.f72417b;
            sdo.m34959a(cameraInfo);
            akrj4.f72498n = cameraInfo;
            Camera.Parameters parameters = this.f72460d.f72497m.getParameters();
            akrj akrj5 = this.f72460d;
            akpo akpo = this.f72458b;
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            akqx akqx = new akqx(akrj5);
            akpo a3 = akpo.mo39670a();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size2 : supportedPreviewSizes) {
                if (akqx.mo6692a(size2) && size2.height <= a3.f72393b) {
                    arrayList.add(size2);
                }
            }
            Collections.sort(arrayList, new akqg());
            int size3 = arrayList.size();
            float f = ((float) a3.f72392a) / ((float) a3.f72393b);
            int i5 = 0;
            while (true) {
                if (i5 < size3) {
                    size = (Camera.Size) arrayList.get(i5);
                    if (((float) size.width) / ((float) size.height) > f) {
                        break;
                    }
                    i5++;
                } else {
                    int i6 = a3.f72392a * a3.f72393b;
                    int i7 = Integer.MAX_VALUE;
                    size = null;
                    int i8 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        Camera.Size size4 = (Camera.Size) arrayList.get(i9);
                        int i10 = i6 - (size4.width * size4.height);
                        if (i10 < i8) {
                            size = size4;
                        }
                        if (i10 < i8) {
                            i8 = i10;
                        }
                    }
                    if (size == null) {
                        for (Camera.Size size5 : supportedPreviewSizes) {
                            int i11 = size5.width * size5.height;
                            int i12 = i11 < i7 ? i11 : i7;
                            if (i11 < i7) {
                                size = size5;
                            }
                            i7 = i12;
                        }
                    }
                }
            }
            akpo a4 = akpo.m60217a(size.width, size.height);
            parameters.setPreviewSize(a4.f72392a, a4.f72393b);
            akrj akrj6 = this.f72460d;
            akrj6.f72493i = parameters.getSupportedFocusModes().contains("continuous-picture");
            akrj6.f72494j = parameters.getSupportedFocusModes().contains("continuous-video");
            boolean contains = parameters.getSupportedFocusModes().contains("auto");
            if (akrj6.f72491g.mo39862l() && parameters.getMaxNumFocusAreas() >= akrj.f72484a.size() && contains) {
                parameters.setFocusAreas(akrj.f72484a);
                parameters.setFocusMode("auto");
                i = 6;
            } else if (akrj6.f72493i) {
                parameters.setFocusMode("continuous-picture");
                i = 3;
            } else {
                i = 2;
            }
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            this.f72460d.f72497m.setParameters(parameters);
            akrj akrj7 = this.f72460d;
            int rotation = akrj7.f72490f.f72964a.getRotation() * 90;
            if (akrj7.f72498n.facing == 1) {
                i2 = (360 - ((akrj7.f72498n.orientation + rotation) % 360)) % 360;
            } else {
                i2 = ((akrj7.f72498n.orientation - rotation) + 360) % 360;
            }
            this.f72460d.f72497m.setDisplayOrientation(i2);
            new Object[1][0] = this.f72458b;
            new Object[1][0] = a4.mo39671b();
            new Object[1][0] = Integer.valueOf(i2);
            new Object[1][0] = Boolean.valueOf(z);
            try {
                this.f72460d.f72497m.setPreviewDisplay(this.f72459c);
                this.f72460d.mo39728c(2);
                akrj akrj8 = this.f72460d;
                akrj8.f72492h.mo39756a(i, akrj8.f72493i, akrj8.f72494j);
                this.f72460d.f72500p = new akqf(a4, i2, z);
                akrj akrj9 = this.f72460d;
                akrj9.f72501q = new akra(akrj9, z);
                this.f72460d.f72489e.post(new akqn(this));
            } catch (IOException e) {
                Log.e("SimpleCameraManager", "Couldn't set preview display", e);
                this.f72460d.mo39720a(this.f72457a, "Couldn't set preview display");
                this.f72460d.mo39728c(3);
            }
        } else {
            akrj2.mo39720a(this.f72457a, str);
        }
    }
}
