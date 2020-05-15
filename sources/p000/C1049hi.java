package p000;

import java.util.ArrayList;

/* renamed from: hi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1049hi implements C1048hh {

    /* renamed from: a */
    final String f19821a;

    /* renamed from: b */
    final int f19822b;

    /* renamed from: c */
    final int f19823c;

    /* renamed from: d */
    final /* synthetic */ C1050hj f19824d;

    public C1049hi(C1050hj hjVar, String str, int i, int i2) {
        this.f19824d = hjVar;
        this.f19821a = str;
        this.f19822b = i;
        this.f19823c = i2;
    }

    /* renamed from: a */
    public final boolean mo11285a(ArrayList arrayList, ArrayList arrayList2) {
        C1018gh ghVar = this.f19824d.f19863n;
        if (ghVar != null && this.f19822b < 0 && this.f19821a == null && ghVar.getChildFragmentManager().mo12548c()) {
            return false;
        }
        return this.f19824d.mo12534a(arrayList, arrayList2, this.f19821a, this.f19822b, this.f19823c);
    }
}
