package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: aqts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqts {

    /* renamed from: a */
    public final tim f86787a;

    public aqts(Context context, BaseCardView baseCardView, bzih bzih, String str, String str2, String str3, tie tie, tim tim) {
        int i;
        Intent intent;
        Context context2 = context;
        BaseCardView baseCardView2 = baseCardView;
        bzih bzih2 = bzih;
        String str4 = str;
        this.f86787a = tim;
        if (bzih2.f170181a.size() != 0) {
            if (!cgnz.m146325b() || !cgmy.f187331a.mo6606a().mo84130a()) {
                baseCardView2.mo59007a((int) C0126R.string.profile_posts_title);
            } else {
                baseCardView2.mo59007a((int) C0126R.string.gm_profile_posts_title);
            }
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.nested_posts_entry, (ViewGroup) null);
            int childCount = viewGroup.getChildCount();
            int i2 = 320;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 < bzih2.f170181a.size()) {
                    if (i4 >= childCount) {
                        break;
                    }
                    bzif bzif = (bzif) bzih2.f170181a.get(i4);
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i4);
                    viewGroup2.setVisibility(i3);
                    if ((bzif.f170169a & 2) != 0) {
                        bzig bzig = bzif.f170171c;
                        if (!(bzig == null ? bzig.f170175b : bzig).f170177a.isEmpty()) {
                            bzig bzig2 = bzif.f170171c;
                            tie.mo26557a((bzig2 == null ? bzig.f170175b : bzig2).f170177a, i2, new aqtp(viewGroup2));
                            i2++;
                        }
                    }
                    if ((bzif.f170169a & 32) != 0) {
                        i = i2;
                        ((TextView) viewGroup2.findViewById(C0126R.C0129id.text)).setText(DateFormat.getDateInstance(1).format(new Date(bzif.f170173e)));
                    } else {
                        i = i2;
                    }
                    if (!bzif.f170170b.isEmpty()) {
                        SpannableString spannableString = new SpannableString(tey.m36889a(bzif.f170170b).toString());
                        tey.m36892a(spannableString, C1133kh.m17843b(context2, C0126R.color.card_entry_light_text_color));
                        ((TextView) viewGroup2.findViewById(C0126R.C0129id.subtext)).setText(spannableString.toString());
                    }
                    if (!bzif.f170172d.isEmpty()) {
                        String str5 = bzif.f170172d;
                        if (!TextUtils.isEmpty(str5)) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(str5));
                            aqqk.m71973a(context2, intent, str4, str2);
                        } else {
                            intent = null;
                        }
                        viewGroup2.setOnClickListener(new aqtq(this, intent, context2));
                    }
                    i4++;
                    bzih2 = bzih;
                    i2 = i;
                    i3 = 0;
                } else {
                    break;
                }
            }
            baseCardView2.mo59009a(viewGroup);
            String e = cgor.f187408a.mo6606a().mo84196e();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(String.format(e, str3)));
            Intent intent3 = (Intent) intent2.clone();
            intent3.setPackage("com.google.android.apps.plus");
            if (context.getPackageManager().resolveActivity(intent3, 0) != null) {
                if (str4 != null) {
                    acxv.m49971a(context2, intent3, TextUtils.isEmpty(str2) ? AccountData.m66749a(str) : AccountData.m66750a(str, str2));
                }
                intent2 = intent3;
            }
            if (intent2 != null && intent2.resolveActivity(context.getPackageManager()) != null) {
                baseCardView2.mo59008a((int) C0126R.string.posts_see_all, (int) C0126R.C0127drawable.quantum_ic_google_plus_vd_theme_24, new aqtr(this, intent2, context2));
                baseCardView2.findViewById(C0126R.C0129id.bottom_button).setContentDescription(context2.getString(C0126R.string.posts_see_all_content_description));
                return;
            }
            return;
        }
        baseCardView2.setVisibility(8);
    }
}
