package p000;

import java.util.List;

/* renamed from: vdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vdo implements vcx {

    /* renamed from: b */
    private static final sbw f49087b = new sbw("ImpressionUploadDetails", "");

    /* renamed from: a */
    public bxvd f49088a = bkzn.f125624f.mo74144da();

    /* renamed from: c */
    private final vdk f49089c;

    /* renamed from: d */
    private boolean f49090d;

    public vdo(vdk vdk) {
        this.f49089c = vdk;
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
    /* renamed from: b */
    public final void mo28273b() {
        boolean z;
        boolean z2;
        boolean z3;
        mo28333c();
        if ((((bkzn) this.f49088a.f164949b).f125626a & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Call setFileSizeBytes()");
        if ((((bkzn) this.f49088a.f164949b).f125626a & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "Call setMethod()");
        vdk vdk = this.f49089c;
        bkzn bkzn = (bkzn) this.f49088a.mo74062i();
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & 268435456) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34971a(true ^ z3, (Object) "Can't set uploadDetails more than once");
        bxvd bxvd = vdk.f49080e;
        sdo.m34959a(bkzn);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkzn.getClass();
        bkzo.f125637E = bkzn;
        bkzo.f125643a |= 268435456;
        this.f49088a = null;
    }

    /* renamed from: c */
    public final void mo28333c() {
        sdo.checkIfNull((bkzn) this.f49088a.mo74062i(), "Builder can only be used once.");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ vct mo28269a() {
        return new vdg(this);
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
    public final /* bridge */ /* synthetic */ void mo28270a(int i) {
        boolean z;
        mo28333c();
        if ((((bkzn) this.f49088a.f164949b).f125626a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setUploadMethod() twice");
        if (i == 1) {
            bxvd bxvd = this.f49088a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzn bkzn = (bkzn) bxvd.f164949b;
            bkzn bkzn2 = bkzn.f125624f;
            bkzn.f125628c = 3;
            bkzn.f125626a |= 2;
        } else if (i == 2) {
            bxvd bxvd2 = this.f49088a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkzn bkzn3 = (bkzn) bxvd2.f164949b;
            bkzn bkzn4 = bkzn.f125624f;
            bkzn3.f125628c = 2;
            bkzn3.f125626a |= 2;
        } else if (i != 3) {
            f49087b.mo25374b("ImpressionUploadDetails", "Unknown upload method: %d", Integer.valueOf(i));
            bxvd bxvd3 = this.f49088a;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkzn bkzn5 = (bkzn) bxvd3.f164949b;
            bkzn bkzn6 = bkzn.f125624f;
            bkzn5.f125628c = 0;
            bkzn5.f125626a |= 2;
        } else {
            bxvd bxvd4 = this.f49088a;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkzn bkzn7 = (bkzn) bxvd4.f164949b;
            bkzn bkzn8 = bkzn.f125624f;
            bkzn7.f125628c = 1;
            bkzn7.f125626a |= 2;
        }
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
    public final /* bridge */ /* synthetic */ void mo28271a(long j) {
        boolean z;
        mo28333c();
        if (((((bkzn) this.f49088a.f164949b).f125626a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Can't call setFileSizeBytes() twice");
        bxvd bxvd = this.f49088a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzn bkzn = (bkzn) bxvd.f164949b;
        bkzn bkzn2 = bkzn.f125624f;
        bkzn.f125626a = 1 | bkzn.f125626a;
        bkzn.f125627b = j;
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
    public final /* bridge */ /* synthetic */ void mo28272a(List list) {
        mo28333c();
        sdo.m34971a(!this.f49090d, (Object) "Can't call setUploadIds() twice");
        bxvd bxvd = this.f49088a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzn bkzn = bkzn.f125624f;
        ((bkzn) bxvd.f164949b).f125630e = GeneratedMessageLite.m124030de();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzn bkzn2 = (bkzn) bxvd.f164949b;
        if (!bkzn2.f125630e.mo73666a()) {
            bkzn2.f125630e = GeneratedMessageLite.m124021a(bkzn2.f125630e);
        }
        bxsy.m123078a(list, bkzn2.f125630e);
        this.f49090d = true;
    }
}
