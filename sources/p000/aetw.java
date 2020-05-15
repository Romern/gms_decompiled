package p000;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.locationsharing.onboarding.TosUiDescription;
import java.io.IOException;
import java.util.List;

/* renamed from: aetw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetw extends aetp implements View.OnClickListener {

    /* renamed from: a */
    public aetk f63795a;

    /* renamed from: b */
    public String f63796b;

    /* renamed from: c */
    public String f63797c;

    /* renamed from: d */
    public boolean f63798d;

    /* renamed from: e */
    public boolean f63799e;

    /* renamed from: f */
    public TosUiDescription f63800f;

    /* renamed from: g */
    private Uri f63801g;

    /* renamed from: h */
    private String f63802h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f63803i = false;

    /* renamed from: j */
    private Integer f63804j;

    /* renamed from: k */
    private Integer f63805k;

    /* renamed from: l */
    private TextView f63806l;

    /* renamed from: m */
    private TextView f63807m;

    /* renamed from: n */
    private final LoaderManager.LoaderCallbacks f63808n = new aett(this);

    /* renamed from: a */
    public final aetk mo34555a() {
        return this.f63795a;
    }

    public void onClick(View view) {
        if (view == this.f63806l) {
            this.f63795a.mo34554c(5);
            this.f63803i = true;
            aexw.m52663a(getActivity(), C0126R.string.location_sharing_saving);
            getLoaderManager().restartLoader(0, null, this.f63808n);
        } else if (view == this.f63807m) {
            this.f63795a.mo34554c(4);
            getActivity().setResult(0);
            getActivity().finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getActivity() != null) {
            bxvd da = caiu.f174770d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caiu caiu = (caiu) da.f164949b;
            caiu.f174773b = 4;
            caiu.f174772a = 1 | caiu.f174772a;
            if (getActivity().getCallingActivity() != null) {
                this.f63797c = getActivity().getCallingActivity().getPackageName();
            }
            String str = this.f63797c;
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caiu caiu2 = (caiu) da.f164949b;
                str.getClass();
                caiu2.f174772a |= 2;
                caiu2.f174774c = str;
            } else if (getActivity().getIntent().getAction() == null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caiu caiu3 = (caiu) da.f164949b;
                "com.google.android.gms".getClass();
                caiu3.f174772a |= 2;
                caiu3.f174774c = "com.google.android.gms";
            }
            this.f63795a = new aetk(getActivity(), (caiu) da.mo74062i(), bundle, getArguments().getString("session_id", aetk.m52537a()));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Bundle arguments = getArguments();
        this.f63796b = arguments.getString("account_name");
        this.f63798d = !arguments.getBoolean("has_signed_tos");
        this.f63799e = arguments.getBoolean("is_location_history_enabled");
        this.f63801g = (Uri) arguments.getParcelable("header_bitmap");
        this.f63802h = arguments.getString("header_text");
        this.f63800f = (TosUiDescription) sef.m35068a(arguments.getString("tos_ui_description"), TosUiDescription.CREATOR);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.location_sharing_onboarding_server_fragment, viewGroup, false);
        if (arguments != null) {
            if (arguments.get("background_color") != null) {
                inflate.findViewById(C0126R.C0129id.onboarding_image_container).setBackgroundColor(Integer.valueOf(arguments.getInt("background_color")).intValue());
            }
            if (arguments.get("content_text_color") != null) {
                this.f63804j = Integer.valueOf(arguments.getInt("content_text_color"));
            }
            if (arguments.get("content_background_color") != null) {
                this.f63805k = Integer.valueOf(arguments.getInt("content_background_color"));
            }
        }
        m52551a((TextView) inflate.findViewById(C0126R.C0129id.title), this.f63800f.f79659a);
        m52551a((TextView) inflate.findViewById(C0126R.C0129id.intro_paragraphs), this.f63800f.f79660b);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0126R.C0129id.section_root);
        List list = this.f63800f.f79661c;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            TosUiDescription.Section section = (TosUiDescription.Section) list.get(i2);
            String str = section.f79668b;
            String str2 = section.f79669c;
            TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.location_sharing_onboarding_section, viewGroup2, false);
            viewGroup2.addView(textView);
            m52551a(textView, str);
            textView.setOnClickListener(new aetv(this, str2));
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            int length = compoundDrawables.length;
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= length) {
                    break;
                }
                Drawable drawable = compoundDrawables[i3];
                if (drawable != null) {
                    if (this.f63804j == null) {
                        this.f63804j = Integer.valueOf(getResources().getColor(17170443));
                    }
                    drawable.setColorFilter(new PorterDuffColorFilter(this.f63804j.intValue(), PorterDuff.Mode.SRC_IN));
                }
                i3++;
            }
            i2 = i;
        }
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.footer_paragraphs);
        String str3 = this.f63800f.f79662d;
        if (str3 != null) {
            m52551a(textView2, str3);
        } else {
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) inflate.findViewById(C0126R.C0129id.positive_button);
        this.f63806l = textView3;
        m52551a(textView3, this.f63800f.f79663e);
        this.f63806l.setOnClickListener(this);
        TextView textView4 = (TextView) inflate.findViewById(C0126R.C0129id.negative_button);
        this.f63807m = textView4;
        m52551a(textView4, this.f63800f.f79664f);
        this.f63807m.setOnClickListener(this);
        TextView textView5 = (TextView) inflate.findViewById(C0126R.C0129id.footer_text);
        String str4 = this.f63800f.f79665g;
        if (str4 != null) {
            m52551a(textView5, str4);
        } else {
            textView5.setVisibility(8);
        }
        if (!((AccessibilityManager) getActivity().getSystemService("accessibility")).isEnabled()) {
            inflate.findViewById(C0126R.C0129id.filler_view).setOnClickListener(new aetu(this));
        }
        if (this.f63802h != null) {
            TextView textView6 = (TextView) inflate.findViewById(C0126R.C0129id.title);
            textView6.setText(this.f63802h);
            Integer num = this.f63804j;
            if (num != null) {
                textView6.setTextColor(num.intValue());
            }
        }
        if (this.f63805k != null) {
            inflate.findViewById(C0126R.C0129id.tos_content).setBackgroundColor(this.f63805k.intValue());
        }
        if (this.f63801g != null) {
            try {
                ((ImageView) inflate.findViewById(C0126R.C0129id.onboarding_image)).setImageDrawable(new BitmapDrawable(getActivity().getResources(), MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), this.f63801g)));
            } catch (IOException e) {
                bqye.m113758a(e);
            }
        }
        if (this.f63803i) {
            aexw.m52663a(getActivity(), C0126R.string.location_sharing_saving);
            getLoaderManager().initLoader(0, null, this.f63808n);
        }
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        aexw.m52662a(getActivity());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f63795a.mo34551a(bundle);
    }

    /* renamed from: a */
    private final void m52551a(TextView textView, String str) {
        textView.setText(Html.fromHtml(str));
        Integer num = this.f63804j;
        if (num != null) {
            textView.setTextColor(num.intValue());
            textView.setLinkTextColor(this.f63804j.intValue());
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
