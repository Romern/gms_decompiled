package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: ewd */
final /* synthetic */ class ewd implements View.OnClickListener {

    /* renamed from: a */
    private final Uri f15918a;

    public ewd(Uri uri) {
        this.f15918a = uri;
    }

    public void onClick(View view) {
        Uri uri = this.f15918a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        view.getContext().startActivity(intent);
    }
}
