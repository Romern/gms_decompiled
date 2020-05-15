package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: bhjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhjs implements C1458wh {

    /* renamed from: a */
    public NavigationMenuView f118854a;

    /* renamed from: b */
    public LinearLayout f118855b;

    /* renamed from: c */
    C1443vt f118856c;

    /* renamed from: d */
    public int f118857d;

    /* renamed from: e */
    public bhjl f118858e;

    /* renamed from: f */
    public LayoutInflater f118859f;

    /* renamed from: g */
    public int f118860g;

    /* renamed from: h */
    public boolean f118861h;

    /* renamed from: i */
    public ColorStateList f118862i;

    /* renamed from: j */
    public ColorStateList f118863j;

    /* renamed from: k */
    public Drawable f118864k;

    /* renamed from: l */
    public int f118865l;

    /* renamed from: m */
    public int f118866m;

    /* renamed from: n */
    public int f118867n;

    /* renamed from: o */
    public boolean f118868o;

    /* renamed from: p */
    public boolean f118869p = true;

    /* renamed from: q */
    public int f118870q;

    /* renamed from: r */
    public int f118871r;

    /* renamed from: s */
    int f118872s;

    /* renamed from: t */
    public int f118873t = -1;

    /* renamed from: u */
    final View.OnClickListener f118874u = new bhjk(this);

    /* renamed from: a */
    public final void mo63882a(int i) {
        this.f118873t = i;
        NavigationMenuView navigationMenuView = this.f118854a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
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
    public final boolean mo472a(C1446vw vwVar) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo473a(C1466wp wpVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo474b() {
        return this.f118857d;
    }

    /* renamed from: b */
    public final void mo63883b(boolean z) {
        bhjl bhjl = this.f118858e;
        if (bhjl != null) {
            bhjl.f118847e = z;
        }
    }

    /* renamed from: b */
    public final boolean mo475b(C1446vw vwVar) {
        return false;
    }

    /* renamed from: c */
    public final void mo63884c() {
        int i;
        if (this.f118855b.getChildCount() != 0 || !this.f118869p) {
            i = 0;
        } else {
            i = this.f118871r;
        }
        NavigationMenuView navigationMenuView = this.f118854a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: f */
    public final Parcelable mo476f() {
        View view;
        Bundle bundle = new Bundle();
        if (this.f118854a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f118854a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        bhjl bhjl = this.f118858e;
        if (bhjl != null) {
            Bundle bundle2 = new Bundle();
            C1446vw vwVar = bhjl.f118846d;
            if (vwVar != null) {
                bundle2.putInt("android:menu:checked", vwVar.f27454a);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = bhjl.f118845a.size();
            for (int i = 0; i < size; i++) {
                bhjn bhjn = (bhjn) bhjl.f118845a.get(i);
                if (bhjn instanceof bhjp) {
                    C1446vw vwVar2 = ((bhjp) bhjn).f118851a;
                    if (vwVar2 != null) {
                        view = vwVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(vwVar2.f27454a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f118855b != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f118855b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo466a(Context context, C1443vt vtVar) {
        this.f118859f = LayoutInflater.from(context);
        this.f118856c = vtVar;
        this.f118872s = context.getResources().getDimensionPixelOffset(C0126R.dimen.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public final void mo467a(Parcelable parcelable) {
        C1446vw vwVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        C1446vw vwVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f118854a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                bhjl bhjl = this.f118858e;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    bhjl.f118847e = true;
                    int size = bhjl.f118845a.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        bhjn bhjn = (bhjn) bhjl.f118845a.get(i2);
                        if ((bhjn instanceof bhjp) && (vwVar2 = ((bhjp) bhjn).f118851a) != null && vwVar2.f27454a == i) {
                            bhjl.mo63880a(vwVar2);
                            break;
                        }
                        i2++;
                    }
                    bhjl.f118847e = false;
                    bhjl.mo63881c();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = bhjl.f118845a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        bhjn bhjn2 = (bhjn) bhjl.f118845a.get(i3);
                        if (!(!(bhjn2 instanceof bhjp) || (vwVar = ((bhjp) bhjn2).f118851a) == null || (actionView = vwVar.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(vwVar.f27454a)) == null)) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f118855b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* renamed from: a */
    public final void mo470a(boolean z) {
        bhjl bhjl = this.f118858e;
        if (bhjl != null) {
            bhjl.mo63881c();
            bhjl.mo171aJ();
        }
    }
}
