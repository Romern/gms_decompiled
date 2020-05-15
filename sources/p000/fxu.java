package p000;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.List;

/* renamed from: fxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxu extends fxg {

    /* renamed from: e */
    public final fxv f17546e;

    /* renamed from: f */
    private final int f17547f;

    /* renamed from: g */
    private CharSequence f17548g;

    /* renamed from: h */
    private CharSequence f17549h;

    /* renamed from: i */
    private final boolean f17550i;

    /* renamed from: j */
    private final allg f17551j;

    /* renamed from: k */
    private final View.OnClickListener f17552k = new fxp(this);

    /* renamed from: l */
    private final View.OnClickListener f17553l = new fxq(this);

    /* renamed from: m */
    private final View.OnClickListener f17554m = new fxr(this);

    /* renamed from: n */
    private EditText f17555n;

    /* renamed from: o */
    private final Object[] f17556o;

    /* renamed from: p */
    private boolean f17557p;

    /* renamed from: q */
    private boolean f17558q;

    /* renamed from: r */
    private boolean f17559r;

    /* renamed from: s */
    private final boolean f17560s;

    /* renamed from: t */
    private boolean f17561t;

    public fxu(fxv fxv, int i, String str, CharSequence charSequence, boolean z, boolean z2) {
        this.f17546e = fxv;
        this.f17547f = i;
        this.f17548g = charSequence;
        this.f17550i = z;
        this.f17560s = z2;
        allf allf = new allf();
        allf.f73618a = 1;
        allf.mo40485b();
        this.f17551j = allf.mo40484a();
        this.f17556o = new Object[]{str};
    }

    /* renamed from: a */
    private final void m12678a(TextView textView) {
        if (this.f17550i && !((fxg) this).f17497a) {
            Resources resources = textView.getResources();
            textView.setText(resources.getString(C0126R.string.appinvite_contextual_selection_number_of_recipients, Integer.valueOf(this.f17546e.mo11439c()), Integer.valueOf(((fwo) this.f17546e).f17465d)));
            textView.setContentDescription(resources.getString(C0126R.string.f7382x4a83cfb6, Integer.valueOf(this.f17546e.mo11439c()), Integer.valueOf(((fwo) this.f17546e).f17465d)));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        if (i == 0) {
            return 0;
        }
        if (((fxg) this).f17497a) {
            return 2;
        }
        if (!this.f17557p) {
            return 1;
        }
        int i2 = i - 1;
        List b = this.f17546e.mo11435b();
        if (i2 < b.size()) {
            return (long) ((ContactPerson) b.get(i2)).hashCode();
        }
        return 2;
    }

    /* renamed from: b */
    public final void mo11458b(ContactPerson contactPerson) {
        int indexOf;
        if (this.f17557p && !((fxg) this).f17497a && (indexOf = this.f17546e.mo11435b().indexOf(contactPerson)) >= 0) {
            mo158M(indexOf + 1);
        }
    }

    /* renamed from: c */
    public final void mo11462c(CharSequence charSequence) {
        CharSequence charSequence2;
        if (!sdg.m34949a(charSequence, this.f17549h)) {
            this.f17549h = charSequence;
            EditText editText = this.f17555n;
            if (editText != null && ((fxg) this).f17497a) {
                if (TextUtils.isEmpty(this.f17549h)) {
                    charSequence2 = this.f17548g;
                } else {
                    charSequence2 = this.f17549h;
                }
                editText.setHint(charSequence2);
            }
        }
    }

    /* renamed from: c */
    public final void mo11463c(boolean z) {
        this.f17558q = z;
    }

    /* renamed from: d */
    public final void mo11464d() {
        EditText editText = this.f17555n;
        if (editText == null) {
            return;
        }
        if (!editText.isShown() || this.f17555n.getParent() == null) {
            this.f17561t = true;
        } else {
            mo11496g();
        }
    }

    /* renamed from: e */
    public final CharSequence mo11466e() {
        EditText editText = this.f17555n;
        if (editText == null || !editText.isShown() || this.f17555n.getParent() == null) {
            return null;
        }
        return this.f17555n.getText();
    }

    /* renamed from: e */
    public final void mo11467e(boolean z) {
        this.f17559r = z;
    }

    /* renamed from: f */
    public final int mo11468f() {
        int length = this.f17556o.length;
        return 1;
    }

    /* renamed from: g */
    public final int mo11471g(int i) {
        return this.f17547f;
    }

    public final int getPositionForSection(int i) {
        return 0;
    }

    public final int getSectionForPosition(int i) {
        return 0;
    }

    public final Object[] getSections() {
        return this.f17556o;
    }

    /* renamed from: g */
    public final void mo11496g() {
        if (this.f17555n.isShown() && this.f17555n.getParent() != null) {
            this.f17555n.requestFocus();
            ssc.m36198b(this.f17555n.getContext(), this.f17555n);
        }
    }

    /* renamed from: b */
    public final void mo11459b(CharSequence charSequence) {
        if (!sdg.m34949a(charSequence, this.f17548g)) {
            this.f17548g = charSequence;
            EditText editText = this.f17555n;
            if (editText != null && !((fxg) this).f17497a) {
                editText.setHint(charSequence);
            }
            if (!this.f17557p && this.f17546e.mo11439c() == 0) {
                mo158M(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo11472g(boolean z) {
        if (z) {
            mo158M(this.f17546e.mo11439c() + 1);
            if (this.f17546e.mo11439c() > 0) {
                mo178d(1, this.f17546e.mo11439c() + 1);
                return;
            }
            return;
        }
        mo158M(1);
        if (this.f17546e.mo11439c() > 0) {
            mo177c(1, this.f17546e.mo11439c() + 1);
        }
    }

    /* renamed from: b */
    public final void mo11460b(boolean z) {
        EditText editText;
        if (z != this.f17557p) {
            mo11457a((CharSequence) null);
            this.f17557p = z;
            if (!z && (editText = this.f17555n) != null) {
                editText.clearFocus();
                ssc.m36197a(this.f17555n.getContext(), this.f17555n);
            }
            mo171aJ();
        }
    }

    /* renamed from: a */
    public final int mo161a() {
        if (!this.f17557p || ((fxg) this).f17497a) {
            return 2;
        }
        return this.f17546e.mo11439c() + 2;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        if (i == 0) {
            return C0126R.C0128layout.appinvite_anchor;
        }
        if (((fxg) this).f17497a) {
            return !this.f17560s ? C0126R.C0128layout.appinvite_contextual_selection_search : C0126R.C0128layout.appinvite_contextual_selection_search_docked;
        }
        if (!this.f17557p) {
            return C0126R.C0128layout.appinvite_contextual_selection_recipients;
        }
        if (i - 1 >= this.f17546e.mo11439c()) {
            return !this.f17560s ? C0126R.C0128layout.appinvite_contextual_selection_search : C0126R.C0128layout.appinvite_contextual_selection_search_docked;
        }
        return C0126R.C0128layout.appinvite_contextual_selection_chip;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (i == C0126R.C0128layout.appinvite_contextual_selection_recipients) {
            return new fyp(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_contextual_selection_chip) {
            return new fyl(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_contextual_selection_search || i == C0126R.C0128layout.appinvite_contextual_selection_search_docked) {
            return new fyo(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_anchor) {
            return new acm(inflate);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [fxv, android.view.View$OnFocusChangeListener, android.widget.TextView$OnEditorActionListener], assign insn: 0x016b: IGET  (r6v3 ? I:fxv) = (r0v0 'this' fxu A[THIS]) fxu.e fxv */
    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        CharSequence charSequence;
        if (i > 0) {
            int i2 = 0;
            if (!this.f17557p) {
                fyp fyp = (fyp) acm;
                String string = fyp.f201a.getResources().getString(C0126R.string.appinvite_contextual_selection_recipient_separator);
                List b = this.f17546e.mo11435b();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= b.size()) {
                        break;
                    }
                    ContactPerson contactPerson = (ContactPerson) b.get(i3);
                    if (i4 >= 5) {
                        String format = String.format(fyp.f201a.getResources().getString(C0126R.string.appinvite_contextual_selection_additional_recipient_format), Integer.valueOf(b.size() - i4));
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(fyp.f201a.getResources().getColor(C0126R.color.material_google_blue_500)), spannableStringBuilder.length(), spannableStringBuilder.length(), 18);
                        spannableStringBuilder.append((CharSequence) format);
                        break;
                    }
                    if (i4 > 0) {
                        spannableStringBuilder.append((CharSequence) string);
                    }
                    String a = fzm.m12789a(fyp.f201a.getContext(), contactPerson);
                    if (a != null) {
                        spannableStringBuilder.append((CharSequence) a);
                    }
                    i4++;
                    i3++;
                }
                TextView textView = fyp.f17646s;
                if (i4 == 0) {
                    textView.setText(this.f17548g);
                    textView.setTextColor(textView.getResources().getColor(C0126R.color.appinvite_medium_black));
                } else {
                    textView.setText(spannableStringBuilder);
                    textView.setTextColor(textView.getResources().getColor(C0126R.color.appinvite_dark_black));
                }
                m12678a(fyp.f17647t);
                fyp.f201a.setOnClickListener(new fxt(this));
                return;
            }
            int i5 = i - 1;
            if (!((fxg) this).f17497a && i5 < this.f17546e.mo11439c()) {
                fyl fyl = (fyl) acm;
                ContactPerson contactPerson2 = (ContactPerson) this.f17546e.mo11435b().get(i5);
                fwo fwo = (fwo) this.f17546e;
                fxj.m12624a(fwo.f17463b, this.f17551j, fyl, contactPerson2, false, false, this.f17558q, true, this.f17559r, fwo.f17470i, fwo.f17471j, this.f17498d);
                View view = fyl.f201a;
                view.setOnClickListener(this.f17553l);
                if (i5 == 0) {
                    i2 = view.getResources().getDimensionPixelSize(C0126R.dimen.appinvite_chip_spacing);
                }
                int i6 = Build.VERSION.SDK_INT;
                view.setPaddingRelative(view.getPaddingStart(), i2, view.getPaddingEnd(), view.getPaddingBottom());
                View view2 = fyl.f17622s;
                view2.setOnClickListener(this.f17552k);
                view2.setTag(C0126R.C0129id.appinvite_chip_view_holder_tag_person, contactPerson2);
                return;
            }
            fyo fyo = (fyo) acm;
            m12678a(fyo.f17644u);
            this.f17555n = fyo.f17642s;
            TextView textView2 = fyo.f17643t;
            ImageView imageView = fyo.f17645v;
            if (((fxg) this).f17497a) {
                this.f17555n.setVisibility(0);
                EditText editText = this.f17555n;
                if (TextUtils.isEmpty(this.f17549h)) {
                    charSequence = this.f17548g;
                } else {
                    charSequence = this.f17549h;
                }
                editText.setHint(charSequence);
                ? r6 = this.f17546e;
                AutoCompleteTextView autoCompleteTextView = fyo.f17642s;
                fwo fwo2 = (fwo) r6;
                if (fwo2.f17448F == null) {
                    fwo2.f17448F = new fwg(fwo2);
                }
                fwo2.f17447E.f17427u = autoCompleteTextView.getThreshold();
                autoCompleteTextView.setAdapter(fwo2.f17447E);
                autoCompleteTextView.setOnEditorActionListener(r6);
                autoCompleteTextView.setOnFocusChangeListener(r6);
                autoCompleteTextView.setOnItemClickListener(fwo2.f17448F);
                textView2.setVisibility(4);
                fyo.f201a.setContentDescription(null);
                imageView.setVisibility(0);
                imageView.setOnClickListener(this.f17554m);
                Resources resources = fyo.f201a.getResources();
                Drawable mutate = resources.getDrawable(C0126R.C0127drawable.quantum_ic_close_white_24).mutate();
                mutate.setColorFilter(resources.getColor(C0126R.color.appinvite_dark_black), PorterDuff.Mode.MULTIPLY);
                imageView.setImageDrawable(mutate);
                if (this.f17561t) {
                    this.f17561t = false;
                    this.f17555n.post(new fxs(this));
                    return;
                }
                return;
            }
            this.f17555n.setVisibility(4);
            textView2.setVisibility(0);
            textView2.setText(this.f17548g);
            fyo.f201a.setOnClickListener(this.f17553l);
            fyo.f201a.setContentDescription(this.f17548g);
            imageView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo11455a(ContactPerson contactPerson) {
        if (!this.f17557p || ((fxg) this).f17497a) {
            mo158M(1);
            return;
        }
        mo159N(this.f17546e.mo11439c());
        mo158M(this.f17546e.mo11439c() + 1);
    }

    /* renamed from: a */
    public final void mo11456a(ContactPerson contactPerson, int i) {
        if (this.f17557p && !((fxg) this).f17497a) {
            mo171aJ();
        } else {
            mo158M(1);
        }
    }

    /* renamed from: a */
    public final void mo11457a(CharSequence charSequence) {
        EditText editText = this.f17555n;
        if (editText != null) {
            editText.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f17555n.setSelection(charSequence.length());
            }
        }
    }
}
