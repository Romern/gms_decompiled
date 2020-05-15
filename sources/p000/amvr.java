package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: amvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amvr {
    /* renamed from: r */
    public static amvq m63450r() {
        amvq amvq = new amvq();
        amvq.mo41445d(false);
        amvq.mo41447f(false);
        amvq.mo41446e(false);
        amvq.mo41442a(false);
        amvq.mo41444c(false);
        amvq.mo41443b(false);
        return amvq;
    }

    /* renamed from: a */
    public abstract boolean mo41393a();

    /* renamed from: b */
    public abstract boolean mo41394b();

    /* renamed from: c */
    public abstract boolean mo41395c();

    /* renamed from: d */
    public abstract boolean mo41396d();

    /* renamed from: e */
    public abstract boolean mo41397e();

    /* renamed from: f */
    public abstract boolean mo41399f();

    /* renamed from: g */
    public abstract Long mo41400g();

    /* renamed from: h */
    public abstract Long mo41401h();

    /* renamed from: i */
    public abstract Long mo41403i();

    /* renamed from: j */
    public abstract String mo41404j();

    /* renamed from: k */
    public abstract String mo41405k();

    /* renamed from: l */
    public abstract String mo41406l();

    /* renamed from: m */
    public abstract String mo41407m();

    /* renamed from: n */
    public abstract String mo41408n();

    /* renamed from: o */
    public abstract String mo41409o();

    /* renamed from: p */
    public abstract String mo41410p();

    /* renamed from: q */
    public abstract alvh mo41411q();

    /* renamed from: s */
    public final ContentValues mo41448s() {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("sourceid", mo41404j());
        contentValues.put("system_id", mo41405k());
        contentValues.put("group_is_read_only", Integer.valueOf(mo41395c() ? 1 : 0));
        contentValues.put("auto_add", Integer.valueOf(mo41396d() ? 1 : 0));
        contentValues.put("favorites", Integer.valueOf(mo41393a() ? 1 : 0));
        contentValues.put("title", mo41406l());
        contentValues.put("sync2", mo41407m());
        contentValues.put("sync3", mo41403i());
        if (cfwd.f185832a.mo6606a().mo82825c() && !TextUtils.isEmpty(mo41406l())) {
            if (TextUtils.isEmpty(mo41405k())) {
                str = mo41406l();
            } else {
                String valueOf = String.valueOf(mo41406l());
                str = valueOf.length() == 0 ? new String("System Group: ") : "System Group: ".concat(valueOf);
            }
            contentValues.put("notes", str);
        }
        return contentValues;
    }
}
