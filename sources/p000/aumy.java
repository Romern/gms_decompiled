package p000;

/* renamed from: aumy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumy {

    /* renamed from: a */
    public final String f92120a;

    /* renamed from: b */
    public final Object f92121b;

    /* renamed from: c */
    public final aumw f92122c;

    public aumy(String str, Boolean bool) {
        this(str, bool, aumx.f92119a);
    }

    public aumy(String str, Object obj, aumw aumw) {
        sdo.m34975b(!str.equals("__id__"), "The keyName cannot be __id__.");
        sdo.m34977c(str);
        this.f92120a = str;
        this.f92121b = obj;
        sdo.m34959a(aumw);
        this.f92122c = aumw;
    }

    public aumy(String str, String str2) {
        this(str, str2, aumz.f92123a);
    }
}
