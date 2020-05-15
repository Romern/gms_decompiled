package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.Session;
import com.google.android.wallet.clientlog.TimedEvent;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.wallet.ui.common.FormEditText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FormEditText extends C1492xo implements View.OnFocusChangeListener, AdapterView.OnItemClickListener, bkfw, bkce, bkbm, bjwp, bjwm, bjwh, bjsx, bkcm {

    /* renamed from: a */
    private static final Pattern f151978a = Pattern.compile("\\d*");

    /* renamed from: aa */
    public static final InputFilter[] f151979aa = new InputFilter[0];

    /* renamed from: ao */
    public static final /* synthetic */ int f151980ao = 0;

    /* renamed from: A */
    public bkgh f151981A;

    /* renamed from: B */
    public bkdf f151982B;

    /* renamed from: C */
    public boolean f151983C = true;

    /* renamed from: D */
    public boolean f151984D = false;

    /* renamed from: E */
    public boolean f151985E = false;

    /* renamed from: F */
    public int f151986F = -1;

    /* renamed from: G */
    public boolean f151987G;

    /* renamed from: H */
    public CharSequence f151988H;

    /* renamed from: I */
    public bkdv f151989I;

    /* renamed from: J */
    public bkda f151990J;

    /* renamed from: K */
    bkcp f151991K;

    /* renamed from: L */
    bkcm f151992L;

    /* renamed from: M */
    String f151993M = "";

    /* renamed from: N */
    public String f151994N = "";

    /* renamed from: O */
    public boolean f151995O = false;

    /* renamed from: P */
    public int f151996P = 0;

    /* renamed from: Q */
    protected int f151997Q;

    /* renamed from: R */
    public boolean f151998R = false;

    /* renamed from: S */
    public bmnn f151999S;

    /* renamed from: T */
    public bkeq f152000T;

    /* renamed from: U */
    public final ArrayList f152001U = new ArrayList();

    /* renamed from: V */
    public boolean f152002V;

    /* renamed from: W */
    public bkhe f152003W;

    /* renamed from: ab */
    public long f152004ab;

    /* renamed from: ac */
    public String f152005ac = "";

    /* renamed from: ad */
    public LogContext f152006ad;

    /* renamed from: ae */
    public boolean f152007ae;

    /* renamed from: af */
    public boolean f152008af = true;

    /* renamed from: ag */
    public bjsv f152009ag = new bjsv(this, 2);

    /* renamed from: ah */
    public bjwk f152010ah;

    /* renamed from: ai */
    public final TextWatcher f152011ai = new bkdq(this);

    /* renamed from: aj */
    final TextWatcher f152012aj = new bkdr(this);

    /* renamed from: ak */
    final TextWatcher f152013ak = new bkds(this);

    /* renamed from: al */
    public bjzx f152014al;

    /* renamed from: am */
    int f152015am = 1;

    /* renamed from: an */
    public int f152016an = 2;

    /* renamed from: ap */
    private final TextWatcher f152017ap = new bkdp(this);

    /* renamed from: aq */
    private int f152018aq = 1;

    /* renamed from: b */
    private bkdf f152019b = this;

    /* renamed from: c */
    private bkce f152020c;

    /* renamed from: d */
    private boolean f152021d = true;

    /* renamed from: e */
    private boolean f152022e = true;

    /* renamed from: f */
    private boolean f152023f = true;

    /* renamed from: g */
    private String f152024g = null;

    /* renamed from: h */
    private int f152025h = -1;

    /* renamed from: i */
    private boolean f152026i;

    /* renamed from: j */
    private bkhi f152027j;

    /* renamed from: k */
    private int f152028k;

    /* renamed from: l */
    private boolean f152029l = false;

    /* renamed from: m */
    private int f152030m = -1;

    /* renamed from: n */
    private String f152031n;

    /* renamed from: o */
    private boolean f152032o;

    /* renamed from: p */
    private String f152033p;

    /* renamed from: q */
    private String f152034q;

    /* renamed from: r */
    private CharSequence f152035r;

    /* renamed from: s */
    private boolean f152036s;

    /* renamed from: t */
    private TimedEvent f152037t;

    /* renamed from: u */
    public TextWatcher f152038u = null;

    /* renamed from: v */
    public LinkedList f152039v = new LinkedList();

    /* renamed from: w */
    LinkedList f152040w;

    /* renamed from: x */
    LinkedList f152041x;

    /* renamed from: y */
    final bkgl f152042y = new bkgl(new bkgj[0]);

    /* renamed from: z */
    public final bkgl f152043z = new bkgl(new bkgj[0]);

    public FormEditText(Context context) {
        super(context);
        m118468a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static String m118466a(String str, int i) {
        if (str.length() >= i || str.isEmpty()) {
            return str;
        }
        int length = i - str.length();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean mo71834b(int i) {
        return (i == 1 || i == 6) ? false : true;
    }

    /* renamed from: d */
    private final String m118470d(boolean z) {
        int i;
        String m = mo71937m();
        if (this.f152016an == 2) {
            return m;
        }
        if (this.f152032o) {
            int size = this.f152001U.size();
            StringBuilder sb = new StringBuilder(size);
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f152031n.charAt(((Integer) this.f152001U.get(i2)).intValue()) != m.charAt(i2)) {
                    sb.append(m.charAt(i2));
                }
            }
            m = sb.toString();
        }
        int length = m.length();
        if (this.f152016an == 3) {
            double d = (double) length;
            Double.isNaN(d);
            i = (int) Math.ceil(d / 4.0d);
        } else {
            i = 0;
        }
        if (this.f152016an == 4 || i > 4) {
            i = Math.min(4, length);
        }
        int i3 = length - i;
        String substring = m.substring(i3);
        if (!z) {
            return substring;
        }
        StringBuilder sb2 = new StringBuilder(length);
        if (TextUtils.isEmpty(this.f151994N)) {
            for (int i4 = 0; i4 < i3; i4++) {
                sb2.append(8226);
            }
        } else if (length > 0) {
            sb2.append(this.f151994N);
        }
        sb2.append(substring);
        return sb2.toString();
    }

    /* renamed from: g */
    private final void mo66001g() {
        super.setVisibility(!this.f151998R ? this.f151997Q : 8);
    }

    /* renamed from: h */
    private final LinkedList mo66002h() {
        if (this.f152041x == null) {
            this.f152041x = new LinkedList();
        }
        return this.f152041x;
    }

    /* renamed from: i */
    private final void mo66003i() {
        TimedEvent timedEvent;
        long j = this.f152004ab;
        if (j != 0) {
            LogContext logContext = this.f152006ad;
            String str = this.f152005ac;
            if (!bjst.m104536d(logContext)) {
                Log.e("ClientLog", "Tried to log startFocused() in an invalid session.");
                timedEvent = null;
            } else {
                Session b = logContext.mo71783b();
                bxvd da = bwfu.f159137e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwfu bwfu = (bwfu) da.f164949b;
                bwfu.f159140b = 1;
                bwfu.f159139a = 1 | bwfu.f159139a;
                if (b.f151805e && !TextUtils.isEmpty(str)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwfu bwfu2 = (bwfu) da.f164949b;
                    str.getClass();
                    bwfu2.f159139a |= 2;
                    bwfu2.f159141c = str;
                }
                bxvd e = bjst.m104537e(logContext);
                bwfe bwfe = bwfe.EVENT_NAME_FIELD_FOCUSED_START;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr = (bwfr) e.f164949b;
                bwfr bwfr2 = bwfr.f159113m;
                bwfr.f159121g = bwfe.f159083I;
                int i = bwfr.f159115a | 4;
                bwfr.f159115a = i;
                bwfr.f159115a = i | 32;
                bwfr.f159124j = j;
                bwfu bwfu3 = (bwfu) da.mo74062i();
                bwfu3.getClass();
                bwfr.f159117c = bwfu3;
                bwfr.f159116b = 11;
                bwfr bwfr3 = (bwfr) e.mo74062i();
                bjst.m104528a(b, bwfr3);
                timedEvent = new TimedEvent(bwfr3);
            }
            this.f152037t = timedEvent;
            this.f152007ae = false;
        }
    }

    /* renamed from: j */
    private final void mo71885j() {
        if (this.f152037t != null) {
            m118475w();
            bjst.m104522a(this.f152006ad, this.f152037t);
            this.f152037t = null;
        }
    }

    /* renamed from: w */
    private final void m118475w() {
        if (this.f152007ae) {
            bjst.m104526a(this.f152006ad, this.f152005ac, this.f152004ab, 2, mo71938n());
            this.f152007ae = false;
        }
    }

    /* renamed from: x */
    private final boolean m118476x() {
        int inputType = getInputType();
        return (inputType & 1) != 1 ? (inputType & 2) == 2 && (inputType & 16) == 16 : (inputType & 128) == 128;
    }

    /* renamed from: y */
    private final CharSequence m118477y() {
        if (!((Boolean) bjwe.f123473H.mo54082a()).booleanValue() || getError() == null) {
            return getError();
        }
        return Html.fromHtml(getError().toString()).toString();
    }

    /* renamed from: z */
    private final void m118478z() {
        bkhi bkhi;
        if (mo71952r() && this.f152027j == null) {
            bkhi bkhi2 = new bkhi(this.f152024g);
            this.f152027j = bkhi2;
            mo65972a((bkgj) bkhi2);
        } else if (!mo71952r() && (bkhi = this.f152027j) != null) {
            mo65973c(bkhi);
            this.f152027j = null;
        }
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    /* renamed from: a */
    public final void mo71914a(long j) {
        this.f152004ab = j;
        this.f152009ag.f123259b = j;
    }

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f152010ah = bjwk;
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        mo71950p().addLast(textWatcher);
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        ArrayList arrayList = this.f152042y.f124212a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwl.m104790b(this, ((bkgj) arrayList.get(i)).f124210c, this.f152010ah);
        }
    }

    public final void beginBatchEdit() {
        if (getError() != null) {
            setError(getError());
        }
        super.beginBatchEdit();
    }

    /* renamed from: c */
    public final void mo65514c() {
        if (hasFocus()) {
            mo66003i();
        }
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return (!this.f151985E && getVisibility() != 0) || this.f152042y.mo65994b(this);
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        boolean cL = mo65798cL();
        CharSequence charSequence = this.f152042y.f124209b;
        if (!cL && charSequence != null) {
            if (getError() == null || !charSequence.toString().contentEquals(getError())) {
                if (this.f151996P == 0) {
                    mo71954s();
                }
                setError(charSequence);
            }
        } else if (getError() != null) {
            setError(null);
        }
        return cL;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        InputMethodManager inputMethodManager;
        if (this.f151998R) {
            return false;
        }
        if (hasFocus() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.showSoftInput(this, 1);
        }
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
            if (getError() != null) {
                mo71951q();
            }
        }
        return hasFocus();
    }

    /* renamed from: cO */
    public boolean mo65775cO() {
        return this.f152031n != null ? mo71938n() >= this.f152001U.size() : this.f151986F >= 0 && mo71938n() >= this.f151986F;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public boolean enoughToFilter() {
        return !this.f152036s && getText().length() >= this.f152028k;
    }

    public final CharSequence getError() {
        bkda bkda = this.f151990J;
        if (bkda != null) {
            return bkda.mo52932m();
        }
        return super.getError();
    }

    public final CharSequence getHint() {
        CharSequence hint = super.getHint();
        TextUtils.isEmpty(hint);
        return hint;
    }

    public final int getThreshold() {
        return this.f152028k;
    }

    /* renamed from: k */
    public final void mo71935k() {
        this.f151981A = null;
        this.f151987G = false;
    }

    /* renamed from: l */
    public final CharSequence mo71936l() {
        bkcp bkcp = this.f151991K;
        return bkcp != null ? bkcp.mo65850a() : this.f152035r;
    }

    /* renamed from: m */
    public final String mo71937m() {
        String str;
        String str2;
        String str3 = "";
        if (this.f151998R) {
            return str3;
        }
        if (!this.f152029l) {
            str = getText().toString();
        } else {
            str = this.f151993M;
        }
        if (str.equals(this.f152033p)) {
            return this.f152034q;
        }
        bkeq bkeq = this.f152000T;
        int i = 0;
        if (bkeq != null) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                String[] a = bjyz.m104955a(str, bkeq.f124100b);
                String str4 = a[0];
                bmnl bmnl = bkeq.f124099a;
                String a2 = bjyz.m104952a(str4, bmnl.f130121c, bmnl.f130122d);
                sb.append(a2);
                if (!TextUtils.isEmpty(a[1])) {
                    if (a2.length() == 0) {
                        sb.append('0');
                    }
                    sb.append('.');
                    sb.append(a[1]);
                }
                str3 = sb.toString();
            }
            str2 = str;
            str = str3;
        } else if (this.f152031n == null) {
            str2 = str;
        } else {
            if (this.f152032o && str.isEmpty()) {
                str = this.f152031n;
            }
            int size = this.f152001U.size();
            StringBuilder sb2 = new StringBuilder(size);
            int length = str.length();
            int i2 = 0;
            while (i2 < size && ((Integer) this.f152001U.get(i2)).intValue() < length) {
                sb2.append(str.charAt(((Integer) this.f152001U.get(i2)).intValue()));
                i2++;
            }
            str2 = str;
            str = sb2.toString();
        }
        int i3 = this.f152015am;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 == 1) {
                str = m118466a(str, this.f151986F);
            } else if (i4 == 2) {
                str = m118466a(str, this.f152025h);
            } else if (i4 == 3) {
                int length2 = str.length();
                while (i < length2 && str.charAt(i) == '0') {
                    i++;
                }
                str = str.substring(i);
            }
            this.f152033p = str2;
            this.f152034q = str;
            return str;
        }
        throw null;
    }

    /* renamed from: n */
    public final int mo71938n() {
        CharSequence charSequence;
        if (this.f151998R) {
            return 0;
        }
        if (((Boolean) bjwe.f123469D.mo54082a()).booleanValue() && this.f152029l) {
            charSequence = this.f151993M;
        } else {
            charSequence = getText();
        }
        if (this.f152031n == null) {
            return TextUtils.getTrimmedLength(charSequence);
        }
        if (charSequence.length() == 0) {
            return 0;
        }
        int size = this.f152001U.size();
        int length = charSequence.length();
        for (int i = 0; i < size; i++) {
            int intValue = ((Integer) this.f152001U.get(i)).intValue();
            if (intValue >= length || charSequence.charAt(intValue) == this.f152031n.charAt(intValue)) {
                return i;
            }
        }
        return size;
    }

    /* renamed from: o */
    public final String mo71939o() {
        return m118470d(false);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LogContext logContext = this.f152006ad;
        if (logContext != null) {
            logContext.mo71780a(this);
            int i = this.f152018aq;
            if (i != 1) {
                bjst.m104526a(this.f152006ad, this.f152005ac, this.f152004ab, i, mo71938n());
                this.f152018aq = 1;
            }
        }
        this.f152009ag.mo65506a();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        editorInfo.imeOptions |= 268435456;
        return new bkdu(this, onCreateInputConnection);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LogContext logContext = this.f152006ad;
        if (logContext != null) {
            logContext.mo71784b(this);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            mo71960t();
        } else {
            mo71961u();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, boolean):void */
    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        bkdf bkdf;
        super.onFocusChanged(z, i, rect);
        if (this.f152006ad != null) {
            if (!z) {
                mo71885j();
            } else {
                mo66003i();
            }
        }
        if (((Boolean) bjwe.f123468C.mo54082a()).booleanValue() && hasFocus() && !TextUtils.isEmpty(getText())) {
            setSelection(getText().length());
        }
        boolean z2 = false;
        if (hasFocus() && enoughToFilter() && getWindowVisibility() != 8 && getAdapter() != null) {
            performFiltering(getText(), 0);
            showDropDown();
        }
        if (!z && getError() == null && isEnabled() && (bkdf = this.f152019b) != null) {
            bkdf.mo65799cM();
        }
        if (z && getError() != null) {
            mo71951q();
        }
        LinkedList linkedList = this.f152041x;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((View.OnFocusChangeListener) it.next()).onFocusChange(this, z);
            }
        }
        if (this.f152031n != null && this.f152002V) {
            if (z && TextUtils.isEmpty(getText())) {
                mo71927b((CharSequence) "", false);
                setSelection(((Integer) this.f152001U.get(0)).intValue());
                int i2 = Build.VERSION.SDK_INT;
                if (bjvb.m104683a(getContext())) {
                    announceForAccessibility(getHint());
                    z2 = true;
                }
            } else if (!z && mo71938n() == 0) {
                mo71927b((CharSequence) "", false);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (hasFocus() && !isAccessibilityFocused() && !z2) {
            sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!m118476x()) {
            accessibilityNodeInfo.setText(mo71962v());
        }
        int i = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setError(null);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        View focusSearch;
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        bjzx bjzx = this.f152014al;
        if (bjzx != null && itemAtPosition != null && (itemAtPosition instanceof bjtj)) {
            bjtj bjtj = (bjtj) itemAtPosition;
            btwp btwp = bjtj.f123275d;
            String str = bjtj.f123274c;
            if (str == null) {
                str = "";
            }
            if (btwp != null) {
                bjzx.f123717b.mo65698a(bjzx.f123716a, btwp);
            } else if (!TextUtils.isEmpty(bjtj.f123278g)) {
                bjzx.f123716a.mo71926b(str, 1);
                new bkad(bjzx.f123717b, bjzx.f123716a).execute(bjtj);
            } else {
                bjzx.f123716a.mo71926b(str, 5);
                if (bjzx.f123716a.mo65799cM()) {
                    bkaf bkaf = bjzx.f123717b;
                    FormEditText formEditText = bjzx.f123716a;
                    if (formEditText == null || (focusSearch = formEditText.focusSearch(130)) == null) {
                        bkaf.mo65721o();
                    } else {
                        focusSearch.requestFocus();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextUtils.isEmpty(super.getHint());
        super.onMeasure(i, i2);
        setThreshold(this.f152028k);
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!m118476x() && accessibilityEvent.getEventType() == 32768) {
            List<CharSequence> text = accessibilityEvent.getText();
            if (!text.isEmpty()) {
                text.remove(0);
            }
            text.add(0, mo71962v());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        int i2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            bmnn bmnn = (bmnn) bjvp.m104730a(bundle, "templateSpec", (bxxk) bmnn.f130132e.mo74142c(7));
            if (bmnn != this.f151999S) {
                mo71918a(bmnn);
            }
            TextWatcher textWatcher = this.f152038u;
            boolean z = this.f151983C;
            this.f152038u = null;
            this.f151983C = false;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
            this.f152038u = textWatcher;
            this.f151983C = z;
            bkgl bkgl = this.f152042y;
            Bundle bundle2 = bundle.getBundle("validationState");
            if (bundle2 != null) {
                long[] longArray = bundle2.getLongArray("enabledValidatorReferences");
                if (longArray != null) {
                    i = longArray.length;
                } else {
                    i = 0;
                }
                for (int i3 = 0; i3 < i; i3++) {
                    bkgl.mo65995a(longArray[i3], true);
                }
                long[] longArray2 = bundle2.getLongArray("disabledValidatorReferences");
                if (longArray2 != null) {
                    i2 = longArray2.length;
                } else {
                    i2 = 0;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    bkgl.mo65995a(longArray2[i4], false);
                }
            }
            this.f152009ag.mo65507a(bundle.getBundle("impressionLoggerState"));
            this.f152018aq = 1;
            if (bundle.getStringArray("savedSuggestions") != null) {
                mo71921a(Arrays.asList(bundle.getStringArray("savedSuggestions")));
            }
            if (chgu.m148707b()) {
                this.f151997Q = bundle.getInt("requestedVisibility", 0);
                mo65845a(bundle.getBoolean("isHiddenByDependencyGraph"));
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bjvp.m104736a(bundle, "templateSpec", this.f151999S);
        bkgl bkgl = this.f152042y;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int b = bkgl.f124213e.mo15537b();
        for (int i = 0; i < b; i++) {
            long a = bkgl.f124213e.mo15533a(i);
            if (((bkgj) bkgl.f124213e.mo15538b(i)).f124211d) {
                arrayList.add(Long.valueOf(a));
            } else {
                arrayList2.add(Long.valueOf(a));
            }
        }
        int b2 = bkgl.f124214f.mo15537b();
        for (int i2 = 0; i2 < b2; i2++) {
            long a2 = bkgl.f124214f.mo15533a(i2);
            if (((Boolean) bkgl.f124214f.mo15538b(i2)).booleanValue()) {
                arrayList.add(Long.valueOf(a2));
            } else {
                arrayList2.add(Long.valueOf(a2));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLongArray("enabledValidatorReferences", bjyu.m104931b(arrayList));
        bundle2.putLongArray("disabledValidatorReferences", bjyu.m104931b(arrayList2));
        bundle.putBundle("validationState", bundle2);
        bundle.putBundle("impressionLoggerState", this.f152009ag.mo65508b());
        if (getAdapter() != null && (getAdapter() instanceof bkeh)) {
            List list = ((bkeh) getAdapter()).f124081a;
            bundle.putStringArray("savedSuggestions", (String[]) list.toArray(new String[list.size()]));
        }
        bundle.putBoolean("isHiddenByDependencyGraph", this.f151998R);
        bundle.putInt("requestedVisibility", this.f151997Q);
        return bundle;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (hasFocus() || !TextUtils.isEmpty(getText())) {
            z = false;
        } else {
            z = true;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f152031n != null && this.f152002V && z && hasFocus()) {
            setSelection(((Integer) this.f152001U.get(0)).intValue());
        }
        return onTouchEvent;
    }

    /* renamed from: p */
    public final LinkedList mo71950p() {
        if (this.f152040w == null) {
            this.f152040w = new LinkedList();
        }
        return this.f152040w;
    }

    /* renamed from: q */
    public final void mo71951q() {
        int i = Build.VERSION.SDK_INT;
        if (bjvb.m104683a(getContext())) {
            announceForAccessibility(getResources().getString(C0126R.string.wallet_uic_accessibility_event_form_field_error, !TextUtils.isEmpty(getHint()) ? getHint() : getContentDescription(), m118477y()));
        }
    }

    /* renamed from: r */
    public final boolean mo71952r() {
        return this.f152021d && !this.f151998R;
    }

    public final void removeTextChangedListener(TextWatcher textWatcher) {
        mo71950p().remove(textWatcher);
    }

    /* renamed from: s */
    public final void mo71954s() {
        m118475w();
        bjst.m104519a(this.f152006ad, 2, this.f152005ac, this.f152004ab);
    }

    public final void setEnabled(boolean z) {
        if (this.f152023f != z) {
            this.f152023f = z;
            boolean z2 = false;
            if (z && this.f152022e) {
                z2 = true;
            }
            super.setEnabled(z2);
        }
    }

    public final void setError(CharSequence charSequence, Drawable drawable) {
        boolean z;
        bkda bkda = this.f151990J;
        if (bkda != null) {
            bkda.mo52929a(charSequence);
        } else {
            super.setError(charSequence, drawable);
        }
        bkdv bkdv = this.f151989I;
        if (bkdv != null) {
            if (charSequence != null) {
                z = true;
            } else {
                z = false;
            }
            bkdv.mo52774b(z);
        }
    }

    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener != null) {
            mo66002h().add(onFocusChangeListener);
        }
    }

    public final void setThreshold(int i) {
        if (i < 0) {
            i = 0;
        }
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        int i2 = (int) getResources().getDisplayMetrics().density;
        if (i2 == 0 || rect.height() / i2 <= 140) {
            this.f152028k = Integer.MAX_VALUE;
            dismissDropDown();
            return;
        }
        this.f152028k = i;
    }

    public final void setVisibility(int i) {
        if (chgu.m148707b()) {
            mo65846c(i);
            return;
        }
        super.setVisibility(i);
        bkcm bkcm = this.f151992L;
        if (bkcm != null) {
            ((View) bkcm).setVisibility(i);
        }
    }

    /* renamed from: t */
    public final void mo71960t() {
        int i;
        if (!this.f152029l && this.f151995O) {
            this.f151993M = getText().toString();
            String d = m118470d(true);
            if (this.f152031n == null && (i = this.f151986F) > 0) {
                this.f152030m = i;
                mo71880a(this.f152025h, d.length(), this.f152015am);
            }
            mo71930c(d, false);
            this.f152029l = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.common.FormEditText, com.google.android.wallet.ui.common.FormEditText, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* renamed from: u */
    public final void mo71961u() {
        if (this.f152029l) {
            if (this.f152031n == null && this.f151986F > 0) {
                mo71880a(this.f152025h, this.f152030m, this.f152015am);
            }
            mo71935k();
            mo71930c(this.f151993M, false);
            mo71917a((bkce) this, (bkdf) this, false);
            this.f152029l = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final String mo71962v() {
        return getResources().getString(C0126R.string.wallet_uic_accessibility_event_form_field_description, bkfr.m105553a(TextUtils.isEmpty(getHint()) ? getContentDescription() : getHint()), bkfr.m105553a(getText()), bkfr.m105553a(mo71936l()), bkfr.m105553a(m118477y())).trim();
    }

    /* renamed from: b */
    public final void mo65513b() {
        mo71885j();
    }

    /* renamed from: c */
    public final void mo65846c(int i) {
        this.f151997Q = i;
        mo66001g();
        bkcm bkcm = this.f151992L;
        if (bkcm != null) {
            bkcm.mo65846c(i);
        }
    }

    /* renamed from: b */
    public final void mo71924b(TextWatcher textWatcher) {
        this.f152039v.add(textWatcher);
    }

    /* renamed from: b */
    public final void mo65786b(bker bker) {
        bkgh bkgh = this.f151981A;
        if (bkgh != null) {
            bkgh.f124199a.remove(bker);
            if (bkgh.f124200b == bker) {
                bkgh.f124200b = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo65973c(bkgj bkgj) {
        this.f152042y.mo65997b(bkgj);
        this.f152043z.mo65997b(bkgj);
        bjwl.m104790b(this, bkgj.f124210c, this.f152010ah);
    }

    /* renamed from: a */
    private final void mo71830a(int i) {
        if (i == 1) {
            return;
        }
        if (C1280ps.m19871F(this)) {
            bjst.m104526a(this.f152006ad, this.f152005ac, this.f152004ab, i, mo71938n());
        } else {
            this.f152018aq = i;
        }
    }

    /* renamed from: c */
    public final void mo71930c(CharSequence charSequence, boolean z) {
        TextWatcher textWatcher = this.f152038u;
        boolean z2 = this.f151983C;
        this.f152038u = null;
        if (!z) {
            this.f151983C = false;
        }
        this.f152008af = false;
        setText(charSequence);
        this.f152038u = textWatcher;
        this.f151983C = z2;
        this.f152008af = true;
    }

    /* renamed from: b */
    public final void mo71925b(bkgj bkgj) {
        mo65972a(bkgj);
        this.f152043z.mo65996a(bkgj);
    }

    /* renamed from: c */
    public final void mo71931c(boolean z) {
        if (this.f152022e != z) {
            this.f152022e = z;
            boolean z2 = false;
            if (this.f152023f && z) {
                z2 = true;
            }
            super.setEnabled(z2);
        }
    }

    /* renamed from: a */
    private final void m118468a(Context context, AttributeSet attributeSet) {
        bkhh bkhh;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843104, C0126R.attr.internalUicAllowFullScreenIme});
        this.f151986F = obtainStyledAttributes.getInt(0, -1);
        this.f152026i = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{C0126R.attr.internalUicValidateFieldsWhenNotVisible});
        boolean z = obtainStyledAttributes2.getBoolean(0, false);
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, bkju.f124468f);
        this.f152021d = obtainStyledAttributes3.getBoolean(0, true);
        this.f151985E = obtainStyledAttributes3.getBoolean(2, z);
        String string = obtainStyledAttributes3.getString(3);
        int i = obtainStyledAttributes3.getInt(5, 0);
        if (i == 1) {
            if (TextUtils.isEmpty(string)) {
                string = context.getString(C0126R.string.wallet_uic_error_only_numeric_digits_allowed);
            }
            bkhh bkhh2 = new bkhh(string, f151978a);
            setInputType(2);
            bkhh = bkhh2;
        } else if (i == 2) {
            if (TextUtils.isEmpty(string)) {
                string = context.getString(C0126R.string.wallet_uic_error_email_address_invalid);
            }
            bkhh = new bkhh(string, Patterns.EMAIL_ADDRESS);
            setInputType(33);
        } else if (i != 3) {
            bkhh = null;
        } else {
            bkhh = new bkhh(string, Pattern.compile(obtainStyledAttributes3.getString(4)));
        }
        if (mo71952r()) {
            String string2 = obtainStyledAttributes3.getString(1);
            this.f152024g = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f152024g = context.getString(C0126R.string.wallet_uic_error_field_must_not_be_empty);
            }
            m118478z();
        }
        if (bkhh != null) {
            mo65972a((bkgj) bkhh);
        }
        obtainStyledAttributes3.recycle();
        if (this.f152026i) {
            setImeOptions(getImeOptions());
        } else {
            setImeOptions(getImeOptions() | 301989888);
        }
        super.addTextChangedListener(this.f152013ak);
        mo71915a(this.f152012aj);
        super.setOnItemClickListener(this);
        setThreshold(Integer.MAX_VALUE);
        this.f151997Q = getVisibility();
    }

    /* renamed from: b */
    public final void mo71926b(CharSequence charSequence, int i) {
        m118475w();
        this.f152036s = true;
        if (isFocused()) {
            TextWatcher textWatcher = this.f152038u;
            boolean z = this.f151983C;
            this.f152038u = null;
            if (!mo71834b(i)) {
                this.f151983C = false;
            }
            this.f152008af = false;
            replaceText(charSequence);
            this.f152038u = textWatcher;
            this.f151983C = z;
            this.f152008af = true;
        } else {
            mo71930c(charSequence, mo71834b(i));
        }
        this.f152036s = false;
        mo71830a(i);
    }

    public FormEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118468a(context, attributeSet);
    }

    /* renamed from: d */
    public String mo71835d() {
        return getContext().getString(C0126R.string.wallet_uic_error_field_must_be_complete);
    }

    /* renamed from: d */
    public final void mo71932d(int i) {
        if (this.f152031n != null) {
            if (TextUtils.isEmpty(getText())) {
                i = 0;
            } else if (i < this.f152001U.size()) {
                i = Math.min(((Integer) this.f152001U.get(i)).intValue(), getText().length());
            } else {
                ArrayList arrayList = this.f152001U;
                i = Math.min(((Integer) arrayList.get(arrayList.size() - 1)).intValue() + 1, getText().length());
            }
        }
        setSelection(i);
    }

    /* renamed from: b */
    public final void mo71927b(CharSequence charSequence, boolean z) {
        boolean z2;
        bkeq bkeq = this.f152000T;
        if (bkeq != null) {
            charSequence = bkeq.mo65914a(charSequence);
        }
        int i = 0;
        if (!this.f152002V || !hasFocus()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f152031n != null) {
            String str = null;
            if (!TextUtils.isEmpty(charSequence) || z2) {
                char[] charArray = this.f152031n.toCharArray();
                int size = this.f152001U.size();
                boolean z3 = false;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (i < charSequence.length()) {
                        if (charArray[((Integer) this.f152001U.get(i)).intValue()] != charSequence.charAt(i)) {
                            charArray[((Integer) this.f152001U.get(i)).intValue()] = charSequence.charAt(i);
                            z3 = true;
                        }
                        i++;
                    } else if (!this.f152032o) {
                        charArray = Arrays.copyOf(charArray, ((Integer) this.f152001U.get(i)).intValue());
                    }
                }
                if (z2 || z3) {
                    str = String.valueOf(charArray);
                }
                mo71930c(str, z);
            } else if (!TextUtils.isEmpty(getText())) {
                mo71930c(null, z);
            }
        } else {
            mo71930c(charSequence, z);
        }
        if (!hasFocus() && this.f152016an != 2) {
            mo71960t();
        }
    }

    public FormEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118468a(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo71928b(boolean z) {
        this.f152021d = z;
        m118478z();
    }

    /* renamed from: a */
    public String mo52823a(String str) {
        return (mo65798cL() && !m118476x() && !this.f151998R) ? getText().toString() : "";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.common.FormEditText, com.google.android.wallet.ui.common.FormEditText, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* renamed from: a */
    public void mo71880a(int i, int i2, int i3) {
        this.f152015am = i3;
        if (this.f152000T == null) {
            if (this.f152031n != null) {
                if (i2 != this.f152001U.size()) {
                    int size = this.f152001U.size();
                    StringBuilder sb = new StringBuilder(113);
                    sb.append("maxLength (");
                    sb.append(i2);
                    sb.append(") must be equal to the number of input placeholder characters in the template (");
                    sb.append(size);
                    sb.append(")");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (i2 > 0) {
                setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
                mo71917a((bkce) this, (bkdf) this, false);
                this.f151986F = i2;
            }
            this.f152025h = i;
            bkhe bkhe = this.f152003W;
            if (bkhe != null) {
                mo65973c(bkhe);
            }
            if (i <= 0) {
                return;
            }
            if (i3 == 1 || i3 == 4) {
                bkdo bkdo = new bkdo(this, i);
                this.f152003W = bkdo;
                mo65972a((bkgj) bkdo);
            }
        } else if (i > 0 || i2 > 0) {
            throw new IllegalArgumentException("Min/max length shouldn't be used with a number formatting scheme since we are using formatted numeric values.");
        }
    }

    /* renamed from: a */
    public final void mo71915a(TextWatcher textWatcher) {
        mo71950p().addFirst(textWatcher);
    }

    /* renamed from: a */
    public final void mo71916a(View.OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener != null) {
            mo66002h().remove(onFocusChangeListener);
        }
    }

    /* renamed from: a */
    public final void mo71917a(bkce bkce, bkdf bkdf, boolean z) {
        if (this.f151981A == null || this.f152020c != bkce || this.f151982B != bkdf) {
            this.f151981A = new bkgh(this, bkce, bkdf);
            this.f151987G = z;
            this.f152020c = bkce;
            this.f151982B = bkdf;
        }
    }

    /* renamed from: a */
    public final void mo65785a(bker bker) {
        bkgh bkgh = this.f151981A;
        if (bkgh != null) {
            bkgh.mo65986a(bker, false);
        }
    }

    /* renamed from: a */
    public final void mo65972a(bkgj bkgj) {
        this.f152042y.mo65996a(bkgj);
        long j = bkgj.f124210c;
        if (j != 0) {
            bjwl.m104784a(this, j, this.f152010ah);
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 11) {
                    if (i2 != 14) {
                        Object[] objArr = new Object[1];
                        int a2 = bmmb.m108166a(bmmv.f130058d);
                        if (a2 != 0) {
                            i = a2;
                        }
                        objArr[0] = Integer.valueOf(i - 1);
                        throw new IllegalArgumentException(String.format("Unknown ResultingActionReference action type %s", objArr));
                    } else if (bmmv.f130056b == 10) {
                        long j = bmmv.f130059e;
                        bwip bwip = ((bmmu) bmmv.f130057c).f130051a;
                        if (bwip == null) {
                            bwip = bwip.f159664e;
                        }
                        if (!bwip.f159667b) {
                            if (mo65798cL() || TextUtils.isEmpty(getError())) {
                                i = 0;
                            }
                            this.f152042y.mo65995a(j, false);
                            if (i != 0) {
                                mo65799cM();
                                return;
                            }
                            return;
                        }
                        boolean cL = mo65798cL();
                        this.f152042y.mo65995a(j, true);
                        if (cL && !mo65798cL()) {
                            mo65799cM();
                        }
                    } else {
                        throw new IllegalArgumentException("No updateFlagAction provided.");
                    }
                } else if (chgu.m148707b()) {
                    mo65845a(true);
                }
            } else if (mo71938n() > 0) {
                mo71832a((CharSequence) null, 7);
            }
        } else if (chgu.m148707b()) {
            mo65845a(false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
     arg types: [bmnn, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void */
    /* renamed from: a */
    public final void mo71918a(bmnn bmnn) {
        mo71882a(bmnn, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.common.FormEditText, com.google.android.wallet.ui.common.FormEditText, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71882a(bmnn bmnn, boolean z) {
        if (bmxi.m108538a(this.f151999S, bmnn)) {
            return;
        }
        if (this.f152000T != null && bmnn != null) {
            throw new IllegalArgumentException("Cannot set schemes for both number formatting and template formatting.");
        } else if (this.f151986F < 0) {
            String m = mo71937m();
            int selectionStart = getSelectionStart();
            if (this.f152031n != null && (selectionStart = Collections.binarySearch(this.f152001U, Integer.valueOf(selectionStart))) < 0) {
                selectionStart = (-selectionStart) - 1;
            }
            bmnn bmnn2 = this.f151999S;
            if (bmnn2 == null && bmnn != null) {
                this.f152038u = this.f152017ap;
            } else if (bmnn2 != null && bmnn == null) {
                this.f152038u = null;
            }
            this.f151999S = bmnn;
            mo71935k();
            this.f152001U.clear();
            bkhe bkhe = this.f152003W;
            if (bkhe != null) {
                mo65973c(bkhe);
            }
            this.f152033p = null;
            this.f152034q = null;
            if (bmnn != null) {
                this.f152032o = bmnn.f130137d;
                int size = bmnn.f130135b.size();
                char[] cArr = new char[size];
                char[] cArr2 = new char[size];
                for (int i = 0; i < size; i++) {
                    cArr[i] = ((bmnm) bmnn.f130135b.get(i)).f130130b.charAt(0);
                    cArr2[i] = this.f152032o ? ((bmnm) bmnn.f130135b.get(i)).f130131c.charAt(0) : '~';
                }
                char[] charArray = bmnn.f130136c.toCharArray();
                int length = charArray.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (charArray[i2] == cArr[i3]) {
                            charArray[i2] = cArr2[i3];
                            this.f152001U.add(Integer.valueOf(i2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (!this.f152001U.isEmpty()) {
                    this.f152031n = String.valueOf(charArray);
                    if (z) {
                        mo71927b((CharSequence) m, false);
                        if (hasFocus()) {
                            mo71932d(selectionStart);
                        }
                    }
                    mo71917a((bkce) this, (bkdf) this, false);
                    bkdn bkdn = new bkdn(this, this.f152001U.size());
                    this.f152003W = bkdn;
                    mo65972a((bkgj) bkdn);
                    return;
                }
                throw new IllegalArgumentException("The template formatting scheme must contain at least one input character");
            }
            this.f152031n = null;
            if (z) {
                mo71927b((CharSequence) m, false);
                setSelection(selectionStart);
            }
        } else {
            throw new IllegalStateException("Max length cannot be set before a template.");
        }
    }

    /* renamed from: a */
    public final void mo71919a(LogContext logContext) {
        LogContext logContext2 = this.f152006ad;
        if (logContext2 != null) {
            logContext2.mo71784b(this);
        }
        this.f152006ad = logContext;
        this.f152009ag.f123258a = logContext;
        if (logContext != null && C1280ps.m19871F(this)) {
            logContext.mo71780a(this);
        }
    }

    /* renamed from: a */
    public final void mo71920a(CharSequence charSequence) {
        bkcp bkcp = this.f151991K;
        if (bkcp != null) {
            bkcp.mo65851b(charSequence);
        } else {
            this.f152035r = charSequence;
        }
    }

    /* renamed from: a */
    public void mo71832a(CharSequence charSequence, int i) {
        m118475w();
        mo71927b(charSequence, mo71834b(i));
        mo71830a(i);
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        setError(charSequence);
        if (z) {
            bjst.m104532b(this.f152006ad, 2, this.f152005ac, this.f152004ab);
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 != 1) {
                if (i3 == 3) {
                    continue;
                } else if (i3 != 4) {
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported trigger type: ");
                    sb.append(i2 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f152039v.add(new bkgi(this, bjwj, this.f152010ah));
        }
    }

    /* renamed from: a */
    public void mo71921a(List list) {
        if (list != null) {
            setThreshold(0);
            post(new bkdt(this, list));
        }
    }

    /* renamed from: a */
    public final void mo65845a(boolean z) {
        this.f151998R = z;
        mo66001g();
        bkcm bkcm = this.f151992L;
        if (bkcm != null) {
            bkcm.mo65845a(z);
        }
        m118478z();
    }

    /* renamed from: a */
    public final boolean mo71922a(int i, int i2) {
        return getSelectionStart() == getSelectionEnd() && i == 1 && i2 == 0;
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        bmnb bmnb;
        int a = bmna.m108191a(bmne.f130094d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            return false;
        }
        if (i2 == 3) {
            return bjwl.m104788a(bmne, mo71937m());
        }
        if (i2 != 4) {
            int a2 = bmna.m108191a(bmne.f130094d);
            if (a2 != 0) {
                i = a2;
            }
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported trigger type: ");
            sb.append(i - 1);
            throw new IllegalArgumentException(sb.toString());
        }
        if (bmne.f130091a == 6) {
            bmnb = (bmnb) bmne.f130092b;
        } else {
            bmnb = bmnb.f130075d;
        }
        if ((bmnb.f130077a & 1) != 0) {
            return bjwl.m104788a(bmne, mo71937m());
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo65795a(Object obj) {
        return mo71937m().equals(obj);
    }
}
