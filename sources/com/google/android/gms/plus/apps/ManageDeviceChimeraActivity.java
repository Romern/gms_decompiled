package com.google.android.gms.plus.apps;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.fitness.data.BleDevice;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManageDeviceChimeraActivity extends deu implements annc {

    /* renamed from: b */
    public DialogFragment f82255b;

    /* renamed from: c */
    private String f82256c;

    /* renamed from: d */
    private String f82257d;

    /* renamed from: a */
    public final void mo41977a() {
        Intent intent = new Intent();
        intent.putExtra("deviceAddress", this.f82257d);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BleDevice bleDevice = (BleDevice) getIntent().getParcelableExtra("device");
        this.f82256c = bleDevice.f31982b;
        this.f82257d = bleDevice.f31981a;
        annd annd = new annd();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("device", bleDevice);
        annd.setArguments(bundle2);
        this.f82255b = annd;
        setContentView((int) C0126R.C0128layout.plus_manage_device_activity);
        mo8628aW().mo15853b(true);
        Resources resources = getResources();
        TextView textView = (TextView) findViewById(C0126R.C0129id.plus_manage_app_device);
        ((TextView) findViewById(C0126R.C0129id.device_name)).setText(this.f82256c);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(String.format(resources.getString(C0126R.string.fitness_settings_device_description), this.f82256c)));
        findViewById(C0126R.C0129id.disconnect_layout).setOnClickListener(new annp(this));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
