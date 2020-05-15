package p000;

import android.content.Context;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: aysc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aysc {

    /* renamed from: a */
    public static final String f98396a = aysc.class.getSimpleName();

    /* renamed from: b */
    public static final long f98397b = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: c */
    public final Object f98398c = new Object();

    /* renamed from: d */
    public final aysr f98399d = new aysa(this);

    /* renamed from: e */
    public final aytb f98400e = new aytb(5);

    /* renamed from: f */
    public final Context f98401f;

    /* renamed from: g */
    public final ayss f98402g;

    /* renamed from: h */
    public final aysj f98403h;

    /* renamed from: i */
    public volatile ayrr f98404i = null;

    /* renamed from: j */
    public volatile aysp f98405j = null;

    /* renamed from: k */
    final ConcurrentMap f98406k = new ConcurrentHashMap();

    public aysc(Context context, ayss ayss) {
        bmxy.m108581a(context);
        bmxy.m108581a(ayss);
        aysj aysj = new aysj();
        this.f98401f = context;
        this.f98402g = ayss;
        this.f98403h = aysj;
    }

    /* renamed from: a */
    public final ayrx mo54346a(aysl aysl) {
        ayrx ayrx = (ayrx) this.f98406k.get(aysl);
        if (ayrx != null) {
            return ayrx;
        }
        throw new BluetoothGattException(String.format("Received operation on an unknown device: %s", aysl), 257);
    }
}
