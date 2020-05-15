package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: adts */
final /* synthetic */ class adts implements View.OnClickListener {

    /* renamed from: a */
    private final adtu f62724a;

    public adts(adtu adtu) {
        this.f62724a = adtu;
    }

    public void onClick(View view) {
        adtu adtu = this.f62724a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.kids.familylink"));
        adtu.f62726a.mo33821a(603);
        adtu.getActivity().startActivity(intent);
    }
}
