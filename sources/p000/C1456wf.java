package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1456wf {

    /* renamed from: a */
    public View f27493a;

    /* renamed from: b */
    public PopupWindow.OnDismissListener f27494b;

    /* renamed from: c */
    private final Context f27495c;

    /* renamed from: d */
    private final C1443vt f27496d;

    /* renamed from: e */
    private final boolean f27497e;

    /* renamed from: f */
    private final int f27498f;

    /* renamed from: g */
    private int f27499g;

    /* renamed from: h */
    private boolean f27500h;

    /* renamed from: i */
    private C1457wg f27501i;

    /* renamed from: j */
    private C1454wd f27502j;

    /* renamed from: k */
    private final PopupWindow.OnDismissListener f27503k;

    public C1456wf(Context context, C1443vt vtVar, View view, boolean z) {
        this(context, vtVar, view, z, C0126R.attr.actionOverflowMenuStyle);
    }

    /* renamed from: a */
    public final void mo16391a() {
        if (!mo16396c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public final C1454wd mo16395b() {
        C1454wd wdVar;
        if (this.f27502j == null) {
            Display defaultDisplay = ((WindowManager) this.f27495c.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            int i = Build.VERSION.SDK_INT;
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.f27495c.getResources().getDimensionPixelSize(C0126R.dimen.abc_cascading_menus_min_smallest_width)) {
                wdVar = new C1437vn(this.f27495c, this.f27493a, this.f27498f, this.f27497e);
            } else {
                wdVar = new C1465wo(this.f27495c, this.f27496d, this.f27493a, this.f27498f, this.f27497e);
            }
            wdVar.mo16193a(this.f27496d);
            wdVar.mo16192a(this.f27503k);
            wdVar.mo16191a(this.f27493a);
            wdVar.mo469a(this.f27501i);
            wdVar.mo16195b(this.f27500h);
            wdVar.mo16190a(this.f27499g);
            this.f27502j = wdVar;
        }
        return this.f27502j;
    }

    /* renamed from: c */
    public final boolean mo16396c() {
        if (mo16399f()) {
            return true;
        }
        if (this.f27493a == null) {
            return false;
        }
        mo16392a(0, 0, false, false);
        return true;
    }

    /* renamed from: d */
    public final void mo16397d() {
        if (mo16399f()) {
            this.f27502j.mo105d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo16398e() {
        this.f27502j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f27494b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public final boolean mo16399f() {
        C1454wd wdVar = this.f27502j;
        return wdVar != null && wdVar.mo107e();
    }

    /* renamed from: g */
    public final void mo16400g() {
        this.f27499g = 8388613;
    }

    public C1456wf(Context context, C1443vt vtVar, View view, boolean z, int i) {
        this.f27499g = 8388611;
        this.f27503k = new C1455we(this);
        this.f27495c = context;
        this.f27496d = vtVar;
        this.f27493a = view;
        this.f27497e = z;
        this.f27498f = i;
    }

    /* renamed from: a */
    public final void mo16392a(int i, int i2, boolean z, boolean z2) {
        C1454wd b = mo16395b();
        b.mo16197c(z2);
        if (z) {
            if ((C1256ov.m19815a(this.f27499g, C1280ps.m19923h(this.f27493a)) & 7) == 5) {
                i -= this.f27493a.getWidth();
            }
            b.mo16194b(i);
            b.mo16196c(i2);
            int i3 = (int) ((this.f27495c.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.f27491g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        b.mo101aI();
    }

    /* renamed from: a */
    public final void mo16393a(C1457wg wgVar) {
        this.f27501i = wgVar;
        C1454wd wdVar = this.f27502j;
        if (wdVar != null) {
            wdVar.mo469a(wgVar);
        }
    }

    /* renamed from: a */
    public final void mo16394a(boolean z) {
        this.f27500h = z;
        C1454wd wdVar = this.f27502j;
        if (wdVar != null) {
            wdVar.mo16195b(z);
        }
    }
}
