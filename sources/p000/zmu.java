package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Goal;
import java.util.List;

/* renamed from: zmu */
public final /* synthetic */ class zmu implements bmxz {

    /* renamed from: a */
    private final List f55497a;

    /* renamed from: b */
    private final List f55498b;

    /* renamed from: c */
    private final List f55499c;

    public zmu(List list, List list2, List list3) {
        this.f55497a = list;
        this.f55498b = list2;
        this.f55499c = list3;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        List list = this.f55497a;
        List list2 = this.f55498b;
        List list3 = this.f55499c;
        Goal goal = (Goal) obj;
        Status status = zmv.f55500a;
        if (list != null && !list.contains(goal.mo18934a())) {
            return false;
        }
        if (list2 != null && !list2.contains(Integer.valueOf(goal.f32137e))) {
            return false;
        }
        int i = goal.f32137e;
        if (i != 1) {
            if (i == 2 || i == 3) {
                return list3.contains(DataType.f32046i);
            }
            return false;
        } else if (i == 1) {
            return list3.contains(ywb.m44931a(bzzn.m126359a(goal.f32138f.f32143a)));
        } else {
            throw new yxb(String.format("%s goal does not have %s objective", Goal.m23691a(i), Goal.m23691a(1)));
        }
    }
}
