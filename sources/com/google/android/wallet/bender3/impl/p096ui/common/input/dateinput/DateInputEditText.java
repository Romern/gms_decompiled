package com.google.android.wallet.bender3.impl.p096ui.common.input.dateinput;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.wallet.bender3.impl.ui.common.input.dateinput.DateInputEditText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DateInputEditText extends TextInputEditText {

    /* renamed from: a */
    public List f151782a;

    /* renamed from: b */
    public Pattern f151783b;

    /* renamed from: c */
    public String f151784c;

    /* renamed from: d */
    public String f151785d = "";

    /* renamed from: e */
    public String f151786e = "";

    /* renamed from: f */
    public String f151787f = "";

    /* renamed from: g */
    public bjph f151788g;

    public DateInputEditText(Context context) {
        super(context);
        addTextChangedListener(new bjpg(this));
    }

    public DateInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addTextChangedListener(new bjpg(this));
    }

    public DateInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addTextChangedListener(new bjpg(this));
    }
}
