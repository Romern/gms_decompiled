package com.google.android.gms.family.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DateSpinner extends LinearLayout {

    /* renamed from: a */
    public String f31477a;

    /* renamed from: b */
    public String f31478b;

    /* renamed from: c */
    public String f31479c;

    /* renamed from: d */
    public wim f31480d;

    public DateSpinner(Context context) {
        super(context);
        m23338c();
    }

    /* renamed from: a */
    public static final void m23337a(Spinner spinner, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (spinner.getSelectedItem() != null) {
            String valueOf = String.valueOf(spinner.getSelectedItem());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(" ");
            sb.append(valueOf);
            spinner.setContentDescription(sb.toString());
            return;
        }
        spinner.setContentDescription(str);
    }

    /* renamed from: c */
    private final void m23338c() {
        inflate(getContext(), C0126R.C0128layout.fm_layout_date_spinner, this);
        Map<String, Integer> displayNames = GregorianCalendar.getInstance().getDisplayNames(2, 1, rpr.m34216b().getResources().getConfiguration().locale);
        HashMap hashMap = new HashMap(displayNames.size());
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (int i = 0; i < hashMap.size(); i++) {
            arrayList.add((String) hashMap.get(Integer.valueOf(i)));
        }
        wrs wrs = new wrs(getContext(), "", arrayList);
        wrs.setDropDownViewResource(C0126R.C0128layout.fm_date_spinner_dropdown);
        Spinner spinner = (Spinner) findViewById(C0126R.C0129id.fm_birthday_month);
        spinner.setAdapter((SpinnerAdapter) wrs);
        spinner.setOnItemSelectedListener(new wrp(this, spinner));
        wrt wrt = new wrt(getContext(), "");
        wrt.f51212c = C0126R.C0128layout.fm_date_spinner_dropdown;
        Spinner spinner2 = (Spinner) findViewById(C0126R.C0129id.fm_birthday_day);
        spinner2.setAdapter((SpinnerAdapter) wrt);
        spinner2.setOnItemSelectedListener(new wrq(this, spinner2));
        EditText editText = (EditText) findViewById(C0126R.C0129id.fm_birthday_year);
        editText.addTextChangedListener(new wrr(this, editText));
    }

    /* renamed from: b */
    public final Calendar mo18572b() {
        Spinner spinner = (Spinner) findViewById(C0126R.C0129id.fm_birthday_month);
        Spinner spinner2 = (Spinner) findViewById(C0126R.C0129id.fm_birthday_day);
        EditText editText = (EditText) findViewById(C0126R.C0129id.fm_birthday_year);
        if (spinner.getSelectedItem() == null || spinner2.getSelectedItem() == null || TextUtils.isEmpty(editText.getText())) {
            return null;
        }
        return new GregorianCalendar(Integer.parseInt(editText.getText().toString()), spinner.getSelectedItemPosition() - 1, ((Integer) spinner2.getSelectedItem()).intValue());
    }

    public DateSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23338c();
    }

    public DateSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23338c();
    }

    /* renamed from: a */
    public final void mo18570a() {
        int i;
        Spinner spinner = (Spinner) findViewById(C0126R.C0129id.fm_birthday_month);
        EditText editText = (EditText) findViewById(C0126R.C0129id.fm_birthday_year);
        Spinner spinner2 = (Spinner) findViewById(C0126R.C0129id.fm_birthday_day);
        if (spinner.getSelectedItem() != null || !TextUtils.isEmpty(editText.getText())) {
            if (!TextUtils.isEmpty(editText.getText())) {
                i = Integer.parseInt(editText.getText().toString());
            } else {
                i = 2016;
            }
            int actualMaximum = new GregorianCalendar(i, spinner.getSelectedItemPosition() - 1, 1).getActualMaximum(5);
            if (spinner2.getSelectedItem() != null && actualMaximum < ((Integer) spinner2.getSelectedItem()).intValue()) {
                spinner2.setSelection(0, true);
            }
            ((wrt) spinner2.getAdapter()).f51211b = actualMaximum;
        }
    }

    /* renamed from: b */
    public final void mo18573b(int i) {
        int i2 = i + 1;
        Spinner spinner = (Spinner) findViewById(C0126R.C0129id.fm_birthday_month);
        if (i2 < spinner.getAdapter().getCount()) {
            spinner.setSelection(i2);
        }
    }

    /* renamed from: a */
    public final void mo18571a(int i) {
        Spinner spinner = (Spinner) findViewById(C0126R.C0129id.fm_birthday_day);
        if (i < spinner.getAdapter().getCount()) {
            spinner.setSelection(i);
        }
    }
}
