package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aonm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aonm extends aonl {

    /* renamed from: a */
    private final List f78577a;

    /* renamed from: a */
    public final View mo42053a(int i, View view, ViewGroup viewGroup, boolean z) {
        return mo11413a(mo11416b(i), view, viewGroup, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo11413a(Object obj, View view, ViewGroup viewGroup, boolean z);

    /* renamed from: b */
    public final Object mo11416b(int i) {
        return this.f78577a.get(i);
    }

    /* renamed from: d */
    public final int mo42055d() {
        return this.f78577a.size();
    }

    public aonm(Collection collection) {
        boolean z;
        if (collection == null) {
            this.f78577a = Collections.emptyList();
            return;
        }
        boolean z2 = false;
        Integer num = 0;
        Integer valueOf = Integer.valueOf(collection.size());
        if (num.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "rangeStart");
        sdo.m34975b(valueOf.intValue() <= collection.size() ? true : z2, "rangeEnd");
        int intValue = valueOf.intValue() - num.intValue();
        this.f78577a = new ArrayList(intValue);
        for (Object obj : collection) {
            if (num.intValue() > 0) {
                num = Integer.valueOf(num.intValue() - 1);
            } else {
                this.f78577a.add(obj);
                if (this.f78577a.size() >= intValue) {
                    return;
                }
            }
        }
    }
}
