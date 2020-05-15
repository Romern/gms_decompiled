package p000;

import android.os.Bundle;

/* renamed from: bakn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bakn implements bamd {

    /* renamed from: a */
    public final cayo f101135a;

    /* renamed from: b */
    public final cayo f101136b;

    /* renamed from: c */
    public final bapl f101137c;

    /* renamed from: d */
    public final bakr f101138d;

    /* renamed from: e */
    public final acbs f101139e;

    /* renamed from: f */
    public final baki f101140f;

    /* renamed from: g */
    private final baok f101141g;

    public bakn(cayo cayo, cayo cayo2, acbs acbs, bapl bapl, bakr bakr, baok baok, baki baki) {
        this.f101135a = cayo;
        this.f101136b = cayo2;
        this.f101139e = acbs;
        this.f101137c = bapl;
        this.f101138d = bakr;
        this.f101141g = baok;
        this.f101140f = baki;
    }

    /* renamed from: a */
    public final bqgg mo32716a(Bundle bundle) {
        if (bundle == null) {
            return bqga.m112777a((Throwable) new IllegalArgumentException("Notification task extras is null"));
        }
        String string = bundle.getString("notifications");
        if (string == null) {
            return bqga.m112777a((Throwable) new IllegalArgumentException("Notifications payload is missing"));
        }
        acbs acbs = this.f101139e;
        baok baok = this.f101141g;
        baok.getClass();
        return bqdx.m112674a(acbs.mo32622a(new bakk(baok)), new bakl(this, string), this.f101139e);
    }
}
