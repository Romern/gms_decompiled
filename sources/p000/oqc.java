package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.InputFocusChangedEvent;

/* renamed from: oqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oqc implements oor {

    /* renamed from: a */
    final /* synthetic */ oqa f38232a;

    public oqc(oqa oqa) {
        this.f38232a = oqa;
    }

    /* renamed from: a */
    public final String mo21456a() {
        return "WatermarkHandler";
    }

    /* renamed from: a */
    public final void mo21457a(int i) {
    }

    /* renamed from: b */
    public final void mo21463b(oos oos) {
    }

    /* renamed from: c */
    public final void mo21464c(oos oos) {
    }

    /* renamed from: d */
    public final void mo21465d(oos oos) {
    }

    /* renamed from: e */
    public final void mo21466e(oos oos) {
    }

    /* renamed from: y */
    public final void mo21467y() {
    }

    /* renamed from: a */
    public final void mo21458a(InputFocusChangedEvent inputFocusChangedEvent) {
        throw new RuntimeException("Watermark window received focus");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oqa.a(oos, boolean):void
     arg types: [oos, int]
     candidates:
      oqa.a(int, oor):oos
      oqa.a(oos, int):void
      oqa.a(oos, android.view.animation.Animation):void
      oqa.a(oos, android.view.KeyEvent):boolean
      oef.a(int, boolean):void
      oqa.a(oos, boolean):void */
    /* renamed from: a */
    public final void mo21459a(oos oos) {
        this.f38232a.mo21665a(oos, true);
    }

    /* renamed from: a */
    public final void mo21460a(oos oos, int i, int i2) {
        oqa oqa = this.f38232a;
        oqb oqb = new oqb(oos, i, i2, oqa);
        nvg nvg = ((nvk) oqa).f36665k;
        if (nvg != null) {
            nvg.postAtFrontOfQueue(oqb);
        }
    }

    /* renamed from: a */
    public final void mo21461a(oos oos, KeyEvent keyEvent) {
        throw new RuntimeException("Key event in watermark window");
    }

    /* renamed from: a */
    public final void mo21462a(oos oos, MotionEvent motionEvent) {
        throw new RuntimeException("Touch event in watermark window");
    }
}
