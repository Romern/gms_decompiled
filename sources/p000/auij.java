package p000;

import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: auij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auij extends auit {

    /* renamed from: a */
    public final C1225nr f91882a;

    /* renamed from: b */
    public int f91883b;

    /* renamed from: c */
    public Future f91884c;

    /* renamed from: i */
    private final List f91885i;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public auij(augv augv, EmergencyInfo emergencyInfo, Iterable r10) {
        super(augv, emergencyInfo, r10);
        int i;
        bmxy.m108588a("CALL".equals(emergencyInfo.mo59538b()));
        HashSet hashSet = new HashSet();
        int size = r10.size();
        int i2 = 0;
        while (i2 < size) {
            List list = ((aufy) r10.get(i2)).f91747b.f109087b;
            int size2 = list.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                hashSet.add(Integer.valueOf(((DeviceState) list.get(i3)).f109077a));
                i3++;
            }
            i2 = i;
        }
        this.f91885i = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f91885i.add(new auii(this, augv, ((Integer) it.next()).intValue()));
        }
        this.f91883b = 0;
        this.f91882a = new C1225nr(hashSet.size());
    }

    /* renamed from: a */
    public final bqgg mo50551a() {
        bqgg a = super.mo50551a();
        List list = this.f91885i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            auii auii = (auii) list.get(i);
            auii.f91878a.mo50536a(auii);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50552b() {
        super.mo50552b();
        List list = this.f91885i;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((auii) list.get(i)).f91878a.mo50534a();
            }
            this.f91885i.clear();
        }
    }
}
