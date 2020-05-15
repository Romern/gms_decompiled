package p000;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;

/* renamed from: pzt */
final /* synthetic */ class pzt implements View.OnClickListener {

    /* renamed from: a */
    private final pzv f40755a;

    public pzt(pzv pzv) {
        this.f40755a = pzv;
    }

    public void onClick(View view) {
        pzv pzv = this.f40755a;
        Intent intent = new Intent("com.google.android.apps.chromecast.app.DEVICE_SETTINGS");
        String stringExtra = pzv.f40775d.getIntent().getStringExtra("extra_device_ip_address");
        if (!TextUtils.isEmpty(stringExtra)) {
            intent.putExtra("com.google.android.apps.chromecast.app.extra.IP_ADDRESS", stringExtra);
        }
        pzv.f40775d.startActivity(intent);
        pzv.f40758b.mo23138b(true);
    }
}
