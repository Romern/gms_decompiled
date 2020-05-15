package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;

/* renamed from: tfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tfm implements C0038ax {

    /* renamed from: a */
    public final tim f45858a;

    /* renamed from: b */
    public final ExpandableLinearLayout f45859b;

    /* renamed from: c */
    public final ExpandableLinearLayout f45860c;

    /* renamed from: d */
    public final ExpandableLinearLayout f45861d;

    /* renamed from: e */
    public final CardButton f45862e;

    /* renamed from: f */
    public final Context f45863f;

    /* renamed from: g */
    public boolean f45864g;

    /* renamed from: h */
    private final View f45865h;

    /* renamed from: i */
    private final String f45866i;

    public tfm(View view, String str, tim tim) {
        this.f45865h = view;
        this.f45863f = view.getContext();
        this.f45866i = str;
        this.f45858a = tim;
        CardButton cardButton = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45862e = cardButton;
        cardButton.setOnClickListener(new tfh(this));
        this.f45859b = (ExpandableLinearLayout) view.findViewById(C0126R.C0129id.email);
        this.f45860c = (ExpandableLinearLayout) view.findViewById(C0126R.C0129id.phone);
        this.f45861d = (ExpandableLinearLayout) view.findViewById(C0126R.C0129id.address);
        view.setVisibility(8);
    }

    /* renamed from: a */
    public static String m36910a(Context context, int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return context.getString(C0126R.string.gm_contact_info_source_context_google_profile);
        }
        if (i2 != 2) {
            return i2 != 3 ? "" : context.getString(C0126R.string.gm_contact_info_source_context_directory_profile);
        }
        return context.getString(C0126R.string.gm_contact_info_source_context_google_contacts);
    }

    /* renamed from: a */
    private static final thb m36911a(String str, String str2, String str3) {
        thb a = thb.m36953a();
        a.f45998a = str;
        if (!TextUtils.isEmpty(str2)) {
            a.f45999b = str2;
            a.f46000c = str3;
        } else {
            a.f45999b = str3;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo26469a() {
        this.f45864g = false;
        this.f45862e.mo17998a();
        this.f45859b.mo18006a(2);
        this.f45860c.mo18006a(2);
        this.f45861d.mo18006a(2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        this.f45859b.removeAllViews();
        this.f45860c.removeAllViews();
        this.f45861d.removeAllViews();
        this.f45859b.setVisibility(8);
        this.f45860c.setVisibility(8);
        this.f45861d.setVisibility(8);
        this.f45865h.setVisibility(8);
        if (bmxv.mo66813a()) {
            thq thq = (thq) bmxv.mo66814b();
            int i = 4;
            if (thq.mo26523a().mo66813a() && !((bngx) thq.mo26523a().mo66814b()).isEmpty()) {
                bngx bngx = (bngx) thq.mo26523a().mo66814b();
                int i2 = 0;
                while (i2 < bngx.size()) {
                    bzhq bzhq = (bzhq) bngx.get(i2);
                    String str = bzhq.f170104b;
                    String str2 = bzhq.f170105c;
                    Context context = this.f45863f;
                    int a = bzhp.m125803a(bzhq.f170106d);
                    if (a == 0) {
                        a = 1;
                    }
                    thb a2 = m36911a(str, str2, m36910a(context, a));
                    int i3 = i2 + 1;
                    a2.f46003f = this.f45863f.getString(C0126R.string.contact_info_email_content_description, Integer.valueOf(i3), Integer.valueOf(bngx.size()), bzhq.f170105c, bzhq.f170104b);
                    Intent a3 = thc.m36958a(bzhq.f170104b, this.f45866i);
                    if (a3.resolveActivity(this.f45863f.getPackageManager()) != null) {
                        a2.f46006i = new tfi(this, a3);
                    }
                    if (i2 == 0) {
                        a2.f46001d = C1391tv.m20459b(this.f45863f, C0126R.C0127drawable.quantum_gm_ic_email_vd_theme_24);
                    } else {
                        a2.mo26507b();
                    }
                    ExpandableLinearLayout expandableLinearLayout = this.f45859b;
                    expandableLinearLayout.addView(a2.mo26505a(this.f45863f, expandableLinearLayout));
                    i2 = i3;
                }
                this.f45859b.setVisibility(0);
            }
            if (thq.mo26524b().mo66813a() && !((bngx) thq.mo26524b().mo66814b()).isEmpty()) {
                bngx bngx2 = (bngx) thq.mo26524b().mo66814b();
                int i4 = 0;
                while (i4 < bngx2.size()) {
                    bzhr bzhr = (bzhr) bngx2.get(i4);
                    String str3 = bzhr.f170110b;
                    String str4 = bzhr.f170111c;
                    Context context2 = this.f45863f;
                    int a4 = bzhp.m125803a(bzhr.f170112d);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    thb a5 = m36911a(str3, str4, m36910a(context2, a4));
                    int i5 = i4 + 1;
                    a5.f46003f = this.f45863f.getString(C0126R.string.contact_info_phone_content_description, Integer.valueOf(i5), Integer.valueOf(bngx2.size()), bzhr.f170111c, bzhr.f170110b);
                    Intent a6 = thc.m36957a(bzhr.f170110b);
                    if (a6.resolveActivity(this.f45863f.getPackageManager()) != null) {
                        a5.f46006i = new tfj(this, a6);
                    }
                    String str5 = bzhr.f170110b;
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    String valueOf = String.valueOf(str5);
                    intent.setData(Uri.parse(valueOf.length() == 0 ? new String("smsto:") : "smsto:".concat(valueOf)));
                    if (intent.resolveActivity(this.f45863f.getPackageManager()) != null) {
                        a5.f46002e = C1391tv.m20459b(this.f45863f, C0126R.C0127drawable.quantum_gm_ic_chat_vd_theme_24);
                        a5.f46008k = new tfk(this, intent);
                        if (cgnb.f187343a.mo6606a().mo84143c()) {
                            a5.f46005h = this.f45863f.getString(C0126R.string.send_sms_content_description);
                        }
                    }
                    if (i4 == 0) {
                        a5.f46001d = C1391tv.m20459b(this.f45863f, C0126R.C0127drawable.quantum_ic_call_vd_theme_24);
                    } else {
                        a5.mo26507b();
                    }
                    ExpandableLinearLayout expandableLinearLayout2 = this.f45860c;
                    expandableLinearLayout2.addView(a5.mo26505a(this.f45863f, expandableLinearLayout2));
                    i4 = i5;
                }
                this.f45860c.setVisibility(0);
            }
            if (thq.mo26525c().mo66813a() && !((bngx) thq.mo26525c().mo66814b()).isEmpty()) {
                bngx bngx3 = (bngx) thq.mo26525c().mo66814b();
                int i6 = 0;
                while (i6 < bngx3.size()) {
                    bzhn bzhn = (bzhn) bngx3.get(i6);
                    String str6 = bzhn.f170097b;
                    String str7 = bzhn.f170098c;
                    Context context3 = this.f45863f;
                    int a7 = bzhp.m125803a(bzhn.f170099d);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    thb a8 = m36911a(str6, str7, m36910a(context3, a7));
                    Context context4 = this.f45863f;
                    Object[] objArr = new Object[i];
                    int i7 = i6 + 1;
                    objArr[0] = Integer.valueOf(i7);
                    objArr[1] = Integer.valueOf(bngx3.size());
                    objArr[2] = bzhn.f170098c;
                    objArr[3] = bzhn.f170097b.replace('-', ' ');
                    a8.f46003f = context4.getString(C0126R.string.contact_info_address_content_description, objArr);
                    Intent a9 = tgw.m36950a(bzhn.f170097b);
                    if (a9.resolveActivity(this.f45863f.getPackageManager()) != null) {
                        a8.f46006i = new tfl(this, a9);
                    }
                    if (i6 == 0) {
                        a8.f46001d = C1391tv.m20459b(this.f45863f, C0126R.C0127drawable.quantum_gm_ic_location_on_vd_theme_24);
                    } else {
                        a8.mo26507b();
                    }
                    ExpandableLinearLayout expandableLinearLayout3 = this.f45861d;
                    expandableLinearLayout3.addView(a8.mo26505a(this.f45863f, expandableLinearLayout3));
                    i6 = i7;
                    i = 4;
                }
                this.f45861d.setVisibility(0);
            }
            if (this.f45859b.getChildCount() > 2 || this.f45860c.getChildCount() > 2 || this.f45861d.getChildCount() > 2) {
                this.f45862e.setVisibility(0);
                mo26469a();
            } else {
                this.f45862e.setVisibility(8);
            }
            if (this.f45859b.getChildCount() != 0 || this.f45860c.getChildCount() != 0 || this.f45861d.getChildCount() != 0) {
                this.f45865h.setVisibility(0);
            }
        }
    }
}
