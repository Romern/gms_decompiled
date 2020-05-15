package p000;

/* renamed from: aneu */
public final /* synthetic */ class aneu implements roo {

    /* renamed from: a */
    private final String f76745a;

    /* renamed from: b */
    private final String f76746b;

    /* renamed from: c */
    private final int[] f76747c;

    public aneu(String str, String str2, int[] iArr) {
        this.f76745a = str;
        this.f76746b = str2;
        this.f76747c = iArr;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f76745a;
        String str2 = this.f76746b;
        int[] iArr = this.f76747c;
        angi angi = new angi((aucf) obj2);
        angm angm = (angm) ((angn) obj).mo25289B();
        String valueOf = String.valueOf(str);
        angm.mo41802a(angi, valueOf.length() == 0 ? new String("__internal.external_ids#") : "__internal.external_ids#".concat(valueOf), 0, new String[]{str2}, iArr, null);
    }
}
