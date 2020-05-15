package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: owu */
final /* synthetic */ class owu implements View.OnClickListener {

    /* renamed from: a */
    private final oww f38530a;

    public owu(oww oww) {
        this.f38530a = oww;
    }

    public void onClick(View view) {
        oww oww = this.f38530a;
        owx owx = oww.f38541i;
        String str = oww.f38533a;
        bnsn bnsn = owx.f38544a;
        owx.startActivity(new Intent("android.intent.action.VIEW").setData(new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).build()));
    }
}
