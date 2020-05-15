package p000;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cqh {

    /* renamed from: a */
    static Integer f11842a;

    /* renamed from: b */
    public final View f11843b;

    /* renamed from: c */
    public final List f11844c = new ArrayList();

    /* renamed from: d */
    public cqg f11845d;

    public cqh(View view) {
        this.f11843b = view;
    }

    /* renamed from: a */
    private final int m7350a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (this.f11843b.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = this.f11843b.getContext();
        if (f11842a == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            crb.m7382a(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f11842a = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f11842a.intValue();
    }

    /* renamed from: a */
    private static final boolean m7351a(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public final int mo8137b() {
        int paddingTop = this.f11843b.getPaddingTop() + this.f11843b.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.f11843b.getLayoutParams();
        return m7350a(this.f11843b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    /* renamed from: c */
    public final int mo8138c() {
        int paddingLeft = this.f11843b.getPaddingLeft() + this.f11843b.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.f11843b.getLayoutParams();
        return m7350a(this.f11843b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* renamed from: a */
    public static final boolean m7352a(int i, int i2) {
        return m7351a(i) && m7351a(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8136a() {
        ViewTreeObserver viewTreeObserver = this.f11843b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f11845d);
        }
        this.f11845d = null;
        this.f11844c.clear();
    }
}
