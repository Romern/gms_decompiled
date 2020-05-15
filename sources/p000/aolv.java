package p000;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;
import com.google.android.gms.plus.sharebox.MentionSpan;

/* renamed from: aolv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aolv extends Fragment implements View.OnClickListener, TextView.OnEditorActionListener {

    /* renamed from: a */
    public boolean f78424a;

    /* renamed from: b */
    public boolean f78425b;

    /* renamed from: c */
    public aolu f78426c;

    /* renamed from: d */
    public View f78427d;

    /* renamed from: e */
    public ScrollView f78428e;

    /* renamed from: f */
    public MentionMultiAutoCompleteTextView f78429f;

    /* renamed from: g */
    private boolean f78430g;

    /* renamed from: h */
    private Button f78431h;

    /* renamed from: a */
    public final void mo42981a(boolean z) {
        this.f78431h.setEnabled(z);
    }

    /* renamed from: b */
    public final void mo42983b() {
        this.f78429f.mo46783a(getLoaderManager(), this.f78426c.mo42972b().f78440f, this.f78426c.mo42973d().mo43050b(), this.f78426c.mo42973d().mo43052d() ? this.f78426c.mo42973d().f78541m : "80", this.f78426c.getCallingPackage(), this.f78426c.mo42971a());
        if (!this.f78430g) {
            this.f78426c.mo42972b().mo42989a(riv.f43108b);
            this.f78430g = true;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!TextUtils.isEmpty(this.f78426c.mo42973d().f78536h)) {
            this.f78429f.setHint(this.f78426c.mo42973d().f78536h);
        }
        if (bundle == null && this.f78426c.mo42973d().f78546r != null) {
            String str = this.f78426c.mo42973d().f78546r.f30295e;
            if (!TextUtils.isEmpty(str)) {
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) "+").append((CharSequence) this.f78426c.mo42973d().f78546r.f30296f).append((CharSequence) " ");
                append.setSpan(new MentionSpan(str), 0, append.length() - 1, 33);
                this.f78429f.setText(append);
                this.f78429f.requestFocus();
                MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.f78429f;
                mentionMultiAutoCompleteTextView.setSelection(mentionMultiAutoCompleteTextView.getText().length());
            }
        }
        if (!TextUtils.isEmpty(this.f78429f.getText())) {
            MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView2 = this.f78429f;
            mentionMultiAutoCompleteTextView2.setSelection(mentionMultiAutoCompleteTextView2.getText().length());
        }
        this.f78426c.mo42979f();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof aolu)) {
            String valueOf = String.valueOf(aolu.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.f78426c = (aolu) activity;
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.reply_button) {
            mo42981a(false);
            this.f78426c.mo42980g();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f78430g = bundle.getBoolean("logged_expand_replybox", false);
            this.f78424a = bundle.getBoolean("logged_comment_added", false);
            this.f78425b = bundle.getBoolean("user_edited", false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.plus_replybox_fragment, viewGroup, false);
        this.f78427d = inflate;
        this.f78428e = (ScrollView) inflate.findViewById(C0126R.C0129id.mention_scroll_view);
        Button button = (Button) this.f78427d.findViewById(C0126R.C0129id.reply_button);
        this.f78431h = button;
        button.setOnClickListener(this);
        Button button2 = this.f78431h;
        if (bundle != null && bundle.getBoolean("button_enabled")) {
            z = true;
        }
        button2.setEnabled(z);
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = (MentionMultiAutoCompleteTextView) this.f78427d.findViewById(C0126R.C0129id.compose_text);
        this.f78429f = mentionMultiAutoCompleteTextView;
        mentionMultiAutoCompleteTextView.addTextChangedListener(new aolt(this, getResources()));
        this.f78429f.setOnEditorActionListener(this);
        return this.f78427d;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() != C0126R.C0129id.compose_text || i != 6) {
            return false;
        }
        ssc.m36197a(getActivity(), textView);
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("logged_expand_replybox", this.f78430g);
        bundle.putBoolean("logged_comment_added", this.f78424a);
        bundle.putBoolean("user_edited", this.f78425b);
        bundle.putBoolean("button_enabled", this.f78431h.isEnabled());
    }

    public final void onStart() {
        super.onStart();
        if (this.f78426c.mo42972b().f78438d) {
            mo42983b();
        }
    }

    /* renamed from: a */
    public final boolean mo42982a() {
        return !TextUtils.isEmpty(this.f78429f.getText());
    }
}
