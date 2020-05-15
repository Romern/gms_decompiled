package p000;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.google.android.chimera.Fragment;

/* renamed from: hbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hbo extends Dialog {

    /* renamed from: a */
    final /* synthetic */ hbp f19423a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hbo(hbp hbp, Context context, int i) {
        super(context, i);
        this.f19423a = hbp;
    }

    public final void onBackPressed() {
        hbz hbz;
        WebView webView;
        Fragment findFragmentById = this.f19423a.getChildFragmentManager().findFragmentById(hbp.f19425b);
        if (findFragmentById == null || (webView = (hbz = (hbz) findFragmentById).f19453b) == null || !webView.canGoBack()) {
            Dialog dialog = this.f19423a.getDialog();
            if (dialog != null) {
                this.f19423a.f19428e.mo12513a(12);
                this.f19423a.onDismiss(dialog);
                return;
            }
            return;
        }
        hbz.f19453b.goBack();
        this.f19423a.f19428e.mo12513a(11);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View decorView;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Window window = getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null)) {
            Rect rect = new Rect();
            decorView.getHitRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                hbp hbp = this.f19423a;
                int i = hbp.f19424a;
                hbp.f19428e.mo12513a(6);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
