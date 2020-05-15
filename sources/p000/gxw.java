package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: gxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gxw extends adcf {

    /* renamed from: a */
    public View f19199a;

    /* renamed from: b */
    public hel f19200b;

    /* renamed from: c */
    public gzz f19201c;

    /* renamed from: d */
    public hix f19202d;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.f19201c = (gzz) adcj.m50161a(activity).mo3444a(gzz.class);
        this.f19200b = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        this.f19199a.getViewTreeObserver().addOnGlobalLayoutListener(new gxv(this));
        this.f19202d = new hix(this, this.f19201c.f19321j, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C1416ut(getActivity(), (int) C0126R.style.AppBottomSheetDialogTheme)).inflate((int) C0126R.C0128layout.credentials_assisted_loading_fragment, viewGroup, false);
        this.f19199a = inflate.findViewById(C0126R.C0129id.loading_container);
        inflate.findViewById(C0126R.C0129id.cancel).setOnClickListener(new gxu(this));
        return inflate;
    }
}
