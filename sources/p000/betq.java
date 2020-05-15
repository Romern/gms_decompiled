package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: betq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betq {

    /* renamed from: a */
    public static final bfnp f112418a = new bfnp(3, -1.0d);

    /* renamed from: b */
    public final beto f112419b = new beto();

    /* renamed from: c */
    public final bert f112420c = new bert();

    /* renamed from: d */
    public final List f112421d = new ArrayList();

    /* renamed from: e */
    public final bgmk f112422e;

    /* renamed from: f */
    public bfnp f112423f = f112418a;

    /* renamed from: g */
    public long f112424g = 0;

    /* renamed from: h */
    public boolean f112425h = false;

    /* renamed from: i */
    public long f112426i = 0;

    /* renamed from: j */
    public int f112427j = 0;

    public betq(bgmk bgmk) {
        this.f112422e = bgmk;
    }

    /* renamed from: a */
    public final boolean mo61136a() {
        return (this.f112423f == null || SystemClock.elapsedRealtime() - this.f112424g > 360000 || this.f112423f == f112418a) ? false : true;
    }
}
