package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: aoah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoah extends Fragment implements View.OnClickListener, rjz, rka {

    /* renamed from: a */
    public static final String[] f78010a = {"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/pos", "https://www.googleapis.com/auth/plus.stream.write"};

    /* renamed from: b */
    public String f78011b;

    /* renamed from: c */
    public String f78012c;

    /* renamed from: d */
    public String f78013d;

    /* renamed from: e */
    public String f78014e;

    /* renamed from: f */
    public anuy f78015f;

    /* renamed from: g */
    public ansz f78016g;

    /* renamed from: h */
    public antb f78017h;

    /* renamed from: i */
    public boolean f78018i;

    /* renamed from: j */
    public boolean f78019j;

    /* renamed from: k */
    public boolean f78020k;

    /* renamed from: l */
    public boolean f78021l;

    /* renamed from: m */
    public ProgressBar f78022m;

    /* renamed from: n */
    public ConnectionResult f78023n;

    /* renamed from: o */
    public final anus f78024o = new aoaf(this);

    /* renamed from: p */
    private boolean f78025p;

    /* renamed from: q */
    private final anul f78026q = anuy.f77749a;

    /* renamed from: r */
    private boolean f78027r;

    /* renamed from: s */
    private boolean f78028s;

    /* renamed from: t */
    private PlusCommonExtras f78029t;

    /* renamed from: u */
    private final anus f78030u = new aoad(this);

    /* renamed from: v */
    private final anuw f78031v = new aoag(this);

    /* renamed from: w */
    private final aoae f78032w = new aoae(this);

    /* renamed from: a */
    private final void m65693a(boolean z) {
        getView().findViewById(C0126R.C0129id.plus_one_content).setVisibility(!z ? 4 : 0);
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        Activity activity;
        String str = this.f78013d;
        if (str == null) {
            this.f78013d = this.f78015f.mo42330c();
        } else if (!str.equals(this.f78015f.mo42330c())) {
            Activity activity2 = getActivity();
            if (activity2 != null) {
                activity2.showDialog(1);
                return;
            }
            return;
        }
        if (!this.f78028s && (activity = getActivity()) != null) {
            this.f78028s = true;
            shz.m35339a(activity, this.f78013d, (String) null, anlp.f77073f, anlq.f77077b, this.f78012c);
            shz.m35338a(activity, this.f78013d, anlq.f77077b, anlq.f77076a, this.f78012c);
        }
        if (this.f78018i) {
            this.f78019j = true;
            if (TextUtils.isEmpty(this.f78014e)) {
                this.f78015f.mo42315a(this.f78030u, this.f78011b);
            } else {
                this.f78018i = false;
                this.f78015f.mo42316a(this.f78024o, this.f78011b, this.f78014e);
            }
        }
        if (this.f78016g == null) {
            this.f78020k = true;
            this.f78015f.mo42322a(this.f78032w, this.f78011b);
        }
        if (this.f78017h == null) {
            this.f78021l = true;
            this.f78015f.mo42320a(this.f78031v);
        }
        m65693a(true);
        mo42512a(this.f78022m);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        PackageManager packageManager = getActivity().getPackageManager();
        ImageView imageView = (ImageView) getView().findViewById(C0126R.C0129id.plus_one_app_icon);
        TextView textView = (TextView) getView().findViewById(C0126R.C0129id.plus_one_app_name);
        try {
            imageView.setImageDrawable(packageManager.getApplicationIcon(this.f78012c));
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f78012c, 0));
            textView.setText(Html.fromHtml(getResources().getString(C0126R.string.plus_one_app, applicationLabel)));
        } catch (PackageManager.NameNotFoundException e) {
            textView.setVisibility(4);
            imageView.setVisibility(4);
        }
        getView().findViewById(C0126R.C0129id.plus_one_undo_button).setOnClickListener(this);
        getView().findViewById(C0126R.C0129id.plus_one_share_button).setOnClickListener(this);
        getView().findViewById(C0126R.C0129id.plus_one_confirm_button).setOnClickListener(this);
        m65693a(this.f78015f.mo24648p());
        mo42514a(this.f78017h);
        mo42513a(this.f78016g);
        mo42512a(this.f78022m);
        this.f78029t = PlusCommonExtras.m68419b(getArguments());
        anku.m64689a(getActivity(), this.f78029t, "gppo0");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
     arg types: [java.lang.String, java.lang.String]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public void onClick(View view) {
        boolean z;
        boolean z2;
        Intent intent;
        boolean z3;
        Activity activity = getActivity();
        if (activity != null && this.f78015f.mo24648p()) {
            int id = view.getId();
            int i = -1;
            if (id == C0126R.C0129id.plus_one_undo_button) {
                if (this.f78025p) {
                    shz.m35339a(activity, this.f78013d, (String) null, anlp.f77069b, anlq.f77076a, this.f78012c);
                } else {
                    shz.m35339a(activity, this.f78013d, (String) null, anlp.f77070c, anlq.f77076a, this.f78012c);
                }
                shz.m35338a(activity, this.f78013d, anlq.f77076a, anlq.f77077b, this.f78012c);
                this.f78015f.mo42328b(null, this.f78011b);
                if (this.f78025p) {
                    i = 0;
                }
                activity.setResult(i);
                activity.finish();
            } else if (id == C0126R.C0129id.plus_one_share_button) {
                shz.m35339a(activity, this.f78013d, (String) null, anlp.f77074g, anlq.f77076a, this.f78012c);
                shz.m35338a(activity, this.f78013d, anlq.f77076a, anlq.f77078c, this.f78012c);
                ankv ankv = new ankv();
                ankv.f77036a.putExtra("android.intent.extra.TEXT", (CharSequence) this.f78011b);
                ankv.f77036a.setType("text/plain");
                boolean equals = "android.intent.action.SEND_MULTIPLE".equals(ankv.f77036a.getAction());
                boolean booleanExtra = ankv.f77036a.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
                sdo.m34971a(true, (Object) "Call-to-action buttons are only available for URLs.");
                if (!booleanExtra || ankv.f77036a.hasExtra("com.google.android.apps.plus.CONTENT_URL")) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34971a(z, (Object) "The content URL is required for interactive posts.");
                if (!booleanExtra || ankv.f77036a.hasExtra("com.google.android.apps.plus.CONTENT_URL") || ankv.f77036a.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sdo.m34971a(z2, (Object) "Must set content URL or content deep-link ID to use a call-to-action button.");
                if (ankv.f77036a.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")) {
                    String stringExtra = ankv.f77036a.getStringExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
                    if (TextUtils.isEmpty(stringExtra)) {
                        Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
                        z3 = false;
                    } else if (stringExtra.contains(" ")) {
                        Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    sdo.m34971a(z3, (Object) "The specified deep-link ID was malformed.");
                }
                if (equals) {
                    ankv.f77036a.setAction("android.intent.action.SEND");
                    ankv.f77036a.removeExtra("android.intent.extra.STREAM");
                }
                if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(ankv.f77036a.getAction())) {
                    ankv.f77036a.setPackage("com.google.android.gms");
                    intent = ankv.f77036a;
                } else if (!ankv.f77036a.hasExtra("android.intent.extra.STREAM")) {
                    ankv.f77036a.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
                    ankv.f77036a.setPackage("com.google.android.gms");
                    intent = ankv.f77036a;
                } else {
                    ankv.f77036a.setPackage("com.google.android.apps.plus");
                    intent = ankv.f77036a;
                }
                intent.putExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", this.f78012c);
                intent.putExtra("com.google.android.apps.plus.IS_FROM_PLUSONE", true);
                this.f78029t.mo46573a(intent);
                startActivity(intent);
                if (!this.f78025p) {
                    i = 0;
                }
                activity.setResult(i);
                activity.finish();
            } else if (id == C0126R.C0129id.plus_one_confirm_button) {
                if (this.f78025p) {
                    shz.m35339a(activity, this.f78013d, (String) null, anlp.f77068a, anlq.f77076a, this.f78012c);
                } else {
                    shz.m35339a(activity, this.f78013d, (String) null, anlp.f77071d, anlq.f77076a, this.f78012c);
                }
                shz.m35338a(activity, this.f78013d, anlq.f77076a, anlq.f77077b, this.f78012c);
                if (!this.f78025p) {
                    i = 0;
                }
                activity.setResult(i);
                activity.finish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments.getString("PlusOneFragment#mAccount");
        this.f78014e = arguments.getString("PlusOneFragment#mToken");
        this.f78025p = arguments.getBoolean("PlusOneFragment#mApplyPlusOne");
        this.f78011b = arguments.getString("PlusOneFragment#mUrl");
        this.f78012c = arguments.getString("PlusOneFragment#mCallingPackage");
        Activity activity = getActivity();
        anwk anwk = new anwk(activity);
        anwk.f77819a = string;
        anwk.mo42334a(f78010a);
        anwk.f77821c = this.f78012c;
        anwk.f77820b = activity.getPackageName();
        this.f78015f = this.f78026q.mo42292a(activity, anwk.mo42333a(), this, this);
        this.f78019j = false;
        this.f78020k = false;
        this.f78021l = false;
        if (bundle == null) {
            this.f78018i = this.f78025p;
            this.f78027r = false;
            this.f78028s = false;
            activity.setResult(0);
            return;
        }
        this.f78018i = bundle.getBoolean("pendingInsert");
        this.f78027r = bundle.getBoolean("loggedPreview");
        this.f78028s = bundle.getBoolean("loggedPlusOne");
        if (bundle.containsKey("account")) {
            this.f78013d = bundle.getString("account");
        }
        if (bundle.containsKey("token")) {
            this.f78014e = bundle.getString("token");
        }
        if (bundle.containsKey("linkPreview")) {
            this.f78016g = new ansz(bundle.getBundle("linkPreview"));
        }
        if (bundle.containsKey("signUpState")) {
            this.f78017h = new antb(bundle.getBundle("signUpState"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.plus_one_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        ConnectionResult connectionResult = this.f78023n;
        if (connectionResult != null) {
            try {
                connectionResult.mo17669a(getActivity().getContainerActivity(), 1);
            } catch (IntentSender.SendIntentException e) {
                this.f78023n = null;
                getActivity().showDialog(1);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pendingInsert", this.f78018i);
        bundle.putBoolean("loggedPreview", this.f78027r);
        bundle.putBoolean("loggedPlusOne", this.f78028s);
        String str = this.f78013d;
        if (str != null) {
            bundle.putString("account", str);
        }
        String str2 = this.f78014e;
        if (str2 != null) {
            bundle.putString("token", str2);
        }
        ansz ansz = this.f78016g;
        if (ansz != null) {
            bundle.putBundle("linkPreview", ansz.mo42210d());
        }
        antb antb = this.f78017h;
        if (antb != null) {
            bundle.putBundle("signUpState", antb.f77710a);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f78023n = null;
        this.f78015f.mo42332x();
        mo42512a(this.f78022m);
    }

    public final void onStop() {
        super.onStop();
        this.f78015f.mo14032j();
    }

    /* renamed from: a */
    public final void mo42511a() {
        int i;
        Activity activity = getActivity();
        if (activity != null && this.f78015f.mo24648p()) {
            if (this.f78025p) {
                shz.m35339a(activity, this.f78013d, (String) null, anlp.f77068a, anlq.f77076a, this.f78012c);
            } else {
                shz.m35339a(activity, this.f78013d, (String) null, anlp.f77071d, anlq.f77076a, this.f78012c);
            }
            shz.m35338a(activity, this.f78013d, anlq.f77076a, anlq.f77077b, this.f78012c);
            if (!this.f78025p) {
                i = 0;
            } else {
                i = -1;
            }
            activity.setResult(i);
        }
    }

    /* renamed from: a */
    public final void mo42512a(ProgressBar progressBar) {
        if (progressBar != null) {
            int i = 0;
            if (this.f78015f.mo24648p() && !this.f78019j && !this.f78020k && !this.f78021l) {
                i = 8;
            }
            progressBar.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo42513a(ansz ansz) {
        View view;
        ansz ansz2 = ansz;
        Activity activity = getActivity();
        if (activity != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(C0126R.C0129id.plus_one_preview_container);
            viewGroup.removeAllViews();
            aoai aoai = new aoai(activity);
            aoai.f78034b = this.f78015f;
            bmxy.m108582a(aoai.f78034b, "Call initialize first");
            aoai.f78033a = ansz2;
            aoai.removeAllViews();
            ansz ansz3 = aoai.f78033a;
            boolean z = false;
            if (ansz3 != null) {
                String a = ansz3.mo42207a();
                if ("article".equals(a)) {
                    view = LayoutInflater.from(aoai.getContext()).inflate((int) C0126R.C0128layout.plus_article_preview_view, (ViewGroup) null);
                    PlusImageView plusImageView = (PlusImageView) view.findViewById(C0126R.C0129id.article_icon);
                    plusImageView.mo46570a(aoai.f78034b);
                    TextView textView = (TextView) view.findViewById(C0126R.C0129id.article_title);
                    TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.article_content);
                    PlusImageView plusImageView2 = (PlusImageView) view.findViewById(C0126R.C0129id.article_image);
                    plusImageView2.mo46570a(aoai.f78034b);
                    String a2 = aoai.m65701a(aoai.f78033a.mo42208b());
                    String a3 = aoai.m65701a(aoai.f78033a.f77708b.getAsString("description"));
                    String c = aoai.f78033a.mo42209c();
                    if (!TextUtils.isEmpty(a2)) {
                        textView.setVisibility(0);
                        textView.setText(a2);
                    } else {
                        textView.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(a3)) {
                        textView2.setVisibility(0);
                        textView2.setText(a3);
                    } else {
                        textView2.setVisibility(8);
                    }
                    plusImageView.setVisibility(8);
                    if (!TextUtils.isEmpty(c)) {
                        plusImageView2.setVisibility(0);
                        plusImageView2.mo46568a(anuc.m65336a(c));
                    } else {
                        plusImageView2.setVisibility(8);
                    }
                    view.setVisibility(0);
                } else if ("video".equals(a)) {
                    view = LayoutInflater.from(aoai.getContext()).inflate((int) C0126R.C0128layout.plus_video_preview_view, (ViewGroup) null);
                    TextView textView3 = (TextView) view.findViewById(C0126R.C0129id.video_title);
                    PlusImageView plusImageView3 = (PlusImageView) view.findViewById(C0126R.C0129id.video_image);
                    plusImageView3.mo46570a(aoai.f78034b);
                    String c2 = aoai.f78033a.mo42209c();
                    String a4 = aoai.m65701a(aoai.f78033a.mo42208b());
                    if (!TextUtils.isEmpty(a4)) {
                        textView3.setVisibility(0);
                        textView3.setText(a4);
                    } else {
                        textView3.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(c2)) {
                        plusImageView3.setVisibility(0);
                        plusImageView3.mo46568a(anuc.m65336a(c2));
                    } else {
                        plusImageView3.setVisibility(8);
                    }
                    view.setVisibility(0);
                } else if (!"photo".equals(a)) {
                    String valueOf = String.valueOf(a);
                    Log.e("PreviewView", valueOf.length() == 0 ? new String("Unsupported content type:") : "Unsupported content type:".concat(valueOf));
                } else {
                    view = LayoutInflater.from(aoai.getContext()).inflate((int) C0126R.C0128layout.plus_photo_preview_view, (ViewGroup) null);
                    TextView textView4 = (TextView) view.findViewById(C0126R.C0129id.photo_title);
                    PlusImageView plusImageView4 = (PlusImageView) view.findViewById(C0126R.C0129id.photo_image);
                    plusImageView4.mo46570a(aoai.f78034b);
                    String c3 = aoai.f78033a.mo42209c();
                    String a5 = aoai.m65701a(aoai.f78033a.mo42208b());
                    if (!TextUtils.isEmpty(a5)) {
                        textView4.setVisibility(0);
                        textView4.setText(a5);
                    } else {
                        textView4.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(c3)) {
                        plusImageView4.setVisibility(0);
                        plusImageView4.mo46568a(anuc.m65336a(c3));
                    } else {
                        plusImageView4.setVisibility(8);
                    }
                    view.setVisibility(0);
                }
                aoai.addView(view);
                aoai.invalidate();
                aoai.requestLayout();
                z = true;
            }
            if (!this.f78027r && ansz2 != null) {
                this.f78027r = true;
                if (z) {
                    shz.m35339a(activity, this.f78013d, (String) null, anlp.f77072e, anlq.f77076a, this.f78012c);
                } else {
                    shz.m35339a(activity, this.f78013d, (String) null, anlp.f77075h, anlq.f77076a, this.f78012c);
                }
            }
            viewGroup.addView(aoai);
        }
    }

    /* renamed from: a */
    public final void mo42514a(antb antb) {
        if (antb != null) {
            PlusImageView plusImageView = (PlusImageView) getView().findViewById(C0126R.C0129id.plus_one_user_avatar);
            plusImageView.mo46570a(this.f78015f);
            plusImageView.mo46568a(new Uri.Builder().scheme("content").authority("com.google.android.gms.plus").appendPath("avatars").appendPath(this.f78015f.mo42330c()).build());
            ((TextView) getView().findViewById(C0126R.C0129id.plus_one_user_name)).setText(antb.mo42214a());
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (!connectionResult.mo17670a()) {
            activity.showDialog(1);
        } else if (isResumed()) {
            try {
                connectionResult.mo17669a(getActivity().getContainerActivity(), 1);
            } catch (IntentSender.SendIntentException e) {
                activity.showDialog(1);
            }
        } else {
            this.f78023n = connectionResult;
        }
    }
}
