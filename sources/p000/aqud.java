package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: aqud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqud implements aqtc {

    /* renamed from: a */
    public final Activity f86815a;

    /* renamed from: b */
    public final Context f86816b;

    /* renamed from: c */
    public final String f86817c;

    /* renamed from: d */
    public final tim f86818d;

    /* renamed from: e */
    private final bzjo f86819e;

    /* renamed from: f */
    private final aqur f86820f;

    /* renamed from: g */
    private final tie f86821g;

    /* renamed from: h */
    private int f86822h = 400;

    public aqud(Activity activity, Context context, BaseCardView baseCardView, bzjo bzjo, tie tie, String str, tim tim, Bundle bundle) {
        int i;
        aquk aquk;
        aqul aqul;
        boolean z;
        boolean z2;
        String str2;
        int i2;
        Context context2 = context;
        bzjo bzjo2 = bzjo;
        Bundle bundle2 = bundle;
        this.f86815a = activity;
        this.f86816b = context2;
        this.f86819e = bzjo2;
        this.f86821g = tie;
        this.f86817c = str;
        int integer = context.getResources().getInteger(C0126R.integer.reporting_chain_max_num_reports_when_collapsed);
        this.f86818d = tim;
        if ((bzjo2.f170320a & 1) == 0) {
            if (bzjo2.f170322c.size() == 0) {
                this.f86820f = null;
                baseCardView.setVisibility(8);
                return;
            }
        }
        if (bundle2 != null) {
            i = bundle2.getInt("reportingChainCardController");
        } else {
            i = integer;
        }
        if ((bzjo2.f170320a & 1) != 0) {
            aquk = new aquk(context2, C0126R.string.reporting_chain_manager, 1, null);
            View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.reporting_chain_entry, (ViewGroup) null);
            bzjn bzjn = bzjo2.f170321b;
            m72088a(inflate, bzjn == null ? bzjn.f170311f : bzjn);
            aquk.mo48158a(new aquq((ViewGroup) inflate));
        } else {
            aquk = null;
        }
        if (bzjo2.f170322c.size() != 0) {
            Context context3 = this.f86816b;
            bzjo bzjo3 = this.f86819e;
            if ((bzjo3.f170320a & 4) != 0 && (i2 = bzjo3.f170323d) > 0) {
                str2 = context3.getString(C0126R.string.reporting_chain_reports, Integer.valueOf(i2));
            } else {
                str2 = "";
            }
            aqul = new aqul(context3, str2);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f86816b).inflate((int) C0126R.C0128layout.reporting_chain_row, (ViewGroup) null);
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < this.f86819e.f170322c.size(); i3++) {
                if (i3 != 0 && i3 % childCount == 0) {
                    aqul.mo48161a(new aquq(viewGroup));
                    viewGroup = (ViewGroup) LayoutInflater.from(this.f86816b).inflate((int) C0126R.C0128layout.reporting_chain_row, (ViewGroup) null);
                }
                m72088a(viewGroup.getChildAt(i3 % childCount), (bzjn) this.f86819e.f170322c.get(i3));
            }
            aqul.mo48161a(new aquq(viewGroup));
        } else {
            aqul = null;
        }
        if (bzjo2.f170322c.size() > 3) {
            z = true;
        } else {
            z = false;
        }
        if (bzjo2.f170322c.size() == 0 || (bzjo2.f170320a & 4) == 0 || bzjo2.f170323d <= bzjo2.f170322c.size()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f86820f = new aqur(baseCardView, aquk, aqul, z, z2, i, bzjo2.f170322c.size(), tim);
    }

    /* renamed from: a */
    private final void m72088a(View view, bzjn bzjn) {
        String str;
        if (!bzjn.f170314b.isEmpty()) {
            ((TextView) view.findViewById(C0126R.C0129id.display_name)).setText(bzjn.f170314b);
        }
        if (!bzjn.f170317e.isEmpty()) {
            ((TextView) view.findViewById(C0126R.C0129id.subtitle)).setText(bzjn.f170317e);
        }
        tie tie = this.f86821g;
        String str2 = bzjn.f170316d;
        if (!TextUtils.isEmpty(str2)) {
            str = tey.m36894b(str2);
        } else {
            str = cgnq.m146307b();
        }
        String a = rzi.m34705a(str, this.f86816b.getResources().getDimensionPixelSize(C0126R.dimen.profile_card_people_avatar_diameter));
        int i = this.f86822h;
        this.f86822h = i + 1;
        tie.mo26557a(a, i, new aqub(this, view));
        view.setOnClickListener(new aquc(this, bzjn));
    }

    /* renamed from: a */
    public final void mo48130a(Bundle bundle) {
        int i;
        aqur aqur = this.f86820f;
        if (aqur != null) {
            aqul aqul = aqur.f86850b;
            if (aqul == null) {
                i = 0;
            } else if (!aqur.f86849a) {
                i = aqul.f86841b;
            } else if (aqul.mo48162d()) {
                int i2 = aqur.f86850b.f86841b;
                i = i2 + i2;
            } else {
                i = aqur.f86851c;
            }
            bundle.putInt("reportingChainCardController", i);
        }
    }
}
