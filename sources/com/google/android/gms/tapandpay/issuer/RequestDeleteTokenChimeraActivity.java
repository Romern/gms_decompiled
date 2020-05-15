package com.google.android.gms.tapandpay.issuer;

import android.os.Bundle;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestDeleteTokenChimeraActivity extends aszc {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo49706e() {
        return String.format(getString(C0126R.string.tp_request_delete_token_message), ((aszc) this).f89909b.f108343d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo49707g() {
        return C0126R.string.common_cancel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo49708h() {
        return C0126R.string.common_remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo49709i() {
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo49710j() {
        asjl.m74237b(this, "Issuer Delete Token Cancel");
        asjl.m74237b(this, "Issuer Delete Token OK");
        atam atam = new atam(this, this.f89910c);
        String str = this.f89911d;
        bxvd g = atam.mo49765g(56);
        if (str != null) {
            bxvd da = boxo.f135271c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boxo boxo = (boxo) da.f164949b;
            str.getClass();
            boxo.f135273a |= 1;
            boxo.f135274b = str;
            if (g.f164950c) {
                g.mo74035c();
                g.f164950c = false;
            }
            bpbx bpbx = (bpbx) g.f164949b;
            boxo boxo2 = (boxo) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            boxo2.getClass();
            bpbx.f135676v = boxo2;
            bpbx.f135655a |= 4194304;
        }
        atam.mo49741a((bpbx) g.mo74062i());
        this.f89912e.mo24749h(((aszc) this).f89909b.f108340a).mo50374a(this, new aszg(this));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((TextView) findViewById(C0126R.C0129id.tp_request_prompt_headline)).setText((int) C0126R.string.tp_request_delete_token_title);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Request Delete Token");
    }
}
