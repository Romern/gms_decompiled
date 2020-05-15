package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: rdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rdw implements bixj {

    /* renamed from: a */
    private final Context f42765a;

    /* renamed from: b */
    private final rbp f42766b;

    /* renamed from: c */
    private String f42767c;

    public rdw(Context context, rbp rbp) {
        this.f42765a = context;
        this.f42766b = rbp;
    }

    /* renamed from: a */
    public final String mo24524a() {
        return "NID";
    }

    /* renamed from: b */
    public final String mo24526b() {
        String str = aooo.m66219b(this.f42765a).f83468a;
        this.f42767c = str;
        return str;
    }

    /* renamed from: a */
    public final void mo24525a(String str) {
        if (cdej.m132800f()) {
            aood c = aooe.m66192c();
            c.f78604b = this.f42767c;
            c.f78603a = str;
            if (!aoop.m66223a(c.mo43121a(), this.f42765a)) {
                Log.e("ApacheHttpTransport", "Error in PseudonymousId compareAndSet() operation");
                this.f42766b.mo24439a();
                return;
            }
            return;
        }
        aoop.m66225a(new PseudonymousIdToken(str), this.f42765a);
    }
}
