package com.google.android.gms.udc.p077ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.udc.ConsentCancelReason;
import com.google.android.gms.udc.ConsentFlowConfig;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.udc.ui.UdcConsentChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcConsentChimeraActivity extends FragmentActivity implements avhy, avhm, avhx, avho {

    /* renamed from: a */
    public static final srn f109402a = srn.m36124a();

    /* renamed from: b */
    public String f109403b;

    /* renamed from: c */
    public ConsentFlowConfig f109404c;

    /* renamed from: d */
    public bxrt f109405d;

    /* renamed from: e */
    public bxru f109406e;

    /* renamed from: f */
    public Intent f109407f;

    /* renamed from: g */
    public bxsu f109408g;

    /* renamed from: h */
    public avii f109409h = new avii(this);

    /* renamed from: i */
    public ArrayList f109410i;

    /* renamed from: j */
    public ArrayList f109411j;

    /* renamed from: k */
    public boolean f109412k;

    /* renamed from: l */
    public avjn f109413l;

    /* renamed from: m */
    public int f109414m = 0;

    /* renamed from: n */
    public boolean f109415n;

    /* renamed from: o */
    public int f109416o;

    /* renamed from: p */
    private avht f109417p;

    /* renamed from: q */
    private avhu f109418q;

    /* renamed from: a */
    protected static ConsentFlowConfig m93679a(bxrl bxrl, ConsentFlowConfig consentFlowConfig) {
        bxrk bxrk;
        if (bxrl == null) {
            return consentFlowConfig;
        }
        auzl auzl = new auzl(consentFlowConfig);
        bxrk bxrk2 = bxrk.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
        bxrk a = bxrk.m123035a(bxrl.f164573b);
        if (a == null) {
            a = bxrk.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
        }
        bxrk bxrk3 = null;
        switch (a.ordinal()) {
            case 1:
                auzl.mo51079b(0);
                break;
            case 2:
                auzl.mo51079b(2);
                break;
            case 3:
                auzl.mo51079b(1);
                break;
            case 4:
                auzl.mo51079b(3);
                break;
            case 5:
                auzl.mo51079b(4);
                break;
            case 6:
                auzl.mo51079b(5);
                break;
            case 7:
                auzl.mo51079b(6);
                break;
            default:
                bnsl bnsl = (bnsl) f109402a.mo68388c();
                bnsl.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                if ((bxrl.f164572a & 1) != 0) {
                    bxrk = bxrk.m123035a(bxrl.f164573b);
                    if (bxrk == null) {
                        bxrk = bxrk.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
                    }
                } else {
                    bxrk = null;
                }
                bnsl.mo68420a("Unknown layout ID overwrite: %s", bxrk);
                break;
        }
        int a2 = bxri.m123033a(bxrl.f164574c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            auzl.mo51078a(0);
        } else if (i != 2) {
            bnsl bnsl2 = (bnsl) f109402a.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            if ((bxrl.f164572a & 1) != 0 && (bxrk3 = bxrk.m123035a(bxrl.f164573b)) == null) {
                bxrk3 = bxrk.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
            }
            bnsl2.mo68420a("Unknown button placement overwrite: %s", bxrk3);
        } else {
            auzl.mo51078a(1);
        }
        return auzl.f92832a;
    }

    /* renamed from: b */
    public final int mo51239b() {
        return this.f109414m;
    }

    /* renamed from: c */
    public final void mo51249c() {
        m93680a(2);
        finish();
    }

    public final void onBackPressed() {
        avjn avjn = this.f109413l;
        if (avjn == null) {
            bnsl bnsl = (bnsl) f109402a.mo68387b();
            bnsl.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "onBackPressed", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("UdcClearcutLogger is null.");
        } else {
            avjn.mo51292a(29008, this.f109414m);
        }
        m93680a(1);
        super.onBackPressed();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (configuration.orientation != this.f109416o) {
            int i = configuration.orientation;
            this.f109416o = i;
            avjn avjn = this.f109413l;
            if (avjn == null) {
                bnsl bnsl = (bnsl) f109402a.mo68387b();
                bnsl.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "onConfigurationChanged", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("UdcClearcutLogger is null.");
            } else {
                int i2 = this.f109414m;
                bxvd da = bspq.f146567d.mo74144da();
                bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
                bsmt bsmt = bsmt.UDC_MOBILE;
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bspp bspp = (bspp) bxvf.f164949b;
                bspp.f146556b = bsmt.f145305dO;
                int i3 = bspp.f146555a | 1;
                bspp.f146555a = i3;
                bspp.f146557c = 29014;
                int i4 = 2;
                int i5 = i3 | 2;
                bspp.f146555a = i5;
                int i6 = i5 | 16;
                bspp.f146555a = i6;
                bspp.f146560f = false;
                if (i == 1) {
                    i4 = 3;
                } else if (i != 2) {
                    i4 = 1;
                }
                bspp.f146555a = i6 | 8;
                bspp.f146559e = i4 - 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bspq bspq = (bspq) da.f164949b;
                bspp bspp2 = (bspp) bxvf.mo74062i();
                bspp2.getClass();
                bspq.f146570b = bspp2;
                bspq.f146569a |= 1;
                avjn.mo51295a((bspq) da.mo74062i(), i2);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r0.f109336f == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        getContainerActivity().requestWindowFeature(1);
        getContainerActivity().getWindow().setType(3);
        r0 = getContainerActivity().getWindow().getDecorView();
        r0.getViewTreeObserver().addOnGlobalLayoutListener(new p000.avhs(r1, r0));
     */
    public final void onCreate(Bundle bundle) {
        ConsentFlowConfig consentFlowConfig;
        Bundle bundle2 = bundle;
        Intent intent = getIntent();
        if (intent.hasExtra("UdcConsentFlowConfigBundle")) {
            consentFlowConfig = (ConsentFlowConfig) intent.getBundleExtra("UdcConsentFlowConfigBundle").getParcelable("UdcConsentFlowConfig");
            if (intent.hasExtra("UdcLayoutOverwrites")) {
                consentFlowConfig = m93679a((bxrl) avih.m78570a(intent, "UdcLayoutOverwrites", (bxxk) bxrl.f164570d.mo74142c(7)), consentFlowConfig);
            }
        } else {
            consentFlowConfig = null;
        }
        this.f109404c = consentFlowConfig;
        if (consentFlowConfig != null) {
            try {
            } catch (Exception e) {
                bnsl bnsl = (bnsl) f109402a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "onCreate", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Couldn't apply ChromeOS modifications.");
            }
        }
        int i = Build.VERSION.SDK_INT;
        Context applicationContext = getApplicationContext();
        srn srn = avgq.f93152a;
        try {
            FeatureInfo[] systemAvailableFeatures = applicationContext.getPackageManager().getSystemAvailableFeatures();
            int length = systemAvailableFeatures.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                FeatureInfo featureInfo = systemAvailableFeatures[i2];
                if (featureInfo.name != null && featureInfo.name.equals("org.chromium.arc")) {
                    break;
                }
                i2++;
            }
        } catch (Exception e2) {
            bnsl bnsl2 = (bnsl) avgq.f93152a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("avgq", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Couldn't determine whether running on chromeOS");
        }
        super.onCreate(bundle);
        try {
            spn.m35870c((Activity) this);
            this.f109403b = intent.getStringExtra("UdcAccountName");
            bxrt bxrt = (bxrt) avih.m78570a(intent, "UdcConsentRequest", (bxxk) bxrt.f164599j.mo74142c(7));
            this.f109405d = bxrt;
            sdo.checkIfNull(bxrt, "Intent is missing consent request");
            Intent intent2 = new Intent();
            this.f109407f = intent2;
            intent2.putExtra("UdcConsentResultIds", bqcn.m112584a(this.f109405d.f164604d));
            Intent intent3 = this.f109407f;
            int a = bxsn.m123069a(this.f109405d.f164605e);
            if (a == 0) {
                a = 1;
            }
            intent3.putExtra("UdcConsentResultValues", a - 1);
            this.f109417p = new avht(this);
            this.f109418q = new avhu(this);
            if (intent.hasExtra("UdcConsentFlowConfigBundle")) {
                this.f109404c = (ConsentFlowConfig) intent.getBundleExtra("UdcConsentFlowConfigBundle").getParcelable("UdcConsentFlowConfig");
                if (intent.hasExtra("UdcLayoutOverwrites")) {
                    this.f109404c = m93679a((bxrl) avih.m78570a(intent, "UdcLayoutOverwrites", (bxxk) bxrl.f164570d.mo74142c(7)), this.f109404c);
                }
            }
            if (this.f109404c == null) {
                this.f109404c = new auzl().f92832a;
            }
            ConsentFlowConfig consentFlowConfig2 = this.f109404c;
            int i3 = avhz.f93194l;
            int i4 = consentFlowConfig2.f109334d;
            int i5 = 2132019970;
            if (i4 == 1) {
                setTheme(2132019970);
            } else if (i4 == 4 || i4 == 5) {
                setTheme(2132019971);
            } else if (i4 != 6) {
                if (sre.m36081a(getResources())) {
                    i5 = 2132019968;
                }
                setTheme(i5);
            } else {
                setTheme(2132019970);
            }
            if (bundle2 != null) {
                this.f109408g = (bxsu) avih.m78571a(bundle2, "UdcWriteRequest", (bxxk) bxsu.f164744f.mo74142c(7));
                this.f109410i = bundle2.getIntegerArrayList("UdcConsentZippyStates");
                this.f109411j = bundle2.getIntegerArrayList("UdcConsentZippySettingIds");
                this.f109412k = bundle2.getBoolean("UdcHadConsentWriteErrors");
                this.f109414m = bundle2.getInt("UdcClearcutEventFlowId", 0);
                this.f109415n = bundle2.getBoolean("UdcScreenDisplayedLogged");
            } else {
                this.f109414m = avjn.m78617a();
                this.f109415n = false;
            }
            if (this.f109410i == null) {
                this.f109410i = new ArrayList();
                this.f109411j = new ArrayList();
            }
            this.f109413l = new avjn(this, this.f109403b);
            this.f109409h.mo51268a(1, this.f109417p);
            if (this.f109408g != null) {
                this.f109409h.mo51268a(2, this.f109418q);
            }
        } catch (SecurityException e3) {
            bnsl bnsl3 = (bnsl) f109402a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "onCreate", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Couldn't verify signature - finishing activity.");
            m93680a(3);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f109409h.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntegerArrayList("UdcConsentZippyStates", this.f109410i);
        bundle.putIntegerArrayList("UdcConsentZippySettingIds", this.f109411j);
        bundle.putBoolean("UdcHadConsentWriteErrors", this.f109412k);
        bundle.putInt("UdcClearcutEventFlowId", this.f109414m);
        bundle.putBoolean("UdcScreenDisplayedLogged", this.f109415n);
        avih.m78574a(bundle, "UdcWriteRequest", this.f109408g);
    }

    /* renamed from: a */
    private final void m93680a(int i) {
        Intent intent = new Intent();
        intent.putExtra("udc.consent.cancelReason", new ConsentCancelReason(i, this.f109412k));
        setResult(0, intent);
    }

    /* renamed from: a */
    public final void mo51235a() {
        avjn avjn = this.f109413l;
        if (avjn == null) {
            bnsl bnsl = (bnsl) f109402a.mo68387b();
            bnsl.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 422, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("UdcClearcutLogger is null.");
        } else {
            avjn.mo51292a(29021, this.f109414m);
        }
        this.f109409h.mo51270b(1, this.f109417p);
    }

    /* renamed from: a */
    public final void mo51247a(int i, boolean z) {
        int i2;
        if (this.f109410i.get(i) == null || !((Integer) this.f109410i.get(i)).equals(Integer.valueOf(z))) {
            if (this.f109410i.get(i) != null) {
                avjn avjn = this.f109413l;
                if (avjn != null) {
                    int intValue = ((Integer) this.f109411j.get(i)).intValue();
                    int i3 = this.f109414m;
                    bxvd da = bspq.f146567d.mo74144da();
                    bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
                    bsmt bsmt = bsmt.UDC_MOBILE;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bspp bspp = (bspp) bxvf.f164949b;
                    bspp.f146556b = bsmt.f145305dO;
                    int i4 = bspp.f146555a | 1;
                    bspp.f146555a = i4;
                    if (!z) {
                        i2 = 29017;
                    } else {
                        i2 = 29016;
                    }
                    bspp.f146557c = i2 - 1;
                    int i5 = i4 | 2;
                    bspp.f146555a = i5;
                    int i6 = i5 | 16;
                    bspp.f146555a = i6;
                    bspp.f146560f = false;
                    bspp.f146555a = i6 | 8;
                    bspp.f146559e = intValue;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bspq bspq = (bspq) da.f164949b;
                    bspp bspp2 = (bspp) bxvf.mo74062i();
                    bspp2.getClass();
                    bspq.f146570b = bspp2;
                    bspq.f146569a |= 1;
                    avjn.mo51295a((bspq) da.mo74062i(), i3);
                } else {
                    bnsl bnsl = (bnsl) f109402a.mo68387b();
                    bnsl.mo68432a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 439, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("UdcClearcutLogger is null.");
                }
            }
            this.f109410i.set(i, Integer.valueOf(z ? 1 : 0));
        }
    }

    /* renamed from: a */
    public final void mo51248a(bxso bxso) {
        bxvd da = bxsu.f164744f.mo74144da();
        bxvd da2 = bxst.f164738e.mo74144da();
        bxtx bxtx = this.f109406e.f164614c;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxst bxst = (bxst) da2.f164949b;
        bxtx.getClass();
        int i = 1;
        bxst.f164740a |= 1;
        bxst.f164741b = bxtx;
        int a = bxsn.m123069a(this.f109405d.f164605e);
        if (a != 0) {
            i = a;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxst bxst2 = (bxst) da2.f164949b;
        bxst2.f164742c = i - 1;
        int i2 = bxst2.f164740a | 2;
        bxst2.f164740a = i2;
        bxso.getClass();
        bxst2.f164743d = bxso;
        bxst2.f164740a = i2 | 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxsu bxsu = (bxsu) da.f164949b;
        bxst bxst3 = (bxst) da2.mo74062i();
        bxst3.getClass();
        bxsu.f164749d = bxst3;
        bxsu.f164746a |= 4;
        bxrt bxrt = this.f109405d;
        if ((bxrt.f164601a & 32) != 0) {
            String str = bxrt.f164609i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxsu bxsu2 = (bxsu) da.f164949b;
            str.getClass();
            bxsu2.f164746a |= 16;
            bxsu2.f164750e = str;
        }
        if (!stm.m36302d(this.f109405d.f164603c)) {
            String str2 = this.f109405d.f164603c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxsu bxsu3 = (bxsu) da.f164949b;
            str2.getClass();
            bxsu3.f164746a |= 2;
            bxsu3.f164748c = str2;
        }
        this.f109408g = (bxsu) da.mo74062i();
        this.f109409h.mo51270b(2, this.f109418q);
    }
}
