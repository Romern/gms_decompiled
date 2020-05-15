package com.google.android.gms.location.settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationOffWarningChimeraActivity extends Activity implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private qws f79621a;

    /* renamed from: b */
    private AlertDialog f79622b;

    /* renamed from: c */
    private int f79623c;

    /* renamed from: d */
    private Boolean f79624d;

    /* renamed from: a */
    private final void m66982a(boolean z) {
        if (this.f79624d == null) {
            this.f79624d = Boolean.valueOf(z);
            int i = 4;
            if (Log.isLoggable("LOWD", 4)) {
                StringBuilder sb = new StringBuilder(23);
                sb.append("dialog choice was ");
                sb.append(z);
                Log.i("LOWD", sb.toString());
            }
            if (!isFinishing()) {
                finish();
            }
            if (z) {
                aeri.m52430a(this, this.f79623c, aerk.ALLOWED);
                aepp.m52357b(this, 0);
            }
            if (Math.random() <= ceyv.f183518a.mo6606a().logSamplingRate()) {
                bxvd da = bpku.f138014c.mo74144da();
                if (z) {
                    i = 3;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpku bpku = (bpku) da.f164949b;
                bpku.f138017b = i - 1;
                bpku.f138016a |= 1;
                bpku bpku2 = (bpku) da.mo74062i();
                bxvd da2 = bonq.f133833p.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bonq bonq = (bonq) da2.f164949b;
                bonq.f133836b = 7;
                bonq.f133835a |= 1;
                bxvd da3 = bpkv.f138018d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpkv bpkv = (bpkv) da3.f164949b;
                bpkv.f138021b = 1;
                int i2 = 1 | bpkv.f138020a;
                bpkv.f138020a = i2;
                bpku2.getClass();
                bpkv.f138022c = bpku2;
                bpkv.f138020a = i2 | 2;
                bpkv bpkv2 = (bpkv) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bonq bonq2 = (bonq) da2.f164949b;
                bpkv2.getClass();
                bonq2.f133843i = bpkv2;
                bonq2.f133835a |= 128;
                this.f79621a.mo24333a((bonq) da2.mo74062i()).mo24327b();
            }
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        m66982a(i == -1);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qws qws = new qws(this, "LE", null);
        this.f79621a = qws;
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        int intExtra = getIntent().getIntExtra("previousMode", 0);
        this.f79623c = intExtra;
        if (intExtra == 0) {
            finish();
            return;
        }
        if (Log.isLoggable("LOWD", 4)) {
            Log.i("LOWD", "displaying dialog");
        }
        sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        AlertDialog create = new AlertDialog.Builder(this).setTitle((int) C0126R.string.location_off_dialog_title).setMessage((int) C0126R.string.location_off_dialog_message).setPositiveButton((int) C0126R.string.location_off_dialog_button_turn_on_location, this).setNegativeButton((int) C0126R.string.close_button_label, this).setOnCancelListener(new aeqz(this)).create();
        this.f79622b = create;
        create.show();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        m66982a(false);
        super.onPause();
    }
}
