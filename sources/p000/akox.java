package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: akox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akox {

    /* renamed from: a */
    public final Intent f72373a;

    /* renamed from: b */
    private final Context f72374b;

    public akox(Context context) {
        this.f72374b = context;
        Intent intent = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
        this.f72373a = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* renamed from: a */
    public final Intent mo39616a() {
        if (this.f72374b.getPackageManager().checkPermission("android.permission.CAMERA", "com.google.android.gms") != 0 || !sbv.m34878a(this.f72374b.getPackageManager(), this.f72373a)) {
            return null;
        }
        if (this.f72373a.getParcelableExtra("com.google.android.gms.ocr.DOCUMENT_URI") == null) {
            throw new IllegalArgumentException("CardCaptureConstants.EXTRA_DOCUMENT_URI must be set.");
        } else if (!this.f72373a.getBooleanExtra("com.google.android.gms.ocr.EXTRA_HALF_SCREEN_CAMERA_PREVIEW", false) || this.f72373a.getStringExtra("com.google.android.gms.ocr.INFO_MESSAGE") != null) {
            int b = rfi.f42868a.mo24590b(this.f72374b);
            if (b == 0) {
                return this.f72373a;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Google Play services is unavailable. Result=");
            sb.append(b);
            Log.w("CardCaptureIntentBuilder", sb.toString());
            return null;
        } else {
            throw new IllegalArgumentException("CardCaptureConstants.EXTRA_INFO_MESSAGE must be set when CardCaptureConstants.EXTRA_HALF_SCREEN_CAMERA_PREVIEW is true.");
        }
    }

    /* renamed from: b */
    public final void mo39619b(String str) {
        this.f72373a.putExtra("com.google.android.gms.ocr.EXIT_BUTTON_LABEL", str);
    }

    /* renamed from: c */
    public final void mo39620c(String str) {
        this.f72373a.putExtra("com.google.android.gms.ocr.INFO_MESSAGE", str);
    }

    /* renamed from: d */
    public final void mo39621d(String str) {
        this.f72373a.putExtra("com.google.android.gms.ocr.INSTRUCTIONS_MESSAGE", str);
    }

    /* renamed from: e */
    public final void mo39622e(String str) {
        this.f72373a.putExtra("com.google.android.gms.ocr.TITLE", str);
    }

    /* renamed from: a */
    public final void mo39617a(Uri uri) {
        this.f72373a.putExtra("com.google.android.gms.ocr.DOCUMENT_URI", uri);
    }

    /* renamed from: a */
    public final void mo39618a(String str) {
        this.f72373a.putExtra("com.google.android.gms.ocr.ADDITIONAL_INFO", str);
    }
}
