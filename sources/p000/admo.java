package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: admo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class admo extends adms {

    /* renamed from: a */
    public static final adfs f62170a = new adfs("SetupFailureFragment");

    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        this.f62171d.mo33664a(C0126R.string.common_try_again, new admm(this));
        Intent intent = (Intent) getArguments().getParcelable("browserIntent");
        boolean a = adfo.m50310a(getActivity(), intent);
        admr admr = this.f62171d;
        if (!a) {
            i = C0126R.string.common_cancel;
        } else {
            i = C0126R.string.open_in_web_button;
        }
        admr.mo33665b(i, new admn(this, a, intent));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.setup_failure_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.description);
        String a = adln.m50800a("https://support.google.com/googleplay/?p=instant_apps", getResources().getString(C0126R.string.common_learn_more));
        textView.setText(Html.fromHtml(getResources().getString(C0126R.string.setup_failure_description, a)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }
}
