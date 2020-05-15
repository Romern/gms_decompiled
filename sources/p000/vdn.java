package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: vdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vdn implements vcw {

    /* renamed from: a */
    private final vdk f49085a;

    /* renamed from: b */
    private bxvd f49086b = bkzi.f125587l.mo74144da();

    static {
        new sbw("ImpressionSyncInfoBuild", "");
    }

    public vdn(vdk vdk) {
        this.f49085a = vdk;
    }

    /* renamed from: b */
    private final void m40187b() {
        sdo.m34966a(this.f49086b, "Builder can only be used once.");
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
    public final void mo28258a() {
        boolean z;
        m40187b();
        vdk vdk = this.f49085a;
        bkzi bkzi = (bkzi) this.f49086b.mo74062i();
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & 4096) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't set SyncInfo more than once");
        bxvd bxvd = vdk.f49080e;
        sdo.m34959a(bkzi);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkzi.getClass();
        bkzo.f125657o = bkzi;
        bkzo.f125643a |= 4096;
        this.f49086b = null;
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
    public final void mo28263c(int i) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setChangeLogLimit() twice");
        bxvd bxvd = this.f49086b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= 8;
        bkzi.f125593e = i;
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
    public final void mo28264d(int i) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 512) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setEntryDbProcessTimeMs() twice");
        bxvd bxvd = this.f49086b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= 512;
        bkzi.f125599k = i;
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
    public final void mo28265e(int i) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setEntrySyncTimeMs() twice");
        bxvd bxvd = this.f49086b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bkzi.f125598j = i;
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
    /* renamed from: f */
    public final void mo28266f(int i) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setMaxFeedsSynced() twice");
        bxvd bxvd = this.f49086b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= 4;
        bkzi.f125592d = i;
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
    /* renamed from: g */
    public final void mo28267g(int i) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setSyncTrigger() twice");
        if (i == 1) {
            bxvd bxvd = this.f49086b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzi bkzi = (bkzi) bxvd.f164949b;
            bkzi bkzi2 = bkzi.f125587l;
            bkzi.f125594f = 1;
            bkzi.f125589a |= 16;
        } else if (i == 2) {
            bxvd bxvd2 = this.f49086b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkzi bkzi3 = (bkzi) bxvd2.f164949b;
            bkzi bkzi4 = bkzi.f125587l;
            bkzi3.f125594f = 2;
            bkzi3.f125589a |= 16;
        } else if (i != 3) {
            bxvd bxvd3 = this.f49086b;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkzi bkzi5 = (bkzi) bxvd3.f164949b;
            bkzi bkzi6 = bkzi.f125587l;
            bkzi5.f125594f = 4;
            bkzi5.f125589a |= 16;
        } else {
            bxvd bxvd4 = this.f49086b;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkzi bkzi7 = (bkzi) bxvd4.f164949b;
            bkzi bkzi8 = bkzi.f125587l;
            bkzi7.f125594f = 3;
            bkzi7.f125589a |= 16;
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
    /* renamed from: h */
    public final void mo28268h(int i) {
        m40187b();
        sdo.m34971a(((((bkzi) this.f49086b.f164949b).f125589a & 1) ^ 1) != 0, (Object) "Can't call setSyncType() twice");
        if (i == 0) {
            bxvd bxvd = this.f49086b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzi bkzi = (bkzi) bxvd.f164949b;
            bkzi bkzi2 = bkzi.f125587l;
            bkzi.f125590b = 1;
            bkzi.f125589a |= 1;
        } else if (i == 1) {
            bxvd bxvd2 = this.f49086b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkzi bkzi3 = (bkzi) bxvd2.f164949b;
            bkzi bkzi4 = bkzi.f125587l;
            bkzi3.f125590b = 2;
            bkzi3.f125589a |= 1;
        } else if (i == 2) {
            bxvd bxvd3 = this.f49086b;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkzi bkzi5 = (bkzi) bxvd3.f164949b;
            bkzi bkzi6 = bkzi.f125587l;
            bkzi5.f125590b = 3;
            bkzi5.f125589a |= 1;
        } else if (i == 3) {
            bxvd bxvd4 = this.f49086b;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkzi bkzi7 = (bkzi) bxvd4.f164949b;
            bkzi bkzi8 = bkzi.f125587l;
            bkzi7.f125590b = 4;
            bkzi7.f125589a |= 1;
        } else if (i == 4) {
            bxvd bxvd5 = this.f49086b;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bkzi bkzi9 = (bkzi) bxvd5.f164949b;
            bkzi bkzi10 = bkzi.f125587l;
            bkzi9.f125590b = 5;
            bkzi9.f125589a |= 1;
        } else if (i != 5) {
            bxvd bxvd6 = this.f49086b;
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            bkzi bkzi11 = (bkzi) bxvd6.f164949b;
            bkzi bkzi12 = bkzi.f125587l;
            bkzi11.f125590b = 7;
            bkzi11.f125589a |= 1;
        } else {
            bxvd bxvd7 = this.f49086b;
            if (bxvd7.f164950c) {
                bxvd7.mo74035c();
                bxvd7.f164950c = false;
            }
            bkzi bkzi13 = (bkzi) bxvd7.f164949b;
            bkzi bkzi14 = bkzi.f125587l;
            bkzi13.f125590b = 6;
            bkzi13.f125589a |= 1;
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
    /* renamed from: b */
    public final void mo28262b(int i) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setAppDataFolderIdUpdaterTimeMs() twice");
        bxvd bxvd = this.f49086b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= 128;
        bkzi.f125597i = i;
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
    public final void mo28259a(int i) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setAboutRequestTimeMs() twice");
        bxvd bxvd = this.f49086b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= 64;
        bkzi.f125596h = i;
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
    public final void mo28260a(long j) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setItemsSynced() twice");
        bxvd bxvd = this.f49086b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= 2;
        bkzi.f125591c = j;
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
    public final void mo28261a(Long l) {
        boolean z;
        m40187b();
        if ((((bkzi) this.f49086b.f164949b).f125589a & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setPendingPushNotificationsCount() twice");
        bxvd bxvd = this.f49086b;
        long longValue = l.longValue();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzi bkzi = (bkzi) bxvd.f164949b;
        bkzi bkzi2 = bkzi.f125587l;
        bkzi.f125589a |= 32;
        bkzi.f125595g = longValue;
    }
}
