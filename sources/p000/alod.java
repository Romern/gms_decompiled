package p000;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

/* renamed from: alod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alod extends alnb {

    /* renamed from: b */
    private final String f73925b;

    /* renamed from: c */
    private final String f73926c;

    /* renamed from: d */
    private final String f73927d;

    /* renamed from: e */
    private final List f73928e;

    /* renamed from: f */
    private final int f73929f;

    /* renamed from: g */
    private final boolean f73930g;

    /* renamed from: s */
    private final long f73931s;

    /* renamed from: t */
    private final String f73932t;

    /* renamed from: u */
    private final int f73933u;

    /* renamed from: v */
    private final int f73934v;

    /* renamed from: w */
    private final int f73935w;

    public alod(String str, int i, alzm alzm, String str2, String str3, String str4, List list, int i2, boolean z, long j, String str5, int i3, int i4, int i5) {
        super(str, i, alzm, str2, "LoadPeople");
        this.f73925b = str2;
        this.f73926c = str3;
        this.f73927d = str4;
        this.f73928e = list;
        this.f73929f = i2;
        this.f73930g = z;
        this.f73931s = j;
        this.f73932t = str5;
        this.f73933u = i3;
        this.f73934v = i4;
        this.f73935w = i5;
    }

    /* renamed from: d */
    public final DataHolder mo40606d(Context context) {
        return alog.m61419a(context, this.f73925b, this.f73926c, this.f73927d, this.f73928e, this.f73929f, this.f73930g, this.f73931s, this.f73932t, this.f73933u, this.f73935w, this.f73934v, false);
    }
}
