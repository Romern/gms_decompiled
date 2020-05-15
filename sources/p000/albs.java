package p000;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.Arrays;

/* renamed from: albs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albs {

    /* renamed from: a */
    public final boolean f73347a = true;

    /* renamed from: b */
    public final alaz f73348b = new alaz();

    /* renamed from: c */
    public final alaz f73349c = new alaz();

    /* renamed from: d */
    public boolean f73350d = false;

    /* renamed from: e */
    public final float f73351e = 0.15f;

    /* renamed from: f */
    public final float[] f73352f = new float[3];

    /* renamed from: g */
    public long f73353g = 0;

    /* renamed from: h */
    public final float[] f73354h = new float[3];

    /* renamed from: i */
    public final float[] f73355i = {0.0f, 0.0f, 0.0f};

    /* renamed from: j */
    public int f73356j = 0;

    /* renamed from: k */
    public final albq f73357k = new albq();

    /* renamed from: l */
    public final float[] f73358l = new float[16];

    /* renamed from: m */
    public float f73359m = 90.0f;

    /* renamed from: n */
    public albu f73360n = null;

    /* renamed from: o */
    public double[] f73361o = new double[16];

    /* renamed from: p */
    private SensorManager f73362p = null;

    /* renamed from: q */
    private boolean f73363q = false;

    /* renamed from: r */
    private final SensorEventListener f73364r = new albr(this);

    /* renamed from: a */
    public final void mo40102a() {
        this.f73363q = false;
        SensorManager sensorManager = this.f73362p;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f73364r);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(float[], float):void}
     arg types: [float[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void} */
    /* renamed from: a */
    public final void mo40103a(Context context) {
        if (!this.f73363q) {
            this.f73363q = true;
            int i = Build.VERSION.SDK_INT;
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
            this.f73359m = (float) cameraInfo.orientation;
            String valueOf = String.valueOf(Build.MODEL);
            if (valueOf.length() == 0) {
                new String("Model is ");
            } else {
                "Model is ".concat(valueOf);
            }
            if (Build.MODEL.startsWith("Nexus 7")) {
                this.f73359m = 90.0f;
            }
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.f73362p = sensorManager;
            sensorManager.registerListener(this.f73364r, sensorManager.getDefaultSensor(1), 1);
            SensorManager sensorManager2 = this.f73362p;
            sensorManager2.registerListener(this.f73364r, sensorManager2.getDefaultSensor(4), 1);
            SensorManager sensorManager3 = this.f73362p;
            sensorManager3.registerListener(this.f73364r, sensorManager3.getDefaultSensor(2), 3);
            this.f73350d = false;
            Arrays.fill(this.f73355i, 0.0f);
            this.f73357k.mo40097a();
        }
    }
}
