package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormSpinner;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bkew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkew extends LinearLayout implements AdapterView.OnItemSelectedListener, TextWatcher, View.OnFocusChangeListener, bkdf, bjwg {

    /* renamed from: a */
    public bmdu f124116a;

    /* renamed from: b */
    public final FormSpinner f124117b;

    /* renamed from: c */
    public final FormEditText f124118c;

    /* renamed from: d */
    public int f124119d;

    /* renamed from: e */
    public int f124120e = -1;

    /* renamed from: f */
    String f124121f = "";

    /* renamed from: g */
    public String f124122g;

    /* renamed from: h */
    public View f124123h;

    public bkew(Context context) {
        super(context);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.layout_phone_form, this);
        this.f124117b = (FormSpinner) findViewById(C0126R.C0129id.calling_code_spinner);
        FormEditText formEditText = (FormEditText) findViewById(C0126R.C0129id.phone_number_text);
        this.f124118c = formEditText;
        formEditText.setInputType(3);
        int i = Build.VERSION.SDK_INT;
        this.f124118c.setTextDirection(3);
        this.f124118c.setOnFocusChangeListener(this);
        Drawable mutate = this.f124118c.getBackground().mutate();
        int i2 = Build.VERSION.SDK_INT;
        C1280ps.m19890a(this.f124118c, (Drawable) null);
        C1173lt.m19601a(mutate, bkfr.m105588b(getContext()));
        C1280ps.m19890a(this, mutate);
    }

    /* renamed from: a */
    public static final String m105478a(String str, String str2) {
        return String.format(Locale.US, "+%s %s", str, str2);
    }

    /* renamed from: b */
    private final int m105479b(String str) {
        int count = this.f124117b.getCount();
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (int i2 = 0; i2 < count; i2++) {
            String str2 = ((bkbx) this.f124117b.getItemAtPosition(i2)).f123970d;
            if (str.startsWith(str2)) {
                if (i < str2.length()) {
                    i = str2.length();
                    arrayList.clear();
                    arrayList.add(Integer.valueOf(i2));
                } else if (i == str2.length()) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
        }
        return mo65920a(arrayList);
    }

    /* renamed from: c */
    private static int m105481c(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return min;
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    public final void afterTextChanged(Editable editable) {
        this.f124117b.setVisibility(!mo65924g() ? 8 : 0);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return this.f124118c.mo65798cL();
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        return this.f124118c.mo65799cM();
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        return this.f124118c.mo65800cN();
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f124118c;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        return null;
    }

    /* renamed from: g */
    public final boolean mo65924g() {
        return mo65925h() && (!TextUtils.isEmpty(this.f124118c.getText()) || this.f124118c.hasFocus());
    }

    public final CharSequence getError() {
        return this.f124118c.getError();
    }

    /* renamed from: h */
    public final boolean mo65925h() {
        bmdu bmdu = this.f124116a;
        return bmdu != null && bmdu.f128872e.size() > 0 && this.f124116a.f128872e.size() == this.f124116a.f128873f.size();
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        FormEditText formEditText = this.f124118c;
        if (formEditText == null || !formEditText.isFocused()) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int length = onCreateDrawableState.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842908) {
                return onCreateDrawableState;
            }
            if (i3 == -16842908) {
                onCreateDrawableState[i2] = 16842908;
                return onCreateDrawableState;
            } else if (i3 != 0) {
                i2++;
            } else {
                onCreateDrawableState[i2] = 16842908;
                return onCreateDrawableState;
            }
        }
        return onCreateDrawableState;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.view.View, boolean):void
     arg types: [com.google.android.wallet.ui.common.FormSpinner, int]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.view.View, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.b(android.view.View, boolean):void
     arg types: [com.google.android.wallet.ui.common.FormSpinner, int]
     candidates:
      bkfr.b(android.content.Context, java.lang.String):int
      bkfr.b(android.content.Context, int):android.graphics.drawable.Drawable
      bkfr.b(java.lang.String, java.lang.String):java.lang.String
      bkfr.b(android.content.Context, android.view.View):void
      bkfr.b(android.view.View, int):void
      bkfr.b(android.widget.TextView, java.lang.String):void
      bkfr.b(boolean, java.lang.Object):void
      bkfr.b(android.view.View, boolean):void */
    public final void onFocusChange(View view, boolean z) {
        int i;
        String obj = this.f124118c.getText().toString();
        if (!z && !TextUtils.isEmpty(obj)) {
            if (mo65925h() && m105479b(obj) == -1 && this.f124120e != (i = this.f124119d)) {
                this.f124120e = i;
                this.f124117b.mo71972b(i);
            }
            String str = this.f124116a.f128874g;
            if (TextUtils.isEmpty(str)) {
                str = Locale.getDefault().getCountry();
            }
            String a = bkfr.m105557a(obj, str);
            if (a != null) {
                this.f124118c.setText(a);
            }
        }
        if (mo65924g()) {
            bkfr.m105568a((View) this.f124117b, true);
        } else {
            bkfr.m105595b((View) this.f124117b, false);
        }
        refreshDrawableState();
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
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f124120e != i) {
            String obj = this.f124118c.getText().toString();
            int selectionStart = this.f124118c.getSelectionStart();
            int selectionEnd = this.f124118c.getSelectionEnd();
            String str = "";
            if (this.f124121f.length() <= 0) {
                int i2 = this.f124120e;
                if (i2 != -1) {
                    str = ((bkbx) this.f124117b.getItemAtPosition(i2)).f123970d;
                }
            } else {
                String str2 = this.f124121f;
                this.f124121f = str;
                str = str2;
            }
            String b = m105480b(str, obj);
            int length = obj.length() - b.length();
            int max = Math.max(0, selectionStart - length);
            int max2 = Math.max(0, selectionEnd - length);
            this.f124120e = i;
            String a = m105478a(((bkbx) this.f124117b.getItemAtPosition(i)).f123967a, b);
            int length2 = a.length() - b.length();
            this.f124118c.mo71832a((CharSequence) a, 2);
            this.f124118c.setSelection(max + length2, max2 + length2);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        int b = m105479b(charSequence2);
        if (b != -1) {
            this.f124121f = "";
        } else {
            if (this.f124120e != -1 && this.f124121f.length() == 0) {
                this.f124121f = ((bkbx) this.f124117b.getItemAtPosition(this.f124120e)).f123970d;
            }
            String str = this.f124121f;
            this.f124121f = str.substring(0, m105481c(str, charSequence2));
            b = i3 == 0 ? this.f124120e : this.f124119d;
        }
        if (b != this.f124120e) {
            this.f124120e = b;
            this.f124117b.mo71972b(b);
        }
    }

    public final void setEnabled(boolean z) {
        bmdu bmdu = this.f124116a;
        if (bmdu != null) {
            z = z && !bmdu.f128875h;
        }
        super.setEnabled(z);
        this.f124118c.setEnabled(z);
        this.f124117b.setEnabled(z);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f124123h;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final int mo65920a(ArrayList arrayList) {
        if (arrayList.size() == 1) {
            return ((Integer) arrayList.get(0)).intValue();
        }
        if (arrayList.size() <= 1) {
            return -1;
        }
        if (!arrayList.contains(Integer.valueOf(this.f124120e))) {
            return !arrayList.contains(Integer.valueOf(this.f124119d)) ? ((Integer) arrayList.get(0)).intValue() : this.f124119d;
        }
        return this.f124120e;
    }

    /* renamed from: c */
    private static String m105482c(String str) {
        return str.replaceAll("[^\\+\\d]", "");
    }

    /* renamed from: c */
    public final bmdw mo65923c() {
        bxvd da = bmdw.f128877h.mo74144da();
        String obj = this.f124118c.getText().toString();
        if (!TextUtils.isEmpty(this.f124122g) && TextUtils.equals(m105482c(this.f124122g), m105482c(obj))) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdw bmdw = (bmdw) da.f164949b;
            bmdw.f128885g = 1;
            bmdw.f128879a |= 32;
        }
        if (mo65925h()) {
            bkbx bkbx = (bkbx) this.f124117b.getItemAtPosition(this.f124120e);
            if (bkbx == null) {
                bkbx = (bkbx) this.f124117b.getItemAtPosition(this.f124119d);
            }
            String str = bkbx.f123967a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdw bmdw2 = (bmdw) da.f164949b;
            str.getClass();
            bmdw2.f128879a |= 8;
            bmdw2.f128883e = str;
            String b = m105480b(bkbx.f123970d, obj);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdw bmdw3 = (bmdw) da.f164949b;
            b.getClass();
            bmdw3.f128879a |= 16;
            bmdw3.f128884f = b;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdw bmdw4 = (bmdw) da.f164949b;
            obj.getClass();
            bmdw4.f128879a |= 16;
            bmdw4.f128884f = obj;
        }
        bmdn bmdn = this.f124116a.f128869b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        bxtx bxtx = bmdn.f128836d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdw bmdw5 = (bmdw) da.f164949b;
        bxtx.getClass();
        bmdw5.f128879a |= 4;
        bmdw5.f128882d = bxtx;
        bmdn bmdn2 = this.f124116a.f128869b;
        if (bmdn2 == null) {
            bmdn2 = bmdn.f128831k;
        }
        String str2 = bmdn2.f128834b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdw bmdw6 = (bmdw) da.f164949b;
        str2.getClass();
        bmdw6.f128879a = 1 | bmdw6.f128879a;
        bmdw6.f128880b = str2;
        bmdn bmdn3 = this.f124116a.f128869b;
        if (bmdn3 == null) {
            bmdn3 = bmdn.f128831k;
        }
        long j = bmdn3.f128835c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdw bmdw7 = (bmdw) da.f164949b;
        bmdw7.f128879a |= 2;
        bmdw7.f128881c = j;
        return (bmdw) da.mo74062i();
    }

    /* renamed from: b */
    private static String m105480b(String str, String str2) {
        int c = m105481c(str, str2);
        int length = str2.length();
        while (c < length && Character.isWhitespace(str2.charAt(c))) {
            c++;
        }
        return str2.substring(c);
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return this.f124118c.mo52823a(str);
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        this.f124118c.mo65794a(charSequence, z);
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        String str;
        int i = 0;
        if (obj instanceof bmdu) {
            bmdu bmdu = (bmdu) obj;
            String str2 = "";
            if ((bmdu.f128868a & 4) != 0) {
                bmdw bmdw = bmdu.f128871d;
                if (bmdw == null) {
                    bmdw = bmdw.f128877h;
                }
                str2 = bmdw.f128883e;
                bmdw bmdw2 = bmdu.f128871d;
                if (bmdw2 == null) {
                    bmdw2 = bmdw.f128877h;
                }
                str = bmdw2.f128884f;
            } else {
                str = str2;
            }
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str) && !bmdu.f128874g.isEmpty()) {
                int size = bmdu.f128872e.size();
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((String) bmdu.f128872e.get(i)).equals(bmdu.f128874g)) {
                        str2 = (String) bmdu.f128873f.get(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            bmdw c = mo65923c();
            return m105478a(str2, str).equals(m105478a(c.f128883e, c.f128884f));
        } else if (obj != null) {
            return false;
        } else {
            return TextUtils.isEmpty(this.f124118c.getText());
        }
    }
}
