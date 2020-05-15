package com.google.android.gms.googlehelp.helpactivities;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmailChimeraActivity extends abbi implements aaue, abaf {

    /* renamed from: b */
    public String f78934b;

    /* renamed from: c */
    private LinearLayout f78935c;

    /* renamed from: d */
    private TextView f78936d;

    /* renamed from: e */
    private RelativeLayout f78937e;

    /* renamed from: f */
    private MenuItem f78938f;

    /* renamed from: g */
    private List f78939g;

    /* renamed from: h */
    private String f78940h;

    /* renamed from: i */
    private bqgj f78941i;

    /* renamed from: a */
    public static LinearLayout.LayoutParams m66517a(Context context) {
        Resources resources = context.getResources();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, resources.getDimensionPixelSize(C0126R.dimen.gh_contact_vertical_padding), 0, 0);
        return layoutParams;
    }

    /* renamed from: e */
    private final void m66519e() {
        mo43314a(true);
        abak abak = new abak(this);
        abaj abaj = new abaj(this);
        HelpConfig helpConfig = this.f56986y;
        abcr abcr = this.f56987z;
        ArrayList arrayList = new ArrayList();
        String str = this.f56986y.mo43245t().f170985b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f78940h)) {
            arrayList.add(aatb.m46961a(str, this.f78940h));
        }
        List list = this.f78939g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aatx aatx = (aatx) list.get(i);
            if (((View) aatx).getVisibility() == 0) {
                arrayList.addAll(aatx.mo31789c());
            }
        }
        if (this.f78941i == null) {
            this.f78941i = snp.m35702a(10);
        }
        this.f78941i.execute(new aavi(this, helpConfig, arrayList, abak, abaj, abcr));
    }

    /* renamed from: i */
    public final aaxx mo18628i() {
        throw null;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView
     arg types: [com.google.android.gms.googlehelp.helpactivities.EmailChimeraActivity, java.lang.String, int]
     candidates:
      aatj.a(android.view.View, int, android.view.View$OnClickListener):void
      aatj.a(android.widget.EditText, java.lang.String, boolean):void
      aatj.a(android.widget.TextView, abbi, bzps):void
      aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02f1  */
    public final void onCreate(Bundle bundle) {
        View view;
        int i;
        bxwc bxwc;
        int i2;
        String str;
        super.onCreate(bundle);
        setTheme(C0126R.style.gh_LightActivityStyle);
        boolean z = true;
        aarq.m46801a(this, true);
        if (!aaya.m47228a(cefe.m136708b())) {
            aatj.m46985a(this);
        } else {
            setRequestedOrientation(1);
        }
        this.f78939g = new ArrayList();
        LinearLayout linearLayout = new LinearLayout(this);
        int i3 = -2;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.gh_contact_form_padding);
        int i4 = 0;
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0);
        linearLayout.setOrientation(1);
        this.f78935c = linearLayout;
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        scrollView.addView(this.f78935c);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(scrollView);
        setContentView(linearLayout2);
        bzqf t = this.f56986y.mo43245t();
        if (t != null) {
            if (!t.f170986c.isEmpty()) {
                str = Html.fromHtml(t.f170986c).toString();
            } else {
                str = getString(C0126R.string.gh_cuf_confirmation_message);
            }
            this.f78934b = str;
        }
        LinearLayout linearLayout3 = this.f78935c;
        TextView a = aatj.m46978a((Context) this, getResources().getString(C0126R.string.gh_request_as), false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(C0126R.dimen.gh_contact_option_account_info_vertical_spacing));
        a.setLayoutParams(layoutParams);
        a.setTextSize((float) getResources().getInteger(C0126R.integer.gh_contact_account_info_font_size));
        linearLayout3.addView(a);
        LinearLayout linearLayout4 = this.f78935c;
        TextView a2 = aatj.m46978a((Context) this, this.f56986y.f78829d.name, false);
        a2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        a2.setTextSize((float) getResources().getInteger(C0126R.integer.gh_contact_account_email_font_size));
        linearLayout4.addView(a2);
        if (!t.f170987d.isEmpty()) {
            LinearLayout linearLayout5 = this.f78935c;
            TextView a3 = aatj.m46978a((Context) this, t.f170987d, true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            a3.setLayoutParams(layoutParams2);
            a3.setTextSize((float) getResources().getInteger(C0126R.integer.gh_contact_title_font_size));
            linearLayout5.addView(a3);
        }
        if (!t.f170988e.isEmpty()) {
            this.f78935c.addView(m66518a(t.f170988e, true));
        }
        aast aast = new aast();
        ArrayList arrayList = new ArrayList();
        bxwc bxwc2 = t.f170984a;
        int size = bxwc2.size();
        int i5 = 0;
        while (i5 < size) {
            bzqi bzqi = (bzqi) bxwc2.get(i5);
            aatr aatr = new aatr(this);
            aatr.setLayoutParams(m66517a(this));
            aatr.setOrientation(z ? 1 : 0);
            aatr.addView(aatj.m46987b(this, stm.m36299a(bzqi.f170997c), bzqi.f170998d));
            if (!bzqi.f171003i.isEmpty()) {
                aatr.addView(aatj.m46978a(this, bzqi.f171003i, z));
            }
            if (!bzqi.f170996b.isEmpty() && bzqi.f171009o) {
                bzqf t2 = this.f56986y.mo43245t();
                int a4 = bzqh.m126040a(bzqi.f170999e);
                if (a4 == 0) {
                    a4 = 1;
                }
                switch (a4) {
                    case 1:
                    case 8:
                        if (bzqi.f170996b.equals(t2.f170985b)) {
                            this.f78940h = bzqi.f171001g;
                        }
                        if (!bzqi.f171001g.isEmpty()) {
                            view = aatj.m46978a(this, bzqi.f171001g, z);
                            break;
                        }
                        break;
                    case 2:
                    case 3:
                    case 16:
                    case 18:
                        view = new aauj(this, aatr, bzqi);
                        break;
                    case 4:
                    case 12:
                    case 13:
                        view = new aauu(this, aatr, bzqi);
                        break;
                    case 5:
                        view = new aaug(this, bzqi);
                        break;
                    case 6:
                        view = new aaub(this, aatr, bzqi);
                        break;
                    case 7:
                        view = new aaun(this, aatr, bzqi);
                        break;
                    case 9:
                    case 14:
                    case 15:
                    case 17:
                    default:
                        view = null;
                        break;
                    case 10:
                        if (bzqi.f170996b.equals(t2.f170985b)) {
                            this.f78940h = bzqi.f171001g;
                        }
                        view = null;
                        break;
                    case 11:
                        view = new aaur(this, aatr, bzqi);
                        break;
                }
                if (view == null) {
                    if (view instanceof aatx) {
                        this.f78939g.add((aatx) view);
                    }
                    if (!(view instanceof aaug)) {
                        i2 = -1;
                    } else {
                        i2 = -2;
                    }
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i3);
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0126R.dimen.gh_contact_element_horizontal_padding);
                    layoutParams3.setMargins(dimensionPixelSize2, i4, dimensionPixelSize2, i4);
                    view.setLayoutParams(layoutParams3);
                    aatr.addView(view);
                    if (!bzqi.f171004j.isEmpty()) {
                        aatr.addView(aatj.m46978a(this, bzqi.f171004j, z));
                    }
                } else {
                    aatr = null;
                }
                if (aatr == null) {
                    this.f78935c.addView(aatr);
                    if (bzqi.f171007m.size() > 0) {
                        bxwc bxwc3 = bzqi.f171007m;
                        LinearLayout linearLayout6 = this.f78935c;
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size2 = bxwc3.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            ArrayList arrayList3 = new ArrayList();
                            bxwc bxwc4 = bxwc2;
                            String[] split = ((String) bxwc3.get(i6)).split("\\+");
                            int length = split.length;
                            bxwc bxwc5 = bxwc3;
                            int i7 = 0;
                            while (i7 < length) {
                                int i8 = length;
                                String[] strArr = split;
                                String[] split2 = split[i7].split("\\:");
                                int i9 = size;
                                if (split2.length == 2) {
                                    aavk aavk = (aavk) linearLayout6.findViewWithTag(split2[0]);
                                    arrayList3.add(Pair.create(aavk, split2[1]));
                                    if (aavk != null) {
                                        hashSet.add(aavk);
                                    }
                                }
                                i7++;
                                length = i8;
                                split = strArr;
                                size = i9;
                            }
                            arrayList2.add(arrayList3);
                            i6++;
                            bxwc2 = bxwc4;
                            bxwc3 = bxwc5;
                            size = size;
                        }
                        bxwc = bxwc2;
                        i = size;
                        aatp aatp = new aatp(hashSet, arrayList2);
                        aavg aavg = new aavg(aatr, aatp.f56567b);
                        arrayList.add(aavg);
                        for (aavk aavk2 : aatp.f56566a) {
                            aast.mo31751a(aavk2, aavg);
                        }
                    } else {
                        bxwc = bxwc2;
                        i = size;
                    }
                } else {
                    bxwc = bxwc2;
                    i = size;
                }
                i5++;
                bxwc2 = bxwc;
                size = i;
                z = true;
                i3 = -2;
                i4 = 0;
            }
            view = null;
            if (view == null) {
            }
            if (aatr == null) {
            }
            i5++;
            bxwc2 = bxwc;
            size = i;
            z = true;
            i3 = -2;
            i4 = 0;
        }
        for (Map.Entry entry : aast.entrySet()) {
            ((aavk) entry.getKey()).mo31792a((List) entry.getValue());
        }
        aavg.m47063a(arrayList);
        this.f78935c.addView(m66518a(getString(C0126R.string.gh_cuf_required_field_description), false));
        TextView textView = new TextView(this);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(C0126R.dimen.gh_legal_text_horizontal_padding);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(C0126R.dimen.gh_legal_text_vertical_padding);
        textView.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        textView.setBackgroundColor(getResources().getColor(C0126R.color.google_grey50));
        textView.setLineSpacing((float) getResources().getDimensionPixelSize(C0126R.dimen.gh_legal_text_extra_line_spacing), 1.0f);
        textView.setTextColor(getResources().getColor(C0126R.color.google_grey800));
        textView.setTextSize(0, (float) getResources().getDimensionPixelSize(C0126R.dimen.gh_legal_text_font_size));
        aatj.m46983a(textView, this, bzps.EMAIL);
        this.f78936d = textView;
        linearLayout2.addView(textView);
        ProgressBar progressBar = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(13);
        progressBar.setLayoutParams(layoutParams4);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        relativeLayout.setGravity(17);
        relativeLayout.addView(progressBar);
        relativeLayout.setVisibility(8);
        this.f78937e = relativeLayout;
        linearLayout2.addView(relativeLayout);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.gh_email_activity_actions, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.gh_contact_action_submit);
        this.f78938f = findItem;
        findItem.setIcon(aayh.m47232a(this, aayi.m47270b() ? aayi.m47263a(this, C0126R.attr.gh_primaryBlueColor) : C1133kh.m17843b(this, C0126R.color.google_blue600)));
        ArrayList arrayList = new ArrayList();
        List list = this.f78939g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(((aatx) list.get(i)).mo31788bz());
        }
        new aave(arrayList, this.f78938f).mo31824a();
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.gh_contact_action_submit) {
            return super.onOptionsItemSelected(menuItem);
        }
        m66519e();
        return true;
    }

    /* renamed from: a */
    private final TextView m66518a(String str, boolean z) {
        TextView a = aatj.m46978a(this, str, z);
        a.setLayoutParams(m66517a(this));
        return a;
    }

    /* renamed from: a */
    public final void mo31969a(Bundle bundle) {
        m66519e();
    }

    /* renamed from: a */
    public final void mo31798a(String str, int i, int i2, int i3) {
        try {
            aaug aaug = (aaug) this.f78935c.findViewWithTag(str);
            if (aaug != null) {
                aaug.setText(DateFormat.getDateInstance().format(new GregorianCalendar(i, i2, i3).getTime()));
            }
        } catch (ClassCastException e) {
        }
    }

    /* renamed from: a */
    public final void mo43314a(boolean z) {
        if (!z) {
            this.f78935c.setVisibility(0);
            this.f78936d.setVisibility(0);
            this.f78937e.setVisibility(8);
        } else {
            this.f78935c.setVisibility(8);
            this.f78936d.setVisibility(8);
            this.f78937e.setVisibility(0);
        }
        this.f78938f.setEnabled(!z);
    }
}
