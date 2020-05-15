package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: ahvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvj extends ahvo {

    /* renamed from: a */
    private final ahyh f68161a;

    /* renamed from: b */
    private final boolean f68162b;

    public ahvj(Context context, ahsu ahsu, byte[] bArr) {
        super(context, ahsu);
        this.f68161a = (ahyh) ahgz.m55754a(context, ahyh.class);
        byte[] n = ahsu.mo37089n();
        boolean z = false;
        if (!(n == null || bArr == null)) {
            z = true;
        }
        this.f68162b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bvjc mo37144a() {
        return !this.f68162b ? bvjc.MAGIC_PAIR_START : bvjc.SUBSEQUENT_PAIR_START;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bvjc mo37150b() {
        return !this.f68162b ? bvjc.MAGIC_PAIR_END : bvjc.SUBSEQUENT_PAIR_END;
    }

    /* renamed from: d */
    public final void mo37204d() {
        super.mo37204d();
        ahyh ahyh = this.f68161a;
        srn srn = ahsd.f67925a;
        ((buqh) ahgz.m55754a(ahyh.f68346c, buqh.class)).mo72989e(ahyh.f68347d);
    }

    /* renamed from: a */
    public final String mo37145a(aypk aypk, byte[] bArr, buru buru, String str) {
        String a = super.mo37145a(aypk, bArr, buru, str);
        ahhd.m55768a(this.f68161a.f68346c, new Intent("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE").putExtra("FINISHED_STATE", "SUCCESS"));
        return a;
    }

    /* renamed from: a */
    public final void mo37148a(Throwable th) {
        super.mo37148a(th);
        ahhd.m55768a(this.f68161a.f68346c, new Intent("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE").putExtra("FINISHED_STATE", "FAIL"));
    }
}
