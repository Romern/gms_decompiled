package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: aqtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqtg implements aqtc, aqrp, aquo {

    /* renamed from: a */
    public final Context f86751a;

    /* renamed from: b */
    public final BaseCardView f86752b;

    /* renamed from: c */
    public final tim f86753c;

    /* renamed from: d */
    private final Bundle f86754d;

    /* renamed from: e */
    private final String f86755e;

    /* renamed from: f */
    private aquk f86756f;

    /* renamed from: g */
    private aqup f86757g;

    public aqtg(Context context, BaseCardView baseCardView, String str, tim tim, Bundle bundle) {
        this.f86751a = context;
        this.f86752b = baseCardView;
        this.f86755e = str;
        this.f86753c = tim;
        this.f86754d = bundle;
        baseCardView.findViewById(C0126R.C0129id.card_container).setPadding(0, 0, 0, 0);
        this.f86752b.findViewById(C0126R.C0129id.card_content).setPadding(0, 0, 0, 0);
    }

    /* renamed from: a */
    private final aquq m72060a(int i, Drawable drawable, String str, String str2, String str3, Intent intent, tio tio) {
        View inflate = LayoutInflater.from(this.f86751a).inflate(i, (ViewGroup) null);
        inflate.setContentDescription(str3);
        if (drawable != null) {
            tey.m36888a(drawable, C1133kh.m17843b(this.f86751a, C0126R.color.card_entry_text_color));
            C1334rs.m20107b((TextView) inflate.findViewById(C0126R.C0129id.text), drawable, null, null, null);
        } else {
            View findViewById = inflate.findViewById(C0126R.C0129id.text);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            if (C1221nn.m19678a(Locale.getDefault()) == 1) {
                layoutParams.setMargins(0, 0, inflate.getResources().getDimensionPixelSize(C0126R.dimen.contact_info_entry_offset_start), 0);
            } else {
                layoutParams.setMargins(inflate.getResources().getDimensionPixelSize(C0126R.dimen.contact_info_entry_offset_start), 0, 0, 0);
            }
            findViewById.setLayoutParams(layoutParams);
        }
        inflate.setOnClickListener(new aqtf(this, intent, tio));
        ViewGroup viewGroup = (ViewGroup) inflate;
        tey.m36891a(this.f86751a, (TextView) viewGroup.findViewById(C0126R.C0129id.text), str, str2);
        aquq aquq = new aquq(viewGroup);
        aquq.mo48164a(str);
        return aquq;
    }

    /* renamed from: b */
    public final void mo48140b() {
        this.f86753c.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
    }

    /* renamed from: a */
    public final void mo48139a() {
        this.f86753c.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_CONTACT_DETAILS_CARD);
    }

    /* renamed from: a */
    public final void mo48130a(Bundle bundle) {
        bundle.putBoolean("contactInfoCardController", this.f86757g.f86846b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final void mo48048a(List list, List list2, List list3) {
        boolean z;
        boolean z2;
        Drawable drawable;
        Drawable drawable2;
        String str;
        Drawable drawable3;
        List list4 = list2;
        char c = 0;
        this.f86756f = new aquk(this.f86751a, 0);
        int i = 2;
        if (!list.isEmpty()) {
            aquk aquk = this.f86756f;
            aquk aquk2 = new aquk(this.f86751a, 2);
            int i2 = 0;
            while (i2 < list.size()) {
                if (i2 == 0) {
                    drawable3 = C1391tv.m20459b(this.f86751a, C0126R.C0127drawable.quantum_ic_email_vd_theme_24);
                } else {
                    drawable3 = null;
                }
                bzhq bzhq = (bzhq) list.get(i2);
                int i3 = i2 + 1;
                aquk2.mo48158a(m72060a(C0126R.C0128layout.contact_info_entry, drawable3, bzhq.f170104b, bzhq.f170105c, this.f86751a.getString(C0126R.string.contact_info_email_content_description, Integer.valueOf(i3), Integer.valueOf(list.size()), bzhq.f170105c, bzhq.f170104b), aqqk.m71972a(bzhq.f170104b, this.f86755e), tio.SMART_PROFILE_CONTACT_DETAILS_CARD_EMAIL_LINK));
                aquk2 = aquk2;
                aquk = aquk;
                i2 = i3;
            }
            aquk.mo48158a(aquk2);
        }
        int i4 = 32;
        if (!list2.isEmpty()) {
            aquk aquk3 = this.f86756f;
            HashMap hashMap = new HashMap();
            int size = list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                bzhr bzhr = (bzhr) list4.get(i5);
                if (!bzhr.f170111c.isEmpty()) {
                    if (hashMap.containsKey(bzhr.f170111c)) {
                        String str2 = bzhr.f170111c;
                        hashMap.put(str2, Integer.valueOf(((Integer) hashMap.get(str2)).intValue() + 1));
                    } else {
                        hashMap.put(bzhr.f170111c, 1);
                    }
                }
            }
            aquk aquk4 = new aquk(this.f86751a, 2);
            int i6 = 0;
            while (i6 < list2.size()) {
                if (i6 == 0) {
                    drawable2 = C1391tv.m20459b(this.f86751a, C0126R.C0127drawable.quantum_ic_call_vd_theme_24);
                } else {
                    drawable2 = null;
                }
                bzhr bzhr2 = (bzhr) list4.get(i6);
                String str3 = bzhr2.f170110b;
                String str4 = bzhr2.f170111c;
                String str5 = "";
                if (!hashMap.containsKey(str4) || ((Integer) hashMap.get(bzhr2.f170111c)).intValue() <= 1) {
                    str = str5;
                } else {
                    if ((bzhr2.f170109a & i4) != 0) {
                        int a = bzhp.m125803a(bzhr2.f170112d);
                        if (a == 0) {
                            a = 1;
                        }
                        int i7 = a - 1;
                        if (i7 != 1) {
                            str = i7 != i ? i7 != 3 ? str5 : this.f86751a.getString(C0126R.string.contact_info_source_context_organization_profile) : this.f86751a.getString(C0126R.string.contact_info_source_context_contacts);
                        } else {
                            str5 = this.f86751a.getString(C0126R.string.contact_info_source_context_google_profile);
                        }
                    }
                    str = str5;
                }
                int i8 = i6 + 1;
                aquk aquk5 = aquk4;
                HashMap hashMap2 = hashMap;
                aquq a2 = m72060a(C0126R.C0128layout.contact_info_phone_entry, drawable2, str3, str4, this.f86751a.getString(C0126R.string.contact_info_phone_content_description, Integer.valueOf(i8), Integer.valueOf(list2.size()), bzhr2.f170111c, bzhr2.f170110b), aqqk.m71971a(str3), tio.CONTACT_DETAILS_CARD_CALL_PHONE_LINK);
                Intent intent = new Intent("android.intent.action.SENDTO");
                String valueOf = String.valueOf(str3);
                intent.setData(Uri.parse(valueOf.length() == 0 ? new String("smsto:") : "smsto:".concat(valueOf)));
                if (intent.resolveActivity(this.f86751a.getPackageManager()) != null) {
                    View findViewById = a2.f86844c.findViewById(C0126R.C0129id.textsms_icon);
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(new aqtd(this, intent));
                }
                if (!TextUtils.isEmpty(str)) {
                    View findViewById2 = a2.f86844c.findViewById(C0126R.C0129id.info_icon);
                    findViewById2.setVisibility(0);
                    findViewById2.setContentDescription(str);
                    findViewById2.setFocusable(true);
                    findViewById2.setOnClickListener(new aqte(this, str, findViewById2));
                }
                aquk5.mo48158a(a2);
                aquk4 = aquk5;
                i6 = i8;
                hashMap = hashMap2;
                i4 = 32;
                i = 2;
            }
            aquk3.mo48158a(aquk4);
        }
        if (!list3.isEmpty()) {
            aquk aquk6 = this.f86756f;
            aquk aquk7 = new aquk(this.f86751a, 2);
            int i9 = 0;
            while (i9 < list3.size()) {
                if (i9 == 0) {
                    drawable = C1391tv.m20459b(this.f86751a, C0126R.C0127drawable.quantum_ic_location_on_vd_theme_24);
                } else {
                    drawable = null;
                }
                bzhn bzhn = (bzhn) list3.get(i9);
                String str6 = bzhn.f170097b;
                String str7 = bzhn.f170098c;
                Context context = this.f86751a;
                Object[] objArr = new Object[4];
                int i10 = i9 + 1;
                objArr[c] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(list3.size());
                objArr[2] = bzhn.f170098c;
                objArr[3] = bzhn.f170097b.replace('-', ' ');
                aquk7.mo48158a(m72060a(C0126R.C0128layout.contact_info_entry, drawable, str6, str7, context.getString(C0126R.string.contact_info_address_content_description, objArr), aqqk.m71974b(bzhn.f170097b), tio.CONTACT_DETAILS_CARD_ADDRESS_LINK));
                i9 = i10;
                c = 0;
            }
            aquk6.mo48158a(aquk7);
        }
        Bundle bundle = this.f86754d;
        if (bundle == null || !bundle.getBoolean("contactInfoCardController")) {
            z = false;
        } else {
            z = true;
        }
        if (list.size() > 2 || list2.size() > 2 || list3.size() > 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        aqup aqup = this.f86757g;
        if (aqup != null) {
            boolean z3 = aqup.f86846b;
            aquk aquk8 = this.f86756f;
            aqup.f86847c = aquk8;
            ViewGroup viewGroup = (ViewGroup) aqup.f86845a.findViewById(C0126R.C0129id.card_content);
            viewGroup.removeAllViews();
            viewGroup.addView(aquk8.f86844c);
            aqup.mo48168a(z2, z3);
            return;
        }
        this.f86757g = new aqup(this.f86752b, this.f86756f, this, z2, z);
    }
}
