package com.google.android.gms.ocr.giftcard;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.ocr.GiftCardOcrResult;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GiftCardOcrChimeraActivity extends deu implements akqa {

    /* renamed from: b */
    public int f81317b;

    /* renamed from: c */
    private aktm f81318c;

    /* renamed from: d */
    private aktr f81319d;

    /* renamed from: e */
    private int f81320e;

    /* renamed from: f */
    private int f81321f;

    /* renamed from: g */
    private String f81322g;

    /* renamed from: h */
    private int f81323h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final akpz mo39694a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.inflate((int) C0126R.C0128layout.ocr_code_capture, viewGroup, true);
        viewGroup.findViewById(C0126R.C0129id.ocrRegionOfInterest).setContentDescription(this.f81322g);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C0126R.C0129id.gift_card_add_manually_button);
        imageButton.setOnClickListener(new akts(this, imageButton));
        GradientDrawable gradientDrawable = (GradientDrawable) imageButton.getBackground();
        gradientDrawable.setColor(this.f81321f);
        gradientDrawable.setStroke(getResources().getDimensionPixelSize(C0126R.dimen.keyboard_button_stroke_width), this.f81320e);
        return new aktt((ViewGroup) viewGroup.findViewById(C0126R.C0129id.ocrRegionOfInterest));
    }

    /* renamed from: b */
    public final void mo39696b() {
        this.f81318c.mo39687d();
    }

    /* renamed from: bC */
    public final void mo39697bC() {
    }

    /* renamed from: c */
    public final void mo39698c() {
        setResult(10003);
        finish();
    }

    /* renamed from: e */
    public final Intent mo44744e() {
        akpd a = GiftCardOcrResult.m67678a();
        a.mo39641a(this.f81317b, this.f81323h);
        aktm aktm = this.f81318c;
        if (aktm != null) {
            aktm.mo39846a(a);
        }
        Intent intent = new Intent();
        sef.m35071a(a.mo39640a(), intent, "com.google.android.gms.ocr.GIFT_CARD_OCR_RESULT");
        return intent;
    }

    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof aktm) {
            aktm aktm = (aktm) fragment;
            this.f81319d.mo39849a(aktm);
            aktm.f72411j = this;
        }
    }

    public final void onBackPressed() {
        setResult(0, mo44744e());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        this.f81319d = new aktr(this, getIntent().getExtras());
        setTheme(2132018605);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.ocr.TITLE");
        this.f81322g = intent.getStringExtra("com.google.android.gms.ocr.CODE_WINDOW_LABEL");
        this.f81320e = intent.getIntExtra("com.google.android.gms.ocr.KEYBOARD_BUTTON_STROKE_COLOR", getResources().getColor(17170443));
        this.f81321f = intent.getIntExtra("com.google.android.gms.ocr.KEYBOARD_BUTTON_BACKGROUND_COLOR", getResources().getColor(17170444));
        setTitle(stringExtra);
        getWindow().addFlags(8192);
        mo8628aW().mo15853b(true);
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        aktm aktm = (aktm) getSupportFragmentManager().findFragmentByTag("GiftCardFragment");
        this.f81318c = aktm;
        if (bundle == null || aktm == null) {
            aktm aktm2 = new aktm();
            this.f81318c = aktm2;
            aktm2.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(16908290, this.f81318c, "GiftCardFragment").commit();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f81323h++;
        onBackPressed();
        return true;
    }

    /* renamed from: a */
    public final void mo39695a(List list) {
        if (list == null || list.isEmpty()) {
            setResult(10006);
        } else if (list.get(0) != null) {
            akpd b = ((GiftCardOcrResult) list.get(0)).mo44705b();
            b.mo39641a(this.f81317b, this.f81323h);
            GiftCardOcrResult a = b.mo39640a();
            Intent intent = new Intent();
            sef.m35071a(a, intent, "com.google.android.gms.ocr.GIFT_CARD_OCR_RESULT");
            List list2 = a.f81245a;
            if (list2 == null || list2.isEmpty()) {
                setResult(10006, intent);
            } else {
                setResult(-1, intent);
            }
        }
        finish();
    }
}
