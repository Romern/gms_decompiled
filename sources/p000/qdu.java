package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: qdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdu {

    /* renamed from: a */
    public final DropBoxManager f41031a;

    /* renamed from: b */
    public final SharedPreferences f41032b;

    /* renamed from: c */
    public final boolean f41033c;

    /* renamed from: d */
    public final boolean f41034d;

    /* renamed from: e */
    public final qdt f41035e;

    /* renamed from: f */
    public final String f41036f;

    /* renamed from: g */
    public final long f41037g;

    /* renamed from: h */
    public final boolean f41038h;

    /* renamed from: i */
    public final boolean f41039i;

    /* renamed from: j */
    public final boolean f41040j;

    /* renamed from: k */
    public final boolean f41041k;

    /* renamed from: l */
    public final bmxv f41042l;

    /* renamed from: m */
    public final Context f41043m;

    /* renamed from: n */
    public final boolean f41044n;

    /* renamed from: o */
    public String f41045o = null;

    /* renamed from: p */
    public final qhj f41046p;

    /* renamed from: q */
    public final String f41047q;

    /* renamed from: r */
    public final boolean f41048r;

    /* renamed from: s */
    public final bmxv f41049s;

    /* renamed from: t */
    private final int f41050t;

    public qdu(qds qds) {
        this.f41043m = qds.f41007a;
        this.f41031a = qds.f41008b;
        this.f41032b = qds.f41009c;
        this.f41047q = qds.f41017k;
        this.f41046p = qds.f41010d;
        this.f41044n = qds.f41011e;
        this.f41033c = qds.f41012f;
        this.f41034d = qds.f41013g;
        this.f41035e = qds.f41014h;
        this.f41036f = qds.f41015i;
        this.f41037g = qds.f41018l;
        this.f41038h = qds.f41019m;
        this.f41039i = qds.f41020n;
        this.f41040j = qds.f41022p;
        this.f41048r = qds.f41023q;
        this.f41050t = qds.f41027u;
        this.f41041k = qds.f41024r;
        this.f41049s = qds.f41025s;
        this.f41042l = qds.f41026t;
    }

    /* renamed from: a */
    public static qds m31973a(Context context) {
        boolean z;
        if (rfj.f42872d.mo24590b(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        return new qds(context, z);
    }

    /* renamed from: a */
    private final boolean m31974a(int i) {
        return (this.f41050t & i) == i;
    }

    /* renamed from: b */
    public final boolean mo23969b() {
        return m31974a(2);
    }

    /* renamed from: c */
    public final boolean mo23970c() {
        return m31974a(4);
    }

    /* renamed from: d */
    public final boolean mo23971d() {
        return m31974a(8);
    }

    /* renamed from: e */
    public final boolean mo23972e() {
        return m31974a(16);
    }

    /* renamed from: f */
    public final boolean mo23973f() {
        return m31974a(32);
    }

    /* renamed from: g */
    public final boolean mo23974g() {
        return m31974a(64);
    }

    /* renamed from: h */
    public final boolean mo23975h() {
        return m31974a(128);
    }

    /* renamed from: i */
    public final boolean mo23976i() {
        return m31974a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    /* renamed from: j */
    public final boolean mo23977j() {
        return m31974a(512);
    }

    /* renamed from: k */
    public final boolean mo23978k() {
        return m31974a(1024);
    }

    /* renamed from: l */
    public final boolean mo23979l() {
        return m31974a(2048);
    }

    /* renamed from: m */
    public final boolean mo23980m() {
        return m31974a(4096);
    }

    /* renamed from: n */
    public final boolean mo23981n() {
        return m31974a(8192);
    }

    /* renamed from: a */
    public final boolean mo23968a() {
        return m31974a(1);
    }
}
