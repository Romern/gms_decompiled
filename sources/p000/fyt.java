package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: fyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fyt extends FrameLayout {

    /* renamed from: a */
    public fzc f17658a;

    /* renamed from: b */
    public fxj f17659b;

    /* renamed from: c */
    public fxg f17660c;

    /* renamed from: d */
    public fys f17661d;

    /* renamed from: e */
    public boolean f17662e;

    /* renamed from: f */
    public boolean f17663f = true;

    /* renamed from: g */
    public fwo f17664g;

    public fyt(Context context) {
        super(context);
        fzf fzf = new fzf(context);
        this.f17658a = fzf;
        fzf.f17726a = this;
        fzf.setItemAnimator(null);
        addView(this.f17658a, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo11525a() {
        if (this.f17662e) {
            int max = Math.max(0, this.f17658a.getChildPosition(this.f17658a.getChildAt(0)));
            if (!this.f17663f || max < this.f17659b.mo11478g()) {
                if (this.f17661d.getVisibility() != 8) {
                    this.f17659b.mo11457a(this.f17660c.mo11466e());
                }
                this.f17661d.setVisibility(8);
                return;
            }
            if (this.f17661d.getVisibility() != 0) {
                this.f17660c.mo11457a(this.f17659b.mo11466e());
            }
            this.f17661d.setVisibility(0);
        }
    }

    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        fza fza = ((fzf) this.f17658a).f17732e;
        return (fza != null && fza.mo11543a(motionEvent)) || super.onInterceptHoverEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fza fza = ((fzf) this.f17658a).f17732e;
        return (fza != null && fza.mo11543a(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fza fza = ((fzf) this.f17658a).f17732e;
        return (fza != null && fza.mo11546b(motionEvent)) || super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo11526a(int i) {
        fzf fzf = (fzf) this.f17658a;
        fzf.f17733f = i;
        fza fza = fzf.f17732e;
        if (fza != null) {
            fza.mo11540a(i);
        }
    }

    /* renamed from: a */
    public final boolean mo11527a(MotionEvent motionEvent) {
        return this.f17658a.onTouchEvent(motionEvent);
    }
}
