package p000;

import android.content.Context;

/* renamed from: ahwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwc extends ahvo {

    /* renamed from: a */
    private final ahvb f68213a;

    /* renamed from: b */
    private final buru f68214b;

    public ahwc(Context context, ahsu ahsu, buru buru, ahvb ahvb) {
        super(context, ahsu);
        this.f68213a = ahvb;
        this.f68214b = buru;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bvjc mo37144a() {
        return bvjc.RETROACTIVE_PAIR_START;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bvjc mo37150b() {
        return bvjc.RETROACTIVE_PAIR_END;
    }

    /* renamed from: a */
    public final String mo37145a(aypk aypk, byte[] bArr, buru buru, String str) {
        return ahuy.m56683a(this.f68173c, aypk, this.f68174d, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
     arg types: [int, int, java.lang.String, java.lang.String]
     candidates:
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void */
    /* renamed from: b */
    public final void mo37151b(String str) {
        super.mo37151b(str);
        this.f68213a.mo37195a(true, true, this.f68174d.mo37088m(), str);
    }

    /* renamed from: a */
    public final void mo37146a(ayqi ayqi) {
        super.mo37146a(ayqi);
        ayqi.mo54256n(true);
        ayqi.mo54246i(cfoj.m141572v());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
     arg types: [int, int, java.lang.String, ?[OBJECT, ARRAY]]
     candidates:
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void */
    /* renamed from: a */
    public final void mo37148a(Throwable th) {
        super.mo37148a(th);
        this.f68213a.mo37195a(false, true, this.f68174d.mo37088m(), (String) null);
    }

    /* renamed from: a */
    public final byte[] mo37149a(byte[] bArr, aypk aypk, aypj aypj) {
        byte[] a = super.mo37149a(bArr, aypk, aypj);
        if (!(a != null || (a = aypj.mo54083a()) == null || this.f68214b.mo73068d() == null)) {
            this.f68213a.mo37194a(this.f68214b.mo73068d().name, aypk.mo54196b(a));
        }
        return a;
    }
}
