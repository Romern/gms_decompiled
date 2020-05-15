package p000;

import java.util.Map;

/* renamed from: ahnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahnd {

    /* renamed from: a */
    public final Map f67597a = new C1223np();

    /* renamed from: a */
    public final byqy mo36872a(String str) {
        if (this.f67597a.containsKey(str)) {
            return ((ahnc) this.f67597a.get(str)).f67596b;
        }
        return null;
    }

    /* renamed from: b */
    public final ahna mo36874b(String str) {
        if (this.f67597a.containsKey(str)) {
            return ((ahnc) this.f67597a.get(str)).f67595a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo36873a(String str, int i) {
        ahnc ahnc = (ahnc) this.f67597a.remove(str);
        if (ahnc == null) {
            return false;
        }
        new soa(9, new ahnb(ahnc, str)).start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        ahnc.f67595a.mo36796a(i);
        return true;
    }
}
