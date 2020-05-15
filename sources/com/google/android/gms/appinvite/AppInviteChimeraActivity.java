package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p002v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.CustomSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.SelectionSectionInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInviteChimeraActivity extends deu implements TextWatcher, fwz, fxb, fxa, rjz, rka, fwm {

    /* renamed from: A */
    private String f9703A;

    /* renamed from: B */
    private String f9704B;

    /* renamed from: C */
    private String f9705C;

    /* renamed from: D */
    private String f9706D;

    /* renamed from: E */
    private boolean f9707E;

    /* renamed from: F */
    private boolean f9708F;

    /* renamed from: G */
    private CharSequence f9709G;

    /* renamed from: H */
    private CharSequence f9710H;

    /* renamed from: I */
    private int f9711I;

    /* renamed from: J */
    private boolean f9712J;

    /* renamed from: K */
    private long f9713K;

    /* renamed from: L */
    private long f9714L;

    /* renamed from: M */
    private long f9715M;

    /* renamed from: N */
    private long f9716N;

    /* renamed from: O */
    private long f9717O;

    /* renamed from: P */
    private long f9718P;

    /* renamed from: Q */
    private long f9719Q;

    /* renamed from: b */
    public rkb f9720b;

    /* renamed from: c */
    public String f9721c;

    /* renamed from: d */
    public fyn f9722d;

    /* renamed from: e */
    public Toolbar f9723e;

    /* renamed from: f */
    public TextView f9724f;

    /* renamed from: g */
    public EditText f9725g;

    /* renamed from: h */
    public View f9726h;

    /* renamed from: i */
    public fwy f9727i;

    /* renamed from: j */
    public Bitmap f9728j;

    /* renamed from: k */
    public View.OnClickListener f9729k;

    /* renamed from: l */
    public fuv f9730l;

    /* renamed from: m */
    public boolean f9731m;

    /* renamed from: n */
    public boolean f9732n;

    /* renamed from: o */
    public boolean f9733o;

    /* renamed from: p */
    private AppInviteResponseReceiver f9734p;

    /* renamed from: q */
    private List f9735q;

    /* renamed from: r */
    private Account f9736r;

    /* renamed from: s */
    private View f9737s;

    /* renamed from: t */
    private ImageView f9738t;

    /* renamed from: u */
    private ImageView f9739u;

    /* renamed from: v */
    private fwo f9740v;

    /* renamed from: w */
    private sox f9741w;

    /* renamed from: x */
    private fun f9742x;

    /* renamed from: y */
    private fuo f9743y;

    /* renamed from: z */
    private Uri f9744z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class AppInviteResponseReceiver extends aacn {
        public AppInviteResponseReceiver() {
            super("appinvite");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            AppInviteChimeraActivity.this.mo7253b(intent);
        }
    }

    /* renamed from: a */
    private static final ArrayList m6160a(Intent intent, String str) {
        ArrayList<CharSequence> charSequenceArrayListExtra = intent.getCharSequenceArrayListExtra(str);
        if (charSequenceArrayListExtra == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(charSequenceArrayListExtra.size());
        int size = charSequenceArrayListExtra.size();
        for (int i = 0; i < size; i++) {
            CharSequence charSequence = charSequenceArrayListExtra.get(i);
            arrayList.add(charSequence != null ? charSequence.toString() : null);
        }
        return arrayList;
    }

    /* renamed from: b */
    private final void m6164b(boolean z) {
        long j;
        List list;
        boolean z2;
        boolean z3;
        if (this.f9719Q != 0) {
            j = SystemClock.uptimeMillis() - this.f9719Q;
        } else {
            j = 0;
        }
        fuv fuv = this.f9730l;
        fwo fwo = this.f9740v;
        if (fwo != null) {
            list = fwo.mo11435b();
        } else {
            list = null;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f9713K;
        if (this.f9714L == 0 || this.f9715M == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f9715M != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int[] iArr = new int[4];
        fuv.m12435a(list, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        bxvd da = boji.f133277k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boji boji = (boji) da.f164949b;
        int i5 = 1 | boji.f133279a;
        boji.f133279a = i5;
        boji.f133280b = z;
        int i6 = i5 | 2;
        boji.f133279a = i6;
        boji.f133281c = i;
        int i7 = 4 | i6;
        boji.f133279a = i7;
        boji.f133282d = i4;
        int i8 = i7 | 8;
        boji.f133279a = i8;
        boji.f133283e = i3;
        int i9 = i8 | 16;
        boji.f133279a = i9;
        boji.f133284f = i2;
        int i10 = i9 | 32;
        boji.f133279a = i10;
        boji.f133285g = j;
        int i11 = i10 | 64;
        boji.f133279a = i11;
        boji.f133286h = uptimeMillis;
        int i12 = i11 | 128;
        boji.f133279a = i12;
        boji.f133287i = z2;
        boji.f133279a = i12 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        boji.f133288j = z3;
        fuv.mo11372a((boji) da.mo74062i(), 8, fuv.f17310b);
    }

    /* renamed from: l */
    private final void m6165l() {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        Uri uri;
        Bitmap bitmap;
        String str4;
        String str5;
        this.f9719Q = SystemClock.uptimeMillis();
        Uri uri2 = (Uri) getIntent().getParcelableExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
        Bundle bundleExtra = getIntent().getBundleExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
        if (bundleExtra != null) {
            HashMap hashMap2 = new HashMap(bundleExtra.size());
            for (String str6 : bundleExtra.keySet()) {
                hashMap2.put(str6, bundleExtra.getString(str6));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        if (uri2 != null) {
            str = uri2.toString();
        } else {
            str = null;
        }
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT");
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT");
        Uri uri3 = this.f9744z;
        boolean z = false;
        if (uri3 != null && !uri3.getScheme().equals("https") && !this.f9744z.getScheme().equals("http")) {
            z = true;
        }
        Context applicationContext = getApplicationContext();
        String a = spn.m35852a((Activity) this);
        String str7 = this.f9736r.name;
        String obj = this.f9725g.getText().toString();
        boolean z2 = this.f9712J;
        if (z2) {
            str2 = stringExtra2;
        } else {
            str2 = null;
        }
        if (z2) {
            str3 = stringExtra;
        } else {
            str3 = null;
        }
        String str8 = this.f9703A;
        String p = m6169p();
        ArrayList arrayList = this.f9740v.f17479r;
        String str9 = this.f9705C;
        String str10 = this.f9706D;
        if (!z) {
            uri = this.f9744z;
        } else {
            uri = null;
        }
        if (z) {
            bitmap = this.f9728j;
        } else {
            bitmap = null;
        }
        CharSequence charSequence = this.f9709G;
        if (charSequence != null) {
            str4 = charSequence.toString();
        } else {
            str4 = null;
        }
        CharSequence charSequence2 = this.f9710H;
        if (charSequence2 != null) {
            str5 = charSequence2.toString();
        } else {
            str5 = null;
        }
        fus fus = new fus(applicationContext, a, str7, obj, str2, str3, str, hashMap, str8, p, arrayList, str9, str10, uri, bitmap, str4, str5, this.f9711I);
        AppInviteIntentOperation.f9746a.offer(fus);
        startService(IntentOperation.getStartIntent(this, AppInviteIntentOperation.class, "com.google.android.gms.appinvite.send.INTENT"));
        this.f9735q.add(Long.valueOf(fus.f17283a));
    }

    /* renamed from: m */
    private final void m6166m() {
        boolean z;
        int i;
        fwo fwo = this.f9740v;
        if (fwo == null || !fwo.mo11433a()) {
            z = false;
        } else {
            z = true;
        }
        View view = this.f9737s;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (z) {
            sox sox = this.f9741w;
            if (sox != null && sox.isRunning()) {
                this.f9741w.stop();
            }
            this.f9738t.setVisibility(8);
        } else {
            if (this.f9741w == null) {
                sox a = fzh.m12777a(this.f9738t);
                this.f9741w = a;
                this.f9738t.setImageDrawable(a);
            }
            if (!this.f9741w.isRunning()) {
                this.f9741w.start();
            }
            this.f9738t.setVisibility(0);
        }
        supportInvalidateOptionsMenu();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("progressFragment");
        List list = this.f9735q;
        if (list == null || list.isEmpty()) {
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
        } else if (findFragmentByTag == null) {
            beginTransaction.add(fzh.m12776a(), "progressFragment");
        }
        if (!beginTransaction.isEmpty()) {
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* renamed from: n */
    private final void m6167n() {
        if (soz.m35801d(this, this.f9721c).size() > 1) {
            this.f9723e.mo1678a(new fum(this));
        }
    }

    /* renamed from: o */
    private final String m6168o() {
        int length = 100 - this.f9725g.getText().length();
        if (length < 0) {
            int i = -length;
            return getResources().getQuantityString(C0126R.plurals.appinvite_message_over_limit, i, Integer.valueOf(i));
        }
        return getResources().getQuantityString(C0126R.plurals.appinvite_message_within_limit, length, Integer.valueOf(length));
    }

    /* renamed from: p */
    private static final String m6169p() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    public final void afterTextChanged(Editable editable) {
        int length = 100 - editable.length();
        String o = m6168o();
        if (length < 0) {
            fzq.m12808a(this.f9725g, m6168o());
            this.f9707E = true;
            this.f9708F = true;
        } else if (!this.f9708F && length <= 10) {
            fzq.m12808a(this.f9725g, m6168o());
            this.f9707E = true;
            this.f9708F = true;
        }
        this.f9724f.setText(String.format(getString(C0126R.string.appinvite_message_limit), Integer.valueOf(editable.length()), 100));
        this.f9724f.setContentDescription(o);
        supportInvalidateOptionsMenu();
        if (!this.f9707E) {
            fzq.m12808a(this.f9725g, m6168o());
            this.f9707E = true;
        }
        this.f9731m = true;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: e */
    public final void mo7255e() {
        fzq.m12805a(this, getString(C0126R.string.appinvite_load_error), false, true);
        finish();
    }

    /* renamed from: g */
    public final synchronized void mo7256g() {
        this.f9716N = SystemClock.uptimeMillis() - this.f9713K;
    }

    /* renamed from: h */
    public final synchronized void mo7258h() {
        this.f9717O = SystemClock.uptimeMillis() - this.f9713K;
    }

    /* renamed from: i */
    public final synchronized void mo7259i() {
        this.f9718P = SystemClock.uptimeMillis() - this.f9713K;
    }

    /* renamed from: j */
    public final void mo7260j() {
        ArrayList arrayList = new ArrayList(soz.m35801d(this, this.f9721c));
        startActivityForResult(rew.m33487a(this.f9736r, arrayList, new String[]{"com.google"}, true, false, 1), 1);
    }

    /* renamed from: k */
    public final acm mo7261k() {
        return this.f9722d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.appinvite.AppInviteChimeraActivity.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      com.google.android.gms.appinvite.AppInviteChimeraActivity.a(android.content.Intent, java.lang.String):java.util.ArrayList
      com.google.android.gms.appinvite.AppInviteChimeraActivity.a(int, java.lang.CharSequence):android.os.Bundle
      com.google.android.gms.appinvite.AppInviteChimeraActivity.a(int, int):void
      com.google.android.gms.appinvite.AppInviteChimeraActivity.a(com.google.android.gms.appinvite.model.ContactPerson$ContactMethod, boolean):void
      com.google.android.gms.appinvite.AppInviteChimeraActivity.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void
      fwz.a(int, int):void
      fxb.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void
      fxa.a(com.google.android.gms.appinvite.model.ContactPerson$ContactMethod, boolean):void
      com.google.android.gms.appinvite.AppInviteChimeraActivity.a(android.accounts.Account, boolean):void */
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (i2 != -1) {
                fzq.m12805a(this, getString(C0126R.string.appinvite_send_error), false, true);
                setResult(203);
                finish();
                return;
            }
            m6165l();
        } else if (i2 == -1) {
            String stringExtra = intent.getStringExtra("authAccount");
            m6161a(new Account(stringExtra, "com.google"), true);
            SharedPreferences.Editor edit = getSharedPreferences("appinvite.default_account_prefs", 0).edit();
            edit.putString(this.f9721c, stringExtra);
            edit.apply();
            m6167n();
        } else if (this.f9736r == null) {
            m6164b(false);
            setResult(202);
            finish();
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (isFinishing()) {
            m6164b(false);
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        Account account;
        CharSequence charSequence;
        Account account2;
        Account account3;
        long[] longArray;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.appinvite_activity);
        String a = spn.m35852a((Activity) this);
        this.f9721c = a;
        String h = spn.m35895h(this, a);
        if (bundle2 != null) {
            this.f9704B = bundle2.getString("sessionId");
        } else {
            this.f9704B = m6169p();
        }
        fuv fuv = new fuv(getApplicationContext(), this.f9704B);
        this.f9730l = fuv;
        fuv.mo11371a();
        this.f9713K = SystemClock.uptimeMillis();
        Intent intent = getIntent();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS");
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.additionalPeople");
        ArrayList a2 = m6160a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS");
        ArrayList a3 = m6160a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES");
        ArrayList a4 = m6160a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS");
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.google.android.gms.appinvite.MESSAGE");
        Uri uri = (Uri) intent.getParcelableExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
        String uri2 = uri != null ? uri.toString() : null;
        int length = charSequenceExtra != null ? charSequenceExtra.length() : 0;
        if (TextUtils.isEmpty(this.f9721c)) {
            z2 = true;
            z = false;
        } else if (!cbvz.f178436a.mo6606a().mo75527j()) {
            z2 = true;
            z = false;
        } else {
            if (!cbvz.f178436a.mo6606a().mo75525h() || TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT")) || TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT"))) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f9712J = z3;
            setTitle(intent.getCharSequenceExtra("com.google.android.gms.appinvite.TITLE"));
            Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.toolbar);
            this.f9723e = toolbar;
            mo8626a(toolbar);
            this.f9737s = findViewById(C0126R.C0129id.fragment_container);
            this.f9738t = (ImageView) findViewById(C0126R.C0129id.progress_bar);
            this.f9735q = new ArrayList();
            if (bundle2 != null) {
                for (long j : bundle2.getLongArray("pendingOperations")) {
                    this.f9735q.add(Long.valueOf(j));
                }
            }
            if (bundle2 != null) {
                account = (Account) bundle2.getParcelable("account");
                this.f9732n = bundle2.getBoolean("messageFocused");
                this.f9731m = bundle2.getBoolean("message_edited");
                charSequenceExtra = bundle2.getString("message");
                this.f9707E = bundle2.getBoolean("messageLimitFirstEdit");
                this.f9708F = bundle2.getBoolean("messageLimitNearWarning");
                z4 = false;
            } else {
                z4 = false;
                this.f9730l.mo11373a(true, parcelableArrayListExtra, parcelableArrayListExtra2, a2, a3, a4, this.f9721c, h, length, uri2);
                account = (Account) intent.getParcelableExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
                this.f9732n = false;
            }
            fyn fyn = new fyn(getLayoutInflater().inflate((int) C0126R.C0128layout.appinvite_edit_message, (ViewGroup) this.f9737s, z4));
            this.f9722d = fyn;
            View view = fyn.f17641y;
            if (this.f9712J) {
                view.setOnClickListener(new fuh(this));
            } else {
                view.setVisibility(8);
            }
            this.f9744z = intent.getData();
            fyn fyn2 = this.f9722d;
            this.f9726h = fyn2.f17640x;
            ImageView imageView = fyn2.f17639w;
            this.f9739u = imageView;
            imageView.setContentDescription(getString(C0126R.string.appinvite_image_preview));
            this.f9729k = new fui(this);
            fwy fwy = (fwy) getSupportFragmentManager().findFragmentByTag("imagePreviewFragment");
            this.f9727i = fwy;
            if (fwy != null) {
                fwy.f17490a = this.f9729k;
            }
            this.f9739u.setOnClickListener(new fuj(this));
            fyn fyn3 = this.f9722d;
            this.f9724f = fyn3.f17638v;
            EditText editText = fyn3.f17636t;
            this.f9725g = editText;
            editText.setText(charSequenceExtra);
            if (charSequenceExtra != null && charSequenceExtra.length() > 100) {
                afterTextChanged(this.f9725g.getText());
            }
            this.f9725g.addTextChangedListener(this);
            this.f9725g.setOnFocusChangeListener(new ful(this));
            this.f9703A = intent.getStringExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID");
            this.f9705C = intent.getStringExtra("com.google.android.gms.appinvite.iosTargetApplication");
            this.f9706D = getIntent().getStringExtra("com.google.android.gms.appinvite.androidTargetApplication");
            if (rfz.m33557a(this).mo24610b(this.f9721c)) {
                charSequence = intent.getCharSequenceExtra("com.google.android.gms.appinvite.DESCRIPTION");
            } else {
                charSequence = null;
            }
            this.f9709G = charSequence;
            this.f9710H = intent.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT");
            this.f9711I = intent.getIntExtra("com.google.android.gms.appinvite.appMinimumVersionCode", z4 ? 1 : 0);
            try {
                Resources resources = createPackageContext(this.f9721c, z4).getResources();
                int identifier = resources.getIdentifier("ai_config", "xml", this.f9721c);
                if (identifier != 0) {
                    m6162a(resources.getXml(identifier));
                }
            } catch (PackageManager.NameNotFoundException e) {
                bqye.m113758a(e);
            }
            if (account == null) {
                account2 = null;
                String string = getSharedPreferences("appinvite.default_account_prefs", z4).getString(this.f9721c, null);
                if (!TextUtils.isEmpty(string)) {
                    account = new Account(string, "com.google");
                }
            } else {
                account2 = null;
            }
            if (account != null && soz.m35796b(this, account, this.f9721c)) {
                account3 = account;
            } else {
                List d = soz.m35801d(this, this.f9721c);
                if (d.size() == 1) {
                    account3 = (Account) d.get(z4);
                } else {
                    account3 = account2;
                }
            }
            if (account3 != null) {
                m6161a(account3, z4);
                m6167n();
                return;
            }
            mo7260j();
            return;
        }
        this.f9730l.mo11373a(false, parcelableArrayListExtra, parcelableArrayListExtra2, a2, a3, a4, this.f9721c, h, length, uri2);
        fzq.m12805a(this, getString(C0126R.string.appinvite_start_error), z, z2);
        if (!TextUtils.isEmpty(this.f9721c)) {
            i = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
        } else {
            i = ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
        }
        setResult(i);
        finish();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.appinvite_activity, menu);
        MenuItem item = menu.getItem(0);
        fwo fwo = this.f9740v;
        if (fwo == null || !fwo.mo11433a() || this.f9740v.f17479r.isEmpty() || this.f9725g.getText().length() == 0 || this.f9725g.getText().length() > 100) {
            item.getIcon().setColorFilter(getResources().getColor(C0126R.color.appinvite_disabled_send), PorterDuff.Mode.MULTIPLY);
            item.setEnabled(false);
        } else {
            item.getIcon().setColorFilter(getResources().getColor(C0126R.color.material_grey_white_1000), PorterDuff.Mode.MULTIPLY);
            item.setEnabled(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.menu_send || this.f9740v.f17479r.isEmpty()) {
            return false;
        }
        m6165l();
        m6164b(true);
        m6166m();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        unregisterReceiver(this.f9734p);
        fun fun = this.f9742x;
        if (fun != null) {
            fun.f17272a.mo9460b();
            fun.cancel(true);
            this.f9742x = null;
        }
        fuo fuo = this.f9743y;
        if (fuo != null) {
            fuo.cancel(true);
            this.f9743y = null;
        }
        rkb rkb = this.f9720b;
        if (rkb != null && (rkb.mo24806j() || this.f9720b.mo24805i())) {
            this.f9720b.mo24803g();
        }
        sox sox = this.f9741w;
        if (sox != null && sox.isRunning()) {
            this.f9741w.stop();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        rkb rkb;
        Intent intent;
        super.onResumeFragments();
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        AppInviteResponseReceiver appInviteResponseReceiver = new AppInviteResponseReceiver();
        this.f9734p = appInviteResponseReceiver;
        registerReceiver(appInviteResponseReceiver, intentFilter);
        ArrayList arrayList = new ArrayList(this.f9735q);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Long l = (Long) arrayList.get(i);
            if (AppInviteIntentOperation.f9747b.mo11355a(Long.valueOf(l.longValue()))) {
                long longValue = l.longValue();
                fuq fuq = AppInviteIntentOperation.f9747b;
                Long valueOf = Long.valueOf(longValue);
                if (fuq.mo11355a(valueOf)) {
                    intent = (Intent) AppInviteIntentOperation.f9747b.f17281a.get(valueOf);
                } else {
                    intent = null;
                }
                mo7253b(intent);
            }
        }
        if ((!this.f9733o || this.f9739u.getDrawable() == null) && (rkb = this.f9720b) != null) {
            rkb.mo24801e();
        }
        m6166m();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int size = this.f9735q.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) this.f9735q.get(i)).longValue();
        }
        bundle.putLongArray("pendingOperations", jArr);
        bundle.putString("sessionId", this.f9704B);
        bundle.putParcelable("account", this.f9736r);
        bundle.putString("message", this.f9725g.getText().toString());
        bundle.putBoolean("messageFocused", this.f9732n);
        bundle.putBoolean("messageLimitFirstEdit", this.f9707E);
        bundle.putBoolean("messageLimitNearWarning", this.f9708F);
        bundle.putBoolean("message_edited", this.f9731m);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f9730l.mo11371a();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        fuv fuv = this.f9730l;
        if (fuv.f17307a) {
            fuv.f17311c.mo24803g();
        }
        super.onStop();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        Account account;
        if (!this.f9733o && (account = this.f9736r) != null) {
            fun fun = new fun(this, this, this.f9720b, account.name, this.f9723e);
            this.f9742x = fun;
            fun.execute(new Void[0]);
        }
        if (!this.f9712J && this.f9744z != null && this.f9739u.getDrawable() == null) {
            fuo fuo = new fuo(this, this, this.f9744z, this.f9739u);
            this.f9743y = fuo;
            fuo.execute(new Void[0]);
        }
    }

    /* renamed from: a */
    private final void m6161a(Account account, boolean z) {
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String[] strArr;
        Account account2 = account;
        if (account2 != null && !account2.equals(this.f9736r)) {
            if (this.f9736r != null) {
                fuv fuv = this.f9730l;
                bxvd da = boin.f133196c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boin boin = (boin) da.f164949b;
                boin.f133198a |= 1;
                boin.f133199b = true;
                fuv.mo11372a((boin) da.mo74062i(), 9, fuv.f17310b);
            }
            if (this.f9722d.f201a.getParent() != null) {
                ((ViewGroup) this.f9722d.f201a.getParent()).removeView(this.f9722d.f201a);
            }
            this.f9736r = account2;
            this.f9723e.mo1690d((int) C0126R.C0127drawable.product_logo_avatar_circle_blue_color_48);
            this.f9723e.mo1684c((int) C0126R.string.common_choose_account);
            this.f9733o = false;
            this.f9726h.setVisibility(8);
            ArrayList arrayList5 = null;
            this.f9739u.setImageDrawable(null);
            allp a = allq.m61232a();
            a.f73626a = 80;
            allq a2 = a.mo40491a();
            rkb rkb = this.f9720b;
            if (rkb != null && (rkb.mo24805i() || this.f9720b.mo24806j())) {
                this.f9720b.mo24803g();
            }
            rjy rjy = new rjy(this);
            rjy.mo24778a(this.f9736r.name);
            rjy.mo24781a((rjz) this);
            rjy.mo24782a((rka) this);
            rjy.mo24780a(allr.f73629a, a2);
            this.f9720b = rjy.mo24784b();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            fwo fwo = (fwo) supportFragmentManager.findFragmentByTag("selectionFragment");
            this.f9740v = fwo;
            if (z || fwo == null) {
                Intent intent = getIntent();
                boolean hasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.telephony");
                int i = Build.VERSION.SDK_INT;
                int checkSelfPermission = checkSelfPermission("android.permission.SEND_SMS");
                if (!hasSystemFeature) {
                    z2 = false;
                } else {
                    z2 = checkSelfPermission == 0;
                }
                if (rfz.m33557a(this).mo24610b(this.f9721c)) {
                    arrayList5 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS");
                    arrayList3 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.additionalPeople");
                    arrayList2 = m6160a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS");
                    arrayList = m6160a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES");
                    arrayList4 = m6160a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS");
                } else {
                    arrayList4 = null;
                    arrayList3 = null;
                    arrayList2 = null;
                    arrayList = null;
                }
                Resources resources = getResources();
                String[] split = cbvz.f178436a.mo6606a().mo75523f().split(";");
                String[] split2 = cbvz.f178436a.mo6606a().mo75521d().split(";");
                String[] split3 = cbvz.f178436a.mo6606a().mo75522e().split(";");
                if (!z2) {
                    split = m6163a(split);
                    split2 = m6163a(split2);
                    strArr = m6163a(split3);
                } else {
                    strArr = split3;
                }
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new CustomSectionInfo(new int[]{C0126R.C0128layout.appinvite_edit_message}));
                SelectionSectionInfo selectionSectionInfo = new SelectionSectionInfo();
                selectionSectionInfo.f9803p = true;
                selectionSectionInfo.f9804a = getString(C0126R.string.appinvite_recipients_hint);
                arrayList6.add(selectionSectionInfo);
                ListSectionInfo listSectionInfo = new ListSectionInfo("suggested");
                listSectionInfo.f9789b = split;
                listSectionInfo.f9796i = 1;
                listSectionInfo.f9799l = arrayList5;
                listSectionInfo.f9800m = arrayList2;
                listSectionInfo.mo7294a(arrayList);
                listSectionInfo.mo7295b(arrayList4);
                listSectionInfo.f9794g = getString(C0126R.string.appinvite_grid_header);
                arrayList6.add(listSectionInfo);
                ListSectionInfo listSectionInfo2 = new ListSectionInfo("identityPeople");
                listSectionInfo2.f9791d = "useCachedContacts";
                listSectionInfo2.f9789b = split2;
                listSectionInfo2.f9792e = true;
                listSectionInfo2.f9796i = 2;
                listSectionInfo2.f9799l = arrayList3;
                listSectionInfo2.f9794g = getString(C0126R.string.appinvite_list_header);
                arrayList6.add(listSectionInfo2);
                this.f9740v = fwo.m12510a(this.f9736r.name, (int) cbvz.f178436a.mo6606a().mo75537t(), null, true, null, false, strArr, false, resources.getInteger(C0126R.integer.appinivte_num_portrait_grid_columns), resources.getInteger(C0126R.integer.appinivte_num_landscape_grid_columns), arrayList6, this.f9721c, false, null, null, null, null, true);
                supportFragmentManager.beginTransaction().replace(C0126R.C0129id.fragment_container, this.f9740v, "selectionFragment").commitAllowingStateLoss();
            }
            fwo fwo2 = this.f9740v;
            fwo2.f17466e = this;
            fwo2.f17467f = this;
            fwo2.f17468g = this;
            fwo2.f17485x = this;
        }
    }

    /* renamed from: b */
    public final synchronized void mo7252b(int i, int i2) {
        if (this.f9714L == 0) {
            this.f9714L = SystemClock.uptimeMillis() - this.f9713K;
        }
        m6166m();
    }

    /* renamed from: b */
    public final void mo7253b(Intent intent) {
        Long valueOf = Long.valueOf(intent.getLongExtra("appOperationCode", -1));
        if (!this.f9735q.contains(valueOf)) {
            fzq.m12805a(this, getString(C0126R.string.appinvite_send_error), false, true);
            m6166m();
            return;
        }
        this.f9735q.remove(valueOf);
        long longValue = valueOf.longValue();
        fuq fuq = AppInviteIntentOperation.f9747b;
        Long valueOf2 = Long.valueOf(longValue);
        if (fuq.f17281a.containsKey(valueOf2)) {
            fuq.f17281a.remove(valueOf2);
            fuq.f17282b.remove(valueOf2);
        }
        if (intent.hasExtra("com.google.android.gms.appinvite.errorType")) {
            int intExtra = intent.getIntExtra("com.google.android.gms.appinvite.errorType", 0);
            if (intExtra == 1) {
                setResult(intent.getIntExtra("com.google.android.gms.appinvite.errorCode", 204));
                finish();
            } else if (intExtra == 2) {
                m6166m();
                this.f9719Q = 0;
            } else if (intExtra != 3) {
                setResult(204);
                finish();
            } else {
                Intent intent2 = (Intent) intent.getParcelableExtra("com.google.android.gms.appinvite.authIntent");
                if (intent2 != null) {
                    startActivityForResult(intent2, 2);
                } else {
                    setResult(203);
                    finish();
                }
            }
            if (isFinishing()) {
                m6164b(false);
            } else {
                fzq.m12805a(this, getString(C0126R.string.appinvite_send_error), false, true);
            }
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("appInviteResult");
            fzq.m12805a(this, getString(C0126R.string.appinvite_invitation_sent), false, false);
            Intent intent3 = new Intent();
            intent3.putExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS", stringArrayExtra);
            setResult(-1, intent3);
            finish();
            m6164b(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[Catch:{ IOException | XmlPullParserException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c A[Catch:{ IOException | XmlPullParserException -> 0x009d }] */
    /* renamed from: a */
    private final void m6162a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2 && xmlResourceParser.getName().toLowerCase().equals("string")) {
                    String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                    String trim = xmlResourceParser.nextText().trim();
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (!TextUtils.isEmpty(trim)) {
                            int hashCode = attributeValue.hashCode();
                            char c = 65535;
                            if (hashCode != -1657726487) {
                                if (hashCode != -1567212789) {
                                    if (hashCode == 1737683639 && attributeValue.equals("ga_trackingId")) {
                                        c = 0;
                                        if (c == 0) {
                                            if (c != 1) {
                                                if (c == 2) {
                                                    if (TextUtils.isEmpty(this.f9706D)) {
                                                        this.f9706D = trim;
                                                    }
                                                }
                                            } else if (TextUtils.isEmpty(this.f9705C)) {
                                                this.f9705C = trim;
                                            }
                                        } else if (TextUtils.isEmpty(this.f9703A)) {
                                            this.f9703A = trim;
                                        }
                                    }
                                } else if (attributeValue.equals("ai_ios_target_application")) {
                                    c = 1;
                                    if (c == 0) {
                                    }
                                }
                            } else if (attributeValue.equals("ai_android_target_application")) {
                                c = 2;
                                if (c == 0) {
                                }
                            }
                            if (c == 0) {
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException e) {
            Log.e("AppInvite", "Error parsing configuration file");
        }
    }

    /* renamed from: a */
    private static final String[] m6163a(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.remove("phone");
        return arrayList.size() != strArr.length ? (String[]) arrayList.toArray(new String[arrayList.size()]) : strArr;
    }

    /* renamed from: a */
    public final Bundle mo7243a(int i, CharSequence charSequence) {
        Bundle bundle = new Bundle();
        bundle.putInt("View_id", qkj.m32287a(this, i));
        bundle.putCharSequence("TextView_text", charSequence);
        return bundle;
    }

    /* renamed from: a */
    public final synchronized void mo7245a(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f9713K;
        this.f9715M = uptimeMillis;
        if (this.f9714L == 0) {
            this.f9714L = uptimeMillis;
        }
        m6166m();
        fuv fuv = this.f9730l;
        long j = this.f9715M;
        long j2 = this.f9714L;
        long j3 = this.f9716N;
        long j4 = this.f9717O;
        long j5 = this.f9718P;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fuv.m12433a(2, j));
        arrayList.add(fuv.m12433a(1, j2));
        arrayList.add(fuv.m12433a(3, j3));
        arrayList.add(fuv.m12433a(4, j4));
        arrayList.add(fuv.m12433a(5, j5));
        bxvd da = bojo.f133310e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bojo bojo = (bojo) da.f164949b;
        int i3 = 1 | bojo.f133312a;
        bojo.f133312a = i3;
        bojo.f133313b = i;
        bojo.f133312a = i3 | 2;
        bojo.f133314c = i2;
        if (!arrayList.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojo bojo2 = (bojo) da.f164949b;
            if (!bojo2.f133315d.mo73666a()) {
                bojo2.f133315d = GeneratedMessageLite.m124021a(bojo2.f133315d);
            }
            bxsy.m123078a(arrayList, bojo2.f133315d);
        }
        fuv.mo11372a((bojo) da.mo74062i(), 3, fuv.f17310b);
    }

    /* renamed from: a */
    public final void mo7246a(ContactPerson.ContactMethod contactMethod, boolean z) {
        fuv fuv = this.f9730l;
        bxvd da = bojh.f133272d.mo74144da();
        int i = contactMethod.f9755a;
        if (i == 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojh bojh = (bojh) da.f164949b;
            bojh.f133275b = 1;
            bojh.f133274a |= 1;
        } else if (i == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojh bojh2 = (bojh) da.f164949b;
            bojh2.f133275b = 2;
            bojh2.f133274a |= 1;
        } else if (i != 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojh bojh3 = (bojh) da.f164949b;
            bojh3.f133275b = 0;
            bojh3.f133274a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojh bojh4 = (bojh) da.f164949b;
            bojh4.f133275b = 3;
            bojh4.f133274a |= 1;
        }
        bojh bojh5 = (bojh) da.f164949b;
        bojh5.f133274a = 2 | bojh5.f133274a;
        bojh5.f133276c = z;
        fuv.mo11372a((bojh) da.mo74062i(), 7, fuv.f17310b);
    }

    /* renamed from: a */
    public final void mo7247a(ContactPerson contactPerson, int i, int i2, boolean z) {
        ContactPerson.ContactMethod a;
        fuv fuv = this.f9730l;
        int a2 = boiw.m111244a(i);
        boit boit = null;
        if (!(contactPerson == null || (a = contactPerson.mo7263a()) == null)) {
            bxvd da = boit.f133228c.mo74144da();
            int i3 = a.f9755a;
            if (i3 == 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boit boit2 = (boit) da.f164949b;
                boit2.f133231b = 1;
                boit2.f133230a |= 1;
            } else if (i3 == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boit boit3 = (boit) da.f164949b;
                boit3.f133231b = 2;
                boit3.f133230a |= 1;
            } else if (i3 != 2) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boit boit4 = (boit) da.f164949b;
                boit4.f133231b = 0;
                boit4.f133230a |= 1;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boit boit5 = (boit) da.f164949b;
                boit5.f133231b = 3;
                boit5.f133230a |= 1;
            }
            boit = (boit) da.mo74062i();
        }
        bxvd da2 = boix.f133240f.mo74144da();
        if (a2 != 0) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boix boix = (boix) da2.f164949b;
            boix.f133243b = a2 - 1;
            boix.f133242a |= 1;
        }
        if (boit != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boix boix2 = (boix) da2.f164949b;
            boit.getClass();
            boix2.f133244c = boit;
            boix2.f133242a |= 2;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boix boix3 = (boix) da2.f164949b;
        int i4 = boix3.f133242a | 4;
        boix3.f133242a = i4;
        boix3.f133245d = i2;
        boix3.f133242a = i4 | 8;
        boix3.f133246e = z;
        fuv.mo11372a((boix) da2.mo74062i(), 5, fuv.f17310b);
    }

    /* renamed from: a */
    public final void mo7248a(ContactPerson contactPerson, boolean z) {
        if (z != this.f9740v.f17479r.isEmpty()) {
            supportInvalidateOptionsMenu();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f9720b.mo24801e();
    }

    /* renamed from: a */
    public final void mo7250a(boolean z) {
        fuv fuv = this.f9730l;
        boolean z2 = !z;
        bxvd da = bojf.f133267c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bojf bojf = (bojf) da.f164949b;
        bojf.f133269a |= 1;
        bojf.f133270b = z2;
        fuv.mo11372a((bojf) da.mo74062i(), 6, fuv.f17310b);
    }
}
