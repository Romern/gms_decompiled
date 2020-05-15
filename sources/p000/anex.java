package p000;

/* renamed from: anex */
final /* synthetic */ class anex implements roo {

    /* renamed from: a */
    private final String f76752a;

    /* renamed from: b */
    private final String f76753b;

    public anex(String str, String str2) {
        this.f76752a = str;
        this.f76753b = str2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f76752a;
        String str2 = this.f76753b;
        angi angi = new angi((aucf) obj2);
        StringBuilder sb = new StringBuilder(str2.length() + 9 + str.length());
        sb.append("CURRENT:");
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        ((angm) ((angn) obj).mo25289B()).mo41814b(angi, sb.toString());
    }
}
