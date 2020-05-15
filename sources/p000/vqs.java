package p000;

/* renamed from: vqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum vqs implements bmwc {
    EQUALS,
    STARTS_WITH,
    ENDS_WITH,
    CONTAINS;

    /* renamed from: a */
    public final /* synthetic */ boolean mo28751a(Object obj, Object obj2) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (str == null) {
                return str2.isEmpty();
            }
            return str.equals(str2);
        } else if (ordinal == 1) {
            String str3 = (String) obj;
            return str3 != null && str3.startsWith((String) obj2);
        } else if (ordinal == 2) {
            String str4 = (String) obj;
            return str4 != null && str4.endsWith((String) obj2);
        } else if (ordinal == 3) {
            String str5 = (String) obj;
            return str5 != null && str5.contains((String) obj2);
        } else {
            throw null;
        }
    }
}
