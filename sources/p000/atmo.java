package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;

/* renamed from: atmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmo extends abh {

    /* renamed from: g */
    static final int f90493g;

    /* renamed from: h */
    public static final /* synthetic */ int f90494h = 0;

    /* renamed from: i */
    private static final bnzc f90495i;

    /* renamed from: a */
    final Context f90496a;

    /* renamed from: d */
    public bmxv f90497d;

    /* renamed from: e */
    public GetAllCardsResponse f90498e;

    /* renamed from: f */
    public View f90499f;

    /* renamed from: j */
    private Boolean f90500j;

    static {
        bnzc h = bnzi.m110906h();
        f90495i = h;
        f90493g = h.mo68720a(atmo.class.getCanonicalName()).mo68741c();
    }

    public atmo(Context context) {
        this.f90496a = context;
        mo170a(true);
    }

    /* renamed from: a */
    public final int mo161a() {
        return 1;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return f90493g;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        this.f90499f = LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.tp_settings_activity_hce_header, viewGroup, false);
        return new atmn(this.f90499f);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        GetAllCardsResponse getAllCardsResponse;
        int i2;
        if (this.f90497d != null && (getAllCardsResponse = this.f90498e) != null) {
            atmn atmn = (atmn) acm;
            boolean a = bnjd.m109599f(bnkn.m109665a(getAllCardsResponse.f108369a), atmm.f90488a).mo66813a();
            Boolean bool = this.f90500j;
            if (bool == null || bool.booleanValue() != a) {
                this.f90500j = Boolean.valueOf(a);
                int i3 = 8;
                if (!a || !this.f90497d.mo66813a()) {
                    if (a) {
                        int i4 = atmn.f90489v;
                        atmn.f90492u.setImageResource(C0126R.C0127drawable.tp_nfc);
                        atmn.f90492u.setImageTintList(ColorStateList.valueOf(C1133kh.m17843b(this.f90496a, C0126R.color.tp_logo_letter_color)));
                    }
                    int i5 = atmn.f90489v;
                    View view = atmn.f90490s;
                    if (!a) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                    View view2 = atmn.f90491t;
                    if (a) {
                        i3 = 0;
                    }
                    view2.setVisibility(i3);
                    return;
                }
                int i6 = atmn.f90489v;
                atmn.f90491t.setVisibility(0);
                atmn.f90490s.setVisibility(8);
                atmn.f90492u.mo4048a((axw) this.f90497d.mo66815c());
                atmn.f90492u.mo4042a();
            }
        }
    }
}
