package p000;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: abge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abge extends abh {

    /* renamed from: a */
    public List f57390a;

    /* renamed from: d */
    private final HelpChimeraActivity f57391d;

    /* renamed from: e */
    private String f57392e;

    public abge(HelpChimeraActivity helpChimeraActivity) {
        this.f57391d = helpChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private static final abgd m47654a(ViewGroup viewGroup) {
        int i;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (!aaya.m47229b(ceib.m136897b())) {
            i = C0126R.C0128layout.gh_help_content_list_item_deprecated;
        } else {
            i = C0126R.C0128layout.gh_help_content_list_item;
        }
        View inflate = from.inflate(i, viewGroup, false);
        ((LinearLayout) inflate).setGravity(48);
        return new abgd(inflate);
    }

    /* renamed from: a */
    public final int mo161a() {
        if (!aaya.m47228a(ceft.m136741b()) || !this.f57391d.f56986y.mo43213H()) {
            List list = this.f57390a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        List list2 = this.f57390a;
        if (list2 != null) {
            return list2.size() + 1;
        }
        return 1;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        List list;
        return (!aaya.m47228a(ceft.m136741b()) || (list = this.f57390a) == null || i != list.size()) ? 0 : 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        if (!aaya.m47228a(ceft.m136741b())) {
            return m47654a(viewGroup);
        }
        if (i == 0) {
            return m47654a(viewGroup);
        }
        if (i == 1) {
            return new abgd(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.gh_need_more_help_options, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Error, unknown viewType '");
        sb.append(i);
        sb.append("' encountered!");
        Log.e("gH_SearchSugAdapter", sb.toString());
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasp.a(android.view.View, com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, boolean):void
     arg types: [android.view.View, com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, aasn, int]
     candidates:
      aasp.a(com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, int, boolean):android.view.View
      aasp.a(android.view.View, com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32081a(abgd abgd, int i) {
        List list = this.f57390a;
        if (list != null) {
            aasm aasm = (aasm) list.get(i);
            aasn aasn = new aasn(this.f57391d, aasm, i, 7, this.f57392e);
            View view = abgd.f57389s;
            HelpChimeraActivity helpChimeraActivity = this.f57391d;
            if (!aasp.m46939a(view, aasm, helpChimeraActivity)) {
                view.setVisibility(8);
            } else {
                aasp.m46938a(view, helpChimeraActivity, aasm, (View.OnClickListener) aasn, true);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        abgd abgd = (abgd) acm;
        if (!aaya.m47228a(ceft.m136741b())) {
            mo32081a(abgd, i);
        } else if (mo162a(i) != 0) {
            HelpConfig helpConfig = this.f57391d.f56986y;
            if (helpConfig.mo43213H()) {
                View view = abgd.f57389s;
                if (!TextUtils.isEmpty(helpConfig.mo43212G())) {
                    aasz.m46953a(this.f57391d, view, 196);
                }
                if (!TextUtils.isEmpty(helpConfig.mo43211F())) {
                    aasz.m46955b(this.f57391d, view, 196);
                }
                View findViewById = view.findViewById(C0126R.C0129id.gh_bottom_section_divider);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = view.findViewById(C0126R.C0129id.gh_top_section_divider);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                TextView textView = (TextView) view.findViewById(C0126R.C0129id.gh_need_more_help_title);
                if (textView != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.gravity = 17;
                    textView.setLayoutParams(layoutParams);
                    textView.setPadding(0, 0, 0, this.f57391d.getResources().getDimensionPixelSize(C0126R.dimen.gh_twice_padding));
                }
            }
        } else {
            mo32081a(abgd, i);
        }
    }

    /* renamed from: a */
    public final void mo32082a(String str, List list) {
        this.f57392e = str;
        this.f57390a = list;
        mo171aJ();
    }
}
