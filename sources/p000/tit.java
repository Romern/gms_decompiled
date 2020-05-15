package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: tit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tit {

    /* renamed from: a */
    public HashSet f46144a;

    /* renamed from: b */
    public HashSet f46145b;

    /* renamed from: c */
    private final tmy f46146c = new tmy();

    /* renamed from: a */
    public final tiu mo26578a() {
        ArrayList arrayList;
        HashSet hashSet = this.f46144a;
        HashSet hashSet2 = this.f46145b;
        QueryFilterParameters a = this.f46146c.mo26664a();
        ArrayList arrayList2 = null;
        if (hashSet != null) {
            arrayList = new ArrayList(hashSet);
        } else {
            arrayList = null;
        }
        if (hashSet2 != null) {
            arrayList2 = new ArrayList(hashSet2);
        }
        sdo.m34959a(a);
        return new ContextDataFilterImpl(arrayList, arrayList2, a);
    }

    /* renamed from: b */
    public final void mo26582b(int i) {
        sdo.m34974b(i > 0);
        this.f46146c.mo26666b();
        this.f46146c.mo26665a(i);
    }

    /* renamed from: a */
    public final void mo26579a(int i) {
        if (this.f46144a == null) {
            this.f46144a = new HashSet();
        }
        HashSet hashSet = this.f46144a;
        tkb tkb = new tkb();
        tkb.mo26624b();
        hashSet.add(new ContextDataFilterImpl.Inclusion(-1, i, tkb.mo26620a(), null));
    }

    /* renamed from: a */
    public final void mo26580a(int i, TimeFilterImpl timeFilterImpl) {
        if (this.f46144a == null) {
            this.f46144a = new HashSet();
        }
        this.f46144a.add(new ContextDataFilterImpl.Inclusion(-1, i, timeFilterImpl, null));
    }

    /* renamed from: a */
    public final void mo26581a(int[] iArr) {
        tmy tmy = this.f46146c;
        for (int i : iArr) {
            boolean a = ContextData.m22842a(i);
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unknown sync state=");
            sb.append(i);
            sdo.m34975b(a, sb.toString());
        }
        tmy.f46275a = iArr;
    }
}
