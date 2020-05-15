package com.google.android.gms.auth.uiflows.addaccount;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreAddAccountChimeraActivity extends jxf implements LoaderManager.LoaderCallbacks, ivx {

    /* renamed from: a */
    public static final sek f11420a = ght.m13171a("AddAccount", "PreAddAccountActivity");

    /* renamed from: b */
    public static final imr f11421b = imr.m15727a("is_frp_required");

    /* renamed from: c */
    public static final imr f11422c = imr.m15727a("is_setup_wizard");

    /* renamed from: d */
    public static aney f11423d;

    /* renamed from: e */
    public jwm f11424e;

    /* renamed from: f */
    jwl f11425f = new jwl(this);

    /* renamed from: g */
    Runnable f11426g = new jwd(this);

    /* renamed from: p */
    private Handler f11427p;

    /* renamed from: q */
    private final List f11428q = new ArrayList();

    /* renamed from: r */
    private final aubg f11429r = new jwc(this);

    /* renamed from: a */
    public static Intent m6987a(Context context, boolean z, rrq rrq, boolean z2) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.PreAddAccountActivity");
        ims a = jxf.m17460a(rrq, z, (int) C0126R.string.auth_gls_name_checking_info_title);
        a.mo13148b(f11422c, Boolean.valueOf(z2));
        return className.putExtras(a.f21367a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "PreAddAccountActivity";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public final void mo7716ba() {
        if (gkf.f18388a.mo11981b(this)) {
            gkf.f18388a.mo11979a(this, null);
        } else {
            super.mo7716ba();
        }
    }

    /* renamed from: c */
    public final void mo7860c() {
        FrpSnapshot frpSnapshot = this.f11424e.f23408c;
        if (adyd.m51363a(this).mo33916a("com.google").length > 0 || !frpSnapshot.f10950d || !gnv.m13508R()) {
            int i = Build.VERSION.SDK_INT;
            if (!((KeyguardManager) getSystemService("keyguard")).isKeyguardSecure()) {
                this.f11424e.mo14173b(true);
            } else {
                startActivityForResult(new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL"), 1);
            }
        } else {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence text = getResources().getText(C0126R.string.auth_frp_preadd_lkscreen_fwd);
            cbyu.m128929c();
            Intent a = new jwk((KeyguardManager) getSystemService("keyguard"), text).mo14167a();
            if (a != null) {
                bizc.m103024a(getIntent(), a);
                startActivityForResult(a, 2);
            } else if (ccbg.f178714a.mo6606a().mo75741a()) {
                this.f11425f.mo14168a(2);
            } else {
                this.f11424e.mo14173b(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    sek sek = f11420a;
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unrecognized request code: ");
                    sb.append(i);
                    sek.mo25416d(sb.toString(), new Object[0]);
                } else if (i2 == -1) {
                    this.f11424e.mo14173b(true);
                } else if (i2 == 1) {
                    mo7860c();
                } else if (i2 != 111) {
                    this.f11424e.mo14173b(false);
                } else {
                    jwm jwm = this.f11424e;
                    jwm.f23409d = true;
                    jwm.mo14172b();
                }
            } else if (i2 == -1) {
                mo7873a(5);
                this.f11425f.mo14168a(2);
            } else if (i2 != 1) {
                mo7873a(3);
                this.f11424e.mo14173b(false);
            } else {
                mo7873a(4);
                this.f11424e.mo14173b(true);
            }
        } else if (i2 == -1) {
            this.f11424e.mo14170a(FrpSnapshot.m6646b());
            this.f11424e.mo14173b(true);
        } else {
            this.f11424e.mo14173b(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.containsKey(jxf.f23442h.f21366a)) {
            intent.putExtra(jxf.f23442h.f21366a, (int) C0126R.string.auth_gls_name_checking_info_title);
        }
        super.onCreate(bundle);
        this.f11427p = new adzt(Looper.getMainLooper());
        f11423d = anef.m64090a((Activity) this);
        jwm jwm = new jwm(bundle, this.f11426g);
        this.f11424e = jwm;
        if (jwm.f23410e == null) {
            jwm.f23410e = Long.valueOf(System.currentTimeMillis());
        }
        if (!getIntent().getBooleanExtra(f11422c.f21366a, false) || !gnv.m13552ay()) {
            this.f11424e.mo14169a();
        } else {
            jwm jwm2 = this.f11424e;
            long currentTimeMillis = System.currentTimeMillis();
            aucu.m76786b(mo7872a("com.google.android.gms.auth_account", new String[]{"ANDROID_AUTH"}, "Failed syncing auth configuration"), mo7872a("com.google.android.gms.smartdevice", new String[]{"SMART_DEVICE"}, "Failed syncing smartdevice configuration"), mo7872a("com.google.android.gms.enterprise", new String[0], "Failed syncing enterprise configuration")).mo50371a(new jwf(jwm2, currentTimeMillis));
        }
        if (gkf.f18388a.mo11981b(this)) {
            gkf.f18388a.mo11978a((jwz) this);
        }
        this.f11425f.mo14168a(1);
        if (ccau.f178701a.mo6606a().mo75733b()) {
            qco a = qco.m31854a((Context) this);
            if (spn.m35843a((Context) this) != 0) {
                this.f11424e.mo14171a(true);
                return;
            }
            qcw qcw = new qcw(this, this);
            qcw.mo23921b();
            aucb a2 = rrc.m34283a(a.mo23912a(qcw.mo23920a()), ccau.f178701a.mo6606a().mo75732a(), TimeUnit.MILLISECONDS);
            a2.mo50373a(new jwh(this));
            a2.mo50372a(new jwg(this));
            return;
        }
        this.f11425f.mo14168a(0);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Loader loader;
        if (i == 0) {
            loader = new jvm(this);
        } else if (i != 1) {
            loader = i != 2 ? null : new jwj(this, this, cbxl.m128846b());
        } else {
            loader = new jwi(this, this, cbxl.m128846b());
        }
        if (loader != null) {
            this.f11428q.add(loader);
        }
        return loader;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        long j;
        Bundle bundle = (Bundle) obj;
        int id = loader.getId();
        if (id == 0) {
            this.f11424e.mo14171a(bundle.getBoolean("checkin_loader_result", false));
        } else if (id == 1) {
            FrpSnapshot frpSnapshot = (FrpSnapshot) sef.m35069a(bundle.getByteArray("loader_result_frp"), FrpSnapshot.CREATOR);
            this.f11424e.mo14170a(frpSnapshot);
            if (!frpSnapshot.f10948b || !frpSnapshot.f10949c) {
                this.f11424e.mo14173b(true);
            } else if (!this.f11424e.f23412g) {
                long currentTimeMillis = System.currentTimeMillis() - this.f11424e.f23410e.longValue();
                Handler handler = this.f11427p;
                jwb jwb = new jwb(this, frpSnapshot);
                if (currentTimeMillis < gnv.m13551ax()) {
                    j = gnv.m13551ax() - currentTimeMillis;
                } else {
                    j = 0;
                }
                handler.postDelayed(jwb, j);
            }
        } else if (id != 2) {
            f11420a.mo25420f("Unrecognized LoaderId!!!", new Object[0]);
        } else {
            if (!bundle.getBoolean("loader_result_certified", false)) {
                f11420a.mo25416d("Failed to clear FRP result. Just means that device is still FRP'd.", new Object[0]);
            }
            this.f11424e.mo14170a(FrpSnapshot.m6646b());
            this.f11424e.mo14173b(true);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        jwm jwm = this.f11424e;
        Long l = jwm.f23410e;
        if (l != null) {
            bundle.putLong("state.create_time", l.longValue());
        }
        Boolean bool = jwm.f23406a;
        if (bool != null) {
            bundle.putBoolean("state.checkin_result", bool.booleanValue());
        }
        Boolean bool2 = jwm.f23407b;
        if (bool2 != null) {
            bundle.putBoolean("state.challenge_result", bool2.booleanValue());
        }
        FrpSnapshot frpSnapshot = jwm.f23408c;
        if (frpSnapshot != null) {
            bundle.putByteArray("state.frp_snapshot", sef.m35074a(frpSnapshot));
        }
        bundle.putBoolean("state.is_fre_unlocked", jwm.f23409d);
        bundle.putBoolean("state.phenotype_sync", jwm.f23411f);
        bundle.putBoolean("state.is_challenge_started", jwm.f23412g);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        List list = this.f11428q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Loader) list.get(i)).cancelLoad();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aucb mo7872a(String str, String[] strArr, String str2) {
        aucb a = rrc.m34283a(f11423d.mo41758a(str, 201515033, strArr, null, "").mo50382b(this.f11429r), ccaf.f178620a.mo6606a().mo75657b(), TimeUnit.MILLISECONDS);
        a.mo50372a(new jvz(str2));
        if (srk.m36121a(cbyq.f178564a.mo6606a().mo75615a())) {
            a.mo50373a(new jwa(this, str));
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7873a(int i) {
        boolean z;
        if (gnv.m13550aw()) {
            bxvd da = bodh.f132682k.mo74144da();
            if ((((boct) mo14206j().f164949b).f132610a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                bodh bodh = ((boct) mo14206j().f164949b).f132624o;
                if (bodh == null) {
                    bodh = bodh.f132682k;
                }
                bxvd bxvd = (bxvd) bodh.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bodh);
                da = bxvd;
            }
            bxvd da2 = bocr.f132595c.mo74144da();
            bodh bodh2 = (bodh) da.f164949b;
            if ((bodh2.f132684a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                bocr bocr = bodh2.f132693j;
                if (bocr == null) {
                    bocr = bocr.f132595c;
                }
                bxvd bxvd2 = (bxvd) bocr.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bocr);
                da2 = bxvd2;
            }
            bxvd da3 = boer.f132825d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            boer boer = (boer) da3.f164949b;
            boer.f132829c = i - 1;
            int i2 = boer.f132827a | 2;
            boer.f132827a = i2;
            if (i == 5) {
                z = true;
            } else {
                z = false;
            }
            boer.f132827a = i2 | 1;
            boer.f132828b = z;
            boer boer2 = (boer) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bocr bocr2 = (bocr) da2.f164949b;
            boer2.getClass();
            bocr2.f132598b = boer2;
            bocr2.f132597a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodh bodh3 = (bodh) da.f164949b;
            bocr bocr3 = (bocr) da2.mo74062i();
            bocr3.getClass();
            bodh3.f132693j = bocr3;
            bodh3.f132684a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bxvd j = mo14206j();
            bodh bodh4 = (bodh) da.mo74062i();
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            boct boct = (boct) j.f164949b;
            boct boct2 = boct.f132600I;
            bodh4.getClass();
            boct.f132624o = bodh4;
            boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        }
    }

    /* renamed from: a */
    public final void mo7874a(int i, Intent intent) {
        long currentTimeMillis = System.currentTimeMillis() - this.f11424e.f23410e.longValue();
        if (currentTimeMillis < gnv.m13551ax()) {
            this.f11427p.postDelayed(new jwe(this, i, intent), gnv.m13551ax() - currentTimeMillis);
        } else {
            super.mo7874a(i, intent);
        }
    }

    /* renamed from: a */
    public final void mo7875a(Intent intent) {
        if (intent != null || cdsb.f181631a.mo6606a().mo78236b()) {
            mo7874a(3, intent);
        } else {
            mo7876a(true);
        }
    }

    /* renamed from: a */
    public final void mo7876a(boolean z) {
        ims ims = new ims();
        jwm jwm = this.f11424e;
        qws qws = null;
        if (jwm.f23409d) {
            mo7874a(111, null);
        } else if (!jwm.f23406a.booleanValue() || !this.f11424e.f23407b.booleanValue()) {
            if (!this.f11424e.f23407b.booleanValue()) {
                ims.mo13148b(AddAccountController.f11314a, true);
                mo7874a(0, new Intent().putExtras(ims.f21367a));
                return;
            }
            mo7874a(2, null);
        } else if (cdsb.m134797c() && cdsb.m134801g() && !z) {
            if (ivw.f21897a == null) {
                if (!TextUtils.isEmpty(cdsb.m134800f())) {
                    qws = new qws(this, cdsb.m134800f(), null);
                }
                ivw.f21897a = new iwb(new wdx(this), new ivv(ModuleManager.get(this)), qws);
            }
            ivw.f21897a.mo13379a(this);
        } else {
            ims.mo13148b(f11421b, Boolean.valueOf(this.f11424e.f23408c.f10949c));
            mo7874a(-1, new Intent().putExtras(ims.f21367a));
        }
    }
}
