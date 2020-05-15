package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: atvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atvr implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Uri f91019a;

    /* renamed from: b */
    final /* synthetic */ String f91020b;

    /* renamed from: c */
    final /* synthetic */ atvu f91021c;

    public atvr(atvu atvu, Uri uri, String str) {
        this.f91021c = atvu;
        this.f91019a = uri;
        this.f91020b = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.DIAL", this.f91019a);
        if (ssk.m36237a(this.f91021c.f91026b.getApplicationContext(), this.f91020b)) {
            this.f91021c.f91026b.startActivity(intent);
        }
    }
}
