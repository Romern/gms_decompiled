package com.google.android.gms.auth.authzen.magicwand;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.authzen.magicwand.camera.CameraSourcePreview;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MagicWandBarcodeScannerChimeraActivity extends deu {

    /* renamed from: b */
    public static final sek f10484b = new sek("MagicWandBarcodeScannerActivity");

    /* renamed from: c */
    private avxt f10485c;

    /* renamed from: d */
    private CameraSourcePreview f10486d;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C0126R.C0128layout.auth_authzen_magicwand_barcode_scanner);
        setTitle(getString(C0126R.string.magicwand_barcode_scanner_title));
        this.f10486d = (CameraSourcePreview) findViewById(C0126R.C0129id.preview);
        if (C1133kh.m17835a(this, "android.permission.CAMERA") == 0) {
            Context applicationContext = getApplicationContext();
            avyh avyh = new avyh(applicationContext);
            avyi avyi = new avyi(new avyv(avyh.f94103a, avyh.f94104b));
            avyc avyc = new avya(new iis(applicationContext)).f94098a;
            synchronized (avyi.f94086a) {
                avyc avyc2 = avyi.f94087b;
                if (avyc2 != null) {
                    avyc2.mo51716a();
                }
                avyi.f94087b = avyc;
            }
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            int height = defaultDisplay.getHeight();
            int width = defaultDisplay.getWidth();
            avxp avxp = new avxp(getApplicationContext(), avyi);
            avxt avxt = avxp.f94059b;
            avxt.f94074d = 0;
            if (width <= 0 || width > 1000000 || height <= 0 || height > 1000000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                throw new IllegalArgumentException(sb.toString());
            }
            avxt.f94078h = width;
            avxt.f94079i = height;
            avxt.f94077g = 30.0f;
            avxt.f94080j = true;
            avxt.getClass();
            avxt.f94083m = new avxr(avxt, avxp.f94058a);
            this.f10485c = avxp.f94059b;
            return;
        }
        f10484b.mo25418e("Camera permissions not granted. Exiting.", new Object[0]);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        avxt avxt;
        super.onDestroy();
        CameraSourcePreview cameraSourcePreview = this.f10486d;
        if (cameraSourcePreview != null && (avxt = cameraSourcePreview.f10490c) != null) {
            avxt.mo51707a();
            cameraSourcePreview.f10490c = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        avxt avxt;
        super.onPause();
        CameraSourcePreview cameraSourcePreview = this.f10486d;
        if (cameraSourcePreview != null && (avxt = cameraSourcePreview.f10490c) != null) {
            avxt.mo51709b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        avxt avxt = this.f10485c;
        if (avxt != null) {
            try {
                CameraSourcePreview cameraSourcePreview = this.f10486d;
                cameraSourcePreview.f10490c = avxt;
                if (cameraSourcePreview.f10490c != null) {
                    cameraSourcePreview.f10488a = true;
                    cameraSourcePreview.mo7585a();
                }
            } catch (IOException e) {
                f10484b.mo25417e("Unable to start camera source.", e, new Object[0]);
                this.f10485c.mo51707a();
                this.f10485c = null;
            }
        }
    }
}
