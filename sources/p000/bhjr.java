package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhjr extends acm {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public bhjr(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        super(layoutInflater.inflate((int) C0126R.C0128layout.design_navigation_item, viewGroup, false));
        this.f201a.setOnClickListener(onClickListener);
    }
}
