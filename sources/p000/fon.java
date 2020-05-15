package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: fon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fon extends Fragment {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.common_activity_display_network_usage_entry, viewGroup, false);
        ((TextView) inflate.findViewById(C0126R.C0129id.network_usage_entry_header)).setText("Component|Tag|Interface|Type|Total|Total Bg|Total Fg|Bg Rx|Fg Rx|Bg Tx|Fg Tx");
        Bundle arguments = getArguments();
        bmxy.m108581a(arguments);
        ((TextView) inflate.findViewById(C0126R.C0129id.network_usage_entry_text)).setText(arguments.getString("SUMMARY_KEY", ""));
        return inflate;
    }
}
