package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: pzu */
final /* synthetic */ class pzu implements View.OnClickListener {

    /* renamed from: a */
    private final pzv f40756a;

    public pzu(pzv pzv) {
        this.f40756a = pzv;
    }

    public void onClick(View view) {
        pzv pzv = this.f40756a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.google.android.apps.chromecast.app"));
        pzv.f40775d.startActivity(intent);
        pzv.f40758b.mo23138b(false);
    }
}
