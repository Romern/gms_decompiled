package p000;

import android.app.Application;
import android.content.Context;

/* renamed from: aoyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyl implements aoym {

    /* renamed from: a */
    private static aoyl f83850a;

    /* renamed from: b */
    private static beoq f83851b;

    /* renamed from: c */
    private static beor f83852c;

    /* renamed from: d */
    private static beoh f83853d;

    /* renamed from: e */
    private static beog f83854e;

    /* renamed from: f */
    private static beoh f83855f;

    private aoyl() {
        beoq beoq = beoq.f111948d;
        f83851b = beoq;
        f83853d = beoq.mo60862a("/client_streamz/romanesco/opened_contacts_list_event", beol.m95355a("contact_type"));
        beoq beoq2 = f83851b;
        f83854e = (beog) beoq2.mo60864a(new beog("/client_streamz/romanesco/contacts_list_time_spent_in_ms", beoq2));
        f83855f = f83851b.mo60862a("/client_streamz/romanesco/get_backed_up_device_contacts_result", beol.m95357c("result"));
    }

    /* renamed from: a */
    public static synchronized aoyl m69842a(Context context, Application application) {
        aoyl aoyl;
        synchronized (aoyl.class) {
            if (f83850a == null) {
                f83850a = new aoyl();
                f83852c = new beof(new qws(context, "STREAMZ_ROMANESCO", null), "STREAMZ_ROMANESCO");
                beox.m95372a(f83852c, adzl.f62962b.mo25877a(1, 2), beoq.f111948d, application);
            }
            aoyl = f83850a;
        }
        return aoyl;
    }

    /* renamed from: a */
    public final void mo47006a(long j) {
        f83854e.mo60857a(Long.valueOf(j), beoc.f111924b);
    }

    /* renamed from: a */
    public final void mo47007a(String str) {
        f83853d.mo60849a(str);
    }

    /* renamed from: a */
    public final void mo47008a(boolean z) {
        f83855f.mo60849a(Boolean.valueOf(z));
    }
}
