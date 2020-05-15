package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.contactsheet.card.common.FlowLayout;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: aqtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqtb implements aqtc, aquo {

    /* renamed from: a */
    public final Context f86734a;

    /* renamed from: b */
    public final tim f86735b;

    /* renamed from: c */
    private final bzhe f86736c;

    /* renamed from: d */
    private final aquk f86737d;

    /* renamed from: e */
    private final tie f86738e;

    /* renamed from: f */
    private final aqup f86739f;

    /* renamed from: g */
    private int f86740g = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;

    /* renamed from: h */
    private boolean f86741h;

    /* renamed from: i */
    private boolean f86742i;

    public aqtb(Context context, BaseCardView baseCardView, bzhe bzhe, tie tie, tim tim, Bundle bundle) {
        String str;
        this.f86736c = bzhe;
        this.f86734a = context;
        this.f86738e = tie;
        this.f86735b = tim;
        this.f86737d = new aquk(context, C1391tv.m20459b(context, C0126R.C0127drawable.group_divider));
        if (this.f86736c.f170036d.size() != 0) {
            String str2 = ((bzgy) this.f86736c.f170036d.get(0)).f170005a;
            if (!TextUtils.isEmpty(str2)) {
                this.f86741h = true;
                aqta aqta = new aqta(this.f86734a, C0126R.string.profile_about_introduction, true);
                aqta.mo48158a(new aqsz(this, str2));
                this.f86737d.mo48158a(aqta);
            }
        }
        if (this.f86736c.f170037e.size() != 0) {
            this.f86741h = true;
            aqta aqta2 = new aqta(this.f86734a, C0126R.string.profile_about_birthday, true);
            aqta2.mo48158a(m72053a(m72055a(((bzgu) this.f86736c.f170037e.get(0)).f169984a)));
            this.f86737d.mo48158a(aqta2);
        }
        if (this.f86736c.f170038f.size() != 0) {
            this.f86742i = true;
            aqta aqta3 = new aqta(this.f86734a, C0126R.string.profile_about_gender, false);
            if (((bzgw) this.f86736c.f170038f.get(0)).f169996b.isEmpty()) {
                aqta3.mo48158a(m72053a(((bzgw) this.f86736c.f170038f.get(0)).f169995a));
            } else {
                aqta3.mo48158a(m72053a(((bzgw) this.f86736c.f170038f.get(0)).f169996b));
            }
            this.f86737d.mo48158a(aqta3);
        }
        if (this.f86736c.f170033a.size() != 0) {
            this.f86742i = true;
            aqta aqta4 = new aqta(this.f86734a, C0126R.string.profile_about_event, false);
            bxwc bxwc = this.f86736c.f170033a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bzgv bzgv = (bzgv) bxwc.get(i);
                aqta4.mo48158a(m72054a(m72055a(bzgv.f169990b), bzgv.f169992d));
            }
            this.f86737d.mo48158a(aqta4);
        }
        if (this.f86736c.f170040h.size() != 0) {
            this.f86741h = true;
            aqta aqta5 = new aqta(this.f86734a, C0126R.string.profile_links_card_title, true);
            Context context2 = this.f86734a;
            FlowLayout flowLayout = new FlowLayout(context2, context2.getResources().getDimensionPixelSize(C0126R.dimen.flow_layout_line_spacing), this.f86734a.getResources().getDimensionPixelSize(C0126R.dimen.flow_layout_item_spacing));
            flowLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int dimensionPixelOffset = this.f86734a.getResources().getDimensionPixelOffset(C0126R.dimen.card_entry_padding_start);
            flowLayout.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            for (int i2 = 0; i2 < this.f86736c.f170040h.size(); i2++) {
                bzgz bzgz = (bzgz) this.f86736c.f170040h.get(i2);
                if (!bzgz.f170010b.isEmpty()) {
                    int i3 = i2 + 1;
                    if (bzgz.f170009a.isEmpty()) {
                        str = bzgz.f170010b;
                        if (URLUtil.isValidUrl(str)) {
                            str = Uri.parse(bzgz.f170010b).getSchemeSpecificPart().substring(2);
                        }
                    } else {
                        str = bzgz.f170009a;
                    }
                    str = str.length() > 18 ? String.valueOf(str.substring(0, 18)).concat("...") : str;
                    TextView textView = (TextView) LayoutInflater.from(this.f86734a).inflate((int) C0126R.C0128layout.single_link, (ViewGroup) null);
                    textView.setText(str);
                    textView.setContentDescription(this.f86734a.getString(C0126R.string.link_content_description, Integer.valueOf(i3), Integer.valueOf(this.f86736c.f170040h.size()), str));
                    int dimensionPixelSize = this.f86734a.getResources().getDimensionPixelSize(C0126R.dimen.entry_icon_size);
                    tie tie2 = this.f86738e;
                    String valueOf = String.valueOf(bzgz.f170010b);
                    String str3 = valueOf.length() == 0 ? new String("https://s2.googleusercontent.com/s2/favicons?sz=32&domain_url=") : "https://s2.googleusercontent.com/s2/favicons?sz=32&domain_url=".concat(valueOf);
                    int i4 = this.f86740g;
                    this.f86740g = i4 + 1;
                    tie2.mo26557a(str3, i4, new aqsw(this, dimensionPixelSize, textView));
                    textView.setOnClickListener(new aqsx(this, new Intent("android.intent.action.VIEW", Uri.parse(tey.m36894b(bzgz.f170010b)))));
                    textView.setOnLongClickListener(new aqsy(this, bzgz));
                    flowLayout.addView(textView);
                }
            }
            aqta5.mo48158a(new aquq(flowLayout));
            this.f86737d.mo48158a(aqta5);
        }
        if (this.f86736c.f170034b.size() != 0) {
            this.f86742i = true;
            aqta aqta6 = new aqta(this.f86734a, C0126R.string.profile_about_relations, false);
            bxwc bxwc2 = this.f86736c.f170034b;
            int size2 = bxwc2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                bzhb bzhb = (bzhb) bxwc2.get(i5);
                aqta6.mo48158a(m72054a(bzhb.f170019b, bzhb.f170018a));
            }
            this.f86737d.mo48158a(aqta6);
        }
        if (this.f86736c.f170035c.size() != 0) {
            this.f86742i = true;
            aqta aqta7 = new aqta(this.f86734a, C0126R.string.profile_about_instant_messaging, false);
            bxwc bxwc3 = this.f86736c.f170035c;
            int size3 = bxwc3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                bzgx bzgx = (bzgx) bxwc3.get(i6);
                aqta7.mo48158a(m72054a(bzgx.f170001b, bzgx.f170000a));
            }
            this.f86737d.mo48158a(aqta7);
        }
        if (this.f86736c.f170042j.size() != 0) {
            this.f86742i = true;
            aqta aqta8 = new aqta(this.f86734a, C0126R.string.profile_about_internet_call, false);
            bxwc bxwc4 = this.f86736c.f170042j;
            int size4 = bxwc4.size();
            for (int i7 = 0; i7 < size4; i7++) {
                bzhc bzhc = (bzhc) bxwc4.get(i7);
                aqta8.mo48158a(m72054a(bzhc.f170023a, bzhc.f170024b));
            }
            this.f86737d.mo48158a(aqta8);
        }
        if (this.f86736c.f170041i.size() != 0) {
            this.f86742i = true;
            aqta aqta9 = new aqta(this.f86734a, C0126R.string.profile_about_custom, false);
            bxwc bxwc5 = this.f86736c.f170041i;
            int size5 = bxwc5.size();
            for (int i8 = 0; i8 < size5; i8++) {
                bzhd bzhd = (bzhd) bxwc5.get(i8);
                aqta9.mo48158a(m72054a(bzhd.f170029b, bzhd.f170028a));
            }
            this.f86737d.mo48158a(aqta9);
        }
        if (this.f86736c.f170039g.size() != 0) {
            String str4 = ((bzha) this.f86736c.f170039g.get(0)).f170014a;
            if (!TextUtils.isEmpty(str4)) {
                this.f86741h = true;
                aqta aqta10 = new aqta(this.f86734a, C0126R.string.profile_notes_card_title, true);
                aqta10.mo48158a(new aqsz(this, str4));
                this.f86737d.mo48158a(aqta10);
            }
        }
        if (this.f86737d.mo48159d()) {
            this.f86739f = null;
            baseCardView.setVisibility(8);
            return;
        }
        this.f86739f = new aqup(baseCardView, this.f86737d, this, this.f86741h && this.f86742i, bundle != null && bundle.getBoolean("aboutCardController"));
    }

    /* renamed from: a */
    private final aquq m72053a(String str) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f86734a).inflate((int) C0126R.C0128layout.card_entry_text_only, (ViewGroup) null);
        ((TextView) viewGroup.findViewById(C0126R.C0129id.text)).setText(str);
        aquq aquq = new aquq(viewGroup);
        aquq.mo48164a(str);
        return aquq;
    }

    /* renamed from: b */
    public final void mo48140b() {
        this.f86735b.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_ABOUT_CARD);
    }

    /* renamed from: a */
    private final aquq m72054a(String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f86734a).inflate((int) C0126R.C0128layout.text_with_side_label, (ViewGroup) null);
        int dimensionPixelOffset = this.f86734a.getResources().getDimensionPixelOffset(C0126R.dimen.card_entry_padding_start);
        viewGroup.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        ((TextView) viewGroup.findViewById(C0126R.C0129id.text)).setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.spaced_bullet);
            textView.setVisibility(0);
            textView.setText("•");
            TextView textView2 = (TextView) viewGroup.findViewById(C0126R.C0129id.subtext);
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        aquq aquq = new aquq(viewGroup);
        aquq.mo48164a(str);
        return aquq;
    }

    /* renamed from: a */
    private final String m72055a(long j) {
        DateFormat dateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeInMillis(j);
        if (gregorianCalendar.get(0) == 0 && gregorianCalendar.get(1) == 1) {
            dateFormat = tew.m36880a(this.f86734a);
        } else {
            dateFormat = android.text.format.DateFormat.getLongDateFormat(this.f86734a);
        }
        dateFormat.setCalendar(gregorianCalendar);
        return dateFormat.format(gregorianCalendar.getTime());
    }

    /* renamed from: a */
    public final void mo48139a() {
        this.f86735b.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_ABOUT_CARD);
    }

    /* renamed from: a */
    public final void mo48130a(Bundle bundle) {
        aqup aqup = this.f86739f;
        if (aqup != null) {
            bundle.putBoolean("aboutCardController", aqup.f86846b);
        }
    }
}
