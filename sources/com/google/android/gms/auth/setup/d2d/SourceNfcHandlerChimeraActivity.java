package com.google.android.gms.auth.setup.d2d;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceNfcHandlerChimeraActivity extends Activity {
    /* renamed from: a */
    private final void m6898a() {
        Toast.makeText(this, (int) C0126R.string.common_something_went_wrong, 0).show();
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if (parcelableArrayExtra == null || parcelableArrayExtra.length == 0) {
            m6898a();
            return;
        }
        NdefMessage ndefMessage = (NdefMessage) parcelableArrayExtra[0];
        if (ndefMessage == null) {
            m6898a();
            return;
        }
        NdefRecord[] records = ndefMessage.getRecords();
        if (records != null && records.length > 0) {
            startActivity(SourceChimeraActivity.m6887a(this, records[0].getPayload()));
        }
        finish();
    }
}
