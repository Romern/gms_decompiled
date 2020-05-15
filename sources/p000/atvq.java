package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: atvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atvq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f91017a;

    /* renamed from: b */
    final /* synthetic */ atvu f91018b;

    public atvq(atvu atvu, String str) {
        this.f91018b = atvu;
        this.f91017a = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f91017a));
        this.f91018b.f91026b.startActivity(intent);
    }
}
