package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.List;

/* renamed from: anor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anor extends aonl {

    /* renamed from: a */
    final /* synthetic */ anpb f77322a;

    /* renamed from: b */
    private final List f77323b;

    /* renamed from: c */
    private final int f77324c;

    /* renamed from: d */
    private final int f77325d;

    /* renamed from: e */
    private final int f77326e;

    public anor(anpb anpb, List list, int i, int i2, int i3) {
        this.f77322a = anpb;
        this.f77323b = list;
        this.f77324c = i;
        this.f77325d = i2 - i;
        this.f77326e = i3;
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        return this.f77322a.f77366k;
    }

    /* renamed from: c */
    public final AudienceMember mo11416b(int i) {
        return (AudienceMember) this.f77323b.get(this.f77324c + i);
    }

    /* renamed from: d */
    public final int mo42055d() {
        return this.f77325d;
    }

    /* renamed from: a */
    public final View mo42053a(int i, View view, ViewGroup viewGroup, boolean z) {
        AudienceMember c = mo11416b(i);
        c.f30298h.putInt("selectionSource", this.f77326e);
        anpb anpb = this.f77322a;
        String str = c.f30296f;
        String string = c.f30298h.getString("secondaryText");
        String str2 = c.f30295e;
        String str3 = c.f30297g;
        String string2 = c.f30298h.getString("contactsAvatarUri");
        anpb anpb2 = this.f77322a;
        int i2 = anpb.f77340E;
        Audience audience = anpb2.f77367l.f77451a;
        sdo.m34966a(audience, "Audience must not be null.");
        sdo.m34966a(c, "Audience member must not be null.");
        return anpb.mo42040a(c, str, string, str2, str3, string2, audience.f30287b.contains(c), C0126R.C0128layout.plus_audience_selection_list_person, view, z, false, c.f30298h.getBoolean("checkboxEnabled", true));
    }
}
