package com.google.android.gms.plus.sharebox;

import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.MultiAutoCompleteTextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MentionMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* renamed from: a */
    private aoln f83448a;

    /* renamed from: b */
    private anqg f83449b;

    public MentionMultiAutoCompleteTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static final CharSequence m69352a(String str, String str2) {
        String valueOf = String.valueOf(str);
        SpannableString spannableString = new SpannableString(valueOf.length() == 0 ? new String("+") : "+".concat(valueOf));
        if (!TextUtils.isEmpty(str2)) {
            spannableString.setSpan(new MentionSpan(str2), 0, spannableString.length(), 33);
        }
        return spannableString;
    }

    /* renamed from: b */
    public final int mo46786b() {
        Layout layout = getLayout();
        if (layout != null) {
            return layout.getLineBaseline(layout.getLineForOffset(getSelectionEnd()));
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo46787c() {
        Layout layout = getLayout();
        if (layout != null) {
            return layout.getLineTop(layout.getLineForOffset(getSelectionEnd()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final CharSequence convertSelectionToString(Object obj) {
        try {
            if (obj instanceof amfa) {
                amfa amfa = (amfa) obj;
                return m69352a(amfa.mo25474c(), amfa.mo25472a());
            }
            if (obj instanceof AudienceMember) {
                AudienceMember audienceMember = (AudienceMember) obj;
                if (audienceMember.mo17847c()) {
                    return m69352a(audienceMember.f30296f, audienceMember.f30295e);
                }
            }
            return super.convertSelectionToString(obj);
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aoln aoln = this.f83448a;
        if (aoln != null) {
            aoln.mo42066e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aoln aoln = this.f83448a;
        if (aoln != null) {
            aoln.mo42067f();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        Editable editableText = getEditableText();
        URLSpan[] uRLSpanArr = (URLSpan[]) editableText.getSpans(0, editableText.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            if (MentionSpan.m69359a(uRLSpan)) {
                MentionSpan mentionSpan = new MentionSpan(uRLSpan);
                int spanStart = editableText.getSpanStart(uRLSpan);
                int spanEnd = editableText.getSpanEnd(uRLSpan);
                int spanFlags = editableText.getSpanFlags(uRLSpan);
                editableText.removeSpan(uRLSpan);
                editableText.setSpan(mentionSpan, spanStart, spanEnd, spanFlags);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void replaceText(CharSequence charSequence) {
        ArrayList a = mo46782a();
        super.replaceText(charSequence);
        mo46784a(a, mo46782a());
        mo46785a(false);
    }

    public MentionMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final ArrayList mo46782a() {
        Editable text = getText();
        int length = text.length();
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, text.length(), MentionSpan.class);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int length2 = mentionSpanArr.length;
        for (int i = 0; i < length2; i++) {
            String substring = mentionSpanArr[i].getURL().substring(1);
            if (!hashSet.contains(substring)) {
                hashSet.add(substring);
                String charSequence = text.subSequence(text.getSpanStart(mentionSpanArr[i]), Math.min(length, text.getSpanEnd(mentionSpanArr[i]) + 1)).toString();
                boolean startsWith = charSequence.startsWith("+");
                if (startsWith) {
                    charSequence = charSequence.substring(1);
                }
                AudienceMember b = AudienceMember.m22641b(substring, charSequence, null);
                b.f30298h.putBoolean("checkboxEnabled", !startsWith);
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public MentionMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo46783a(LoaderManager loaderManager, String str, String str2, String str3, String str4, anqg anqg) {
        this.f83449b = anqg;
        aoln aoln = new aoln(getContext(), loaderManager, str, str2, str3, str4, this.f83449b);
        this.f83448a = aoln;
        setAdapter(aoln);
        setTokenizer(new aolp());
        setThreshold(3);
        this.f83448a.mo42066e();
        addTextChangedListener(new aolo(this));
        mo46785a(false);
    }

    /* renamed from: a */
    public final void mo46784a(ArrayList arrayList, ArrayList arrayList2) {
        anqg anqg = this.f83449b;
        if (anqg != null) {
            Audience audience = anqg.f77451a;
            LinkedHashSet linkedHashSet = new LinkedHashSet(audience.f30287b);
            linkedHashSet.addAll(arrayList2);
            sfd sfd = new sfd(audience);
            sfd.mo25467a(linkedHashSet);
            anqg.mo42124a(sfd.mo25465a(), this);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AudienceMember audienceMember = (AudienceMember) arrayList.get(i);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (audienceMember.equals(arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    } else {
                        anqg anqg2 = this.f83449b;
                        anqg2.mo42124a(sfi.m35165b(anqg2.f77451a, audienceMember), this);
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46785a(boolean z) {
        stf stf;
        int inputType = getInputType();
        Context context = getContext();
        if (stf.f45126a == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            int i3 = 0;
            if (!(i == 0 || i2 == 0 || displayMetrics.density == 0.0f)) {
                float f = displayMetrics.density;
                float f2 = ((float) i2) / displayMetrics.density;
                if (((float) i) / f >= 550.0f && f2 >= 550.0f) {
                    i3 = 1;
                }
            }
            context.getResources().getDimension(C0126R.dimen.common_screen_metrics_margin_percentage);
            Math.min(i, i2);
            Math.min(i2, i);
            Math.max(i2, i);
            stf.f45126a = new stf(i3);
            stf = stf.f45126a;
        } else {
            stf = stf.f45126a;
        }
        int i4 = (getResources().getConfiguration().orientation == 1 || stf.f45127b == 1 || !z) ? -65537 & inputType : 65536 | inputType;
        if (inputType != i4) {
            setRawInputType(i4);
            InputMethodManager a = ssc.m36196a(getContext());
            if (a != null) {
                a.restartInput(this);
            }
        }
    }
}
