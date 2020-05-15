package p000;

import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;

/* renamed from: awlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awlo {

    /* renamed from: a */
    public final /* synthetic */ GetSaveInstrumentDetailsResponse f94597a;

    public awlo(GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse) {
        this.f94597a = getSaveInstrumentDetailsResponse;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final GetSaveInstrumentDetailsResponse mo52247a() {
        boolean z;
        GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = this.f94597a;
        if (getSaveInstrumentDetailsResponse.f110184a.length == getSaveInstrumentDetailsResponse.f110185b.length) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Bin regexes much be paired with a card type");
        sdo.checkIfNull(this.f94597a.f110186c, "Legal RemoteViews is required");
        sdo.checkIfNull(this.f94597a.f110187d, "Session data is required");
        return this.f94597a;
    }
}
