package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: ttw */
final /* synthetic */ class ttw implements View.OnClickListener {

    /* renamed from: a */
    private final tud f46661a;

    public ttw(tud tud) {
        this.f46661a = tud;
    }

    public void onClick(View view) {
        tud tud = this.f46661a;
        Intent putExtra = new Intent().setPackage("com.google.android.gms").putExtra("extra.screenId", 525).putExtra("extra.accountName", tud.getArguments().getString("pwm.DataFieldNames.accountName"));
        if (cbro.m128210n()) {
            putExtra.setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").putExtra("extra.utmSource", "password-manager").putExtra("extra.utmMedium", "password-checkup");
        } else {
            putExtra.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        }
        tud.startActivityForResult(putExtra, 12345);
    }
}
