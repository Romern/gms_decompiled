package p000;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: jxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxp extends Fragment implements View.OnClickListener {

    /* renamed from: c */
    private static final Pattern f23458c = Pattern.compile("<placeholder\\s*id=['\"]app_name['\"]\\s*/?>(.*</placeholder>)?");

    /* renamed from: d */
    private static final ArrayList f23459d = new ArrayList();

    /* renamed from: e */
    private static final Map f23460e;

    /* renamed from: a */
    public ScopeData f23461a;

    /* renamed from: b */
    public ArrayList f23462b;

    /* renamed from: f */
    private String f23463f;

    /* renamed from: g */
    private String f23464g;

    /* renamed from: h */
    private String f23465h;

    /* renamed from: i */
    private ArrayList f23466i;

    /* renamed from: j */
    private TextView f23467j;

    /* renamed from: k */
    private TextView f23468k;

    /* renamed from: l */
    private jxo f23469l;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("https://www.googleapis.com/auth/plus.me", Integer.valueOf((int) C0126R.C0127drawable.auth_consent_default_scope_icon));
        Integer valueOf = Integer.valueOf((int) C0126R.C0127drawable.plus_iconic_ic_gplus_color_24);
        hashMap.put("https://www.googleapis.com/auth/plus.circles.read", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.circles.write", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.stream.read", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.stream.write", valueOf);
        hashMap.put("https://www.googleapis.com/auth/plus.media.upload", valueOf);
        hashMap.put("https://www.googleapis.com/auth/userinfo.email", Integer.valueOf((int) C0126R.C0127drawable.plus_iconic_ic_gmail_red_24));
        hashMap.put("https://www.googleapis.com/auth/youtube", Integer.valueOf((int) C0126R.C0127drawable.plus_iconic_ic_video_red_24));
        Integer valueOf2 = Integer.valueOf((int) C0126R.C0127drawable.plus_iconic_ic_play_games_color_24);
        hashMap.put("https://www.googleapis.com/auth/games", valueOf2);
        hashMap.put("https://www.googleapis.com/auth/games_lite", valueOf2);
        hashMap.put("https://www.googleapis.com/auth/payments.make_payments", Integer.valueOf((int) C0126R.C0127drawable.plus_iconic_ic_wallet_color_24));
        Integer valueOf3 = Integer.valueOf((int) C0126R.C0127drawable.auth_fitness_icn_scope_activity);
        hashMap.put("https://www.googleapis.com/auth/fitness.activity.read", valueOf3);
        hashMap.put("https://www.googleapis.com/auth/fitness.activity.write", valueOf3);
        Integer valueOf4 = Integer.valueOf((int) C0126R.C0127drawable.auth_fitness_icn_scope_location);
        hashMap.put("https://www.googleapis.com/auth/fitness.location.read", valueOf4);
        hashMap.put("https://www.googleapis.com/auth/fitness.location.write", valueOf4);
        Integer valueOf5 = Integer.valueOf((int) C0126R.C0127drawable.auth_fitness_icn_scope_sensor);
        hashMap.put("https://www.googleapis.com/auth/fitness.body.read", valueOf5);
        hashMap.put("https://www.googleapis.com/auth/fitness.body.write", valueOf5);
        Integer valueOf6 = Integer.valueOf((int) C0126R.C0127drawable.auth_fitness_icn_scope_nutrition);
        hashMap.put("https://www.googleapis.com/auth/fitness.nutrition.read", valueOf6);
        hashMap.put("https://www.googleapis.com/auth/fitness.nutrition.write", valueOf6);
        f23460e = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static final String m17470a(String str, String str2) {
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        return f23458c.matcher(str).replaceAll(str2);
    }

    /* renamed from: a */
    private final void m17473a(String str) {
        TextView textView = this.f23468k;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(C0126R.color.plus_auth_scope_fragment_circles_text));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, str.length(), 18);
        textView.setText(spannableStringBuilder);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    super.onActivityResult(i, i2, intent);
                } else if (i2 == -1) {
                    this.f23469l.mo7898a(intent.getLongExtra("detail_end_time", 0) - intent.getLongExtra("detail_start_time", 0));
                    this.f23469l.mo7899a(intent.getBooleanExtra("detail_screen_scrollable", false), intent.getBooleanExtra("scroll_screen_end", false));
                }
            } else if (i2 == -1) {
                rqa a = rqg.m34262a(intent);
                this.f23466i = a.mo25016c();
                this.f23461a.f10893n = a.mo25010a();
                this.f23461a.f10894o = a.mo25015b();
                this.f23461a.f10887h = mo14210a();
            }
        } else if (intent != null) {
            ArrayList arrayList = new ArrayList(((Audience) intent.getParcelableExtra("pacl_audience")).f30287b);
            this.f23462b = arrayList;
            m17473a(m17471a(arrayList));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f23469l = (jxo) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnScopeDetailsSelectedListener"));
        }
    }

    public void onClick(View view) {
        if (this.f23461a.mo7700a()) {
            String a = m17470a(this.f23461a.f10883d, this.f23463f);
            String str = this.f23464g;
            String str2 = this.f23465h;
            ScopeData scopeData = this.f23461a;
            sfd sfd = new sfd();
            sfd.mo25467a(this.f23462b);
            Audience a2 = sfd.mo25465a();
            Intent className = new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.uiflows.consent.AuthAudienceViewActivity");
            className.putExtra("scope_description", a);
            className.putExtra("account_name", str);
            className.putExtra("calling_package", str2);
            className.putExtra("scope_data", scopeData);
            className.putExtra("pacl_audience", a2);
            startActivityForResult(className, 1);
            return;
        }
        ScopeData scopeData2 = this.f23461a;
        if (scopeData2.f10886g) {
            rqa a3 = rqg.m34261a();
            a3.mo25007a(this.f23464g);
            a3.mo25013b((List) this.f23466i);
            a3.mo25011b(m17470a(this.f23461a.f10888i, this.f23463f));
            a3.mo25018c(this.f23461a.f10890k);
            a3.mo25020d(this.f23461a.f10891l);
            a3.mo25021e(this.f23461a.f10892m);
            a3.mo25009a(this.f23461a.f10893n);
            a3.mo25014b(this.f23461a.f10894o);
            a3.mo25019d("80");
            Intent intent = a3.f43513a;
            if (!getActivity().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                startActivityForResult(intent, 2);
                return;
            }
            return;
        }
        String str3 = scopeData2.f10883d;
        String str4 = this.f23465h;
        Intent className2 = new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.uiflows.consent.AuthScopeDetailsActivity");
        className2.putExtra("scope_details", str3);
        className2.putExtra("calling_package", str4);
        startActivityForResult(className2, 3);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f23463f = arguments.getString("app_name");
        this.f23464g = arguments.getString("account_name");
        arguments.getInt("scope_index");
        this.f23465h = arguments.getString("calling_package");
        if (bundle != null) {
            this.f23466i = bundle.getParcelableArrayList("facl_audience");
            this.f23462b = bundle.getParcelableArrayList("pacl_audience");
            this.f23461a = (ScopeData) bundle.getParcelable("scope_data");
            return;
        }
        this.f23461a = (ScopeData) arguments.getParcelable("scope_data");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String[] split;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ArrayList arrayList = null;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.auth_consent_scope_fragment, (ViewGroup) null);
        this.f23467j = (TextView) inflate.findViewById(C0126R.C0129id.scope_description_label);
        this.f23468k = (TextView) inflate.findViewById(C0126R.C0129id.pacl_visible_circles);
        this.f23467j.setText(Html.fromHtml(this.f23461a.f10882c.trim().replaceAll("\n", "<br/>")));
        this.f23467j.setMovementMethod(LinkMovementMethod.getInstance());
        this.f23467j.setClickable(true);
        this.f23467j.setOnClickListener(this);
        inflate.findViewById(C0126R.C0129id.scope_fragment_layout).setOnClickListener(this);
        Resources resources = getResources();
        if (this.f23461a.mo7700a()) {
            ((ImageView) inflate.findViewById(C0126R.C0129id.scope_icon)).setImageDrawable(resources.getDrawable(C0126R.C0127drawable.auth_pacl_icon));
            inflate.findViewById(C0126R.C0129id.scope_details_icon).setVisibility(0);
            this.f23468k.setVisibility(0);
            if (this.f23462b == null) {
                String str = this.f23461a.f10885f;
                if (str != null) {
                    try {
                        arrayList = new ArrayList(anxi.m65493a(sqd.m35971c(str)));
                    } catch (Exception e) {
                        Log.e("AuthScopeFragment", str.length() == 0 ? new String("Failed to parse audience from roster: ") : "Failed to parse audience from roster: ".concat(str), e);
                        arrayList = new ArrayList();
                        arrayList.add(AudienceMember.m22642c("myCircles", getResources().getString(C0126R.string.common_chips_label_your_circles)));
                    }
                }
                this.f23462b = arrayList;
            }
            m17473a(m17471a(this.f23462b));
        } else {
            ScopeData scopeData = this.f23461a;
            if (scopeData.f10886g) {
                ((ImageView) inflate.findViewById(C0126R.C0129id.scope_icon)).setImageDrawable(resources.getDrawable(C0126R.C0127drawable.plus_icn_scope_icon_facl));
                inflate.findViewById(C0126R.C0129id.scope_details_icon).setVisibility(0);
                if (this.f23466i == null) {
                    String str2 = this.f23461a.f10887h;
                    ArrayList arrayList2 = f23459d;
                    if (TextUtils.isEmpty(str2)) {
                        arrayList2 = new ArrayList();
                    } else {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            for (String str3 : str2.split(" ")) {
                                arrayList3.add(AudienceMember.m22640b(Long.toHexString(Long.parseLong(str3)), null));
                            }
                            if (!arrayList3.isEmpty()) {
                                arrayList2 = arrayList3;
                            }
                        } catch (NumberFormatException e2) {
                            Log.e("AuthScopeFragment", "Failed to parse audience from circle ID list.", e2);
                        }
                        this.f23461a.f10893n = true;
                    }
                    this.f23466i = arrayList2;
                }
                if (this.f23461a.mo7701b() && this.f23461a.f10889j) {
                    TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.warning);
                    textView.setVisibility(0);
                    textView.setText(this.f23461a.mo7702c());
                }
            } else if (scopeData.mo7701b()) {
                TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.warning);
                textView2.setVisibility(0);
                textView2.setText(this.f23461a.mo7702c());
            }
        }
        if (f23460e.get(this.f23461a.f10896q) != null) {
            ((ImageView) inflate.findViewById(C0126R.C0129id.scope_icon)).setImageDrawable(resources.getDrawable(((Integer) f23460e.get(this.f23461a.f10896q)).intValue()));
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("app_name", this.f23463f);
        bundle.putString("account_name", this.f23464g);
        bundle.putParcelable("scope_data", this.f23461a);
        bundle.putParcelableArrayList("pacl_audience", this.f23462b);
        bundle.putParcelableArrayList("facl_audience", this.f23466i);
    }

    /* renamed from: a */
    private final String m17471a(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return getString(C0126R.string.common_chips_label_only_you);
        }
        AudienceMember audienceMember = null;
        AudienceMember audienceMember2 = null;
        AudienceMember audienceMember3 = null;
        for (int i = 0; i < arrayList.size(); i++) {
            AudienceMember audienceMember4 = (AudienceMember) arrayList.get(i);
            if (audienceMember4.f30292b == 1) {
                int i2 = audienceMember4.f30293c;
                if (i2 == 1) {
                    audienceMember = audienceMember4;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        audienceMember2 = audienceMember4;
                    }
                } else if (audienceMember4.mo17846b()) {
                    audienceMember3 = audienceMember4;
                }
            }
        }
        if (audienceMember != null) {
            return getString(C0126R.string.auth_plus_scope_fragment_public_label);
        }
        if (audienceMember2 != null) {
            return getString(C0126R.string.auth_plus_scope_fragment_extended_circles_label);
        }
        if (audienceMember3 != null) {
            return getString(C0126R.string.common_chips_label_your_circles);
        }
        if (arrayList.size() == 1) {
            return ((AudienceMember) arrayList.get(0)).f30296f;
        }
        return getString(C0126R.string.auth_plus_scope_fragment_mixed_label);
    }

    /* renamed from: a */
    public static jxp m17472a(int i, String str, String str2, String str3, ScopeData scopeData) {
        Bundle bundle = new Bundle();
        bundle.putInt("scope_index", i);
        bundle.putString("app_name", str);
        bundle.putString("account_name", str2);
        bundle.putString("calling_package", str3);
        bundle.putParcelable("scope_data", scopeData);
        jxp jxp = new jxp();
        jxp.setArguments(bundle);
        return jxp;
    }

    /* renamed from: a */
    public final String mo14210a() {
        long j;
        ArrayList arrayList = this.f23466i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                String str = ((AudienceMember) arrayList.get(i)).f30294d;
                if (str.length() <= 16) {
                    if (str.length() != 16) {
                        j = Long.parseLong(str, 16);
                    } else {
                        j = (Long.parseLong(str.substring(0, 8), 16) << 32) | Long.parseLong(str.substring(8), 16);
                    }
                    sb.append(Long.toString(j));
                    i++;
                    if (i < size) {
                        sb.append(" ");
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37);
                    sb2.append("Invalid input: ");
                    sb2.append(str);
                    sb2.append(" exceeds 16 characters");
                    throw new NumberFormatException(sb2.toString());
                }
            }
            return sb.toString();
        } catch (Exception e) {
            Log.e("AuthScopeFragment", "Failed to convert audience to circle ID list", e);
            return null;
        }
    }
}
