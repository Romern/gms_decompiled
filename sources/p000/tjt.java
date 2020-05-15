package p000;

import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: tjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjt implements tmx {

    /* renamed from: a */
    public final doh f46215a;

    /* renamed from: b */
    public final int f46216b;

    /* renamed from: c */
    public final ArrayList f46217c;

    /* renamed from: d */
    private final QueryFilterParameters f46218d;

    public tjt(doh doh, int i, ArrayList arrayList, QueryFilterParameters queryFilterParameters) {
        this.f46215a = doh;
        this.f46216b = i;
        this.f46217c = arrayList;
        sdo.m34959a(queryFilterParameters);
        this.f46218d = queryFilterParameters;
    }

    /* renamed from: a */
    public final QueryFilterParameters mo18050a() {
        return this.f46218d;
    }

    /* renamed from: b */
    public final boolean mo26601b() {
        ArrayList arrayList = this.f46217c;
        return arrayList != null && !arrayList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tjt) {
            tjt tjt = (tjt) obj;
            if (mo26601b() == tjt.mo26601b()) {
                if (mo26601b()) {
                    if (tjt.f46217c.size() == this.f46217c.size()) {
                        ArrayList arrayList = this.f46217c;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            i++;
                            if (!tjt.f46217c.contains((tjs) arrayList.get(i))) {
                            }
                        }
                    }
                    return false;
                }
                return this.f46218d.equals(tjt.f46218d);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        ArrayList arrayList = this.f46217c;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += Arrays.hashCode(new Object[]{(tjs) arrayList.get(i2)});
            }
        } else {
            i = 0;
        }
        return i + Arrays.hashCode(new Object[]{this.f46218d});
    }
}
