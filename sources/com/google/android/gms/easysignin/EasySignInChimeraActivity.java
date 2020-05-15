package com.google.android.gms.easysignin;

import android.accounts.Account;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EasySignInChimeraActivity extends Activity {

    /* renamed from: g */
    private static final sek f31255g = new sek("EasySignIn", "EasySignInActivity");

    /* renamed from: a */
    wbl f31256a;

    /* renamed from: b */
    public bycs f31257b;

    /* renamed from: c */
    public wbm f31258c;

    /* renamed from: d */
    public wdn f31259d;

    /* renamed from: e */
    public Account[] f31260e;

    /* renamed from: f */
    public bxvd f31261f;

    /* renamed from: h */
    private final wbk f31262h;

    public EasySignInChimeraActivity() {
        this.f31262h = new wbe();
    }

    public final void finish() {
        this.f31256a.mo29025c();
        super.finish();
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        wbk wbk = this.f31262h;
        wbk.mo29021a(this);
        wbk.mo29020a(extras);
        wbl a = wbk.mo29019a();
        this.f31256a = a;
        a.mo29023a(this);
        if (this.f31257b.f165689h.equals("com.google.android.gms") || !this.f31259d.mo29048a()) {
            f31255g.mo25420f("Cannot redirect", new Object[0]);
            super.onCreate(bundle);
            finish();
            return;
        }
        if (cdrw.f181623a.mo6606a().mo78230a()) {
            bycs bycs = this.f31257b;
            if (bycs.f165684c) {
                int i = bycs.f165682a;
                if (((i & 128) == 0 || this.f31260e.length >= bycs.f165691j) && ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.f31260e.length <= bycs.f165692k)) {
                    setTheme(this.f31256a.mo29022a());
                    super.onCreate(bundle);
                    try {
                        this.f31256a.mo29024b();
                        bqga.m112781a(new wbh(this.f31258c.f50444a).f50387a.mo75201b(), new wbj(this), bqfb.INSTANCE);
                        return;
                    } catch (Exception e) {
                        Log.wtf(f31255g.f44092a, e);
                        bxvd bxvd = this.f31261f;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((bydg) bxvd.f164949b).f165788h = true;
                        this.f31259d.mo29049b();
                        return;
                    }
                }
            }
        }
        super.onCreate(bundle);
        this.f31259d.mo29049b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f31256a.mo29026d();
    }

    EasySignInChimeraActivity(wbk wbk) {
        this.f31262h = wbk;
    }
}
