package p000;

import android.content.Intent;
import android.view.View;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: aazw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aazw implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Intent f56908a;

    /* renamed from: b */
    final /* synthetic */ aazy f56909b;

    public aazw(aazy aazy, Intent intent) {
        this.f56909b = aazy;
        this.f56908a = intent;
    }

    public void onClick(View view) {
        this.f56909b.mo31961a(MfiClientException.TYPE_MFICLIENT_NOT_FOUND);
        this.f56909b.getActivity().startActivityForResult(this.f56908a, 0);
    }
}
