package p000;

import android.accounts.Account;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.chimera.Activity;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.address.DynamicAddressFieldsLayout;
import com.google.android.wallet.p097ui.common.CheckboxView;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormSpinner;
import com.google.android.wallet.p097ui.common.RegionCodeView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: bkaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkaf extends bkdy implements View.OnFocusChangeListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, bkaj, bjwp {

    /* renamed from: W */
    public static final /* synthetic */ int f123732W = 0;

    /* renamed from: Y */
    private static final SparseBooleanArray f123733Y;

    /* renamed from: Z */
    private static final SparseBooleanArray f123734Z;

    /* renamed from: aa */
    private static final Character[] f123735aa = {'S', 'C', 'O', '1', '2', '3', 'D', 'X', 'A', 'U', 'F', 'P', 'T', 'B'};

    /* renamed from: ab */
    private static final Comparator f123736ab = new bjzs();

    /* renamed from: A */
    public bkey f123737A;

    /* renamed from: B */
    public bkes f123738B;

    /* renamed from: C */
    public bkfk f123739C;

    /* renamed from: D */
    public bkdb f123740D;

    /* renamed from: E */
    public CompoundButton.OnCheckedChangeListener f123741E;

    /* renamed from: F */
    public bket f123742F;

    /* renamed from: G */
    public int f123743G;

    /* renamed from: H */
    public boolean f123744H;

    /* renamed from: I */
    bmbs f123745I;

    /* renamed from: J */
    public ArrayList f123746J;

    /* renamed from: K */
    public JSONObject f123747K;

    /* renamed from: L */
    ArrayList f123748L;

    /* renamed from: M */
    public ArrayList f123749M;

    /* renamed from: N */
    public btwp f123750N;

    /* renamed from: O */
    bmbr f123751O;

    /* renamed from: P */
    public bjwk f123752P;

    /* renamed from: Q */
    public final TextWatcher f123753Q = new bjzt(this);

    /* renamed from: R */
    public final TextWatcher f123754R = new bjzu(this);

    /* renamed from: S */
    public Account f123755S;

    /* renamed from: T */
    protected bwgw f123756T;

    /* renamed from: U */
    public bkep f123757U;

    /* renamed from: V */
    public int f123758V = 1;

    /* renamed from: a */
    public LayoutInflater f123759a;

    /* renamed from: ac */
    private final ArrayList f123760ac = new ArrayList();

    /* renamed from: ad */
    private bkgl f123761ad;

    /* renamed from: ae */
    private final AdapterView.OnItemSelectedListener f123762ae = new bjzv(this);
    /* access modifiers changed from: private */

    /* renamed from: af */
    public bjtm f123763af;

    /* renamed from: ag */
    private final Response.ErrorListener f123764ag = new bjzr(this);

    /* renamed from: b */
    public ContextThemeWrapper f123765b;

    /* renamed from: c */
    public boolean f123766c;

    /* renamed from: d */
    public boolean f123767d;

    /* renamed from: e */
    public int f123768e;

    /* renamed from: f */
    public final ArrayList f123769f = new ArrayList();

    /* renamed from: g */
    protected LinearLayout f123770g;

    /* renamed from: h */
    public TextView f123771h;

    /* renamed from: i */
    DynamicAddressFieldsLayout f123772i;

    /* renamed from: j */
    CheckboxView f123773j;

    /* renamed from: k */
    RegionCodeView f123774k;

    /* renamed from: l */
    public TextView f123775l;

    /* renamed from: m */
    public View[] f123776m;

    /* renamed from: n */
    View f123777n;

    /* renamed from: o */
    TextView f123778o;

    /* renamed from: p */
    TextView f123779p;

    /* renamed from: q */
    ImageButton f123780q;

    /* renamed from: r */
    ArrayList f123781r = new ArrayList();

    /* renamed from: s */
    protected int f123782s;

    /* renamed from: t */
    protected JSONObject f123783t;

    /* renamed from: u */
    protected String f123784u = Locale.getDefault().toString();

    /* renamed from: v */
    public boolean f123785v;

    /* renamed from: w */
    public boolean f123786w;

    /* renamed from: x */
    public LogContext f123787x;

    /* renamed from: y */
    public bjxv f123788y;

    /* renamed from: z */
    public bkae f123789z;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(7);
        f123733Y = sparseBooleanArray;
        sparseBooleanArray.put(83, true);
        f123733Y.put(82, true);
        f123733Y.put(67, true);
        f123733Y.put(49, true);
        f123733Y.put(50, true);
        f123733Y.put(90, true);
        f123733Y.put(88, true);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(2);
        f123734Z = sparseBooleanArray2;
        sparseBooleanArray2.put(82, true);
        f123734Z.put(90, true);
    }

    public bkaf() {
        new bjes(1667);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:108:0x01f0 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.google.android.wallet.ui.common.FormSpinner, android.support.v7.widget.AppCompatSpinner], assign insn: PHI: (r2v34 ?) = (r2v35 ?), (r2v37 ?) binds: [B:69:0x010c, B:68:0x0108] */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.google.android.wallet.ui.common.FormSpinner], assign insn: 0x010c: INVOKE  (r2v35 ? I:com.google.android.wallet.ui.common.FormSpinner) = (r12v0 android.view.LayoutInflater) type: STATIC call: bkep.a(android.view.LayoutInflater):com.google.android.wallet.ui.common.FormSpinner */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.google.android.wallet.ui.common.FormSpinner], assign insn: 0x0109: CHECK_CAST  (r2v37 ? I:com.google.android.wallet.ui.common.FormSpinner) = (com.google.android.wallet.ui.common.FormSpinner) (r3v0 android.view.View) */
    /* JADX WARN: Type inference failed for: r5v39, types: [android.view.View], assign insn: 0x004b: INVOKE  (r5v39 ? I:android.view.View) = 
      (r12v0 android.view.LayoutInflater)
      (wrap: ? : ?: SGET   com.felicanetworks.mfc.R.layout.view_form_non_editable_text int)
      (null android.view.ViewGroup)
     type: VIRTUAL call: android.view.LayoutInflater.inflate(int, android.view.ViewGroup):android.view.View */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x025b  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    private final View m105039a(char c, char[] cArr, String str, View view) {
        View view2;
        LayoutInflater layoutInflater;
        FormEditText formEditText;
        FormEditText formEditText2;
        String[] strArr;
        ArrayList arrayList;
        FormSpinner formSpinner;
        String[] strArr2;
        String[] strArr3;
        ArrayList arrayList2;
        ? r2;
        String[] strArr4;
        boolean z;
        String str2;
        char c2 = c;
        if (view == null || Character.valueOf(c).equals(view.getTag())) {
            view2 = view;
        } else {
            view2 = null;
        }
        if (c2 != 'N') {
            boolean a = bjtl.m104569a(c2, this.f123783t);
            String b = mo65706b(c);
            LayoutInflater layoutInflater2 = this.f123759a;
            bmbm bmbm = (bmbm) bjtl.f123281a.get(c2);
            if (new bxvv(this.f123751O.f128607x, bmbr.f128574y).contains(bmbm)) {
                layoutInflater = layoutInflater2;
                formEditText = layoutInflater2.inflate((int) C0126R.C0128layout.view_form_non_editable_text, (ViewGroup) null);
            } else if (c2 == 'S') {
                boolean d = bjtl.m104582d(this.f123783t, this.f123784u);
                String[] b2 = bjtl.m104577b(this.f123783t, "sub_keys");
                String[] b3 = bjtl.m104577b(this.f123783t, "sub_mores");
                if (d) {
                    strArr3 = bjtl.m104577b(this.f123783t, "sub_lnames");
                } else {
                    strArr3 = null;
                }
                if (strArr3 == null) {
                    strArr3 = b2;
                }
                if (strArr3 != null) {
                    int length = strArr3.length;
                    if (length == 0) {
                        arrayList2 = null;
                    } else {
                        if (!d) {
                            strArr4 = bjtl.m104577b(this.f123783t, "sub_names");
                        } else {
                            strArr4 = strArr3;
                        }
                        if (strArr4 == null || strArr4.length != length) {
                            strArr4 = strArr3;
                        }
                        String[] b4 = bjtl.m104577b(this.f123783t, "sub_zips");
                        if (!(b4 == null || b4.length == length)) {
                            b4 = null;
                        }
                        if (!(b2 == null || b2.length == length)) {
                            b2 = null;
                            b3 = null;
                        }
                        if (!(b3 == null || b3.length == length)) {
                            b3 = null;
                        }
                        arrayList2 = new ArrayList(length);
                        for (int i = 0; i < strArr3.length; i++) {
                            if (b3 == null || !Boolean.parseBoolean(b3[i])) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (b2 != null) {
                                str2 = b2[i];
                            } else {
                                str2 = null;
                            }
                            arrayList2.add(new bkac(str2, z, strArr3[i], strArr4[i], b4 != null ? b4[i] : null));
                        }
                        if (d) {
                            Collections.sort(arrayList2, f123736ab);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    layoutInflater = layoutInflater2;
                    formEditText = null;
                } else {
                    if (view2 instanceof FormSpinner) {
                        r2 = (FormSpinner) view2;
                    } else {
                        r2 = bkep.m105448a(layoutInflater2);
                    }
                    r2.mo71971a(this.f123787x);
                    r2.mo71969a(mo65693a(bmbm));
                    r2.f152060n = a;
                    r2.setPrompt(b);
                    r2.f152061o = b;
                    layoutInflater = layoutInflater2;
                    bkak bkak = new bkak(this.f123765b, arrayList2, new bkac(null, false, null, b, null));
                    bkak.setDropDownViewResource(C0126R.C0128layout.view_spinner_dropdown);
                    r2.setAdapter(bkak);
                    r2.setOnItemSelectedListener(this);
                    r2.mo71970a(this.f123762ae);
                    formEditText = r2;
                }
            } else {
                layoutInflater = layoutInflater2;
                if (c2 == 'C') {
                    boolean d2 = bjtl.m104582d(this.f123783t, this.f123784u);
                    if (d2) {
                        strArr = bjtl.m104577b(this.f123747K, "sub_lnames");
                    } else {
                        strArr = null;
                    }
                    if (strArr == null) {
                        strArr = bjtl.m104577b(this.f123747K, "sub_keys");
                    }
                    if (strArr != null) {
                        int length2 = strArr.length;
                        if (length2 == 0) {
                            arrayList = null;
                        } else {
                            if (!d2) {
                                strArr2 = bjtl.m104577b(this.f123747K, "sub_names");
                            } else {
                                strArr2 = strArr;
                            }
                            if (strArr2 == null || strArr2.length != length2) {
                                strArr2 = strArr;
                            }
                            arrayList = new ArrayList(length2);
                            for (int i2 = 0; i2 < strArr.length; i2++) {
                                arrayList.add(new bkff(strArr[i2], strArr2[i2]));
                            }
                            if (d2) {
                                Collections.sort(arrayList, f123736ab);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        formEditText = null;
                    } else {
                        bkfz bkfz = new bkfz(this.f123765b, arrayList);
                        bkfz.setDropDownViewResource(C0126R.C0128layout.view_spinner_dropdown);
                        if (view2 instanceof FormSpinner) {
                            formSpinner = (FormSpinner) view2;
                        } else {
                            formSpinner = bkep.m105448a(this.f123759a);
                        }
                        formSpinner.mo71971a(this.f123787x);
                        formSpinner.mo71969a(mo65693a(bmbm));
                        formSpinner.f152060n = a;
                        formSpinner.setPrompt(b);
                        formSpinner.f152061o = b;
                        formSpinner.setAdapter((SpinnerAdapter) bkfz);
                        formSpinner.setOnItemSelectedListener(this);
                        formSpinner.mo71970a(this.f123762ae);
                        formEditText = formSpinner;
                    }
                } else {
                    formEditText = null;
                }
            }
            if (formEditText == null) {
                if (view2 instanceof FormEditText) {
                    formEditText2 = (FormEditText) view2;
                } else {
                    formEditText2 = (FormEditText) layoutInflater.inflate((int) C0126R.C0128layout.view_form_edit_text, (ViewGroup) null);
                }
                formEditText.mo71919a(this.f123787x);
                formEditText.mo71914a(mo65693a(bmbm));
                m105043a(c2, cArr, str, formEditText);
                formEditText.mo71928b(a);
                formEditText.setHint(b);
                mo65700a(formEditText, bmbm);
                int i3 = 3;
                if (c2 != 'A') {
                    if (c2 == 'C' || c2 == 'S') {
                        i3 = 8193;
                        formEditText.setInputType(i3);
                        if (this.f123751O.f128577D) {
                            formEditText.setOnFocusChangeListener(this);
                        }
                        formEditText.mo71924b(this.f123754R);
                    } else {
                        if (c2 != 'Z') {
                            switch (c2) {
                                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                                case '2':
                                case '3':
                                    break;
                                default:
                                    i3 = 1;
                                    break;
                            }
                        } else if (bjtl.m104581d(this.f123783t)) {
                            int i4 = Build.VERSION.SDK_INT;
                            formEditText.setTextDirection(3);
                        } else {
                            i3 = 528385;
                        }
                        formEditText.setInputType(i3);
                        if (this.f123751O.f128577D) {
                        }
                        formEditText.mo71924b(this.f123754R);
                    }
                }
                i3 = 8305;
                formEditText.setInputType(i3);
                if (this.f123751O.f128577D) {
                }
                formEditText.mo71924b(this.f123754R);
            }
            boolean contains = new bxvv(this.f123751O.f128608z, bmbr.f128570A).contains(bmbm);
            if (contains) {
                formEditText.setVisibility(8);
            }
            if (formEditText instanceof FormEditText) {
                formEditText.f151985E = !contains;
            } else if (formEditText instanceof FormSpinner) {
                ((FormSpinner) formEditText).f152062p = !contains;
            }
            formEditText.setId(bjtl.m104562a(c));
            formEditText.setTag(Character.valueOf(c));
            formEditText.setEnabled(this.f123766c);
            return formEditText;
        }
        throw new IllegalArgumentException("Recipient name should not be created dynamically");
    }

    /* renamed from: c */
    private final int m105047c(char c) {
        int size = this.f123781r.size();
        for (int i = 0; i < size; i++) {
            Character ch = (Character) ((View) this.f123781r.get(i)).getTag();
            if (ch != null && ch.charValue() == c) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: p */
    private final String m105048p() {
        String str;
        if (bjtl.m104582d(this.f123783t, this.f123784u)) {
            str = bjtl.m104566a(this.f123783t, "lfmt");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = bjtl.m104566a(this.f123783t, "fmt");
        }
        char[] a = bjtl.m104572a(str);
        int length = a.length;
        StringBuilder sb = new StringBuilder(length);
        sb.append('N');
        for (char c : a) {
            if (f123733Y.get(c) && (!mo65704a(bjtv.m104615a(this.f123782s)) || f123734Z.get(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: q */
    private final void m105049q() {
        ArrayList h = mo65715h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) h.get(i)).f124039e;
            if (obj instanceof bkdf) {
                ((bkdf) obj).mo65794a(null, false);
            }
        }
    }

    /* renamed from: r */
    private final void m105050r() {
        Pattern c;
        View a = mo65694a('Z');
        if (a instanceof bkdf) {
            bkfw bkfw = (bkfw) a;
            bkgl bkgl = this.f123761ad;
            if (bkgl != null) {
                bkfw.mo65973c(bkgl);
                this.f123761ad = null;
            }
            this.f123761ad = new bkgl(new bkgj[0]);
            String string = this.f123765b.getString(C0126R.string.wallet_uic_error_address_field_invalid, new Object[]{mo65706b('Z')});
            Pattern b = bjtl.m104576b(this.f123783t);
            if (b != null) {
                this.f123761ad.mo65996a(new bkhh(string, b));
            }
            bkac t = m105051t();
            if (t != null) {
                Pattern b2 = bjtl.m104575b(t.f123726e);
                if (b2 != null) {
                    this.f123761ad.mo65996a(new bkhh(string, b2));
                }
            } else if (((Boolean) bjwe.f123488i.mo54082a()).booleanValue() && (c = bjtl.m104580c(this.f123783t)) != null) {
                this.f123761ad.mo65996a(new bkhh(string, c));
            }
            if (!this.f123761ad.f124212a.isEmpty()) {
                bkfw.mo65972a((bkgj) this.f123761ad);
                if (bkfw instanceof TextView) {
                    TextView textView = (TextView) bkfw;
                    if (!TextUtils.isEmpty(textView.getText()) || !TextUtils.isEmpty(textView.getError())) {
                        bkfw.mo65799cM();
                        return;
                    }
                    return;
                }
                bkfw.mo65799cM();
                return;
            }
            this.f123761ad = null;
            return;
        }
        this.f123761ad = null;
    }

    /* renamed from: t */
    private final bkac m105051t() {
        View a = mo65694a('S');
        if (a == null || !(a instanceof Spinner)) {
            return null;
        }
        return (bkac) ((Spinner) a).getSelectedItem();
    }

    /* renamed from: u */
    private final void m105052u() {
        TextView textView;
        int size = this.f123781r.size();
        View view = null;
        for (int i = 0; i < size; i++) {
            View view2 = (View) this.f123781r.get(i);
            if (view2.isFocusableInTouchMode()) {
                if (view != null) {
                    view.setNextFocusForwardId(view2.getId());
                    view2.setNextFocusForwardId(-1);
                }
                view = view2;
            }
        }
        if (view != null && (textView = this.f123775l) != null && textView.isFocusableInTouchMode()) {
            view.setNextFocusForwardId(this.f123775l.getId());
            this.f123775l.setNextFocusForwardId(-1);
        }
    }

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f123752P = bjwk;
    }

    /* renamed from: b */
    public final String mo65706b(char c) {
        return c != 'N' ? bjtl.m104565a(this.f124073X, c, this.f123783t) : this.f123751O.f128606w;
    }

    /* renamed from: b */
    public final boolean mo65709b() {
        return this.f123743G > 0;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* renamed from: e */
    public final SparseArray mo65712e() {
        if (this.f123770g == null) {
            return null;
        }
        int size = this.f123781r.size();
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            View view = (View) this.f123781r.get(i);
            sparseArray.put(((Character) view.getTag()).charValue(), m105042a(view));
        }
        int i2 = this.f123782s;
        if (i2 != 0) {
            sparseArray.put(82, bjtv.m104615a(i2));
        }
        return sparseArray;
    }

    /* renamed from: f */
    public final RequestQueue mo65713f() {
        return bjtx.m104619a(this.f124073X.getApplicationContext());
    }

    /* renamed from: g */
    public final void mo65714g() {
        if (!this.f123785v || this.f123744H) {
            btwo btwo = (btwo) btwp.f152728s.mo74144da();
            String a = bjtv.m104615a(this.f123782s);
            if (btwo.f164950c) {
                btwo.mo74035c();
                btwo.f164950c = false;
            }
            btwp btwp = (btwp) btwo.f164949b;
            a.getClass();
            int i = btwp.f152730a | 1;
            btwp.f152730a = i;
            btwp.f152731b = a;
            String str = this.f123784u;
            str.getClass();
            btwp.f152730a = i | 8;
            btwp.f152733d = str;
            mo65699a((btwp) btwo.mo74062i(), 9);
            if (this.f123751O.f128604u) {
                mo65701a("", 9);
            }
            if (this.f123751O.f128605v.size() > 0) {
                for (View view : this.f123776m) {
                    bkfr.m105596b((TextView) view, "");
                }
            }
            mo65705a(true);
        }
    }

    /* renamed from: h */
    public final ArrayList mo65715h() {
        ArrayList arrayList = new ArrayList(this.f123781r.size());
        btwp btwp = this.f123745I.f128615e;
        if (btwp == null) {
            btwp = btwp.f152728s;
        }
        if (!this.f123751O.f128600q.isEmpty()) {
            arrayList.add(new bkde(0, this.f123773j, Boolean.valueOf(this.f123745I.f128618h)));
        }
        if (!mo65720n()) {
            if (!new bxvv(this.f123751O.f128608z, bmbr.f128570A).contains(bmbm.RECIPIENT)) {
                TextView textView = this.f123771h;
                arrayList.add(new bkde(0, textView, bjtg.m104555a(btwp, ((Character) textView.getTag()).charValue())));
            }
            if (!new bxvv(this.f123751O.f128608z, bmbr.f128570A).contains(bmbm.COUNTRY)) {
                RegionCodeView regionCodeView = this.f123774k;
                btwp btwp2 = this.f123745I.f128615e;
                if (btwp2 == null) {
                    btwp2 = btwp.f152728s;
                }
                arrayList.add(new bkde(0, regionCodeView, btwp2.f152731b));
            }
            int size = this.f123781r.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f123781r.get(i2);
                Character ch = (Character) view.getTag();
                bmbm bmbm = (bmbm) bjtl.f123281a.get(ch.charValue());
                if (bmbm != bmbm.RECIPIENT && !new bxvv(this.f123751O.f128608z, bmbr.f128570A).contains(bmbm)) {
                    arrayList.add(new bkde(0, view, bjtg.m104555a(btwp, ch.charValue())));
                }
            }
            TextView textView2 = this.f123775l;
            if (textView2 != null) {
                arrayList.add(new bkde(0, textView2, this.f123745I.f128616f));
            }
            while (true) {
                View[] viewArr = this.f123776m;
                if (i >= viewArr.length) {
                    break;
                }
                arrayList.add(new bkde(0, viewArr[i], bkft.m105642b((bmqf) this.f123751O.f128605v.get(i))));
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final String mo65716i() {
        return !bjtl.m104582d(this.f123783t, this.f123784u) ? bjtl.m104566a(this.f123783t, "lang") : this.f123784u;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkaf.a(char, char[], java.lang.String, android.view.View):android.view.View
     arg types: [int, char[], java.lang.String, android.view.View]
     candidates:
      bkaf.a(char, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText):void
      bkaf.a(android.view.View, java.lang.String, boolean, int):void
      bkaf.a(char, char[], java.lang.String, android.view.View):android.view.View */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkaf.a(android.view.View, java.lang.String, boolean, int):void
     arg types: [android.view.View, java.lang.String, int, int]
     candidates:
      bkaf.a(char, char[], java.lang.String, android.view.View):android.view.View
      bkaf.a(char, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText):void
      bkaf.a(android.view.View, java.lang.String, boolean, int):void */
    /* renamed from: k */
    public final void mo65717k() {
        int c = m105047c('C');
        View view = (View) this.f123781r.get(c);
        String a = m105042a(view);
        View a2 = m105039a('C', m105048p().substring(c).toCharArray(), bjtl.m104566a(this.f123783t, "require"), view);
        if (a2 != view) {
            this.f123772i.mo71810a(view, a2);
            this.f123781r.set(c, a2);
            m105052u();
        }
        m105045a(a2, a, false, 1);
    }

    /* renamed from: l */
    public final void mo65718l() {
        bjtm bjtm = this.f123763af;
        if (bjtm != null) {
            bjtm.cancel();
            this.f123763af = null;
        }
    }

    /* renamed from: m */
    public final void mo65719m() {
        boolean z;
        if (this.f123773j.getVisibility() != 0 || !this.f123773j.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !this.f123785v && !new bxvv(this.f123751O.f128608z, bmbr.f128570A).contains(bmbm.RECIPIENT)) {
            this.f123771h.setVisibility(0);
        } else {
            this.f123771h.setVisibility(8);
        }
        if (!z && !this.f123785v && !new bxvv(this.f123751O.f128608z, bmbr.f128570A).contains(bmbm.COUNTRY)) {
            this.f123774k.setVisibility(0);
        } else {
            this.f123774k.setVisibility(8);
        }
        if (!z && !this.f123785v) {
            this.f123772i.setVisibility(0);
        } else {
            this.f123772i.setVisibility(8);
        }
        bmbr bmbr = this.f123751O;
        if (bmbr.f128604u) {
            if (!z && !this.f123785v && !new bxvv(bmbr.f128608z, bmbr.f128570A).contains(bmbm.PHONE_NUMBER)) {
                this.f123775l.setVisibility(0);
            } else {
                this.f123775l.setVisibility(8);
            }
        }
        if (this.f123751O.f128605v.size() > 0) {
            if (!z && !this.f123785v) {
                for (View view : this.f123776m) {
                    view.setVisibility(0);
                }
            } else {
                for (View view2 : this.f123776m) {
                    view2.setVisibility(8);
                }
            }
        }
        if (!z && this.f123785v) {
            this.f123777n.setVisibility(0);
        } else {
            this.f123777n.setVisibility(8);
        }
        bkdb bkdb = this.f123740D;
        if (bkdb != null) {
            bkdb.mo51905a(12, Bundle.EMPTY);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo65720n() {
        return this.f123773j.getVisibility() == 0 && this.f123773j.isChecked();
    }

    /* renamed from: o */
    public final void mo65721o() {
        View findFocus = this.f123772i.findFocus();
        if (findFocus != null) {
            bkfr.m105559a(this.f124073X, findFocus);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        mo65719m();
        m105049q();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f123741E;
        if (onCheckedChangeListener != null) {
            ((bjzo) onCheckedChangeListener).mo65667m();
        }
    }

    public void onClick(View view) {
        if (view == this.f123780q) {
            mo65714g();
        } else if (view == this.f123777n) {
            mo65705a(true);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            view.post(new bjzy(this));
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (adapterView.getTag() instanceof Character) {
            char charValue = ((Character) adapterView.getTag()).charValue();
            if (charValue != 'S') {
                if (charValue != 'C' || this.f123738B == null) {
                }
            } else if (this.f123782s != 0) {
                m105050r();
                bkac t = m105051t();
                JSONObject jSONObject = this.f123747K;
                if (jSONObject == null || !bjzb.m104957a(bjtl.m104566a(jSONObject, "key"), t.f123722a)) {
                    this.f123747K = t.f123727f;
                    mo65718l();
                    if (mo65694a('C') != null) {
                        bkac t2 = m105051t();
                        if (!t2.f123723b || t2.f123727f != null) {
                            mo65717k();
                            return;
                        }
                        this.f123763af = new bjtm(this.f123782s, t2.f123722a, new bkaa(this, t2), new bjzq(this));
                        mo65713f().add(this.f123763af);
                        return;
                    }
                    return;
                }
                t.f123727f = this.f123747K;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkaf.a(android.view.View, java.lang.String, boolean, int):void
     arg types: [android.view.View, java.lang.String, int, int]
     candidates:
      bkaf.a(char, char[], java.lang.String, android.view.View):android.view.View
      bkaf.a(char, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText):void
      bkaf.a(android.view.View, java.lang.String, boolean, int):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo65707b(btwp btwp, int i) {
        if (this.f123770g != null) {
            int size = this.f123781r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f123781r.get(i2);
                m105045a(view, bjtg.m104555a(btwp, ((Character) view.getTag()).charValue()), false, i);
            }
        }
    }

    /* renamed from: c */
    public final SparseArray mo65710c() {
        SparseArray e = mo65712e();
        for (int size = e.size() - 1; size >= 0; size--) {
            char keyAt = (char) e.keyAt(size);
            if (mo65694a(keyAt) instanceof Spinner) {
                e.remove(keyAt);
            }
        }
        return e;
    }

    /* renamed from: c */
    public final void mo65711c(boolean z) {
        boolean z2;
        this.f123766c = z;
        if (this.f123770g != null) {
            if (!z || mo65709b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f123773j.setEnabled(z2);
            this.f123774k.setEnabled(z2);
            int size = this.f123781r.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f123781r.get(i)).setEnabled(z2);
            }
            for (View view : this.f123776m) {
                view.setEnabled(z2);
            }
            TextView textView = this.f123775l;
            if (textView != null) {
                textView.setEnabled(z2);
            }
        }
    }

    /* renamed from: b */
    public final void mo65708b(boolean z) {
        int i;
        int i2 = this.f123743G;
        if (!z) {
            i = -1;
        } else {
            i = 1;
        }
        int max = Math.max(0, i2 + i);
        this.f123743G = max;
        if (!z) {
            if (max != 0) {
                return;
            }
        } else if (max != 1) {
            return;
        }
        mo65711c(this.f123766c);
    }

    /* renamed from: a */
    public static btwp m105040a(SparseArray sparseArray) {
        btwo btwo = (btwo) btwp.f152728s.mo74144da();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            char keyAt = (char) sparseArray.keyAt(i);
            String str = (String) sparseArray.valueAt(i);
            if (str != null) {
                if (keyAt == '1' || keyAt == '2') {
                    btwo.mo72447a(str);
                } else if (keyAt == 'C') {
                    if (btwo.f164950c) {
                        btwo.mo74035c();
                        btwo.f164950c = false;
                    }
                    btwp btwp = (btwp) btwo.f164949b;
                    str.getClass();
                    btwp.f152730a |= 64;
                    btwp.f152736g = str;
                } else if (keyAt != 'X') {
                    if (keyAt == 'Z') {
                        String upperCase = str.toUpperCase(Locale.getDefault());
                        if (!upperCase.isEmpty()) {
                            if (btwo.f164950c) {
                                btwo.mo74035c();
                                btwo.f164950c = false;
                            }
                            btwp btwp2 = (btwp) btwo.f164949b;
                            upperCase.getClass();
                            btwp2.f152730a |= 2048;
                            btwp2.f152740k = upperCase;
                        }
                    } else if (keyAt != 'N') {
                        if (keyAt != 'O') {
                            if (keyAt == 'R') {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp3 = (btwp) btwo.f164949b;
                                str.getClass();
                                btwp3.f152730a |= 1;
                                btwp3.f152731b = str;
                            } else if (keyAt == 'S' && !str.isEmpty()) {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp4 = (btwp) btwo.f164949b;
                                str.getClass();
                                btwp4.f152730a |= 16;
                                btwp4.f152734e = str;
                            }
                        } else if (!str.isEmpty()) {
                            if (btwo.f164950c) {
                                btwo.mo74035c();
                                btwo.f164950c = false;
                            }
                            btwp btwp5 = (btwp) btwo.f164949b;
                            str.getClass();
                            btwp5.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                            btwp5.f152746q = str;
                        }
                    } else if (!str.isEmpty()) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = false;
                        }
                        btwp btwp6 = (btwp) btwo.f164949b;
                        str.getClass();
                        btwp6.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        btwp6.f152747r = str;
                    }
                } else if (!str.isEmpty()) {
                    if (btwo.f164950c) {
                        btwo.mo74035c();
                        btwo.f164950c = false;
                    }
                    btwp btwp7 = (btwp) btwo.f164949b;
                    str.getClass();
                    btwp7.f152730a |= 8192;
                    btwp7.f152741l = str;
                }
            }
        }
        return (btwp) btwo.mo74062i();
    }

    /* renamed from: a */
    public static btwp m105041a(String str, btwp btwp, JSONObject jSONObject) {
        if (btwp != null && str.equalsIgnoreCase(btwp.f152731b) && btwp.f152734e.isEmpty() && !btwp.f152740k.isEmpty()) {
            String str2 = btwp.f152740k;
            if (!TextUtils.isEmpty(str2)) {
                String c = bjtl.m104579c(jSONObject, str2);
                if (!TextUtils.isEmpty(c)) {
                    bxvd bxvd = (bxvd) btwp.mo74142c(5);
                    bxvd.mo73625a((bxvk) btwp);
                    btwo btwo = (btwo) bxvd;
                    if (btwo.f164950c) {
                        btwo.mo74035c();
                        btwo.f164950c = false;
                    }
                    btwp btwp2 = (btwp) btwo.f164949b;
                    c.getClass();
                    btwp2.f152730a |= 16;
                    btwp2.f152734e = c;
                    return (btwp) btwo.mo74062i();
                }
            }
        }
        return btwp;
    }

    /* renamed from: a */
    static String m105042a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("Input must not be null");
        } else if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        } else {
            if (view instanceof Spinner) {
                Object selectedItem = ((Spinner) view).getSelectedItem();
                if (selectedItem instanceof bkfa) {
                    return ((bkfa) selectedItem).mo65687a();
                }
                if (selectedItem != null) {
                    return String.valueOf(selectedItem);
                }
                return null;
            }
            String valueOf = String.valueOf(view.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown input type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private final void m105043a(char c, char[] cArr, String str, FormEditText formEditText) {
        ArrayList arrayList = this.f123748L;
        if (arrayList != null && !arrayList.isEmpty() && c != '2' && c != '3' && c != 'X') {
            formEditText.setAdapter(new bkai(this.f123765b, this.f123782s, mo65716i(), c, cArr, str, this.f123748L));
            formEditText.setThreshold(0);
            formEditText.f152014al = new bjzx(this, formEditText);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    private final void m105044a(int i, String str, String str2) {
        this.f123747K = null;
        mo65718l();
        bkab bkab = new bkab(this);
        if (this.f123751O.f128583K.mo73744a() > 0) {
            bjtq bjtq = new bjtq(this.f124073X, this.f123756T, this.f123755S, mo65713f(), i, this.f123751O.f128583K.mo73780k(), str, bkab, this.f123764ag);
            mo65708b(true);
            this.f123772i.mo71812b();
            Activity activity = bjtq.f123299a;
            bmaj a = bjvn.m104710a(activity, bjyw.m104937a(activity));
            bjty a2 = bjty.m104626a(bjtq.f123299a, bjtq.f123301c, bjtq.f123300b);
            bxvd da = bwgf.f159187f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgf bwgf = (bwgf) da.f164949b;
            a.getClass();
            bwgf.f159190b = a;
            bwgf.f159189a |= 1;
            String a3 = bjtv.m104615a(bjtq.f123303e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgf bwgf2 = (bwgf) da.f164949b;
            a3.getClass();
            bwgf2.f159189a |= 2;
            bwgf2.f159191c = a3;
            bxtx a4 = bxtx.m123261a(bjtq.f123304f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgf bwgf3 = (bwgf) da.f164949b;
            a4.getClass();
            bwgf3.f159189a |= 4;
            bwgf3.f159192d = a4;
            if (!TextUtils.isEmpty(bjtq.f123305g)) {
                String replace = bjtq.f123305g.replace('_', '-');
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwgf bwgf4 = (bwgf) da.f164949b;
                replace.getClass();
                bwgf4.f159189a |= 8;
                bwgf4.f159193e = replace;
            }
            bjtq.f123302d.add(new bjuc("addressmetadataservice/getaddressmetadata", a2, (bwgf) da.mo74062i(), (bxxk) bwgg.f159194d.mo74142c(7), bjtq, bjtq.f123306h));
            return;
        }
        bjto bjto = new bjto(mo65713f(), i, str, bkab, this.f123764ag);
        mo65708b(true);
        this.f123772i.mo71812b();
        bjto.mo65527a(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r10.equalsIgnoreCase(r4.toString()) != false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d A[LOOP:0: B:25:0x005a->B:42:0x009d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a0 A[SYNTHETIC] */
    /* renamed from: a */
    private final void m105045a(View view, String str, boolean z, int i) {
        if (view != null) {
            if (view instanceof FormEditText) {
                FormEditText formEditText = (FormEditText) view;
                if (i != 6 || !TextUtils.isEmpty(str)) {
                    formEditText.mo71926b(str, i);
                }
            } else if (view instanceof TextView) {
                ((TextView) view).setText(str);
            } else if (view instanceof Spinner) {
                Spinner spinner = (Spinner) view;
                if (str == null) {
                    if ((spinner instanceof FormSpinner) && !z) {
                        ((FormSpinner) spinner).mo71972b(0);
                    } else {
                        spinner.setSelection(0);
                    }
                } else if (spinner.getAdapter() instanceof ArrayAdapter) {
                    ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
                    if (!arrayAdapter.isEmpty()) {
                        int count = arrayAdapter.getCount();
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            if (i2 >= count) {
                                break;
                            }
                            Object item = arrayAdapter.getItem(i2);
                            if (!(item instanceof bkfa) || !str.equalsIgnoreCase(((bkfa) item).mo65687a())) {
                                if (item instanceof bkac) {
                                    bkac bkac = (bkac) item;
                                    if (!TextUtils.isEmpty(bkac.f123722a) && TextUtils.equals(str, bkac.f123722a)) {
                                        z2 = true;
                                        if (!z2) {
                                            i2++;
                                        } else if ((spinner instanceof FormSpinner) && !z) {
                                            ((FormSpinner) spinner).mo71972b(i2);
                                        } else {
                                            spinner.setSelection(i2);
                                        }
                                    }
                                }
                                if (item != null) {
                                }
                                if (!z2) {
                                }
                            }
                            z2 = true;
                            if (!z2) {
                            }
                        }
                        if (!z2) {
                            if ((spinner instanceof FormSpinner) && !z) {
                                ((FormSpinner) spinner).mo71972b(0);
                            } else {
                                spinner.setSelection(0);
                            }
                        }
                    }
                }
            } else {
                String valueOf = String.valueOf(view.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("Unknown input type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            bkes bkes = this.f123738B;
            return;
        }
        throw new IllegalArgumentException("Input must not be null");
    }

    /* renamed from: a */
    public final long mo65693a(bmbm bmbm) {
        long j;
        if (bmbm == bmbm.COUNTRY) {
            long j2 = this.f123751O.f128582J;
            if (j2 != 0) {
                return j2;
            }
        }
        if (bmbm == bmbm.RECIPIENT) {
            long j3 = this.f123751O.f128581I;
            if (j3 != 0) {
                return j3;
            }
        }
        if (bmbm == bmbm.ORGANIZATION) {
            long j4 = this.f123751O.f128580H;
            if (j4 != 0) {
                return j4;
            }
        }
        bmbr bmbr = this.f123751O;
        if ((bmbr.f128584a & 1) == 0) {
            j = bmbr.f128587d;
        } else {
            bmdn bmdn = bmbr.f128585b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            j = bmdn.f128835c;
        }
        return bjtc.m104548a(j, bmbm.f128563q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo65694a(char c) {
        int c2 = m105047c(c);
        if (c2 >= 0) {
            return (View) this.f123781r.get(c2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo65695a(bmbs bmbs, String str, boolean z, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add('N');
        }
        for (bmbm bmbm : new bxvv(this.f123751O.f128608z, bmbr.f128570A)) {
            int indexOfValue = bjtl.f123281a.indexOfValue(bmbm);
            if (indexOfValue >= 0) {
                arrayList.add(Character.valueOf((char) bjtl.f123281a.keyAt(indexOfValue)));
            }
        }
        btwp btwp = bmbs.f128615e;
        if (btwp == null) {
            btwp = btwp.f152728s;
        }
        if (mo65704a(btwp.f152731b)) {
            Collections.addAll(arrayList, f123735aa);
        }
        if (str == null) {
            str = "\n";
        }
        btwp btwp2 = bmbs.f128615e;
        if (btwp2 == null) {
            btwp2 = btwp.f152728s;
        }
        int size = arrayList.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            cArr[i] = ((Character) arrayList.get(i)).charValue();
        }
        String a = bjtg.m104558a(btwp2, str, (char[]) null, cArr);
        bmbr bmbr = this.f123751O;
        if (bmbr.f128604u && !new bxvv(bmbr.f128608z, bmbr.f128570A).contains(bmbm.PHONE_NUMBER)) {
            if (str2 == null) {
                str2 = "\n";
            }
            if (!TextUtils.isEmpty(a)) {
                String valueOf = String.valueOf(a);
                a = str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2);
            }
            String valueOf2 = String.valueOf(a);
            String valueOf3 = String.valueOf(bmbs.f128616f);
            a = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
        }
        if (str3 == null) {
            str3 = "\n";
        }
        for (View view : this.f123776m) {
            String a2 = bkft.m105634a((Object) view);
            if (!TextUtils.isEmpty(a2)) {
                if (!TextUtils.isEmpty(a)) {
                    String valueOf4 = String.valueOf(a);
                    a = str3.length() == 0 ? new String(valueOf4) : valueOf4.concat(str3);
                }
                String valueOf5 = String.valueOf(a);
                String valueOf6 = String.valueOf(a2);
                a = valueOf6.length() == 0 ? new String(valueOf5) : valueOf5.concat(valueOf6);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo65696a() {
        bjwk bjwk;
        String str;
        String a = bjtv.m104615a(this.f123782s);
        btwp btwp = this.f123745I.f128615e;
        if (btwp == null) {
            btwp = btwp.f152728s;
        }
        if (!bjzb.m104957a(a, btwp.f152731b)) {
            Bundle bundle = new Bundle();
            bmbr bmbr = this.f123751O;
            if ((bmbr.f128584a & 1) == 0) {
                str = bmbr.f128586c;
            } else {
                bmdn bmdn = bmbr.f128585b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                str = bmdn.f128834b;
            }
            bundle.putString("EventListener.EXTRA_FORM_ID", str);
            bundle.putInt("EventListener.EXTRA_FIELD_ID", 1);
            bkdb bkdb = this.f123740D;
            if (bkdb != null) {
                bkdb.mo51905a(3, bundle);
            }
        }
        if (!((Boolean) bjwe.f123487h.mo54082a()).booleanValue() && (bjwk = this.f123752P) != null) {
            bjwl.m104783a(bjwk, this.f123760ac, bjtv.m104615a(this.f123782s));
        }
        this.f123774k.mo72079a(this.f123782s);
        int a2 = bjtl.m104564a(this.f123783t);
        int i = this.f123782s;
        if (a2 == i) {
            mo65703a(this.f123783t);
        } else {
            m105044a(i, this.f123784u, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo65697a(int i, boolean z) {
        bjwk bjwk;
        if (i != this.f123782s) {
            this.f123782s = i;
            mo65696a();
            if (i != 0) {
                if (z && (bjwk = this.f123752P) != null) {
                    bjwl.m104781a(bjwk, this.f123769f);
                    if (((Boolean) bjwe.f123487h.mo54082a()).booleanValue()) {
                        bjwl.m104783a(this.f123752P, this.f123760ac, bjtv.m104615a(i));
                    }
                }
                bkey bkey = this.f123737A;
                if (bkey != null) {
                    bkey.mo52935a(i, this.f123768e, z);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkaf.a(android.view.View, java.lang.String, boolean, int):void
     arg types: [android.view.View, java.lang.String, int, int]
     candidates:
      bkaf.a(char, char[], java.lang.String, android.view.View):android.view.View
      bkaf.a(char, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText):void
      bkaf.a(android.view.View, java.lang.String, boolean, int):void */
    /* renamed from: a */
    public final void mo65698a(View view, btwp btwp) {
        ArrayList arrayList = new ArrayList();
        int size = this.f123781r.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            View view2 = (View) this.f123781r.get(i);
            if (!z && view2 == view) {
                z = true;
            }
            if (z) {
                char charValue = ((Character) view2.getTag()).charValue();
                String a = bjtg.m104555a(btwp, charValue);
                if (!TextUtils.isEmpty(a) || !bjtl.m104569a(charValue, this.f123783t) || TextUtils.isEmpty(m105042a(view2))) {
                    m105045a(view2, a, true, 5);
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        if (z) {
            int size2 = arrayList.size();
            EditText editText = null;
            for (int i2 = 0; i2 < size2; i2++) {
                View view3 = (View) this.f123781r.get(((Integer) arrayList.get(i2)).intValue());
                boolean isEmpty = TextUtils.isEmpty(m105042a(view3));
                boolean z2 = isEmpty || !(view3 instanceof bkdf) || ((bkdf) view3).mo65799cM();
                if (editText == null && (!z2 || isEmpty)) {
                    editText = view3;
                }
            }
            if (editText == null) {
                View focusSearch = this.f123772i.focusSearch(130);
                if (focusSearch != null) {
                    focusSearch.requestFocus();
                } else {
                    mo65721o();
                }
            } else {
                editText.requestFocus();
                if (editText instanceof EditText) {
                    EditText editText2 = editText;
                    editText2.setSelection(editText2.getText().length());
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkaf.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bkaf.a(android.view.View, btwp):void
      bkaf.a(btwp, int):void
      bkaf.a(com.google.android.wallet.ui.common.FormEditText, bmbm):void
      bkaf.a(java.lang.String, int):void
      bkaf.a(int, boolean):void */
    /* renamed from: a */
    public final void mo65699a(btwp btwp, int i) {
        if (btwp == null) {
            if (this.f123770g == null) {
                this.f123750N = null;
                this.f123758V = 1;
                this.f123782s = 0;
                this.f123784u = Locale.getDefault().toString();
                return;
            }
            btwp = btwp.f152728s;
        }
        int a = bjtv.m104614a(btwp.f152731b);
        this.f123750N = btwp;
        this.f123758V = i;
        if (!btwp.f152733d.isEmpty()) {
            this.f123784u = this.f123750N.f152733d;
        }
        if (this.f123770g != null) {
            int i2 = this.f123782s;
            if (a == i2) {
                if (!mo65709b()) {
                    JSONObject jSONObject = this.f123783t;
                    if (jSONObject != null) {
                        String e = bjtl.m104584e(jSONObject, this.f123784u);
                        if (!TextUtils.isEmpty(e)) {
                            m105044a(this.f123782s, this.f123784u, e);
                            return;
                        }
                        String a2 = bjtl.m104566a(this.f123783t, "id");
                        if (!TextUtils.isEmpty(a2) && a2.contains("--") && !bjtl.m104571a(bjtl.m104566a(this.f123783t, "lang"), this.f123784u)) {
                            m105044a(this.f123782s, this.f123784u, (String) null);
                            return;
                        }
                    }
                    mo65707b(this.f123750N, this.f123758V);
                    this.f123750N = null;
                    this.f123758V = 1;
                }
            } else if (i2 == 0) {
                this.f123782s = a;
            } else {
                mo65697a(a, false);
            }
        } else {
            this.f123782s = a;
        }
    }

    /* renamed from: a */
    public final void mo65700a(FormEditText formEditText, bmbm bmbm) {
        bxwc bxwc = this.f123751O.f128575B;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmbq bmbq = (bmbq) bxwc.get(i);
            bmbm a = bmbm.m107869a(bmbq.f128567a);
            if (a == null) {
                a = bmbm.UNKNOWN_RELATIVE_REFERENCE;
            }
            if (a == bmbm && !bmbq.f128568b.isEmpty()) {
                formEditText.mo71920a((CharSequence) bmbq.f128568b);
            }
        }
    }

    /* renamed from: a */
    public final void mo65701a(String str, int i) {
        bkfr.m105574a(this.f123775l, str, i);
    }

    /* renamed from: a */
    public final void mo65702a(String str, String str2, String str3) {
        String str4;
        Bundle bundle = new Bundle();
        bmbr bmbr = this.f123751O;
        if ((bmbr.f128584a & 1) == 0) {
            str4 = bmbr.f128586c;
        } else {
            bmdn bmdn = bmbr.f128585b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            str4 = bmdn.f128834b;
        }
        bundle.putString("EventListener.EXTRA_FORM_ID", str4);
        bkdb bkdb = this.f123740D;
        if (bkdb != null) {
            bjvg.m104691a(bundle, 100, str, str2, null, str3, this.f123765b.getString(C0126R.string.wallet_uic_retry));
            bkdb.mo51905a(5, bundle);
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        bmnc bmnc;
        long a = mo65693a(bmbm.COUNTRY);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            bmne bmne = bjwj.f123509a;
            long j = bmne.f130093c;
            int i2 = 1;
            if (j == a) {
                int a2 = bmna.m108191a(bmne.f130094d);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i3 = a2 - 1;
                if (i3 != 1) {
                    if (i3 == 3) {
                        continue;
                    } else if (i3 != 4) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        int a3 = bmna.m108191a(bjwj.f123509a.f130094d);
                        if (a3 != 0) {
                            i2 = a3;
                        }
                        objArr[0] = Integer.valueOf(i2 - 1);
                        throw new IllegalArgumentException(String.format(locale, "Invalid trigger type %s", objArr));
                    }
                }
                this.f123760ac.add(bjwj);
            } else if (j == this.f123751O.f128587d) {
                int a4 = bmna.m108191a(bmne.f130094d);
                if (a4 == 0) {
                    a4 = 1;
                }
                if (a4 - 1 != 1) {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[1];
                    int a5 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a5 != 0) {
                        i2 = a5;
                    }
                    objArr2[0] = Integer.valueOf(i2 - 1);
                    throw new IllegalArgumentException(String.format(locale2, "Invalid trigger type %s", objArr2));
                }
                bmne bmne2 = bjwj.f123509a;
                if (bmne2.f130091a == 2) {
                    bmnc = (bmnc) bmne2.f130092b;
                } else {
                    bmnc = bmnc.f130080d;
                }
                if ((bmnc.f130082a & 1) == 0) {
                    this.f123769f.add(bjwj);
                } else {
                    throw new IllegalArgumentException("Address form only supports value changed triggers with null newValue");
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid trigger component %d", Long.valueOf(bjwj.f123509a.f130093c)));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkaf.a(char, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText):void
     arg types: [int, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText]
     candidates:
      bkaf.a(char, char[], java.lang.String, android.view.View):android.view.View
      bkaf.a(android.view.View, java.lang.String, boolean, int):void
      bkaf.a(char, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkaf.a(android.view.View, java.lang.String, boolean, int):void
     arg types: [android.view.View, java.lang.String, int, int]
     candidates:
      bkaf.a(char, char[], java.lang.String, android.view.View):android.view.View
      bkaf.a(char, char[], java.lang.String, com.google.android.wallet.ui.common.FormEditText):void
      bkaf.a(android.view.View, java.lang.String, boolean, int):void */
    /* renamed from: a */
    public final void mo65703a(JSONObject jSONObject) {
        SparseArray sparseArray;
        ArrayList arrayList;
        int a = bjtl.m104564a(jSONObject);
        if (a == this.f123782s) {
            if (this.f123750N == null) {
                sparseArray = mo65710c();
            } else {
                sparseArray = null;
            }
            this.f123783t = jSONObject;
            this.f123748L = new ArrayList();
            if (new bxvv(this.f123751O.f128579F, bmbr.f128571G).contains(bmbi.EXISTING_PAYMENTS_PROFILE) && (arrayList = this.f123749M) != null && !arrayList.isEmpty()) {
                this.f123748L.add(new bjtt(this.f124073X, this.f123749M));
            }
            if (new bxvv(this.f123751O.f128579F, bmbr.f128571G).contains(bmbi.DEVICE_CONTACTS)) {
                this.f123748L.add(new bjtp(this.f124073X));
            }
            if (new bxvv(this.f123751O.f128579F, bmbr.f128571G).contains(bmbi.GOOGLE_PLACES_API) && bjtr.m104595a(this.f123782s)) {
                this.f123748L.add(new bjtr(this.f124073X, mo65713f()));
            }
            if (new bxvv(this.f123751O.f128579F, bmbr.f128571G).contains(bmbi.ORCHESTRATION_ADDRESS_API)) {
                this.f123748L.add(new bjtu(this.f124073X, this.f123756T, this.f123755S, mo65713f()));
            }
            String p = m105048p();
            String a2 = bjtl.m104566a(this.f123783t, "require");
            ArrayList arrayList2 = new ArrayList(p.length());
            this.f123781r = new ArrayList(p.length());
            int length = p.length();
            for (int i = 0; i < length; i++) {
                char charAt = p.charAt(i);
                char[] charArray = p.substring(i).toCharArray();
                if (charAt == 'N') {
                    TextView textView = this.f123771h;
                    if (textView instanceof FormEditText) {
                        m105043a('N', charArray, a2, (FormEditText) textView);
                        this.f123771h.setEnabled(this.f123766c);
                    }
                    this.f123781r.add(this.f123771h);
                } else {
                    View a3 = m105039a(charAt, charArray, a2, (View) null);
                    arrayList2.add(a3);
                    this.f123781r.add(a3);
                }
            }
            m105049q();
            this.f123772i.mo71811a(arrayList2);
            bkdb bkdb = this.f123740D;
            if (bkdb != null) {
                bkdb.mo51905a(12, Bundle.EMPTY);
            }
            m105050r();
            m105052u();
            if (!(this.f123770g == null || sparseArray == null)) {
                int size = this.f123781r.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = (View) this.f123781r.get(i2);
                    String str = (String) sparseArray.get(((Character) view.getTag()).charValue());
                    if (str != null) {
                        m105045a(view, str, false, 1);
                    }
                }
            }
            btwp btwp = this.f123750N;
            if (btwp != null && bjtv.m104616b(btwp.f152731b) == a) {
                mo65707b(this.f123750N, this.f123758V);
                this.f123750N = null;
                this.f123758V = 1;
            }
            View a4 = mo65694a('S');
            if (a4 instanceof Spinner) {
                Spinner spinner = (Spinner) a4;
                if (spinner.getSelectedItemPosition() == 0 && ((bkac) spinner.getItemAtPosition(1)).f123723b) {
                    if (spinner instanceof FormSpinner) {
                        ((FormSpinner) spinner).mo71972b(1);
                    } else {
                        spinner.setSelection(1);
                    }
                }
            }
            this.f123772i.mo71808a();
            m105050r();
        }
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        if (bmne.f130093c == mo65693a(bmbm.COUNTRY)) {
            return bjwl.m104788a(bmne, bjtv.m104615a(this.f123782s));
        }
        if (bmne.f130093c == this.f123751O.f128587d) {
            return false;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid trigger component %d", Long.valueOf(bmne.f130093c)));
    }

    /* renamed from: a */
    public final boolean mo65704a(String str) {
        return this.f123751O.f128583K.mo73744a() == 0 && this.f123751O.f128603t.contains(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65705a(boolean z) {
        if (!this.f123785v || !this.f123744H) {
            return false;
        }
        this.f123785v = false;
        this.f123744H = false;
        mo65719m();
        if (!z) {
            return true;
        }
        this.f123770g.requestFocus(130);
        return true;
    }
}
