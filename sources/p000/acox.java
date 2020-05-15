package p000;

/* renamed from: acox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acox implements Comparable {

    /* renamed from: a */
    final acow f60380a;

    /* renamed from: b */
    final int f60381b;

    public acox(String str, String str2, int i, int i2) {
        acow acow = new acow();
        this.f60380a = acow;
        acow.f60377a = str;
        acow.f60378b = str2;
        int i3 = 4;
        acow.f60379c = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "none" : "tentative" : "invited" : "declined" : "accepted";
        i3 = i != 1 ? i != 2 ? 2 : 0 : i3;
        this.f60381b = i2 == 1 ? i3 + 1 : i3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        acox acox = (acox) obj;
        int i = this.f60381b - acox.f60381b;
        return i == 0 ? acox.f60380a.compareTo(this.f60380a) : i;
    }
}
