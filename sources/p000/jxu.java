package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity;
import java.util.List;

/* renamed from: jxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxu extends eoq {

    /* renamed from: d */
    final /* synthetic */ GrantCredentialsWithAclChimeraActivity f23482d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jxu(GrantCredentialsWithAclChimeraActivity grantCredentialsWithAclChimeraActivity, Context context, List list) {
        super(context, 17367055, null, list);
        this.f23482d = grantCredentialsWithAclChimeraActivity;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        int dimensionPixelSize = this.f23482d.getResources().getDimensionPixelSize(C0126R.dimen.auth_consent_account_chip_padding);
        view2.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        ((TextView) view2.findViewById(C0126R.C0129id.account_name)).setTextColor(this.f23482d.getResources().getColor(17170443));
        ((TextView) view2.findViewById(C0126R.C0129id.account_display_name)).setTextColor(this.f23482d.getResources().getColor(17170443));
        return view2;
    }
}
