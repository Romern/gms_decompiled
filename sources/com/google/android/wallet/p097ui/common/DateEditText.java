package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.wallet.ui.common.DateEditText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DateEditText extends FormEditText implements TextView.OnEditorActionListener, bkhp {

    /* renamed from: a */
    public Pattern f151932a;

    /* renamed from: b */
    public String f151933b;

    /* renamed from: c */
    public String f151934c = "";

    /* renamed from: d */
    public String f151935d = "";

    /* renamed from: e */
    public String f151936e = "";

    /* renamed from: f */
    public boolean f151937f;

    /* renamed from: g */
    public int f151938g;

    /* renamed from: h */
    public int f151939h;

    /* renamed from: i */
    public int f151940i;

    /* renamed from: j */
    public int f151941j;

    /* renamed from: k */
    public int f151942k;

    /* renamed from: l */
    public bjvf f151943l;

    /* renamed from: m */
    public int f151944m;

    /* renamed from: n */
    private final TextWatcher f151945n = new bkck(this);

    public DateEditText(Context context) {
        super(context);
        m118438w();
    }

    /* renamed from: a */
    private static String m118437a(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return "M/d/yyyy";
        }
        if (i2 == 2) {
            return "M/yy";
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append(i2);
        sb.append(" not a supported DateField.type");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: w */
    private final void m118438w() {
        setSingleLine();
        setOnEditorActionListener(this);
        mo71915a(this.f151945n);
        int i = Build.VERSION.SDK_INT;
        setTextDirection(3);
        mo71881a(3, m118437a(3), "/");
    }

    /* renamed from: cO */
    public final boolean mo65775cO() {
        if (getSelectionEnd() != getText().length()) {
            return false;
        }
        int i = this.f151941j - 1;
        if (i == this.f151938g) {
            return bjyx.m104948b(this.f151934c);
        }
        if (i == this.f151939h) {
            return bjyx.m104947a(this.f151935d);
        }
        if (i == this.f151940i && this.f151942k == this.f151936e.length()) {
            return true;
        }
        return false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        if (accessibilityEvent.getEventType() == 8192 && accessibilityEvent.getFromIndex() == (length = getText().length()) && accessibilityEvent.getToIndex() == length) {
            return false;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: g */
    public final int mo66001g() {
        try {
            return Integer.parseInt(this.f151934c);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: h */
    public final int mo66002h() {
        try {
            return Integer.parseInt(this.f151935d);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: i */
    public final int mo66003i() {
        try {
            if (this.f151942k != 4) {
                return Integer.parseInt(this.f151936e) + 2000;
            }
            return Integer.parseInt(this.f151936e);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: j */
    public final String mo71885j() {
        return this.f151943l.mo65562a(this.f151934c, this.f151935d, this.f151936e);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int selectionStart;
        if (i != 5 || (selectionStart = textView.getSelectionStart()) != textView.getSelectionEnd()) {
            return false;
        }
        String obj = getText().toString();
        Matcher matcher = this.f151932a.matcher(obj);
        matcher.region(selectionStart, obj.length());
        if (!matcher.find()) {
            return false;
        }
        setSelection(matcher.end());
        return true;
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 16 || !this.f151937f) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            this.f151937f = false;
        }
    }

    /* renamed from: a */
    public final void mo71880a(int i, int i2, int i3) {
        throw new UnsupportedOperationException("Setting minimum/maximum length is not supported for DateEditText");
    }

    /* renamed from: a */
    public final void mo71881a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "/";
        }
        this.f151933b = str2;
        this.f151932a = Pattern.compile(str2, 16);
        String valueOf = String.valueOf(this.f151933b);
        setKeyListener(new bjzd(valueOf.length() == 0 ? new String("0123456789") : "0123456789".concat(valueOf), 20));
        this.f151944m = i;
        if (TextUtils.isEmpty(str)) {
            str = m118437a(i);
        }
        bjvf bjvf = new bjvf(str, i, this.f151933b);
        this.f151943l = bjvf;
        this.f151938g = bjvf.f123377a;
        this.f151939h = bjvf.f123378b;
        this.f151940i = bjvf.f123379c;
        this.f151942k = bjvf.f123380d;
        this.f151941j = bjvf.f123381e;
    }

    public DateEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118438w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71882a(bmnn bmnn, boolean z) {
        throw new UnsupportedOperationException("Template formatting schemes are not supported for DateEditText");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.DateEditText.a(bmnn, boolean):void
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
    public final void mo71883a(String str, String str2, int i) {
        if (this.f151944m == 3) {
            this.f151935d = str;
            this.f151936e = str2;
            mo71832a((CharSequence) mo71885j(), i);
            return;
        }
        throw new IllegalArgumentException("Only setting the month and year is only supported for DateField.YEAR_MONTH");
    }

    public DateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118438w();
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        if (obj instanceof blxc) {
            blxc blxc = (blxc) obj;
            return this.f151944m == 3 ? blxc.f128041c == mo66002h() && blxc.f128040b == mo66003i() : blxc.f128042d == mo66001g() && blxc.f128041c == mo66002h() && blxc.f128040b == mo66003i();
        }
    }
}
