package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: aznp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aznp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aznq f99742a;

    public aznp(aznq aznq) {
        this.f99742a = aznq;
    }

    public void onClick(View view) {
        Context context = this.f99742a.f99745c;
        Intent intent = new Intent("android.intent.action.VIEW");
        aznq aznq = this.f99742a;
        context.startActivity(intent.setDataAndType(aznq.f99748i, aznq.f99747h).addFlags(268435456).addFlags(1));
    }
}
