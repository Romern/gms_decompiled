package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: bkbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkbs {
    /* renamed from: a */
    public static bkbn m105282a(bmdb bmdb, int i, Context context, bjwk bjwk, LogContext logContext, LayoutInflater layoutInflater, ViewGroup viewGroup, int i2, int i3, int i4, boolean z, boolean z2) {
        return m105283a(bmdb, i, context, bjwk, logContext, layoutInflater, viewGroup, i2, i3, i4, z, false, z2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* renamed from: a */
    public static bkbn m105283a(bmdb bmdb, int i, Context context, bjwk bjwk, LogContext logContext, LayoutInflater layoutInflater, ViewGroup viewGroup, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Button a;
        int i5 = C0126R.C0128layout.view_standard_material_button;
        if (z) {
            int i6 = i - 1;
            if (i6 != 0) {
                if (i6 != 7) {
                    if (i6 != 12) {
                        i5 = i6 != 14 ? !z3 ? C0126R.C0128layout.view_submit_material_button : C0126R.C0128layout.view_flat_submit_material_button : C0126R.C0128layout.view_full_width_material_button;
                    }
                }
            }
            bkbn bkbn = (bkbn) layoutInflater.inflate(i5, viewGroup, false);
            bkbn.setId(i4);
            bkbn.mo52707a(bmdb);
            bkbn.mo65787a(logContext);
            bkbn.mo52710b().setVisibility(0);
            viewGroup.addView(bkbn.mo52710b());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bkbn.mo52710b().getLayoutParams();
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.bottomMargin = i2;
            bjwl.m104784a(bkbn.mo52710b(), bkbn.mo65788c().f128770b, bjwk);
            a = bkbn.mo52703a();
            if (a != null) {
                int i7 = i - 1;
                if (i7 == 0 || i7 == 7 || i7 == 12) {
                    a.setTextColor(bkfr.m105600c(context));
                } else if (i7 == 14) {
                    bkfr.m105560a(context, a);
                } else if (!z3) {
                    bkfr.m105560a(context, a);
                } else if (z) {
                    a.setTextColor(bkfr.m105605d(context));
                    bkfr.m105560a(context, a);
                } else {
                    a.setTextColor(bkfr.m105600c(context));
                }
            }
            return bkbn;
        } else if (!z2) {
            int i8 = i - 1;
            if (i8 != 0) {
                if (i8 != 7) {
                    if (i8 != 12) {
                        i5 = i8 != 14 ? !z3 ? C0126R.C0128layout.view_submit_button : C0126R.C0128layout.view_flat_submit_button : C0126R.C0128layout.view_full_width_button;
                        bkbn bkbn2 = (bkbn) layoutInflater.inflate(i5, viewGroup, false);
                        bkbn2.setId(i4);
                        bkbn2.mo52707a(bmdb);
                        bkbn2.mo65787a(logContext);
                        bkbn2.mo52710b().setVisibility(0);
                        viewGroup.addView(bkbn2.mo52710b());
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) bkbn2.mo52710b().getLayoutParams();
                        marginLayoutParams2.topMargin = i3;
                        marginLayoutParams2.bottomMargin = i2;
                        bjwl.m104784a(bkbn2.mo52710b(), bkbn2.mo65788c().f128770b, bjwk);
                        a = bkbn2.mo52703a();
                        if (a != null) {
                        }
                        return bkbn2;
                    }
                }
            }
            i5 = C0126R.C0128layout.view_standard_button;
            bkbn bkbn22 = (bkbn) layoutInflater.inflate(i5, viewGroup, false);
            bkbn22.setId(i4);
            bkbn22.mo52707a(bmdb);
            bkbn22.mo65787a(logContext);
            bkbn22.mo52710b().setVisibility(0);
            viewGroup.addView(bkbn22.mo52710b());
            ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) bkbn22.mo52710b().getLayoutParams();
            marginLayoutParams22.topMargin = i3;
            marginLayoutParams22.bottomMargin = i2;
            bjwl.m104784a(bkbn22.mo52710b(), bkbn22.mo65788c().f128770b, bjwk);
            a = bkbn22.mo52703a();
            if (a != null) {
            }
            return bkbn22;
        } else {
            int i9 = i - 1;
            if (i9 != 0) {
                if (i9 != 7) {
                    i5 = C0126R.C0128layout.view_full_width_visdre_button;
                }
            }
            bkbn bkbn222 = (bkbn) layoutInflater.inflate(i5, viewGroup, false);
            bkbn222.setId(i4);
            bkbn222.mo52707a(bmdb);
            bkbn222.mo65787a(logContext);
            bkbn222.mo52710b().setVisibility(0);
            viewGroup.addView(bkbn222.mo52710b());
            ViewGroup.MarginLayoutParams marginLayoutParams222 = (ViewGroup.MarginLayoutParams) bkbn222.mo52710b().getLayoutParams();
            marginLayoutParams222.topMargin = i3;
            marginLayoutParams222.bottomMargin = i2;
            bjwl.m104784a(bkbn222.mo52710b(), bkbn222.mo65788c().f128770b, bjwk);
            a = bkbn222.mo52703a();
            if (a != null) {
            }
            return bkbn222;
        }
        i5 = C0126R.C0128layout.view_link_button;
        bkbn bkbn2222 = (bkbn) layoutInflater.inflate(i5, viewGroup, false);
        bkbn2222.setId(i4);
        bkbn2222.mo52707a(bmdb);
        bkbn2222.mo65787a(logContext);
        bkbn2222.mo52710b().setVisibility(0);
        viewGroup.addView(bkbn2222.mo52710b());
        ViewGroup.MarginLayoutParams marginLayoutParams2222 = (ViewGroup.MarginLayoutParams) bkbn2222.mo52710b().getLayoutParams();
        marginLayoutParams2222.topMargin = i3;
        marginLayoutParams2222.bottomMargin = i2;
        bjwl.m104784a(bkbn2222.mo52710b(), bkbn2222.mo65788c().f128770b, bjwk);
        a = bkbn2222.mo52703a();
        if (a != null) {
        }
        return bkbn2222;
    }

    /* renamed from: a */
    public static bkbn m105284a(bmdb bmdb, Context context, bjwk bjwk, LogContext logContext, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int a = bmda.m107911a(bmdb.f128777i);
        if (a == 0) {
            a = 1;
        }
        return m105283a(bmdb, a, context, bjwk, logContext, layoutInflater, viewGroup, 0, 0, 0, false, false, false);
    }
}
