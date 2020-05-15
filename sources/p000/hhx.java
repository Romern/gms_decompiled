package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: hhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hhx extends adcf {

    /* renamed from: a */
    public View f19815a;

    /* renamed from: b */
    public hel f19816b;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19816b = (hel) adcj.m50161a(getActivity()).mo3444a(hel.class);
        this.f19815a.getViewTreeObserver().addOnGlobalLayoutListener(new hhw(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C1416ut(getActivity(), (int) C0126R.style.AppBottomSheetDialogTheme)).inflate((int) C0126R.C0128layout.credentials_gis_password_saving_loading, viewGroup, false);
        this.f19815a = inflate.findViewById(C0126R.C0129id.loading_container);
        ((TextView) inflate.findViewById(C0126R.C0129id.title_text)).setText((int) C0126R.string.credentials_gis_pw_saving_save_password);
        return inflate;
    }
}
