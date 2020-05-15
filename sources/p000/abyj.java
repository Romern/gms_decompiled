package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: abyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyj {

    /* renamed from: a */
    public final belh f58734a;

    public abyj(Context context) {
        befh a = befi.m94962a(context);
        a.mo60660a("icing");
        a.mo60663b("ClientCacheRecordStore.pb");
        Uri a2 = a.mo60657a();
        bejq g = bejr.m95186g();
        g.mo60762a(a2);
        g.mo60764a(abqc.f57940b);
        this.f58734a = adzg.f62956a.mo60765a(g.mo60761a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32436a(List list) {
        bqfy.m112768a(this.f58734a.mo60777a(new abyi(list), bqfb.INSTANCE), IOException.class);
    }
}
