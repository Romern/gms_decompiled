package p000;

@Deprecated
/* renamed from: avom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avom extends avnn {

    /* renamed from: e */
    public static final avto f93633e = new avto("file_path", "");

    public avom(avte avte) {
        super("reboot", avte);
    }

    /* renamed from: c */
    public final avni mo51435c() {
        if (avls.m78732a()) {
            avtd a = avte.m79303a();
            a.mo51594a(avnt.f93547f, (String) mo51433a(f93633e));
            return new avni("ab-reboot", a.mo51593a());
        }
        avtd a2 = avte.m79303a();
        a2.mo51594a(avog.f93581e, (String) mo51433a(f93633e));
        return new avni("non-ab-reboot", a2.mo51593a());
    }
}
