package com.google.android.gms.app.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wearable.p090ui.WearableManageSpaceActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManageSpaceChimeraActivity extends deu implements View.OnClickListener {

    /* renamed from: b */
    public TextView f9503b;

    /* renamed from: c */
    public TextView f9504c;

    /* renamed from: d */
    public TextView f9505d;

    /* renamed from: e */
    private Button f9506e;

    /* renamed from: f */
    private Button f9507f;

    /* renamed from: g */
    private CharSequence f9508g;

    /* renamed from: h */
    private Button f9509h;

    public void onClick(View view) {
        if (view == this.f9506e) {
            startActivity(new Intent().setClassName(this, "com.google.android.gms.icing.ui.IcingManageSpaceActivity"));
        } else if (view == this.f9507f) {
            new fqe().show(getSupportFragmentManager(), "clearDataDialog");
        } else if (view == this.f9509h) {
            startActivity(new Intent(this, WearableManageSpaceActivity.class));
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.manage_space_activity);
        this.f9508g = getText(C0126R.string.storage_managment_computing_size);
        this.f9503b = (TextView) findViewById(C0126R.C0129id.icing_storage_size_text);
        Button button = (Button) findViewById(C0126R.C0129id.manage_icing_storage);
        this.f9506e = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(C0126R.C0129id.manage_wear_storage);
        this.f9509h = button2;
        button2.setOnClickListener(this);
        this.f9504c = (TextView) findViewById(C0126R.C0129id.wear_storage_size_text);
        findViewById(C0126R.C0129id.clear_all_data_section);
        int i = Build.VERSION.SDK_INT;
        this.f9505d = (TextView) findViewById(C0126R.C0129id.total_storage_size_text);
        Button button3 = (Button) findViewById(C0126R.C0129id.clear_all_data);
        this.f9507f = button3;
        button3.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f9503b.setText(this.f9508g);
        TextView textView = this.f9505d;
        if (textView != null) {
            textView.setText(this.f9508g);
        }
        aucb a = aplx.m70650b(this).mo47443a();
        a.mo50373a(new fqc(this));
        a.mo50372a(fqa.f17121a);
        aucb F = axoz.m82853a(this).mo24674F();
        F.mo50373a(new fqd(this));
        F.mo50372a(fqb.f17122a);
    }
}
