package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.family.model.MemberDataModel;
import java.util.List;

/* renamed from: wpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpj extends abh {

    /* renamed from: a */
    public List f51087a;

    /* renamed from: d */
    public final wph f51088d;

    /* renamed from: e */
    public String f51089e;

    /* renamed from: f */
    public MemberDataModel f51090f = null;

    /* renamed from: g */
    public String f51091g;

    /* renamed from: h */
    private final String f51092h;

    public wpj(wph wph, List list, String str) {
        this.f51087a = list;
        this.f51088d = wph;
        this.f51092h = str;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MemberDataModel memberDataModel = (MemberDataModel) list.get(i);
            int i2 = memberDataModel.f31356g;
            if (i2 == 2) {
                this.f51090f = memberDataModel;
            } else if (i2 == 1) {
                this.f51091g = memberDataModel.f31350a;
            }
        }
    }

    /* renamed from: a */
    private static final void m42136a(View view, View.OnClickListener onClickListener, boolean z) {
        view.setClickable(z);
        if (z) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29267c() {
        this.f51089e = null;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f51087a.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        return new wpi(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.fm_item_manage_parents, viewGroup, false));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wpj.a(android.view.View, android.view.View$OnClickListener, boolean):void
     arg types: [android.view.View, wpi, int]
     candidates:
      abh.a(int, int, java.lang.Object):void
      abh.a(acm, int, java.util.List):void
      wpj.a(android.view.View, android.view.View$OnClickListener, boolean):void */
    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        boolean z;
        MemberDataModel memberDataModel = (MemberDataModel) this.f51087a.get(i);
        wpi wpi = (wpi) acm;
        wpi.f51082s.setDefaultImageResId(C0126R.C0127drawable.fm_ic_avatar);
        wpi.f51082s.setImageUrl(wgw.m41936a(memberDataModel.f31354e, wpi.f51084u.getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_photo_size_small)), wgv.m41935a());
        if (this.f51091g.equals(memberDataModel.f31350a)) {
            wpi.f51083t.setText(this.f51092h);
            wpi.f51082s.setVisibility(8);
        } else {
            wpi.f51083t.setText(memberDataModel.f31352c);
        }
        String str = this.f51089e;
        if (str != null) {
            z = str.equals(memberDataModel.f31350a);
        } else {
            MemberDataModel memberDataModel2 = this.f51090f;
            if (memberDataModel2 != null) {
                z = memberDataModel2.f31350a.equals(memberDataModel.f31350a);
            } else {
                z = this.f51091g.equals(memberDataModel.f31350a);
            }
        }
        wpi.f51085v.setChecked(z);
        wpi.f51085v.setClickable(false);
        wpi.f51085v.setFocusable(false);
        if (!z) {
            m42136a(wpi.f51084u, (View.OnClickListener) wpi, true);
        } else {
            m42136a(wpi.f51084u, (View.OnClickListener) wpi, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29266a(String str) {
        this.f51089e = str;
        mo171aJ();
    }
}
