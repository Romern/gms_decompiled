package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: phk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f39127a;

    /* renamed from: b */
    final /* synthetic */ phq f39128b;

    public phk(phq phq, boolean z) {
        this.f39128b = phq;
        this.f39127a = z;
    }

    public void onClick(View view) {
        String str;
        this.f39128b.mo23095b();
        FragmentTransaction beginTransaction = this.f39128b.getActivity().getSupportFragmentManager().beginTransaction();
        Fragment phe = !this.f39127a ? new phe() : new phb();
        if (!this.f39127a) {
            str = "MicAuthorizationFragment";
        } else {
            str = "ConnectingFragment";
        }
        beginTransaction.replace(C0126R.C0129id.container, phe, str).commit();
    }
}
