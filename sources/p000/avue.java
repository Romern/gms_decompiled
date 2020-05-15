package p000;

/* renamed from: avue */
public final /* synthetic */ class avue implements roo {

    /* renamed from: a */
    private final String f93916a;

    /* renamed from: b */
    private final rjx f93917b;

    public avue(rjx rjx, String str) {
        this.f93917b = rjx;
        this.f93916a = str;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        rjx rjx = this.f93917b;
        String str = this.f93916a;
        avty avty = (avty) rjx.f43171z;
        sdo.m34966a(avty, "canLog must be called by a client that has api options.");
        ((avuv) ((avvi) obj).mo25289B()).mo51631a(str, new avuk(avty, (aucf) obj2));
    }
}
