package p000;

import android.content.Context;
import android.support.p002v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* renamed from: sz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1368sz extends ContentFrameLayout {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27047a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1368sz(C1372tc tcVar, Context context) {
        super(context);
        this.f27047a = tcVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f27047a.mo15990a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tc.a(ta, boolean):void
     arg types: [ta, int]
     candidates:
      tc.a(android.content.Context, int):int
      tc.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      tc.a(ta, android.view.KeyEvent):boolean
      tc.a(vt, android.view.MenuItem):boolean
      sk.a(android.app.Activity, sj):sk
      sk.a(android.app.Dialog, sj):sk
      sk.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      vr.a(vt, android.view.MenuItem):boolean
      tc.a(ta, boolean):void */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                C1372tc tcVar = this.f27047a;
                tcVar.mo15989a(tcVar.mo15995f(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C1391tv.m20459b(getContext(), i));
    }
}
