package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import com.google.android.gms.identity.accounts.api.AccountData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgh implements C0038ax {

    /* renamed from: f */
    private static final bnhe f45923f = bnhe.m109410a(bzhi.INCOMING, Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_call_received_white_18), bzhi.OUTGOING, Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_call_made_white_18), bzhi.MISSED, Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_call_missed_white_18));

    /* renamed from: g */
    private static final bnhe f45924g;

    /* renamed from: h */
    private static final bnhe f45925h = bnhe.m109410a(bzhi.INCOMING, Integer.valueOf((int) C0126R.string.profile_call_type_incoming), bzhi.OUTGOING, Integer.valueOf((int) C0126R.string.profile_call_type_outgoing), bzhi.MISSED, Integer.valueOf((int) C0126R.string.profile_call_type_missed));

    /* renamed from: a */
    public final View f45926a;

    /* renamed from: b */
    public final tim f45927b;

    /* renamed from: c */
    public final ExpandableLinearLayout f45928c = ((ExpandableLinearLayout) this.f45926a.findViewById(C0126R.C0129id.interactions));

    /* renamed from: d */
    public final CardButton f45929d;

    /* renamed from: e */
    public boolean f45930e;

    /* renamed from: i */
    private final String f45931i;

    /* renamed from: j */
    private final String f45932j;

    static {
        bzhi bzhi = bzhi.INCOMING;
        Integer valueOf = Integer.valueOf((int) C0126R.color.profile_call_arrow_green);
        f45924g = bnhe.m109410a(bzhi, valueOf, bzhi.OUTGOING, valueOf, bzhi.MISSED, Integer.valueOf((int) C0126R.color.profile_call_arrow_red));
    }

    public tgh(View view, String str, String str2, tim tim) {
        this.f45926a = view;
        this.f45931i = str;
        this.f45932j = str2;
        this.f45927b = tim;
        CardButton cardButton = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45929d = cardButton;
        cardButton.setOnClickListener(new tge(this));
        this.f45926a.setVisibility(8);
    }

    /* renamed from: a */
    private final String m36933a(int i, int i2, int i3, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context context = this.f45926a.getContext();
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        String valueOf = String.valueOf(this.f45926a.getContext().getString(i3));
        String valueOf2 = String.valueOf(str);
        objArr[2] = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        return context.getString(C0126R.string.interactions_entry_content_description, objArr);
    }

    /* renamed from: b */
    private final View.OnClickListener m36935b(bmxv bmxv) {
        return new tgf(this, bmxv);
    }

    /* renamed from: a */
    private static final String m36934a(Context context, long j) {
        if (j != 0) {
            return tew.m36878a(j * 1000, System.currentTimeMillis(), context);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo26488a() {
        this.f45930e = false;
        this.f45929d.mo17998a();
        this.f45928c.mo18006a(3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        int i;
        String str;
        bmxv bmxv2;
        this.f45928c.removeAllViews();
        this.f45926a.setVisibility(8);
        if (bmxv.mo66813a() && !((List) bmxv.mo66814b()).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) bmxv.mo66814b()).iterator();
            while (true) {
                i = 4;
                if (!it.hasNext()) {
                    break;
                }
                bzjc bzjc = (bzjc) it.next();
                int a = bzjb.m125842a(bzjc.f170268b);
                if (!(a == 0 || a == 1)) {
                    int a2 = bzjb.m125842a(bzjc.f170268b);
                    if (a2 != 0 && a2 == 4) {
                        bzhj bzhj = bzjc.f170274h;
                        if (bzhj == null) {
                            bzhj = bzhj.f170054d;
                        }
                        bzhi a3 = bzhi.m125794a(bzhj.f170057b);
                        if (a3 == null) {
                            a3 = bzhi.UNKNOWN_CALL_LOG_TYPE;
                        }
                        if (a3 == bzhi.UNKNOWN_CALL_LOG_TYPE) {
                        }
                    }
                    arrayList.add(bzjc);
                }
            }
            int i2 = 0;
            while (i2 < arrayList.size()) {
                bzjc bzjc2 = (bzjc) arrayList.get(i2);
                int a4 = bzjb.m125842a(bzjc2.f170268b);
                if (a4 != 0 && a4 == 2) {
                    ExpandableLinearLayout expandableLinearLayout = this.f45928c;
                    String str2 = bzjc2.f170270d;
                    String str3 = bzjc2.f170272f;
                    thb a5 = thb.m36953a();
                    a5.f45998a = tey.m36889a(str2).toString().trim();
                    a5.f45999b = str3;
                    a5.f46001d = C1391tv.m20459b(this.f45926a.getContext(), C0126R.C0127drawable.product_logo_calendar_color_24);
                    a5.f46003f = m36933a(i2 + 1, arrayList.size(), C0126R.string.profile_calendar_card_title, bzjc2.f170270d);
                    a5.f46006i = m36935b(tgg.m36932a("android.intent.action.VIEW", bzjc2.f170269c));
                    expandableLinearLayout.addView(a5.mo26505a(this.f45926a.getContext(), this.f45928c));
                } else {
                    int a6 = bzjb.m125842a(bzjc2.f170268b);
                    if (a6 != 0 && a6 == i) {
                        ExpandableLinearLayout expandableLinearLayout2 = this.f45928c;
                        String str4 = bzjc2.f170270d;
                        bzhj bzhj2 = bzjc2.f170274h;
                        if (bzhj2 == null) {
                            bzhj2 = bzhj.f170054d;
                        }
                        bzhi a7 = bzhi.m125794a(bzhj2.f170057b);
                        if (a7 == null) {
                            a7 = bzhi.UNKNOWN_CALL_LOG_TYPE;
                        }
                        long j = bzjc2.f170273g;
                        tgz tgz = new tgz();
                        tgz.f45990a = this.f45926a.getContext().getResources().getString(((Integer) f45925h.get(a7)).intValue());
                        tgz.f45992c = j;
                        Context context = this.f45926a.getContext();
                        Drawable b = C1391tv.m20459b(context, ((Integer) f45923f.get(a7)).intValue());
                        b.mutate().setColorFilter(C1133kh.m17843b(context, ((Integer) f45924g.get(a7)).intValue()), PorterDuff.Mode.MULTIPLY);
                        tgz.f45991b = b;
                        tgz.f45993d = str4;
                        Context context2 = this.f45926a.getContext();
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(i2 + 1);
                        objArr[1] = Integer.valueOf(arrayList.size());
                        Resources resources = this.f45926a.getContext().getResources();
                        bnhe bnhe = f45925h;
                        bzhj bzhj3 = bzjc2.f170274h;
                        if (bzhj3 == null) {
                            bzhj3 = bzhj.f170054d;
                        }
                        bzhi a8 = bzhi.m125794a(bzhj3.f170057b);
                        if (a8 == null) {
                            a8 = bzhi.UNKNOWN_CALL_LOG_TYPE;
                        }
                        objArr[2] = resources.getString(((Integer) bnhe.get(a8)).intValue());
                        tgz.f45995f = context2.getString(C0126R.string.interactions_entry_content_description, objArr);
                        tgz.f45994e = m36935b(tgg.m36932a("android.intent.action.DIAL", bzjc2.f170269c));
                        Context context3 = this.f45926a.getContext();
                        View inflate = LayoutInflater.from(context3).inflate((int) C0126R.C0128layout.gm_call_log_interactions_entry, (ViewGroup) this.f45928c, false);
                        if (!TextUtils.isEmpty(tgz.f45990a)) {
                            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.text);
                            textView.setText(tgz.f45990a);
                            textView.setVisibility(0);
                        }
                        if (tgz.f45992c != 0) {
                            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.subtext);
                            textView2.setText(tew.m36878a(tgz.f45992c * 1000, System.currentTimeMillis(), inflate.getContext()));
                            textView2.setVisibility(0);
                        }
                        if (!TextUtils.isEmpty(tgz.f45993d)) {
                            TextView textView3 = (TextView) inflate.findViewById(C0126R.C0129id.phone_number);
                            textView3.setText(tgz.f45993d);
                            textView3.setVisibility(0);
                            inflate.setOnLongClickListener(new tgy(tgz, inflate));
                        }
                        if (tgz.f45991b != null) {
                            ((ImageView) inflate.findViewById(C0126R.C0129id.call_icon)).setImageDrawable(tgz.f45991b);
                        }
                        if (!TextUtils.isEmpty(tgz.f45995f)) {
                            inflate.setContentDescription(tgz.f45995f);
                        }
                        View.OnClickListener onClickListener = tgz.f45994e;
                        if (onClickListener != null) {
                            inflate.setOnClickListener(onClickListener);
                            inflate.setBackgroundResource(thh.m36971g(context3));
                        }
                        expandableLinearLayout2.addView(inflate);
                    } else {
                        int a9 = bzjb.m125842a(bzjc2.f170268b);
                        if (a9 != 0 && a9 == 3) {
                            if (bzjc2.f170270d.isEmpty()) {
                                str = this.f45926a.getContext().getString(C0126R.string.untitled_email_interaction);
                            } else {
                                str = bzjc2.f170270d;
                            }
                            ExpandableLinearLayout expandableLinearLayout3 = this.f45928c;
                            long j2 = bzjc2.f170273g;
                            thb a10 = thb.m36953a();
                            a10.f45998a = tey.m36889a(str).toString().trim();
                            a10.f45999b = m36934a(this.f45926a.getContext(), j2);
                            a10.f46001d = C1391tv.m20459b(this.f45926a.getContext(), C0126R.C0127drawable.product_logo_gmail_color_24);
                            a10.f46003f = m36933a(i2 + 1, arrayList.size(), C0126R.string.profile_email_entry_title, str);
                            Context context4 = this.f45926a.getContext();
                            String str5 = bzjc2.f170269c;
                            String str6 = this.f45932j;
                            String str7 = this.f45931i;
                            if (str5.isEmpty() || (cgne.m146260b() && TextUtils.isEmpty(tey.m36896c(str5)))) {
                                bmxv2 = bmvz.f131120a;
                            } else if (str6.equals("com.google.android.apps.bigtop") || str6.equals("com.google.android.apps.inbox")) {
                                String c = tey.m36896c(str5);
                                PackageManager packageManager = context4.getPackageManager();
                                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.apps.bigtop");
                                if (launchIntentForPackage == null) {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.apps.inbox");
                                }
                                if (launchIntentForPackage != null) {
                                    launchIntentForPackage.setAction("com.google.android.apps.bigtop.intent.VIEW_EMAIL");
                                    launchIntentForPackage.putExtra("plid", c);
                                    acxv.m49971a(context4, launchIntentForPackage, AccountData.m66749a(str7));
                                    if (!packageManager.queryIntentActivities(launchIntentForPackage, 0).isEmpty()) {
                                        bmxv2 = bmxv.m108567c(launchIntentForPackage);
                                    }
                                }
                                bmxv2 = bmvz.f131120a;
                            } else {
                                Intent intent = new Intent("com.google.android.gm.intent.VIEW_PLID");
                                intent.setPackage("com.google.android.gm");
                                intent.putExtra("plid", tey.m36896c(str5));
                                intent.putExtra("permalink", str5);
                                acxv.m49971a(context4, intent, AccountData.m66749a(str7));
                                bmxv2 = bmxv.m108567c(intent);
                            }
                            a10.f46006i = m36935b(bmxv2);
                            expandableLinearLayout3.addView(a10.mo26505a(this.f45926a.getContext(), this.f45928c));
                        } else {
                            ExpandableLinearLayout expandableLinearLayout4 = this.f45928c;
                            String str8 = bzjc2.f170270d;
                            long j3 = bzjc2.f170273g;
                            thb a11 = thb.m36953a();
                            a11.f45998a = tey.m36889a(str8).toString().trim();
                            a11.f45999b = m36934a(this.f45926a.getContext(), j3);
                            a11.f46001d = C1391tv.m20459b(this.f45926a.getContext(), C0126R.C0127drawable.quantum_gm_ic_chat_vd_theme_24);
                            a11.f46003f = m36933a(i2 + 1, arrayList.size(), C0126R.string.profile_sms_entry_title, bzjc2.f170270d);
                            a11.f46006i = m36935b(tgg.m36932a("android.intent.action.VIEW", bzjc2.f170269c));
                            expandableLinearLayout4.addView(a11.mo26505a(this.f45926a.getContext(), this.f45928c));
                        }
                    }
                }
                i2++;
                i = 4;
            }
            if (this.f45928c.getChildCount() > 3) {
                this.f45929d.setVisibility(0);
                mo26488a();
            } else {
                this.f45929d.setVisibility(8);
            }
            if (this.f45928c.getChildCount() != 0) {
                this.f45926a.setVisibility(0);
            }
        }
    }
}
