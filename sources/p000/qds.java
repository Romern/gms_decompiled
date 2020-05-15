package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkRequest;
import android.os.DropBoxManager;

/* renamed from: qds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qds {

    /* renamed from: a */
    public final Context f41007a;

    /* renamed from: b */
    public DropBoxManager f41008b = null;

    /* renamed from: c */
    public SharedPreferences f41009c = null;

    /* renamed from: d */
    public qhj f41010d;

    /* renamed from: e */
    public boolean f41011e = true;

    /* renamed from: f */
    public boolean f41012f = false;

    /* renamed from: g */
    public boolean f41013g = true;

    /* renamed from: h */
    public qdt f41014h = new qdt();

    /* renamed from: i */
    public String f41015i = "Unspecified task";

    /* renamed from: j */
    public boolean f41016j = false;

    /* renamed from: k */
    public String f41017k = cdcf.m132531b();

    /* renamed from: l */
    public long f41018l = 1256454000000L;

    /* renamed from: m */
    public boolean f41019m = false;

    /* renamed from: n */
    public boolean f41020n = true;

    /* renamed from: o */
    public boolean f41021o = false;

    /* renamed from: p */
    public boolean f41022p = false;

    /* renamed from: q */
    public boolean f41023q = true;

    /* renamed from: r */
    public boolean f41024r = false;

    /* renamed from: s */
    public bmxv f41025s = bmvz.f131120a;

    /* renamed from: t */
    public final bmxv f41026t = bmvz.f131120a;

    /* renamed from: u */
    public int f41027u = 16383;

    public qds(Context context, boolean z) {
        sdo.m34959a(context);
        this.f41007a = context;
        this.f41020n = z;
    }

    /* renamed from: a */
    public final qdu mo23963a() {
        boolean z;
        if (!soz.m35811h(this.f41007a)) {
            this.f41011e = false;
        }
        if (this.f41016j) {
            this.f41011e = false;
            if (!cdci.f180455a.mo6606a().mo77243f() || !this.f41023q) {
                z = false;
            } else {
                z = true;
            }
            this.f41023q = z;
        }
        if (this.f41021o) {
            this.f41011e = false;
            this.f41022p = true;
            this.f41023q = false;
        }
        if (sre.m36083c(this.f41007a)) {
            this.f41023q = false;
        }
        return new qdu(this);
    }

    /* renamed from: a */
    public final void mo23964a(int i, int i2, String str, String str2, boolean z) {
        bxvd da = qhj.f41354g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qhj qhj = (qhj) da.f164949b;
        int i3 = i - 1;
        if (i != 0) {
            qhj.f41357b = i3;
            int i4 = qhj.f41356a | 1;
            qhj.f41356a = i4;
            int i5 = i4 | 2;
            qhj.f41356a = i5;
            qhj.f41358c = i2;
            str.getClass();
            int i6 = i5 | 4;
            qhj.f41356a = i6;
            qhj.f41359d = str;
            str2.getClass();
            int i7 = i6 | 8;
            qhj.f41356a = i7;
            qhj.f41360e = str2;
            qhj.f41356a = i7 | 16;
            qhj.f41361f = z;
            this.f41010d = (qhj) da.mo74062i();
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo23965a(long j) {
        this.f41018l = Math.max(this.f41018l, j);
    }

    /* renamed from: a */
    public final void mo23966a(NetworkRequest networkRequest) {
        this.f41025s = bmxv.m108566b(networkRequest);
    }

    /* renamed from: a */
    public final void mo23967a(String str) {
        this.f41011e = !str.equals("UPLOAD_NONE");
    }
}
