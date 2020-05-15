package p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;

/* renamed from: bhfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfa implements C1458wh {

    /* renamed from: a */
    public bhey f118459a;

    /* renamed from: b */
    public boolean f118460b = false;

    /* renamed from: c */
    public int f118461c;

    /* renamed from: d */
    private C1443vt f118462d;

    /* renamed from: a */
    public final void mo466a(Context context, C1443vt vtVar) {
        this.f118462d = vtVar;
        this.f118459a.f118449o = vtVar;
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
        return this.f118461c;
    }

    /* renamed from: b */
    public final boolean mo475b(C1446vw vwVar) {
        return false;
    }

    /* renamed from: f */
    public final Parcelable mo476f() {
        BottomNavigationPresenter$SavedState bottomNavigationPresenter$SavedState = new BottomNavigationPresenter$SavedState();
        bhey bhey = this.f118459a;
        bottomNavigationPresenter$SavedState.f151066a = bhey.f118439e;
        bottomNavigationPresenter$SavedState.f151067b = bhen.m100723a(bhey.f118447m);
        return bottomNavigationPresenter$SavedState;
    }

    /* renamed from: a */
    public final void mo467a(Parcelable parcelable) {
        if (parcelable instanceof BottomNavigationPresenter$SavedState) {
            bhey bhey = this.f118459a;
            BottomNavigationPresenter$SavedState bottomNavigationPresenter$SavedState = (BottomNavigationPresenter$SavedState) parcelable;
            int i = bottomNavigationPresenter$SavedState.f151066a;
            int size = bhey.f118449o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = bhey.f118449o.getItem(i2);
                if (i == item.getItemId()) {
                    bhey.f118439e = i;
                    bhey.f118440f = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            SparseArray a = bhen.m100722a(this.f118459a.getContext(), bottomNavigationPresenter$SavedState.f151067b);
            bhey bhey2 = this.f118459a;
            bhey2.f118447m = a;
            bhev[] bhevArr = bhey2.f118438d;
            if (bhevArr != null) {
                for (bhev bhev : bhevArr) {
                    bhev.mo63632a((bhem) a.get(bhev.getId()));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo470a(boolean z) {
        if (this.f118460b) {
            return;
        }
        if (!z) {
            bhey bhey = this.f118459a;
            C1443vt vtVar = bhey.f118449o;
            if (vtVar != null && bhey.f118438d != null) {
                int size = vtVar.size();
                if (size == bhey.f118438d.length) {
                    int i = bhey.f118439e;
                    for (int i2 = 0; i2 < size; i2++) {
                        MenuItem item = bhey.f118449o.getItem(i2);
                        if (item.isChecked()) {
                            bhey.f118439e = item.getItemId();
                            bhey.f118440f = i2;
                        }
                    }
                    if (i != bhey.f118439e) {
                        atj.m2053a(bhey, bhey.f118435a);
                    }
                    boolean a = bhey.mo63648a(bhey.f118437c, bhey.f118449o.mo16255g().size());
                    for (int i3 = 0; i3 < size; i3++) {
                        bhey.f118448n.f118460b = true;
                        bhey.f118438d[i3].mo63628a(bhey.f118437c);
                        bhey.f118438d[i3].mo63633a(a);
                        bhey.f118438d[i3].mo1209a((C1446vw) bhey.f118449o.getItem(i3));
                        bhey.f118448n.f118460b = false;
                    }
                    return;
                }
                bhey.mo63645a();
                return;
            }
            return;
        }
        this.f118459a.mo63645a();
    }
}
