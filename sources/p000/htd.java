package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.AccountChipView;
import java.util.List;

/* renamed from: htd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class htd extends ArrayAdapter {
    public htd(Context context, List list) {
        super(context, (int) C0126R.C0128layout.account_chip_view, (int) C0126R.C0129id.credential_primary_label, list);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new AccountChipView(getContext());
        }
        AccountChipView accountChipView = (AccountChipView) view;
        Credential credential = (Credential) getItem(i);
        sdo.m34959a(credential);
        accountChipView.mo7426a(hsm.m14822a(credential));
        return accountChipView;
    }
}
