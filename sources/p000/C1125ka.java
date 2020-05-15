package p000;

import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1125ka {

    /* renamed from: a */
    final ArrayList f23597a = new ArrayList();

    /* renamed from: b */
    final HashMap f23598b = new HashMap();

    C1125ka() {
    }

    /* renamed from: a */
    static C1125ka m17549a(ViewGroup viewGroup, C1050hj hjVar) {
        hjVar.mo12572q();
        Object tag = viewGroup.getTag(C0126R.C0129id.special_effects_controller_view_tag);
        if (tag instanceof C1125ka) {
            return (C1125ka) tag;
        }
        C1125ka kaVar = new C1125ka(null);
        viewGroup.setTag(C0126R.C0129id.special_effects_controller_view_tag, kaVar);
        return kaVar;
    }

    public C1125ka(byte[] bArr) {
        new HashMap();
    }

    /* renamed from: a */
    public final void mo14272a(C1055ho hoVar, C1187mg mgVar) {
        if (!mgVar.mo15460a()) {
            synchronized (this.f23597a) {
                C1187mg mgVar2 = new C1187mg();
                C1123jz jzVar = new C1123jz(hoVar);
                this.f23597a.add(jzVar);
                this.f23598b.put(jzVar.f23557a, jzVar);
                mgVar.mo15459a(new C1121jx(this, jzVar, mgVar2));
                jzVar.f23558b.add(new C1122jy(this, jzVar));
            }
        }
    }
}
