package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: anoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anoz extends aonm {

    /* renamed from: a */
    public String f77335a;

    /* renamed from: b */
    final /* synthetic */ anpb f77336b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anoz(anpb anpb, Collection collection) {
        super(collection);
        this.f77336b = anpb;
        new ArrayList();
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        return this.f77336b.f77363h;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo11413a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        boolean z2;
        boolean z3;
        amfa amfa = (amfa) obj;
        int indexOf = this.f77336b.f77367l.f77451a.f30287b.indexOf(sfh.m35162a(amfa));
        if (indexOf >= 0) {
            z2 = ((AudienceMember) this.f77336b.f77367l.f77451a.f30287b.get(indexOf)).f30298h.getBoolean("checkboxEnabled", true);
            z3 = true;
        } else {
            z3 = false;
            z2 = true;
        }
        AudienceSelectionListPersonView a = this.f77336b.mo42040a(amfa, amfa.mo25474c(), this.f77335a, amfa.mo25472a(), amfa.mo25475d(), null, z3, C0126R.C0128layout.plus_audience_selection_list_person, view, z, false, z2);
        a.f77420g = true;
        return a;
    }
}
