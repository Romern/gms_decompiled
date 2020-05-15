package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: jxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxn extends Fragment {

    /* renamed from: a */
    private String f23456a;

    /* renamed from: b */
    private String f23457b;

    /* renamed from: a */
    public static jxn m17467a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("appName", str);
        jxn jxn = new jxn();
        jxn.setArguments(bundle);
        return jxn;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f23456a = arguments.getString("appName");
        this.f23457b = arguments.getString("appDeviceName");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.auth_consent_app_user_info, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.app_name);
        Resources resources = getResources();
        String str = this.f23457b;
        if (str == null) {
            textView.setText(resources.getString(C0126R.string.auth_plus_info_fragment_app_name, this.f23456a));
        } else {
            textView.setText(resources.getString(C0126R.string.auth_plus_info_fragment_app_name_with_device, this.f23456a, str));
        }
        return inflate;
    }
}
