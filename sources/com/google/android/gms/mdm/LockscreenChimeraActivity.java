package com.google.android.gms.mdm;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockscreenChimeraActivity extends afys {

    /* renamed from: f */
    Button f80046f;

    public void onClick(View view) {
        Intent intent;
        if (view == this.f64980b) {
            intent = new Intent("android.intent.action.CALL");
            intent.setData(Uri.parse(String.format("tel:%1$s", this.f64981c)));
            intent.setFlags(8388608);
        } else if (view == this.f80046f) {
            intent = new Intent("com.android.phone.EmergencyDialer.DIAL");
            intent.setFlags(8388608);
        } else {
            intent = null;
        }
        String a = afzw.m53777a(getPackageManager(), intent);
        if (a != null) {
            intent.setPackage(a);
        }
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("lock_message");
        if (TextUtils.isEmpty(stringExtra)) {
            agac.m53790a("LockscreenActivity started without a lock message, closing.", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        getWindow().addFlags(2621440);
        setContentView((int) C0126R.C0128layout.mdm_lockscreen_activity);
        ((TextView) findViewById(C0126R.C0129id.lock_message)).setText(stringExtra);
        this.f64980b = (ImageButton) findViewById(C0126R.C0129id.phone_number_call);
        TextView textView = (TextView) findViewById(C0126R.C0129id.phone_number_call_label);
        if (getIntent().hasExtra("phone_number")) {
            this.f64981c = getIntent().getStringExtra("phone_number");
            ImageButton imageButton = this.f64980b;
            Drawable a = C1497xt.m20824b().mo16510a(this, (int) C0126R.C0127drawable.mdm_ic_call);
            int i = Build.VERSION.SDK_INT;
            imageButton.setImageDrawable(a);
            this.f64980b.setOnClickListener(this);
        } else {
            this.f64980b.setVisibility(8);
            textView.setVisibility(8);
        }
        Button button = (Button) findViewById(C0126R.C0129id.emergency_call);
        this.f80046f = button;
        button.setOnClickListener(this);
        if (!spn.m35874c((Context) this)) {
            this.f80046f.setVisibility(8);
        } else {
            setRequestedOrientation(1);
        }
        this.f64982d = aki.m919a(this);
        this.f64982d.mo873a(this.f64983e, afys.f64979a);
    }

    public final void onDestroy() {
        this.f64982d.mo872a(this.f64983e);
        super.onDestroy();
    }
}
