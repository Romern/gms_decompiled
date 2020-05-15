package p000;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: avxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxt {

    /* renamed from: a */
    public Context f94071a;

    /* renamed from: b */
    public final Object f94072b = new Object();

    /* renamed from: c */
    public Camera f94073c;

    /* renamed from: d */
    public int f94074d = 0;

    /* renamed from: e */
    public int f94075e;

    /* renamed from: f */
    public rzj f94076f;

    /* renamed from: g */
    public float f94077g = 30.0f;

    /* renamed from: h */
    public int f94078h = 1024;

    /* renamed from: i */
    public int f94079i = 768;

    /* renamed from: j */
    public boolean f94080j = false;

    /* renamed from: k */
    public String f94081k;

    /* renamed from: l */
    public Thread f94082l;

    /* renamed from: m */
    public avxr f94083m;

    /* renamed from: n */
    public final Map f94084n = new HashMap();

    /* renamed from: a */
    public final void mo51707a() {
        synchronized (this.f94072b) {
            mo51709b();
            avxr avxr = this.f94083m;
            avxr.f94061a.mo51711a();
            avxr.f94061a = null;
        }
    }

    /* renamed from: b */
    public final void mo51709b() {
        synchronized (this.f94072b) {
            this.f94083m.mo51705a(false);
            Thread thread = this.f94082l;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                }
                this.f94082l = null;
            }
            Camera camera = this.f94073c;
            if (camera != null) {
                camera.stopPreview();
                this.f94073c.setPreviewCallbackWithBuffer(null);
                try {
                    this.f94073c.setPreviewDisplay(null);
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                    Log.e("CameraSource", sb.toString());
                }
                this.f94073c.release();
                this.f94073c = null;
            }
            this.f94084n.clear();
        }
    }

    /* renamed from: a */
    public final byte[] mo51708a(rzj rzj) {
        double bitsPerPixel = (double) ((long) (rzj.f43895b * rzj.f43894a * ImageFormat.getBitsPerPixel(17)));
        Double.isNaN(bitsPerPixel);
        byte[] bArr = new byte[(((int) Math.ceil(bitsPerPixel / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f94084n.put(bArr, wrap);
        return bArr;
    }
}
