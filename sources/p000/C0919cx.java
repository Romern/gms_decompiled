package p000;

import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: cx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0919cx extends C1402uf {

    /* renamed from: a */
    final /* synthetic */ C0918cw f12307a;

    /* renamed from: b */
    final /* synthetic */ int f12308b;

    /* renamed from: c */
    final /* synthetic */ C0918cw f12309c;

    /* renamed from: d */
    public final /* synthetic */ int f12310d;

    /* renamed from: e */
    public final /* synthetic */ int f12311e;

    public C0919cx(C0918cw cwVar, int i, C0918cw cwVar2, int i2, int i3) {
        this.f12307a = cwVar;
        this.f12308b = i;
        this.f12309c = cwVar2;
        this.f12310d = i2;
        this.f12311e = i3;
    }

    /* renamed from: a */
    public final Object mo8379a(int i, int i2) {
        Object obj = this.f12307a.get(i + this.f12308b);
        C0918cw cwVar = this.f12309c;
        Object obj2 = cwVar.get(i2 + cwVar.f12220b);
        if (obj == null || obj2 != null) {
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo8380b(int i, int i2) {
        Object obj = this.f12307a.get(i + this.f12308b);
        C0918cw cwVar = this.f12309c;
        Object obj2 = cwVar.get(i2 + cwVar.f12220b);
        if (obj != obj2) {
            return (obj == null || obj2 == null || ((Contact) obj).f80844a != ((Contact) obj2).f80844a) ? false : true;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo8381c(int i, int i2) {
        Object obj = this.f12307a.get(i + this.f12308b);
        C0918cw cwVar = this.f12309c;
        Object obj2 = cwVar.get(i2 + cwVar.f12220b);
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((Contact) obj).equals((Contact) obj2);
    }
}
