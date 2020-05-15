package p000;

/* renamed from: avlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlu {

    /* renamed from: a */
    private final String f93337a;

    public avlu(String str) {
        this.f93337a = str;
    }

    /* renamed from: a */
    public final avlv mo51361a(String str, Boolean bool, bdyx bdyx) {
        String str2 = this.f93337a;
        return new avlv(new avta(str.length() == 0 ? new String(str2) : str2.concat(str), bool), bmxv.m108566b(bdyx));
    }

    /* renamed from: a */
    public final avlv mo51362a(String str, Long l, bdyx bdyx) {
        String str2 = this.f93337a;
        return new avlv(new avtk(str.length() == 0 ? new String(str2) : str2.concat(str), l), bmxv.m108566b(bdyx));
    }

    /* renamed from: a */
    public final avlv mo51363a(String str, String str2, bdyx bdyx) {
        String str3 = this.f93337a;
        return new avlv(new avto(str.length() == 0 ? new String(str3) : str3.concat(str), str2), bmxv.m108566b(bdyx));
    }
}
