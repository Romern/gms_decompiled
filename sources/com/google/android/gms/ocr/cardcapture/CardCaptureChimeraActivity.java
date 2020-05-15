package com.google.android.gms.ocr.cardcapture;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardCaptureChimeraActivity extends deu implements akqa {

    /* renamed from: b */
    public String f81272b = "";

    /* renamed from: c */
    public String f81273c = "";

    /* renamed from: d */
    public Uri f81274d;

    /* renamed from: e */
    private akrz f81275e;

    /* renamed from: f */
    private akru f81276f;

    /* renamed from: g */
    private Menu f81277g;

    /* renamed from: h */
    private View f81278h;

    /* renamed from: i */
    private View f81279i;

    /* renamed from: j */
    private String f81280j = "";

    /* renamed from: k */
    private String f81281k = "";

    /* renamed from: l */
    private String f81282l = "";

    /* renamed from: m */
    private int f81283m;

    /* renamed from: n */
    private boolean f81284n;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final akpz mo39694a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.inflate((int) C0126R.C0128layout.card_capture_card_detector, viewGroup, true);
        if (!TextUtils.isEmpty(this.f81281k) && !this.f81284n) {
            Button button = (Button) viewGroup.findViewById(C0126R.C0129id.ocrSkipScanButton);
            button.requestFocus();
            button.setOnClickListener(new akrm(this));
            button.setText(this.f81281k);
        } else {
            viewGroup.findViewById(C0126R.C0129id.card_capture_skip_scan_button_container).setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f81282l)) {
            View findViewById = viewGroup.findViewById(C0126R.C0129id.card_capture_learn_more);
            this.f81278h = findViewById;
            ((TextView) findViewById.findViewById(C0126R.C0129id.card_capture_learn_more)).setText(Html.fromHtml(this.f81282l));
            this.f81279i = viewGroup.findViewById(C0126R.C0129id.card_capture_preview_overlay);
        }
        if (!TextUtils.isEmpty(this.f81280j)) {
            if (!this.f81284n) {
                TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.card_capture_info_message);
                textView.setBackgroundColor(this.f81283m);
                textView.setText(this.f81280j);
                textView.setVisibility(0);
            } else {
                TextView textView2 = (TextView) viewGroup.findViewById(C0126R.C0129id.card_capture_overlay_info_message);
                if (!TextUtils.isEmpty(this.f81281k)) {
                    String valueOf = String.valueOf(this.f81280j);
                    String valueOf2 = String.valueOf(this.f81281k);
                    SpannableString spannableString = new SpannableString(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
                    int length = this.f81280j.length();
                    spannableString.setSpan(new akrn(this), length, this.f81281k.length() + length, 33);
                    textView2.setText(spannableString);
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    textView2.setText(this.f81280j);
                }
                viewGroup.findViewById(C0126R.C0129id.card_capture_overlay_info_message_wrapper).setVisibility(0);
            }
        }
        if (!this.f81284n) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(C0126R.C0129id.card_capture_region_of_interest_wrapper);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.addRule(15, -1);
            frameLayout.setLayoutParams(layoutParams);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0126R.C0129id.card_capture_preview_wrapper);
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            layoutParams2.height = -2;
            viewGroup2.setLayoutParams(layoutParams2);
        }
        return new akrk((ViewGroup) viewGroup.findViewById(C0126R.C0129id.card_capture_region_of_interest));
    }

    /* renamed from: b */
    public final void mo39696b() {
        this.f81276f.mo39687d();
    }

    /* renamed from: bC */
    public final void mo39697bC() {
    }

    /* renamed from: c */
    public final void mo39698c() {
        setResult(10003);
        finish();
    }

    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof akru) {
            akru akru = (akru) fragment;
            this.f81275e.mo39749a(akru);
            akru.f72411j = this;
        }
    }

    public final void onBackPressed() {
        View view = this.f81278h;
        if (view != null && view.getVisibility() == 0) {
            mo44716a(false);
            return;
        }
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        spn.m35870c((Activity) this);
        this.f81275e = new akrz(this);
        setTheme(2132018582);
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        boolean z = true;
        mo8628aW().mo15853b(true);
        mo8628aW().mo15839a(0.0f);
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        akru akru = (akru) getSupportFragmentManager().findFragmentByTag("CardCaptureFragment");
        this.f81276f = akru;
        if (bundle == null || akru == null) {
            Bundle extras = getIntent().getExtras();
            akru akru2 = new akru();
            this.f81276f = akru2;
            akru2.setArguments(extras);
            getSupportFragmentManager().beginTransaction().add(16908290, this.f81276f, "CardCaptureFragment").commit();
        }
        Intent intent = getIntent();
        this.f81272b = intent.getStringExtra("com.google.android.gms.ocr.TITLE");
        this.f81273c = getResources().getString(C0126R.string.common_learn_more);
        this.f81280j = intent.getStringExtra("com.google.android.gms.ocr.INFO_MESSAGE");
        this.f81281k = intent.getStringExtra("com.google.android.gms.ocr.EXIT_BUTTON_LABEL");
        this.f81282l = intent.getStringExtra("com.google.android.gms.ocr.ADDITIONAL_INFO");
        this.f81274d = (Uri) intent.getParcelableExtra("com.google.android.gms.ocr.DOCUMENT_URI");
        this.f81283m = intent.getIntExtra("com.google.android.gms.ocr.PRIMARY_COLOR", getResources().getColor(C0126R.color.card_capture_payments_default_primary));
        if (!intent.getBooleanExtra("com.google.android.gms.ocr.EXTRA_HALF_SCREEN_CAMERA_PREVIEW", false) || TextUtils.isEmpty(this.f81280j)) {
            z = false;
        }
        this.f81284n = z;
        int i2 = Build.VERSION.SDK_INT;
        int intExtra = intent.getIntExtra("com.google.android.gms.ocr.STATUS_BAR_COLOR", getResources().getColor(C0126R.color.card_capture_payments_default_status_bar));
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(intExtra);
        mo8628aW().mo15851b(new ColorDrawable(this.f81283m));
        setTitle(this.f81272b);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(this.f81282l)) {
            return true;
        }
        this.f81277g = menu;
        getMenuInflater().inflate(C0126R.C0130menu.card_capture_menu, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != C0126R.C0129id.card_capture_learn_more) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            mo44716a(true);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo39695a(List list) {
        AsyncTask.execute(new akrl(this, list));
    }

    /* renamed from: a */
    public final void mo44716a(boolean z) {
        int i;
        if (!z) {
            this.f81276f.mo39742f();
        } else {
            this.f81276f.mo39743g();
        }
        View view = this.f81278h;
        int i2 = 8;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.f81279i;
        if (!z) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        this.f81277g.close();
        this.f81277g.findItem(C0126R.C0129id.card_capture_learn_more).setVisible(!z);
        setTitle(!z ? this.f81272b : this.f81273c);
    }
}
