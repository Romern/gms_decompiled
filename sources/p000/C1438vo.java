package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: vo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1438vo extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ C1439vp f27406a;

    /* renamed from: b */
    private int f27407b = -1;

    public C1438vo(C1439vp vpVar) {
        this.f27406a = vpVar;
        mo16202a();
    }

    /* renamed from: a */
    public final C1446vw getItem(int i) {
        ArrayList i2 = this.f27406a.f27410c.mo16259i();
        int i3 = this.f27406a.f27412e;
        int i4 = this.f27407b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (C1446vw) i2.get(i);
    }

    public final int getCount() {
        int size = this.f27406a.f27410c.mo16259i().size();
        int i = this.f27406a.f27412e;
        return this.f27407b >= 0 ? size - 1 : size;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C1439vp vpVar = this.f27406a;
            LayoutInflater layoutInflater = vpVar.f27409b;
            int i2 = vpVar.f27413f;
            view = layoutInflater.inflate((int) C0126R.C0128layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((C1459wi) view).mo1209a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        mo16202a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16202a() {
        C1443vt vtVar = this.f27406a.f27410c;
        C1446vw vwVar = vtVar.f27430h;
        if (vwVar != null) {
            ArrayList i = vtVar.mo16259i();
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                if (((C1446vw) i.get(i2)) != vwVar) {
                    i2++;
                } else {
                    this.f27407b = i2;
                    return;
                }
            }
        }
        this.f27407b = -1;
    }
}
