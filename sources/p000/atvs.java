package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: atvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atvs implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Uri f91022a;

    /* renamed from: b */
    final /* synthetic */ atvu f91023b;

    public atvs(atvu atvu, Uri uri) {
        this.f91023b = atvu;
        this.f91022a = uri;
    }

    public void onClick(View view) {
        this.f91023b.f91026b.startActivity(new Intent("android.intent.action.VIEW", this.f91022a));
    }
}
