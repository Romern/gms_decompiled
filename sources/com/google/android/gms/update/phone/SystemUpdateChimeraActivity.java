package com.google.android.gms.update.phone;

import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemUpdateChimeraActivity extends FragmentActivity implements LoaderManager.LoaderCallbacks, avqg, aubw, avsg, avrl {

    /* renamed from: a */
    public static final sek f109513a = avpq.m79022i("SystemUpdateChimeraActivity");

    /* renamed from: c */
    private static final bnic f109514c = bnic.m109494a(3, 5, 6, 19, 8, 9, 4);

    /* renamed from: b */
    public boolean f109515b;

    /* renamed from: d */
    private final avqy f109516d = new avqy(this);

    /* renamed from: e */
    private avrk f109517e = avrm.m79079a(-1, 1);

    /* renamed from: f */
    private long f109518f = 0;

    /* renamed from: g */
    private Bundle f109519g = new Bundle();

    /* renamed from: h */
    private bnic f109520h = bnon.f131923a;

    /* renamed from: i */
    private bmxv f109521i = bmvz.f131120a;

    /* renamed from: j */
    private bmxv f109522j = bmvz.f131120a;

    /* renamed from: k */
    private bmxv f109523k = bmvz.f131120a;

    /* renamed from: l */
    private bmxv f109524l = bmvz.f131120a;

    /* renamed from: m */
    private bmxv f109525m = bmvz.f131120a;

    /* renamed from: n */
    private final avki f109526n = new avki(this);

    /* renamed from: a */
    private final void m93727a(BiometricPrompt.AuthenticationCallback authenticationCallback) {
        if (!ssw.m36269a()) {
            f109513a.mo25416d("Unexpected usage of device credential prompt on unsupported device.", new Object[0]);
        } else {
            new BiometricPrompt.Builder(this).setAllowedAuthenticators(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT).setConfirmationRequired(false).setTitle(getString(C0126R.string.system_update_resume_on_reboot_confirm_screen_lock_title)).build().authenticate(new CancellationSignal(), C1133kh.m17846d(this), authenticationCallback);
        }
    }

    /* renamed from: b */
    private final void m93728b(int i) {
        Toast makeText = Toast.makeText(this, i, 1);
        makeText.setGravity(17, makeText.getXOffset(), makeText.getYOffset());
        makeText.show();
    }

    /* renamed from: c */
    private final void m93729c(int i) {
        if (this.f109520h.contains(Integer.valueOf(i)) && this.f109524l.mo66813a() && this.f109525m.mo66813a()) {
            bxvd da = bohu.f133155d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bohu bohu = (bohu) da.f164949b;
            bohu.f133157a |= 1;
            bohu.f133158b = i;
            String str = (String) this.f109525m.mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bohu bohu2 = (bohu) da.f164949b;
            str.getClass();
            bohu2.f133157a |= 2;
            bohu2.f133159c = str;
            ((avpp) this.f109524l.mo66814b()).mo51480a((bohu) da.mo74062i());
        }
    }

    /* renamed from: w */
    private static bnic m93731w() {
        bnia j = bnic.m109500j();
        for (String str : bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) cfsg.m142818e())) {
            try {
                j.mo67629b(Integer.valueOf(str));
            } catch (NumberFormatException e) {
                f109513a.mo25416d("Failed to parse Ui event code: %s.", str);
            }
        }
        return j.mo67751a();
    }

    /* renamed from: d */
    public final void mo51537d() {
        getSupportLoaderManager().restartLoader(1, new Bundle(), this);
    }

    /* renamed from: e */
    public final void mo51538e() {
        getSupportLoaderManager().restartLoader(2, new Bundle(), this);
    }

    /* renamed from: f */
    public final void mo51539f() {
        startActivityForResult(new Intent().setAction("android.os.storage.action.MANAGE_STORAGE"), 1);
    }

    /* renamed from: g */
    public final avlf mo51540g() {
        if (this.f109522j.mo66813a()) {
            return (avlf) this.f109522j.mo66814b();
        }
        bmxv b = bmxv.m108566b(avko.m78681a(this));
        this.f109522j = b;
        return (avlf) b.mo66814b();
    }

    /* renamed from: h */
    public final bmxv mo51541h() {
        return bmxv.m108567c((avsf) getSupportFragmentManager().findFragmentByTag("layout_fragment"));
    }

    /* renamed from: i */
    public final bmxv mo51542i() {
        return this.f109521i;
    }

    /* renamed from: j */
    public final long mo51543j() {
        return this.f109518f;
    }

    /* renamed from: k */
    public final boolean mo51544k() {
        return getSupportLoaderManager().getLoader(1) != null;
    }

    /* renamed from: l */
    public final boolean mo51545l() {
        return getSupportLoaderManager().getLoader(2) != null;
    }

    /* renamed from: m */
    public final boolean mo51546m() {
        return bizc.m103025a(getIntent()) && !TextUtils.isEmpty((CharSequence) avma.f93361g.mo51364a());
    }

    /* renamed from: o */
    public final void mo51548o() {
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.f109517e.mo51533a(7, this);
            if (this.f109525m != null) {
                this.f109520h = m93731w();
                m93729c(7);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        avsf avsf;
        super.onCreate(bundle);
        f109513a.mo25409a("onCreate", new Object[0]);
        this.f109524l = bmxv.m108566b(avpp.m79008a(this));
        boolean a = bjba.m103134a(getIntent().getStringExtra("theme"));
        if (m93730v() != 5) {
            int i = Build.VERSION.SDK_INT;
            if (a) {
                setTheme(2132019938);
            } else {
                setTheme(C0126R.style.systemUpdateActivitySudTheme);
            }
        } else if (!a) {
            setTheme(bjbc.m103136a().mo64967a("glif_v3", bizc.m103025a(getIntent())));
        } else {
            setTheme(bjbc.m103136a().mo64967a("glif_v3_light", bizc.m103025a(getIntent())));
        }
        setContentView((int) C0126R.C0128layout.system_update_activity_container);
        int v = m93730v();
        if (v == 1) {
            avsf = new avsk();
        } else if (v == 2) {
            avsf = new avsn();
        } else if (v == 4) {
            avsf = new avsm();
        } else if (v != 5) {
            avsf = new avsl();
        } else {
            avsf = new avsj();
        }
        f109513a.mo25409a("Load layout with type=%d, isSetupWizard=%s, isLightTheme=%s.", Integer.valueOf(avsf.mo51563d()), Boolean.valueOf(mo51546m()), Boolean.valueOf(a));
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.layout_container, avsf, "layout_fragment").commitNow();
        if (mo51544k()) {
            getSupportLoaderManager().initLoader(1, new Bundle(), this);
        }
        if (mo51545l()) {
            getSupportLoaderManager().initLoader(2, new Bundle(), this);
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 1) {
            return new avtp(getApplicationContext());
        }
        if (i == 2) {
            return new avtq(getApplicationContext());
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Long l = (Long) obj;
        if (l != null && l.longValue() >= 0) {
            this.f109518f = l.longValue();
        }
        if (loader.getId() == 1) {
            mo59678a(5);
            getSupportLoaderManager().destroyLoader(1);
        } else if (loader.getId() == 2) {
            if (l == null || l.longValue() < 0) {
                mo59678a(19);
            } else {
                mo59678a(6);
            }
            getSupportLoaderManager().destroyLoader(2);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onPause() {
        mo59678a(2);
        mo51540g().mo24698a(roe.m34171a(this.f109526n, avkj.class.getSimpleName()));
        mo51540g().mo51342a(new ActivityStatus(false, mo51546m()));
        f109513a.mo25409a("onPause", new Object[0]);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("controllerInstanceState");
        this.f109519g = bundle2;
        if (bundle2 == null) {
            this.f109519g = new Bundle();
        }
    }

    public final void onResume() {
        super.onResume();
        f109513a.mo25409a("onResume", new Object[0]);
        if (!avma.m78773a(this)) {
            f109513a.mo25414c("Attempting to manage ota on non-owner profile. Finish immediately.", new Object[0]);
            m93728b((int) C0126R.string.system_update_not_owner_text);
            finish();
            return;
        }
        if (mo51541h().mo66813a()) {
            ((avsf) mo51541h().mo66814b()).mo51560c();
        }
        this.f109520h = m93731w();
        this.f109515b = false;
        this.f109525m = bmxv.m108566b(String.valueOf(SystemClock.elapsedRealtime()));
        this.f109523k = bmxv.m108566b(new avqi(SystemClock.uptimeMillis() + 400, this));
        this.f109521i = bmvz.f131120a;
        int i = 1;
        mo51540g().mo51342a(new ActivityStatus(true, mo51546m()));
        avlf g = mo51540g();
        avki avki = this.f109526n;
        rod a = roe.m34172a(avki, g.f43163B, avkj.class.getSimpleName());
        rob rob = a.f43429b;
        sdo.m34966a(rob, "Key must not be null");
        g.mo24699a(new avlc(a, avki), new avld(rob, avki));
        mo51540g().mo51341a().mo50373a(this);
        if (getIntent().getBooleanExtra("triggered_by_notification", false)) {
            i = 13;
        }
        mo59678a(i);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("controllerInstanceState", this.f109519g);
    }

    /* renamed from: p */
    public final Bundle mo51549p() {
        return this.f109519g;
    }

    /* renamed from: q */
    public final void mo51550q() {
        startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }

    /* renamed from: r */
    public final void mo51551r() {
        mo51540g().mo51345b().mo50371a(this.f109516d);
    }

    /* renamed from: s */
    public final void mo51552s() {
        if (!ssw.m36269a()) {
            f109513a.mo25416d("Unexpected usage of device credential prompt on unsupported device.", new Object[0]);
        } else {
            m93727a((BiometricPrompt.AuthenticationCallback) new avri(this));
        }
    }

    /* renamed from: t */
    public final void mo51553t() {
        if (!ssw.m36269a()) {
            f109513a.mo25416d("Unexpected usage of device credential prompt on unsupported device.", new Object[0]);
        } else {
            m93727a((BiometricPrompt.AuthenticationCallback) new avre(this));
        }
    }

    /* renamed from: u */
    public final void mo51554u() {
        Bundle bundle = new Bundle();
        bundle.putInt("message_key", C0126R.string.system_update_mobile_data_warning_dialog_message);
        bundle.putInt("positive_button_text_key", C0126R.string.common_continue);
        bundle.putInt("negative_button_text_key", C0126R.string.common_cancel);
        avqw avqw = new avqw();
        avqw.setArguments(bundle);
        avqw.setCancelable(true);
        avqw.show(getSupportFragmentManager(), "alert_dialog");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: v */
    private final int m93730v() {
        char c;
        String stringExtra = getIntent().getStringExtra("theme");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = SystemProperties.get("setupwizard.theme");
        }
        switch (stringExtra.hashCode()) {
            case -2128555920:
                if (stringExtra.equals("glif_v2_light")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1241052239:
                if (stringExtra.equals("glif_v3_light")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 115650329:
                if (stringExtra.equals("glif_v2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 115650330:
                if (stringExtra.equals("glif_v3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if ((c == 0 || c == 1 || c == 2 || c == 3) && cfsa.f185540a.mo6606a().mo82591a()) {
            return 5;
        }
        int i = Build.VERSION.SDK_INT;
        return 1;
    }

    /* renamed from: n */
    public final int mo51547n() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        if (allNetworks != null) {
            for (Network network : allNetworks) {
                if (connectivityManager.getNetworkCapabilities(network).hasCapability(12)) {
                    int i2 = Build.VERSION.SDK_INT;
                    Network activeNetwork = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetwork();
                    if (activeNetwork == null) {
                        return 0;
                    }
                    avqa a = avqa.m79037a(activeNetwork, this);
                    if (a.mo51489b(this)) {
                        return !a.mo51488a(this) ? 2 : 3;
                    }
                    return 1;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo51577b() {
        mo59678a(9);
    }

    /* renamed from: b */
    public final void mo51536b(String str) {
        ((PowerManager) getSystemService("power")).reboot(str);
    }

    /* renamed from: a */
    public final void mo51576a() {
        mo59678a(8);
    }

    /* renamed from: a */
    public final void mo59678a(int i) {
        if (!f109514c.contains(Integer.valueOf(i)) || !this.f109523k.mo66813a()) {
            this.f109517e.mo51533a(i, this);
        } else {
            Message obtain = Message.obtain();
            obtain.what = i;
            avqi avqi = (avqi) this.f109523k.mo66814b();
            sdo.m34967a("enqueue() is supposed to run in the main thread.");
            avqi.f93784b.add(obtain);
            if (SystemClock.uptimeMillis() > avqi.f93786d) {
                avqi.mo51502a();
            } else if (!avqi.f93785c.hasMessages(1)) {
                Handler handler = avqi.f93785c;
                handler.sendMessageAtTime(Message.obtain(handler, 1), avqi.f93786d);
            }
        }
        m93729c(i);
    }

    /* renamed from: c */
    public final void mo51578c() {
        mo59678a(14);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, bmxz]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public final void mo51500a(bngx bngx) {
        ArrayList arrayList = new ArrayList(bngx);
        if (bnjd.m109592c((Iterable) arrayList, avqs.f93802a)) {
            this.f109517e.mo51533a(3, this);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Message message = (Message) arrayList.get(i);
            if (message.what != 3) {
                this.f109517e.mo51533a(message.what, this);
            }
        }
    }

    /* renamed from: a */
    public final void mo59679a(SystemUpdateStatus systemUpdateStatus) {
        sdo.m34967a("refreshStatus() is supposed to run in the main thread.");
        if (avmb.m78775a(this, systemUpdateStatus.f109472n).f93369a != 0) {
            f109513a.mo25414c("OTA is being managed by local OTA policy. Finish immediately.", new Object[0]);
            m93728b((int) C0126R.string.system_update_managed_by_policy);
            finish();
        } else if (mo51541h().mo66813a()) {
            avsf avsf = (avsf) mo51541h().mo66814b();
            this.f109517e = avrm.m79079a(systemUpdateStatus.f109461c, avsf.mo51563d());
            if (this.f109521i.mo66813a()) {
                SystemUpdateStatus systemUpdateStatus2 = (SystemUpdateStatus) this.f109521i.mo66814b();
                if (systemUpdateStatus2.f109461c == systemUpdateStatus.f109461c && systemUpdateStatus2.f109484z == systemUpdateStatus.f109484z && systemUpdateStatus2.f109458A == systemUpdateStatus.f109458A) {
                    if (((SystemUpdateStatus) this.f109521i.mo66814b()).f109464f != systemUpdateStatus.f109464f) {
                        f109513a.mo25414c("Progress update: progress=%f.", Double.valueOf(systemUpdateStatus.f109464f));
                        this.f109521i = bmxv.m108566b(systemUpdateStatus);
                        mo59678a(4);
                        return;
                    }
                    return;
                }
            }
            f109513a.mo25414c("Status change: status=0x%03X, isSetupWizard=%s.", Integer.valueOf(systemUpdateStatus.f109461c), Boolean.valueOf(mo51546m()));
            this.f109521i = bmxv.m108566b(systemUpdateStatus);
            mo59678a(3);
            CharSequence text = avsf.mo51569h().getText();
            int i = Build.VERSION.SDK_INT;
            avsf.mo51565e().announceForAccessibility(text);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) obj;
        if (!this.f109515b) {
            mo59679a(systemUpdateStatus);
        }
    }

    /* renamed from: a */
    public final void mo51535a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (parseUri.resolveActivity(getPackageManager()) == null) {
                sek sek = f109513a;
                String valueOf = String.valueOf(str);
                sek.mo25416d(valueOf.length() == 0 ? new String("No activity is able to handle the uri: ") : "No activity is able to handle the uri: ".concat(valueOf), new Object[0]);
                return;
            }
            startActivity(parseUri);
        } catch (URISyntaxException e) {
            sek sek2 = f109513a;
            String valueOf2 = String.valueOf(str);
            sek2.mo25418e(valueOf2.length() == 0 ? new String("Invalid url syntax: ") : "Invalid url syntax: ".concat(valueOf2), new Object[0]);
        }
    }
}
