package p000;

import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;

/* renamed from: awlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awlm {

    /* renamed from: a */
    final /* synthetic */ GetSaveInstrumentDetailsRequest f94596a;

    public awlm(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest) {
        this.f94596a = getSaveInstrumentDetailsRequest;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final GetSaveInstrumentDetailsRequest mo52242a() {
        sdo.checkIfNull((Object) this.f94596a.f110182a, (Object) "Merchant app package name is required");
        sdo.checkIfNull(Long.valueOf(this.f94596a.f110183b), "Billing customer number is required");
        return this.f94596a;
    }

    /* renamed from: a */
    public final void mo52243a(long j) {
        this.f94596a.f110183b = j;
    }

    /* renamed from: a */
    public final void mo52244a(String str) {
        this.f94596a.f110182a = str;
    }
}
