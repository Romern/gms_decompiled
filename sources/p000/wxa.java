package p000;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: wxa */
final /* synthetic */ class wxa implements Runnable {

    /* renamed from: a */
    private final int f51526a;

    /* renamed from: b */
    private final View f51527b;

    /* renamed from: c */
    private final View f51528c;

    public wxa(int i, View view, View view2) {
        this.f51526a = i;
        this.f51527b = view;
        this.f51528c = view2;
    }

    public final void run() {
        int i = this.f51526a;
        View view = this.f51527b;
        View view2 = this.f51528c;
        int ceil = (int) Math.ceil((double) (((float) (i - view.getHeight())) / 2.0f));
        int ceil2 = (int) Math.ceil((double) (((float) (i - view.getWidth())) / 2.0f));
        if (ceil > 0 || ceil2 > 0) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            rect.top -= ceil;
            rect.bottom += ceil;
            rect.left -= ceil2;
            rect.right += ceil2;
            view2.setTouchDelegate(new TouchDelegate(rect, view));
        }
    }
}
