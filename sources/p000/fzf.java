package p000;

import android.content.Context;

/* renamed from: fzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzf extends fzc {

    /* renamed from: c */
    public final Thread f17730c = Thread.currentThread();

    /* renamed from: d */
    public boolean f17731d;

    /* renamed from: e */
    public fza f17732e;

    /* renamed from: f */
    public int f17733f;

    /* renamed from: g */
    private fze f17734g;

    /* renamed from: h */
    private int f17735h = 0;

    public fzf(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo11554a() {
        fza fza = this.f17732e;
        if (fza == null) {
            fza fza2 = new fza(this.f17726a, this);
            this.f17732e = fza2;
            fza2.mo11540a(this.f17733f);
            this.f17732e.mo11550e();
        } else {
            fza.mo11550e();
        }
        fza fza3 = this.f17732e;
        if (fza3 != null) {
            fza3.mo11544b();
        }
    }

    public final int getVerticalScrollbarWidth() {
        fza fza = this.f17732e;
        if (fza == null || !fza.mo11542a()) {
            return super.getVerticalScrollbarWidth();
        }
        return Math.max(super.getVerticalScrollbarWidth(), this.f17732e.f17704b);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getAdapter() != null && this.f17734g == null) {
            this.f17734g = new fze(this);
            getAdapter().mo166a(this.f17734g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getAdapter() != null && this.f17734g != null) {
            getAdapter().mo174b(this.f17734g);
            this.f17734g = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f17732e != null && getAdapter() != null) {
            fza fza = this.f17732e;
            int childCount = getChildCount();
            int a = getAdapter().mo161a();
            if (fza.f17710h != a || fza.f17711i != childCount) {
                fza.f17710h = a;
                fza.f17711i = childCount;
                if (a - childCount > 0 && fza.f17707e != 2) {
                    fzf fzf = fza.f17702a;
                    fza.mo11539a(fza.mo11538a(fzf.getChildPosition(fzf.getChildAt(0)), childCount, a));
                }
                fza.mo11541a(childCount, a);
            }
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        fza fza = this.f17732e;
        if (fza != null) {
            fza.mo11545b(getVerticalScrollbarPosition());
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fza fza = this.f17732e;
        if (fza != null) {
            fza.mo11544b();
        }
    }

    public final void setAdapter(abh abh) {
        super.setAdapter(abh);
        if (getParent() != null && this.f17734g == null) {
            fze fze = new fze(this);
            this.f17734g = fze;
            abh.mo166a(fze);
        }
    }

    public final void setScrollBarStyle(int i) {
        super.setScrollBarStyle(i);
        fza fza = this.f17732e;
        if (fza != null && fza.f17709g != i) {
            fza.f17709g = i;
            fza.mo11544b();
        }
    }

    public final void setVerticalScrollbarPosition(int i) {
        super.setVerticalScrollbarPosition(i);
        fza fza = this.f17732e;
        if (fza != null) {
            fza.mo11545b(i);
        }
    }

    /* renamed from: a */
    public final void mo11551a(int i) {
        abz abz;
        if (i != this.f17735h && (abz = this.f17727b) != null) {
            this.f17735h = i;
            abz.mo270a(this, i);
        }
    }

    /* renamed from: a */
    public final void mo11552a(int i, int i2, int i3) {
        long j;
        fza fza = this.f17732e;
        if (fza == null) {
            return;
        }
        if (fza.mo11542a()) {
            if (i3 - i2 > 0 && fza.f17707e != 2) {
                fza.mo11539a(fza.mo11538a(i, i2, i3));
            }
            abh abh = fza.f17708f;
            if (abh != null) {
                j = abh.mo157L(i);
            } else {
                j = (long) i;
            }
            if (fza.f17706d != j) {
                fza.f17706d = j;
                if (fza.f17707e != 2) {
                    fza.mo11548c(1);
                    fza.mo11547c();
                    return;
                }
                return;
            }
            return;
        }
        fza.mo11548c(0);
    }
}
