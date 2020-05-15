package p000;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceAvatarImageView;

/* renamed from: anqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anqt extends Fragment implements rjz, rka {

    /* renamed from: a */
    public View f77466a;

    /* renamed from: b */
    public View f77467b;

    /* renamed from: c */
    public EditText f77468c;

    /* renamed from: d */
    public ImageView f77469d;

    /* renamed from: e */
    public rkb f77470e;

    /* renamed from: f */
    public AudienceMember f77471f;

    /* renamed from: g */
    public String f77472g;

    /* renamed from: h */
    public Bitmap f77473h;

    /* renamed from: i */
    private View f77474i;

    /* renamed from: j */
    private AudienceAvatarImageView f77475j;

    /* renamed from: b */
    private final int m65008b(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    private static final int m65009c(int i) {
        return (i & -16777216) == 0 ? i | -16777216 : i;
    }

    /* renamed from: f */
    private final void m65010f() {
        mo42141a(0, new rqd(3, null, 3, null).mo25022a(), (Status) null);
    }

    /* renamed from: d */
    public final void mo42144d() {
        if (TextUtils.isEmpty(this.f77472g)) {
            m65010f();
        } else if (!this.f77470e.mo24805i()) {
            mo42140a();
        } else {
            anql e = mo42145e();
            if (e != null && !e.mo42128b()) {
                Intent intent = getActivity().getIntent();
                String a = rqc.m34255a(intent);
                String c = rqc.m34257c(intent);
                rjo rjo = allr.f73629a;
                amcp.m62615a(this.f77470e, a, c, this.f77472g).mo9458a(new anqo(this));
                e.mo42126a();
            }
        }
    }

    /* renamed from: e */
    public final anql mo42145e() {
        return (anql) getActivity();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        String str;
        AudienceMember audienceMember = this.f77471f;
        if (audienceMember != null) {
            str = audienceMember.f30297g;
        } else {
            str = null;
        }
        if (str != null) {
            rjo rjo = allr.f73629a;
            amcy.m62630a(this.f77470e, str, 3, 0).mo9458a(new anqk(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(getActivity() instanceof anql)) {
            throw new IllegalStateException("Activity must implement CircleCreationFragmentHost.");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f77471f = rqc.m34258d(getActivity().getIntent());
        int b = rqc.m34256b(getActivity().getIntent());
        allp allp = new allp();
        allp.f73626a = b;
        allq a = allp.mo40491a();
        rjy rjy = new rjy(getActivity(), this, this);
        rjy.mo24780a(allr.f73629a, a);
        rkb b2 = rjy.mo24784b();
        this.f77470e = b2;
        b2.mo24801e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.plus_circles_circle_creation_fragment, (ViewGroup) null);
        this.f77468c = (EditText) inflate.findViewById(C0126R.C0129id.circle_name_edit_text);
        this.f77469d = (ImageView) inflate.findViewById(C0126R.C0129id.create_circle_button);
        this.f77475j = (AudienceAvatarImageView) inflate.findViewById(C0126R.C0129id.header_avatar);
        this.f77466a = inflate.findViewById(C0126R.C0129id.dialog);
        this.f77474i = inflate.findViewById(C0126R.C0129id.dialog_header);
        Configuration configuration = getResources().getConfiguration();
        if (configuration.orientation != 1) {
            int i = configuration.smallestScreenWidthDp;
            ViewGroup.LayoutParams layoutParams = this.f77466a.getLayoutParams();
            layoutParams.width = m65008b(i < 600 ? i - 32 : 427);
            this.f77466a.setLayoutParams(layoutParams);
        }
        int c = m65009c(getActivity().getIntent().getIntExtra("com.google.android.gms.common.audience.EXTRA_HEADER_TEXT_COLOR", getResources().getColor(C0126R.color.plus_add_to_circles_header_text)));
        ((TextView) inflate.findViewById(C0126R.C0129id.header_text)).setTextColor(c);
        ((GradientDrawable) this.f77474i.getBackground()).setColor(m65009c(getActivity().getIntent().getIntExtra("com.google.android.gms.common.audience.EXTRA_HEADER_BACKGROUND_COLOR", getResources().getColor(C0126R.color.plus_add_to_circles_header_grey))));
        this.f77468c.addTextChangedListener(new anqm(this));
        this.f77468c.setOnEditorActionListener(new anqr(this));
        View findViewById = inflate.findViewById(C0126R.C0129id.transparent_background);
        this.f77467b = findViewById;
        findViewById.setOnClickListener(new anqn(this, false));
        this.f77466a.setOnClickListener(null);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.close_button);
        ((ViewGroup) imageView.getParent()).setOnClickListener(new anqn(this, false));
        imageView.setOnClickListener(new anqn(this, false));
        Drawable drawable = getResources().getDrawable(C0126R.C0127drawable.plus_iconic_ic_close_white_20);
        drawable.setColorFilter(c, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(drawable);
        if (inflate != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean a = sse.m36204a();
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.create_circle_button_frame);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            if (a) {
                layoutParams2.addRule(9, -1);
            } else {
                layoutParams2.addRule(11, -1);
            }
            linearLayout.setLayoutParams(layoutParams2);
            EditText editText = (EditText) inflate.findViewById(C0126R.C0129id.circle_name_edit_text);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) editText.getLayoutParams();
            if (a) {
                layoutParams3.addRule(1, C0126R.C0129id.create_circle_button_frame);
            } else {
                layoutParams3.addRule(0, C0126R.C0129id.create_circle_button_frame);
            }
            editText.setLayoutParams(layoutParams3);
            View findViewById2 = inflate.findViewById(C0126R.C0129id.circle_name_edit_text_underline);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
            if (a) {
                layoutParams4.addRule(1, C0126R.C0129id.create_circle_button_frame);
            } else {
                layoutParams4.addRule(0, C0126R.C0129id.create_circle_button_frame);
            }
            findViewById2.setLayoutParams(layoutParams4);
        }
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.header_text);
        AudienceMember audienceMember = this.f77471f;
        if (audienceMember == null || TextUtils.isEmpty(audienceMember.f30296f)) {
            textView.setText(getResources().getString(C0126R.string.plus_circle_creation_title_default));
        } else {
            textView.setText(getResources().getString(C0126R.string.plus_circle_creation_title_with_user_name, this.f77471f.f30296f));
        }
        mo42143c();
        mo42142b();
        if (!TextUtils.isEmpty(this.f77472g)) {
            this.f77467b.setVisibility(8);
            return inflate;
        }
        this.f77467b.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), C0126R.anim.circle_creation_dialog_slide_up);
        loadAnimation.setAnimationListener(new anqq(this));
        this.f77466a.startAnimation(loadAnimation);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f77470e.mo24803g();
    }

    /* renamed from: a */
    public final void mo42140a() {
        mo42141a(7, new rqd(2, null, 3, null).mo25022a(), (Status) null);
    }

    /* renamed from: c */
    public final void mo42143c() {
        if (this.f77473h == null || getResources().getDimension(C0126R.dimen.circle_creation_dialog_header_height) < ((float) m65008b(80))) {
            this.f77475j.setVisibility(8);
            return;
        }
        this.f77475j.setVisibility(0);
        this.f77475j.mo46542a(this.f77473h);
    }

    /* renamed from: b */
    public final void mo42142b() {
        if (TextUtils.isEmpty(this.f77468c.getText())) {
            this.f77469d.setClickable(false);
            this.f77469d.setImageResource(C0126R.C0127drawable.plus_iconic_ic_plus_grey_20);
            int i = Build.VERSION.SDK_INT;
            this.f77469d.setAlpha(0.3f);
            ((ViewGroup) this.f77469d.getParent()).setOnClickListener(null);
            this.f77469d.setOnClickListener(null);
            return;
        }
        this.f77469d.setClickable(true);
        this.f77469d.setImageResource(C0126R.C0127drawable.plus_iconic_ic_plus_green_20);
        int i2 = Build.VERSION.SDK_INT;
        this.f77469d.setAlpha(1.0f);
        ((ViewGroup) this.f77469d.getParent()).setOnClickListener(new anqn(this, true));
        this.f77469d.setOnClickListener(new anqn(this, true));
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        this.f77470e.mo24801e();
    }

    /* renamed from: a */
    public final void mo42141a(int i, Intent intent, Status status) {
        anql e = mo42145e();
        if (e != null) {
            e.mo42127a(i, intent, status);
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        m65010f();
    }
}
