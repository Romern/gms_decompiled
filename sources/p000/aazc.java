package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;
import com.google.android.gms.googlehelp.fragments.AccountPickerContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.Calendar;
import java.util.List;

/* renamed from: aazc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aazc implements abew {

    /* renamed from: a */
    public static final String f56868a;

    /* renamed from: b */
    public final HelpChimeraActivity f56869b;

    /* renamed from: c */
    public final HelpConfig f56870c;

    /* renamed from: d */
    public final View f56871d;

    /* renamed from: e */
    public AccountPickerContainer f56872e;

    /* renamed from: f */
    public View f56873f;

    /* renamed from: g */
    public aayu f56874g;

    /* renamed from: h */
    private View f56875h;

    /* renamed from: i */
    private MaterialCardView f56876i;

    /* renamed from: j */
    private MaterialCardView f56877j;

    /* renamed from: k */
    private ContactOptionsContainer f56878k;

    /* renamed from: l */
    private PopularArticlesContainer f56879l;

    static {
        String valueOf = String.valueOf(aayu.class.getSimpleName());
        f56868a = valueOf.length() == 0 ? new String("gH_HelpConsole-") : "gH_HelpConsole-".concat(valueOf);
    }

    public aazc(HelpChimeraActivity helpChimeraActivity) {
        this.f56869b = helpChimeraActivity;
        this.f56870c = helpChimeraActivity.f56986y;
        this.f56871d = helpChimeraActivity.findViewById(C0126R.C0129id.gh_help_console);
    }

    /* renamed from: a */
    static final void m47302a(HelpChimeraActivity helpChimeraActivity, int i, List list) {
        abcx.m47475a(helpChimeraActivity, i, list, "");
    }

    /* renamed from: i */
    private final void m47303i() {
        int i;
        if (this.f56875h == null) {
            HelpChimeraActivity helpChimeraActivity = this.f56869b;
            if (!this.f56870c.mo43251y()) {
                i = C0126R.C0129id.gh_bottom_need_more_help_options_view_stub;
            } else {
                i = C0126R.C0129id.gh_top_need_more_help_options_view_stub;
            }
            ViewStub viewStub = (ViewStub) helpChimeraActivity.findViewById(i);
            if (viewStub != null) {
                this.f56875h = viewStub.inflate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31927b() {
        int i;
        boolean z;
        ContactOptionsContainer h = mo31935h();
        LinearLayout linearLayout = (LinearLayout) h.findViewById(C0126R.C0129id.gh_contact_option_container);
        h.f78853b = null;
        int i2 = 0;
        h.f78855d = false;
        h.f78854c = 0;
        linearLayout.removeAllViews();
        View view = new View(h.getContext());
        linearLayout.addView(view);
        boolean z2 = false;
        boolean z3 = false;
        for (bzps bzps : h.f78857f.mo43246u()) {
            bzps a = aatw.m47000a(bzps, h.f78855d, h.f78857f, h.f78856e);
            if (a != bzps.UNKNOWN_CONTACT_MODE) {
                bzql a2 = aatw.m47001a(a, h.f78857f);
                int i3 = h.f78854c;
                h.f78854c = i3 + 1;
                bzps a3 = bzps.m126020a(a2.f171026b);
                if (a3 == null) {
                    a3 = bzps.UNKNOWN_CONTACT_MODE;
                }
                if (h.f78854c <= 3) {
                    bxvd bxvd = (bxvd) a2.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a2);
                    if (a2.f171029e || !h.f78857f.mo43225b(a3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bzql bzql = (bzql) bxvd.f164949b;
                    bzql bzql2 = bzql.f171023f;
                    bzql.f171025a |= 4;
                    bzql.f171029e = z;
                    aauw aauw = new aauw((bzql) bxvd.mo74062i(), linearLayout, C0126R.C0128layout.gh_contact_option, new aato(h, a3, i3));
                    if (a3 == bzps.PHONE || a3 == bzps.C2C) {
                        h.f78855d = true;
                    } else if (a3 == bzps.CHAT) {
                        h.f78853b = aauw;
                    }
                    HelpChimeraActivity helpChimeraActivity = h.f78856e;
                    if (!helpChimeraActivity.f56986y.mo43252z()) {
                        abcx.m47470a(helpChimeraActivity, 46, a3, i3);
                    }
                }
                z2 |= aatw.m47005a(a2);
                z3 = true;
            }
        }
        View view2 = new View(h.getContext());
        linearLayout.addView(view2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, (3.0f - ((float) h.f78854c)) / 2.0f);
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams);
        MaterialButton materialButton = h.f78858g;
        if (!z2) {
            i = 8;
        } else {
            i = 0;
        }
        materialButton.setVisibility(i);
        if (!z3) {
            i2 = 8;
        }
        h.setVisibility(i2);
    }

    /* renamed from: c */
    public final void mo31929c() {
        int i;
        if (ceey.f182588a.mo6606a().mo79069b()) {
            mo31927b();
        } else if (!this.f56870c.mo43210E()) {
            mo31927b();
            ContactOptionsContainer contactOptionsContainer = (ContactOptionsContainer) this.f56869b.findViewById(C0126R.C0129id.gh_contact_options_container);
            if ((contactOptionsContainer == null || contactOptionsContainer.getVisibility() != 0) && !TextUtils.isEmpty(this.f56870c.mo43212G())) {
                mo31931d();
            }
        } else {
            if (!TextUtils.isEmpty(this.f56870c.mo43212G())) {
                mo31931d();
            }
            if (!TextUtils.isEmpty(this.f56870c.mo43211F()) && this.f56877j == null) {
                m47303i();
                View view = this.f56875h;
                if (view == null) {
                    Log.e("gH_HelpConsole", "Error, could not inflate need more help options view.");
                } else {
                    this.f56877j = aasz.m46955b(this.f56869b, view, 195);
                }
            }
            HelpChimeraActivity helpChimeraActivity = this.f56869b;
            if (!this.f56870c.mo43251y()) {
                i = C0126R.C0129id.gh_bottom_feedback_view_stub;
            } else {
                i = C0126R.C0129id.gh_top_feedback_view_stub;
            }
            ViewStub viewStub = (ViewStub) helpChimeraActivity.findViewById(i);
            if (viewStub != null) {
                ((LinearLayout) viewStub.inflate()).findViewById(C0126R.C0129id.gh_feedback_option).setOnClickListener(new aayz(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31931d() {
        if (this.f56876i == null) {
            m47303i();
            View view = this.f56875h;
            if (view == null) {
                Log.e("gH_HelpConsole", "Error, could not inflate need more help options view.");
            } else {
                this.f56876i = aasz.m46953a(this.f56869b, view, 195);
            }
        }
    }

    /* renamed from: e */
    public final void mo31932e() {
        mo31933f();
        mo31929c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg
     arg types: [int, int, java.lang.String, float, int, int, wzh]
     candidates:
      aasg.a(int, int, java.lang.String, float, int, wzh, int):aasg
      aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg */
    /* renamed from: f */
    public final void mo31933f() {
        int i;
        HelpChimeraActivity helpChimeraActivity = this.f56869b;
        int i2 = abgx.f57444e;
        HelpConfig helpConfig = helpChimeraActivity.f56986y;
        aasm a = aasm.m46882a(helpConfig.f78815O, aasw.m46952a(), helpConfig);
        if (a != null) {
            int i3 = helpConfig.f78825Y;
            int i4 = helpConfig.f78816P;
            String str = helpConfig.f78817Q;
            float f = helpConfig.f78818R;
            if (!helpConfig.f78820T) {
                i = 9;
            } else {
                i = 8;
            }
            new abgx(helpChimeraActivity, a, aasg.m46856a(i3, i4, str, f, false, i, abgx.m47703a(helpConfig)), false, true, false, Calendar.getInstance()).executeOnExecutor(helpChimeraActivity.f78958e, new Void[0]);
            return;
        }
        helpChimeraActivity.mo43325K();
    }

    /* renamed from: g */
    public final PopularArticlesContainer mo31934g() {
        if (this.f56879l == null) {
            PopularArticlesContainer popularArticlesContainer = (PopularArticlesContainer) this.f56869b.findViewById(C0126R.C0129id.gh_articles_card);
            this.f56879l = popularArticlesContainer;
            popularArticlesContainer.f78995a = this.f56869b;
            if (PopularArticlesContainer.m66610b()) {
                popularArticlesContainer.mo43372a();
            }
        }
        return this.f56879l;
    }

    /* renamed from: h */
    public final ContactOptionsContainer mo31935h() {
        int i;
        int i2;
        if (this.f56878k == null) {
            boolean y = this.f56870c.mo43251y();
            if (!y) {
                i = C0126R.C0129id.gh_bottom_feedback_view_stub;
            } else {
                i = C0126R.C0129id.gh_top_feedback_view_stub;
            }
            if (!y) {
                i2 = C0126R.C0129id.gh_bottom_contact_options_view_stub;
            } else {
                i2 = C0126R.C0129id.gh_top_contact_options_view_stub;
            }
            ViewStub viewStub = (ViewStub) this.f56869b.findViewById(i2);
            if (viewStub != null) {
                ContactOptionsContainer contactOptionsContainer = (ContactOptionsContainer) viewStub.inflate();
                this.f56878k = contactOptionsContainer;
                HelpChimeraActivity helpChimeraActivity = this.f56869b;
                contactOptionsContainer.f78856e = helpChimeraActivity;
                contactOptionsContainer.f78857f = helpChimeraActivity.f56986y;
                if (contactOptionsContainer.f78857f == null) {
                    contactOptionsContainer.f78857f = HelpConfig.m66349a(helpChimeraActivity, null, null);
                }
                contactOptionsContainer.f78858g = (MaterialButton) contactOptionsContainer.findViewById(C0126R.C0129id.gh_show_hours);
                contactOptionsContainer.f78858g.setOnClickListener(new aatn(contactOptionsContainer));
                if (this.f56870c.f78849x == 0) {
                    abcx.m47463a(this.f56869b);
                }
            }
            ViewStub viewStub2 = (ViewStub) this.f56869b.findViewById(i);
            if (viewStub2 != null) {
                ((LinearLayout) viewStub2.inflate()).findViewById(C0126R.C0129id.gh_feedback_option).setOnClickListener(new aazb(this));
            }
        }
        return this.f56878k;
    }

    /* renamed from: a */
    public final void mo31924a() {
        if (PopularArticlesContainer.m66610b()) {
            PopularArticlesContainer g = mo31934g();
            g.f78998d = true;
            g.mo43372a();
            return;
        }
        aayu aayu = this.f56874g;
        aayu.f56850d = true;
        aayu.mo31915a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasp.a(com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, int, boolean):android.view.View
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, aasn, int, int]
     candidates:
      aasp.a(android.view.View, com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, boolean):void
      aasp.a(com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, int, boolean):android.view.View */
    /* renamed from: a */
    public final void mo31925a(abey abey) {
        int i;
        List a = abey.mo32056a(this.f56869b, new aasq(this.f56869b));
        PopularArticlesContainer g = mo31934g();
        int i2 = abey.f57324c;
        g.f78996b = a;
        g.f78999e = i2;
        LinearLayout linearLayout = (LinearLayout) g.findViewById(C0126R.C0129id.gh_popular_help_content_container);
        linearLayout.removeAllViews();
        int i3 = 0;
        for (int i4 = 0; i4 < g.f78996b.size() && i3 < 5; i4++) {
            aasm aasm = (aasm) g.f78996b.get(i4);
            aasn aasn = new aasn(g.f78995a, aasm, i3, g.f78999e, null);
            HelpChimeraActivity helpChimeraActivity = g.f78995a;
            if (!aaya.m47229b(ceib.m136897b())) {
                i = C0126R.C0128layout.gh_help_content_list_item_deprecated;
            } else {
                i = C0126R.C0128layout.gh_help_content_list_item;
            }
            View a2 = aasp.m46937a(helpChimeraActivity, aasm, (View.OnClickListener) aasn, i, false);
            if (a2 != null) {
                linearLayout.addView(a2);
                i3++;
            }
        }
        if (this.f56870c.mo43252z()) {
            return;
        }
        if (abey.f57322a.startsWith("genie-eng:offline")) {
            m47302a(this.f56869b, (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, a);
        } else {
            m47302a(this.f56869b, 14, a);
        }
    }

    /* renamed from: a */
    public final void mo31926a(HelpChimeraActivity helpChimeraActivity, int i, long j) {
        abeh a = HelpChimeraActivity.m66529a(helpChimeraActivity);
        bzpv a2 = bzpv.m126025a(a.f57223r);
        String str = a.f57218m;
        abcx.m47468a(helpChimeraActivity, i, j, a2, str, str, a.f57220o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014f  */
    /* renamed from: c */
    public final void mo31930c(abey abey) {
        View view;
        BitmapDrawable bitmapDrawable;
        Drawable a;
        ViewStub viewStub;
        ViewStub viewStub2;
        mo31925a(abey);
        if (aasb.m46830a(this.f56869b, this.f56870c, "promoted_content_version", -1) >= 2) {
            bzpz a2 = bzpz.m126030a(aasb.m46830a(this.f56869b, this.f56870c, "promoted_content_placement", 0));
            aasm a3 = aasm.m46887a(aasb.m46831a(this.f56869b, this.f56870c, "promoted_content_title", ""), aasb.m46831a(this.f56869b, this.f56870c, "promoted_content_snippet", ""), aasb.m46831a(this.f56869b, this.f56870c, "promoted_content_url", ""), aasb.m46831a(this.f56869b, this.f56870c, "promoted_content_image_base64", ""), aasb.m46831a(this.f56869b, this.f56870c, "promoted_content_external_link_text", ""), a2 != null ? a2 : bzpz.UNKNOWN_PROMOTION_PLACEMENT, aasb.m46830a(this.f56869b, this.f56870c, "promoted_content_version", -1));
            if (a3 != null) {
                bzpz x = a3.mo31742x();
                if (x == bzpz.PROMOTION_PLACEMENT_TOP) {
                    if (!ceib.m136898c()) {
                        view = ((ViewStub) this.f56869b.findViewById(C0126R.C0129id.gh_top_promoted_content_card_view_stub)).inflate();
                    } else {
                        HelpChimeraActivity helpChimeraActivity = this.f56869b;
                        if (helpChimeraActivity != null && (viewStub2 = (ViewStub) helpChimeraActivity.findViewById(C0126R.C0129id.gh_top_promoted_content_card_view_stub)) != null) {
                            view = viewStub2.inflate();
                        } else {
                            return;
                        }
                    }
                    view.setPadding(view.getPaddingLeft(), (int) this.f56869b.getResources().getDimension(C0126R.dimen.gh_promoted_content_v2_top_card_top_padding), view.getPaddingRight(), view.getPaddingBottom());
                } else if (x != bzpz.PROMOTION_PLACEMENT_BOTTOM) {
                    return;
                } else {
                    if (!ceib.m136898c()) {
                        view = ((ViewStub) this.f56869b.findViewById(C0126R.C0129id.gh_bottom_promoted_content_card_view_stub)).inflate();
                    } else {
                        HelpChimeraActivity helpChimeraActivity2 = this.f56869b;
                        if (helpChimeraActivity2 != null && (viewStub = (ViewStub) helpChimeraActivity2.findViewById(C0126R.C0129id.gh_bottom_promoted_content_card_view_stub)) != null) {
                            view = viewStub.inflate();
                        } else {
                            return;
                        }
                    }
                }
                HelpConfig helpConfig = this.f56870c;
                HelpChimeraActivity helpChimeraActivity3 = this.f56869b;
                if (!a3.f56506p) {
                    Log.w("gH_PromotedContentV2", "HelpResponse object did not contain Promoted Content.");
                    aazq.m47335a(view, helpChimeraActivity3, 8);
                } else if (!TextUtils.equals("intent", Uri.parse(a3.f56497g).getScheme()) || aass.m46943a(a3.f56497g, helpChimeraActivity3)) {
                    Resources resources = helpChimeraActivity3.getResources();
                    String str = a3.f56507q;
                    int dimension = (int) helpChimeraActivity3.getResources().getDimension(C0126R.dimen.gh_promoted_content_v2_icon_size);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            byte[] decode = Base64.decode(str, 0);
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            if (decodeByteArray != null) {
                                bitmapDrawable = new BitmapDrawable(resources, Bitmap.createScaledBitmap(decodeByteArray, dimension, dimension, true));
                                if (bitmapDrawable != null) {
                                    Log.w("gH_PromotedContentV2", "Invalid image for Promoted Content.");
                                    aazq.m47335a(view, helpChimeraActivity3, 8);
                                    return;
                                } else if (aaya.m47229b(ceib.f182703a.mo6606a().mo79156a()) && view == null) {
                                    Log.w("gH_PromotedContentV2", "Error, invalid layout provided.");
                                    aazq.m47335a(null, helpChimeraActivity3, 8);
                                    return;
                                } else {
                                    View findViewById = view.findViewById(C0126R.C0129id.gh_promoted_content);
                                    TextView textView = (TextView) findViewById.findViewById(C0126R.C0129id.gh_promoted_content_title);
                                    TextView textView2 = (TextView) findViewById.findViewById(C0126R.C0129id.gh_promoted_content_link_text);
                                    TextView textView3 = (TextView) findViewById.findViewById(C0126R.C0129id.gh_promoted_content_subtext);
                                    ImageView imageView = (ImageView) findViewById.findViewById(C0126R.C0129id.gh_promoted_content_icon);
                                    if (textView == null || textView2 == null || textView3 == null || imageView == null) {
                                        Log.w("gH_PromotedContentV2", "Promoted Content's view is missing some field(s).");
                                        aazq.m47335a(view, helpChimeraActivity3, 8);
                                        return;
                                    }
                                    findViewById.setOnClickListener(new aazp(helpConfig, helpChimeraActivity3, a3));
                                    imageView.setImageDrawable(bitmapDrawable);
                                    textView.setText(a3.f56496f);
                                    textView2.setText(a3.f56508r);
                                    textView3.setText(aasr.m46941a(a3.mo31735r()));
                                    if (aayi.m47270b() && (a = C1133kh.m17836a(helpChimeraActivity3, (int) C0126R.C0127drawable.quantum_ic_open_in_new_googblue_18)) != null) {
                                        Drawable b = aayh.m47257b(a, helpChimeraActivity3, aayi.m47263a(helpChimeraActivity3, C0126R.attr.gh_primaryBlueColor));
                                        int i = Build.VERSION.SDK_INT;
                                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, b, (Drawable) null);
                                    }
                                    aazq.m47335a(view, helpChimeraActivity3, 0);
                                    abcx.m47507b(helpChimeraActivity3, aazq.m47333a(a3));
                                    return;
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            bitmapDrawable = null;
                        }
                    }
                    bitmapDrawable = null;
                    if (bitmapDrawable != null) {
                    }
                } else {
                    Log.w("gH_PromotedContentV2", "Unsupported intent for the Promoted Content.");
                    aazq.m47335a(view, helpChimeraActivity3, 8);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo31928b(abey abey) {
        if (ceeg.f182447a.mo6606a().mo78937E()) {
            HelpChimeraActivity helpChimeraActivity = this.f56869b;
            abhd.m47713a(helpChimeraActivity.f78957d, helpChimeraActivity, helpChimeraActivity.f78965l, abey.f57323b.values());
        }
    }
}
