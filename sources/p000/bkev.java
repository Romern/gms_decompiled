package p000;

import android.content.ContentValues;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.ButtonComponent;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bkev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkev extends bkge implements View.OnClickListener, bkdf, bjze, bkbm, bker {

    /* renamed from: a */
    public View f124103a;

    /* renamed from: b */
    public FormEditText f124104b;

    /* renamed from: c */
    public ButtonComponent f124105c;

    /* renamed from: d */
    InfoMessageView f124106d;

    /* renamed from: e */
    Pattern f124107e;

    /* renamed from: f */
    long f124108f = -1;

    /* renamed from: g */
    long f124109g = System.currentTimeMillis();

    /* renamed from: h */
    public final ArrayList f124110h = new ArrayList();

    /* renamed from: i */
    private bmds f124111i;

    /* renamed from: j */
    private Pattern f124112j;

    /* renamed from: k */
    private bjzf f124113k;

    /* renamed from: l */
    private final List f124114l = new ArrayList();

    /* renamed from: m */
    private int f124115m;

    public bkev() {
        new bjes(1635);
    }

    /* renamed from: a */
    public static bkev m105454a(bmds bmds, int i, LogContext logContext) {
        bkev bkev = new bkev();
        Bundle a = bkbr.m105273a(i, logContext);
        bjvp.m104736a(a, "fieldProto", bmds);
        bkev.setArguments(a);
        return bkev;
    }

    /* renamed from: b */
    private final boolean m105457b() {
        int i = this.f124115m;
        return i == C0126R.C0128layout.fragment_vertical_otp_field_visdre || i == C0126R.C0128layout.fragment_otp_field_visdre;
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        Object ar = mo65819ar();
        if (ar instanceof bkdw) {
            return (bkdw) ar;
        }
        return null;
    }

    /* renamed from: W */
    public final long mo52837W() {
        return 0;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.singletonList(new bjeq(1634));
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        FormEditText formEditText = this.f124104b;
        if (formEditText != null) {
            bmqf bmqf = this.f124111i.f128855b;
            if (bmqf == null) {
                bmqf = bmqf.f130370r;
            }
            bjwl.m104790b(formEditText, bmqf.f130376e, this.f124196aK);
        }
        ButtonComponent buttonComponent = this.f124105c;
        if (buttonComponent != null) {
            bmdb bmdb = this.f124111i.f128856c;
            if (bmdb == null) {
                bmdb = bmdb.f128767k;
            }
            bjwl.m104790b(buttonComponent, bmdb.f128770b, this.f124196aK);
        }
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return this.f124104b.mo65798cL();
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        return this.f124104b.mo65799cM();
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        return this.f124104b.mo65800cN();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* renamed from: f */
    public final void mo51922f() {
        FormEditText formEditText = this.f124104b;
        if (formEditText != null) {
            boolean z = this.f124195aJ;
            formEditText.setEnabled(z);
            this.f124105c.setEnabled(z);
            InfoMessageView infoMessageView = this.f124106d;
            if (infoMessageView != null) {
                infoMessageView.setEnabled(z);
            }
        }
    }

    public final CharSequence getError() {
        return this.f124104b.getError();
    }

    public void onClick(View view) {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f124111i = (bmds) bjvp.m104730a(getArguments(), "fieldProto", (bxxk) bmds.f128852h.mo74142c(7));
        if (bjzc.m104960a(getActivity(), "android.permission.READ_SMS") && !this.f124111i.f128859f.isEmpty()) {
            Pattern compile = Pattern.compile(this.f124111i.f128859f);
            this.f124107e = compile;
            if (compile.matcher("").groupCount() != 1) {
                Log.e("OtpFieldFragment", String.format(Locale.US, "Ignoring OTP Regex: %s should only contain a single group for matching", this.f124107e.pattern()));
                this.f124107e = null;
            }
        }
        if (!this.f124111i.f128857d.isEmpty()) {
            this.f124112j = Pattern.compile(this.f124111i.f128857d);
        }
        if (bundle != null) {
            this.f124108f = bundle.getLong("lastMatchingSmsReceivedMs");
            this.f124109g = bundle.getLong("lastSmsScanForOtpsMs");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("lastMatchingSmsReceivedMs", this.f124108f);
        bundle.putLong("lastSmsScanForOtpsMs", this.f124109g);
    }

    public final void onStart() {
        super.onStart();
        if (this.f124107e != null) {
            if (this.f124113k == null) {
                this.f124113k = new bjzf();
            }
            bjzf bjzf = this.f124113k;
            bjzf.f123667b = this;
            bjzf.mo65656a(getActivity());
            ArrayList a = bjzg.m104969a(getActivity(), Math.max(this.f124108f, this.f124109g), this.f124112j);
            this.f124109g = System.currentTimeMillis();
            int size = a.size();
            int i = 0;
            while (i < size && !m105456a((ContentValues) a.get(i))) {
                i++;
            }
        }
    }

    public final void onStop() {
        super.onStop();
        bjzf bjzf = this.f124113k;
        if (bjzf != null) {
            bjzf.mo65657b(getActivity());
        }
    }

    /* renamed from: b */
    public final void mo65786b(bker bker) {
        this.f124114l.remove(bker);
    }

    /* renamed from: a */
    private final void m105455a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 773);
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i);
        (getParentFragment() != null ? (bkdb) getParentFragment() : (bkdb) getActivity()).mo51905a(7, bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* renamed from: a */
    private final boolean m105456a(ContentValues contentValues) {
        String asString = contentValues.getAsString("address");
        String asString2 = contentValues.getAsString("body");
        long longValue = contentValues.getAsLong("date").longValue();
        Pattern pattern = this.f124112j;
        if (pattern != null && !TextUtils.isEmpty(asString) && !this.f124112j.matcher(asString).matches()) {
            m105455a(21);
            return false;
        } else if (this.f124108f > longValue) {
            Locale locale = Locale.US;
            Object[] objArr = {Long.valueOf(longValue), Long.valueOf(this.f124108f)};
            return false;
        } else if (TextUtils.isEmpty(asString2)) {
            return false;
        } else {
            Matcher matcher = this.f124107e.matcher(asString2);
            if (matcher.find()) {
                String group = matcher.group(1);
                if (!TextUtils.isEmpty(group)) {
                    this.f124108f = System.currentTimeMillis();
                    this.f124104b.requestFocus();
                    this.f124104b.mo71832a((CharSequence) group, 8);
                    m105455a(0);
                    return true;
                }
            }
            if (pattern == null) {
                m105455a(22);
                return false;
            }
            m105455a(20);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo52843a(Bundle bundle, View view) {
        super.mo52843a(bundle, view);
        mo51922f();
        return view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int a;
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.internalUicOtpFieldRootLayout, C0126R.attr.internalUicMaterialFieldLayoutEnabled, C0126R.attr.internalUicOtpFieldVerticalRootLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, C0126R.C0128layout.fragment_otp_field);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(2, C0126R.C0128layout.fragment_vertical_otp_field);
        obtainStyledAttributes.recycle();
        int a2 = bmdr.m107928a(this.f124111i.f128860g);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 - 1 != 2) {
            this.f124115m = resourceId;
        } else {
            this.f124115m = resourceId2;
            resourceId = resourceId2;
        }
        View inflate = layoutInflater.inflate(resourceId, (ViewGroup) null, false);
        this.f124103a = inflate;
        FormEditText formEditText = (FormEditText) inflate.findViewById(C0126R.C0129id.otp_field);
        this.f124104b = formEditText;
        formEditText.mo71919a(mo65980at());
        bmqf bmqf = this.f124111i.f128855b;
        if (bmqf == null) {
            bmqf = bmqf.f130370r;
        }
        bkft.m105629a(bmqf, this.f124104b);
        this.f124104b.setMaxLines(Integer.MAX_VALUE);
        this.f124104b.setHorizontallyScrolling(false);
        this.f124104b.mo65785a((bker) this);
        FormEditText formEditText2 = this.f124104b;
        bmqf bmqf2 = this.f124111i.f128855b;
        if (bmqf2 == null) {
            bmqf2 = bmqf.f130370r;
        }
        bjwl.m104784a(formEditText2, bmqf2.f130376e, this.f124196aK);
        ButtonComponent buttonComponent = (ButtonComponent) this.f124103a.findViewById(C0126R.C0129id.otp_button);
        this.f124105c = buttonComponent;
        bmdb bmdb = this.f124111i.f128856c;
        if (bmdb == null) {
            bmdb = bmdb.f128767k;
        }
        buttonComponent.mo52707a(bmdb);
        this.f124105c.mo65787a(mo65980at());
        ButtonComponent buttonComponent2 = this.f124105c;
        bmdb bmdb2 = this.f124111i.f128856c;
        if (bmdb2 == null) {
            bmdb2 = bmdb.f128767k;
        }
        bjwl.m104784a(buttonComponent2, bmdb2.f128770b, this.f124196aK);
        this.f124105c.f151907f = this;
        bmdb bmdb3 = this.f124111i.f128856c;
        if (bmdb3 == null) {
            bmdb3 = bmdb.f128767k;
        }
        int a3 = bmda.m107911a(bmdb3.f128777i);
        if (a3 != 0 && a3 == 8) {
            this.f124105c.setTextColor(bkfr.m105600c(this.f123962aG));
        }
        int a4 = bmdr.m107928a(this.f124111i.f128860g);
        if (!(a4 == 0 || a4 != 3 || (this.f124111i.f128854a & 8) == 0)) {
            InfoMessageView infoMessageView = (InfoMessageView) this.f124103a.findViewById(C0126R.C0129id.button_info_message);
            this.f124106d = infoMessageView;
            bmnr bmnr = this.f124111i.f128858e;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72006b(bmnr);
        }
        if (z) {
            MaterialFieldLayout materialFieldLayout = (MaterialFieldLayout) this.f124103a.findViewById(C0126R.C0129id.otp_field_container);
            bmqf bmqf3 = this.f124111i.f128855b;
            if (bmqf3 == null) {
                bmqf3 = bmqf.f130370r;
            }
            materialFieldLayout.mo72053c(bmqf3.f130380i);
            int a5 = bmdr.m107928a(this.f124111i.f128860g);
            if (a5 != 0 && a5 == 3 && !m105457b()) {
                materialFieldLayout.f152154i = true;
            }
            int a6 = bmdr.m107928a(this.f124111i.f128860g);
            if (((a6 != 0 && a6 == 2) || (a = bmdr.m107928a(this.f124111i.f128860g)) == 0 || a == 1) && !m105457b()) {
                this.f124105c.getViewTreeObserver().addOnGlobalLayoutListener(new bkeu(this));
            }
        }
        return this.f124103a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* renamed from: a */
    public final bmdt mo65918a(Bundle bundle) {
        bxvd da = bmdt.f128861d.mo74144da();
        FormEditText formEditText = this.f124104b;
        bmqf bmqf = this.f124111i.f128855b;
        if (bmqf == null) {
            bmqf = bmqf.f130370r;
        }
        bmqk a = bkft.m105631a(formEditText, bmqf);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdt bmdt = (bmdt) da.f164949b;
        a.getClass();
        bmdt.f128864b = a;
        int i = 1;
        boolean z = true;
        bmdt.f128863a |= 1;
        ButtonComponent buttonComponent = this.f124105c;
        if (bundle.containsKey("EventListener.EXTRA_TRIGGER_VALUE_REFERENCES")) {
            List b = bjvp.m104742b(bundle, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", (bxxk) bmne.f130089f.mo74142c(7));
            int size = b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                bmne bmne = (bmne) b.get(i2);
                if (bmne.f130093c == buttonComponent.f151904c.f128770b) {
                    int a2 = bmna.m108191a(bmne.f130094d);
                    if (a2 == 0 || a2 != 3) {
                        int a3 = bmna.m108191a(bmne.f130094d);
                        if (a3 != 0) {
                            i = a3;
                        }
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Unsupported trigger type: ");
                        sb.append(i - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    i2++;
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdt bmdt2 = (bmdt) da.f164949b;
            bmdt2.f128863a |= 2;
            bmdt2.f128865c = z;
            return (bmdt) da.mo74062i();
        }
        z = false;
        if (da.f164950c) {
        }
        bmdt bmdt22 = (bmdt) da.f164949b;
        bmdt22.f128863a |= 2;
        bmdt22.f128865c = z;
        return (bmdt) da.mo74062i();
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return this.f124104b.mo52823a((String) null);
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        ((bkdb) mo65819ar()).mo51905a(i, bundle);
        int size = this.f124110h.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bkdb) this.f124110h.get(i2)).mo51905a(i, bundle);
        }
    }

    /* renamed from: a */
    public final void mo65764a(View view) {
        int size = this.f124114l.size();
        for (int i = 0; i < size; i++) {
            ((bker) this.f124114l.get(i)).mo65764a(view);
        }
    }

    /* renamed from: a */
    public final void mo65785a(bker bker) {
        this.f124114l.add(bker);
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        this.f124104b.mo65794a(charSequence, z);
    }

    /* renamed from: a */
    public final void mo65405a(SmsMessage[] smsMessageArr) {
        m105456a(bjzg.m104967a(smsMessageArr));
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return this.f124104b.mo65795a(obj);
    }
}
