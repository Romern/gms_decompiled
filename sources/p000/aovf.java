package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: aovf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovf extends aove {

    /* renamed from: b */
    private final aosv f83668b;

    /* renamed from: c */
    private final String f83669c;

    public aovf(aosv aosv, aost aost, String str) {
        super(aost, "AddListener");
        this.f83668b = aosv;
        this.f83669c = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean add;
        new Object[1][0] = this;
        aovd a = aovd.m69610a();
        aosv aosv = this.f83668b;
        aost aost = this.f83667a;
        String str = this.f83669c;
        synchronized (a.f83664a) {
            WeakHashMap weakHashMap = (WeakHashMap) a.f83665b.get(str);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                a.f83665b.put(str, weakHashMap);
            }
            Set set = (Set) weakHashMap.get(aosv);
            if (set == null) {
                set = new HashSet();
                weakHashMap.put(aosv, set);
            }
            add = set.add(aost);
        }
        if (!add) {
            String valueOf = String.valueOf(this.f83667a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Duplicate listener ");
            sb.append(valueOf);
            aowu.m69736c("RemindersApiOp", sb.toString(), new Object[0]);
            this.f83667a.mo46830a(new Status(10));
            return;
        }
        this.f83667a.mo46830a(new Status(0));
    }
}
