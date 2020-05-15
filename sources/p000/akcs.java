package p000;

import android.content.Context;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater$1;

/* renamed from: akcs */
public final /* synthetic */ class akcs implements Runnable {

    /* renamed from: a */
    private final ContactBookUpdater$1 f71612a;

    /* renamed from: b */
    private final Context f71613b;

    public akcs(ContactBookUpdater$1 contactBookUpdater$1, Context context) {
        this.f71612a = contactBookUpdater$1;
        this.f71613b = context;
    }

    public final void run() {
        ContactBookUpdater$1 contactBookUpdater$1 = this.f71612a;
        Context context = this.f71613b;
        akcv akcv = contactBookUpdater$1.f81140a;
        akcv.f71623h = akcv.mo39234d();
        if (contactBookUpdater$1.f81140a.f71623h) {
            ahhd.m55769a(context, "com.google.android.gms.nearby.sharing.ACTION_CONTACTS_REFRESHED");
        }
    }
}
