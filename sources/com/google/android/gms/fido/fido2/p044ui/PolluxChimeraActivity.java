package com.google.android.gms.fido.fido2.p044ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;

/* renamed from: com.google.android.gms.fido.fido2.ui.PolluxChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PolluxChimeraActivity extends FragmentActivity {

    /* renamed from: a */
    public String f31862a;

    /* renamed from: b */
    public ResultReceiver f31863b;

    /* renamed from: c */
    public xwn f31864c;

    /* renamed from: d */
    public xwj f31865d;

    /* renamed from: e */
    public boolean f31866e;

    /* renamed from: f */
    public int f31867f;

    /* renamed from: g */
    private Handler f31868g;

    /* renamed from: h */
    private BroadcastReceiver f31869h;

    /* renamed from: a */
    public final void mo18791a() {
        this.f31864c.mo30194a(this.f31865d, xaj.TYPE_USER_APPROVES_AUTHENTICATION);
        this.f31867f = 2;
        boolean z = this.f31866e;
        xwe xwe = new xwe();
        xwe.f53270b = z;
        xwe.f53269a = new adzt();
        mo18792a(xwe);
        Bundle bundle = new Bundle();
        bundle.putBoolean("UserApprovalExtra", true);
        this.f31863b.send(-1, bundle);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("LoggerRequestIdExtra", -1);
        xwi xwi = xwi.PAASK;
        if (intExtra > 0) {
            num = Integer.valueOf(intExtra);
        } else {
            num = null;
        }
        this.f31865d = xwj.m43508a(xwi, num);
        setTheme(C0126R.style.fidoTheme);
        setContentView((int) C0126R.C0128layout.pollux_activity);
        setRequestedOrientation(1);
        this.f31868g = new adzt(Looper.getMainLooper());
        this.f31862a = getIntent().getStringExtra("AccountNameExtra");
        this.f31864c = xwm.m43527b(this);
        this.f31866e = getIntent().getBooleanExtra("ShowStrongBoxUiExtra", false);
        this.f31863b = (ResultReceiver) getIntent().getParcelableExtra("ResultReceiverExtra");
        C15681 r0 = new aacn("fido") {
            /* class com.google.android.gms.fido.fido2.p044ui.PolluxChimeraActivity.C15681 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                int i;
                boolean z = true;
                sdo.m34974b(intent.hasExtra("AuthenticationResultExtra") || intent.hasExtra("DismissActivityExtra"));
                if (intent.hasExtra("DismissActivityExtra")) {
                    PolluxChimeraActivity.this.finish();
                    return;
                }
                if (PolluxChimeraActivity.this.f31867f != 2) {
                    z = false;
                }
                sdo.m34970a(z);
                if (!intent.getBooleanExtra("AuthenticationResultExtra", false)) {
                    PolluxChimeraActivity polluxChimeraActivity = PolluxChimeraActivity.this;
                    polluxChimeraActivity.f31867f = 4;
                    polluxChimeraActivity.f31864c.mo30194a(polluxChimeraActivity.f31865d, xaj.TYPE_USER_SHOWN_AUTHENTICATION_FAILED_VIEW);
                    i = C0126R.string.fido_paask_error_toast;
                } else {
                    PolluxChimeraActivity polluxChimeraActivity2 = PolluxChimeraActivity.this;
                    polluxChimeraActivity2.f31867f = 3;
                    polluxChimeraActivity2.f31864c.mo30194a(polluxChimeraActivity2.f31865d, xaj.TYPE_USER_SHOWN_AUTHENTICATION_SUCCEEDED_VIEW);
                    i = C0126R.string.fido_paask_sign_in_toast;
                }
                Toast.makeText(PolluxChimeraActivity.this, i, 0).show();
                new adzt(Looper.getMainLooper()).postDelayed(new xve(this), 1000);
            }
        };
        this.f31869h = r0;
        registerReceiver(r0, new IntentFilter("updatePolluxChimeraActivity"));
        if (cdwi.m135160b()) {
            this.f31867f = 1;
            this.f31864c.mo30194a(this.f31865d, xaj.TYPE_USER_SHOWN_APPROVAL_PROMPT);
            mo18792a(xvy.m43493a(this.f31866e, this.f31862a));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f31867f = 7;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ActivityCompletionExtra", true);
        ResultReceiver resultReceiver = this.f31863b;
        if (resultReceiver != null) {
            resultReceiver.send(-1, bundle);
        }
        BroadcastReceiver broadcastReceiver = this.f31869h;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.f31866e || i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        int i2 = this.f31867f;
        if (i2 != 0) {
            if (i2 == 1) {
                keyEvent.startTracking();
            }
            return true;
        }
        throw null;
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (!this.f31866e || i != 25) {
            return super.onKeyLongPress(i, keyEvent);
        }
        int i2 = this.f31867f;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f31868g.post(new xvf(this));
                this.f31868g.postDelayed(new xvg(this), 1000);
            }
            this.f31868g.postDelayed(new xvh(this), 2500);
            return true;
        }
        throw null;
    }

    public final void onStart() {
        super.onStart();
        if (!cdwi.m135160b()) {
            this.f31867f = 1;
            this.f31864c.mo30194a(this.f31865d, xaj.TYPE_USER_SHOWN_APPROVAL_PROMPT);
            mo18792a(xvy.m43493a(this.f31866e, this.f31862a));
        }
    }

    /* renamed from: a */
    public final void mo18792a(Fragment fragment) {
        sdo.m34959a(fragment);
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.pollux_fragment_container, fragment).commitAllowingStateLoss();
    }
}
