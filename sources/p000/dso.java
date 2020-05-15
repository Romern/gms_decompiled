package p000;

import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: dso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dso extends dqi {

    /* renamed from: a */
    final /* synthetic */ ArrayList f13949a;

    /* renamed from: b */
    final /* synthetic */ Set f13950b;

    /* renamed from: c */
    final /* synthetic */ dsp f13951c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dso(dsp dsp, String str, Object[] objArr, ArrayList arrayList, Set set) {
        super(str, objArr);
        this.f13951c = dsp;
        this.f13949a = arrayList;
        this.f13950b = set;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        this.f13951c.mo9531a(7508);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        rkj rkj = (rkj) obj;
        if (!rkj.mo24811e().isEmpty()) {
            dub dub = new dub(rkj);
            ArrayList arrayList = this.f13949a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
                bxcm a = new dus(updateFenceOperation.f30663b.f30626b.mo18035c()).mo9660a(dub);
                if (a != null) {
                    updateFenceOperation.f30663b.f30626b = new ContextFenceStub(a);
                    i++;
                } else {
                    this.f13951c.mo9531a(7509);
                    return;
                }
            }
            this.f13950b.remove(6);
            this.f13951c.mo9532a(this.f13950b);
            return;
        }
        this.f13951c.mo9531a(7508);
    }
}
