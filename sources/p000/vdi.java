package p000;

/* renamed from: vdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vdi implements vcv {

    /* renamed from: a */
    private static final sbw f49072a = new sbw("ImpressionExecutionResu", "");

    /* renamed from: b */
    private final vdk f49073b;

    /* renamed from: c */
    private bxvd f49074c = bkyy.f125531d.mo74144da();

    public vdi(vdk vdk) {
        this.f49073b = vdk;
    }

    /* renamed from: c */
    private final void m40125c() {
        sdo.m34966a(this.f49074c, "Builder can only be used once.");
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
    public final void mo28254a() {
        boolean z;
        m40125c();
        vdk vdk = this.f49073b;
        bkyy bkyy = (bkyy) this.f49074c.mo74062i();
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't set executionResult more than once");
        bxvd bxvd = vdk.f49080e;
        sdo.m34959a(bkyy);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkyy.getClass();
        bkzo.f125638F = bkyy;
        bkzo.f125643a |= 536870912;
        this.f49074c = null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo28256b() {
        m40125c();
        bxvd bxvd = this.f49074c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyy bkyy = (bkyy) bxvd.f164949b;
        bkyy bkyy2 = bkyy.f125531d;
        bkyy.f125533a |= 2;
        bkyy.f125535c = true;
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
    public final /* bridge */ /* synthetic */ void mo28257b(int i) {
        boolean z;
        int i2;
        m40125c();
        if (((((bkyy) this.f49074c.f164949b).f125533a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Can't call setOperationErrorStatusCode() twice or with setSynErrorStatusCode()");
        bxvd bxvd = this.f49074c;
        if (i != 10) {
            switch (i) {
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 8;
                    break;
                case 8:
                    i2 = 9;
                    break;
                default:
                    switch (i) {
                        case 13:
                            i2 = 13;
                            break;
                        case 14:
                            i2 = 14;
                            break;
                        case 15:
                            i2 = 15;
                            break;
                        case 16:
                            i2 = 16;
                            break;
                        case 17:
                            i2 = 17;
                            break;
                        default:
                            switch (i) {
                                case 1500:
                                    i2 = 18;
                                    break;
                                case 1501:
                                    i2 = 19;
                                    break;
                                case 1502:
                                    i2 = 20;
                                    break;
                                case 1503:
                                    i2 = 21;
                                    break;
                                case 1504:
                                    i2 = 22;
                                    break;
                                case 1505:
                                    i2 = 23;
                                    break;
                                case 1506:
                                    i2 = 24;
                                    break;
                                case 1507:
                                    i2 = 25;
                                    break;
                                case 1508:
                                    i2 = 26;
                                    break;
                                case 1509:
                                    i2 = 27;
                                    break;
                                case 1510:
                                    i2 = 34;
                                    break;
                                case 1511:
                                    i2 = 35;
                                    break;
                                default:
                                    f49072a.mo25374b("ImpressionExecutionResu", "Unknown operation error status code: %d", Integer.valueOf(i));
                                    i2 = 1;
                                    break;
                            }
                    }
            }
        } else {
            i2 = 11;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyy bkyy = (bkyy) bxvd.f164949b;
        bkyy bkyy2 = bkyy.f125531d;
        bkyy.f125534b = i2 - 1;
        bkyy.f125533a |= 1;
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
    public final /* bridge */ /* synthetic */ void mo28255a(int i) {
        boolean z;
        int i2;
        m40125c();
        if (((((bkyy) this.f49074c.f164949b).f125533a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Can't call setSynErrorStatusCode() twice or with setOperationErrorStatusCode()");
        bxvd bxvd = this.f49074c;
        if (i != 0) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyy bkyy = (bkyy) bxvd.f164949b;
        bkyy bkyy2 = bkyy.f125531d;
        bkyy.f125534b = i2 - 1;
        bkyy.f125533a |= 1;
    }
}
