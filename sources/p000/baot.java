package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: baot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baot implements bamd {

    /* renamed from: a */
    public final cayo f101423a;

    /* renamed from: b */
    public final bads f101424b;

    /* renamed from: c */
    public final baok f101425c;

    /* renamed from: d */
    public final Context f101426d;

    /* renamed from: e */
    public final barb f101427e;

    /* renamed from: f */
    public final cayo f101428f;

    /* renamed from: g */
    private final babr f101429g;

    /* renamed from: h */
    private final cayo f101430h;

    /* renamed from: i */
    private final acbs f101431i;

    /* renamed from: j */
    private final accz f101432j;

    public baot(cayo cayo, bads bads, baok baok, Context context, acbs acbs, accz accz, babr babr, cayo cayo2, barb barb, cayo cayo3) {
        this.f101423a = cayo;
        this.f101424b = bads;
        this.f101425c = baok;
        this.f101426d = context;
        this.f101431i = acbs;
        this.f101432j = accz;
        this.f101429g = babr;
        this.f101430h = cayo2;
        this.f101427e = barb;
        this.f101428f = cayo3;
    }

    /* renamed from: a */
    public static boolean m87292a(String str, Context context) {
        return (context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & 2097152) != 0;
    }

    /* renamed from: b */
    public static boolean m87293b(String str, Context context) {
        return context.getPackageManager().getPackageInfo(str, 0).applicationInfo.enabled;
    }

    /* renamed from: a */
    public final bqgg mo32716a(Bundle bundle) {
        if (!this.f101429g.mo32699u()) {
            return bqdx.m112674a(this.f101432j.mo32705a(), new baoq(this), this.f101431i);
        }
        acbs acbs = this.f101431i;
        baok baok = this.f101425c;
        baok.getClass();
        return bqdx.m112674a(acbs.mo32622a(new baor(baok)), new baop(this), this.f101431i);
    }

    /* renamed from: a */
    public final bqgg mo55836a(List list) {
        if (((Boolean) acaw.f59303ag.mo32596a()).booleanValue()) {
            return bqdx.m112674a((bqgg) this.f101430h.mo16713a(), new baos(this, list), this.f101431i);
        }
        return bqga.m112775a((Object) null);
    }
}
