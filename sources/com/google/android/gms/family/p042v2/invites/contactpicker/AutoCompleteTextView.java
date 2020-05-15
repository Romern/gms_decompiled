package com.google.android.gms.family.p042v2.invites.contactpicker;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;
import com.google.android.gms.family.p042v2.model.ContactPerson;

/* renamed from: com.google.android.gms.family.v2.invites.contactpicker.AutoCompleteTextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoCompleteTextView extends C1500xw implements AdapterView.OnItemClickListener, TextWatcher {

    /* renamed from: a */
    public wnk f31400a;

    /* renamed from: b */
    public String f31401b = "";

    /* renamed from: c */
    private boolean f31402c = false;

    public AutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        addTextChangedListener(this);
        setThreshold(1);
        setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.f31402c && !isPerformingCompletion()) {
            String obj = editable.toString();
            if (obj.contains(",") || obj.contains("\n")) {
                String replace = obj.replace("\n", "");
                if (replace.contains(",")) {
                    replace = replace.substring(0, replace.indexOf(","));
                }
                ContactPerson.ContactMethod a = m23265a(replace.trim());
                this.f31402c = true;
                if (a == null) {
                    setText(replace);
                    setSelection(replace.length());
                    Toast.makeText(getContext(), this.f31401b, 1).show();
                } else {
                    setText("");
                    mo18488a(a);
                }
                this.f31402c = false;
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Pair pair = (Pair) adapterView.getItemAtPosition(i);
        ContactPerson contactPerson = (ContactPerson) pair.first;
        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) pair.second;
        if (!this.f31400a.mo29229e(contactPerson, contactMethod)) {
            this.f31400a.mo29224b(contactPerson, contactMethod);
            setText("");
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: a */
    public static ContactPerson.ContactMethod m23265a(String str) {
        if (PhoneNumberUtils.isGlobalPhoneNumber(str)) {
            return new ContactPerson.ContactMethod(1, PhoneNumberUtils.formatNumber(str));
        }
        if (TextUtils.isEmpty(str) || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return null;
        }
        return new ContactPerson.ContactMethod(0, str);
    }

    /* renamed from: a */
    public final void mo18488a(ContactPerson.ContactMethod contactMethod) {
        wmx wmx = (wmx) getAdapter();
        if (wmx.getCount() > 0) {
            Pair pair = (Pair) wmx.getItem(0);
            ContactPerson contactPerson = (ContactPerson) pair.first;
            ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) pair.second;
            if (contactMethod.equals(contactMethod2)) {
                if (!this.f31400a.mo29229e(contactPerson, contactMethod2)) {
                    this.f31400a.mo29224b(contactPerson, contactMethod2);
                    return;
                }
                return;
            }
        }
        wnj wnj = (wnj) this.f31400a;
        if (!wnj.f50956c.contains(contactMethod)) {
            wnj.mo29228d(wnj.m42061a(contactMethod), contactMethod);
        }
    }
}
