package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.auth.account.otp.OtpChimeraActivity;

/* renamed from: grp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grp implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ OtpChimeraActivity f18900a;

    public grp(OtpChimeraActivity otpChimeraActivity) {
        this.f18900a = otpChimeraActivity;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String a = this.f18900a.f10017b.mo26114a();
        if (!TextUtils.equals(this.f18900a.f10019d, a)) {
            OtpChimeraActivity otpChimeraActivity = this.f18900a;
            otpChimeraActivity.f10019d = a;
            otpChimeraActivity.f10018c.mo12145a(otpChimeraActivity.f10017b.mo26114a(), this.f18900a.f10020e);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
