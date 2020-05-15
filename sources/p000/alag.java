package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: alag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alag extends Fragment {

    /* renamed from: a */
    public TextView f73222a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.octarine_webview_message, viewGroup, false);
        C1280ps.m19919f(inflate, 1);
        C1280ps.m19906b(inflate, 1);
        C1173lt.m19599a(((ImageView) inflate.findViewById(C0126R.C0129id.octarine_message_error_icon)).getDrawable(), adyg.m51405b(getActivity(), C0126R.attr.octHairline, C0126R.color.google_grey300));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Bundle arguments = getArguments();
        this.f73222a = (TextView) view.findViewById(C0126R.C0129id.octarine_message_text);
        CharSequence charSequence = arguments.getCharSequence("message.text");
        if (TextUtils.isEmpty(charSequence)) {
            this.f73222a.setText((int) C0126R.string.common_something_went_wrong);
        } else {
            this.f73222a.setText(charSequence);
        }
        this.f73222a.setVisibility(0);
    }
}
