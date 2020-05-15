package com.google.android.gms.auth.uiflows.consent;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GrantCredentialsWithAclChimeraActivity extends jxx implements View.OnClickListener, jxo {

    /* renamed from: c */
    private static final sek f11495c = ght.m13171a("GrantCredentials");

    /* renamed from: a */
    long f11496a = 0;

    /* renamed from: b */
    protected bxvd f11497b;

    /* renamed from: d */
    private String f11498d;

    /* renamed from: e */
    private int f11499e;

    /* renamed from: f */
    private String f11500f;

    /* renamed from: g */
    private String f11501g;

    /* renamed from: h */
    private ArrayList f11502h = new ArrayList();

    /* renamed from: p */
    private int f11503p;

    /* renamed from: q */
    private boolean f11504q;

    /* renamed from: r */
    private boolean f11505r;

    /* renamed from: s */
    private Drawable f11506s;

    /* renamed from: t */
    private String f11507t;

    /* renamed from: u */
    private eoq f11508u;

    /* renamed from: v */
    private LinearLayout f11509v;

    /* renamed from: w */
    private Button f11510w;

    /* renamed from: x */
    private Button f11511x;

    /* renamed from: y */
    private ScrollViewWithEvents f11512y;

    /* renamed from: z */
    private long f11513z;

    /* renamed from: a */
    private final Intent m7051a(izj izj, iyb iyb) {
        Intent intent = new Intent();
        ArrayList arrayList = this.f11502h;
        int size = arrayList.size();
        String str = null;
        FACLConfig fACLConfig = null;
        for (int i = 0; i < size; i++) {
            ScopeData scopeData = (ScopeData) arrayList.get(i);
            if (scopeData.f10886g) {
                fACLConfig = new FACLConfig(scopeData.f10893n, scopeData.f10887h, scopeData.f10894o, scopeData.f10891l, scopeData.f10892m, scopeData.f10890k);
            }
            if (scopeData.mo7700a()) {
                str = scopeData.f10885f;
            }
        }
        intent.putExtra(ConsentResult.f10615a, new ConsentResult(izj, str, fACLConfig, iyb, getIntent().getStringExtra("GrantCredentialsWithAclChimeraActivityconsentCookieWrapper")));
        return intent;
    }

    /* renamed from: c */
    private final void m7055c() {
        ArrayList arrayList = this.f11502h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScopeData scopeData = (ScopeData) arrayList.get(i);
            scopeData.f10885f = null;
            scopeData.f10887h = null;
            scopeData.f10890k = false;
            scopeData.f10891l = false;
            scopeData.f10892m = false;
            scopeData.f10893n = false;
            scopeData.f10894o = false;
        }
        mo7874a(0, m7051a(izj.PERMISSION_DENIED, iyb.REJECTED));
        long currentTimeMillis = System.currentTimeMillis();
        bxvd bxvd = this.f11497b;
        long j = currentTimeMillis - this.f11513z;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bofi bofi = (bofi) bxvd.f164949b;
        bofi bofi2 = bofi.f132904k;
        bofi.f132906a |= 2;
        bofi.f132908c = j;
        m7056e();
        this.f11511x.setEnabled(false);
        this.f11510w.setEnabled(false);
    }

    /* renamed from: e */
    private final void m7056e() {
        if (((Boolean) jxv.f23484b.mo25081c()).booleanValue() && new Random().nextFloat() < ((Float) jxv.f23485c.mo25081c()).floatValue()) {
            bogf bogf = (bogf) bogg.f132977f.mo74144da();
            String str = this.f11498d;
            if (bogf.f164950c) {
                bogf.mo74035c();
                bogf.f164950c = false;
            }
            bogg bogg = (bogg) bogf.f164949b;
            str.getClass();
            int i = bogg.f132979a | 1;
            bogg.f132979a = i;
            bogg.f132980b = str;
            String str2 = this.f11500f;
            str2.getClass();
            bogg.f132979a = i | 2;
            bogg.f132981c = str2;
            try {
                String e = spn.m35882e(this, this.f11498d);
                if (e != null) {
                    if (bogf.f164950c) {
                        bogf.mo74035c();
                        bogf.f164950c = false;
                    }
                    bogg bogg2 = (bogg) bogf.f164949b;
                    e.getClass();
                    bogg2.f132979a |= 4;
                    bogg2.f132982d = e;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
            bxvd bxvd = this.f11497b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bofi bofi = (bofi) bxvd.f164949b;
            bogg bogg3 = (bogg) bogf.mo74062i();
            bofi bofi2 = bofi.f132904k;
            bogg3.getClass();
            bofi.f132913h = bogg3;
            bofi.f132906a |= 64;
            bxvd bxvd2 = this.f11497b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bofi bofi3 = (bofi) bxvd2.f164949b;
            bofi3.f132915j = 1;
            bofi3.f132906a |= 1024;
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 2;
            boct.f132610a |= 1;
            bofi bofi4 = (bofi) this.f11497b.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct2 = (boct) da.f164949b;
            bofi4.getClass();
            boct2.f132614e = bofi4;
            boct2.f132610a |= 4;
            new qws(this, "ANDROID_AUTH", null).mo24335a(((boct) da.mo74062i()).mo73642k()).mo24327b();
        }
    }

    /* renamed from: b */
    public final String mo7384b() {
        return "GrantCredentialsWithAclActivity";
    }

    public final void onBackPressed() {
        bxvd bxvd = this.f11497b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bofi bofi = (bofi) bxvd.f164949b;
        bofi bofi2 = bofi.f132904k;
        bofi.f132907b = 1;
        bofi.f132906a = 1 | bofi.f132906a;
        m7055c();
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0131, code lost:
        if (r14.f164950c != false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0139, code lost:
        ((p000.sfl) r14.f164949b).f44124a = p000.GeneratedMessageLite.m124030de();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0143, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0185  */
    public void onClick(View view) {
        ScopeData scopeData;
        ArrayList arrayList;
        String str;
        int i;
        int id = view.getId();
        int i2 = 1;
        if (id == C0126R.C0129id.cancel_button) {
            f11495c.mo25412b("Consent declined", new Object[0]);
            bxvd bxvd = this.f11497b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bofi bofi = (bofi) bxvd.f164949b;
            bofi bofi2 = bofi.f132904k;
            bofi.f132907b = 3;
            bofi.f132906a |= 1;
            m7055c();
        } else if (id == C0126R.C0129id.accept_button) {
            f11495c.mo25412b("Consent accepted", new Object[0]);
            bxvd bxvd2 = this.f11497b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bofi bofi3 = (bofi) bxvd2.f164949b;
            bofi bofi4 = bofi.f132904k;
            int i3 = 2;
            bofi3.f132907b = 2;
            bofi3.f132906a |= 1;
            if (this.f11512y.mo17935a()) {
                int size = this.f11502h.size();
                int i4 = 0;
                while (i4 < size) {
                    ScopeData scopeData2 = (ScopeData) this.f11502h.get(i4);
                    jxp jxp = (jxp) getSupportFragmentManager().findFragmentByTag(m7053a(i4));
                    bxvd bxvd3 = null;
                    if (jxp != null && (arrayList = jxp.f23462b) != null) {
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            ArrayList arrayList2 = jxp.f23462b;
                            try {
                                String str2 = jxp.f23461a.f10885f;
                                if (str2 != null) {
                                    Iterator it = ((sfj) GeneratedMessageLite.m124016a(sfj.f44114c, sqd.m35971c(str2), bxus.m123744c())).f44116a.iterator();
                                    while (true) {
                                        try {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            sfk sfk = (sfk) it.next();
                                            if ((sfk.f44120a & i3) != 0) {
                                                sfl sfl = sfk.f44121b;
                                                if (sfl == null) {
                                                    sfl = sfl.f44122b;
                                                }
                                                bxvd bxvd4 = (bxvd) sfl.mo74142c(5);
                                                bxvd4.mo73625a((GeneratedMessageLite) sfl);
                                                if (bxvd4 != null) {
                                                    try {
                                                        break;
                                                    } catch (bxwf e) {
                                                        e = e;
                                                        bxvd3 = bxvd4;
                                                        if (Log.isLoggable("AuthScopeFragment", 5)) {
                                                        }
                                                        if (bxvd3 == null) {
                                                        }
                                                        if (arrayList2 == null) {
                                                        }
                                                        str = sqd.m35972d(((sfl) bxvd3.mo74062i()).mo73642k());
                                                        scopeData2.f10885f = str;
                                                        i4++;
                                                        i2 = 1;
                                                        i3 = 2;
                                                    }
                                                } else {
                                                    bxvd3 = bxvd4;
                                                }
                                            }
                                        } catch (bxwf e2) {
                                            e = e2;
                                            if (Log.isLoggable("AuthScopeFragment", 5)) {
                                            }
                                            if (bxvd3 == null) {
                                            }
                                            if (arrayList2 == null) {
                                            }
                                            str = sqd.m35972d(((sfl) bxvd3.mo74062i()).mo73642k());
                                            scopeData2.f10885f = str;
                                            i4++;
                                            i2 = 1;
                                            i3 = 2;
                                        }
                                    }
                                }
                            } catch (bxwf e3) {
                                e = e3;
                                if (Log.isLoggable("AuthScopeFragment", 5)) {
                                    String valueOf = String.valueOf(e.getMessage());
                                    Log.w("AuthScopeFragment", valueOf.length() == 0 ? new String("Failed to get SharingRoster from RenderedSharingRoster: ") : "Failed to get SharingRoster from RenderedSharingRoster: ".concat(valueOf));
                                }
                                if (bxvd3 == null) {
                                }
                                if (arrayList2 == null) {
                                }
                                str = sqd.m35972d(((sfl) bxvd3.mo74062i()).mo73642k());
                                scopeData2.f10885f = str;
                                i4++;
                                i2 = 1;
                                i3 = 2;
                            }
                            if (bxvd3 == null) {
                                bxvd3 = sfl.f44122b.mo74144da();
                            }
                            if (arrayList2 == null) {
                                if (!arrayList2.isEmpty()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int size2 = arrayList2.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        AudienceMember audienceMember = (AudienceMember) arrayList2.get(i5);
                                        bxvd da = sfn.f44130e.mo74144da();
                                        int i6 = audienceMember.f30292b;
                                        if (i6 == i2) {
                                            int i7 = audienceMember.f30293c;
                                            if (i7 != -1) {
                                                if (i7 == 1) {
                                                    i = 1;
                                                } else if (i7 == 2) {
                                                    i = 2;
                                                } else if (i7 == 3) {
                                                    i = 3;
                                                } else if (i7 == 4) {
                                                    i = 4;
                                                } else {
                                                    StringBuilder sb = new StringBuilder(38);
                                                    sb.append("Unknown system group type: ");
                                                    sb.append(i7);
                                                    throw new IllegalArgumentException(sb.toString());
                                                }
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                sfn sfn = (sfn) da.f164949b;
                                                sfn.f44135d = i;
                                                sfn.f44132a |= 4;
                                            } else {
                                                String str3 = audienceMember.f30294d;
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                sfn sfn2 = (sfn) da.f164949b;
                                                str3.getClass();
                                                sfn2.f44132a |= 2;
                                                sfn2.f44134c = str3;
                                            }
                                        } else if (i6 == i3) {
                                            String str4 = audienceMember.f30295e;
                                            bxvd da2 = sfo.f44136d.mo74144da();
                                            if (ancm.m64020i(str4)) {
                                                String g = ancm.m64018g(str4);
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                sfo sfo = (sfo) da2.f164949b;
                                                g.getClass();
                                                sfo.f44138a |= i2;
                                                sfo.f44139b = g;
                                            } else {
                                                String e4 = ancm.m64016e(str4);
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                sfo sfo2 = (sfo) da2.f164949b;
                                                e4.getClass();
                                                sfo2.f44138a |= 4;
                                                sfo2.f44140c = e4;
                                            }
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            sfn sfn3 = (sfn) da.f164949b;
                                            sfo sfo3 = (sfo) da2.mo74062i();
                                            sfo3.getClass();
                                            sfn3.f44133b = sfo3;
                                            sfn3.f44132a |= 1;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder(32);
                                            sb2.append("Unknown member type: ");
                                            sb2.append(i6);
                                            throw new IllegalArgumentException(sb2.toString());
                                        }
                                        arrayList3.add((sfn) da.mo74062i());
                                        i5++;
                                        i2 = 1;
                                        i3 = 2;
                                    }
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    sfl sfl2 = sfl.f44122b;
                                    ((sfl) bxvd3.f164949b).f44124a = GeneratedMessageLite.m124030de();
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    sfl sfl3 = (sfl) bxvd3.f164949b;
                                    if (!sfl3.f44124a.mo73666a()) {
                                        sfl3.f44124a = GeneratedMessageLite.m124021a(sfl3.f44124a);
                                    }
                                    bxsy.m123078a(arrayList3, sfl3.f44124a);
                                }
                            }
                            str = sqd.m35972d(((sfl) bxvd3.mo74062i()).mo73642k());
                        }
                        scopeData2.f10885f = str;
                    } else if (jxp == null || (scopeData = jxp.f23461a) == null || !scopeData.f10886g) {
                        scopeData2.f10885f = null;
                        scopeData2.f10887h = null;
                        scopeData2.f10893n = false;
                        scopeData2.f10894o = false;
                    } else {
                        scopeData2.f10887h = jxp.mo14210a();
                        ScopeData scopeData3 = jxp.f23461a;
                        scopeData2.f10893n = scopeData3 != null ? scopeData3.f10893n : false;
                        scopeData2.f10894o = scopeData3 != null ? scopeData3.f10894o : false;
                    }
                    i4++;
                    i2 = 1;
                    i3 = 2;
                }
                int i8 = spn.f44932a;
                mo7874a(-1, m7051a(izj.SUCCESS, iyb.GRANTED));
                long currentTimeMillis = System.currentTimeMillis();
                bxvd bxvd5 = this.f11497b;
                long j = currentTimeMillis - this.f11513z;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bofi bofi5 = (bofi) bxvd5.f164949b;
                bofi5.f132906a = i3 | bofi5.f132906a;
                bofi5.f132908c = j;
                bxvd bxvd6 = this.f11497b;
                long j2 = this.f11496a;
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                bofi bofi6 = (bofi) bxvd6.f164949b;
                bofi6.f132906a |= 128;
                bofi6.f132914i = j2;
                m7056e();
                this.f11511x.setEnabled(false);
                this.f11510w.setEnabled(false);
                return;
            }
            this.f11512y.pageScroll(130);
            this.f11496a++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a8  */
    public final void onCreate(Bundle bundle) {
        float f;
        String str;
        String str2;
        String str3;
        CharSequence text;
        String str4;
        super.onCreate(bundle);
        this.f11497b = bofi.f132904k.mo74144da();
        this.f11513z = System.currentTimeMillis();
        if (bundle != null) {
            m7054a(bundle);
        } else {
            m7054a(getIntent().getExtras());
        }
        if (this.f11501g == null || this.f11498d == null || this.f11500f == null) {
            if (Log.isLoggable("GLSActivity", 5)) {
                Object[] objArr = new Object[4];
                objArr[0] = getClass().getSimpleName();
                if (this.f11501g != null) {
                    str4 = "<omitted>";
                } else {
                    str4 = null;
                }
                objArr[1] = str4;
                objArr[2] = this.f11498d;
                objArr[3] = this.f11500f;
                Log.w("GLSActivity", String.format("%s started with username=%s callingPackage=%s service=%s", objArr));
            }
            mo7874a(0, (Intent) null);
        }
        if (!this.f11505r && (this.f11506s == null || this.f11507t == null)) {
            if (Log.isLoggable("GLSActivity", 5)) {
                Log.w("GLSActivity", String.format("Failed to get ApplicationInfo for package: %s", this.f11498d));
            }
            mo7874a(0, (Intent) null);
        }
        requestWindowFeature(1);
        setContentView((int) C0126R.C0128layout.auth_consent_request_access_to_google_service);
        this.f11508u = new jxu(this, this, bngx.m109356a(new Account(this.f11501g, "com.google")));
        ListView listView = (ListView) findViewById(16908298);
        listView.setAdapter((ListAdapter) this.f11508u);
        listView.setItemsCanFocus(false);
        this.f11509v = (LinearLayout) findViewById(C0126R.C0129id.scopes_layout);
        this.f11512y = (ScrollViewWithEvents) findViewById(C0126R.C0129id.scroll_view);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("headerFragment") == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(C0126R.C0129id.header_fragment_layout, jxn.m17467a(this.f11507t), "headerFragment");
            beginTransaction.commit();
        }
        int i = spn.f44932a;
        if (((Boolean) jxv.f23483a.mo25081c()).booleanValue() || !this.f11500f.trim().startsWith("audience:")) {
            ArrayList arrayList = this.f11502h;
            if (arrayList == null || arrayList.isEmpty()) {
                this.f11502h = new ArrayList();
                try {
                    String valueOf = String.valueOf(this.f11500f);
                    String str5 = valueOf.length() == 0 ? new String("com.google.android.googleapps.permission.GOOGLE_AUTH.") : "com.google.android.googleapps.permission.GOOGLE_AUTH.".concat(valueOf);
                    PackageManager packageManager = getPackageManager();
                    PermissionInfo permissionInfo = packageManager.getPermissionInfo(str5, 0);
                    if (permissionInfo.labelRes == 0 || (text = packageManager.getText(permissionInfo.packageName, permissionInfo.labelRes, null)) == null) {
                        str = permissionInfo.nonLocalizedLabel != null ? permissionInfo.nonLocalizedLabel.toString() : permissionInfo.name != null ? permissionInfo.name : null;
                        if (str == null) {
                            str = this.f11500f;
                        }
                        if (!"SID".equals(str) || "LSID".equals(str)) {
                            str3 = getString(C0126R.string.sid_lsid_grant_label);
                            str2 = getString(C0126R.string.sid_lsid_grant_detail);
                        } else {
                            str3 = str;
                            str2 = null;
                        }
                        this.f11502h.add(new ScopeData(str3, str2, null, null, false, null, null, false, false, false, false, false, false, ScopeData.f10880a, null));
                    } else {
                        str = text.toString();
                        if (str == null) {
                        }
                        if (!"SID".equals(str)) {
                        }
                        str3 = getString(C0126R.string.sid_lsid_grant_label);
                        str2 = getString(C0126R.string.sid_lsid_grant_detail);
                        this.f11502h.add(new ScopeData(str3, str2, null, null, false, null, null, false, false, false, false, false, false, ScopeData.f10880a, null));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    str = null;
                }
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            FragmentTransaction beginTransaction2 = supportFragmentManager2.beginTransaction();
            int size = this.f11502h.size();
            for (int i2 = 0; i2 < size; i2++) {
                ScopeData scopeData = (ScopeData) this.f11502h.get(i2);
                String a = m7053a(i2);
                if (supportFragmentManager2.findFragmentByTag(a) == null) {
                    beginTransaction2.add(C0126R.C0129id.scopes_layout, jxp.m17472a(i2, this.f11507t, this.f11501g, this.f11498d, scopeData), a);
                }
            }
            if (!beginTransaction2.isEmpty()) {
                beginTransaction2.commit();
            }
        } else {
            TextView textView = new TextView(this);
            Object[] objArr2 = new Object[1];
            String trim = this.f11500f.trim();
            if (trim.startsWith("audience:")) {
                objArr2[0] = trim.substring(9);
                textView.setText(getString(C0126R.string.auth_allow_external_site_access, objArr2));
                this.f11509v.addView(textView);
            } else {
                throw new IllegalStateException("Expected auth token type to start with 'audience:'");
            }
        }
        ((TextView) findViewById(C0126R.C0129id.footnote)).setText(getResources().getString(C0126R.string.auth_app_permission_ok_footnote));
        Button button = (Button) findViewById(C0126R.C0129id.cancel_button);
        this.f11510w = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(C0126R.C0129id.accept_button);
        this.f11511x = button2;
        button2.setOnClickListener(this);
        Resources resources = getResources();
        if (sre.m36081a(resources)) {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_tablet_resize_factor);
        } else {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_resize_factor);
        }
        spa.m35815a(getContainerActivity(), (double) f);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("callingPkg", this.f11498d);
        bundle.putInt("callingUid", this.f11499e);
        bundle.putString("service", this.f11500f);
        bundle.putString("acctName", this.f11501g);
        bundle.putParcelableArrayList("scopeData", this.f11502h);
        bundle.putInt("lastScopeIndex", this.f11503p);
        bundle.putBoolean("GrantCredentialsWithAclChimeraActivityhasTitle", this.f11504q);
        bundle.putBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp", this.f11505r);
        bundle.putString("GrantCredentialsWithAclChimeraActivityremoteAppLabel", this.f11507t);
    }

    public final void onStart() {
        super.onStart();
    }

    public final void onStop() {
        super.onStop();
    }

    /* renamed from: a */
    public static Intent m7052a(String str, int i, String str2, String str3, ArrayList arrayList, boolean z, int i2, String str4, boolean z2, String str5) {
        Intent className = new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclActivity");
        className.putExtra("callingPkg", str);
        className.putExtra("callingUid", i);
        className.putExtra("service", str2);
        className.putExtra("acctName", str3);
        className.putParcelableArrayListExtra("scopeData", arrayList);
        className.putExtra("GrantCredentialsWithAclChimeraActivityhasTitle", z);
        className.putExtra("GrantCredentialsWithAclChimeraActivitytitle", i2);
        className.putExtra("GrantCredentialsWithAclChimeraActivityconsentCookieWrapper", str4);
        className.putExtra("GrantCredentialsWithAclChimeraActivityisRemoteApp", z2);
        className.putExtra("GrantCredentialsWithAclChimeraActivityremoteAppLabel", str5);
        return className;
    }

    /* renamed from: a */
    private static final String m7053a(int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append("scopeFragment");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m7054a(Bundle bundle) {
        this.f11498d = bundle.getString("callingPkg");
        this.f11499e = bundle.getInt("callingUid");
        this.f11500f = bundle.getString("service");
        this.f11501g = bundle.getString("acctName");
        this.f11503p = bundle.getInt("lastScopeIndex");
        this.f11504q = bundle.getBoolean("GrantCredentialsWithAclChimeraActivityhasTitle");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("scopeData");
        if (parcelableArrayList != null) {
            this.f11502h.clear();
            this.f11502h.addAll(parcelableArrayList);
        }
        this.f11505r = bundle.getBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp");
        imx imx = new imx(this);
        this.f11506s = imx.mo13152b(this.f11498d);
        CharSequence a = imx.mo13151a(this.f11498d);
        if (a != null) {
            this.f11507t = a.toString();
        } else if (this.f11505r) {
            this.f11507t = bundle.getString("GrantCredentialsWithAclChimeraActivityremoteAppLabel");
        }
    }

    /* renamed from: a */
    public final void mo7898a(long j) {
        bxvd bxvd = this.f11497b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bofi bofi = (bofi) bxvd.f164949b;
        bofi bofi2 = bofi.f132904k;
        bofi.f132906a |= 4;
        bofi.f132909d = j;
        bxvd bxvd2 = this.f11497b;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bofi bofi3 = (bofi) bxvd2.f164949b;
        bofi3.f132906a |= 8;
        bofi3.f132910e = true;
    }

    /* renamed from: a */
    public final void mo7899a(boolean z, boolean z2) {
        bxvd bxvd = this.f11497b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bofi bofi = (bofi) bxvd.f164949b;
        bofi bofi2 = bofi.f132904k;
        bofi.f132906a |= 16;
        bofi.f132911f = z;
        bxvd bxvd2 = this.f11497b;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bofi bofi3 = (bofi) bxvd2.f164949b;
        bofi3.f132906a |= 32;
        bofi3.f132912g = z2;
    }
}
