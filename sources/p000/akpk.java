package p000;

import android.text.TextUtils;
import com.google.android.gms.ocr.RecognitionScreen;

/* renamed from: akpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akpk {

    /* renamed from: a */
    final /* synthetic */ RecognitionScreen f72391a;

    public akpk(RecognitionScreen recognitionScreen) {
        this.f72391a = recognitionScreen;
    }

    /* renamed from: a */
    public final RecognitionScreen mo39656a() {
        boolean z;
        sdo.m34975b(!TextUtils.isEmpty(this.f72391a.f81255a), "Screen title must be set");
        sdo.m34975b(!TextUtils.isEmpty(this.f72391a.f81256b), "Screen description must be set");
        if (this.f72391a.f81257c != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Screen type must be set");
        sdo.m34975b(!TextUtils.isEmpty(this.f72391a.f81258d), "Use this screen text must be set");
        sdo.m34975b(!TextUtils.isEmpty(this.f72391a.f81259e), "Fallback text must be set");
        RecognitionScreen recognitionScreen = this.f72391a;
        if (recognitionScreen.f81257c != 1) {
            sdo.m34975b(!TextUtils.isEmpty(recognitionScreen.f81260f), "Screen image url must be set if screenType is not OCR");
        }
        return this.f72391a;
    }

    /* renamed from: a */
    public final void mo39657a(int i) {
        this.f72391a.f81257c = i;
    }

    /* renamed from: a */
    public final void mo39658a(String str) {
        this.f72391a.f81259e = str;
    }

    /* renamed from: b */
    public final void mo39659b(String str) {
        this.f72391a.f81256b = str;
    }

    /* renamed from: c */
    public final void mo39660c(String str) {
        this.f72391a.f81260f = str;
    }

    /* renamed from: d */
    public final void mo39661d(String str) {
        this.f72391a.f81255a = str;
    }

    /* renamed from: e */
    public final void mo39662e(String str) {
        this.f72391a.f81258d = str;
    }
}
