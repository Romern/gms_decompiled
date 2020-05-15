package p000;

import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import java.util.concurrent.Callable;

/* renamed from: ahjz */
final /* synthetic */ class ahjz implements Callable {

    /* renamed from: a */
    private final ahki f67311a;

    /* renamed from: b */
    private final ahkv f67312b;

    /* renamed from: c */
    private final StartAdvertisingParams f67313c;

    public ahjz(ahki ahki, ahkv ahkv, StartAdvertisingParams startAdvertisingParams) {
        this.f67311a = ahki;
        this.f67312b = ahkv;
        this.f67313c = startAdvertisingParams;
    }

    public final Object call() {
        ahki ahki = this.f67311a;
        ahkv ahkv = this.f67312b;
        StartAdvertisingParams startAdvertisingParams = this.f67313c;
        if (ahkv.mo36719g()) {
            aihw aihw = new aihw();
            aihw.mo37501a(8001);
            return aihw.f68903a;
        }
        byte[] a = ahki.m55918a(startAdvertisingParams.f80630c, startAdvertisingParams.f80635h);
        int a2 = ahki.f67338a.mo36758a(ahkv, a, startAdvertisingParams.f80631d, startAdvertisingParams.f80633f, startAdvertisingParams.f80634g);
        aihw aihw2 = new aihw();
        aihw2.mo37501a(a2);
        if (a2 == 0) {
            aihw2.f68903a.f80602b = new String(a, ahkv.f67378a);
        }
        return aihw2.f68903a;
    }
}
