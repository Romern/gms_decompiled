package com.google.android.gms.auth.setup.d2d;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONStringer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceChimeraActivity extends Activity implements rka {

    /* renamed from: a */
    public static final sek f11265a = new sek("D2D", "SourceActivity");

    /* renamed from: u */
    private static final long f11266u = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public Account[] f11267b;

    /* renamed from: c */
    public BluetoothAdapter f11268c;

    /* renamed from: d */
    public boolean f11269d = false;

    /* renamed from: e */
    public boolean f11270e = false;

    /* renamed from: f */
    public boolean f11271f = false;

    /* renamed from: g */
    public volatile boolean f11272g = false;

    /* renamed from: h */
    public boolean f11273h = false;

    /* renamed from: i */
    public final Object f11274i = new Object();

    /* renamed from: j */
    public boolean f11275j = false;

    /* renamed from: k */
    public jur f11276k;

    /* renamed from: l */
    public final bqgy f11277l = bqgy.m112818c();

    /* renamed from: m */
    public AlertDialog f11278m;

    /* renamed from: n */
    public juq f11279n;

    /* renamed from: o */
    public jup f11280o;

    /* renamed from: p */
    public ios f11281p;

    /* renamed from: q */
    public asfb f11282q;

    /* renamed from: r */
    public AsyncTask f11283r;

    /* renamed from: s */
    public jtz f11284s;

    /* renamed from: t */
    public jtx f11285t = jua.f23220b;

    /* renamed from: a */
    public static Intent m6887a(Context context, byte[] bArr) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.setup.d2d.SourceActivity").putExtra("payload", bArr);
    }

    /* renamed from: b */
    public final void mo7854b() {
        this.f11269d = true;
        if (this.f11268c.enable()) {
            registerReceiver(new aacn("auth_account") {
                /* class com.google.android.gms.auth.setup.d2d.SourceChimeraActivity.C09096 */

                /* renamed from: a */
                public final void mo6253a(Context context, Intent intent) {
                    SourceChimeraActivity sourceChimeraActivity = SourceChimeraActivity.this;
                    sek sek = SourceChimeraActivity.f11265a;
                    if (sourceChimeraActivity.f11268c.isEnabled()) {
                        context.unregisterReceiver(this);
                        SourceChimeraActivity.this.mo7855c();
                    }
                }
            }, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            return;
        }
        f11265a.mo25418e("Could not enable Bluetooth.", new Object[0]);
        finish();
    }

    /* renamed from: c */
    public final void mo7855c() {
        juq juq = new juq(this, this.f11268c, UUID.fromString(this.f11276k.f23254b), this.f11276k.f23255c);
        this.f11279n = juq;
        juq.start();
    }

    /* renamed from: d */
    public final void mo7856d() {
        this.f11272g = true;
        if (this.f11284s != null) {
            bxvd da = jus.f23257h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            jus.m17350a((jus) da.f164949b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            jus jus = (jus) da.f164949b;
            jus.f23259a |= 4;
            jus.f23261c = true;
            try {
                this.f11284s.mo14097a((jus) da.mo74062i());
            } catch (IOException e) {
                f11265a.mo25410a((Throwable) e);
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            this.f11271f = true;
            mo7852a();
            return;
        }
        mo7856d();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (!gnv.m13503M()) {
            finish();
            return;
        }
        boolean z = false;
        if (soz.m35807f(this)) {
            mo7853a((int) C0126R.string.auth_d2d_source_restricted_user_toast);
            f11265a.mo25416d("Cannot clone restricted profile", new Object[0]);
            return;
        }
        Account[] a = adyd.m51363a(this).mo33916a("com.google");
        this.f11267b = a;
        if (a.length <= 0) {
            mo7853a((int) C0126R.string.auth_d2d_source_no_accounts_toast);
            f11265a.mo25409a("No accounts found!", new Object[0]);
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f11268c = defaultAdapter;
        if (defaultAdapter == null) {
            mo7853a((int) C0126R.string.auth_d2d_source_no_bluetooth_toast);
            f11265a.mo25414c("Bluetooth not available.", new Object[0]);
            return;
        }
        setContentView(new View(this));
        getWindow().addFlags(128);
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (keyguardManager != null && keyguardManager.isKeyguardSecure()) {
            this.f11270e = true;
        }
        Intent intent = getIntent();
        bxvd da = jur.f23251e.mo74144da();
        byte[] byteArrayExtra = intent.getByteArrayExtra("payload");
        jur jur = null;
        if (byteArrayExtra != null) {
            try {
                da.mo73635b(byteArrayExtra, bxus.m123744c());
                jur = (jur) da.mo74062i();
            } catch (bxwf e) {
                f11265a.mo25417e("Could not deserialize BootstrapInfo!", e, new Object[0]);
            }
        } else {
            String stringExtra = intent.getStringExtra("btMacAddress");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            jur jur2 = (jur) da.f164949b;
            stringExtra.getClass();
            jur2.f23253a |= 2;
            jur2.f23255c = stringExtra;
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("initiatorHello");
            if (byteArrayExtra2 != null) {
                bxtx a2 = bxtx.m123261a(byteArrayExtra2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jur jur3 = (jur) da.f164949b;
                a2.getClass();
                jur3.f23253a |= 4;
                jur3.f23256d = a2;
            }
            if (TextUtils.isEmpty(((jur) da.f164949b).f23255c)) {
                f11265a.mo25418e("Bluetooth MAC address information missing.", new Object[0]);
            } else {
                jur = (jur) da.mo74062i();
            }
        }
        this.f11276k = jur;
        if (jur != null) {
            boolean isEnabled = this.f11268c.isEnabled();
            if (isEnabled) {
                mo7855c();
            }
            if (this.f11270e) {
                String string = getString(C0126R.string.auth_d2d_source_lock_notice);
                if (isEnabled) {
                    String valueOf = String.valueOf(string);
                    String string2 = getString(C0126R.string.auth_d2d_source_lock_bt_on_notice);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string2).length());
                    sb.append(valueOf);
                    sb.append("\n");
                    sb.append(string2);
                    str = sb.toString();
                } else {
                    String valueOf2 = String.valueOf(string);
                    String string3 = getString(C0126R.string.auth_d2d_source_lock_bt_off_notice);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(string3).length());
                    sb2.append(valueOf2);
                    sb2.append("\n");
                    sb2.append(string3);
                    str = sb2.toString();
                }
                m6889a(new AlertDialog.Builder(this).setTitle((int) C0126R.string.auth_d2d_tap_and_go).setMessage(str).setPositiveButton((int) C0126R.string.auth_d2d_source_alert_verify_lock_button, new juh(this)).setOnCancelListener(new jug(this)).setCancelable(true).create());
            } else {
                mo7852a();
            }
        } else {
            finish();
        }
        if (bundle != null && bundle.getBoolean("resolving_error", false)) {
            z = true;
        }
        this.f11273h = z;
        this.f11281p = inl.m15759a(this);
    }

    public final void onDestroy() {
        AlertDialog alertDialog = this.f11278m;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f11278m.dismiss();
            this.f11278m = null;
        }
        jtz jtz = this.f11284s;
        if (jtz != null) {
            try {
                jtz.mo14096a();
            } catch (IOException e) {
                f11265a.mo25410a((Throwable) e);
            }
        }
        juq juq = this.f11279n;
        if (juq != null) {
            juq.mo14115a();
        }
        if (this.f11269d) {
            this.f11268c.disable();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        AsyncTask asyncTask = this.f11283r;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f11283r = null;
        }
        if (this.f11282q != null) {
            f11265a.mo25409a("Acquiring WakeLock", new Object[0]);
            this.f11282q.mo49117b();
        }
        synchronized (this.f11274i) {
            if (!this.f11275j) {
                mo7856d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        synchronized (this.f11274i) {
            this.f11275j = false;
        }
        if (this.f11282q != null) {
            f11265a.mo25409a("Releasing WakeLock", new Object[0]);
            this.f11271f = true;
            this.f11282q.mo49120c();
            this.f11282q = null;
            mo7852a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.f11273h);
    }

    /* renamed from: a */
    public static Object m6888a(aucb aucb) {
        aucu.m76783a(aucb, f11266u, TimeUnit.MILLISECONDS);
        return aucb.mo50386d();
    }

    /* renamed from: a */
    private final void m6889a(AlertDialog alertDialog) {
        AlertDialog alertDialog2 = this.f11278m;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.f11278m.dismiss();
        }
        this.f11278m = alertDialog;
        alertDialog.getWindow().addFlags(128);
        this.f11278m.show();
    }

    /* renamed from: a */
    public final brzo mo7851a(brzs brzs, grm grm, grn grn) {
        int i;
        Long l;
        rex rex;
        skh skh;
        iyv iyv;
        long j;
        long j2;
        brzs brzs2 = brzs;
        if (brzs2.f143781a != 0) {
            return null;
        }
        String str = brzs2.f143782b;
        try {
            byte[] k = brzs2.f143784d.mo73780k();
            bxvd da = bsaj.f143852g.mo74144da();
            if (!this.f11270e) {
                i = 1;
            } else {
                i = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsaj bsaj = (bsaj) da.f164949b;
            bsaj.f143857d = i;
            int i2 = bsaj.f143854a | 4;
            bsaj.f143854a = i2;
            boolean z = this.f11270e;
            int i3 = i2 | 1;
            bsaj.f143854a = i3;
            bsaj.f143855b = z;
            boolean z2 = this.f11271f;
            int i4 = i3 | 2;
            bsaj.f143854a = i4;
            bsaj.f143856c = z2;
            if (z) {
                rex = new rex();
                try {
                    skh.m35531a().mo25690a(this, new Intent().setClassName(this, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), rex, 1);
                    IBinder a = rex.mo24567a();
                    if (a != null) {
                        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                        iyv = !(queryLocalInterface instanceof iyv) ? new iyt(a) : (iyv) queryLocalInterface;
                    } else {
                        iyv = null;
                    }
                    long a2 = iyv.mo13498a();
                    long c = iyv.mo13499c();
                    if (a2 != -1) {
                        j = (SystemClock.elapsedRealtime() - a2) / 1000;
                    } else {
                        j = -1;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsaj bsaj2 = (bsaj) da.f164949b;
                    int i5 = bsaj2.f143854a | 8;
                    bsaj2.f143854a = i5;
                    bsaj2.f143858e = j;
                    if (c != -1) {
                        j2 = c / 1000;
                    } else {
                        j2 = -1;
                    }
                    bsaj2.f143854a = i5 | 16;
                    bsaj2.f143859f = j2;
                    skh = skh.m35531a();
                } catch (RemoteException | InterruptedException e) {
                    Log.w("Could not get device signals. Setting to insecure.", e);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsaj bsaj3 = (bsaj) da.f164949b;
                    int i6 = bsaj3.f143854a | 8;
                    bsaj3.f143854a = i6;
                    bsaj3.f143858e = -1;
                    bsaj3.f143854a = i6 | 16;
                    bsaj3.f143859f = -1;
                    skh = skh.m35531a();
                }
                skh.mo25689a(this, rex);
            } else {
                int i7 = i4 | 8;
                bsaj.f143854a = i7;
                bsaj.f143858e = -1;
                bsaj.f143854a = i7 | 16;
                bsaj.f143859f = -1;
            }
            if (f11265a.mo19637a(3)) {
                sek sek = f11265a;
                long j3 = ((bsaj) da.f164949b).f143858e;
                StringBuilder sb = new StringBuilder(43);
                sb.append("lastUnlockDurationInS: ");
                sb.append(j3);
                sek.mo25412b(sb.toString(), new Object[0]);
                sek sek2 = f11265a;
                long j4 = ((bsaj) da.f164949b).f143859f;
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("lockScreenSetupDurationInS: ");
                sb2.append(j4);
                sek2.mo25412b(sb2.toString(), new Object[0]);
            }
            bxvd da2 = brzw.f143793i.mo74144da();
            String hexString = Long.toHexString(spn.m35843a((Context) this));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            brzw brzw = (brzw) da2.f164949b;
            hexString.getClass();
            brzw.f143795a |= 1;
            brzw.f143796b = hexString;
            String str2 = Build.MODEL;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            brzw brzw2 = (brzw) da2.f164949b;
            str2.getClass();
            brzw2.f143795a |= 4;
            brzw2.f143798d = str2;
            String str3 = Build.DEVICE;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            brzw brzw3 = (brzw) da2.f164949b;
            str3.getClass();
            int i8 = brzw3.f143795a | 2;
            brzw3.f143795a = i8;
            brzw3.f143797c = str3;
            "201515033".getClass();
            brzw3.f143795a = i8 | 16;
            brzw3.f143800f = "201515033";
            String valueOf = String.valueOf(Build.VERSION.SDK_INT);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            brzw brzw4 = (brzw) da2.f164949b;
            valueOf.getClass();
            brzw4.f143795a |= 8;
            brzw4.f143799e = valueOf;
            bsaj bsaj4 = (bsaj) da.mo74062i();
            bsaj4.getClass();
            brzw4.f143802h = bsaj4;
            brzw4.f143795a |= 64;
            byte[] bytes = new JSONStringer().object().key("typ").value("navigator.id.getAssertion").key("challenge").value(sqd.m35972d(k)).key("source_device_signals").value(sqd.m35972d(((brzw) da2.mo74062i()).mo73642k())).endObject().toString().getBytes(bmwy.f131158c);
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
            grv a3 = grm.mo12135a(str);
            if (a3 == null) {
                sek sek3 = f11265a;
                String valueOf2 = String.valueOf(str);
                sek3.mo25418e(valueOf2.length() == 0 ? new String("Could not get secret for account: ") : "Could not get secret for account: ".concat(valueOf2), new Object[0]);
                l = null;
            } else {
                l = grn.mo12136a(a3);
                if (l == null) {
                    sek sek4 = f11265a;
                    String valueOf3 = String.valueOf(str);
                    sek4.mo25418e(valueOf3.length() == 0 ? new String("Could not get counter for account: ") : "Could not get counter for account: ".concat(valueOf3), new Object[0]);
                    l = null;
                }
            }
            if (l == null) {
                return null;
            }
            bxvd da3 = byrs.f167510d.mo74144da();
            bxtx a4 = bxtx.m123261a(digest);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            byrs byrs = (byrs) da3.f164949b;
            a4.getClass();
            byrs.f167512a |= 1;
            byrs.f167513b = a4;
            long longValue = l.longValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            byrs byrs2 = (byrs) da3.f164949b;
            byrs2.f167512a |= 2;
            byrs2.f167514c = longValue;
            byrs.m125228a(byrs2);
            Account account = new Account(str, "com.google");
            byte[] k2 = ((byrs) da3.mo74062i()).mo73642k();
            bysa bysa = bysa.GCMV1_IDENTITY_ASSERTION;
            bxvd da4 = byrv.f167517d.mo74144da();
            int i9 = bysa.f167549q;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            byrv byrv = (byrv) da4.f164949b;
            int i10 = i9 - 1;
            if (i9 != 0) {
                byrv.f167520b = i10;
                byrv.f167519a |= 1;
                byrv.m125232a(byrv);
                byte[] bArr = ((SignCryptedBlob) m6888a(this.f11281p.mo13184a("PublicKey", "authzen", account, new Payload(null, ((byrv) da4.mo74062i()).mo73642k(), k2)))).f10555c;
                bxvd da5 = brzo.f143767h.mo74144da();
                String str4 = brzs2.f143782b;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                brzo brzo = (brzo) da5.f164949b;
                str4.getClass();
                int i11 = brzo.f143769a | 1;
                brzo.f143769a = i11;
                brzo.f143770b = str4;
                bxtx bxtx = brzs2.f143784d;
                bxtx.getClass();
                int i12 = i11 | 16;
                brzo.f143769a = i12;
                brzo.f143774f = bxtx;
                bxtx bxtx2 = brzs2.f143785e;
                bxtx2.getClass();
                brzo.f143769a = i12 | 8;
                brzo.f143773e = bxtx2;
                bxtx a5 = bxtx.m123261a(bytes);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                brzo brzo2 = (brzo) da5.f164949b;
                a5.getClass();
                brzo2.f143769a = 2 | brzo2.f143769a;
                brzo2.f143771c = a5;
                bxtx a6 = bxtx.m123261a(bArr);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                brzo brzo3 = (brzo) da5.f164949b;
                a6.getClass();
                brzo3.f143769a |= 4;
                brzo3.f143772d = a6;
                return (brzo) da5.mo74062i();
            }
            throw null;
        } catch (InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException e2) {
            f11265a.mo25417e("Unexpected error.", e2, new Object[0]);
            return null;
        } catch (Throwable th) {
            Throwable th2 = th;
            skh.m35531a().mo25689a(this, rex);
            throw th2;
        }
    }

    /* renamed from: a */
    public final void mo7852a() {
        String string = getString(C0126R.string.auth_d2d_source_copy_notice);
        if (!this.f11270e) {
            if (this.f11268c.isEnabled()) {
                String valueOf = String.valueOf(string);
                String string2 = getString(C0126R.string.auth_d2d_source_no_lock_bt_on_notice);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string2).length());
                sb.append(valueOf);
                sb.append(" ");
                sb.append(string2);
                string = sb.toString();
            } else {
                String valueOf2 = String.valueOf(string);
                String string3 = getString(C0126R.string.auth_d2d_source_no_lock_bt_off_notice);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(string3).length());
                sb2.append(valueOf2);
                sb2.append(" ");
                sb2.append(string3);
                string = sb2.toString();
            }
        }
        if (this.f11271f && !this.f11268c.isEnabled()) {
            mo7854b();
        }
        m6889a(new AlertDialog.Builder(this).setTitle((int) C0126R.string.auth_d2d_tap_and_go).setMessage(string).setCancelable(false).setPositiveButton(17039370, new juf(this)).setNegativeButton(17039360, new jue()).setOnCancelListener(new jud(this)).create());
    }

    /* renamed from: a */
    public final void mo7853a(int i) {
        mo7856d();
        runOnUiThread(new juc(this, i));
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        if (!this.f11273h) {
            int i = Build.VERSION.SDK_INT;
            this.f11273h = true;
            int i2 = connectionResult.f30065c;
            juk juk = new juk();
            Bundle bundle = new Bundle();
            bundle.putInt("error_dialog_code", i2);
            juk.setArguments(bundle);
            juk.show(getContainerActivity().getFragmentManager(), "error_dialog");
        }
    }
}
