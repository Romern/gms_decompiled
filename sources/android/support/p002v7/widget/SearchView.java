package android.support.p002v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SearchView extends LinearLayoutCompat implements C1415us {

    /* renamed from: A */
    private Rect f1228A;

    /* renamed from: B */
    private Rect f1229B;

    /* renamed from: C */
    private int[] f1230C;

    /* renamed from: D */
    private int[] f1231D;

    /* renamed from: E */
    private final ImageView f1232E;

    /* renamed from: F */
    private final Drawable f1233F;

    /* renamed from: G */
    private final Intent f1234G;

    /* renamed from: H */
    private final Intent f1235H;

    /* renamed from: I */
    private final CharSequence f1236I;

    /* renamed from: J */
    private CharSequence f1237J;

    /* renamed from: K */
    private boolean f1238K;

    /* renamed from: L */
    private int f1239L;

    /* renamed from: M */
    private boolean f1240M;

    /* renamed from: N */
    private boolean f1241N;

    /* renamed from: O */
    private int f1242O;

    /* renamed from: P */
    private final Runnable f1243P;

    /* renamed from: Q */
    private Runnable f1244Q;

    /* renamed from: R */
    private final WeakHashMap f1245R;

    /* renamed from: S */
    private final View.OnClickListener f1246S;

    /* renamed from: T */
    private final TextView.OnEditorActionListener f1247T;

    /* renamed from: U */
    private final AdapterView.OnItemClickListener f1248U;

    /* renamed from: V */
    private final AdapterView.OnItemSelectedListener f1249V;

    /* renamed from: W */
    private TextWatcher f1250W;

    /* renamed from: a */
    public final SearchAutoComplete f1251a;

    /* renamed from: b */
    public final View f1252b;

    /* renamed from: c */
    public final ImageView f1253c;

    /* renamed from: d */
    public final ImageView f1254d;

    /* renamed from: e */
    public final ImageView f1255e;

    /* renamed from: i */
    public final ImageView f1256i;

    /* renamed from: j */
    public final View f1257j;

    /* renamed from: k */
    public final int f1258k;

    /* renamed from: l */
    public final int f1259l;

    /* renamed from: m */
    public adc f1260m;

    /* renamed from: n */
    public View.OnFocusChangeListener f1261n;

    /* renamed from: o */
    public boolean f1262o;

    /* renamed from: p */
    public boolean f1263p;

    /* renamed from: q */
    public aix f1264q;

    /* renamed from: r */
    public CharSequence f1265r;

    /* renamed from: s */
    public CharSequence f1266s;

    /* renamed from: t */
    public SearchableInfo f1267t;

    /* renamed from: u */
    View.OnKeyListener f1268u;

    /* renamed from: v */
    public ajis f1269v;

    /* renamed from: w */
    public abfz f1270w;

    /* renamed from: x */
    private final View f1271x;

    /* renamed from: y */
    private final View f1272y;

    /* renamed from: z */
    private adf f1273z;

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new add();

        /* renamed from: c */
        boolean f1274c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1274c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1274c + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1274c));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SearchAutoComplete extends C1492xo {

        /* renamed from: a */
        public SearchView f1275a;

        /* renamed from: b */
        public boolean f1276b;

        /* renamed from: c */
        final Runnable f1277c;

        /* renamed from: d */
        private int f1278d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public final void mo1643a() {
            int i = Build.VERSION.SDK_INT;
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public final boolean enoughToFilter() {
            return this.f1278d <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1276b) {
                removeCallbacks(this.f1277c);
                post(this.f1277c);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public final void onFinishInflate() {
            int i;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else if (i2 < 600) {
                i = 160;
            } else {
                i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            }
            setMinWidth((int) TypedValue.applyDimension(1, (float) i, displayMetrics));
        }

        /* access modifiers changed from: protected */
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f1275a;
            searchView.mo1622b(searchView.f1263p);
            searchView.mo1629h();
            if (searchView.f1251a.hasFocus()) {
                searchView.mo1635n();
            }
        }

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1275a.clearFocus();
                        mo1644a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1275a.hasFocus() && getVisibility() == 0) {
                this.f1276b = true;
                if (SearchView.m1317a(getContext())) {
                    mo1643a();
                }
            }
        }

        public final void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public final void replaceText(CharSequence charSequence) {
        }

        public final void setThreshold(int i) {
            super.setThreshold(i);
            this.f1278d = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0126R.attr.autoCompleteTextViewStyle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo1644a(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1276b = false;
                removeCallbacks(this.f1277c);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1276b = false;
                removeCallbacks(this.f1277c);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1276b = true;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1277c = new ade(this);
            this.f1278d = getThreshold();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final Intent m1316a(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1266s);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        intent.setComponent(this.f1267t.getSearchActivity());
        return intent;
    }

    /* renamed from: p */
    private final int m1318p() {
        return getContext().getResources().getDimensionPixelSize(C0126R.dimen.abc_search_view_preferred_width);
    }

    /* renamed from: q */
    private final int m1319q() {
        return getContext().getResources().getDimensionPixelSize(C0126R.dimen.abc_search_view_preferred_height);
    }

    /* renamed from: r */
    private final void m1320r() {
        SpannableStringBuilder spannableStringBuilder = this.f1237J;
        if (spannableStringBuilder == null) {
            SearchableInfo searchableInfo = this.f1267t;
            if (searchableInfo == null || searchableInfo.getHintId() == 0) {
                spannableStringBuilder = this.f1236I;
            } else {
                spannableStringBuilder = getContext().getText(this.f1267t.getHintId());
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1251a;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        if (this.f1262o && this.f1233F != null) {
            double textSize = (double) searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.f1233F.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("   ");
            spannableStringBuilder2.setSpan(new ImageSpan(this.f1233F), 1, 2, 33);
            spannableStringBuilder2.append(spannableStringBuilder);
            spannableStringBuilder = spannableStringBuilder2;
        }
        searchAutoComplete.setHint(spannableStringBuilder);
    }

    /* renamed from: s */
    private final void m1321s() {
        this.f1251a.dismissDropDown();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.SearchView.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      android.support.v7.widget.LinearLayoutCompat.a(android.graphics.Canvas, int):void
      android.support.v7.widget.SearchView.a(java.lang.CharSequence, boolean):void */
    /* renamed from: b */
    public final void mo1619b() {
        mo1616a((CharSequence) "", false);
        clearFocus();
        mo1622b(true);
        this.f1251a.setImeOptions(this.f1242O);
        this.f1241N = false;
    }

    /* renamed from: c */
    public final void mo1623c(boolean z) {
        int i = 8;
        if (this.f1240M && !this.f1263p && z) {
            this.f1254d.setVisibility(8);
            i = 0;
        }
        this.f1256i.setVisibility(i);
    }

    public final void clearFocus() {
        this.f1238K = true;
        super.clearFocus();
        this.f1251a.clearFocus();
        this.f1251a.mo1644a(false);
        this.f1238K = false;
    }

    /* renamed from: d */
    public final CharSequence mo1625d() {
        return this.f1251a.getText();
    }

    /* renamed from: e */
    public final boolean mo1626e(int i) {
        Intent intent;
        int i2;
        Uri uri;
        String a;
        Cursor cursor;
        int i3 = i;
        abfz abfz = this.f1270w;
        if (!(abfz == null || (cursor = abfz.mo32076a().f57374a.f1264q.f624d) == null)) {
            ArrayList arrayList = new ArrayList();
            try {
                int columnIndex = cursor.getColumnIndex("suggest_format");
                int columnIndex2 = cursor.getColumnIndex("suggest_intent_query");
                int columnIndex3 = cursor.getColumnIndex("suggest_text_1");
                int columnIndex4 = cursor.getColumnIndex("suggest_text_2_url");
                int columnIndex5 = cursor.getColumnIndex("help_action_string");
                abfo abfo = null;
                int i4 = 0;
                while (i4 < cursor.getCount()) {
                    cursor.moveToPosition(i4);
                    int i5 = cursor.getInt(columnIndex);
                    String string = cursor.getString(columnIndex2);
                    String string2 = cursor.getString(columnIndex3);
                    int i6 = columnIndex;
                    String string3 = cursor.getString(columnIndex4);
                    int i7 = columnIndex2;
                    String string4 = cursor.getString(columnIndex5);
                    Cursor cursor2 = cursor;
                    abfo abfo2 = new abfo(i5, string2, string, string3, string4);
                    arrayList.add(abfo2);
                    if (i4 == i3) {
                        if (i5 == 1) {
                            abgx.m47704a(abfz.f57382a, aasm.m46882a(string3, aasw.m46952a(), abfz.f57382a.f56986y), 32, i3);
                        } else if (i5 == 2) {
                            aasm b = aasm.m46897b(string4, string3);
                            if (b.mo31732o()) {
                                aaso.m46933a(b, abfz.f57382a);
                            } else if (b.mo31731n()) {
                                aaso.m46935a(new aazy(), b, abfz.f57382a);
                            } else if (b.mo31730m()) {
                                aaso.m46934a(new aass(abfz.f57382a), b, i3, 32, b.f56496f);
                            }
                        } else {
                            abfz.mo32076a().mo32072a(string, true);
                        }
                        abfo = abfo2;
                    }
                    i4++;
                    columnIndex = i6;
                    columnIndex2 = i7;
                    cursor = cursor2;
                }
                abcx.m47486a(abfz.f57382a, arrayList, abfo);
                return false;
            } catch (Exception e) {
            }
        }
        Cursor cursor3 = this.f1264q.f624d;
        if (cursor3 != null && cursor3.moveToPosition(i3)) {
            try {
                String a2 = adk.m503a(cursor3, "suggest_intent_action");
                if (a2 == null) {
                    a2 = this.f1267t.getSuggestIntentAction();
                }
                if (a2 == null) {
                    a2 = "android.intent.action.SEARCH";
                }
                String a3 = adk.m503a(cursor3, "suggest_intent_data");
                if (a3 == null) {
                    a3 = this.f1267t.getSuggestIntentData();
                }
                if (!(a3 == null || (a = adk.m503a(cursor3, "suggest_intent_data_id")) == null)) {
                    a3 = a3 + "/" + Uri.encode(a);
                }
                if (a3 != null) {
                    uri = Uri.parse(a3);
                } else {
                    uri = null;
                }
                intent = m1316a(a2, uri, adk.m503a(cursor3, "suggest_intent_extra_data"), adk.m503a(cursor3, "suggest_intent_query"));
            } catch (RuntimeException e2) {
                RuntimeException runtimeException = e2;
                try {
                    i2 = cursor3.getPosition();
                } catch (RuntimeException e3) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", runtimeException);
                intent = null;
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e4) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e4);
                }
            }
        }
        this.f1251a.mo1644a(false);
        m1321s();
        return true;
    }

    /* renamed from: f */
    public final void mo1627f() {
        int i = 0;
        if (!this.f1240M || this.f1263p || !(this.f1254d.getVisibility() == 0 || this.f1256i.getVisibility() == 0)) {
            i = 8;
        }
        this.f1272y.setVisibility(i);
    }

    /* renamed from: g */
    public final void mo1628g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1251a.getText());
        int i = 0;
        if (!z2) {
            if (!this.f1262o) {
                z = false;
            } else if (this.f1241N) {
                z = false;
            }
        }
        ImageView imageView = this.f1255e;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1255e.getDrawable();
        if (drawable != null) {
            drawable.setState(!z2 ? EMPTY_STATE_SET : ENABLED_STATE_SET);
        }
    }

    /* renamed from: h */
    public final void mo1629h() {
        post(this.f1243P);
    }

    /* renamed from: i */
    public final void mo1630i() {
        int[] iArr = !this.f1251a.hasFocus() ? EMPTY_STATE_SET : FOCUSED_STATE_SET;
        Drawable background = this.f1252b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1272y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: j */
    public final void mo1631j() {
        Editable text = this.f1251a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            adc adc = this.f1260m;
            if (adc == null || !adc.mo417a(text.toString())) {
                if (this.f1267t != null) {
                    mo1617a(text.toString());
                }
                this.f1251a.mo1644a(false);
                m1321s();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.lang.String, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.Contact, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity, java.lang.String):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(android.view.View, java.lang.Object):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.util.List, boolean):void
      ajui.a(android.view.View, java.lang.Object):void
      ajwc.a(java.util.List, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.lang.String, boolean):void */
    /* renamed from: k */
    public final void mo1632k() {
        if (!TextUtils.isEmpty(this.f1251a.getText())) {
            this.f1251a.setText("");
            this.f1251a.requestFocus();
            this.f1251a.mo1644a(true);
        } else if (this.f1262o) {
            ajis ajis = this.f1269v;
            if (ajis != null) {
                ajis.f70722a.mo44409a((String) null, false);
            }
            clearFocus();
            mo1622b(true);
        }
    }

    /* renamed from: l */
    public final void mo1633l() {
        mo1622b(false);
        this.f1251a.requestFocus();
        this.f1251a.mo1644a(true);
    }

    /* renamed from: m */
    public final void mo1634m() {
        String str;
        String str2;
        int i;
        SearchableInfo searchableInfo = this.f1267t;
        if (searchableInfo != null) {
            try {
                String str3 = null;
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = new Intent(this.f1234G);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    if (searchActivity != null) {
                        str3 = searchActivity.flattenToShortString();
                    }
                    intent.putExtra("calling_package", str3);
                    getContext().startActivity(intent);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    Intent intent2 = this.f1235H;
                    ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                    Intent intent3 = new Intent("android.intent.action.SEARCH");
                    intent3.setComponent(searchActivity2);
                    PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent3, JGCastService.FLAG_PRIVATE_DISPLAY);
                    Bundle bundle = new Bundle();
                    Intent intent4 = new Intent(intent2);
                    String str4 = "free_form";
                    Resources resources = getResources();
                    if (searchableInfo.getVoiceLanguageModeId() != 0) {
                        str4 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                    }
                    if (searchableInfo.getVoicePromptTextId() != 0) {
                        str = resources.getString(searchableInfo.getVoicePromptTextId());
                    } else {
                        str = null;
                    }
                    if (searchableInfo.getVoiceLanguageId() != 0) {
                        str2 = resources.getString(searchableInfo.getVoiceLanguageId());
                    } else {
                        str2 = null;
                    }
                    if (searchableInfo.getVoiceMaxResults() != 0) {
                        i = searchableInfo.getVoiceMaxResults();
                    } else {
                        i = 1;
                    }
                    intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str4);
                    intent4.putExtra("android.speech.extra.PROMPT", str);
                    intent4.putExtra("android.speech.extra.LANGUAGE", str2);
                    intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                    if (searchActivity2 != null) {
                        str3 = searchActivity2.flattenToShortString();
                    }
                    intent4.putExtra("calling_package", str3);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                    getContext().startActivity(intent4);
                }
            } catch (ActivityNotFoundException e) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: n */
    public final void mo1635n() {
        int i = Build.VERSION.SDK_INT;
        this.f1251a.refreshAutoCompleteResults();
    }

    /* renamed from: o */
    public final void mo1636o() {
        this.f1254d.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1243P);
        post(this.f1244Q);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f1251a;
            Rect rect = this.f1228A;
            searchAutoComplete.getLocationInWindow(this.f1230C);
            getLocationInWindow(this.f1231D);
            int[] iArr = this.f1230C;
            int i5 = iArr[1];
            int[] iArr2 = this.f1231D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.f1229B.set(this.f1228A.left, 0, this.f1228A.right, i4 - i2);
            adf adf = this.f1273z;
            if (adf == null) {
                adf adf2 = new adf(this.f1229B, this.f1228A, this.f1251a);
                this.f1273z = adf2;
                setTouchDelegate(adf2);
                return;
            }
            adf.mo423a(this.f1229B, this.f1228A);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!this.f1263p) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                int i4 = this.f1239L;
                size = i4 <= 0 ? Math.min(m1318p(), size) : Math.min(i4, size);
            } else if (mode == 0) {
                size = this.f1239L;
                if (size <= 0) {
                    size = m1318p();
                }
            } else if (mode == 1073741824 && (i3 = this.f1239L) > 0) {
                size = Math.min(i3, size);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(m1319q(), size2);
            } else if (mode2 == 0) {
                size2 = m1319q();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(size2, JGCastService.FLAG_PRIVATE_DISPLAY));
            return;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        mo1622b(savedState.f1274c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1274c = this.f1263p;
        return savedState;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        mo1629h();
    }

    public final boolean requestFocus(int i, Rect rect) {
        if (this.f1238K || !isFocusable()) {
            return false;
        }
        if (this.f1263p) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1251a.requestFocus(i, rect);
        if (requestFocus) {
            mo1622b(false);
        }
        return requestFocus;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.searchViewStyle);
    }

    /* renamed from: b */
    public final void mo1620b(int i) {
        this.f1239L = i;
        requestLayout();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.support.v7.widget.SearchView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1228A = new Rect();
        this.f1229B = new Rect();
        this.f1230C = new int[2];
        this.f1231D = new int[2];
        this.f1243P = new act(this);
        this.f1244Q = new acu(this);
        this.f1245R = new WeakHashMap();
        this.f1246S = new acx(this);
        this.f1268u = new acy(this);
        this.f1247T = new acz(this);
        this.f1248U = new ada(this);
        this.f1249V = new adb(this);
        this.f1250W = new acs(this);
        adr a = adr.m523a(context, attributeSet, C1390tu.f27213v, i, 0);
        LayoutInflater.from(context).inflate(a.mo460f(9, C0126R.C0128layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0126R.C0129id.search_src_text);
        this.f1251a = searchAutoComplete;
        searchAutoComplete.f1275a = this;
        this.f1271x = findViewById(C0126R.C0129id.search_edit_frame);
        this.f1252b = findViewById(C0126R.C0129id.search_plate);
        this.f1272y = findViewById(C0126R.C0129id.submit_area);
        this.f1253c = (ImageView) findViewById(C0126R.C0129id.search_button);
        this.f1254d = (ImageView) findViewById(C0126R.C0129id.search_go_btn);
        this.f1255e = (ImageView) findViewById(C0126R.C0129id.search_close_btn);
        this.f1256i = (ImageView) findViewById(C0126R.C0129id.search_voice_btn);
        this.f1232E = (ImageView) findViewById(C0126R.C0129id.search_mag_icon);
        C1280ps.m19890a(this.f1252b, a.mo449a(10));
        C1280ps.m19890a(this.f1272y, a.mo449a(14));
        this.f1253c.setImageDrawable(a.mo449a(13));
        this.f1254d.setImageDrawable(a.mo449a(7));
        this.f1255e.setImageDrawable(a.mo449a(4));
        this.f1256i.setImageDrawable(a.mo449a(16));
        this.f1232E.setImageDrawable(a.mo449a(13));
        this.f1233F = a.mo449a(12);
        aec.m594a(this.f1253c, getResources().getString(C0126R.string.abc_searchview_description_search));
        this.f1258k = a.mo460f(15, C0126R.C0128layout.abc_search_dropdown_item_icons_2line);
        this.f1259l = a.mo460f(5, 0);
        this.f1253c.setOnClickListener(this.f1246S);
        this.f1255e.setOnClickListener(this.f1246S);
        this.f1254d.setOnClickListener(this.f1246S);
        this.f1256i.setOnClickListener(this.f1246S);
        this.f1251a.setOnClickListener(this.f1246S);
        this.f1251a.addTextChangedListener(this.f1250W);
        this.f1251a.setOnEditorActionListener(this.f1247T);
        this.f1251a.setOnItemClickListener(this.f1248U);
        this.f1251a.setOnItemSelectedListener(this.f1249V);
        this.f1251a.setOnKeyListener(this.f1268u);
        this.f1251a.setOnFocusChangeListener(new acv(this));
        boolean a2 = a.mo451a(8, true);
        if (this.f1262o != a2) {
            this.f1262o = a2;
            mo1622b(a2);
            m1320r();
        }
        int d = a.mo456d(1, -1);
        if (d != -1) {
            mo1620b(d);
        }
        this.f1236I = a.mo455c(6);
        this.f1237J = a.mo455c(11);
        int a3 = a.mo448a(3, -1);
        if (a3 != -1) {
            mo1613a(a3);
        }
        int a4 = a.mo448a(2, -1);
        if (a4 != -1) {
            this.f1251a.setInputType(a4);
        }
        setFocusable(a.mo451a(0, true));
        a.mo450a();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1234G = intent;
        intent.addFlags(268435456);
        this.f1234G.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1235H = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f1251a.getDropDownAnchor());
        this.f1257j = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new acw(this));
        }
        mo1622b(this.f1262o);
        m1320r();
    }

    /* renamed from: b */
    public final void mo1621b(CharSequence charSequence) {
        this.f1251a.setText(charSequence);
        this.f1251a.setSelection(!TextUtils.isEmpty(charSequence) ? charSequence.length() : 0);
    }

    /* renamed from: b */
    public final void mo1622b(boolean z) {
        int i;
        int i2;
        this.f1263p = z;
        int i3 = 0;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f1251a.getText());
        this.f1253c.setVisibility(i);
        mo1636o();
        View view = this.f1271x;
        if (!z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (this.f1232E.getDrawable() == null || this.f1262o) {
            i3 = 8;
        }
        this.f1232E.setVisibility(i3);
        mo1628g();
        mo1623c(isEmpty);
        mo1627f();
    }

    /* renamed from: a */
    static boolean m1317a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: a */
    public final void mo1612a() {
        if (!this.f1241N) {
            this.f1241N = true;
            int imeOptions = this.f1251a.getImeOptions();
            this.f1242O = imeOptions;
            this.f1251a.setImeOptions(imeOptions | 33554432);
            this.f1251a.setText("");
            mo1618a(false);
        }
    }

    /* renamed from: a */
    public final void mo1613a(int i) {
        this.f1251a.setImeOptions(i);
    }

    /* renamed from: a */
    public final void mo1614a(SearchableInfo searchableInfo) {
        this.f1267t = searchableInfo;
        Intent intent = null;
        boolean z = true;
        if (searchableInfo != null) {
            this.f1251a.setThreshold(searchableInfo.getSuggestThreshold());
            this.f1251a.setImeOptions(this.f1267t.getImeOptions());
            int inputType = this.f1267t.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1267t.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            this.f1251a.setInputType(inputType);
            aix aix = this.f1264q;
            if (aix != null) {
                aix.mo431a((Cursor) null);
            }
            if (this.f1267t.getSuggestAuthority() != null) {
                adk adk = new adk(getContext(), this, this.f1267t, this.f1245R);
                this.f1264q = adk;
                this.f1251a.setAdapter(adk);
                ((adk) this.f1264q).f265a = 1;
            }
            m1320r();
        }
        SearchableInfo searchableInfo2 = this.f1267t;
        if (searchableInfo2 == null || !searchableInfo2.getVoiceSearchEnabled()) {
            z = false;
        } else {
            if (this.f1267t.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1234G;
            } else if (this.f1267t.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1235H;
            }
            if (intent == null) {
                z = false;
            } else if (getContext().getPackageManager().resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == null) {
                z = false;
            }
        }
        this.f1240M = z;
        if (z) {
            this.f1251a.setPrivateImeOptions("nm");
        }
        mo1622b(this.f1263p);
    }

    /* renamed from: a */
    public final void mo1615a(CharSequence charSequence) {
        this.f1237J = charSequence;
        m1320r();
    }

    /* renamed from: a */
    public final void mo1616a(CharSequence charSequence, boolean z) {
        this.f1251a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1251a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1266s = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1631j();
        }
    }

    /* renamed from: a */
    public final void mo1617a(String str) {
        getContext().startActivity(m1316a("android.intent.action.SEARCH", null, null, str));
    }

    /* renamed from: a */
    public final void mo1618a(boolean z) {
        if (!z) {
            mo1633l();
        } else {
            mo1632k();
        }
    }
}
