package p000;

import com.google.android.gms.cast.JoinOptions;

/* renamed from: pfj */
public final /* synthetic */ class pfj implements roo {

    /* renamed from: a */
    private final pfv f39030a;

    /* renamed from: b */
    private final String f39031b;

    /* renamed from: c */
    private final JoinOptions f39032c;

    public pfj(pfv pfv, String str, JoinOptions joinOptions) {
        this.f39030a = pfv;
        this.f39031b = str;
        this.f39032c = joinOptions;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        pfv pfv = this.f39030a;
        String str = this.f39031b;
        JoinOptions joinOptions = this.f39032c;
        pfv.mo23023d();
        ((ptq) ((ptj) obj).mo25289B()).mo23652a(str, (String) null, joinOptions);
        synchronized (pfv.f39059i) {
            if (pfv.f39056f != null) {
                pfv.mo23016a(2002);
            }
            pfv.f39056f = (aucf) obj2;
        }
    }
}
