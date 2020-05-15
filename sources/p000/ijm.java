package p000;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.auth.authzen.transaction.AuthzenBaseLayoutActivity$1;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ijm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ijm extends ijt {

    /* renamed from: c */
    public static final /* synthetic */ int f21115c = 0;

    /* renamed from: a */
    protected Bundle f21116a;

    /* renamed from: b */
    public final ikl f21117b = ikl.m15607a(this);

    /* renamed from: s */
    private String f21118s;

    /* renamed from: t */
    private ikd f21119t;

    /* renamed from: u */
    private ike f21120u;

    /* renamed from: v */
    private BroadcastReceiver f21121v;

    /* renamed from: a */
    protected static Intent m15534a(bypc bypc, String str, byte[] bArr) {
        sdo.m34959a(bypc);
        sdo.m34977c(str);
        Intent intent = new Intent();
        intent.putExtra("account", str);
        intent.putExtra("tx_request", bypc.mo73642k());
        intent.putExtra("encryption_key_handle", bArr);
        intent.addFlags(268435456).addFlags(134217728).addFlags(2097152).addFlags(8388608).addFlags(4).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        return intent;
    }

    /* renamed from: b */
    private final void m15535b(ikz ikz) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentByTag(ikz.mo13099a()) == null) {
            beginTransaction.replace(C0126R.C0129id.fragments_layout, ikz, ikz.mo13099a());
        }
        if (!beginTransaction.isEmpty()) {
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* renamed from: c */
    private final void m15536c() {
        if (!this.f21142m) {
            mo13074a(byoo.DISMISSED, (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR);
        }
        setResult(0);
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            mo13067a(this.f21118s, mo7589a());
            mo13068b();
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        m15536c();
    }

    public final void onDestroy() {
        super.onDestroy();
        ike ike = this.f21120u;
        if (ike != null) {
            ike.mo13080b();
        }
        BroadcastReceiver broadcastReceiver = this.f21121v;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("current_fragment", this.f21118s);
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        if (this.f21120u != null && this.f21118s.equals(ikw.f21259a)) {
            ike ike = this.f21120u;
            if (ike.f21172e) {
                ike.f21172e = false;
                ijt.f21129r.mo25412b("Ignoring onUserLeaveHint due to screen locker", new Object[0]);
                return;
            }
        }
        m15536c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ikz mo7589a() {
        Bundle bundle = this.f21116a;
        ikv ikv = new ikv();
        ikv.setArguments(bundle);
        return ikv;
    }

    /* renamed from: b */
    public final void mo13068b() {
        byqq byqq;
        bypd bypd = this.f21135f;
        if ((bypd.f167319a & 16) == 0) {
            byqq = byqq.f167409i;
        } else {
            byqq = bypd.f167325g;
            if (byqq == null) {
                byqq = byqq.f167409i;
            }
        }
        bxvd a = byqq.f167409i.mo74141a(byqq);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        byqq byqq2 = (byqq) a.f164949b;
        byqq2.f167411a |= 64;
        byqq2.f167418h = true;
        byqq byqq3 = (byqq) a.mo74062i();
        bxvd a2 = bypd.f167317i.mo74141a(this.f21135f);
        if (a2.f164950c) {
            a2.mo74035c();
            a2.f164950c = false;
        }
        bypd bypd2 = (bypd) a2.f164949b;
        byqq3.getClass();
        bypd2.f167325g = byqq3;
        bypd2.f167319a |= 16;
        this.f21135f = (bypd) a2.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13063a(Bundle bundle) {
        int i;
        ike ike;
        ikz ikz;
        bypb bypb;
        this.f21119t = ikd.m15574a(this);
        if (!igt.m15429a().booleanValue()) {
            setRequestedOrientation(1);
        }
        this.f21116a = ilf.m15648a(this.f21134e).mo13116a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        AuthzenBaseLayoutActivity$1 authzenBaseLayoutActivity$1 = new AuthzenBaseLayoutActivity$1(this, "auth_authzen");
        this.f21121v = authzenBaseLayoutActivity$1;
        registerReceiver(authzenBaseLayoutActivity$1, intentFilter);
        requestWindowFeature(1);
        if (!igt.m15429a().booleanValue()) {
            i = C0126R.C0128layout.auth_authzen_fragment_layout_activity;
        } else {
            i = C0126R.C0128layout.auth_authzen_gm_fragment_layout_activity;
        }
        setContentView(i);
        new ijw(getApplicationContext(), this.f21133d, this).mo13075a(new ijy((ImageView) findViewById(C0126R.C0129id.profile_image)).f21158a);
        ((TextView) findViewById(C0126R.C0129id.email)).setText(this.f21133d);
        bypb bypb2 = this.f21134e.f167310d;
        if (bypb2 == null) {
            bypb2 = bypb.f167289p;
        }
        ikd ikd = this.f21119t;
        if ((bypb2.f167291a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !ikd.f21166a.mo12993a() || !ikd.f21166a.mo12994b()) {
            ike = null;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            bypb bypb3 = this.f21134e.f167310d;
            if (bypb3 != null) {
                bypb = bypb3;
            } else {
                bypb = bypb.f167289p;
            }
            ike = new ike(this, bypb, this.f21116a, this.f21138i, new ijl(this));
        }
        this.f21120u = ike;
        if (bundle == null) {
            if (ike != null) {
                ike.mo13078a();
            } else {
                mo7589a();
            }
            if (this.f21120u != null) {
                ijt.f21129r.mo25414c("Showing screen locker fragment.", new Object[0]);
                ikz = this.f21120u.mo13078a();
            } else {
                ijt.f21129r.mo25414c("Showing recovery verification fragment.", new Object[0]);
                ikz = mo7589a();
            }
            ikz.mo13114c();
            mo13065a((ikz) null, ikz);
            return;
        }
        this.f21118s = bundle.getString("current_fragment");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13069b(String str) {
        if (!stm.m36302d(str)) {
            ijt.f21129r.mo25414c("Showing toast: %s", str);
            Toast.makeText(this, str, 1).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13064a(ikz ikz) {
        mo13074a(byoo.REJECT_SELECTED, 3);
        Bundle bundle = this.f21116a;
        if (!bundle.containsKey(ikp.f21220b) || !bundle.containsKey(ikp.f21221c)) {
            String string = this.f21116a.getString(ild.f21287j);
            if (!stm.m36302d(string)) {
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(string)));
            }
            setResult(-1);
            finish();
            return;
        }
        mo13065a(ikz, ikp.m15623a(this.f21116a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13065a(ikz ikz, ikz ikz2) {
        if (ikz != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.remove(ikz);
            beginTransaction.commit();
        }
        this.f21118s = ikz2.mo13099a();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentByTag(ikz2.mo13099a()) == null) {
            beginTransaction2.add(C0126R.C0129id.fragments_layout, ikz2, ikz2.mo13099a());
        }
        if (!beginTransaction2.isEmpty()) {
            beginTransaction2.commit();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13066a(String str) {
        String string = this.f21116a.getString(ild.f21288k);
        if (!stm.m36302d(string)) {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(string)));
        }
        mo13069b(str);
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13067a(String str, ikz ikz) {
        if (this.f21118s.equals(str)) {
            m15535b(ikz);
        } else if (!((Boolean) igt.f20946B.mo58455c()).booleanValue()) {
            throw new RuntimeException("Current fragment doesn't match the one to be swapped");
        } else if (!this.f21118s.equals(ikz.getTag())) {
            m15535b(ikz);
        }
    }

    /* renamed from: a */
    public boolean mo7588a(ikz ikz, int i) {
        char c;
        ike ike = this.f21120u;
        if (ike != null) {
            if (!ikw.f21259a.equals(ikz.mo13099a())) {
                c = 0;
            } else if (i == 0) {
                int i2 = Build.VERSION.SDK_INT;
                Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) ike.f21168a.getSystemService("keyguard")).createConfirmDeviceCredentialIntent(ike.f21170c.getString(ikw.f21264f), ike.f21170c.getString(ikw.f21265g));
                if (createConfirmDeviceCredentialIntent != null) {
                    ike.f21167f.mo25414c("Locking via ConfirmDeviceCredentialIntent", new Object[0]);
                    ike.f21172e = true;
                    ike.f21168a.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                    c = 1;
                } else {
                    c = 3;
                }
                ike.mo13080b();
            } else {
                c = 4;
            }
            if (c != 1) {
                if (c == 2) {
                    mo13065a(ikz, mo7589a());
                    mo13068b();
                } else if (c == 3) {
                    ijt.f21129r.mo25418e("Failed to lock the screen.", new Object[0]);
                    mo13065a(ikz, mo7589a());
                    return true;
                } else if (c == 4) {
                    mo13064a(ikz);
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
