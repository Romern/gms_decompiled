package p000;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aala */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aala extends dcj implements aalc {
    public aala(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.IGcmServiceDiagnostics");
    }

    /* renamed from: a */
    public final List mo16964a() {
        Parcel a = mo8526a(1, mo8529bj());
        ArrayList<String> createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    /* renamed from: c */
    public final String mo16965c() {
        Parcel a = mo8526a(2, mo8529bj());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo16966d() {
        Parcel a = mo8526a(3, mo8529bj());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
