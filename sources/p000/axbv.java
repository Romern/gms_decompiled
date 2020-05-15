package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.common.p079ui.PopoverView;
import com.google.android.gms.wallet.p088ui.component.lineitem.LineItemBundleView;
import com.google.android.gms.wallet.p088ui.component.lineitem.LineItemContainerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: axbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbv extends bkdx implements axbu {

    /* renamed from: a */
    public boolean f95737a;

    /* renamed from: b */
    LineItemContainerView f95738b;

    /* renamed from: c */
    public boolean f95739c;

    /* renamed from: d */
    private final bjes f95740d = new bjes(3);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(boolean, boolean, boolean):void
     arg types: [boolean, int, int]
     candidates:
      com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(android.view.View, android.view.View, boolean):void
      awgw.a(android.view.View, android.view.View, boolean):void
      com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(boolean, boolean, boolean):void */
    /* renamed from: m */
    private final void m82245m() {
        LineItemBundleView lineItemBundleView;
        PopoverView b;
        LineItemContainerView lineItemContainerView = this.f95738b;
        LineItemBundleView lineItemBundleView2 = null;
        if (lineItemContainerView != null && lineItemContainerView.f110566a != null) {
            int i = 0;
            while (true) {
                if (i >= this.f95738b.f110566a.size()) {
                    break;
                }
                lineItemBundleView = (LineItemBundleView) this.f95738b.f110566a.get(i);
                if (lineItemBundleView.getVisibility() == 0) {
                    break;
                }
                i++;
            }
        }
        lineItemBundleView = null;
        if (lineItemBundleView != null) {
            lineItemBundleView.mo60112a(this.f95739c, false, false);
        }
        if (this.f95737a) {
            int e = awia.m80004e(getActivity());
            int i2 = getActivity().getResources().getConfiguration().orientation;
            if ((e != 0 || (!bjvb.m104683a(getActivity()) && i2 != 2)) && (b = awia.m79995b(getActivity())) != null) {
                if (e != 1) {
                    b.mo59870a((int) C0126R.attr.colorPrimary);
                } else {
                    b.mo59870a((int) C0126R.attr.colorPrimaryDark);
                }
                if (lineItemBundleView != null && lineItemBundleView.mo60113b()) {
                    lineItemBundleView2 = lineItemBundleView;
                }
                b.mo59871a(lineItemBundleView2);
            }
        }
    }

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bmjv) this.f124069w).f129754a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_line_item_container, (ViewGroup) null, false);
        LineItemContainerView lineItemContainerView = (LineItemContainerView) inflate.findViewById(C0126R.C0129id.line_item_container);
        this.f95738b = lineItemContainerView;
        boolean z = !this.f95737a;
        lineItemContainerView.f110567b = z;
        bmjv bmjv = lineItemContainerView.f110568c;
        if (bmjv != null) {
            lineItemContainerView.mo60123a(bmjv, z);
        }
        this.f95738b.mo52802a((bmjv) this.f124069w);
        LineItemContainerView lineItemContainerView2 = this.f95738b;
        lineItemContainerView2.f110569d = this;
        lineItemContainerView2.mo60120a();
        m82245m();
        return inflate;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.emptyList();
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95740d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m82245m();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95737a = getArguments().getBoolean("isTopContainer");
        if (bundle != null) {
            this.f95739c = bundle.getBoolean("bundleExpanded");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("bundleExpanded", this.f95739c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmjv.f129752c.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        boolean z;
        bmmo bmmo;
        ArrayList arrayList;
        int a;
        int a2;
        int a3 = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a3 == 0) {
            a3 = 1;
        }
        if (a3 - 1 != 12) {
            super.mo51910a(bmmv, list);
            return;
        }
        if (bmmv.f130056b == 9) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (bmmv.f130056b == 9) {
            bmmo = (bmmo) bmmv.f130057c;
        } else {
            bmmo = bmmo.f130026d;
        }
        int a4 = bmml.m108176a(bmmo.f130030c);
        if ((a4 != 0 && a4 == 3) || ((a2 = bmml.m108176a(bmmo.f130030c)) != 0 && a2 == 2)) {
            int a5 = bmmn.m108178a(bmmo.f130029b);
            if ((a5 != 0 && a5 == 2) || ((a = bmmn.m108178a(bmmo.f130029b)) != 0 && a == 3)) {
                LineItemContainerView lineItemContainerView = this.f95738b;
                if (lineItemContainerView == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = lineItemContainerView.f110566a;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    LineItemBundleView lineItemBundleView = (LineItemBundleView) arrayList.get(i2);
                    boolean contains = bmmo.f130028a.contains(Long.valueOf(lineItemBundleView.f110548g.f129746b));
                    int a6 = bmml.m108176a(bmmo.f130030c);
                    if (a6 == 0 || a6 != 2) {
                        if (!contains) {
                            int a7 = bmmn.m108178a(bmmo.f130029b);
                            if (a7 != 0 && a7 == 2) {
                                lineItemBundleView.setVisibility(8);
                                i2++;
                            } else {
                                lineItemBundleView.setVisibility(0);
                                i2++;
                            }
                        }
                    } else if (!contains) {
                        i2++;
                    }
                    int a8 = bmmn.m108178a(bmmo.f130029b);
                    if (a8 != 0 && a8 == 2) {
                        lineItemBundleView.setVisibility(0);
                        i2++;
                    } else {
                        lineItemBundleView.setVisibility(8);
                        i2++;
                    }
                }
                m82245m();
                return;
            }
            Object[] objArr = new Object[1];
            int a9 = bmmn.m108178a(bmmo.f130029b);
            if (a9 != 0) {
                i = a9;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format("Unsupported modify type %s", objArr));
        }
        Object[] objArr2 = new Object[1];
        int a10 = bmml.m108176a(bmmo.f130030c);
        if (a10 != 0) {
            i = a10;
        }
        objArr2[0] = Integer.valueOf(i - 1);
        throw new IllegalArgumentException(String.format("Unsupported modify component list type %s", objArr2));
    }
}
