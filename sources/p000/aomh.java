package p000;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.data.internal.PlusImageView;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;
import java.util.List;

/* renamed from: aomh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aomh extends Fragment implements TextView.OnEditorActionListener, rqn, anqf {

    /* renamed from: a */
    public boolean f78456a;

    /* renamed from: b */
    public boolean f78457b;

    /* renamed from: c */
    public boolean f78458c;

    /* renamed from: d */
    public aomg f78459d;

    /* renamed from: e */
    public aokw f78460e;

    /* renamed from: f */
    public View f78461f;

    /* renamed from: g */
    public ScrollView f78462g;

    /* renamed from: h */
    public Audience f78463h;

    /* renamed from: i */
    public MentionMultiAutoCompleteTextView f78464i;

    /* renamed from: j */
    protected ViewGroup f78465j;

    /* renamed from: k */
    public CheckBox f78466k;

    /* renamed from: l */
    public boolean f78467l;

    /* renamed from: m */
    protected Settings f78468m;

    /* renamed from: n */
    private boolean f78469n;

    /* renamed from: o */
    private boolean f78470o;

    /* renamed from: p */
    private boolean f78471p;

    /* renamed from: q */
    private anpf f78472q;

    /* renamed from: r */
    private AddToCircleData f78473r;

    /* renamed from: s */
    private AudienceView f78474s;

    /* renamed from: t */
    private ImageView f78475t;

    /* renamed from: u */
    private boolean f78476u;

    /* renamed from: v */
    private ansz f78477v;

    /* renamed from: b */
    public final void mo43019b() {
        Settings settings;
        Audience audience;
        if (!this.f78471p && (settings = this.f78468m) != null && (audience = this.f78463h) != null && settings.f82567d) {
            sdo.m34966a(audience, "Audience must not be null.");
            List list = audience.f30287b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((AudienceMember) list.get(i)).f30293c;
                if (i2 == 1 || i2 == 4) {
                    this.f78459d.mo43012o();
                    this.f78471p = true;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo43020c() {
        boolean z;
        if (this.f78459d.mo42999g().f78516n == null) {
            return false;
        }
        if ((!this.f78459d.mo43003j().mo43054f() || !this.f78459d.mo43003j().f78543o.mo43070b()) && !this.f78459d.mo43003j().mo43053e()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = this.f78459d.mo43003j().mo43054f() && this.f78459d.mo43003j().f78543o.mo43072d();
        int length = this.f78464i.getText().length();
        if (z || z2 || length > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo43021d() {
        aokw aokw = this.f78460e;
        if (aokw != null && aokw.isVisible()) {
            getChildFragmentManager().beginTransaction().hide(this.f78460e).commitAllowingStateLoss();
        }
    }

    /* renamed from: e */
    public final void mo43022e() {
        aokw aokw = this.f78460e;
        if (aokw != null) {
            Spinner spinner = aokw.f78377h;
            int i = aokw.f78371b;
            if (i < 0) {
                i = 0;
            }
            spinner.setSelection(i);
        }
    }

    /* renamed from: f */
    public final boolean mo43023f() {
        aokw aokw = this.f78460e;
        if (aokw != null && aokw.isVisible()) {
            aokw aokw2 = this.f78460e;
            if (!aokw2.f78374e.isChecked() || !aokw2.f78374e.isEnabled() || TextUtils.isEmpty(((Circle) aokw2.f78377h.getSelectedItem()).f83445d) || aokw2.f78370a.mo46777f().f30287b.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo43024g() {
        if (this.f78459d.mo43001h() != null) {
            this.f78459d.mo43001h().mo43063a(true);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle == null) {
            this.f78464i.setText(this.f78459d.mo43003j().f78547s);
        }
        if (!TextUtils.isEmpty(this.f78464i.getText())) {
            MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.f78464i;
            mentionMultiAutoCompleteTextView.setSelection(mentionMultiAutoCompleteTextView.getText().length());
        }
        boolean a = aomi.m66054a(getActivity(), this.f78459d.mo43003j().f78534f);
        this.f78467l = a;
        if (a) {
            boolean booleanExtra = getActivity().getIntent().getBooleanExtra("com.google.android.gms.plus.intent.extra.SHARE_ON_PLUS", true);
            CheckBox checkBox = (CheckBox) this.f78461f.findViewById(C0126R.C0129id.share_gplus_checkbox);
            this.f78466k = checkBox;
            checkBox.setChecked(booleanExtra);
            this.f78465j.setVisibility(8);
            this.f78461f.findViewById(C0126R.C0129id.share_gplus_checkbox_container).setVisibility(0);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof aomg)) {
            String valueOf = String.valueOf(aomg.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.f78459d = (aomg) activity;
        if (activity instanceof anpf) {
            this.f78472q = (anpf) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f78469n = bundle.getBoolean("logged_expand_sharebox", false);
            this.f78456a = bundle.getBoolean("logged_comment_added", false);
            this.f78470o = bundle.getBoolean("logged_preview_shown", false);
            this.f78457b = bundle.getBoolean("user_edited", false);
            this.f78458c = bundle.getBoolean("saw_domain_restriction", false);
            this.f78471p = bundle.getBoolean("saw_underage_warning", false);
            this.f78473r = (AddToCircleData) bundle.getParcelable("add_to_circle_data");
            this.f78463h = (Audience) bundle.getParcelable("audience");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.plus_sharebox_fragment, viewGroup, false);
        this.f78461f = inflate;
        this.f78462g = (ScrollView) inflate.findViewById(C0126R.C0129id.mention_scroll_view);
        AudienceView audienceView = (AudienceView) this.f78461f.findViewById(C0126R.C0129id.audience_view);
        this.f78474s = audienceView;
        boolean z = true;
        audienceView.mo17755b(true);
        if (bundle == null || !bundle.getBoolean("audience_view_enabled", false)) {
            z = false;
        }
        m66035a(z);
        View findViewById = this.f78461f.findViewById(C0126R.C0129id.audience_view_editable);
        if (findViewById != null) {
            findViewById.setBackgroundResource(0);
        }
        ImageView imageView = (ImageView) this.f78461f.findViewById(C0126R.C0129id.avatar);
        this.f78475t = imageView;
        imageView.setImageBitmap(ssa.m36185a(BitmapFactory.decodeResource(getResources(), C0126R.C0127drawable.default_avatar)));
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = (MentionMultiAutoCompleteTextView) this.f78461f.findViewById(C0126R.C0129id.compose_text);
        this.f78464i = mentionMultiAutoCompleteTextView;
        mentionMultiAutoCompleteTextView.addTextChangedListener(new aomf(this, getResources()));
        this.f78464i.setOnEditorActionListener(this);
        this.f78465j = (ViewGroup) this.f78461f.findViewById(C0126R.C0129id.link_preview_container);
        return this.f78461f;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() != C0126R.C0129id.compose_text || i != 6) {
            return false;
        }
        ssc.m36197a(getActivity(), textView);
        return true;
    }

    public final void onHiddenChanged(boolean z) {
        anqg m;
        super.onHiddenChanged(z);
        if (!z) {
            this.f78459d.mo43001h().mo43062a(1);
            this.f78464i.mo46785a(false);
            this.f78464i.requestFocusFromTouch();
            ssc.m36198b(getActivity(), this.f78464i);
        }
        anpf anpf = this.f78472q;
        if (anpf != null && (m = anpf.mo42085m()) != null) {
            if (!z) {
                m.mo42123a(this);
            } else {
                m.mo42125b(this);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("logged_expand_sharebox", this.f78469n);
        bundle.putBoolean("logged_comment_added", this.f78456a);
        bundle.putBoolean("logged_preview_shown", this.f78470o);
        bundle.putBoolean("user_edited", this.f78457b);
        bundle.putBoolean("saw_domain_restriction", this.f78458c);
        bundle.putBoolean("saw_underage_warning", this.f78471p);
        bundle.putBoolean("audience_view_enabled", this.f78476u);
        bundle.putParcelable("add_to_circle_data", this.f78473r);
        bundle.putParcelable("audience", this.f78463h);
    }

    public final void onStart() {
        super.onStart();
        if (this.f78459d.mo42999g().f78516n != null) {
            mo43017a(this.f78459d.mo42999g().f78516n);
        }
        if (this.f78459d.mo42999g().f78518p != null) {
            mo43015a(this.f78459d.mo42999g().f78518p);
        }
        if (this.f78459d.mo42999g().f78520r != null) {
            mo43014a(this.f78459d.mo42999g().f78520r);
        }
        if (!this.f78459d.mo43003j().f78540l) {
            mo43021d();
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
        aokw aokw = (aokw) childFragmentManager.findFragmentByTag("add_to_circle_fragment");
        this.f78460e = aokw;
        if (aokw == null) {
            aokw aokw2 = new aokw();
            this.f78460e = aokw2;
            beginTransaction.add(C0126R.C0129id.add_to_circle_container, aokw2, "add_to_circle_fragment");
        }
        if (!this.f78459d.mo42998f().mo46772a() || this.f78459d.mo42998f().mo46776e()) {
            beginTransaction.hide(this.f78460e);
        }
        if (this.f78467l) {
            beginTransaction.hide(this.f78460e);
        }
        if (!beginTransaction.isEmpty()) {
            beginTransaction.commitAllowingStateLoss();
        }
        anpf anpf = this.f78472q;
        if (anpf != null && anpf.mo42085m() != null) {
            this.f78472q.mo42085m().mo42123a(this);
        }
    }

    /* renamed from: a */
    private final void m66035a(boolean z) {
        this.f78476u = z;
        if (!z) {
            this.f78474s.mo17751a(1, null, null);
        } else {
            this.f78474s.mo17753a(this);
        }
    }

    /* renamed from: a */
    public final void mo7892a() {
        if (!this.f78463h.f30290e) {
            this.f78459d.mo42999g().mo43042a(riv.f43118l);
            this.f78459d.mo43011n();
        }
    }

    /* renamed from: a */
    public final void mo43014a(Bitmap bitmap) {
        this.f78475t.setImageBitmap(bitmap);
    }

    /* renamed from: a */
    public final void mo43015a(ansz ansz) {
        String str;
        this.f78477v = ansz;
        if (this.f78467l) {
            return;
        }
        if ((this.f78459d.mo43003j().mo43053e() && this.f78477v != null) || !this.f78459d.mo43003j().mo43054f() || !this.f78459d.mo43003j().f78543o.mo43074f()) {
            if (this.f78477v == null) {
                String str2 = this.f78459d.mo43003j().f78542n;
                aona aona = this.f78459d.mo43003j().f78543o;
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", str2);
                contentValues.put("url", str2);
                contentValues.put("type", "article");
                if (str2 == null && aona != null && aona.mo43074f()) {
                    if (aona.mo43076h()) {
                        contentValues.put("title", aona.mo43075g());
                    }
                    if (aona.mo43080l()) {
                        contentValues.put("thumbnailUrl", aona.mo43079k());
                    }
                    if (aona.mo43078j()) {
                        contentValues.put("description", aona.mo43077i());
                    }
                }
                this.f78477v = new ansz(contentValues);
                if (!this.f78470o) {
                    this.f78459d.mo42999g().mo43042a(riv.f43116j);
                    this.f78470o = true;
                }
            }
            this.f78465j.removeAllViews();
            aolq aolq = new aolq(getActivity());
            aolq.f78419c = this.f78459d.mo42999g().f78504b;
            ansz ansz2 = this.f78477v;
            String asString = ansz2.f77708b.getAsString("callToActionDisplayName");
            bmxy.m108582a(aolq.f78419c, "Call initialize first");
            aolq.f78417a = ansz2;
            aolq.f78418b = asString;
            aolq.removeAllViews();
            ansz ansz3 = aolq.f78417a;
            if (ansz3 != null) {
                String a = ansz3.mo42207a();
                if ("article".equals(a) || "action".equals(a) || "video".equals(a)) {
                    View inflate = LayoutInflater.from(aolq.getContext()).inflate((int) C0126R.C0128layout.plus_sharebox_article_preview_view, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.article_title);
                    PlusImageView plusImageView = (PlusImageView) inflate.findViewById(C0126R.C0129id.article_image);
                    plusImageView.mo46570a(aolq.f78419c);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(aolq.f78418b)) {
                        spannableStringBuilder.append((CharSequence) aolq.f78418b).append((CharSequence) ": ");
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), 0, spannableStringBuilder.length(), 0);
                    }
                    String b = aolq.f78417a.mo42208b();
                    if (b != null) {
                        str = Html.fromHtml(b).toString();
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        spannableStringBuilder.append((CharSequence) str);
                    }
                    String c = aolq.f78417a.mo42209c();
                    if (!TextUtils.isEmpty(spannableStringBuilder)) {
                        textView.setVisibility(0);
                        textView.setText(spannableStringBuilder);
                    } else {
                        textView.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(c)) {
                        plusImageView.setVisibility(0);
                        plusImageView.mo46568a(anuc.m65336a(c));
                    } else {
                        plusImageView.setVisibility(8);
                    }
                    inflate.setVisibility(0);
                    aolq.addView(inflate);
                    aolq.invalidate();
                    aolq.requestLayout();
                } else {
                    String valueOf = String.valueOf(a);
                    Log.e("ShareBox", valueOf.length() == 0 ? new String("Unsupported content type:") : "Unsupported content type:".concat(valueOf));
                }
            }
            this.f78465j.addView(aolq);
            if (!this.f78470o) {
                this.f78459d.mo42999g().mo43042a(riv.f43115i);
                this.f78470o = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo43016a(Audience audience) {
        if (!sdg.m34949a(this.f78463h, audience)) {
            this.f78457b = true;
        }
        this.f78474s.mo17752a(audience);
        this.f78463h = audience;
        m66035a(!audience.f30290e);
        if (this.f78467l) {
            return;
        }
        if (this.f78459d.mo43003j().f78540l) {
            this.f78459d.mo42996b(audience);
        } else {
            mo43021d();
        }
    }

    /* renamed from: a */
    public final void mo43017a(Settings settings) {
        this.f78468m = settings;
        if (this.f78463h == null) {
            Audience audience = settings.f82566c;
            if (audience == null) {
                Audience audience2 = settings.f82565b;
                if (audience2 == null) {
                    this.f78459d.mo42995a(sfd.f44109a);
                } else {
                    this.f78459d.mo42995a(audience2);
                }
            } else {
                this.f78459d.mo42995a(audience);
            }
        }
        mo43019b();
        this.f78474s.mo17754a(this.f78468m.f82567d);
        this.f78464i.mo46783a(getLoaderManager(), this.f78459d.mo42999g().f78512j, this.f78459d.mo43003j().mo43050b(), "80", this.f78459d.getCallingPackage(), this.f78459d.mo43004m());
        this.f78459d.mo43013p();
        if (!this.f78469n) {
            this.f78459d.mo42999g().mo43042a(riv.f43108b);
            this.f78469n = true;
        }
    }

    /* renamed from: a */
    public final void mo43018a(AddToCircleData addToCircleData, boolean z) {
        if (addToCircleData.mo46776e()) {
            mo43021d();
        } else if (this.f78460e != null) {
            getChildFragmentManager().beginTransaction().show(this.f78460e).commitAllowingStateLoss();
            this.f78460e.mo42935a(addToCircleData, z);
        }
    }

    /* renamed from: a */
    public final void mo42031a(Object obj) {
        if (obj != this) {
            mo43016a(this.f78472q.mo42085m().f77451a);
        }
        mo43019b();
    }
}
