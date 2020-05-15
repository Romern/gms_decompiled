package p000;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alu {

    /* renamed from: a */
    final akz f868a;

    /* renamed from: b */
    final List f869b = new ArrayList();

    /* renamed from: c */
    public alb f870c;

    /* renamed from: d */
    private final akx f871d;

    public alu(akz akz) {
        this.f868a = akz;
        this.f871d = akz.f803b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final alv mo992a(String str) {
        int size = this.f869b.size();
        for (int i = 0; i < size; i++) {
            if (((alv) this.f869b.get(i)).f873b.equals(str)) {
                return (alv) this.f869b.get(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final ComponentName mo994b() {
        return this.f871d.f801a;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + mo993a() + " }";
    }

    /* renamed from: a */
    public final String mo993a() {
        return this.f871d.mo936a();
    }
}
