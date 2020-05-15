package p000;

import android.content.Context;

/* renamed from: agmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agmo {

    /* renamed from: a */
    final Context f65970a;

    public agmo(Context context) {
        sdo.m34959a(context);
        Context applicationContext = context.getApplicationContext();
        sdo.m34959a(applicationContext);
        this.f65970a = applicationContext;
    }

    /* renamed from: a */
    public agii mo35703a(agmn agmn) {
        return new agii(agmn);
    }

    /* renamed from: b */
    public agme mo35705b(agmn agmn) {
        return new agme(agmn);
    }

    /* renamed from: c */
    public agkr mo35706c(agmn agmn) {
        return new agkr(agmn);
    }

    /* renamed from: a */
    public agmn mo35704a() {
        return new agmn(this);
    }
}
