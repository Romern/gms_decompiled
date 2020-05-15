package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aqtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqtx implements aqtc, aquo {

    /* renamed from: a */
    public final Context f86793a;

    /* renamed from: b */
    public final tim f86794b;

    /* renamed from: c */
    private final aqup f86795c;

    /* renamed from: d */
    private final String f86796d;

    /* renamed from: e */
    private final String f86797e;

    /* renamed from: f */
    private List f86798f;

    public aqtx(Context context, BaseCardView baseCardView, List list, bzjd bzjd, String str, String str2, tim tim, Bundle bundle) {
        boolean z;
        String str3;
        Intent intent;
        aquq aquq;
        int i;
        Drawable drawable;
        String str4;
        String str5;
        String str6;
        int a;
        Context context2 = context;
        BaseCardView baseCardView2 = baseCardView;
        bzjd bzjd2 = bzjd;
        Bundle bundle2 = bundle;
        this.f86796d = str;
        this.f86797e = str2;
        this.f86794b = tim;
        ArrayList arrayList = new ArrayList(list);
        this.f86798f = arrayList;
        int i2 = 3;
        int i3 = 1;
        if (bzjd2 != null) {
            ArrayList arrayList2 = new ArrayList();
            bxwc bxwc = bzjd2.f170278a;
            int size = bxwc.size();
            for (int i4 = 0; i4 < size; i4++) {
                bzjc bzjc = (bzjc) bxwc.get(i4);
                if (!((bzjc.f170267a & 1) == 0 || (a = bzjb.m125842a(bzjc.f170268b)) == 0 || a != 3)) {
                    arrayList2.add(bzjc);
                }
            }
            arrayList.addAll(arrayList2);
        }
        Collections.sort(this.f86798f, aqtv.f86792a);
        if (this.f86798f.size() > 10) {
            this.f86798f = this.f86798f.subList(0, 10);
        }
        this.f86793a = context2;
        aqtw aqtw = new aqtw(context2);
        int i5 = 0;
        while (i5 < this.f86798f.size()) {
            bzjc bzjc2 = (bzjc) this.f86798f.get(i5);
            if ((bzjc2.f170267a & i3) != 0) {
                bzhi bzhi = bzhi.UNKNOWN_CALL_LOG_TYPE;
                int a2 = bzjb.m125842a(bzjc2.f170268b);
                int i6 = (a2 == 0 ? 1 : a2) - 1;
                if (i6 == i3) {
                    aqtw.mo48158a(m72082a(i5 + 1, C0126R.string.profile_calendar_card_title, C0126R.C0127drawable.calendar_interaction, bzjc2.f170270d, bzjc2.f170272f, m72081a("android.intent.action.VIEW", bzjc2.f170269c)));
                } else if (i6 == 2) {
                    int i7 = i5 + 1;
                    String str7 = bzjc2.f170270d;
                    if ((bzjc2.f170267a & 512) != 0) {
                        str3 = tew.m36878a(bzjc2.f170273g * 1000, System.currentTimeMillis(), context2);
                    } else {
                        str3 = null;
                    }
                    if ((bzjc2.f170267a & 16) == 0 || (cgne.m146260b() && TextUtils.isEmpty(tey.m36896c(bzjc2.f170269c)))) {
                        intent = null;
                    } else if (!this.f86797e.equals("com.google.android.apps.bigtop") && !this.f86797e.equals("com.google.android.apps.inbox")) {
                        Context context3 = this.f86793a;
                        String str8 = bzjc2.f170269c;
                        String str9 = this.f86796d;
                        Intent intent2 = new Intent("com.google.android.gm.intent.VIEW_PLID");
                        intent2.setPackage("com.google.android.gm");
                        intent2.putExtra("plid", tey.m36896c(str8));
                        intent2.putExtra("permalink", str8);
                        acxv.m49971a(context3, intent2, AccountData.m66749a(str9));
                        intent = intent2;
                    } else {
                        Context context4 = this.f86793a;
                        String c = tey.m36896c(bzjc2.f170269c);
                        String str10 = this.f86796d;
                        PackageManager packageManager = context4.getPackageManager();
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.apps.bigtop");
                        launchIntentForPackage = launchIntentForPackage == null ? packageManager.getLaunchIntentForPackage("com.google.android.apps.inbox") : launchIntentForPackage;
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.setAction("com.google.android.apps.bigtop.intent.VIEW_EMAIL");
                            launchIntentForPackage.putExtra("plid", c);
                            acxv.m49971a(context4, launchIntentForPackage, AccountData.m66749a(str10));
                            if (!packageManager.queryIntentActivities(launchIntentForPackage, 0).isEmpty()) {
                                intent = launchIntentForPackage;
                            }
                        }
                        intent = null;
                    }
                    aqtw.mo48158a(m72082a(i7, C0126R.string.profile_email_entry_title, C0126R.C0127drawable.email_interaction, str7, str3, intent));
                } else if (i6 == i2) {
                    int i8 = i5 + 1;
                    Intent a3 = m72081a("android.intent.action.DIAL", bzjc2.f170269c);
                    bzhj bzhj = bzjc2.f170274h;
                    if (((bzhj == null ? bzhj.f170054d : bzhj).f170056a & i3) != 0) {
                        bzhj bzhj2 = bzjc2.f170274h;
                        bzhi a4 = bzhi.m125794a((bzhj2 == null ? bzhj.f170054d : bzhj2).f170057b);
                        int ordinal = (a4 == null ? bzhi.UNKNOWN_CALL_LOG_TYPE : a4).ordinal();
                        if (ordinal == i3) {
                            Drawable b = C1391tv.m20459b(this.f86793a, C0126R.C0127drawable.quantum_ic_call_received_white_18);
                            b.setColorFilter(C1133kh.m17843b(this.f86793a, C0126R.color.profile_call_arrow_green), PorterDuff.Mode.MULTIPLY);
                            drawable = b;
                            i = C0126R.string.profile_call_type_incoming;
                        } else if (ordinal == 2) {
                            Drawable b2 = C1391tv.m20459b(this.f86793a, C0126R.C0127drawable.quantum_ic_call_made_white_18);
                            b2.setColorFilter(C1133kh.m17843b(this.f86793a, C0126R.color.profile_call_arrow_green), PorterDuff.Mode.MULTIPLY);
                            drawable = b2;
                            i = C0126R.string.profile_call_type_outgoing;
                        } else if (ordinal != i2) {
                            aquq = null;
                        } else {
                            drawable = C1391tv.m20459b(this.f86793a, C0126R.C0127drawable.quantum_ic_call_missed_white_18);
                            drawable.mutate().setColorFilter(C1133kh.m17843b(this.f86793a, C0126R.color.profile_call_arrow_red), PorterDuff.Mode.MULTIPLY);
                            i = C0126R.string.profile_call_type_missed;
                        }
                        String str11 = bzjc2.f170270d;
                        if ((bzjc2.f170267a & 512) != 0) {
                            str4 = str11;
                            str5 = tew.m36878a(bzjc2.f170273g * 1000, System.currentTimeMillis(), this.f86793a);
                        } else {
                            str4 = str11;
                            str5 = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f86793a).inflate((int) C0126R.C0128layout.interactions_entry, (ViewGroup) null);
                        ((ImageView) viewGroup.findViewById(C0126R.C0129id.icon)).setImageDrawable(C1391tv.m20459b(this.f86793a, C0126R.C0127drawable.call_interaction));
                        TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.text);
                        textView.setText(i);
                        ((ImageView) viewGroup.findViewById(C0126R.C0129id.call_icon)).setImageDrawable(drawable);
                        if (!TextUtils.isEmpty(str4)) {
                            ((TextView) viewGroup.findViewById(C0126R.C0129id.phone_number)).setText(str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            ((TextView) viewGroup.findViewById(C0126R.C0129id.subtext)).setText(str5);
                        }
                        viewGroup.setOnClickListener(new aqtt(this, a3));
                        textView.setContentDescription(this.f86793a.getString(C0126R.string.interactions_entry_content_description, Integer.valueOf(i8), Integer.valueOf(this.f86798f.size()), this.f86793a.getString(i)));
                        aquq = new aquq(viewGroup);
                    } else {
                        aquq = null;
                    }
                    if (aquq != null) {
                        aqtw.mo48158a(aquq);
                    }
                } else if (i6 == 4) {
                    int i9 = i5 + 1;
                    String str12 = bzjc2.f170270d;
                    if ((bzjc2.f170267a & 512) != 0) {
                        str6 = tew.m36878a(bzjc2.f170273g * 1000, System.currentTimeMillis(), context2);
                    } else {
                        str6 = null;
                    }
                    aqtw.mo48158a(m72082a(i9, C0126R.string.profile_sms_entry_title, C0126R.C0127drawable.sms_interaction, str12, str6, m72081a("android.intent.action.VIEW", bzjc2.f170269c)));
                }
            }
            i5++;
            i2 = 3;
            i3 = 1;
        }
        if (!aqtw.mo48159d()) {
            ViewGroup viewGroup2 = aqtw.f86844c;
            if (viewGroup2.getChildCount() > 0) {
                viewGroup2.getChildAt(0).findViewById(C0126R.C0129id.top_divider).setVisibility(4);
                viewGroup2.getChildAt(viewGroup2.getChildCount() - 1).findViewById(C0126R.C0129id.bottom_divider).setVisibility(4);
            }
            baseCardView2.mo59007a((int) C0126R.string.interactions_card_title);
            TextView textView2 = (TextView) baseCardView2.findViewById(C0126R.C0129id.title);
            boolean z2 = false;
            textView2.setPadding(textView2.getPaddingLeft(), 0, textView2.getPaddingRight(), 0);
            baseCardView2.findViewById(C0126R.C0129id.card_content).setPadding(0, 0, 0, 0);
            if (bundle2 == null || !bundle2.getBoolean("recentInteractionsCardController")) {
                z = false;
            } else {
                z = true;
            }
            this.f86795c = new aqup(baseCardView, aqtw, this, this.f86798f.size() > 3 ? true : z2, z);
            return;
        }
        this.f86795c = null;
        baseCardView2.setVisibility(8);
    }

    /* renamed from: a */
    private static final Intent m72081a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new Intent(str).setData(Uri.parse(str2));
    }

    /* renamed from: b */
    public final void mo48140b() {
        this.f86794b.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
    }

    /* renamed from: a */
    private final aquq m72082a(int i, int i2, int i3, String str, String str2, Intent intent) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f86793a).inflate((int) C0126R.C0128layout.interactions_entry, (ViewGroup) null);
        viewGroup.findViewById(C0126R.C0129id.call_icon).setVisibility(8);
        viewGroup.findViewById(C0126R.C0129id.phone_number).setVisibility(8);
        ((ImageView) viewGroup.findViewById(C0126R.C0129id.icon)).setImageDrawable(C1391tv.m20459b(this.f86793a, i3));
        if (!TextUtils.isEmpty(str)) {
            TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.text);
            textView.setText(tey.m36889a(str).toString().trim());
            Context context = this.f86793a;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.f86798f.size());
            String valueOf = String.valueOf(this.f86793a.getString(i2));
            String valueOf2 = String.valueOf(str);
            objArr[2] = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            textView.setContentDescription(context.getString(C0126R.string.interactions_entry_content_description, objArr));
        }
        if (!TextUtils.isEmpty(str2)) {
            ((TextView) viewGroup.findViewById(C0126R.C0129id.subtext)).setText(str2);
        }
        viewGroup.setOnClickListener(new aqtu(this, intent));
        return new aquq(viewGroup);
    }

    /* renamed from: a */
    public final void mo48139a() {
        this.f86794b.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
    }

    /* renamed from: a */
    public final void mo48130a(Bundle bundle) {
        aqup aqup = this.f86795c;
        if (aqup != null) {
            bundle.putBoolean("recentInteractionsCardController", aqup.f86846b);
        }
    }
}
