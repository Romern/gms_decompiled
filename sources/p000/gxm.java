package p000;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

/* renamed from: gxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gxm extends Dialog {

    /* renamed from: a */
    final /* synthetic */ gxn f19177a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gxm(gxn gxn, Context context, int i) {
        super(context, i);
        this.f19177a = gxn;
    }

    public final void onBackPressed() {
        gxn gxn = this.f19177a;
        bnhe bnhe = gxn.f19178a;
        gxn.f19179b.mo12513a(12);
        super.onBackPressed();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            Rect rect = new Rect();
            decorView.getHitRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                gxn gxn = this.f19177a;
                bnhe bnhe = gxn.f19178a;
                gxn.f19179b.mo12513a(6);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
