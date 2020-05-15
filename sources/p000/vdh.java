package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Iterator;
import java.util.Set;

/* renamed from: vdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vdh implements vcu {

    /* renamed from: a */
    private static final sbw f49069a = new sbw("ImpressionConnectionAtt", "");

    /* renamed from: b */
    private final vdk f49070b;

    /* renamed from: c */
    private bxvd f49071c = bkyt.f125495l.mo74144da();

    public vdh(vdk vdk) {
        this.f49070b = vdk;
    }

    /* renamed from: b */
    private final void m40115b() {
        sdo.checkIfNull(this.f49071c, "Builder can only be used once.");
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
    public final void mo28245a() {
        boolean z;
        m40115b();
        vdk vdk = this.f49070b;
        bkyt bkyt = (bkyt) this.f49071c.mo74062i();
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & 16777216) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't set connectionAttemptDetails more than once");
        bxvd bxvd = vdk.f49080e;
        sdo.m34959a(bkyt);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkyt.getClass();
        bkzo.f125633A = bkyt;
        bkzo.f125643a |= 16777216;
        this.f49071c = null;
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
    public final void mo28251c(int i) {
        boolean z;
        m40115b();
        if ((((bkyt) this.f49071c.f164949b).f125497a & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setConnectionTimeMs() twice");
        bxvd bxvd = this.f49071c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyt bkyt = (bkyt) bxvd.f164949b;
        bkyt bkyt2 = bkyt.f125495l;
        bkyt.f125497a |= 128;
        bkyt.f125506j = i;
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
    /* renamed from: d */
    public final void mo28252d(int i) {
        boolean z;
        m40115b();
        if ((((bkyt) this.f49071c.f164949b).f125497a & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setInitTimeMs() twice");
        bxvd bxvd = this.f49071c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyt bkyt = (bkyt) bxvd.f164949b;
        bkyt bkyt2 = bkyt.f125495l;
        bkyt.f125497a |= 32;
        bkyt.f125504h = i;
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
    public final void mo28253e(int i) {
        boolean z;
        m40115b();
        if ((((bkyt) this.f49071c.f164949b).f125497a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setOperationSchedulingTimeMs() twice");
        bxvd bxvd = this.f49071c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyt bkyt = (bkyt) bxvd.f164949b;
        bkyt bkyt2 = bkyt.f125495l;
        bkyt.f125497a |= 16;
        bkyt.f125503g = i;
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
    public final void mo28250b(int i) {
        m40115b();
        sdo.m34971a(((((bkyt) this.f49071c.f164949b).f125497a & 1) ^ 1) != 0, (Object) "Can't call setConnectionResultCode() twice");
        if (i == 1) {
            bxvd bxvd = this.f49071c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkyt bkyt = (bkyt) bxvd.f164949b;
            bkyt bkyt2 = bkyt.f125495l;
            bkyt.f125498b = 6;
            bkyt.f125497a |= 1;
        } else if (i == 2) {
            bxvd bxvd2 = this.f49071c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkyt bkyt3 = (bkyt) bxvd2.f164949b;
            bkyt bkyt4 = bkyt.f125495l;
            bkyt3.f125498b = 4;
            bkyt3.f125497a |= 1;
        } else if (i == 3) {
            bxvd bxvd3 = this.f49071c;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkyt bkyt5 = (bkyt) bxvd3.f164949b;
            bkyt bkyt6 = bkyt.f125495l;
            bkyt5.f125498b = 3;
            bkyt5.f125497a |= 1;
        } else if (i == 4) {
            bxvd bxvd4 = this.f49071c;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkyt bkyt7 = (bkyt) bxvd4.f164949b;
            bkyt bkyt8 = bkyt.f125495l;
            bkyt7.f125498b = 2;
            bkyt7.f125497a |= 1;
        } else if (i != 5) {
            bxvd bxvd5 = this.f49071c;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bkyt bkyt9 = (bkyt) bxvd5.f164949b;
            bkyt bkyt10 = bkyt.f125495l;
            bkyt9.f125498b = 0;
            bkyt9.f125497a |= 1;
            f49069a.mo25374b("ImpressionConnectionAtt", "Unknown connection result code: %d", Integer.valueOf(i));
        } else {
            bxvd bxvd6 = this.f49071c;
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            bkyt bkyt11 = (bkyt) bxvd6.f164949b;
            bkyt bkyt12 = bkyt.f125495l;
            bkyt11.f125498b = 1;
            bkyt11.f125497a |= 1;
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
    public final void mo28246a(int i) {
        boolean z;
        m40115b();
        if ((((bkyt) this.f49071c.f164949b).f125497a & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setAccountResolutionTimeMs() twice");
        bxvd bxvd = this.f49071c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyt bkyt = (bkyt) bxvd.f164949b;
        bkyt bkyt2 = bkyt.f125495l;
        bkyt.f125497a |= 64;
        bkyt.f125505i = i;
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
    public final void mo28247a(Set set) {
        boolean z;
        blbd blbd;
        m40115b();
        if (((bkyt) this.f49071c.f164949b).f125502f.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Can't call setRequestedScopes() twice");
        bxvd bxvd = this.f49071c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyt bkyt = bkyt.f125495l;
        ((bkyt) bxvd.f164949b).f125502f = GeneratedMessageLite.m124028dc();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            twt twt = (twt) it.next();
            bxvd bxvd2 = this.f49071c;
            twt twt2 = twt.f46772a;
            int ordinal = twt.ordinal();
            if (ordinal == 0) {
                blbd = blbd.DRIVE_SCOPE_FILE;
            } else if (ordinal == 1) {
                blbd = blbd.DRIVE_SCOPE_APPFOLDER;
            } else if (ordinal == 2) {
                blbd = blbd.DRIVE_SCOPE_FULL;
            } else if (ordinal != 3) {
                f49069a.mo25374b("ImpressionConnectionAtt", "Unknown drive scope: %s", twt);
                blbd = blbd.UNKNOWN_DRIVE_SCOPE;
            } else {
                blbd = blbd.DRIVE_SCOPE_APPS;
            }
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkyt bkyt2 = (bkyt) bxvd2.f164949b;
            blbd.getClass();
            if (!bkyt2.f125502f.mo73666a()) {
                bkyt2.f125502f = GeneratedMessageLite.m124019a(bkyt2.f125502f);
            }
            bkyt2.f125502f.mo74153d(blbd.f125820h);
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
    public final void mo28248a(uet uet) {
        boolean z;
        m40115b();
        boolean z2 = true;
        if ((((bkyt) this.f49071c.f164949b).f125497a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setAuthRequestDetails() twice");
        Integer num = uet.f47370b;
        bxvd bxvd = this.f49071c;
        if (num == null) {
            z2 = false;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyt bkyt = (bkyt) bxvd.f164949b;
        bkyt bkyt2 = bkyt.f125495l;
        bkyt.f125497a |= 4;
        bkyt.f125500d = z2;
        if (num == null) {
            bxvd bxvd2 = this.f49071c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkyt bkyt3 = (bkyt) bxvd2.f164949b;
            bkyt3.f125497a &= -257;
            bkyt3.f125507k = 0;
        } else {
            bxvd bxvd3 = this.f49071c;
            int intValue = num.intValue();
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkyt bkyt4 = (bkyt) bxvd3.f164949b;
            bkyt4.f125497a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bkyt4.f125507k = intValue;
        }
        bxvd bxvd4 = this.f49071c;
        boolean z3 = uet.f47369a;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bkyt bkyt5 = (bkyt) bxvd4.f164949b;
        bkyt5.f125497a |= 8;
        bkyt5.f125501e = z3;
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
    public final void mo28249a(boolean z) {
        boolean z2;
        m40115b();
        if ((((bkyt) this.f49071c.f164949b).f125497a & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(!z2, (Object) "Can't call setInitRequired() twice");
        bxvd bxvd = this.f49071c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkyt bkyt = (bkyt) bxvd.f164949b;
        bkyt bkyt2 = bkyt.f125495l;
        bkyt.f125497a |= 2;
        bkyt.f125499c = z;
    }
}
