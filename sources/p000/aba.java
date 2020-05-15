package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aba {

    /* renamed from: a */
    public final C1443vt f93a;

    /* renamed from: b */
    final C1456wf f94b;

    /* renamed from: c */
    public aaz f95c;

    /* renamed from: d */
    private final Context f96d;

    /* renamed from: a */
    public final MenuInflater mo137a() {
        return new C1422uz(this.f96d);
    }

    /* renamed from: b */
    public final void mo138b() {
        this.f94b.mo16391a();
    }

    public aba(Context context, View view) {
        this.f96d = context;
        C1443vt vtVar = new C1443vt(context);
        this.f93a = vtVar;
        vtVar.f27424b = new aax(this);
        C1456wf wfVar = new C1456wf(context, this.f93a, view, false, C0126R.attr.popupMenuStyle);
        this.f94b = wfVar;
        wfVar.mo16400g();
        this.f94b.f27494b = new aay();
    }
}
