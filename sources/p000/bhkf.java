package p000;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: bhkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhkf {

    /* renamed from: a */
    public final TextPaint f118902a = new TextPaint(1);

    /* renamed from: b */
    public final bhld f118903b = new bhkd(this);

    /* renamed from: c */
    public WeakReference f118904c = new WeakReference(null);

    /* renamed from: d */
    public bhlc f118905d;

    /* renamed from: e */
    private float f118906e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f118907f = true;

    public bhkf(bhke bhke) {
        this.f118904c = new WeakReference(bhke);
    }

    /* renamed from: a */
    public final void mo63896a() {
        this.f118907f = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Paint.measureText(java.lang.CharSequence, int, int):float}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{android.graphics.Paint.measureText(java.lang.String, int, int):float}
      ClspMth{android.graphics.Paint.measureText(char[], int, int):float}
      ClspMth{android.graphics.Paint.measureText(java.lang.CharSequence, int, int):float} */
    /* renamed from: a */
    public final float mo63895a(String str) {
        if (!this.f118907f) {
            return this.f118906e;
        }
        float measureText = str != null ? this.f118902a.measureText((CharSequence) str, 0, str.length()) : 0.0f;
        this.f118906e = measureText;
        this.f118907f = false;
        return measureText;
    }

    /* renamed from: a */
    public final void mo63897a(bhlc bhlc, Context context) {
        if (this.f118905d != bhlc) {
            this.f118905d = bhlc;
            if (bhlc != null) {
                bhlc.mo63913b(context, this.f118902a, this.f118903b);
                bhke bhke = (bhke) this.f118904c.get();
                if (bhke != null) {
                    this.f118902a.drawableState = bhke.getState();
                }
                bhlc.mo63910a(context, this.f118902a, this.f118903b);
                this.f118907f = true;
            }
            bhke bhke2 = (bhke) this.f118904c.get();
            if (bhke2 != null) {
                bhke2.mo63611c();
                bhke2.onStateChange(bhke2.getState());
            }
        }
    }
}
