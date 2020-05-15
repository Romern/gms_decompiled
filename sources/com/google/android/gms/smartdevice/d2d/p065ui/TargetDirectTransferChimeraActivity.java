package com.google.android.gms.smartdevice.d2d.p065ui;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetDirectTransferChimeraActivity extends deu implements arwr, arqe {

    /* renamed from: b */
    private ResultReceiver f108046b;

    /* renamed from: c */
    private ProxyResultReceiver f108047c;

    /* renamed from: d */
    private aron f108048d = new aron(this, new arpd());

    /* renamed from: a */
    public final void mo48435a(int i, Bundle bundle) {
        if (i == 2051) {
            asbv.m73762a(this);
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown event code: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    public final void onBackPressed() {
        this.f108046b.send(2004, Bundle.EMPTY);
        asbv.m73762a(this);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arqh.m73305a((Activity) this);
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("resultReceiver");
        if (resultReceiver != null) {
            this.f108046b = resultReceiver;
            if (bundle == null) {
                ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("extraAccountChallengeData");
                if (parcelableArrayListExtra == null) {
                    finish();
                    return;
                }
                this.f108048d.mo48710a(1, 1, arws.m73629b(parcelableArrayListExtra, ""));
                return;
            }
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f108046b.send(2002, Bundle.EMPTY);
        this.f108047c = null;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f108047c = new ProxyResultReceiver(null, this);
        Bundle bundle = new Bundle();
        bundle.putParcelable("resultReceiver", this.f108047c);
        this.f108046b.send(2001, bundle);
    }

    /* renamed from: a */
    public final void mo48885a(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accountChallengeData", arrayList);
        this.f108046b.send(2003, bundle);
        asbv.m73762a(this);
    }
}
