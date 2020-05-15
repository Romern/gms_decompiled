package p000;

import android.content.Context;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: bgaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgaz {

    /* renamed from: a */
    public final int f115952a;

    /* renamed from: b */
    public final LocationSettingsStates f115953b;

    /* renamed from: c */
    public final Context f115954c;

    /* renamed from: d */
    public final bgav f115955d;

    /* renamed from: e */
    public final boolean[] f115956e;

    /* renamed from: f */
    public int f115957f;

    public bgaz(Context context, bgav bgav, int i, LocationSettingsStates locationSettingsStates, boolean[] zArr) {
        bmxy.m108588a(zArr.length == 9);
        this.f115954c = context;
        this.f115955d = bgav;
        this.f115952a = i;
        this.f115953b = locationSettingsStates;
        this.f115956e = zArr;
    }

    /* renamed from: a */
    public final int mo62587a() {
        int i = this.f115952a;
        if (i == 8500 || i == 8501 || i == 8505) {
            return 8502;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo62588a(bgaw bgaw) {
        int i = this.f115957f - 1;
        this.f115957f = i;
        if (i == 0) {
            bgaw.mo62584a();
        }
    }
}
