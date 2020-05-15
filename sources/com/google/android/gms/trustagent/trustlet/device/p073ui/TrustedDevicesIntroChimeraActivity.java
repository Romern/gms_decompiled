package com.google.android.gms.trustagent.trustlet.device.p073ui;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.common.p070ui.ConfirmUserCredentialAndStartChimeraActivity;

/* renamed from: com.google.android.gms.trustagent.trustlet.device.ui.TrustedDevicesIntroChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustedDevicesIntroChimeraActivity extends auli {

    /* renamed from: a */
    private static final aunx f109212a = new aunx("TrustAgent", "TrustedDevicesIntroChimeraActivity");

    /* renamed from: b */
    private BluetoothDevice f109213b = null;

    /* renamed from: c */
    private int f109214c = 0;

    /* renamed from: d */
    private long f109215d = 0;

    /* renamed from: e */
    private bogq f109216e;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo50650e() {
        Intent intent = new Intent("com.google.android.gms.auth.trustagent.ADD_DEVICE");
        intent.setClassName(getApplication(), "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings");
        intent.putExtra("bluetooth_device_address", this.f109213b.getAddress());
        intent.putExtra("com.google.android.gms.auth.TrustAgentIdOfNotificationToClose", this.f109214c);
        intent.putExtra("notification_type_key", 2);
        intent.putExtra("notification_shown_time", this.f109215d);
        Intent a = ConfirmUserCredentialAndStartChimeraActivity.m93423a(getApplication(), intent);
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = 25;
        bohi.f133071a |= 4096;
        aupk.m77567a(this, (bohi) bogj.mo74062i());
        startActivity(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo50651f() {
        return C0126R.C0127drawable.auth_ic_trusted_device_unlock;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo50652g() {
        return getString(C0126R.string.auth_trust_agent_trusted_devices_on_boarding_intro_title);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo50653h() {
        return getString(C0126R.string.auth_trust_agent_trusted_devices_on_boarding_intro_content, new Object[]{auuj.m77854a(this.f109213b)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo50654i() {
        return getString(C0126R.string.auth_trust_agent_trusted_devices_on_boarding_intro_btn_title);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        long j;
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("com.google.android.gms.auth.TrustAgentIdOfNotificationToClose")) {
                sex.m35104a(this).mo25440a(intent.getIntExtra("com.google.android.gms.auth.TrustAgentIdOfNotificationToClose", 0));
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f109216e = bogq.m111182a(extras.getInt("notification_type_key", -1));
            }
            this.f109213b = (BluetoothDevice) intent.getParcelableExtra("com.google.android.gms.auth.trustagent.TrustedDevicesAddingIntroActivity.bluetooth_device");
            this.f109214c = intent.getIntExtra("com.google.android.gms.auth.TrustAgentIdOfNotificationToClose", 0);
            this.f109215d = intent.getLongExtra("notification_shown_time", 0);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.f109215d;
            if (j2 != 0) {
                j = currentTimeMillis - j2;
            } else {
                j = -1;
            }
            bogj bogj = (bogj) bohi.f133070z.mo74144da();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi = (bohi) bogj.f164949b;
            bohi.f133088r = 24;
            bohi.f133071a |= 4096;
            if (this.f109216e == bogq.BLUETOOTH_LURE) {
                f109212a.mo50711a("logging entering trusted devices settings with notification.", new Object[0]).mo50708c();
                bxvd da = bogm.f133003e.mo74144da();
                bogq bogq = this.f109216e;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogm bogm = (bogm) da.f164949b;
                bogm.f133006b = bogq.f133019h;
                int i = bogm.f133005a | 1;
                bogm.f133005a = i;
                bogm.f133007c = 3;
                int i2 = i | 2;
                bogm.f133005a = i2;
                bogm.f133005a = i2 | 4;
                bogm.f133008d = j;
                bogj.mo68908a((bogm) da.mo74062i());
            }
            aupk.m77567a(this, (bohi) bogj.mo74062i());
            super.onCreate(bundle);
        }
    }
}
