package p000;

import android.content.ComponentName;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: adil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adil {

    /* renamed from: a */
    public final HashMap f61813a = new HashMap();

    /* renamed from: b */
    public final HashMap f61814b = new HashMap();

    /* renamed from: c */
    private final HashMap f61815c = new HashMap();

    /* renamed from: b */
    private final synchronized void m50535b(String str) {
        Iterator it = this.f61814b.entrySet().iterator();
        while (it.hasNext()) {
            if (((ComponentName) ((Map.Entry) it.next()).getValue()).getPackageName().equals(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final Integer mo33546a(String str) {
        return (Integer) this.f61815c.get(str);
    }

    /* renamed from: a */
    public final synchronized void mo33547a() {
        this.f61813a.clear();
        this.f61815c.clear();
        this.f61814b.clear();
    }

    /* renamed from: b */
    public final synchronized void mo33551b(String str, ComponentName componentName) {
        ComponentName componentName2 = (ComponentName) this.f61814b.get(str);
        if (componentName2 != null && componentName2.equals(componentName)) {
            this.f61814b.remove(str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo33548a(int i) {
        String str = (String) this.f61813a.remove(Integer.valueOf(i));
        if (str != null) {
            this.f61815c.remove(str);
            m50535b(str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo33549a(int i, String str) {
        sdo.m34959a((Object) str);
        HashMap hashMap = this.f61813a;
        Integer valueOf = Integer.valueOf(i);
        String str2 = (String) hashMap.put(valueOf, str);
        Integer num = (Integer) this.f61815c.put(str, valueOf);
        if (str2 != null && !str2.equals(str)) {
            this.f61815c.remove(str2);
            m50535b(str2);
        }
        if (num != null && !num.equals(valueOf)) {
            this.f61813a.remove(num);
        }
    }

    /* renamed from: a */
    public final synchronized void mo33550a(String str, ComponentName componentName) {
        this.f61814b.put(str, componentName);
    }
}
