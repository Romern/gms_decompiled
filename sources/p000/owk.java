package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.carsetup.fsm.impl.FsmController$StackEntry;
import java.util.ArrayList;

/* renamed from: owk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class owk extends oxu {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Context a = owl.m29903a(getActivity());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(a);
        View inflate = cloneInContext.inflate((int) C0126R.C0128layout.car_frx_error, viewGroup, false);
        owl.m29905a(cloneInContext, (ViewGroup) inflate);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.title);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.body);
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageDrawable(a.getDrawable(C0126R.C0127drawable.car_error_illustration));
        Button button = (Button) inflate.findViewById(C0126R.C0129id.right_button);
        oxr b = mo22763b();
        int i = this.f38585c;
        ArrayList arrayList = b.f38576e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            FsmController$StackEntry fsmController$StackEntry = (FsmController$StackEntry) arrayList.get(i2);
            i2++;
            if (fsmController$StackEntry.f29668d == i) {
                Bundle bundle2 = (Bundle) fsmController$StackEntry.f29666b;
                String str2 = null;
                if (bundle2 != null) {
                    str2 = bundle2.getString("errorTitle");
                    str = bundle2.getString("errorMessage");
                } else {
                    str = null;
                }
                if (str2 == null) {
                    str2 = getString(C0126R.string.common_something_went_wrong);
                }
                if (str == null) {
                    str = getString(C0126R.string.car_frx_generic_error_message, oyi.m29996a(getActivity(), ((oxk) mo22763b().f38582k).mo22677g()));
                }
                textView.setText(str2);
                textView2.setText(str);
                button.setVisibility(0);
                button.setText(getString(C0126R.string.car_setup_exit));
                button.setOnClickListener(new owj(this));
                return inflate;
            }
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("No state for stateId ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }
}
