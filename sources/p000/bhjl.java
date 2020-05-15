package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;

/* renamed from: bhjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhjl extends abh {

    /* renamed from: a */
    public final ArrayList f118845a = new ArrayList();

    /* renamed from: d */
    public C1446vw f118846d;

    /* renamed from: e */
    public boolean f118847e;

    /* renamed from: f */
    final /* synthetic */ bhjs f118848f;

    public bhjl(bhjs bhjs) {
        this.f118848f = bhjs;
        mo63881c();
    }

    /* renamed from: e */
    private final void m101013e(int i, int i2) {
        while (i < i2) {
            ((bhjp) this.f118845a.get(i)).f118852b = true;
            i++;
        }
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f118845a.size();
    }

    /* renamed from: c */
    public final void mo63881c() {
        if (!this.f118847e) {
            this.f118847e = true;
            this.f118845a.clear();
            this.f118845a.add(new bhjm());
            int size = this.f118848f.f118856c.mo16255g().size();
            int i = -1;
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1446vw vwVar = (C1446vw) this.f118848f.f118856c.mo16255g().get(i3);
                if (vwVar.isChecked()) {
                    mo63880a(vwVar);
                }
                if (vwVar.isCheckable()) {
                    vwVar.mo16281a(false);
                }
                if (vwVar.hasSubMenu()) {
                    C1466wp wpVar = vwVar.f27463j;
                    if (wpVar.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f118845a.add(new bhjo(this.f118848f.f118872s, 0));
                        }
                        this.f118845a.add(new bhjp(vwVar));
                        int size2 = this.f118845a.size();
                        int size3 = wpVar.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            C1446vw vwVar2 = (C1446vw) wpVar.getItem(i4);
                            if (vwVar2.isVisible()) {
                                if (!z2 && vwVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (vwVar2.isCheckable()) {
                                    vwVar2.mo16281a(false);
                                }
                                if (vwVar.isChecked()) {
                                    mo63880a(vwVar);
                                }
                                this.f118845a.add(new bhjp(vwVar2));
                            }
                        }
                        if (z2) {
                            m101013e(size2, this.f118845a.size());
                        }
                    }
                } else {
                    int i5 = vwVar.f27455b;
                    if (i5 != i) {
                        i2 = this.f118845a.size();
                        if (vwVar.getIcon() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 != 0) {
                            i2++;
                            ArrayList arrayList = this.f118845a;
                            int i6 = this.f118848f.f118872s;
                            arrayList.add(new bhjo(i6, i6));
                        }
                    } else if (!z && vwVar.getIcon() != null) {
                        m101013e(i2, this.f118845a.size());
                        z = true;
                    }
                    bhjp bhjp = new bhjp(vwVar);
                    bhjp.f118852b = z;
                    this.f118845a.add(bhjp);
                    i = i5;
                }
            }
            this.f118847e = false;
        }
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        bhjn bhjn = (bhjn) this.f118845a.get(i);
        if (bhjn instanceof bhjo) {
            return 2;
        }
        if (bhjn instanceof bhjm) {
            return 3;
        }
        if (bhjn instanceof bhjp) {
            return ((bhjp) bhjn).f118851a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            bhjs bhjs = this.f118848f;
            return new bhjr(bhjs.f118859f, viewGroup, bhjs.f118874u);
        } else if (i == 1) {
            return new acm(this.f118848f.f118859f.inflate((int) C0126R.C0128layout.design_navigation_item_subheader, viewGroup, false));
        } else {
            if (i == 2) {
                return new acm(this.f118848f.f118859f.inflate((int) C0126R.C0128layout.design_navigation_item_separator, viewGroup, false));
            }
            if (i != 3) {
                return null;
            }
            return new acm(this.f118848f.f118855b);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo167a(acm acm) {
        if (acm instanceof bhjr) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) acm.f201a;
            FrameLayout frameLayout = navigationMenuItemView.f151209j;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f151208i.setCompoundDrawables(null, null, null, null);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        Drawable drawable;
        int a = mo162a(i);
        boolean z = true;
        if (a == 0) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) acm.f201a;
            navigationMenuItemView.f151211l = this.f118848f.f118863j;
            if (navigationMenuItemView.f151211l == null) {
                z = false;
            }
            navigationMenuItemView.f151212m = z;
            C1446vw vwVar = navigationMenuItemView.f151210k;
            if (vwVar != null) {
                navigationMenuItemView.mo71202a(vwVar.getIcon());
            }
            bhjs bhjs = this.f118848f;
            if (bhjs.f118861h) {
                C1334rs.m20104a(navigationMenuItemView.f151208i, bhjs.f118860g);
            }
            ColorStateList colorStateList = this.f118848f.f118862i;
            if (colorStateList != null) {
                navigationMenuItemView.f151208i.setTextColor(colorStateList);
            }
            Drawable drawable2 = this.f118848f.f118864k;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            C1280ps.m19890a(navigationMenuItemView, drawable);
            bhjp bhjp = (bhjp) this.f118845a.get(i);
            navigationMenuItemView.f151206d = bhjp.f118852b;
            int i2 = this.f118848f.f118865l;
            navigationMenuItemView.setPadding(i2, 0, i2, 0);
            navigationMenuItemView.f151208i.setCompoundDrawablePadding(this.f118848f.f118866m);
            bhjs bhjs2 = this.f118848f;
            if (bhjs2.f118868o) {
                navigationMenuItemView.f151205c = bhjs2.f118867n;
            }
            navigationMenuItemView.f151208i.setMaxLines(bhjs2.f118870q);
            navigationMenuItemView.mo1209a(bhjp.f118851a);
        } else if (a == 1) {
            ((TextView) acm.f201a).setText(((bhjp) this.f118845a.get(i)).f118851a.f27457d);
        } else if (a == 2) {
            bhjo bhjo = (bhjo) this.f118845a.get(i);
            acm.f201a.setPadding(0, bhjo.f118849a, 0, bhjo.f118850b);
        }
    }

    /* renamed from: a */
    public final void mo63880a(C1446vw vwVar) {
        if (this.f118846d != vwVar && vwVar.isCheckable()) {
            C1446vw vwVar2 = this.f118846d;
            if (vwVar2 != null) {
                vwVar2.setChecked(false);
            }
            this.f118846d = vwVar;
            vwVar.setChecked(true);
        }
    }
}
