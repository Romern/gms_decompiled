package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.cast.activity.CastNearbyPinChimeraActivity;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: phv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phv extends Fragment {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CastNearbyPinChimeraActivity castNearbyPinChimeraActivity = (CastNearbyPinChimeraActivity) getActivity();
        ArrayList arrayList = new ArrayList(((phj) castNearbyPinChimeraActivity.f29865b).mo23082e());
        Collections.sort(arrayList);
        qay.m31785b(castNearbyPinChimeraActivity).edit().remove("castnearby.optIn").apply();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.cast_nearby_fragment_recover_permissions, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.permissions_list);
        Resources resources = getResources();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            View inflate2 = layoutInflater.inflate((int) C0126R.C0128layout.common_permissions_list, (ViewGroup) null);
            ((TextView) inflate2.findViewById(C0126R.C0129id.permission_name)).setText(resources.getString(sft.m35177a(str).intValue()));
            if ("android.permission-group.MICROPHONE".equals(str)) {
                TextView textView = (TextView) inflate2.findViewById(C0126R.C0129id.permission_explanation);
                textView.setText(resources.getString(C0126R.string.f7398xc22ea24d));
                textView.setVisibility(0);
            }
            linearLayout.addView(inflate2);
        }
        ((Button) inflate.findViewById(C0126R.C0129id.device_settings_button)).setOnClickListener(new pht(castNearbyPinChimeraActivity));
        ((Button) inflate.findViewById(C0126R.C0129id.skip_button)).setOnClickListener(new phu(this));
        return inflate;
    }
}
