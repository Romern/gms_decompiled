package p000;

import android.content.Intent;
import android.os.Build;
import android.view.View;

/* renamed from: amsm */
final /* synthetic */ class amsm implements View.OnClickListener {

    /* renamed from: a */
    private final amsq f75859a;

    public amsm(amsq amsq) {
        this.f75859a = amsq;
    }

    public void onClick(View view) {
        amsq amsq = this.f75859a;
        int i = Build.VERSION.SDK_INT;
        amsq.mo41309a(3);
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", amsq.getActivity().getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", amxa.m63596a());
        amsq.startActivity(intent);
    }
}
