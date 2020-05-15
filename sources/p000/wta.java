package p000;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: wta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wta extends ArrayAdapter {
    public wta(Context context, List list) {
        super(context, (int) C0126R.C0128layout.fast_pair_account_settings_list_item, list);
        setDropDownViewResource(C0126R.C0128layout.fast_pair_account_settings_list_item_dropdown);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setText(((Account) getItem(i)).name);
        return textView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        textView.setTextColor(-1);
        textView.setText(((Account) getItem(i)).name);
        return textView;
    }
}
