package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: aexy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aexy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f63994a;

    /* renamed from: b */
    final /* synthetic */ Uri f63995b;

    public aexy(Context context, Uri uri) {
        this.f63994a = context;
        this.f63995b = uri;
    }

    public void onClick(View view) {
        sre.m36087g(this.f63994a);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(this.f63995b);
        this.f63994a.startActivity(intent);
    }
}
