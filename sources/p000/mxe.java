package p000;

import android.app.PendingIntent;
import android.os.Parcel;

/* renamed from: mxe */
final /* synthetic */ class mxe implements mxj {

    /* renamed from: a */
    static final mxj f34883a = new mxe();

    private mxe() {
    }

    /* renamed from: a */
    public final Object mo20292a(beaz beaz) {
        Parcel a = beaz.mo8526a(4, beaz.mo8529bj());
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }
}
