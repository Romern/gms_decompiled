package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: ahvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvr extends ahvo {

    /* renamed from: a */
    private final buru f68179a;

    /* renamed from: b */
    private final ahyh f68180b;

    public ahvr(Context context, ahsu ahsu, buru buru, ahyh ahyh) {
        super(context, ahsu);
        this.f68179a = buru;
        this.f68180b = ahyh;
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

    /* renamed from: a */
    public final void mo37146a(ayqi ayqi) {
        super.mo37146a(ayqi);
        ayqi.mo54256n(true);
        ayqi.mo54246i(cfoj.m141572v());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final byte[] mo37149a(byte[] bArr, aypk aypk, aypj aypj) {
        byte[] a = super.mo37149a(bArr, aypk, aypj);
        if (a != null || (a = aypj.mo54083a()) == null || this.f68179a.mo73068d() == null) {
            return a;
        }
        ahyh ahyh = this.f68180b;
        String str = this.f68179a.mo73068d().name;
        Intent b = aypk.mo54196b(a);
        ahsu ahsu = this.f68174d;
        if (ahsu.mo37060G() == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("HalfSheetManager: retroactive item does not have model id");
        } else {
            String a2 = bmwb.m108442a(ahsu.mo37060G());
            synchronized (ahyh.f68345b) {
                if (ahyh.f68345b.get(a2) == null) {
                    ahyh.f68345b.put(a2, ahyh.mo37290a());
                }
            }
            int intValue = ((Integer) ahyh.f68345b.get(a2)).intValue();
            if (ahyh.f68344a.mo37287a(intValue)) {
                srn srn = ahsd.f67925a;
            } else {
                Intent className = new Intent().setClassName(ahyh.f68346c, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity");
                className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", ahvd.m56714b(ahsu.f67969b).mo73642k());
                className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_TYPE", "DEVICE_PAIRING");
                className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", true);
                className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT", b);
                className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT_NAME", str);
                className.setFlags(268435456);
                ahyh.f68344a.mo37288a(intValue, 2);
                ahyh.f68346c.startActivity(className);
            }
        }
        return a;
    }
}
