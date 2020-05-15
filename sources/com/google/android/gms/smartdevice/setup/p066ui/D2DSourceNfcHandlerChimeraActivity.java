package com.google.android.gms.smartdevice.setup.p066ui;

import android.nfc.NdefMessage;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;

/* renamed from: com.google.android.gms.smartdevice.setup.ui.D2DSourceNfcHandlerChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2DSourceNfcHandlerChimeraActivity extends deu implements asas, aryt {

    /* renamed from: c */
    private static final sek f108223c = ascp.m73787a("D2DSourceNfcHandlerActivity");

    /* renamed from: b */
    SourceLogManager f108224b;

    /* renamed from: d */
    private aroi f108225d;

    /* renamed from: e */
    private boolean f108226e;

    /* renamed from: a */
    private final void m92951a(aroi aroi) {
        D2DDevice d2DDevice = new D2DDevice();
        d2DDevice.mo59073e("unknown target device");
        d2DDevice.mo59072a(1);
        d2DDevice.mo59074f(aroi.f87998a);
        d2DDevice.mo59071a((byte) 0);
        this.f108226e = true;
        startActivity(D2DSetupChimeraActivity.m92899a(this, d2DDevice, 1, this.f108225d.f88000c, this.f108224b));
    }

    /* renamed from: e */
    private final void m92952e() {
        aryu.m73694a(1, getString(C0126R.string.common_something_went_wrong), null, getString(C0126R.string.common_ok), null, false).show(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        aroi aroi;
        super.onCreate(bundle);
        arqh.m73305a((Activity) this);
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        NdefMessage ndefMessage = (NdefMessage) getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
        if (ndefMessage == null || ndefMessage.getRecords().length == 0) {
            m92952e();
            return;
        }
        byte[] payload = ndefMessage.getRecords()[0].getPayload();
        try {
            aroi = (aroi) bxvk.m124016a(aroi.f87996d, payload, bxus.m123744c());
        } catch (bxwf e) {
            f108223c.mo25417e("Invalid BootstrapInfo proto.", e, new Object[0]);
            aroi = null;
        }
        this.f108225d = aroi;
        if (aroi == null) {
            m92952e();
        } else if (aroi.f87999b == 0) {
            f108223c.mo25418e("Google Play services on target device is too old.", new Object[0]);
            m92952e();
        } else {
            ascv a = ascv.m73797a();
            if (a == null || !a.mo49047b()) {
                if (bundle == null) {
                    SourceLogManager sourceLogManager = new SourceLogManager(this);
                    this.f108224b = sourceLogManager;
                    sourceLogManager.mo59113a(1, arpu.m73280a(this));
                    getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, asat.m73745a(getString(C0126R.string.smartdevice_setup_intro_title), getString(C0126R.string.smartdevice_intro_text_bt_only), getString(C0126R.string.common_next))).commit();
                } else {
                    SourceLogManager sourceLogManager2 = (SourceLogManager) bundle.getParcelable("smartdevice.sourceLogManager");
                    bmxy.m108581a(sourceLogManager2);
                    this.f108224b = sourceLogManager2;
                    sourceLogManager2.f108008f = this;
                }
                ascq.m73788a(getContainerActivity());
                return;
            }
            f108223c.mo25412b("Bluetooth already enabled. Skipping consent screen.", new Object[0]);
            m92951a(this.f108225d);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (!this.f108226e && isFinishing()) {
            this.f108224b.mo59120e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("smartdevice.sourceLogManager", this.f108224b);
    }

    /* renamed from: a */
    public final void mo49010a(int i) {
        if (i != 0) {
            sek sek = f108223c;
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unknown text fragment id: ");
            sb.append(i);
            sek.mo25418e(sb.toString(), new Object[0]);
        } else {
            this.f108224b.mo59110a();
            m92951a(this.f108225d);
        }
        finish();
    }

    /* renamed from: a */
    public final void mo48948a(int i, int i2) {
        finish();
    }
}
