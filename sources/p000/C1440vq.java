package p000;

import android.support.p002v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: vq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1440vq extends BaseAdapter {

    /* renamed from: a */
    public final C1443vt f27416a;

    /* renamed from: b */
    public boolean f27417b;

    /* renamed from: c */
    private int f27418c = -1;

    /* renamed from: d */
    private final boolean f27419d;

    /* renamed from: e */
    private final LayoutInflater f27420e;

    /* renamed from: f */
    private final int f27421f;

    public C1440vq(C1443vt vtVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f27419d = z;
        this.f27420e = layoutInflater;
        this.f27416a = vtVar;
        this.f27421f = i;
        mo16211a();
    }

    /* renamed from: a */
    public final C1446vw getItem(int i) {
        ArrayList g = !this.f27419d ? this.f27416a.mo16255g() : this.f27416a.mo16259i();
        int i2 = this.f27418c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1446vw) g.get(i);
    }

    public final int getCount() {
        ArrayList g = !this.f27419d ? this.f27416a.mo16255g() : this.f27416a.mo16259i();
        if (this.f27418c >= 0) {
            return g.size() - 1;
        }
        return g.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        int i3 = 0;
        if (view == null) {
            view = this.f27420e.inflate(this.f27421f, viewGroup, false);
        }
        int i4 = getItem(i).f27455b;
        int i5 = i - 1;
        if (i5 >= 0) {
            i2 = getItem(i5).f27455b;
        } else {
            i2 = i4;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f27416a.mo16243b()) {
            z = false;
        } else {
            z = i4 != i2;
        }
        ImageView imageView = listMenuItemView.f1098b;
        if (imageView != null) {
            if (listMenuItemView.f1100d) {
                i3 = 8;
            } else if (!z) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
        C1459wi wiVar = (C1459wi) view;
        if (this.f27417b) {
            listMenuItemView.f1101e = true;
            listMenuItemView.f1099c = true;
        }
        wiVar.mo1209a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        mo16211a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16211a() {
        C1443vt vtVar = this.f27416a;
        C1446vw vwVar = vtVar.f27430h;
        if (vwVar != null) {
            ArrayList i = vtVar.mo16259i();
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                if (((C1446vw) i.get(i2)) != vwVar) {
                    i2++;
                } else {
                    this.f27418c = i2;
                    return;
                }
            }
        }
        this.f27418c = -1;
    }
}
