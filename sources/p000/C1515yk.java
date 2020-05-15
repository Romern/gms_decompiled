package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: yk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1515yk extends aap implements C1517ym {

    /* renamed from: a */
    public CharSequence f27650a;

    /* renamed from: b */
    ListAdapter f27651b;

    /* renamed from: c */
    public final Rect f27652c = new Rect();

    /* renamed from: d */
    final /* synthetic */ AppCompatSpinner f27653d;

    /* renamed from: r */
    private int f27654r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1515yk(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27653d = appCompatSpinner;
        this.f67l = appCompatSpinner;
        mo114m();
        this.f68m = new C1512yh(this);
    }

    /* renamed from: a */
    public final CharSequence mo16535a() {
        return this.f27650a;
    }

    /* renamed from: a */
    public final void mo16540a(CharSequence charSequence) {
        this.f27650a = charSequence;
    }

    /* renamed from: c */
    public final void mo16544c(int i) {
        this.f27654r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo16565h() {
        Drawable b = mo102b();
        int i = 0;
        if (b != null) {
            b.getPadding(this.f27653d.f1191d);
            i = aek.m624a(this.f27653d) ? this.f27653d.f1191d.right : -this.f27653d.f1191d.left;
        } else {
            Rect rect = this.f27653d.f1191d;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.f27653d.getPaddingLeft();
        int paddingRight = this.f27653d.getPaddingRight();
        int width = this.f27653d.getWidth();
        AppCompatSpinner appCompatSpinner = this.f27653d;
        int i2 = appCompatSpinner.f1190c;
        if (i2 == -2) {
            int a = appCompatSpinner.mo1354a((SpinnerAdapter) this.f27651b, mo102b());
            int i3 = (this.f27653d.getContext().getResources().getDisplayMetrics().widthPixels - this.f27653d.f1191d.left) - this.f27653d.f1191d.right;
            if (a > i3) {
                a = i3;
            }
            mo106d(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            mo106d((width - paddingLeft) - paddingRight);
        } else {
            mo106d(i2);
        }
        this.f62g = aek.m624a(this.f27653d) ? i + (((width - paddingRight) - this.f61f) - this.f27654r) : i + paddingLeft + this.f27654r;
    }

    /* renamed from: a */
    public final void mo16537a(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean e = mo107e();
        mo16565h();
        mo113l();
        super.mo101aI();
        C1543zl zlVar = this.f60e;
        zlVar.setChoiceMode(1);
        int i3 = Build.VERSION.SDK_INT;
        zlVar.setTextDirection(i);
        zlVar.setTextAlignment(i2);
        int selectedItemPosition = this.f27653d.getSelectedItemPosition();
        C1543zl zlVar2 = this.f60e;
        if (mo107e() && zlVar2 != null) {
            zlVar2.f27742a = false;
            zlVar2.setSelection(selectedItemPosition);
            if (zlVar2.getChoiceMode() != 0) {
                zlVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!e && (viewTreeObserver = this.f27653d.getViewTreeObserver()) != null) {
            C1513yi yiVar = new C1513yi(this);
            viewTreeObserver.addOnGlobalLayoutListener(yiVar);
            mo100a(new C1514yj(this, yiVar));
        }
    }

    /* renamed from: a */
    public final void mo99a(ListAdapter listAdapter) {
        super.mo99a(listAdapter);
        this.f27651b = listAdapter;
    }
}
