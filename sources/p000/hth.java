package p000;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.AccountChipView;
import java.util.List;

/* renamed from: hth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hth extends ArrayAdapter {
    public hth(Context context, List list) {
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
        Account account = (Account) getItem(i);
        sdo.m34959a(account);
        hsl hsl = new hsl();
        hsl.mo12694a(2);
        hsl.f20367d = account.name;
        accountChipView.mo7426a(hsl.mo12693a());
        return accountChipView;
    }
}
