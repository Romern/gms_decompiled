package com.google.android.gms.chromesync.phone.p035ui;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.chromesync.phone.ui.CustomPassphrasePhoneChimeraDialog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CustomPassphrasePhoneChimeraDialog extends qwg {

    /* renamed from: a */
    public EditText f30015a;

    /* renamed from: b */
    public TextView f30016b;

    /* renamed from: c */
    public View f30017c;

    /* renamed from: d */
    public View f30018d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CustomPassphrasePhoneChimeraDialog mo17651a() {
        setContentView((int) C0126R.C0128layout.chromesync_custom_passphrase_dialog);
        this.f30015a = (EditText) findViewById(C0126R.C0129id.chromesync_enter_passphrase);
        this.f30016b = (TextView) findViewById(C0126R.C0129id.chromesync_custom_passphrase_description);
        this.f30017c = findViewById(C0126R.C0129id.chromesync_custom_passphrase_continue);
        this.f30018d = findViewById(C0126R.C0129id.chromesync_custom_passphrase_cancel);
        return this;
    }

    /* renamed from: a */
    public final void mo17652a(boolean z) {
        findViewById(C0126R.C0129id.chromesync_custom_passphrase_error).setVisibility(!z ? 8 : 0);
    }
}
