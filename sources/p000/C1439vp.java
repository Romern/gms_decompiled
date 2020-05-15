package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: vp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1439vp implements AdapterView.OnItemClickListener, C1458wh {

    /* renamed from: a */
    Context f27408a;

    /* renamed from: b */
    public LayoutInflater f27409b;

    /* renamed from: c */
    C1443vt f27410c;

    /* renamed from: d */
    public ExpandedMenuView f27411d;

    /* renamed from: e */
    int f27412e;

    /* renamed from: f */
    final int f27413f = C0126R.C0128layout.abc_list_menu_item_layout;

    /* renamed from: g */
    public C1457wg f27414g;

    /* renamed from: h */
    public C1438vo f27415h;

    /* renamed from: a */
    public final void mo466a(Context context, C1443vt vtVar) {
        if (this.f27408a != null) {
            this.f27408a = context;
            if (this.f27409b == null) {
                this.f27409b = LayoutInflater.from(context);
            }
        }
        this.f27410c = vtVar;
        C1438vo voVar = this.f27415h;
        if (voVar != null) {
            voVar.notifyDataSetChanged();
        }
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
    public final boolean mo472a(C1446vw vwVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo474b() {
        return 0;
    }

    /* renamed from: b */
    public final boolean mo475b(C1446vw vwVar) {
        return false;
    }

    /* renamed from: c */
    public final ListAdapter mo16208c() {
        if (this.f27415h == null) {
            this.f27415h = new C1438vo(this);
        }
        return this.f27415h;
    }

    /* renamed from: f */
    public final Parcelable mo476f() {
        if (this.f27411d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f27411d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f27410c.mo16228a(this.f27415h.getItem(i), this, 0);
    }

    public C1439vp(Context context) {
        this.f27408a = context;
        this.f27409b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final void mo467a(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f27411d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public final void mo468a(C1443vt vtVar, boolean z) {
        C1457wg wgVar = this.f27414g;
        if (wgVar != null) {
            wgVar.mo15958a(vtVar, z);
        }
    }

    /* renamed from: a */
    public final void mo470a(boolean z) {
        C1438vo voVar = this.f27415h;
        if (voVar != null) {
            voVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo473a(C1466wp wpVar) {
        if (!wpVar.hasVisibleItems()) {
            return false;
        }
        C1444vu vuVar = new C1444vu(wpVar);
        C1443vt vtVar = vuVar.f27447a;
        C1349sg sgVar = new C1349sg(vtVar.f27423a);
        vuVar.f27449c = new C1439vp(sgVar.mo15890a());
        C1439vp vpVar = vuVar.f27449c;
        vpVar.f27414g = vuVar;
        vuVar.f27447a.mo16224a(vpVar);
        sgVar.mo15899a(vuVar.f27449c.mo16208c(), vuVar);
        View view = vtVar.f27429g;
        if (view != null) {
            sgVar.mo15897a(view);
        } else {
            sgVar.mo15896a(vtVar.f27428f);
            sgVar.mo15908b(vtVar.f27427e);
        }
        sgVar.mo15895a((DialogInterface.OnKeyListener) vuVar);
        vuVar.f27448b = sgVar.mo15904b();
        vuVar.f27448b.setOnDismissListener(vuVar);
        WindowManager.LayoutParams attributes = vuVar.f27448b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        vuVar.f27448b.show();
        C1457wg wgVar = this.f27414g;
        if (wgVar == null) {
            return true;
        }
        wgVar.mo15959a(wpVar);
        return true;
    }
}
