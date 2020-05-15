package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.List;

/* renamed from: anpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anpa extends aonl {

    /* renamed from: a */
    final /* synthetic */ anpb f77337a;

    /* renamed from: b */
    private final List f77338b;

    /* renamed from: c */
    private final int f77339c;

    public anpa(anpb anpb, List list, int i) {
        this.f77337a = anpb;
        this.f77338b = list;
        this.f77339c = i;
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        return this.f77337a.f77365j;
    }

    /* renamed from: b */
    public final Object mo11416b(int i) {
        return null;
    }

    /* renamed from: d */
    public final int mo42055d() {
        int i = this.f77339c;
        int i2 = this.f77337a.f77370o;
        return ((i + i2) - 1) / i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo42053a(int i, View view, ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2;
        int i2;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) view2;
        } else {
            viewGroup2 = (ViewGroup) this.f77337a.f78590N.inflate((int) C0126R.C0128layout.plus_audience_selection_suggested_image_row, viewGroup, false);
        }
        while (true) {
            int childCount = viewGroup2.getChildCount();
            anpb anpb = this.f77337a;
            if (childCount >= anpb.f77370o) {
                break;
            }
            viewGroup2.addView(anpb.f78590N.inflate((int) C0126R.C0128layout.plus_audience_selection_suggested_image_item, viewGroup2, false));
        }
        if (viewGroup2.getChildCount() > this.f77337a.f77370o) {
            viewGroup2.removeViews(0, viewGroup2.getChildCount() - this.f77337a.f77370o);
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.f77337a.f77370o) {
            View childAt = viewGroup2.getChildAt(i2);
            int i3 = (this.f77337a.f77370o * i) + i2;
            if (i3 < this.f77339c) {
                AudienceMember audienceMember = (AudienceMember) this.f77338b.get(i3);
                audienceMember.f30298h.putInt("selectionSource", 1);
                this.f77337a.mo42040a(audienceMember, audienceMember.f30296f, audienceMember.f30298h.getString("secondaryText"), audienceMember.f30295e, audienceMember.f30297g, audienceMember.f30298h.getString("contactsAvatarUri"), this.f77337a.f77367l.f77451a.f30287b.contains(audienceMember), C0126R.C0128layout.plus_audience_selection_suggested_image_item, childAt, false, true, true).mo42098d();
                childAt.setVisibility(0);
            } else {
                childAt.setVisibility(4);
            }
            i2++;
        }
        return viewGroup2;
    }
}
