package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: tuj */
final /* synthetic */ class tuj implements View.OnClickListener {

    /* renamed from: a */
    private final tul f46681a;

    public tuj(tul tul) {
        this.f46681a = tul;
    }

    public void onClick(View view) {
        this.f46681a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cdpr.m134630b())));
    }
}
