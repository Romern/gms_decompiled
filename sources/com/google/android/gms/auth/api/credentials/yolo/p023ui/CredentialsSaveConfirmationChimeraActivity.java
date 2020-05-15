package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSaveConfirmationChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CredentialsSaveConfirmationChimeraActivity extends adcc implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: d */
    public static final /* synthetic */ int f10168d = 0;

    /* renamed from: e */
    private static final sek f10169e = ght.m13172b("CredentialsSaveConfirmationActivity");

    /* renamed from: b */
    public String f10170b;

    /* renamed from: c */
    public qws f10171c;

    /* renamed from: f */
    private String f10172f;

    /* renamed from: g */
    private Credential f10173g;

    /* renamed from: h */
    private boolean f10174h;

    /* renamed from: i */
    private List f10175i;

    /* renamed from: j */
    private Account f10176j;

    /* renamed from: k */
    private long f10177k;

    /* renamed from: l */
    private gwh f10178l;

    /* renamed from: m */
    private int f10179m = 1;

    /* renamed from: a */
    public static Intent m6378a(Context context, String str, Credential credential, boolean z, List list, bmxv bmxv, String str2) {
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.auth.api.credentials.ui.CredentialsSaveConfirmationActivity").putExtra("app_id", str).putExtra("is_first_use", z).putExtra("available_accounts", (Parcelable[]) list.toArray(new Account[0])).putExtra("selected_account", (Parcelable) bmxv.mo66815c()).putExtra("key_log_session_id", str2);
        sef.m35071a(credential, putExtra, "extra_credentials");
        return putExtra;
    }

    public final void onBackPressed() {
        m6380a(405);
        m6381a(0, 404);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gwh.a(android.accounts.Account, java.lang.String, boolean):aucb
     arg types: [android.accounts.Account, java.lang.String, int]
     candidates:
      rjx.a(int, java.lang.String, java.lang.String):aucb
      rjx.a(com.google.android.gms.location.internal.LocationRequestInternal, aehz, android.os.Looper):aucb
      rjx.a(java.lang.String, java.lang.String, byte[]):aucb
      rjx.a(com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean, boolean):aucb
      rjx.a(java.lang.String, int, int):rke
      rjx.a(android.app.Activity, int, asxx):void
      rjx.a(android.app.Activity, int, java.lang.String):void
      rjx.a(com.google.android.gms.location.internal.LocationRequestInternal, aehy, android.os.Looper):void
      rjx.a(java.lang.String, long, int):void
      artq.a(com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean, boolean):aucb
      gwh.a(android.accounts.Account, java.lang.String, boolean):aucb */
    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.credential_save_reject) {
            f10169e.mo25412b("User declined save.", new Object[0]);
            List list = this.f10175i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f10178l.mo12277a((Account) list.get(i), this.f10172f, true);
            }
            m6380a(404);
            m6381a(0, 403);
        } else if (view.getId() == C0126R.C0129id.credential_save_confirm) {
            f10169e.mo25412b("User confirmed save.", new Object[0]);
            this.f10178l.mo24732b(new gwa(this.f10176j, this.f10172f, this.f10173g));
            this.f10178l.mo12279a(this.f10172f);
            m6380a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
            m6381a(-1, ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Account account;
        int i;
        int i2;
        super.onCreate(bundle);
        setTheme(2132017253);
        getWindow().setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        setContentView((int) C0126R.C0128layout.credential_save_confirmation);
        Bundle bundle2 = (Bundle) bmxu.m108565a(bundle, (Bundle) bmxu.m108565a(getIntent().getExtras(), Bundle.EMPTY));
        String string = bundle2.getString("app_id");
        sdo.m34959a((Object) string);
        this.f10172f = string;
        this.f10173g = (Credential) sef.m35069a((byte[]) sdo.m34959a(bundle2.getByteArray("extra_credentials")), Credential.CREATOR);
        this.f10174h = bundle2.getBoolean("is_first_use");
        this.f10175i = bnfi.m109237a((Parcelable[]) sdo.m34959a(bundle2.getParcelableArray("available_accounts"))).mo67501a(htf.f20395a).mo67505b();
        if (bundle2.get("selected_account") == null) {
            account = (Account) this.f10175i.get(0);
        } else {
            account = (Account) bundle2.getParcelable("selected_account");
        }
        sdo.m34959a(account);
        this.f10176j = account;
        this.f10177k = bundle2.getLong("popup_time_millis", SystemClock.elapsedRealtime());
        String string2 = bundle2.getString("key_log_session_id");
        sdo.m34959a((Object) string2);
        this.f10170b = string2;
        this.f10178l = gvq.m14020a(this, hid.m14370a(string2).mo12481a());
        this.f10171c = new qws(this, "IDENTITY_GMSCORE", null);
        if (ccda.m129287b()) {
            adbs.m50134a(this, this, new htg(this));
        }
        findViewById(C0126R.C0129id.credential_save_reject).setOnClickListener(this);
        findViewById(C0126R.C0129id.credential_save_confirm).setOnClickListener(this);
        boolean isEmpty = TextUtils.isEmpty(this.f10173g.f10096e);
        int size = this.f10175i.size();
        if (size > 1) {
            Spinner spinner = (Spinner) findViewById(C0126R.C0129id.credential_save_account);
            spinner.setAdapter((SpinnerAdapter) new hth(this, this.f10175i));
            spinner.setSelection(this.f10175i.indexOf(this.f10176j));
            spinner.setOnItemSelectedListener(this);
            spinner.setVisibility(0);
        }
        if (this.f10174h) {
            m6380a(510);
            View findViewById = findViewById(C0126R.C0129id.google_logo);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(C0126R.C0129id.credential_save_confirmation);
            viewGroup.addView(LayoutInflater.from(this).inflate((int) C0126R.C0128layout.credentials_warm_welcome, viewGroup, false), 0);
            TextView textView = (TextView) findViewById(C0126R.C0129id.credentials_warm_welcome_text);
            Resources resources = getResources();
            textView.setText(m6379a(resources.getString(C0126R.string.credentials_warm_welcome_prefix), resources.getString(C0126R.string.credentials_warm_welcome_link_text), (String) hfe.f19643e.mo58455c(), null, true));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            int i3 = Build.VERSION.SDK_INT;
            if ((getResources().getConfiguration().screenLayout & 15) < 3) {
                setRequestedOrientation(1);
            }
            this.f10178l.mo12278a();
        }
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.credential_save_text);
        String c = qqt.m32669c(this.f10172f);
        String format = String.format("%1s://%2s", getString(C0126R.string.credentials_url_scheme), getString(C0126R.string.credentials_settings_host));
        if (!isEmpty) {
            i = C0126R.string.credentials_save_password_prefix;
        } else {
            i = C0126R.string.credentials_save_idp_prefix;
        }
        String format2 = String.format(getString(i), hds.m14227a(this, c));
        if (size > 1) {
            i2 = C0126R.string.credentials_save_suffix_multiple;
        } else {
            i2 = C0126R.string.credentials_save_suffix_single;
        }
        textView2.setText(m6379a(format2, getString(C0126R.string.credentials_save_link_text), format, getString(i2), false));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) findViewById(C0126R.C0129id.credential_save_confirm)).setText(getResources().getString(!isEmpty ? C0126R.string.credentials_save_confirm_password : C0126R.string.credentials_save_confirm_idp));
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            bxvd da = bodk.f132702h.mo74144da();
            String str = this.f10172f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodk bodk = (bodk) da.f164949b;
            str.getClass();
            bodk.f132704a |= 32;
            bodk.f132710g = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10177k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodk bodk2 = (bodk) da.f164949b;
            int i = bodk2.f132704a | 2;
            bodk2.f132704a = i;
            bodk2.f132706c = elapsedRealtime;
            int i2 = this.f10179m;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bodk2.f132705b = i3;
                int i4 = i | 1;
                bodk2.f132704a = i4;
                boolean z = this.f10174h;
                bodk2.f132704a = i4 | 16;
                bodk2.f132709f = z;
                his.m14426a().mo12510a((bodk) da.mo74062i());
            } else {
                throw null;
            }
        }
        super.onDestroy();
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f10176j = (Account) this.f10175i.get(i);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("app_id", this.f10172f);
        bundle.putByteArray("extra_credentials", sef.m35074a(this.f10173g));
        bundle.putBoolean("is_first_use", this.f10174h);
        bundle.putParcelable("selected_account", this.f10176j);
        bundle.putParcelableArray("available_accounts", (Parcelable[]) this.f10175i.toArray(new Account[0]));
        bundle.putLong("popup_time_millis", this.f10177k);
        bundle.putString("key_log_session_id", this.f10170b);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        m6380a(403);
        m6381a(0, ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
        return true;
    }

    /* renamed from: a */
    private static Spannable m6379a(String str, String str2, String str3, String str4, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new DefensiveURLSpan(str3, z), length, spannableStringBuilder.length(), 33);
        if (!TextUtils.isEmpty(str4)) {
            spannableStringBuilder.append((CharSequence) str4);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private final void m6380a(int i) {
        if (ccda.m129287b()) {
            qws qws = this.f10171c;
            bxvd da = bong.f133782r.mo74144da();
            String str = this.f10170b;
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
            String str2 = this.f10172f;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonb bonb = (bonb) da2.f164949b;
            str2.getClass();
            int i3 = bonb.f133756a | 8;
            bonb.f133756a = i3;
            bonb.f133760e = str2;
            bonb.f133757b = i - 1;
            bonb.f133756a = i3 | 1;
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

    /* renamed from: a */
    private final void m6381a(int i, int i2) {
        this.f10179m = i2;
        setResult(i);
        finish();
    }
}
