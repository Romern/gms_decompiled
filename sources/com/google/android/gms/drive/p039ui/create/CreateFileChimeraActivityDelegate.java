package com.google.android.gms.drive.p039ui.create;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.drive.ui.create.CreateFileChimeraActivityDelegate */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateFileChimeraActivityDelegate extends vlf {

    /* renamed from: d */
    private vlr f31195d;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo18324e() {
        this.f31195d.mo9306a();
    }

    public final void onBackPressed() {
        this.f31195d.mo28620a(2);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String[] stringArray;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("dialogTitle");
        if (stringExtra == null) {
            stringExtra = getString(C0126R.string.drive_create_file_dialog_title);
            intent.putExtra("dialogTitle", stringExtra);
        }
        setTitle(stringExtra);
        vlr vlr = (vlr) getSupportFragmentManager().findFragmentByTag("CreateDocumentActivity");
        this.f31195d = vlr;
        if (vlr == null) {
            Bundle extras = intent.getExtras();
            if (extras == null || TextUtils.isEmpty(extras.getString("accountName")) || (stringArray = extras.getStringArray("clientScopes")) == null || stringArray.length <= 0) {
                setResult(0);
                finish();
                return;
            }
            vlr vlr2 = new vlr();
            this.f31195d = vlr2;
            vlr2.setArguments(extras);
            getSupportFragmentManager().beginTransaction().add(16908290, this.f31195d, "CreateDocumentActivity").commit();
        }
        this.f31195d.f49465i = this.f49436b;
        if (bundle == null) {
            setResult(0);
        }
    }
}
