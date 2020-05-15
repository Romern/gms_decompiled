package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.model.ViewerDataModel;
import com.google.android.gms.family.p042v2.model.PageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wny extends abh {

    /* renamed from: a */
    public final wnw f51007a;

    /* renamed from: d */
    public final int[] f51008d = new int[3];

    /* renamed from: e */
    public int f51009e = 0;

    /* renamed from: f */
    public List f51010f = new ArrayList();

    /* renamed from: g */
    public List f51011g = new ArrayList();

    /* renamed from: h */
    public ViewerDataModel f51012h;

    /* renamed from: i */
    public int f51013i;

    /* renamed from: j */
    public PageData f51014j;

    /* renamed from: k */
    public PageData f51015k;

    /* renamed from: l */
    public PageData f51016l;

    /* renamed from: m */
    public String f51017m;

    /* renamed from: n */
    final boolean f51018n;

    /* renamed from: o */
    final boolean f51019o;

    /* renamed from: p */
    final boolean f51020p;

    /* renamed from: q */
    private final Context f51021q;

    public wny(Context context, wnw wnw, boolean z, boolean z2, boolean z3) {
        this.f51018n = z;
        this.f51019o = z2;
        this.f51020p = z3;
        this.f51021q = context;
        this.f51007a = wnw;
    }

    /* renamed from: a */
    private static final void m42084a(View view, View.OnClickListener onClickListener, boolean z) {
        view.setClickable(z);
        if (z) {
            TypedValue typedValue = new TypedValue();
            view.getContext().getTheme().resolveAttribute(C0126R.attr.selectableItemBackground, typedValue, true);
            view.setBackgroundResource(typedValue.resourceId);
            view.setOnClickListener(onClickListener);
            return;
        }
        view.setBackgroundResource(0);
    }

    /* renamed from: f */
    public final void mo29237f(int i) {
        boolean z;
        MemberDataModel memberDataModel = (MemberDataModel) this.f51010f.get(i);
        String str = this.f51017m;
        if (str == null || !str.equals(memberDataModel.f31350a)) {
            z = false;
        } else {
            z = true;
        }
        wnw wnw = this.f51007a;
        wgn.m41923c("FamilyDashboardFragment", "Member row clicked, delegating to activity onMemberClicked()", new Object[0]);
        wot wot = (wot) wnw;
        wot.f51048c.mo18443b().mo29109a(4);
        if (cdti.f181697a.mo6606a().mo78289b()) {
            int i2 = Build.VERSION.SDK_INT;
            if (memberDataModel.mo18428a()) {
                wot.f51048c.mo18519b(memberDataModel);
                return;
            }
        }
        int i3 = memberDataModel.f31356g;
        if (i3 == 4) {
            wot.f51048c.mo18507a(memberDataModel);
        } else if (z && i3 == 5) {
            wot.f51048c.mo18528o();
        } else {
            wot.f51048c.mo18509a(memberDataModel, wot.f51052g, z, wot.f51051f.f31361b.contains(memberDataModel.f31350a));
        }
    }

    /* renamed from: a */
    private static final void m42085a(wnv wnv, PageData pageData) {
        wnv.f51000s.setDefaultImageResId(C0126R.C0127drawable.fm_ic_add);
        wnv.f51001t.setText((CharSequence) pageData.f31453a.get(18));
        if (pageData.f31453a.containsKey(19)) {
            String str = (String) pageData.f31453a.get(19);
            if (!TextUtils.isEmpty(str)) {
                wnv.f51002u.setText(str);
            }
        }
        if (pageData.f31453a.containsKey(20)) {
            String str2 = (String) pageData.f31453a.get(20);
            if (!TextUtils.isEmpty(str2)) {
                wnv.f51000s.setImageUrl(wgw.m41936a(str2, wnv.f51003v.getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_photo_size_small)), wgv.m41935a());
            }
        }
    }

    /* renamed from: a */
    private static final void m42086a(wnv wnv, String str, String str2, String str3, boolean z) {
        wnv.f51000s.setDefaultImageResId(C0126R.C0127drawable.fm_ic_avatar);
        wnv.f51000s.setImageUrl(wgw.m41936a(str, wnv.f51003v.getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_photo_size_small)), wgv.m41935a());
        wnv.f51001t.setText(str2);
        wnv.f51002u.setText(str3);
        m42084a(wnv.f51003v, wnv, z);
    }

    /* renamed from: a */
    private final boolean m42087a(MemberDataModel memberDataModel) {
        boolean z;
        String str = this.f51017m;
        if (str == null || !str.equals(memberDataModel.f31350a)) {
            z = false;
        } else {
            z = true;
        }
        if (cdti.f181697a.mo6606a().mo78288a()) {
            int i = Build.VERSION.SDK_INT;
            if (memberDataModel.mo18428a()) {
                return this.f51012h.f31360a.contains(memberDataModel.f31350a);
            }
        }
        int i2 = memberDataModel.f31356g;
        if (i2 == 4) {
            return this.f51012h.f31360a.contains(memberDataModel.f31350a) && this.f51020p;
        }
        if (z && i2 == 5) {
            return true;
        }
        if (cdsh.m134824c() && this.f51019o && memberDataModel.mo18428a()) {
            return this.f51012h.f31360a.contains(memberDataModel.f31350a);
        }
        if (this.f51018n) {
            return this.f51012h.f31360a.contains(memberDataModel.f31350a);
        }
        return !z && this.f51012h.f31361b.contains(memberDataModel.f31350a);
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f51010f.size() + this.f51011g.size() + this.f51009e;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        if (i < this.f51010f.size()) {
            return !TextUtils.isEmpty(((MemberDataModel) this.f51010f.get(i)).f31355f) ? 1 : 0;
        }
        if (i >= this.f51010f.size() && i < this.f51010f.size() + this.f51011g.size()) {
            return 2;
        }
        return this.f51008d[(i - this.f51010f.size()) - this.f51011g.size()];
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new wnu(this, from.inflate((int) C0126R.C0128layout.fm_item_1_line_with_avatar, viewGroup, false));
        }
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return new wnv(this, from.inflate((int) C0126R.C0128layout.fm_item_2_line_with_avatar, viewGroup, false));
        }
        if (i == 5) {
            return new wnx(from.inflate((int) C0126R.C0128layout.fm_item_manage_parent_row, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Invalid view type: ");
        sb.append(i);
        wgn.m41926f("DashboardAdapter", sb.toString(), new Object[0]);
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wny.a(android.view.View, android.view.View$OnClickListener, boolean):void
     arg types: [android.view.View, wnv, int]
     candidates:
      abh.a(int, int, java.lang.Object):void
      abh.a(acm, int, java.util.List):void
      wny.a(android.view.View, android.view.View$OnClickListener, boolean):void */
    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        String str;
        if ((acm instanceof wnv) && i == 0) {
            ((wnv) acm).f51004w.setVisibility(0);
        } else if ((acm instanceof wnu) && i == 0) {
            ((wnu) acm).f50998v.setVisibility(0);
        }
        int a = mo162a(i);
        if (a == 0) {
            MemberDataModel memberDataModel = (MemberDataModel) this.f51010f.get(i);
            wnu wnu = (wnu) acm;
            String str2 = memberDataModel.f31354e;
            String str3 = memberDataModel.f31352c;
            boolean a2 = m42087a(memberDataModel);
            wnu.f50995s.setDefaultImageResId(C0126R.C0127drawable.fm_ic_avatar);
            wnu.f50995s.setImageUrl(wgw.m41936a(str2, wnu.f50997u.getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_photo_size_small)), wgv.m41935a());
            wnu.f50996t.setText(str3);
            m42084a(wnu.f50997u, wnu, a2);
        } else if (a == 1) {
            MemberDataModel memberDataModel2 = (MemberDataModel) this.f51010f.get(i);
            m42086a((wnv) acm, memberDataModel2.f31354e, memberDataModel2.f31352c, memberDataModel2.f31355f, m42087a(memberDataModel2));
        } else if (a == 2) {
            wnv wnv = (wnv) acm;
            InvitationDataModel invitationDataModel = (InvitationDataModel) this.f51011g.get(i - this.f51010f.size());
            String str4 = invitationDataModel.f31347e;
            String a3 = invitationDataModel.mo18425a();
            int i2 = invitationDataModel.f31349g;
            Resources resources = this.f51021q.getResources();
            int i3 = i2 - 1;
            if (i3 == 2) {
                str = resources.getString(C0126R.string.fm_invitation_state_pending);
            } else if (i3 != 4) {
                str = resources.getString(C0126R.string.fm_invitation_state_not_sent);
            } else {
                str = resources.getString(C0126R.string.fm_invitation_state_expired);
            }
            m42086a(wnv, str4, a3, str, this.f51012h.mo18431a(2));
            TextView textView = wnv.f51002u;
            int i4 = invitationDataModel.f31349g;
            Resources resources2 = this.f51021q.getResources();
            if (i4 - 1 != 2) {
                textView.setTextColor(resources2.getColor(C0126R.color.fm_invitiations_failure_color));
            } else {
                textView.setTextColor(resources2.getColor(C0126R.color.fm_invitations_sent_color));
            }
        } else if (a == 3) {
            wnv wnv2 = (wnv) acm;
            PageData pageData = this.f51015k;
            if (pageData == null) {
                wgn.m41923c("DashboardAdapter", "InviteMember Pagedata null but populateInviteButtonView() called", new Object[0]);
                return;
            }
            m42085a(wnv2, pageData);
            m42084a(wnv2.f51003v, (View.OnClickListener) wnv2, true);
        } else if (a == 4) {
            wnv wnv3 = (wnv) acm;
            PageData pageData2 = this.f51014j;
            if (pageData2 == null) {
                wgn.m41923c("DashboardAdapter", "CreateAccount PageData null but populateCreateAccountButtonView() called", new Object[0]);
                return;
            }
            m42085a(wnv3, pageData2);
            m42084a(wnv3.f51003v, (View.OnClickListener) wnv3, true);
        } else if (a == 5) {
            wnx wnx = (wnx) acm;
            wnx.f51006s.setText((CharSequence) this.f51016l.f31453a.get(18));
            wnx.f51006s.setOnClickListener(new wnt(this));
        }
    }
}
