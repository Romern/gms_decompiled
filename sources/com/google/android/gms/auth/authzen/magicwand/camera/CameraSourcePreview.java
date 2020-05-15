package com.google.android.gms.auth.authzen.magicwand.camera;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CameraSourcePreview extends ViewGroup {

    /* renamed from: d */
    public static final sek f10487d = new sek("CameraSourcePreview");

    /* renamed from: a */
    public boolean f10488a = false;

    /* renamed from: b */
    public boolean f10489b = false;

    /* renamed from: c */
    public avxt f10490c;

    /* renamed from: e */
    private final SurfaceView f10491e;

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SurfaceView surfaceView = new SurfaceView(context);
        this.f10491e = surfaceView;
        surfaceView.getHolder().addCallback(new iit(this));
        addView(this.f10491e);
    }

    /* renamed from: a */
    public final void mo7585a() {
        int i;
        int i2;
        int i3;
        if (this.f10488a && this.f10489b) {
            avxt avxt = this.f10490c;
            SurfaceHolder holder = this.f10491e.getHolder();
            synchronized (avxt.f94072b) {
                if (avxt.f94073c == null) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= Camera.getNumberOfCameras()) {
                            i4 = -1;
                            break;
                        }
                        Camera.getCameraInfo(i4, cameraInfo);
                        if (cameraInfo.facing == 0) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 != -1) {
                        Camera open = Camera.open(i4);
                        int i5 = avxt.f94078h;
                        int i6 = avxt.f94079i;
                        Camera.Parameters parameters = open.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                        ArrayList<avxs> arrayList = new ArrayList();
                        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
                        while (it.hasNext()) {
                            Camera.Size next = it.next();
                            float f = ((float) next.width) / ((float) next.height);
                            Iterator<Camera.Size> it2 = supportedPictureSizes.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Camera.Size next2 = it2.next();
                                List<Camera.Size> list = supportedPictureSizes;
                                Iterator<Camera.Size> it3 = it;
                                if (Math.abs(f - (((float) next2.width) / ((float) next2.height))) < 0.01f) {
                                    arrayList.add(new avxs(next, next2));
                                    supportedPictureSizes = list;
                                    it = it3;
                                    break;
                                }
                                supportedPictureSizes = list;
                                it = it3;
                            }
                        }
                        if (arrayList.size() == 0) {
                            Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                            for (Camera.Size size : supportedPreviewSizes) {
                                arrayList.add(new avxs(size, null));
                            }
                        }
                        int i7 = Integer.MAX_VALUE;
                        avxs avxs = null;
                        int i8 = Integer.MAX_VALUE;
                        for (avxs avxs2 : arrayList) {
                            rzj rzj = avxs2.f94069a;
                            int abs = Math.abs(rzj.f43894a - i5) + Math.abs(rzj.f43895b - i6);
                            int i9 = abs < i8 ? abs : i8;
                            if (abs < i8) {
                                avxs = avxs2;
                            }
                            i8 = i9;
                        }
                        if (avxs != null) {
                            rzj rzj2 = avxs.f94070b;
                            avxt.f94076f = avxs.f94069a;
                            int i10 = (int) (avxt.f94077g * 1000.0f);
                            int[] iArr = null;
                            for (int[] iArr2 : open.getParameters().getSupportedPreviewFpsRange()) {
                                int abs2 = Math.abs(i10 - iArr2[0]) + Math.abs(i10 - iArr2[1]);
                                int i11 = abs2 < i7 ? abs2 : i7;
                                if (abs2 < i7) {
                                    iArr = iArr2;
                                }
                                i7 = i11;
                            }
                            if (iArr != null) {
                                Camera.Parameters parameters2 = open.getParameters();
                                if (rzj2 != null) {
                                    parameters2.setPictureSize(rzj2.f43894a, rzj2.f43895b);
                                }
                                rzj rzj3 = avxt.f94076f;
                                parameters2.setPreviewSize(rzj3.f43894a, rzj3.f43895b);
                                parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
                                parameters2.setPreviewFormat(17);
                                int rotation = ((WindowManager) avxt.f94071a.getSystemService("window")).getDefaultDisplay().getRotation();
                                if (rotation == 0) {
                                    i = 0;
                                } else if (rotation == 1) {
                                    i = 90;
                                } else if (rotation == 2) {
                                    i = 180;
                                } else if (rotation != 3) {
                                    StringBuilder sb = new StringBuilder(31);
                                    sb.append("Bad rotation value: ");
                                    sb.append(rotation);
                                    Log.e("CameraSource", sb.toString());
                                    i = 0;
                                } else {
                                    i = 270;
                                }
                                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                                Camera.getCameraInfo(i4, cameraInfo2);
                                if (cameraInfo2.facing == 1) {
                                    i2 = (cameraInfo2.orientation + i) % 360;
                                    i3 = (360 - i2) % 360;
                                } else {
                                    i2 = ((cameraInfo2.orientation - i) + 360) % 360;
                                    i3 = i2;
                                }
                                avxt.f94075e = i2 / 90;
                                open.setDisplayOrientation(i3);
                                parameters2.setRotation(i2);
                                if (avxt.f94081k != null) {
                                    if (!parameters2.getSupportedFocusModes().contains(avxt.f94081k)) {
                                        Log.w("CameraSource", String.format("FocusMode %s is not supported on this device.", avxt.f94081k));
                                        avxt.f94081k = null;
                                    } else {
                                        parameters2.setFocusMode(avxt.f94081k);
                                    }
                                }
                                if (avxt.f94081k == null && avxt.f94080j) {
                                    if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                                        parameters2.setFocusMode("continuous-video");
                                        avxt.f94081k = "continuous-video";
                                    } else {
                                        Log.i("CameraSource", "Camera auto focus is not supported on this device.");
                                    }
                                }
                                open.setParameters(parameters2);
                                open.setPreviewCallbackWithBuffer(new avxq(avxt));
                                open.addCallbackBuffer(avxt.mo51708a(avxt.f94076f));
                                open.addCallbackBuffer(avxt.mo51708a(avxt.f94076f));
                                open.addCallbackBuffer(avxt.mo51708a(avxt.f94076f));
                                open.addCallbackBuffer(avxt.mo51708a(avxt.f94076f));
                                avxt.f94073c = open;
                                avxt.f94073c.setPreviewDisplay(holder);
                                avxt.f94073c.startPreview();
                                avxt.f94082l = new Thread(avxt.f94083m);
                                avxt.f94083m.mo51705a(true);
                                avxt.f94082l.start();
                            } else {
                                throw new IOException("Could not find suitable preview frames per second range.");
                            }
                        } else {
                            throw new IOException("Could not find suitable preview size.");
                        }
                    } else {
                        throw new IOException("Could not find requested camera.");
                    }
                }
            }
            this.f10488a = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).layout(0, 0, i5, i6);
        }
        try {
            mo7585a();
        } catch (SecurityException e) {
            f10487d.mo25417e("Do not have permission to start the camera", e, new Object[0]);
        } catch (IOException e2) {
            f10487d.mo25417e("Could not start camera source.", e2, new Object[0]);
        }
    }
}
