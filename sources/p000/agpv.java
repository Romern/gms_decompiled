package p000;

import android.content.ContentValues;

/* renamed from: agpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpv {

    /* renamed from: a */
    final ContentValues f66256a;

    public agpv() {
        this.f66256a = new ContentValues();
    }

    /* renamed from: a */
    public final agpw mo35900a() {
        return agpw.m54810a(new ContentValues(this.f66256a));
    }

    /* renamed from: b */
    public final void mo35907b(Long l) {
        this.f66256a.put("expiration_time", l);
    }

    /* renamed from: c */
    public final void mo35910c(byte[] bArr) {
        this.f66256a.put("sim_extra", bArr);
    }

    public agpv(ContentValues contentValues) {
        this.f66256a = new ContentValues(contentValues);
    }

    /* renamed from: a */
    public final void mo35901a(bxzx bxzx) {
        mo35906a(bxzx != null ? bxzx.serializeToBytes() : null);
    }

    /* renamed from: b */
    public final void mo35908b(String str) {
        this.f66256a.put("iccid", str);
    }

    /* renamed from: a */
    public final void mo35902a(bxzz bxzz) {
        mo35910c(bxzz != null ? bxzz.serializeToBytes() : null);
    }

    /* renamed from: b */
    public final void mo35909b(byte[] bArr) {
        this.f66256a.put("notification_stats", bArr);
    }

    /* renamed from: a */
    public final void mo35903a(Integer num) {
        this.f66256a.put("sim_state", num);
    }

    /* renamed from: a */
    public final void mo35904a(Long l) {
        this.f66256a.put("carrier_id", l);
    }

    /* renamed from: a */
    public final void mo35905a(String str) {
        this.f66256a.put("cpid", str);
    }

    /* renamed from: a */
    public final void mo35906a(byte[] bArr) {
        this.f66256a.put("consent_record", bArr);
    }
}
