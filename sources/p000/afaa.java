package p000;

import android.content.Context;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.magictether.host.ConnectTetheringResponder$TetheringResultReceiver;

/* renamed from: afaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afaa {

    /* renamed from: f */
    public static final Logger f64073f = new Logger(new String[]{"ConnectTetherResponder"}, (int[]) null);

    /* renamed from: a */
    public final Context f64074a;

    /* renamed from: b */
    public final RemoteDevice f64075b;

    /* renamed from: c */
    public final afby f64076c;

    /* renamed from: d */
    public final afai f64077d;

    /* renamed from: e */
    public ConnectTetheringResponder$TetheringResultReceiver f64078e;

    public afaa(Context context, RemoteDevice remoteDevice) {
        afby a = afbv.m52820a(context);
        this.f64074a = context;
        this.f64075b = remoteDevice;
        this.f64076c = a;
        this.f64077d = new afai(context);
    }
}
