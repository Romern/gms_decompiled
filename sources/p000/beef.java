package p000;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;

/* renamed from: beef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beef {

    /* renamed from: a */
    private Object f107022a;

    /* renamed from: b */
    private WeakReference f107023b;

    /* renamed from: c */
    private boolean f107024c = false;

    /* renamed from: d */
    private boolean f107025d = true;

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:12:0x001b */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* renamed from: a */
    public final synchronized Object mo58597a() {
        Paint paint;
        if (!this.f107024c) {
            this.f107024c = true;
            beeh.m91848a(this);
        }
        Object obj = this.f107022a;
        paint = obj;
        if (obj == null) {
            WeakReference weakReference = this.f107023b;
            if (weakReference != null) {
                paint = weakReference.get();
            } else {
                paint = null;
            }
            if (paint == null) {
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setTextAlign(Paint.Align.CENTER);
                paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
                bmxy.m108581a(paint2);
                if (!this.f107025d) {
                    this.f107023b = new WeakReference(paint2);
                    paint = paint2;
                } else {
                    this.f107022a = paint2;
                    this.f107023b = null;
                    paint = paint2;
                }
            }
        }
        return paint;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo58598b() {
        if (!this.f107025d) {
            this.f107025d = true;
            if (this.f107022a == null) {
                WeakReference weakReference = this.f107023b;
                Object obj = weakReference != null ? weakReference.get() : null;
                if (obj == null) {
                    this.f107023b = null;
                } else {
                    this.f107022a = obj;
                }
            }
        }
    }
}
