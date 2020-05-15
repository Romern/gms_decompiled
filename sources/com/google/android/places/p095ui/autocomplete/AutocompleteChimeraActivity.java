package com.google.android.places.p095ui.autocomplete;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.places.PlacesLoggingChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutocompleteChimeraActivity extends deu {

    /* renamed from: b */
    rjy f151394b;

    /* renamed from: c */
    rjy f151395c;

    /* renamed from: d */
    rkb f151396d;

    /* renamed from: e */
    public SessionLogger f151397e;

    /* renamed from: f */
    public bikz f151398f;

    /* renamed from: g */
    public EditText f151399g;

    /* renamed from: h */
    public RecyclerView f151400h;

    /* renamed from: i */
    public View f151401i;

    /* renamed from: j */
    public View f151402j;

    /* renamed from: k */
    public TextView f151403k;

    /* renamed from: l */
    public Button f151404l;

    /* renamed from: m */
    public boolean f151405m = false;

    /* renamed from: n */
    public boolean f151406n = false;

    /* renamed from: o */
    public boolean f151407o;

    /* renamed from: p */
    private Handler f151408p;

    /* renamed from: q */
    private rkb f151409q;

    /* renamed from: r */
    private ImageButton f151410r;

    /* renamed from: s */
    private boolean f151411s = false;

    /* renamed from: t */
    private rke f151412t;

    /* renamed from: u */
    private String f151413u;

    /* renamed from: e */
    public final void mo71313e() {
        this.f151397e.f151421h++;
        aepl c = this.f151398f.getFilter();
        String obj = this.f151399g.getText().toString();
        c.publishResults(obj, c.performFiltering(obj));
    }

    /* renamed from: g */
    public final void mo71314g() {
        if (this.f151399g.getText().toString().isEmpty()) {
            this.f151410r.setVisibility(4);
        } else {
            this.f151410r.setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void mo71315h() {
        this.f151408p.removeCallbacksAndMessages(null);
        this.f151401i.setVisibility(8);
        this.f151400h.setVisibility(0);
    }

    /* renamed from: i */
    public final void mo71316i() {
        this.f151411s = true;
        this.f151397e.f151418e = true;
        mo71311a(0, null, Status.f30111e);
    }

    public final void onBackPressed() {
        mo71316i();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        bpqe bpqe;
        this.f151408p = new adzt(Looper.getMainLooper());
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("mode", -1);
        if (intExtra != 2) {
            setTheme(2132019833);
        }
        super.onCreate(bundle);
        StrictMode.allowThreadDiskReads();
        StrictMode.allowThreadDiskWrites();
        if (intExtra == 2) {
            setContentView((int) C0126R.C0128layout.place_autocomplete_main_overlay);
            findViewById(C0126R.C0129id.back_button).setOnClickListener(new bikm(this));
            View findViewById = findViewById(C0126R.C0129id.root);
            findViewById(C0126R.C0129id.content).setOnTouchListener(new bikn());
            findViewById.setOnTouchListener(new biko(this));
        } else {
            setContentView((int) C0126R.C0128layout.place_autocomplete_main_fullscreen);
            Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.action_bar);
            findViewById(C0126R.C0129id.back_button).setVisibility(8);
            toolbar.mo1690d((int) C0126R.C0127drawable.ic_arrow_back_grey600_24dp);
            mo8626a(toolbar);
            toolbar.mo1678a(new bikp(this));
            getWindow().setSoftInputMode(16);
        }
        this.f151399g = (EditText) findViewById(C0126R.C0129id.edit_text);
        this.f151400h = (RecyclerView) findViewById(C0126R.C0129id.list);
        this.f151401i = findViewById(C0126R.C0129id.error);
        this.f151402j = findViewById(C0126R.C0129id.place_autocomplete_error_progress);
        this.f151403k = (TextView) findViewById(C0126R.C0129id.error_message);
        this.f151410r = (ImageButton) findViewById(C0126R.C0129id.clear_button);
        this.f151404l = (Button) findViewById(C0126R.C0129id.try_again);
        int i = 3;
        int i2 = 0;
        if (bundle == null || !bundle.containsKey("session")) {
            this.f151397e = new SessionLogger();
            int intExtra2 = intent.getIntExtra("origin", -1);
            if (intExtra2 == 1) {
                bpqe = bpqe.ANDROID_AUTOCOMPLETE_FRAGMENT;
            } else if (intExtra2 == 2) {
                bpqe = bpqe.ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER;
            } else if (intExtra2 != 3) {
                bpqe = bpqe.UNKNOWN_ORIGIN;
            } else {
                bpqe = bpqe.ANDROID_PLACE_PICKER;
            }
            SessionLogger sessionLogger = this.f151397e;
            if (bpqe != null) {
                sessionLogger.f151414a = bpqe.f138707j;
            } else {
                sessionLogger.f151414a = 0;
            }
            if (intExtra == 2) {
                sessionLogger.f151415b = 1;
            } else {
                sessionLogger.f151415b = 2;
            }
            String obj = this.f151399g.getText().toString();
            bmxy.m108601b(sessionLogger.f151424k == null, "Input value must be initialized exactly once");
            sessionLogger.f151424k = obj;
        } else {
            this.f151397e = (SessionLogger) bundle.getParcelable("session");
        }
        Intent intent2 = getIntent();
        ComponentName b = spn.m35865b((Activity) this);
        if (b == null || b.getPackageName() == null) {
            str = null;
        } else {
            str = b.getPackageName();
            if (str.equals("com.google.android.gms") && intent2.hasExtra("forwarded_app")) {
                str = intent2.getStringExtra("forwarded_app");
            }
        }
        this.f151413u = str;
        if (str == null) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Cannot find caller. Did you forget to use startActivityForResult?");
            }
            finish();
            return;
        }
        if (this.f151397e.mo71317a() != bpqe.ANDROID_PLACE_PICKER) {
            rjy rjy = new rjy(this);
            rjo rjo = aema.f63501a;
            aemh aemh = new aemh();
            aemh.f63515a = this.f151413u;
            aemh.f63517c = 0;
            rjy.mo24780a(rjo, aemh.mo34328a());
            rjy.mo24775a(this, 1, null);
            this.f151395c = rjy;
            this.f151396d = rjy.mo24784b();
        } else {
            i = 1;
        }
        rjy rjy2 = new rjy(this);
        rjo rjo2 = aema.f63501a;
        aemh aemh2 = new aemh();
        aemh2.f63515a = this.f151413u;
        aemh2.f63517c = i;
        rjy2.mo24780a(rjo2, aemh2.mo34328a());
        rjy2.mo24775a(this, 0, null);
        rjy2.mo24781a(new bikq(this));
        this.f151394b = rjy2;
        if (intent.hasExtra("account_name")) {
            this.f151394b.mo24778a(intent.getStringExtra("account_name"));
        }
        this.f151409q = this.f151394b.mo24784b();
        if (bundle != null) {
            this.f151407o = bundle.getBoolean("api_key_verified");
        }
        bikz bikz = new bikz(this.f151409q);
        this.f151398f = bikz;
        bikz.f120804a.f63600e = (LatLngBounds) intent.getParcelableExtra("bounds");
        this.f151398f.f120804a.f63601f = (AutocompleteFilter) intent.getParcelableExtra("filter");
        this.f151398f.f120804a.f63603h = new bikr(this);
        try {
            abu.class.getDeclaredMethod("h", new Class[0]);
            this.f151400h.setLayoutManager(new aah(1));
        } catch (NoSuchMethodException e) {
            this.f151400h.setLayoutManager(new bikw());
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f151400h.setItemAnimator(new bilb(getResources()));
        this.f151400h.addOnScrollListener(new biks(this));
        this.f151398f.f120804a.f63602g = new bikt(this);
        this.f151399g.setText(intent.getStringExtra("initial_query"));
        if (this.f151397e.mo71317a() == bpqe.ANDROID_PLACE_PICKER) {
            this.f151399g.post(new biku(this));
        }
        EditText editText = this.f151399g;
        editText.setSelection(editText.getText().length());
        this.f151399g.addTextChangedListener(new bikg(this));
        this.f151399g.setOnEditorActionListener(new bikh(this));
        this.f151410r.setOnClickListener(new biki(this));
        this.f151401i.setOnClickListener(new bikj(this));
        this.f151404l.setOnClickListener(new bikk(this));
        this.f151400h.setAdapter(this.f151398f);
        mo71315h();
        mo71314g();
        if (intExtra == 1) {
            int intExtra3 = intent.getIntExtra("primary_color", 0);
            int intExtra4 = intent.getIntExtra("primary_color_dark", 0);
            if (Color.alpha(intExtra3) >= 255) {
                i2 = intExtra3;
            }
            if (i2 != 0 && intExtra4 != 0) {
                int a = biha.m102383a(i2, getResources().getColor(C0126R.color.text_white_alpha_87), getResources().getColor(C0126R.color.text_black_alpha_87));
                int a2 = biha.m102383a(i2, getResources().getColor(C0126R.color.text_white_alpha_26), getResources().getColor(C0126R.color.text_black_alpha_26));
                bigz.m102378a(this, i2, intExtra4, a);
                this.f151399g.setTextColor(a);
                this.f151399g.setHintTextColor(a2);
                Drawable drawable = this.f151410r.getDrawable();
                bigz.m102377a(drawable, a);
                this.f151410r.setImageDrawable(drawable);
            }
        } else if (intExtra == 2) {
            int i4 = Build.VERSION.SDK_INT;
            getWindow().addFlags(67108864);
            View findViewById2 = findViewById(C0126R.C0129id.root);
            findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop() + spa.m35814a(getContainerActivity()), findViewById2.getPaddingRight(), findViewById2.getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (super.isFinishing()) {
            if (!this.f151411s && !this.f151406n) {
                this.f151397e.f151419f = true;
            }
            SessionLogger sessionLogger = this.f151397e;
            PlacesParams placesParams = new PlacesParams(this.f151413u, Locale.getDefault(), null);
            Context applicationContext = getApplicationContext();
            if (sessionLogger.f151416c) {
                Log.wtf("Places", "Already logged");
            } else {
                bxvd da = bpqf.f138708q.mo74144da();
                bpqe a = sessionLogger.mo71317a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpqf bpqf = (bpqf) da.f164949b;
                bpqf.f138711b = a.f138707j;
                bpqf.f138710a |= 1;
                int a2 = bpqc.m112169a(sessionLogger.f151415b);
                if (a2 != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpqf bpqf2 = (bpqf) da.f164949b;
                    bpqf2.f138712c = a2;
                    bpqf2.f138710a |= 2;
                }
                boolean z = sessionLogger.f151417d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpqf bpqf3 = (bpqf) da.f164949b;
                int i = bpqf3.f138710a | 4;
                bpqf3.f138710a = i;
                bpqf3.f138713d = z;
                boolean z2 = sessionLogger.f151418e;
                int i2 = i | 8;
                bpqf3.f138710a = i2;
                bpqf3.f138714e = z2;
                boolean z3 = sessionLogger.f151419f;
                int i3 = i2 | 16;
                bpqf3.f138710a = i3;
                bpqf3.f138715f = z3;
                int i4 = sessionLogger.f151420g;
                int i5 = i3 | 32;
                bpqf3.f138710a = i5;
                bpqf3.f138716g = i4;
                int i6 = sessionLogger.f151421h;
                int i7 = i5 | 64;
                bpqf3.f138710a = i7;
                bpqf3.f138717h = i6;
                int i8 = sessionLogger.f151422i;
                int i9 = i7 | 128;
                bpqf3.f138710a = i9;
                bpqf3.f138718i = i8;
                int i10 = sessionLogger.f151423j;
                bpqf3.f138710a = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bpqf3.f138719j = i10;
                int length = sessionLogger.f151424k.length();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpqf bpqf4 = (bpqf) da.f164949b;
                int i11 = bpqf4.f138710a | 512;
                bpqf4.f138710a = i11;
                bpqf4.f138720k = length;
                int i12 = sessionLogger.f151425l;
                int i13 = i11 | 1024;
                bpqf4.f138710a = i13;
                bpqf4.f138721l = i12;
                int i14 = sessionLogger.f151426m;
                int i15 = i13 | 2048;
                bpqf4.f138710a = i15;
                bpqf4.f138722m = i14;
                boolean z4 = sessionLogger.f151427n;
                int i16 = i15 | 4096;
                bpqf4.f138710a = i16;
                bpqf4.f138723n = z4;
                int i17 = sessionLogger.f151428o;
                bpqf4.f138710a = i16 | 8192;
                bpqf4.f138724o = i17;
                int b = (int) cggj.m145235b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpqf bpqf5 = (bpqf) da.f164949b;
                bpqf5.f138710a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                bpqf5.f138725p = b;
                bpqf bpqf6 = (bpqf) da.mo74062i();
                bpqk c = bhqq.m101365c(10, placesParams);
                bxvd bxvd = (bxvd) c.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) c);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpqk bpqk = (bpqk) bxvd.f164949b;
                bpqk bpqk2 = bpqk.f138732w;
                bpqf6.getClass();
                bpqk.f138750q = bpqf6;
                bpqk.f138734a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                PlacesLoggingChimeraService.m117712a(applicationContext, (bpqk) bxvd.mo74062i());
                sessionLogger.f151416c = true;
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        SessionLogger sessionLogger = this.f151397e;
        if (!sessionLogger.mo71318b()) {
            Log.wtf("Places", "Already inactive!");
        } else {
            sessionLogger.f151428o += (int) (SystemClock.elapsedRealtime() - sessionLogger.f151429p);
            sessionLogger.f151429p = -1;
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        SessionLogger sessionLogger = this.f151397e;
        if (sessionLogger.mo71318b()) {
            Log.wtf("Places", "Already active!");
        } else {
            sessionLogger.f151429p = SystemClock.elapsedRealtime();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("session", this.f151397e);
        bundle.putBoolean("api_key_verified", this.f151407o);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (this.f151396d != null && !this.f151407o) {
            rke rke = this.f151412t;
            if (rke != null) {
                rke.mo9460b();
            }
            rjo rjo = aema.f63501a;
            rkb rkb = this.f151396d;
            rle a = rkb.mo24787a((rle) new aemw(aema.f63501a, rkb));
            this.f151412t = a;
            a.mo9459a(new bikv(this), cggj.m145237d(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.common.internal.safeparcel.SafeParcelable, aelh], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo71311a(int i, aelh r4, Status status) {
        Intent intent = new Intent();
        if (r4 != 0) {
            sef.m35071a((SafeParcelable) r4, intent, "selected_place");
        }
        sef.m35071a(status, intent, "status");
        setResult(i, intent);
        supportFinishAfterTransition();
    }

    /* renamed from: a */
    public final void mo71312a(String str, boolean z) {
        this.f151408p.removeCallbacksAndMessages(null);
        this.f151408p.postDelayed(new bikl(this, str, z), cggj.f186839a.mo6606a().mo83703c());
    }
}
