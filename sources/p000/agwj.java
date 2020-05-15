package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: agwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f66718a;

    /* renamed from: b */
    final /* synthetic */ agwk f66719b;

    public agwj(agwk agwk, String str) {
        this.f66719b = agwk;
        this.f66718a = str;
    }

    public void onClick(View view) {
        agrl.m54942a().mo35987a(10, this.f66718a, agvn.m55186b(view), bygd.SYSTEM_NOTIFICATION_CONTROL, System.currentTimeMillis(), agvh.m55172b());
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.CHANNEL_ID", this.f66718a);
        intent.putExtra("android.provider.extra.APP_PACKAGE", rpr.m34216b().getPackageName());
        this.f66719b.f201a.getContext().startActivity(intent);
    }
}
