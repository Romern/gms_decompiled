package p000;

import android.accounts.Account;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.address.DynamicAddressFieldsLayout;
import com.google.android.wallet.p097ui.common.CheckboxView;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormSpinner;
import com.google.android.wallet.p097ui.common.RegionCodeView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjzp extends bkag implements bkes, bket {

    /* renamed from: a */
    private int f123707a;

    /* renamed from: h */
    public final bkaf f123708h = new bkaf();

    /* renamed from: i */
    public final bjes f123709i = new bjes(1667);

    /* renamed from: a */
    public static Bundle m105017a(int i, bmbr bmbr, boolean z, LogContext logContext) {
        Bundle a = bkdx.m105383a(i, bmbr, logContext);
        a.putBoolean("allowFetchInitialCountryData", z);
        return a;
    }

    /* renamed from: c */
    private static Bundle m105018c(Bundle bundle) {
        if (bundle != null) {
            return bundle.getBundle("addressFormHandler");
        }
        return null;
    }

    /* renamed from: a */
    public final void mo65674a(bkae bkae) {
        this.f123708h.f123789z = bkae;
    }

    /* renamed from: a */
    public final void mo65675a(bkey bkey) {
        this.f123708h.f123737A = bkey;
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        String str2;
        if (!mo52806b((List) null) || this.f123708h.mo65720n()) {
            return "";
        }
        if (str != null) {
            str2 = String.format(str, "", "");
        } else {
            str2 = str;
        }
        return this.f123708h.mo65695a(mo52928a(Bundle.EMPTY), str2, true, str2, str2);
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f123708h.mo65715h();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f123709i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo51922f() {
        bkaf bkaf = this.f123708h;
        if (bkaf != null) {
            bkaf.mo65711c(this.f124195aJ);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        int i;
        int i2;
        super.onActivityCreated(bundle);
        bkaf bkaf = this.f123708h;
        Bundle c = m105018c(bundle);
        if (c != null) {
            if (c.containsKey("pendingAddress")) {
                btwp btwp = (btwp) bxzl.m124566a(c, "pendingAddress", btwp.f152728s, bxus.m123742a());
                int a = bwfc.m121900a(c.getInt("pendingAddressEntryMethod", 0));
                if (a == 0) {
                    a = 1;
                }
                bkaf.mo65699a(btwp, a);
            }
            if (bkaf.f123782s == 0) {
                bkaf.f123782s = c.getInt("selectedCountry");
            }
            if (c.containsKey("countryData")) {
                try {
                    bkaf.f123783t = new JSONObject(c.getString("countryData"));
                    int a2 = bjtl.m104564a(bkaf.f123783t);
                    if (!(a2 == 0 || a2 == 858 || a2 == (i2 = bkaf.f123782s))) {
                        bkaf.f123782s = a2;
                        bkaf.mo65703a(bkaf.f123783t);
                        bkaf.f123782s = i2;
                    }
                } catch (JSONException e) {
                    throw new RuntimeException("Could not construct JSONObject from KEY_COUNTRY_DATA json string", e);
                }
            }
            if (c.containsKey("languageCode")) {
                bkaf.f123784u = c.getString("languageCode");
            }
            if (c.containsKey("adminAreaData")) {
                try {
                    bkaf.f123747K = new JSONObject(c.getString("adminAreaData"));
                } catch (JSONException e2) {
                    throw new RuntimeException("Could not construct JSONObject from KEY_ADMIN_AREA_DATA json string", e2);
                }
            }
        }
        bkaf.mo65719m();
        bkaf.mo65711c(bkaf.f123766c);
        bkaf.f123774k.mo72073a((List) bkaf.f123746J);
        bkaf.f123774k.f152187h = new bjzw(bkaf);
        bkaf.mo65696a();
        if (bkaf.f123773j.getVisibility() == 0) {
            bkaf.onCheckedChanged(null, bkaf.f123773j.isChecked());
        }
        bkey bkey = bkaf.f123737A;
        if (!(bkey == null || (i = bkaf.f123782s) == 0)) {
            bkey.mo52935a(i, bkaf.f123768e, false);
        }
        bjwl.m104784a(this.f123708h, ((bmbr) this.f124069w).f128587d, this.f124196aK);
        if (((Boolean) bjwe.f123487h.mo54082a()).booleanValue()) {
            bkaf bkaf2 = this.f123708h;
            bjwl.m104784a(bkaf2, bkaf2.mo65693a(bmbm.COUNTRY), this.f124196aK);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        int a;
        super.onCreate(bundle);
        this.f123708h.f123767d = getArguments().getBoolean("allowFetchInitialCountryData");
        this.f123708h.f123787x = mo65980at();
        bkaf bkaf = this.f123708h;
        bkaf.f123740D = this;
        bkaf.f123742F = this;
        bkaf.f123739C = this;
        bkaf.f123788y = mo65818aq();
        bkaf bkaf2 = this.f123708h;
        Account cn = mo51878cn();
        LayoutInflater layoutInflater = this.f123963aH;
        Activity activity = getActivity();
        bwgw cm = mo51877cm();
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        boolean z2 = this.f124195aJ;
        int id = getId();
        bkep bkep = new bkep();
        bkaf2.f123751O = (bmbr) this.f124069w;
        bkaf2.f123755S = cn;
        bkaf2.f123759a = layoutInflater;
        bkaf2.f124073X = activity;
        bkaf2.f123756T = cm;
        bkaf2.f123765b = contextThemeWrapper;
        bkaf2.f123766c = z2;
        bkaf2.f123768e = id;
        bkaf2.f123757U = bkep;
        boolean z3 = true;
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{mo65672v()});
        this.f123707a = obtainStyledAttributes.getResourceId(0, mo65673w());
        obtainStyledAttributes.recycle();
        bkaf bkaf3 = this.f123708h;
        Bundle c = m105018c(bundle);
        TypedArray obtainStyledAttributes2 = bkaf3.f123765b.obtainStyledAttributes(new int[]{C0126R.attr.internalUicValidateFieldsWhenNotVisible});
        bkaf3.f123786w = obtainStyledAttributes2.getBoolean(0, false);
        obtainStyledAttributes2.recycle();
        bkaf3.f123745I = bjvh.m104693a(bkaf3.f123751O);
        if (c == null) {
            try {
                bkaf3.f123783t = new JSONObject(bkaf3.f123751O.f128591h);
                String a2 = bjtv.m104615a(bjtl.m104564a(bkaf3.f123783t));
                btwp btwp = bkaf3.f123745I.f128615e;
                if (btwp == null) {
                    btwp = btwp.f152728s;
                }
                if (!a2.equals(btwp.f152731b) && !bkaf3.f123767d) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[0] = a2;
                    btwp btwp2 = bkaf3.f123745I.f128615e;
                    if (btwp2 == null) {
                        btwp2 = btwp.f152728s;
                    }
                    objArr[1] = btwp2.f152731b;
                    throw new IllegalArgumentException(String.format(locale, "JSON provided for country %s but initial value has country %s", objArr));
                }
                btwp btwp3 = bkaf3.f123745I.f128615e;
                if (btwp3 == null) {
                    btwp3 = btwp.f152728s;
                }
                bkaf3.mo65699a(btwp3, 6);
                bkaf3.f123746J = bjtl.m104574b(bjtl.m104568a(bkaf3.f123751O.f128601r));
                if (bkaf3.f123746J.isEmpty()) {
                    throw new IllegalArgumentException("Array length of allowedCountryCodes must be > 0");
                } else if (!bkaf3.f123751O.f128606w.isEmpty()) {
                    int a3 = bmbp.m107874a(bkaf3.f123751O.f128576C);
                    if ((a3 == 0 || a3 != 3) && ((a = bmbp.m107874a(bkaf3.f123751O.f128576C)) == 0 || a != 4)) {
                        int a4 = bmbp.m107874a(bkaf3.f123751O.f128576C);
                        if (a4 == 0) {
                            z = false;
                        } else if (a4 != 5) {
                            z = false;
                        }
                        bkaf3.f123785v = z;
                    }
                    z = true;
                    bkaf3.f123785v = z;
                } else {
                    throw new IllegalArgumentException("Recipient field hint must be specified!");
                }
            } catch (JSONException e) {
                throw new RuntimeException("Could not construct JSONObject from mFormProto.initialCountryI18NDataJson", e);
            }
        } else {
            bkaf3.f123746J = c.getIntegerArrayList("regionCodes");
            bkaf3.f123785v = c.getBoolean("isReadOnlyMode");
        }
        bkaf3.f123749M = new ArrayList(bkaf3.f123751O.f128592i.size());
        bxwc bxwc = bkaf3.f123751O.f128592i;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = bkaf3.f123749M;
            bmbs bmbs = ((bmbz) bxwc.get(i)).f128638c;
            if (bmbs == null) {
                bmbs = bmbs.f128609j;
            }
            btwp btwp4 = bmbs.f128615e;
            if (btwp4 == null) {
                btwp4 = btwp.f152728s;
            }
            arrayList.add(btwp4);
        }
        int a5 = bmbp.m107874a(bkaf3.f123751O.f128576C);
        if (a5 == 0 || a5 != 4) {
            int a6 = bmbp.m107874a(bkaf3.f123751O.f128576C);
            if (a6 == 0) {
                z3 = false;
            } else if (a6 != 5) {
                z3 = false;
            }
        }
        bkaf3.f123744H = z3;
        if (!((Boolean) bjwe.f123487h.mo54082a()).booleanValue()) {
            bkaf bkaf4 = this.f123708h;
            bjwl.m104784a(bkaf4, bkaf4.mo65693a(bmbm.COUNTRY), this.f124196aK);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        bkaf bkaf = this.f123708h;
        bkaf.f123743G = 0;
        bkaf.mo65711c(bkaf.f123766c);
    }

    public final void onDetach() {
        super.onDetach();
        bkaf bkaf = this.f123708h;
        bkaf.f123737A = null;
        bkaf.mo65718l();
        bkaf.mo65713f().cancelAll((RequestQueue.RequestFilter) new bjzz());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bkaf bkaf = this.f123708h;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("selectedCountry", bkaf.f123782s);
        bundle2.putIntegerArrayList("regionCodes", bkaf.f123746J);
        btwp btwp = bkaf.f123750N;
        if (btwp != null) {
            bxzl.m124568a(bundle2, "pendingAddress", btwp);
            int i = bkaf.f123758V;
            int i2 = i - 1;
            if (i != 0) {
                bundle2.putInt("pendingAddressEntryMethod", i2);
            } else {
                throw null;
            }
        }
        JSONObject jSONObject = bkaf.f123783t;
        if (jSONObject != null) {
            bundle2.putString("countryData", jSONObject.toString());
        }
        bundle2.putString("languageCode", bkaf.f123784u);
        JSONObject jSONObject2 = bkaf.f123747K;
        if (jSONObject2 != null) {
            bundle2.putString("adminAreaData", jSONObject2.toString());
        }
        bundle2.putBoolean("isReadOnlyMode", bkaf.f123785v);
        bundle.putBundle("addressFormHandler", bundle2);
    }

    /* renamed from: u */
    public void mo65671u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo65672v() {
        return C0126R.attr.internalUicAddressRootLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo65673w() {
        return C0126R.C0128layout.fragment_address_entry;
    }

    /* JADX WARN: Type inference failed for: r3v0, assign insn: 0x0006: CONST  (r3v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int], assign insn: PHI: (r3v1 ?) = (r3v0 ?), (r3v6 ?) binds: [B:50:0x02d3, B:103:0x044d] */
    /* JADX WARN: Type inference failed for: r3v6, assign insn: 0x0489: CONST  (r3v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0381, code lost:
        if (r10.mo65704a(r4) == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03af, code lost:
        if (r7.contains("%A") != false) goto L_0x03b2;
     */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        TextView textView;
        LayoutInflater layoutInflater2 = layoutInflater;
        ? r3 = 0;
        View inflate = layoutInflater2.inflate(this.f123707a, viewGroup, false);
        bkaf bkaf = this.f123708h;
        Bundle c = m105018c(bundle);
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        bkaf.f123759a = layoutInflater2;
        bkaf.f123770g = (LinearLayout) inflate.findViewById(C0126R.C0129id.address_container);
        if (!bkaf.f123751O.f128589f.isEmpty()) {
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.address_title);
            textView2.setText(bkaf.f123751O.f128589f);
            textView2.setVisibility(0);
        }
        bkaf.f123773j = (CheckboxView) inflate.findViewById(C0126R.C0129id.hide_address_checkbox);
        if (!bkaf.f123751O.f128600q.isEmpty()) {
            CheckboxView checkboxView = bkaf.f123773j;
            bxvd da = bmqf.f130370r.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqf bmqf = (bmqf) da.f164949b;
            int i = bmqf.f130372a | 8;
            bmqf.f130372a = i;
            bmqf.f130378g = true;
            String str2 = bkaf.f123751O.f128600q;
            str2.getClass();
            bmqf.f130372a = i | 32;
            bmqf.f130380i = str2;
            bxvd da2 = bmow.f130264f.mo74144da();
            bmqh bmqh = bmqh.CHECKED;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmow bmow = (bmow) da2.f164949b;
            bmow.f130268c = bmqh.f130395e;
            int i2 = bmow.f130266a | 2;
            bmow.f130266a = i2;
            bmow.f130270e = 1;
            bmow.f130266a = i2 | 8;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqf bmqf2 = (bmqf) da.f164949b;
            bmow bmow2 = (bmow) da2.mo74062i();
            bmow2.getClass();
            bmqf2.f130374c = bmow2;
            bmqf2.f130373b = 10;
            checkboxView.mo71869a((bmqf) da.mo74062i());
            bkaf.f123773j.setVisibility(0);
            bkaf.f123773j.f151921h = bkaf;
        }
        if (new bxvv(bkaf.f123751O.f128607x, bmbr.f128574y).contains(bmbm.RECIPIENT)) {
            bkaf.f123771h = (TextView) layoutInflater2.inflate((int) C0126R.C0128layout.view_form_non_editable_text, (ViewGroup) bkaf.f123770g, false);
        } else {
            FormEditText formEditText = (FormEditText) layoutInflater2.inflate((int) C0126R.C0128layout.view_form_edit_text, (ViewGroup) bkaf.f123770g, false);
            formEditText.mo71919a(bkaf.f123787x);
            formEditText.mo71914a(bkaf.mo65693a(bmbm.RECIPIENT));
            formEditText.mo71924b(bkaf.f123754R);
            bkaf.f123771h = formEditText;
            bkaf.f123771h.setHint(bkaf.mo65706b('N'));
            bkaf.mo65700a((FormEditText) bkaf.f123771h, bmbm.RECIPIENT);
            bkaf.f123771h.setInputType(8289);
            if (bkaf.f123751O.f128577D) {
                bkaf.f123771h.setOnFocusChangeListener(bkaf);
            }
            ((FormEditText) bkaf.f123771h).f151985E = !new bxvv(bkaf.f123751O.f128608z, bmbr.f128570A).contains(bmbm.RECIPIENT);
            ((FormEditText) bkaf.f123771h).mo71924b(bkaf.f123753Q);
        }
        bkaf.f123771h.setTag('N');
        bkaf.f123771h.setId(C0126R.C0129id.address_field_recipient);
        LinearLayout linearLayout = bkaf.f123770g;
        linearLayout.addView(bkaf.f123771h, linearLayout.indexOfChild(bkaf.f123773j) + 1);
        bkaf.f123774k = (RegionCodeView) ((ViewStub) bkaf.f123770g.findViewById(C0126R.C0129id.region_code_view)).inflate();
        bkaf.f123774k.mo72082a(bkaf.f123787x);
        bkaf.f123774k.mo72080a(bkaf.mo65693a(bmbm.COUNTRY));
        bkaf.f123772i = (DynamicAddressFieldsLayout) bkaf.f123770g.findViewById(C0126R.C0129id.dynamic_address_fields_layout);
        bmbr bmbr = bkaf.f123751O;
        if (bmbr.f128604u) {
            if (new bxvv(bmbr.f128607x, bmbr.f128574y).contains(bmbm.PHONE_NUMBER)) {
                bkaf.f123775l = (TextView) layoutInflater2.inflate((int) C0126R.C0128layout.view_form_non_editable_text, (ViewGroup) bkaf.f123770g, false);
            } else {
                FormEditText formEditText2 = (FormEditText) layoutInflater2.inflate((int) C0126R.C0128layout.view_form_edit_text, (ViewGroup) bkaf.f123770g, false);
                formEditText2.mo71919a(bkaf.f123787x);
                formEditText2.mo71914a(bkaf.mo65693a(bmbm.PHONE_NUMBER));
                formEditText2.mo71924b(bkaf.f123754R);
                bkaf.f123775l = formEditText2;
                bkaf.f123775l.setHint((int) C0126R.string.wallet_uic_phone_number);
                bkaf.mo65700a((FormEditText) bkaf.f123775l, bmbm.PHONE_NUMBER);
                bkaf.f123775l.setInputType(3);
                if (bkaf.f123751O.f128577D) {
                    bkaf.f123775l.setOnFocusChangeListener(bkaf);
                }
                ((FormEditText) bkaf.f123775l).f151985E = !new bxvv(bkaf.f123751O.f128608z, bmbr.f128570A).contains(bmbm.PHONE_NUMBER);
            }
            bkaf.f123775l.setId(C0126R.C0129id.address_field_phone_number);
            int i3 = Build.VERSION.SDK_INT;
            bkaf.f123775l.setTextDirection(3);
            bkaf.f123775l.setLayerType(2, null);
            LinearLayout linearLayout2 = bkaf.f123770g;
            linearLayout2.addView(bkaf.f123775l, linearLayout2.indexOfChild(bkaf.f123772i) + 1);
            if (c == null && TextUtils.isEmpty(bkaf.f123775l.getText())) {
                if (!bkaf.f123745I.f128616f.isEmpty()) {
                    bkaf.mo65701a(bkaf.f123745I.f128616f, 6);
                } else {
                    bkfr.m105583a(bkaf.f124073X, bkaf.f123775l);
                }
                bmbs bmbs = bkaf.f123745I;
                bxvd bxvd = (bxvd) bmbs.mo74142c(5);
                bxvd.mo73625a((bxvk) bmbs);
                TextView textView3 = bkaf.f123775l;
                if (textView3 instanceof FormEditText) {
                    String m = ((FormEditText) textView3).mo71937m();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmbs bmbs2 = (bmbs) bxvd.f164949b;
                    bmbs bmbs3 = bmbs.f128609j;
                    m.getClass();
                    bmbs2.f128611a |= 16;
                    bmbs2.f128616f = m;
                } else {
                    String charSequence = textView3.getText().toString();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmbs bmbs4 = (bmbs) bxvd.f164949b;
                    bmbs bmbs5 = bmbs.f128609j;
                    charSequence.getClass();
                    bmbs4.f128611a |= 16;
                    bmbs4.f128616f = charSequence;
                }
                bkaf.f123745I = (bmbs) bxvd.mo74062i();
            }
        }
        int size = bkaf.f123751O.f128605v.size();
        bkaf.f123776m = new View[size];
        int i4 = 0;
        while (i4 < size) {
            View[] viewArr = bkaf.f123776m;
            bmqf bmqf3 = (bmqf) bkaf.f123751O.f128605v.get(i4);
            LinearLayout linearLayout3 = bkaf.f123770g;
            bjxv bjxv = bkaf.f123788y;
            if (bjxv == null || bkaf.f123739C == null) {
                throw new IllegalStateException("No IdGenerator or TooltipIconClickListener to create UiField.");
            }
            bkfu bkfu = new bkfu(bmqf3, bkaf.f123759a, bjxv, linearLayout3);
            bkfu.f124162a = bkaf.f124073X;
            bkfu.f124164c = bkaf.f123787x;
            bkfu.f124165d = bkaf.f123739C;
            bkfu.f124167f = (bkdw) bkaf.f124073X.getSupportFragmentManager().findFragmentById(bkaf.f123768e);
            viewArr[i4] = bkfu.mo65971a();
            LinearLayout linearLayout4 = bkaf.f123770g;
            linearLayout4.addView(bkaf.f123776m[i4], linearLayout4.indexOfChild(bkaf.f123775l) + i4 + 1);
            i4++;
            r3 = 0;
        }
        bkaf.f123772i.f151847c = bkaf;
        bkaf.f123777n = bkaf.f123770g.findViewById(C0126R.C0129id.address_read_only_container);
        bkaf.f123778o = (TextView) bkaf.f123770g.findViewById(C0126R.C0129id.address_read_only_name);
        bkaf.f123779p = (TextView) bkaf.f123770g.findViewById(C0126R.C0129id.address_read_only_text);
        bkaf.f123780q = (ImageButton) bkaf.f123770g.findViewById(C0126R.C0129id.edit_address_icon);
        if (bkaf.f123785v) {
            int[] iArr = {C0126R.attr.internalUicDisplayCollapsedAddressNameEmphasized, C0126R.attr.internalUicCollapsedAddressNewLineSeparator, C0126R.attr.internalUicCollapsedMinAddressNewLineSeparator};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = bkaf.f123765b.obtainStyledAttributes(iArr);
            boolean z = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicDisplayCollapsedAddressNameEmphasized), r3);
            String string = obtainStyledAttributes.getString(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicCollapsedAddressNewLineSeparator));
            String string2 = obtainStyledAttributes.getString(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicCollapsedMinAddressNewLineSeparator));
            obtainStyledAttributes.recycle();
            if (z && (textView = bkaf.f123778o) != null) {
                btwp btwp = bkaf.f123745I.f128615e;
                if (btwp == null) {
                    btwp = btwp.f152728s;
                }
                textView.setText(btwp.f152747r);
                bkaf.f123778o.setVisibility(r3);
            }
            btwp btwp2 = bkaf.f123745I.f128615e;
            if (btwp2 == null) {
                btwp2 = btwp.f152728s;
            }
            String str3 = btwp2.f152731b;
            if (bkaf.f123751O.f128583K.mo73744a() > 0) {
                JSONObject jSONObject = bkaf.f123783t;
                if (bjtl.m104582d(jSONObject, bkaf.f123784u)) {
                    str = bjtl.m104566a(jSONObject, "lfmt");
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = bjtl.m104566a(jSONObject, "fmt");
                }
                if (!TextUtils.isEmpty(str)) {
                }
            }
            string = string2;
            bkaf.f123779p.setText(bkaf.mo65695a(bkaf.f123745I, string, !z, "\n", "\n"));
            if (bkaf.f123744H) {
                int a = bmbp.m107874a(bkaf.f123751O.f128576C);
                if (a == 0) {
                    a = 1;
                }
                int[] iArr2 = new int[2];
                iArr2[r3] = a == 5 ? C0126R.attr.uicClearDrawable : C0126R.attr.uicEditDrawable;
                iArr2[1] = C0126R.attr.internalUicEditAndClearableIconColor;
                TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(iArr2);
                Drawable mutate = obtainStyledAttributes2.getDrawable(r3).mutate();
                int i5 = Build.VERSION.SDK_INT;
                C1173lt.m19601a(mutate, obtainStyledAttributes2.getColorStateList(1));
                obtainStyledAttributes2.recycle();
                bkaf.f123780q.setImageDrawable(mutate);
                bkaf.f123780q.setVisibility(r3);
                int a2 = bmbp.m107874a(bkaf.f123751O.f128576C);
                if (a2 != 0 && a2 == 5) {
                    bkaf.f123780q.setOnClickListener(bkaf);
                } else {
                    bkaf.f123780q.setClickable(r3);
                    bkaf.f123780q.setBackground(null);
                }
                bkaf.f123777n.setOnClickListener(bkaf);
            }
        }
        this.f123708h.f123738B = this;
        return inflate;
    }

    /* renamed from: a */
    public final bmbs mo52928a(Bundle bundle) {
        String str;
        long j;
        bkaf bkaf = this.f123708h;
        bxvd da = bmbs.f128609j.mo74144da();
        bmbr bmbr = bkaf.f123751O;
        if ((bmbr.f128584a & 1) == 0) {
            str = bmbr.f128586c;
        } else {
            bmdn bmdn = bmbr.f128585b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            str = bmdn.f128834b;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmbs bmbs = (bmbs) da.f164949b;
        str.getClass();
        bmbs.f128611a |= 1;
        bmbs.f128612b = str;
        bmbr bmbr2 = bkaf.f123751O;
        if ((bmbr2.f128584a & 1) == 0) {
            j = bmbr2.f128587d;
        } else {
            bmdn bmdn2 = bmbr2.f128585b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            j = bmdn2.f128835c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmbs bmbs2 = (bmbs) da.f164949b;
        bmbs2.f128611a |= 2;
        bmbs2.f128613c = j;
        bmbr bmbr3 = bkaf.f123751O;
        int i = bmbr3.f128584a;
        if ((i & 1) != 0) {
            bmdn bmdn3 = bmbr3.f128585b;
            if (bmdn3 == null) {
                bmdn3 = bmdn.f128831k;
            }
            if ((bmdn3.f128833a & 4) != 0) {
                bmdn bmdn4 = bkaf.f123751O.f128585b;
                if (bmdn4 == null) {
                    bmdn4 = bmdn.f128831k;
                }
                bxtx bxtx = bmdn4.f128836d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmbs bmbs3 = (bmbs) da.f164949b;
                bxtx.getClass();
                bmbs3.f128611a |= 4;
                bmbs3.f128614d = bxtx;
            }
        } else if ((i & 8) != 0 && bmbr3.f128588e.mo73744a() > 0) {
            bxtx bxtx2 = bkaf.f123751O.f128588e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmbs bmbs4 = (bmbs) da.f164949b;
            bxtx2.getClass();
            bmbs4.f128611a |= 4;
            bmbs4.f128614d = bxtx2;
        }
        if (!bkaf.mo65720n()) {
            btwp a = bkaf.m105040a(bkaf.mo65712e());
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((bxvk) a);
            btwo btwo = (btwo) bxvd;
            String i2 = bkaf.mo65716i();
            if (!TextUtils.isEmpty(i2)) {
                if (btwo.f164950c) {
                    btwo.mo74035c();
                    btwo.f164950c = false;
                }
                btwp btwp = (btwp) btwo.f164949b;
                btwp btwp2 = btwp.f152728s;
                i2.getClass();
                btwp.f152730a |= 8;
                btwp.f152733d = i2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmbs bmbs5 = (bmbs) da.f164949b;
            btwp btwp3 = (btwp) btwo.mo74062i();
            btwp3.getClass();
            bmbs5.f128615e = btwp3;
            bmbs5.f128611a |= 8;
            TextView textView = bkaf.f123775l;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                String charSequence = bkaf.f123775l.getText().toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmbs bmbs6 = (bmbs) da.f164949b;
                charSequence.getClass();
                bmbs6.f128611a |= 16;
                bmbs6.f128616f = charSequence;
            }
            int length = bkaf.f123776m.length;
            for (int i3 = 0; i3 < length; i3++) {
                bmqk a2 = bkft.m105631a(bkaf.f123776m[i3], (bmqf) bkaf.f123751O.f128605v.get(i3));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmbs bmbs7 = (bmbs) da.f164949b;
                a2.getClass();
                if (!bmbs7.f128617g.mo73666a()) {
                    bmbs7.f128617g = bxvk.m124021a(bmbs7.f128617g);
                }
                bmbs7.f128617g.add(a2);
            }
            bmbs bmbs8 = bkaf.f123745I;
            if ((bmbs8.f128611a & 64) != 0) {
                bxtx bxtx3 = bmbs8.f128619i;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmbs bmbs9 = (bmbs) da.f164949b;
                bxtx3.getClass();
                bmbs9.f128611a |= 64;
                bmbs9.f128619i = bxtx3;
            }
            return (bmbs) da.mo74062i();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmbs bmbs10 = (bmbs) da.f164949b;
        bmbs10.f128611a |= 32;
        bmbs10.f128618h = true;
        return (bmbs) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormSpinner.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      android.support.v7.widget.AppCompatSpinner.a(android.widget.SpinnerAdapter, android.graphics.drawable.Drawable):int
      com.google.android.wallet.ui.common.FormSpinner.a(java.lang.CharSequence, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        if ((r1 instanceof com.google.android.wallet.p097ui.common.FormEditText ? ((com.google.android.wallet.p097ui.common.FormEditText) r1).f151985E : r1 instanceof com.google.android.wallet.p097ui.common.FormSpinner ? ((com.google.android.wallet.p097ui.common.FormSpinner) r1).f152062p : r0.f123786w) != false) goto L_0x00be;
     */
    /* renamed from: a */
    public boolean mo52281a(bmas bmas) {
        String str;
        bkae bkae;
        bkaf bkaf = this.f123708h;
        bmbr bmbr = bkaf.f123751O;
        if ((bmbr.f128584a & 1) == 0) {
            str = bmbr.f128586c;
        } else {
            bmdn bmdn = bmbr.f128585b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            str = bmdn.f128834b;
        }
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (!bmaf.f128438a.equals(str)) {
            return false;
        }
        int a = bmbp.m107874a(bkaf.f123751O.f128576C);
        if (a == 0 || a != 3) {
            if (bkaf.f123785v) {
                bkaf.f123785v = false;
                bkaf.mo65719m();
            }
            bmaf bmaf2 = bmas.f128496a;
            if (bmaf2 == null) {
                bmaf2 = bmaf.f128436d;
            }
            if (bmaf2.f128439b != 16) {
                LinearLayout linearLayout = bkaf.f123770g;
                bmaf bmaf3 = bmas.f128496a;
                if (bmaf3 == null) {
                    bmaf3 = bmaf.f128436d;
                }
                View findViewById = linearLayout.findViewById(bjtl.m104563a(bmaf3.f128439b));
                if (findViewById != null) {
                    if (findViewById.getVisibility() != 0) {
                    }
                    if (findViewById instanceof FormEditText) {
                        ((FormEditText) findViewById).mo65794a((CharSequence) bmas.f128497b, true);
                        if (findViewById != bkaf.f123771h || (bkae = bkaf.f123789z) == null) {
                            return true;
                        }
                        bkae.mo65691b();
                        return true;
                    } else if (!(findViewById instanceof FormSpinner)) {
                        bmaf bmaf4 = bmas.f128496a;
                        if (bmaf4 == null) {
                            bmaf4 = bmaf.f128436d;
                        }
                        int i = bmaf4.f128439b;
                        StringBuilder sb = new StringBuilder(76);
                        sb.append("FormFieldMessage received for non-EditText or non-Spinner field: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    } else {
                        ((FormSpinner) findViewById).mo65794a((CharSequence) bmas.f128497b, true);
                        return true;
                    }
                }
                bmaf bmaf5 = bmas.f128496a;
                if (bmaf5 == null) {
                    bmaf5 = bmaf.f128436d;
                }
                int i2 = bmaf5.f128439b;
                String valueOf = String.valueOf(findViewById);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 63);
                sb2.append("FormFieldMessage received for invalid field: ");
                sb2.append(i2);
                sb2.append(" view: ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
            View[] viewArr = bkaf.f123776m;
            bmaf bmaf6 = bmas.f128496a;
            if (bmaf6 == null) {
                bmaf6 = bmaf.f128436d;
            }
            bkft.m105635a(viewArr[bmaf6.f128440c], bmas.f128497b);
            return true;
        }
        throw new IllegalArgumentException("FormFieldMessage should not be received for read-only address form");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo52937a(List list, boolean z) {
        int a;
        if (mo65849k()) {
            return true;
        }
        bkaf bkaf = this.f123708h;
        if (isHidden()) {
            return true;
        }
        if (!bkaf.mo65709b() && bkaf.f123770g != null) {
            if (bkaf.mo65720n()) {
                return true;
            }
            if (bkaf.f123782s != 0) {
                boolean a2 = bkde.m105348a(bkaf.mo65715h(), list, z);
                TextView textView = bkaf.f123771h;
                if (!(textView == null || bkaf.f123789z == null || TextUtils.isEmpty(textView.getError()))) {
                    bkaf.f123789z.mo65691b();
                }
                if (a2 || (a = bmbp.m107874a(bkaf.f123751O.f128576C)) == 0 || a != 3) {
                    if (z && !a2 && bkaf.f123785v) {
                        bkaf.f123785v = false;
                        bkaf.mo65719m();
                    }
                    if (a2) {
                        return true;
                    }
                } else {
                    throw new IllegalArgumentException("Read-only address form has invalid value.");
                }
            }
        }
        return false;
    }
}
