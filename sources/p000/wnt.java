package p000;

import android.view.View;
import com.google.android.gms.family.model.MemberDataModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wnt */
final /* synthetic */ class wnt implements View.OnClickListener {

    /* renamed from: a */
    private final wny f50994a;

    public wnt(wny wny) {
        this.f50994a = wny;
    }

    public void onClick(View view) {
        wot wot = (wot) this.f50994a.f51007a;
        wot.f51048c.mo18443b().mo29109a(32);
        ArrayList arrayList = new ArrayList();
        List list = wot.f51053h.f50701a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MemberDataModel memberDataModel = (MemberDataModel) list.get(i);
            if (memberDataModel.f31357h) {
                arrayList.add(memberDataModel);
            } else if (memberDataModel.f31356g == 1) {
                arrayList.add(memberDataModel);
            }
        }
        wot.f51048c.mo18515a(arrayList, wot.f51054i.f31337a.mo18558a(29));
    }
}
