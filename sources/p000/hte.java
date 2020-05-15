package p000;

import android.content.Context;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.AccountChipView;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

/* renamed from: hte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hte {
    /* renamed from: a */
    public static void m14835a(Context context, SnackbarLayout snackbarLayout, Credential credential) {
        AccountChipView accountChipView = (AccountChipView) snackbarLayout.findViewById(C0126R.C0129id.account_chip_view);
        if (accountChipView != null) {
            accountChipView.mo7426a(hsm.m14822a(credential));
        }
        TextView textView = (TextView) snackbarLayout.findViewById(C0126R.C0129id.credentials_auto_signin_tv_title);
        if (textView != null) {
            textView.setText(String.format(context.getResources().getString(C0126R.string.credentials_auto_signin_tv_title), credential.f10092a).trim());
            return;
        }
        accountChipView.mo7427a(context.getResources().getString(C0126R.string.credentials_product_name));
    }
}
