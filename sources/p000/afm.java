package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: afm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class afm {

    /* renamed from: a */
    public ComplicationData f447a;

    /* renamed from: b */
    private final Rect f448b = new Rect();

    /* renamed from: a */
    public Layout.Alignment mo589a() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: a */
    public void mo590a(int i) {
        this.f448b.right = i;
    }

    /* renamed from: a */
    public void mo592a(ComplicationData complicationData) {
        this.f447a = complicationData;
    }

    /* renamed from: b */
    public int mo593b() {
        return 17;
    }

    /* renamed from: b */
    public void mo594b(int i) {
        this.f448b.bottom = i;
    }

    /* renamed from: c */
    public Layout.Alignment mo595c() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: d */
    public int mo597d() {
        return 17;
    }

    /* renamed from: e */
    public Layout.Alignment mo599e() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: f */
    public int mo601f() {
        return 17;
    }

    /* renamed from: g */
    public Layout.Alignment mo603g() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: h */
    public int mo605h() {
        return 17;
    }

    /* renamed from: i */
    public void mo607i(Rect rect) {
        rect.setEmpty();
    }

    /* renamed from: c */
    public final void mo596c(Rect rect) {
        rect.set(this.f448b);
    }

    /* renamed from: d */
    public void mo598d(Rect rect) {
        rect.setEmpty();
    }

    /* renamed from: e */
    public void mo600e(Rect rect) {
        rect.setEmpty();
    }

    /* renamed from: f */
    public void mo602f(Rect rect) {
        rect.setEmpty();
    }

    /* renamed from: g */
    public void mo604g(Rect rect) {
        rect.setEmpty();
    }

    /* renamed from: h */
    public void mo606h(Rect rect) {
        rect.setEmpty();
    }

    /* renamed from: a */
    public final void mo591a(int i, int i2, ComplicationData complicationData) {
        mo590a(i);
        mo594b(i2);
        mo592a(complicationData);
    }

    /* renamed from: b */
    public void mo588b(Rect rect) {
        rect.setEmpty();
    }

    /* renamed from: a */
    public void mo587a(Rect rect) {
        rect.setEmpty();
    }
}
