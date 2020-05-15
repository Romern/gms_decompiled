package p000;

/* renamed from: vdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vdf implements vcs {

    /* renamed from: a */
    private static final sbw f49064a = new sbw("ImpressionApplyOnServer", "");

    /* renamed from: b */
    private final vdk f49065b;

    /* renamed from: c */
    private bxvd f49066c = bkyr.f125477i.mo74144da();

    public vdf(vdk vdk) {
        this.f49065b = vdk;
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
    private final void m40097c(int i) {
        boolean z;
        m40098g();
        if (((((bkyr) this.f49066c.f164949b).f125479a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Can't set status twice");
        bxvd bxvd = this.f49066c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyr bkyr = (bkyr) bxvd.f164949b;
        bkyr bkyr2 = bkyr.f125477i;
        bkyr.f125480b = i - 1;
        bkyr.f125479a |= 1;
    }

    /* renamed from: g */
    private final void m40098g() {
        sdo.checkIfNull(this.f49066c, "Builder can only be used once.");
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
    public final void mo28230a() {
        boolean z;
        m40098g();
        vdk vdk = this.f49065b;
        bkyr bkyr = (bkyr) this.f49066c.mo74062i();
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & 134217728) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't set applyOnServerDetails more than once");
        bxvd bxvd = vdk.f49080e;
        sdo.m34959a(bkyr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkyr.getClass();
        bkzo.f125636D = bkyr;
        bkzo.f125643a |= 134217728;
        this.f49066c = null;
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
    /* renamed from: e */
    public final void mo28238e() {
        boolean z;
        m40098g();
        if (((((bkyr) this.f49066c.f164949b).f125479a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Can't set status twice");
        bxvd bxvd = this.f49066c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyr bkyr = (bkyr) bxvd.f164949b;
        bkyr bkyr2 = bkyr.f125477i;
        bkyr.f125480b = 9;
        bkyr.f125479a = 1 | bkyr.f125479a;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo28239f() {
        m40097c(1);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo28234b() {
        m40097c(13);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo28237d() {
        m40097c(2);
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
    public final /* bridge */ /* synthetic */ void mo28235b(int i) {
        boolean z;
        m40098g();
        if ((((bkyr) this.f49066c.f164949b).f125479a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setNumAttempts() twice");
        bxvd bxvd = this.f49066c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyr bkyr = (bkyr) bxvd.f164949b;
        bkyr bkyr2 = bkyr.f125477i;
        bkyr.f125479a |= 2;
        bkyr.f125481c = i;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28236c() {
        m40097c(3);
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
    public final /* bridge */ /* synthetic */ void mo28231a(int i) {
        boolean z;
        m40098g();
        if ((((bkyr) this.f49066c.f164949b).f125479a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setSecondsSinceApplyLocally() twice");
        bxvd bxvd = this.f49066c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyr bkyr = (bkyr) bxvd.f164949b;
        bkyr bkyr2 = bkyr.f125477i;
        bkyr.f125479a |= 4;
        bkyr.f125482d = i;
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
    public final /* bridge */ /* synthetic */ void mo28232a(Throwable th) {
        m40098g();
        sdo.m34971a(((((bkyr) this.f49066c.f164949b).f125479a & 1) ^ 1) != 0, (Object) "Can't set status twice");
        if (th instanceof tzv) {
            tzv tzv = (tzv) th;
            if (tzv.f47009a) {
                bxvd bxvd = this.f49066c;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bkyr bkyr = (bkyr) bxvd.f164949b;
                bkyr bkyr2 = bkyr.f125477i;
                bkyr.f125480b = 8;
                bkyr.f125479a = 1 | bkyr.f125479a;
            } else {
                bxvd bxvd2 = this.f49066c;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bkyr bkyr3 = (bkyr) bxvd2.f164949b;
                bkyr bkyr4 = bkyr.f125477i;
                bkyr3.f125480b = 10;
                bkyr3.f125479a = 1 | bkyr3.f125479a;
            }
            if (tzv instanceof uaf) {
                uaf uaf = (uaf) tzv;
                bxvd bxvd3 = this.f49066c;
                int i = uaf.f47010b;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bkyr bkyr5 = (bkyr) bxvd3.f164949b;
                bkyr5.f125479a |= 16;
                bkyr5.f125484f = i;
                vpf vpf = uaf.f47011c;
                Integer num = vpf.f49708e;
                if (num != null) {
                    bxvd bxvd4 = this.f49066c;
                    int a = blaq.m106957a(num.intValue());
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bkyr bkyr6 = (bkyr) bxvd4.f164949b;
                    int i2 = a - 1;
                    if (a != 0) {
                        bkyr6.f125485g = i2;
                        bkyr6.f125479a |= 32;
                    } else {
                        throw null;
                    }
                }
                Integer num2 = vpf.f49709f;
                if (num2 != null) {
                    bxvd bxvd5 = this.f49066c;
                    int a2 = blao.m106955a(num2.intValue());
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bkyr bkyr7 = (bkyr) bxvd5.f164949b;
                    int i3 = a2 - 1;
                    if (a2 != 0) {
                        bkyr7.f125486h = i3;
                        bkyr7.f125479a |= 64;
                        return;
                    }
                    throw null;
                }
            }
        } else if (th instanceof uab) {
            bxvd bxvd6 = this.f49066c;
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            bkyr bkyr8 = (bkyr) bxvd6.f164949b;
            bkyr bkyr9 = bkyr.f125477i;
            bkyr8.f125480b = 11;
            bkyr8.f125479a |= 1;
        } else if (th instanceof uaa) {
            bxvd bxvd7 = this.f49066c;
            if (bxvd7.f164950c) {
                bxvd7.mo74035c();
                bxvd7.f164950c = false;
            }
            bkyr bkyr10 = (bkyr) bxvd7.f164949b;
            bkyr bkyr11 = bkyr.f125477i;
            bkyr10.f125480b = 3;
            bkyr10.f125479a |= 1;
        } else if (th instanceof uac) {
            bxvd bxvd8 = this.f49066c;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            bkyr bkyr12 = (bkyr) bxvd8.f164949b;
            bkyr bkyr13 = bkyr.f125477i;
            bkyr12.f125480b = 4;
            bkyr12.f125479a |= 1;
        } else if (th instanceof tzu) {
            bxvd bxvd9 = this.f49066c;
            if (bxvd9.f164950c) {
                bxvd9.mo74035c();
                bxvd9.f164950c = false;
            }
            bkyr bkyr14 = (bkyr) bxvd9.f164949b;
            bkyr bkyr15 = bkyr.f125477i;
            bkyr14.f125480b = 5;
            bkyr14.f125479a |= 1;
        } else if (th instanceof uad) {
            bxvd bxvd10 = this.f49066c;
            if (bxvd10.f164950c) {
                bxvd10.mo74035c();
                bxvd10.f164950c = false;
            }
            bkyr bkyr16 = (bkyr) bxvd10.f164949b;
            bkyr bkyr17 = bkyr.f125477i;
            bkyr16.f125480b = 6;
            bkyr16.f125479a |= 1;
        } else if (th instanceof uae) {
            bxvd bxvd11 = this.f49066c;
            if (bxvd11.f164950c) {
                bxvd11.mo74035c();
                bxvd11.f164950c = false;
            }
            bkyr bkyr18 = (bkyr) bxvd11.f164949b;
            bkyr bkyr19 = bkyr.f125477i;
            bkyr18.f125480b = 7;
            bkyr18.f125479a |= 1;
        } else if (th instanceof vpy) {
            bxvd bxvd12 = this.f49066c;
            if (bxvd12.f164950c) {
                bxvd12.mo74035c();
                bxvd12.f164950c = false;
            }
            bkyr bkyr20 = (bkyr) bxvd12.f164949b;
            bkyr bkyr21 = bkyr.f125477i;
            bkyr20.f125480b = 13;
            bkyr20.f125479a |= 1;
        } else {
            f49064a.mo25374b("ImpressionApplyOnServer", "Unknown throwable: %s", th.getClass().getCanonicalName());
            bxvd bxvd13 = this.f49066c;
            if (bxvd13.f164950c) {
                bxvd13.mo74035c();
                bxvd13.f164950c = false;
            }
            bkyr bkyr22 = (bkyr) bxvd13.f164949b;
            bkyr bkyr23 = bkyr.f125477i;
            bkyr22.f125480b = 0;
            bkyr22.f125479a |= 1;
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
    public final /* bridge */ /* synthetic */ void mo28233a(vee vee) {
        m40098g();
        sdo.m34971a(!((((bkyr) this.f49066c.f164949b).f125479a & 8) != 0), (Object) "Can't call setConnectionType() twice");
        vee vee2 = vee.DISCONNECTED;
        int ordinal = vee.ordinal();
        if (ordinal == 0) {
            bxvd bxvd = this.f49066c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkyr bkyr = (bkyr) bxvd.f164949b;
            bkyr bkyr2 = bkyr.f125477i;
            bkyr.f125483e = 1;
            bkyr.f125479a |= 8;
        } else if (ordinal == 1) {
            bxvd bxvd2 = this.f49066c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkyr bkyr3 = (bkyr) bxvd2.f164949b;
            bkyr bkyr4 = bkyr.f125477i;
            bkyr3.f125483e = 2;
            bkyr3.f125479a |= 8;
        } else if (ordinal == 2) {
            bxvd bxvd3 = this.f49066c;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkyr bkyr5 = (bkyr) bxvd3.f164949b;
            bkyr bkyr6 = bkyr.f125477i;
            bkyr5.f125483e = 3;
            bkyr5.f125479a |= 8;
        } else if (ordinal != 3) {
            f49064a.mo25374b("ImpressionApplyOnServer", "Unknown connection type: %s", vee);
            bxvd bxvd4 = this.f49066c;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkyr bkyr7 = (bkyr) bxvd4.f164949b;
            bkyr bkyr8 = bkyr.f125477i;
            bkyr7.f125483e = 0;
            bkyr7.f125479a |= 8;
        } else {
            bxvd bxvd5 = this.f49066c;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bkyr bkyr9 = (bkyr) bxvd5.f164949b;
            bkyr bkyr10 = bkyr.f125477i;
            bkyr9.f125483e = 4;
            bkyr9.f125479a |= 8;
        }
    }
}
