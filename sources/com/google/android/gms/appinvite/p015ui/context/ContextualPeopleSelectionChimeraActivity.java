package com.google.android.gms.appinvite.p015ui.context;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.CustomSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.GridSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.SelectionSectionInfo;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.appinvite.ui.context.ContextualPeopleSelectionChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContextualPeopleSelectionChimeraActivity extends deu implements View.OnClickListener, fwz, fxb, fwm {

    /* renamed from: b */
    private View f9763b;

    /* renamed from: c */
    private View f9764c;

    /* renamed from: d */
    private fwo f9765d;

    /* renamed from: e */
    private acm f9766e;

    /* renamed from: f */
    private View f9767f;

    /* renamed from: g */
    private CharSequence f9768g;

    /* renamed from: h */
    private CharSequence f9769h;

    /* renamed from: i */
    private CharSequence f9770i;

    /* renamed from: a */
    private final void m6196a(boolean z) {
        this.f9768g = null;
        this.f9769h = null;
        this.f9770i = null;
        Intent intent = getIntent();
        if (!z) {
            this.f9768g = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_HINT_TEXT");
            this.f9769h = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_HINT_TEXT");
            CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.f9770i = charSequenceExtra;
            if (TextUtils.isEmpty(charSequenceExtra)) {
                this.f9770i = this.f9769h;
            }
        }
        if (TextUtils.isEmpty(this.f9768g)) {
            this.f9768g = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_HINT_TEXT");
        }
        if (TextUtils.isEmpty(this.f9769h)) {
            CharSequence charSequenceExtra2 = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_HINT_TEXT");
            this.f9769h = charSequenceExtra2;
            if (TextUtils.isEmpty(charSequenceExtra2)) {
                this.f9769h = this.f9768g;
            }
        }
        if (TextUtils.isEmpty(this.f9770i)) {
            CharSequence charSequenceExtra3 = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.f9770i = charSequenceExtra3;
            if (TextUtils.isEmpty(charSequenceExtra3)) {
                this.f9770i = this.f9769h;
            }
        }
    }

    /* renamed from: g */
    private final void m6197g() {
        fwo fwo = this.f9765d;
        int i = 0;
        boolean z = fwo != null && fwo.mo11433a();
        this.f9763b.setVisibility(!z ? 8 : 0);
        View view = this.f9764c;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: h */
    private final void m6198h() {
        this.f9767f.setEnabled(this.f9765d.mo11439c() > 0);
    }

    /* renamed from: i */
    private final void m6199i() {
        CharSequence charSequence;
        fwo fwo = this.f9765d;
        CharSequence charSequence2 = this.f9768g;
        fxj fxj = fwo.f17481t;
        if (fxj != null) {
            fxj.mo11459b(charSequence2);
        }
        fxg fxg = fwo.f17482u;
        if (fxg != null) {
            fxg.mo11459b(charSequence2);
        }
        fwo fwo2 = this.f9765d;
        if (fwo2.mo11439c() > 0) {
            charSequence = this.f9770i;
        } else {
            charSequence = this.f9769h;
        }
        fxj fxj2 = fwo2.f17481t;
        if (fxj2 != null) {
            fxj2.mo11462c(charSequence);
        }
        fxg fxg2 = fwo2.f17482u;
        if (fxg2 != null) {
            fxg2.mo11462c(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo7252b(int i, int i2) {
        m6196a(i + i2 > 0);
        m6199i();
        m6197g();
        m6198h();
    }

    /* renamed from: e */
    public final void mo7255e() {
        m6197g();
    }

    /* renamed from: k */
    public final acm mo7261k() {
        return this.f9766e;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("com.google.android.gms.appinvite.CONTEXT_RESULT_SELECTED_PEOPLE", new ArrayList(this.f9765d.mo11435b()));
        setResult(-1, intent);
        finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        Context context;
        ContextualPeopleSelectionChimeraActivity contextualPeopleSelectionChimeraActivity;
        FragmentTransaction fragmentTransaction;
        String str;
        LoaderSectionInfo loaderSectionInfo;
        int length;
        int length2;
        super.onCreate(bundle);
        String a = spn.m35852a((Activity) this);
        if (a != null) {
            if (rfz.m33557a(this).mo24610b(a)) {
                setContentView((int) C0126R.C0128layout.appinvite_contextual_selection_activity);
                this.f9763b = findViewById(C0126R.C0129id.selection_content);
                this.f9764c = findViewById(C0126R.C0129id.progress_bar);
                try {
                    context = createPackageContext(a, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    context = getContainerActivity();
                }
                Intent intent = getIntent();
                String stringExtra = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_TITLE");
                if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR")) {
                    int intExtra = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR", -16777216);
                    SpannableString spannableString = new SpannableString(stringExtra);
                    spannableString.setSpan(new ForegroundColorSpan(intExtra), 0, spannableString.length(), 18);
                    stringExtra = spannableString;
                }
                Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.toolbar);
                if (!cbwa.m128705d()) {
                    mo8626a(toolbar);
                }
                toolbar.mo1679a(stringExtra);
                if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE")) {
                    toolbar.mo1675a(context, intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE", 0));
                }
                if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR")) {
                    toolbar.setBackgroundColor(intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR", 0));
                }
                if (cbwa.m128705d()) {
                    mo8626a(toolbar);
                }
                String stringExtra2 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_ACCOUNT_NAME");
                if (TextUtils.isEmpty(stringExtra2)) {
                    finish();
                    return;
                }
                int intExtra2 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON", 0);
                TextView textView = (TextView) findViewById(C0126R.C0129id.select);
                if (intExtra2 != 0) {
                    View inflate = LayoutInflater.from(context).inflate(intExtra2, (ViewGroup) findViewById(C0126R.C0129id.select_frame));
                    this.f9767f = inflate;
                    inflate.setOnClickListener(this);
                    textView.setVisibility(8);
                } else {
                    this.f9767f = textView;
                    String stringExtra3 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT");
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        textView.setText(stringExtra3);
                    }
                    if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES")) {
                        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES");
                        int size = bundleExtra.size();
                        int[][] iArr = new int[size][];
                        int[] iArr2 = new int[size];
                        for (int i = 0; i < size; i++) {
                            int[] intArray = bundleExtra.getIntArray(Integer.toString(i));
                            if (intArray != null && (length2 = intArray.length) > 0) {
                                iArr2[i] = intArray[0];
                                iArr[i] = Arrays.copyOfRange(intArray, 1, length2);
                            }
                        }
                        textView.setTextColor(new ColorStateList(iArr, iArr2));
                    } else if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR")) {
                        textView.setTextColor(context.getResources().getColorStateList(intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR", 0)));
                    }
                    if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES")) {
                        Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES");
                        int size2 = bundleExtra2.size();
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        for (int i2 = 0; i2 < size2; i2++) {
                            int[] intArray2 = bundleExtra2.getIntArray(Integer.toString(i2));
                            if (intArray2 != null && (length = intArray2.length) > 0) {
                                stateListDrawable.addState(Arrays.copyOfRange(intArray2, 1, length), new ColorDrawable(intArray2[0]));
                            }
                        }
                        textView.setBackgroundDrawable(stateListDrawable);
                    } else if (intent.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR")) {
                        textView.setBackgroundDrawable(context.getResources().getDrawable(intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR", 0)));
                    }
                }
                CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_MESSAGE");
                if (!TextUtils.isEmpty(charSequenceExtra)) {
                    View inflate2 = getLayoutInflater().inflate((int) C0126R.C0128layout.appinvite_contextual_selection_message, (ViewGroup) this.f9763b, false);
                    this.f9766e = new acm(inflate2);
                    ((TextView) inflate2.findViewById(C0126R.C0129id.message)).setText(charSequenceExtra);
                }
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                fwo fwo = (fwo) supportFragmentManager.findFragmentByTag("selectionFragment");
                this.f9765d = fwo;
                if (fwo == null) {
                    ArrayList b = sef.m35076b(intent, "com.google.android.gms.appinvite.CONTEXT_INITIAL_SELECTION", ContactPerson.CREATOR);
                    int intExtra3 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_SELECTED", Integer.MAX_VALUE);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_ICON", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_SELECTION", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_OVERRIDE_CONTACT_METHOD_ORDER", false);
                    String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES");
                    boolean booleanExtra4 = intent.getBooleanExtra("com.google.android.gms.appinvite.EXTRA_EXCLUDE_NON_GAIA_CONTACTS", false);
                    boolean booleanExtra5 = intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_DOCK_RECIPIENTS", false);
                    ArrayList b2 = sef.m35076b(intent, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_GRID_PEOPLE", ContactPerson.CREATOR);
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_GAIA_IDS");
                    ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_EMAIL_ADDRESSES");
                    String str2 = "selectionFragment";
                    ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_PHONE_NUMBERS");
                    FragmentTransaction fragmentTransaction2 = beginTransaction;
                    String str3 = a;
                    ArrayList b3 = sef.m35076b(intent, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_LIST_PEOPLE", ContactPerson.CREATOR);
                    String stringExtra4 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE");
                    boolean z = booleanExtra2;
                    String stringExtra5 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE_OPTIONS");
                    ArrayList arrayList = b;
                    int i3 = intExtra3;
                    int intExtra4 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_PORTRAIT_GRID_ITEMS", Integer.MAX_VALUE);
                    String str4 = stringExtra2;
                    int intExtra5 = intent.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_LANDSCAPE_GRID_ITEMS", Integer.MAX_VALUE);
                    String stringExtra6 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE");
                    boolean z2 = booleanExtra;
                    String stringExtra7 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE_OPTIONS");
                    ArrayList arrayList2 = b3;
                    String stringExtra8 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_HEADER_TEXT");
                    String str5 = stringExtra7;
                    String stringExtra9 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SUB_HEADER_TEXT");
                    String str6 = stringExtra6;
                    String stringExtra10 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_HEADER_TEXT");
                    String stringExtra11 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SUB_HEADER_TEXT");
                    String str7 = stringExtra9;
                    boolean booleanExtra6 = intent.getBooleanExtra("com.google.android.gms.appinvite.INCLUDE_PUBLIC_PROFILE_SEARCH", false);
                    ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_GAIA_IDS");
                    ArrayList<String> stringArrayListExtra5 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_EMAIL_ADDRESSES");
                    ArrayList<String> stringArrayListExtra6 = intent.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_PHONE_NUMBERS");
                    String stringExtra12 = intent.getStringExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_MESSAGE");
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f9766e != null) {
                        str = stringExtra8;
                        arrayList3.add(new CustomSectionInfo(new int[]{C0126R.C0128layout.appinvite_contextual_selection_message}));
                    } else {
                        str = stringExtra8;
                    }
                    SelectionSectionInfo selectionSectionInfo = new SelectionSectionInfo();
                    selectionSectionInfo.f9803p = booleanExtra5;
                    selectionSectionInfo.f9805b = true;
                    arrayList3.add(selectionSectionInfo);
                    if (!TextUtils.isEmpty(stringExtra4)) {
                        if (intent.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_DISPLAY_GRID_AS_A_LIST", false)) {
                            loaderSectionInfo = new ListSectionInfo(stringExtra4);
                        } else {
                            loaderSectionInfo = new GridSectionInfo(stringExtra4);
                        }
                        loaderSectionInfo.f9791d = stringExtra5;
                        loaderSectionInfo.f9789b = stringArrayExtra;
                        loaderSectionInfo.f9790c = booleanExtra3;
                        loaderSectionInfo.f9797j = intExtra4;
                        loaderSectionInfo.f9798k = intExtra5;
                        loaderSectionInfo.f9799l = b2;
                        loaderSectionInfo.f9800m = stringArrayListExtra;
                        loaderSectionInfo.mo7294a(stringArrayListExtra2);
                        loaderSectionInfo.mo7295b(stringArrayListExtra3);
                        loaderSectionInfo.f9794g = str;
                        loaderSectionInfo.f9795h = str7;
                        arrayList3.add(loaderSectionInfo);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        ListSectionInfo listSectionInfo = new ListSectionInfo(str6);
                        listSectionInfo.f9791d = str5;
                        listSectionInfo.f9789b = stringArrayExtra;
                        listSectionInfo.f9790c = booleanExtra3;
                        listSectionInfo.f9792e = true;
                        listSectionInfo.f9799l = arrayList2;
                        listSectionInfo.f9794g = stringExtra10;
                        listSectionInfo.f9795h = stringExtra11;
                        arrayList3.add(listSectionInfo);
                    }
                    Resources resources = getResources();
                    boolean z3 = !cbwa.m128704c() ? false : z2;
                    int integer = resources.getInteger(C0126R.integer.appinivte_num_portrait_grid_columns);
                    int integer2 = resources.getInteger(C0126R.integer.appinivte_num_landscape_grid_columns);
                    fragmentTransaction = fragmentTransaction2;
                    fwo a2 = fwo.m12510a(str4, i3, arrayList, z, null, z3, stringArrayExtra, booleanExtra4, integer, integer2, arrayList3, str3, booleanExtra6, stringArrayListExtra4, stringArrayListExtra5, stringArrayListExtra6, stringExtra12, true);
                    contextualPeopleSelectionChimeraActivity = this;
                    contextualPeopleSelectionChimeraActivity.f9765d = a2;
                    fragmentTransaction.add(C0126R.C0129id.fragment_container, a2, str2);
                } else {
                    contextualPeopleSelectionChimeraActivity = this;
                    fragmentTransaction = beginTransaction;
                }
                fwo fwo2 = contextualPeopleSelectionChimeraActivity.f9765d;
                fwo2.f17466e = contextualPeopleSelectionChimeraActivity;
                fwo2.f17467f = contextualPeopleSelectionChimeraActivity;
                fwo2.f17485x = contextualPeopleSelectionChimeraActivity;
                contextualPeopleSelectionChimeraActivity.m6196a(false);
                m6199i();
                if (!fragmentTransaction.isEmpty()) {
                    fragmentTransaction.commit();
                    return;
                }
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        m6197g();
    }

    /* renamed from: a */
    public final void mo7245a(int i, int i2) {
        m6196a(i + i2 > 0);
        m6199i();
        m6197g();
        m6198h();
    }

    /* renamed from: a */
    public final void mo7248a(ContactPerson contactPerson, boolean z) {
        if (!z ? this.f9765d.mo11439c() == 0 : this.f9765d.mo11439c() == 1) {
            m6199i();
        }
        m6198h();
    }
}
