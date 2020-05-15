package p000;

import android.content.Intent;
import android.os.Build;
import android.view.View;

/* renamed from: aaza */
public final /* synthetic */ class aaza implements View.OnClickListener {

    /* renamed from: a */
    private final aazc f56866a;

    public aaza(aazc aazc) {
        this.f56866a = aazc;
    }

    public void onClick(View view) {
        aazc aazc = this.f56866a;
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        int i = Build.VERSION.SDK_INT;
        intent.putExtra("account_types", new String[]{"com.google"});
        aazc.f56869b.startActivity(intent);
        abcx.m47529l(aazc.f56869b);
    }
}
