package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wpp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ wpu f51107a;

    public wpp(wpu wpu) {
        this.f51107a = wpu;
    }

    public void onClick(View view) {
        ((TextInputLayout) this.f51107a.f51116c.findViewById(C0126R.C0129id.fm_credential_type)).mo71272c((CharSequence) null);
        this.f51107a.dismiss();
    }
}
