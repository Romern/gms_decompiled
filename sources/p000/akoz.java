package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ocr.RecognitionScreen;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: akoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akoz {

    /* renamed from: a */
    private final Context f72376a;

    /* renamed from: b */
    private final Intent f72377b;

    /* renamed from: c */
    private final ArrayList f72378c = new ArrayList();

    /* renamed from: d */
    private final ArrayList f72379d = new ArrayList();

    public akoz(Context context) {
        this.f72376a = context;
        Intent intent = new Intent("com.google.android.gms.ocr.ACTION_CREDIT_CARD_OCR");
        this.f72377b = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r6.f72379d.contains(1) != false) goto L_0x004f;
     */
    /* renamed from: a */
    public final Intent mo39623a() {
        if (this.f72376a.getPackageManager().checkPermission("android.permission.CAMERA", "com.google.android.gms") == 0 && sbv.m34878a(this.f72376a.getPackageManager(), this.f72377b)) {
            int b = rfi.f42868a.mo24590b(this.f72376a);
            if (b == 0) {
                ArrayList arrayList = this.f72378c;
                int size = arrayList.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < size) {
                        int i2 = i + 1;
                        if (((RecognitionScreen) arrayList.get(i)).f81257c == 1) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (this.f72378c.isEmpty() || this.f72379d.isEmpty()) {
                    z = true;
                }
                sdo.m34975b(z, "Only one of recognitionScreens and recognitionScreenTypes should be set");
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("com.google.android.gms.ocr.RECOGNITION_SCREENS", this.f72378c);
                bundle.putIntArray("com.google.android.gms.ocr.RECOGNITION_SCREENTYPES", sqc.m35960a(this.f72379d));
                this.f72377b.putExtra("com.google.android.gms.ocr.RECOGNITION", bundle);
                return this.f72377b;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Google Play services is unavailable. Result=");
            sb.append(b);
            Log.w("CreditCardOcrIntentBuilder", sb.toString());
        }
        return null;
    }

    /* renamed from: b */
    public final void mo39628b() {
        sdo.m34976b(true, "Unexpected value for theme=%d", 0);
        this.f72377b.putExtra("com.google.android.gms.ocr.THEME", 0);
    }

    /* renamed from: b */
    public final void mo39629b(boolean z) {
        this.f72377b.putExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_NAME", z);
    }

    /* renamed from: a */
    public final void mo39624a(int i) {
        if (!(i == 0 || i == 1)) {
            i = 2;
        }
        sdo.m34976b(true, "Unexpected value for night mode=%d", Integer.valueOf(i));
        this.f72377b.putExtra("com.google.android.gms.ocr.NIGHT_MODE", i);
    }

    /* renamed from: a */
    public final void mo39625a(String str) {
        this.f72377b.putExtra("com.google.android.gms.ocr.ACCOUNT_NAME", str);
    }

    /* renamed from: a */
    public final void mo39626a(boolean z) {
        this.f72377b.putExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_EXP_DATE", z);
    }

    /* renamed from: a */
    public final void mo39627a(RecognitionScreen... recognitionScreenArr) {
        this.f72378c.addAll(Arrays.asList(recognitionScreenArr));
    }
}
