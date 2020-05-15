package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.audience.AudienceSelectionListHeaderView;
import java.util.ArrayList;

/* renamed from: aonp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aonp extends aonl {

    /* renamed from: a */
    final /* synthetic */ aont f78581a;

    /* renamed from: b */
    final /* synthetic */ anpb f78582b;

    /* renamed from: c */
    private final aonl f78583c;

    /* renamed from: d */
    private final String f78584d;

    /* renamed from: e */
    private final String f78585e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aonp(anpb anpb, int i, aonl aonl) {
        this(anpb, anpb.mo43103a(i), aont.m66177b(anpb.mo43103a(i)), aonl);
        this.f78582b = anpb;
    }

    /* renamed from: c */
    private final boolean m66163c(int i) {
        return mo43096c() && i == 0;
    }

    /* renamed from: d */
    private final int m66164d(int i) {
        return mo43096c() ? i - 1 : i;
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        if (m66163c(i)) {
            return this.f78581a.f78591O;
        }
        return this.f78583c.mo11412a(m66164d(i));
    }

    /* renamed from: b */
    public final Object mo11416b(int i) {
        return !m66163c(i) ? this.f78583c.mo11416b(m66164d(i)) : this.f78584d;
    }

    /* renamed from: c */
    public final boolean mo43096c() {
        return this.f78584d != null;
    }

    /* renamed from: d */
    public final int mo42055d() {
        int d = this.f78583c.mo42055d();
        int i = 0;
        if (mo43096c() && d > 0) {
            i = 1;
        }
        return d + i;
    }

    /* renamed from: a */
    public final View mo42053a(int i, View view, ViewGroup viewGroup, boolean z) {
        if (!m66163c(i)) {
            aonl aonl = this.f78583c;
            int d = m66164d(i);
            boolean z2 = false;
            if (z) {
                if (!mo43096c()) {
                    z2 = true;
                } else if (i != 1) {
                    z2 = true;
                }
            }
            return aonl.mo42053a(d, view, viewGroup, z2);
        }
        String str = this.f78584d;
        AudienceSelectionListHeaderView audienceSelectionListHeaderView = (AudienceSelectionListHeaderView) this.f78582b.mo43102a(view, (int) C0126R.C0128layout.plus_audience_selection_list_header);
        audienceSelectionListHeaderView.f82282a.setText(str);
        return audienceSelectionListHeaderView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aonp(anpb anpb, int i, String str, aonl aonl) {
        this(anpb, anpb.mo43103a(i), str, aonl);
        this.f78582b = anpb;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aonp(anpb anpb, String str, aonl aonl) {
        this(anpb, str, aont.m66177b(str), aonl);
        this.f78582b = anpb;
    }

    /* renamed from: a */
    public final void mo43094a(ArrayList arrayList, int i) {
        if (this.f78585e != null && !mo43095b()) {
            arrayList.add(new aonq(this.f78585e, i));
        }
        this.f78583c.mo43094a(arrayList, i + (mo43096c() ? 1 : 0));
    }

    public aonp(aont aont, String str, String str2, aonl aonl) {
        this.f78581a = aont;
        this.f78583c = aonl;
        this.f78584d = str;
        this.f78585e = str2;
    }
}
