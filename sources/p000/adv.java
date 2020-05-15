package p000;

import android.content.Context;
import android.os.Parcelable;
import android.support.p002v7.widget.AppCompatImageButton;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: adv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adv implements C1458wh {

    /* renamed from: a */
    C1443vt f295a;

    /* renamed from: b */
    public C1446vw f296b;

    /* renamed from: c */
    final /* synthetic */ Toolbar f297c;

    public adv(Toolbar toolbar) {
        this.f297c = toolbar;
    }

    /* renamed from: a */
    public final void mo466a(Context context, C1443vt vtVar) {
        C1446vw vwVar;
        C1443vt vtVar2 = this.f295a;
        if (!(vtVar2 == null || (vwVar = this.f296b) == null)) {
            vtVar2.mo16244b(vwVar);
        }
        this.f295a = vtVar;
    }

    /* renamed from: a */
    public final void mo467a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public final void mo468a(C1443vt vtVar, boolean z) {
    }

    /* renamed from: a */
    public final void mo469a(C1457wg wgVar) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo471a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo473a(C1466wp wpVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo474b() {
        return 0;
    }

    /* renamed from: f */
    public final Parcelable mo476f() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo475b(C1446vw vwVar) {
        Toolbar toolbar = this.f297c;
        if (toolbar.f1339e == null) {
            toolbar.f1339e = new AppCompatImageButton(toolbar.getContext(), null, C0126R.attr.toolbarNavigationButtonStyle);
            toolbar.f1339e.setImageDrawable(toolbar.f1337c);
            toolbar.f1339e.setContentDescription(toolbar.f1338d);
            adw s = Toolbar.m1367s();
            s.f26956a = (toolbar.f1344j & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) | 8388611;
            s.f298b = 2;
            toolbar.f1339e.setLayoutParams(s);
            toolbar.f1339e.setOnClickListener(new adu(toolbar));
        }
        ViewParent parent = this.f297c.f1339e.getParent();
        Toolbar toolbar2 = this.f297c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.f1339e);
            }
            Toolbar toolbar3 = this.f297c;
            toolbar3.addView(toolbar3.f1339e);
        }
        this.f297c.f1340f = vwVar.getActionView();
        this.f296b = vwVar;
        ViewParent parent2 = this.f297c.f1340f.getParent();
        Toolbar toolbar4 = this.f297c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.f1340f);
            }
            adw s2 = Toolbar.m1367s();
            Toolbar toolbar5 = this.f297c;
            s2.f26956a = 8388611 | (toolbar5.f1344j & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
            s2.f298b = 2;
            toolbar5.f1340f.setLayoutParams(s2);
            Toolbar toolbar6 = this.f297c;
            toolbar6.addView(toolbar6.f1340f);
        }
        Toolbar toolbar7 = this.f297c;
        for (int childCount = toolbar7.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar7.getChildAt(childCount);
            if (!(((adw) childAt.getLayoutParams()).f298b == 2 || childAt == toolbar7.f1335a)) {
                toolbar7.removeViewAt(childCount);
                toolbar7.f1350p.add(childAt);
            }
        }
        this.f297c.requestLayout();
        vwVar.mo16288e(true);
        View view = this.f297c.f1340f;
        if (view instanceof C1415us) {
            ((C1415us) view).mo1612a();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo470a(boolean z) {
        if (this.f296b != null) {
            C1443vt vtVar = this.f295a;
            if (vtVar != null) {
                int size = vtVar.size();
                int i = 0;
                while (i < size) {
                    if (this.f295a.getItem(i) != this.f296b) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            mo472a(this.f296b);
        }
    }

    /* renamed from: a */
    public final boolean mo472a(C1446vw vwVar) {
        View view = this.f297c.f1340f;
        if (view instanceof C1415us) {
            ((C1415us) view).mo1619b();
        }
        Toolbar toolbar = this.f297c;
        toolbar.removeView(toolbar.f1340f);
        Toolbar toolbar2 = this.f297c;
        toolbar2.removeView(toolbar2.f1339e);
        Toolbar toolbar3 = this.f297c;
        toolbar3.f1340f = null;
        for (int size = toolbar3.f1350p.size() - 1; size >= 0; size--) {
            toolbar3.addView((View) toolbar3.f1350p.get(size));
        }
        toolbar3.f1350p.clear();
        this.f296b = null;
        this.f297c.requestLayout();
        vwVar.mo16288e(false);
        return true;
    }
}
