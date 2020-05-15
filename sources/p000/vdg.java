package p000;

/* renamed from: vdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vdg implements vct {

    /* renamed from: a */
    private final vdo f49067a;

    /* renamed from: b */
    private bxvd f49068b = bkzm.f125617f.mo74144da();

    static {
        new sbw("ImpressionBinaryDiffUpl", "");
    }

    public vdg(vdo vdo) {
        this.f49067a = vdo;
    }

    /* renamed from: b */
    private final void m40109b() {
        sdo.checkIfNull(this.f49068b, "Builder can only be used once.");
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
    public final void mo28240a() {
        boolean z;
        m40109b();
        vdo vdo = this.f49067a;
        bkzm bkzm = (bkzm) this.f49068b.mo74062i();
        vdo.mo28333c();
        if ((((bkzn) vdo.f49088a.f164949b).f125626a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't set binaryDiffUploadDetails more than once");
        bxvd bxvd = vdo.f49088a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzn bkzn = (bkzn) bxvd.f164949b;
        bkzn bkzn2 = bkzn.f125624f;
        bkzm.getClass();
        bkzn.f125629d = bkzm;
        bkzn.f125626a |= 4;
        this.f49068b = null;
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
    public final void mo28243b(int i) {
        boolean z;
        m40109b();
        if ((((bkzm) this.f49068b.f164949b).f125619a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setDiffScriptStreamingTime() twice");
        bxvd bxvd = this.f49068b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzm bkzm = (bkzm) bxvd.f164949b;
        bkzm bkzm2 = bkzm.f125617f;
        bkzm.f125619a |= 16;
        bkzm.f125623e = i;
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
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28244c(int i) {
        m40109b();
        sdo.m34971a(!((((bkzm) this.f49068b.f164949b).f125619a & 4) != 0), (Object) "Can't call setFailure() twice");
        switch (i) {
            case 1:
                bxvd bxvd = this.f49068b;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bkzm bkzm = (bkzm) bxvd.f164949b;
                bkzm bkzm2 = bkzm.f125617f;
                bkzm.f125621c = 1;
                bkzm.f125619a |= 4;
                return;
            case 2:
                bxvd bxvd2 = this.f49068b;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bkzm bkzm3 = (bkzm) bxvd2.f164949b;
                bkzm bkzm4 = bkzm.f125617f;
                bkzm3.f125621c = 2;
                bkzm3.f125619a |= 4;
                return;
            case 3:
                bxvd bxvd3 = this.f49068b;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bkzm bkzm5 = (bkzm) bxvd3.f164949b;
                bkzm bkzm6 = bkzm.f125617f;
                bkzm5.f125621c = 3;
                bkzm5.f125619a |= 4;
                return;
            case 4:
                bxvd bxvd4 = this.f49068b;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bkzm bkzm7 = (bkzm) bxvd4.f164949b;
                bkzm bkzm8 = bkzm.f125617f;
                bkzm7.f125621c = 4;
                bkzm7.f125619a |= 4;
                return;
            case 5:
                bxvd bxvd5 = this.f49068b;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bkzm bkzm9 = (bkzm) bxvd5.f164949b;
                bkzm bkzm10 = bkzm.f125617f;
                bkzm9.f125621c = 5;
                bkzm9.f125619a |= 4;
                return;
            case 6:
                bxvd bxvd6 = this.f49068b;
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                bkzm bkzm11 = (bkzm) bxvd6.f164949b;
                bkzm bkzm12 = bkzm.f125617f;
                bkzm11.f125621c = 6;
                bkzm11.f125619a |= 4;
                return;
            case 7:
                bxvd bxvd7 = this.f49068b;
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                bkzm bkzm13 = (bkzm) bxvd7.f164949b;
                bkzm bkzm14 = bkzm.f125617f;
                bkzm13.f125621c = 7;
                bkzm13.f125619a |= 4;
                return;
            default:
                bxvd bxvd8 = this.f49068b;
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                bkzm bkzm15 = (bkzm) bxvd8.f164949b;
                bkzm bkzm16 = bkzm.f125617f;
                bkzm15.f125621c = 8;
                bkzm15.f125619a |= 4;
                return;
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
    public final void mo28241a(int i) {
        boolean z;
        m40109b();
        if ((((bkzm) this.f49068b.f164949b).f125619a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setBaseHashComputationTime() twice");
        bxvd bxvd = this.f49068b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzm bkzm = (bkzm) bxvd.f164949b;
        bkzm bkzm2 = bkzm.f125617f;
        bkzm.f125619a |= 8;
        bkzm.f125622d = i;
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
    public final /* bridge */ /* synthetic */ void mo28242a(long j) {
        boolean z;
        m40109b();
        if (((((bkzm) this.f49068b.f164949b).f125619a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Can't call setUploadSizeBytes() twice");
        bxvd bxvd = this.f49068b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzm bkzm = (bkzm) bxvd.f164949b;
        bkzm bkzm2 = bkzm.f125617f;
        bkzm.f125619a = 1 | bkzm.f125619a;
        bkzm.f125620b = j;
    }
}
