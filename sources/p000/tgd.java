package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.identity.accounts.api.AccountData;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: tgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgd implements C0038ax {

    /* renamed from: a */
    public final View f45914a;

    /* renamed from: b */
    public final tie f45915b;

    /* renamed from: c */
    public final tim f45916c;

    /* renamed from: d */
    private final ViewGroup f45917d;

    /* renamed from: e */
    private final CardButton f45918e;

    /* renamed from: f */
    private final List f45919f = new ArrayList();

    public tgd(View view, tie tie, tim tim) {
        this.f45914a = view;
        this.f45917d = (ViewGroup) view.findViewById(C0126R.C0129id.posts);
        this.f45918e = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45915b = tie;
        this.f45916c = tim;
        view.setVisibility(8);
        for (int i = 0; i < this.f45917d.getChildCount(); i++) {
            this.f45919f.add(new tgc(this, this.f45917d.getChildAt(i)));
        }
    }

    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        bnre bnre;
        Intent intent;
        ViewGroup viewGroup = (ViewGroup) this.f45914a.findViewById(C0126R.C0129id.posts);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setVisibility(4);
        }
        this.f45914a.setVisibility(8);
        if (bmxv.mo66813a() && !((thw) bmxv.mo66814b()).mo26542a().isEmpty()) {
            thw thw = (thw) bmxv.mo66814b();
            bnre i2 = thw.mo26542a().listIterator();
            List list = this.f45919f;
            int size = list.size();
            int i3 = 320;
            int i4 = 0;
            while (i4 < size) {
                tgc tgc = (tgc) list.get(i4);
                if (i2.hasNext()) {
                    int i5 = i3 + 1;
                    bzif bzif = (bzif) i2.next();
                    bmxv c = thw.mo26544c();
                    bmxv d = thw.mo26545d();
                    if ((bzif.f170169a & 2) != 0) {
                        bzig bzig = bzif.f170171c;
                        if (bzig == null) {
                            bzig = bzig.f170175b;
                        }
                        if (!bzig.f170177a.isEmpty()) {
                            tie tie = tgc.f45913e.f45915b;
                            bzig bzig2 = bzif.f170171c;
                            if (bzig2 == null) {
                                bzig2 = bzig.f170175b;
                            }
                            tie.mo26557a(bzig2.f170177a, i3, new tga(tgc));
                        }
                    }
                    if (!bzif.f170170b.isEmpty()) {
                        SpannableString spannableString = new SpannableString(tey.m36889a(bzif.f170170b).toString());
                        tey.m36892a(spannableString, -1);
                        tgc.f45911c.setText(spannableString.toString());
                    }
                    if ((bzif.f170169a & 32) == 0 || bzif.f170173e == 0) {
                        bnre = i2;
                    } else {
                        bnre = i2;
                        tgc.f45912d.setText(DateFormat.getDateInstance(1).format(new Date(bzif.f170173e)));
                    }
                    if (!bzif.f170172d.isEmpty()) {
                        String str = bzif.f170172d;
                        Context context = tgc.f45913e.f45914a.getContext();
                        if (!TextUtils.isEmpty(str)) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                            PackageManager packageManager = context.getPackageManager();
                            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ResolveInfo next = it.next();
                                if (!"com.android.chrome".equals(next.activityInfo.packageName) && !"com.android.browser".equals(next.activityInfo.packageName) && packageManager.checkSignatures("com.google.android.gms", next.activityInfo.packageName) == 0) {
                                    intent.setPackage(next.activityInfo.packageName);
                                    if (c.mo66813a() && !((String) c.mo66814b()).isEmpty()) {
                                        acxv.m49971a(context, intent, (!d.mo66813a() || ((String) d.mo66814b()).isEmpty()) ? AccountData.m66749a((String) c.mo66814b()) : AccountData.m66750a((String) c.mo66814b(), (String) d.mo66814b()));
                                    }
                                }
                            }
                        } else {
                            intent = null;
                        }
                        tgc.f45909a.setOnClickListener(new tgb(tgc, intent));
                    }
                    tgc.mo26484a(0);
                    i3 = i5;
                } else {
                    bnre = i2;
                    tgc.mo26484a(4);
                }
                i4++;
                i2 = bnre;
            }
            this.f45918e.setVisibility(8);
            if (thw.mo26543b().mo66813a() && !TextUtils.isEmpty((CharSequence) thw.mo26543b().mo66814b())) {
                bmxv b = thw.mo26543b();
                bmxv c2 = thw.mo26544c();
                bmxv d2 = thw.mo26545d();
                Context context2 = this.f45914a.getContext();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(String.format("https://plus.google.com/%s", (String) b.mo66814b())));
                Intent intent3 = (Intent) intent2.clone();
                intent3.setPackage("com.google.android.apps.plus");
                if (context2.getPackageManager().resolveActivity(intent3, 0) != null) {
                    if (c2.mo66813a() && !((String) c2.mo66814b()).isEmpty()) {
                        acxv.m49971a(context2, intent3, (!d2.mo66813a() || ((String) d2.mo66814b()).isEmpty()) ? AccountData.m66749a((String) c2.mo66814b()) : AccountData.m66750a((String) c2.mo66814b(), (String) d2.mo66814b()));
                    }
                    intent2 = intent3;
                }
                if (intent2 == null || intent2.resolveActivity(this.f45914a.getContext().getPackageManager()) == null) {
                    this.f45918e.setVisibility(8);
                } else {
                    this.f45918e.mo17999a((int) C0126R.string.posts_see_all);
                    this.f45918e.setContentDescription(this.f45914a.getContext().getString(C0126R.string.posts_see_all_content_description));
                    if (cgne.f187350a.mo6606a().mo84148b()) {
                        CardButton cardButton = this.f45918e;
                        cardButton.f30615a.mo71043b(cardButton.getContext().getResources().getDimensionPixelSize(C0126R.dimen.card_button_icon_padding_gplus_card));
                    }
                    this.f45918e.mo18002b(C0126R.C0127drawable.quantum_ic_google_plus_vd_theme_24);
                    this.f45918e.setOnClickListener(new tfz(this, intent2));
                    this.f45918e.setVisibility(0);
                }
            }
            this.f45914a.setVisibility(0);
        }
    }
}
