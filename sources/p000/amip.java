package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: amip */
final /* synthetic */ class amip implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final amis f74943a;

    public amip(amis amis) {
        this.f74943a = amis;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        amis amis = this.f74943a;
        amis.dismiss();
        amis.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cgbe.f186279a.mo6606a().mo83331bH())));
        amis.getActivity().setResult(-1);
        amis.getActivity().finish();
    }
}
