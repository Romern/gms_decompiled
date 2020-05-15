package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CredentialPickerChimeraActivity extends adcc implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public String f10152b;

    /* renamed from: c */
    public bmxv f10153c;

    /* renamed from: d */
    public bmxv f10154d;

    /* renamed from: e */
    public bmxv f10155e;

    /* renamed from: f */
    public bmxv f10156f = bmvz.f131120a;

    /* renamed from: g */
    public htd f10157g;

    /* renamed from: h */
    public ListView f10158h;

    /* renamed from: i */
    public sox f10159i;

    /* renamed from: j */
    public gwh f10160j;

    /* renamed from: k */
    public String f10161k;

    /* renamed from: l */
    public qws f10162l;

    /* renamed from: m */
    private boolean f10163m;

    /* renamed from: n */
    private long f10164n;

    /* renamed from: p */
    private adan f10165p;

    /* renamed from: q */
    private int f10166q;

    /* renamed from: r */
    private int f10167r = 1;

    /* renamed from: a */
    private final void m6371a(int i) {
        if (ccda.m129287b()) {
            qws qws = this.f10162l;
            bxvd da = bong.f133782r.mo74144da();
            String str = this.f10161k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bong bong = (bong) da.f164949b;
            str.getClass();
            int i2 = bong.f133784a | 2;
            bong.f133784a = i2;
            bong.f133786c = str;
            bong.f133785b = 6;
            bong.f133784a = i2 | 1;
            bxvd da2 = bonb.f133754f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonb bonb = (bonb) da2.f164949b;
            bonb.f133757b = i - 1;
            int i3 = bonb.f133756a | 1;
            bonb.f133756a = i3;
            String str2 = this.f10152b;
            str2.getClass();
            bonb.f133756a = i3 | 8;
            bonb.f133760e = str2;
            bonb bonb2 = (bonb) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bong bong2 = (bong) da.f164949b;
            bonb2.getClass();
            bong2.f133791h = bonb2;
            bong2.f133784a |= 64;
            qws.mo24333a(da.mo74062i()).mo24327b();
        }
    }

    /* renamed from: e */
    public final void mo7433e() {
        this.f10158h.setEnabled(false);
        View findViewById = findViewById(C0126R.C0129id.progress_indicator_container);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.progress_indicator);
        findViewById.setVisibility(0);
        if (this.f10159i == null) {
            sox sox = new sox(getContainerActivity(), findViewById(C0126R.C0129id.progress_indicator));
            this.f10159i = sox;
            sox.setAlpha(255);
            this.f10159i.mo25910a(0);
            this.f10159i.mo25911a(-12417548);
        }
        imageView.setImageDrawable(this.f10159i);
        this.f10159i.start();
    }

    /* renamed from: g */
    public final CredentialPickerConfig mo7434g() {
        if (this.f10153c.mo66813a()) {
            return ((HintRequest) this.f10153c.mo66814b()).f10114b;
        }
        return ((CredentialRequest) this.f10154d.mo66814b()).f10107d;
    }

    public final void onBackPressed() {
        int i;
        int i2;
        if (!this.f10154d.mo66813a()) {
            i = 106;
        } else {
            i = BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR;
        }
        mo7431a(0, i);
        if (!this.f10154d.mo66813a()) {
            i2 = 107;
        } else {
            i2 = BaseMfiEventCallback.TYPE_EXPIRED_MFI;
        }
        m6371a(i2);
    }

    public void onClick(View view) {
        int i;
        int i2;
        int i3;
        int id = view.getId();
        if (id == C0126R.C0129id.add_account) {
            if (!this.f10154d.mo66813a()) {
                i2 = ErrorInfo.TYPE_SDU_FAILED;
            } else {
                i2 = 204;
            }
            mo7431a(1000, i2);
            if (!this.f10154d.mo66813a()) {
                i3 = ErrorInfo.TYPE_SDU_MEMORY_FULL;
            } else {
                i3 = 205;
            }
            m6371a(i3);
        } else if (id == C0126R.C0129id.cancel) {
            if (!this.f10154d.mo66813a()) {
                i = 102;
            } else {
                i = 202;
            }
            mo7431a(1001, i);
            m6371a(!this.f10154d.mo66813a() ? ErrorInfo.TYPE_SDU_COMMUNICATIONERROR : 203);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        bmxv bmxv;
        bmxv bmxv2;
        String str;
        bmxv bmxv3;
        super.onCreate(bundle);
        setTheme(2132017253);
        Bundle bundle2 = (Bundle) bmxu.m108565a(bundle, (Bundle) bmxu.m108565a(getIntent().getExtras(), Bundle.EMPTY));
        ClassLoader classLoader = CredentialRequest.class.getClassLoader();
        sdo.m34959a(classLoader);
        bundle2.setClassLoader(classLoader);
        String a = spn.m35852a((Activity) this);
        if (a != null) {
            String string = bundle2.getString("claimedCallingPackage");
            if (string == null || bmxi.m108538a(a, string)) {
                bmxv = bmxv.m108566b(a);
            } else {
                bmxv = !rfz.m33557a(this).mo24610b(a) ? bmvz.f131120a : bmxv.m108566b(string);
            }
        } else {
            bmxv = bmvz.f131120a;
        }
        if (bmxv.mo66813a()) {
            bmxv2 = qqt.m32666a(this, (String) bmxv.mo66814b());
        } else {
            bmxv2 = bmvz.f131120a;
        }
        this.f10163m = bundle2.getBoolean("firstTime");
        if (TextUtils.isEmpty(bundle2.getString("logSessionId"))) {
            str = adbv.m50143a();
        } else {
            str = bundle2.getString("logSessionId");
            sdo.m34959a((Object) str);
        }
        this.f10161k = str;
        this.f10164n = bundle2.getLong("popupTimeMillis", SystemClock.elapsedRealtime());
        this.f10154d = bmvz.f131120a;
        byte[] byteArray = bundle2.getByteArray("credentialRequest");
        if (byteArray != null) {
            this.f10154d = bmxv.m108567c((CredentialRequest) sef.m35069a(byteArray, CredentialRequest.CREATOR));
        }
        Object obj = bundle2.get("com.google.android.gms.credentials.HintRequest");
        if (obj == null) {
            bmxv3 = bmvz.f131120a;
        } else if (obj instanceof byte[]) {
            bmxv3 = bmxv.m108566b((HintRequest) sef.m35069a((byte[]) obj, HintRequest.CREATOR));
        } else {
            bmxv3 = bmxv.m108566b((HintRequest) obj);
        }
        this.f10153c = bmxv3;
        this.f10155e = bmvz.f131120a;
        byte[] byteArray2 = bundle2.getByteArray("selectedCredential");
        if (byteArray2 != null) {
            this.f10155e = bmxv.m108567c((InternalCredentialWrapper) sef.m35069a(byteArray2, InternalCredentialWrapper.CREATOR));
        }
        this.f10162l = new qws(this, "IDENTITY_GMSCORE", null);
        if (!bmxv2.mo66813a()) {
            this.f10152b = "";
            m6371a(2);
            mo7431a(0, 2);
            return;
        }
        this.f10152b = (String) bmxv2.mo66814b();
        if (this.f10154d.mo66813a() || this.f10153c.mo66813a()) {
            getWindow().addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
            getWindow().addFlags(2);
            this.f10165p = adan.m50084a((FragmentActivity) this);
            this.f10160j = gvq.m14020a(this, hid.m14370a(this.f10161k).mo12481a());
            if (this.f10154d.mo66813a()) {
                setContentView((int) C0126R.C0128layout.credential_picker_activity);
            } else {
                setContentView((int) C0126R.C0128layout.credential_hint_picker_activity);
            }
            findViewById(C0126R.C0129id.credential_picker_layout).setContentDescription(getString(!this.f10154d.mo66813a() ? C0126R.string.credentials_hint_ally_announce : C0126R.string.credentials_picker_ally_announce));
            findViewById(C0126R.C0129id.add_account).setVisibility(8);
            this.f10158h = (ListView) findViewById(C0126R.C0129id.credential_picker_options);
            htd htd = new htd(this, new ArrayList());
            this.f10157g = htd;
            this.f10158h.setAdapter((ListAdapter) htd);
            this.f10158h.setOnItemClickListener(this);
            TextView textView = (TextView) findViewById(C0126R.C0129id.credentials_warm_welcome_text);
            if (textView != null) {
                Resources resources = getResources();
                String string2 = resources.getString(C0126R.string.credentials_warm_welcome_prefix);
                String string3 = resources.getString(C0126R.string.credentials_warm_welcome_link_text);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) string3);
                spannableStringBuilder.setSpan(new DefensiveURLSpan((String) hfe.f19643e.mo58455c(), true), length, spannableStringBuilder.length(), 33);
                if (!TextUtils.isEmpty(null)) {
                    spannableStringBuilder.append((CharSequence) null);
                }
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (this.f10163m && this.f10154d.mo66813a()) {
                View findViewById = findViewById(C0126R.C0129id.google_logo);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                int i = Build.VERSION.SDK_INT;
                if ((getResources().getConfiguration().screenLayout & 15) < 3) {
                    setRequestedOrientation(1);
                }
            } else {
                View findViewById2 = findViewById(C0126R.C0129id.credentials_warm_welcome_layout);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                if (this.f10153c.mo66813a()) {
                    TextView textView2 = (TextView) findViewById(C0126R.C0129id.credentials_hint_picker_title);
                    int i2 = mo7434g().f10103d;
                    if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
                        i2 = 1;
                    }
                    int i3 = C0126R.string.credentials_hint_picker_title_continue;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i3 = C0126R.string.credentials_hint_picker_title;
                        } else if (i2 == 3) {
                            i3 = C0126R.string.credentials_hint_picker_title_new_account;
                        }
                    }
                    textView2.setText(i3);
                }
            }
            mo7433e();
            if (this.f10163m && this.f10154d.mo66813a()) {
                this.f10160j.mo12278a();
            }
            if (ccda.m129287b()) {
                adbs.m50134a(this, this, new hsr(this));
            }
            bqga.m112781a(this.f10165p.mo33292a(1, new hss(this)), new hta(this), bqfb.INSTANCE);
            return;
        }
        mo7431a(0, 2);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            bxvd da = bodk.f132702h.mo74144da();
            String str = this.f10152b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodk bodk = (bodk) da.f164949b;
            str.getClass();
            bodk.f132704a |= 32;
            bodk.f132710g = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10164n;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodk bodk2 = (bodk) da.f164949b;
            int i = bodk2.f132704a | 2;
            bodk2.f132704a = i;
            bodk2.f132706c = elapsedRealtime;
            int i2 = this.f10167r;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bodk2.f132705b = i3;
                int i4 = i | 1;
                bodk2.f132704a = i4;
                boolean z = this.f10163m;
                bodk2.f132704a = i4 | 16;
                bodk2.f132709f = z;
                int size = this.f10156f.mo66813a() ? ((bngx) this.f10156f.mo66814b()).size() : -1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bodk bodk3 = (bodk) da.f164949b;
                int i5 = bodk3.f132704a | 8;
                bodk3.f132704a = i5;
                bodk3.f132708e = size;
                int i6 = this.f10166q;
                if (i6 != -1) {
                    bodk3.f132704a = i5 | 4;
                    bodk3.f132707d = i6;
                }
                his.m14426a().mo12510a((bodk) da.mo74062i());
            } else {
                throw null;
            }
        }
        super.onDestroy();
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f10158h.setEnabled(false);
        this.f10166q = i;
        mo7432a((InternalCredentialWrapper) ((bngx) this.f10156f.mo66814b()).get(i));
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("popupTimeMillis", this.f10164n);
        bundle.putBoolean("firstTime", this.f10163m);
        bundle.putString("claimedCallingPackage", qqt.m32669c(this.f10152b));
        if (this.f10154d.mo66813a()) {
            bundle.putByteArray("credentialRequest", sef.m35074a((CredentialRequest) this.f10154d.mo66814b()));
        }
        if (this.f10153c.mo66813a()) {
            bundle.putByteArray("com.google.android.gms.credentials.HintRequest", sef.m35074a((HintRequest) this.f10153c.mo66814b()));
        }
        if (this.f10155e.mo66813a()) {
            bundle.putByteArray("selectedCredential", sef.m35074a((InternalCredentialWrapper) this.f10155e.mo66814b()));
        }
        String str = this.f10161k;
        if (str != null) {
            bundle.putString("logSessionId", str);
        }
        super.onSaveInstanceState(bundle);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f10157g.isEmpty()) {
            return true;
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f10154d.mo66813a()) {
            i = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
        } else {
            i = 203;
        }
        mo7431a(0, i);
        if (!this.f10154d.mo66813a()) {
            i2 = ErrorInfo.TYPE_SDU_FAILED;
        } else {
            i2 = 204;
        }
        m6371a(i2);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6372a(int i, int i2, Credential credential) {
        this.f10167r = i2;
        Intent intent = new Intent();
        if (credential != null) {
            intent.putExtra("com.google.android.gms.credentials.Credential", credential);
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo7431a(int i, int i2) {
        m6372a(i, i2, (Credential) null);
    }

    /* renamed from: a */
    public final void mo7432a(InternalCredentialWrapper internalCredentialWrapper) {
        this.f10158h.postDelayed(new hst(this), 400);
        this.f10160j.mo12279a(this.f10152b);
        this.f10155e = bmxv.m108566b(internalCredentialWrapper);
        if (this.f10154d.mo66813a()) {
            Account account = internalCredentialWrapper.f10140b;
            sdo.m34959a(account);
            bqga.m112781a(this.f10165p.mo33292a(2, new hsu(this, account, internalCredentialWrapper)), new htb(this), bqfb.INSTANCE);
        } else {
            Credential credential = internalCredentialWrapper.f10139a;
            gvl gvl = new gvl(credential);
            gvl.f19079c = bngx.m109376e();
            bmxv f = bnjd.m109599f(soz.m35801d(this, getPackageName()), new hsv(credential));
            if (!((HintRequest) this.f10153c.mo66814b()).f10118f || !f.mo66813a()) {
                m6372a(-1, 101, gvl.mo12267a());
            } else {
                bqga.m112781a(this.f10165p.mo33292a(2, new hsw(this, f)), new htc(this, gvl), bqfb.INSTANCE);
            }
        }
        int i = this.f10166q;
        if (ccda.m129287b()) {
            qws qws = this.f10162l;
            bxvd da = bong.f133782r.mo74144da();
            String str = this.f10161k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bong bong = (bong) da.f164949b;
            str.getClass();
            int i2 = bong.f133784a | 2;
            bong.f133784a = i2;
            bong.f133786c = str;
            bong.f133785b = 6;
            bong.f133784a = i2 | 1;
            bxvd da2 = bonb.f133754f.mo74144da();
            int i3 = !this.f10154d.mo66813a() ? 102 : 202;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonb bonb = (bonb) da2.f164949b;
            bonb.f133757b = i3 - 1;
            bonb.f133756a |= 1;
            int size = ((bngx) this.f10156f.mo66814b()).size();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonb bonb2 = (bonb) da2.f164949b;
            int i4 = bonb2.f133756a | 4;
            bonb2.f133756a = i4;
            bonb2.f133759d = size;
            int i5 = i4 | 2;
            bonb2.f133756a = i5;
            bonb2.f133758c = i;
            String str2 = this.f10152b;
            str2.getClass();
            bonb2.f133756a = i5 | 8;
            bonb2.f133760e = str2;
            bonb bonb3 = (bonb) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bong bong2 = (bong) da.f164949b;
            bonb3.getClass();
            bong2.f133791h = bonb3;
            bong2.f133784a |= 64;
            qws.mo24333a(da.mo74062i()).mo24327b();
        }
    }
}
