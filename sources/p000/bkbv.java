package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: bkbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkbv extends bkfz {
    public bkbv(Context context, List list) {
        super(context, list);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        TextView textView = (TextView) dropDownView.findViewById(C0126R.C0129id.description);
        bkbx bkbx = (bkbx) getItem(i);
        if (bkbx != null) {
            textView.setText(bkbx.f123971e);
        }
        return dropDownView;
    }
}
