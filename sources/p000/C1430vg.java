package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: vg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1430vg implements C1458wh {

    /* renamed from: a */
    protected final Context f27361a;

    /* renamed from: b */
    public Context f27362b;

    /* renamed from: c */
    public C1443vt f27363c;

    /* renamed from: d */
    public final LayoutInflater f27364d;

    /* renamed from: e */
    public C1457wg f27365e;

    /* renamed from: f */
    public C1460wj f27366f;

    /* renamed from: g */
    public int f27367g;

    public C1430vg(Context context) {
        this.f27361a = context;
        this.f27364d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public View mo16182a(C1446vw vwVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    /* renamed from: a */
    public void mo466a(Context context, C1443vt vtVar) {
        throw null;
    }

    /* renamed from: a */
    public void mo468a(C1443vt vtVar, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final void mo469a(C1457wg wgVar) {
        throw null;
    }

    /* renamed from: a */
    public void mo470a(boolean z) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo471a() {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo472a(C1446vw vwVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo474b() {
        return this.f27367g;
    }

    /* renamed from: b */
    public final boolean mo475b(C1446vw vwVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo473a(C1466wp wpVar) {
        C1457wg wgVar = this.f27365e;
        if (wgVar != null) {
            return wgVar.mo15959a(wpVar);
        }
        return false;
    }
}
