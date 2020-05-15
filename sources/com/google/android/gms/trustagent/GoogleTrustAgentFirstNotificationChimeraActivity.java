package com.google.android.gms.trustagent;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;
import java.util.concurrent.FutureTask;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleTrustAgentFirstNotificationChimeraActivity extends aulb {

    /* renamed from: a */
    public boolean f109119a;

    /* renamed from: b */
    private Handler f109120b;

    /* renamed from: c */
    private FutureTask f109121c;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.auth_trust_agent_first_notification);
        this.f109119a = false;
        ((Button) findViewById(C0126R.C0129id.auth_trust_agent_first_use_notification_button_id)).setOnClickListener(new aukm(this));
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("type");
        String string2 = extras.getString("name");
        TextView textView = (TextView) findViewById(C0126R.C0129id.auth_trust_agent_first_use_notification_message_id);
        if (string != null && BluetoothTrustletChimeraService.class.getName().equals(string)) {
            textView.setText(getString(C0126R.string.auth_trust_agent_first_use_notification_message_device, new Object[]{string2}));
        } else if (string != null && "Place".equals(string)) {
            textView.setText(getString(C0126R.string.auth_trust_agent_first_use_notification_message_place, new Object[]{string2}));
        } else if (string != null && "PhonePosition".equals(string)) {
            textView.setText(getString(C0126R.string.auth_trust_agent_first_use_notification_message_phone_position));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f109121c.cancel(true);
        this.f109121c = null;
        if (this.f109119a) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f109120b = new adzt();
        FutureTask futureTask = new FutureTask(new aukn(this), null);
        this.f109121c = futureTask;
        this.f109120b.postDelayed(futureTask, 500);
    }
}
