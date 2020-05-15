package p000;

import android.content.Context;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: vdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vdk implements vcy {

    /* renamed from: a */
    public static final sbw f49076a = new sbw("ImpressionLogEvent", "");

    /* renamed from: b */
    public final bebq f49077b;

    /* renamed from: c */
    public final Context f49078c;

    /* renamed from: d */
    public String f49079d;

    /* renamed from: e */
    public final bxvd f49080e;

    /* renamed from: f */
    private final vdl f49081f;

    /* renamed from: g */
    private boolean f49082g = false;

    public vdk(vdl vdl, Context context) {
        sdo.m34959a(vdl);
        this.f49081f = vdl;
        sdo.m34959a(context);
        this.f49078c = context;
        this.f49077b = new bebq(bebw.f106888a);
        this.f49080e = bkzo.f125631K.mo74144da();
    }

    /* renamed from: b */
    private static final int m40140b(van van) {
        String a = van.mo28169a();
        if ("IDLE".equals(a)) {
            return 2;
        }
        if ("HIGH".equals(a)) {
            return 4;
        }
        if ("LOW".equals(a)) {
            return 3;
        }
        f49076a.mo25374b("ImpressionLogEvent", "Unknown activity level name: %s", a);
        return 1;
    }

    /* renamed from: a */
    public final void mo28274a() {
        mo28330k();
        this.f49082g = true;
        int i = spn.f44932a;
        bxvd da = bkzq.f125670d.mo74144da();
        bxvd bxvd = this.f49080e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzq bkzq = (bkzq) da.f164949b;
        bkzo bkzo = (bkzo) bxvd.mo74062i();
        bkzo.getClass();
        bkzq.f125674c = bkzo;
        bkzq.f125672a |= 512;
        this.f49077b.mo58533a((bkzq) da.mo74062i());
        this.f49081f.mo28314a(this);
    }

    /* renamed from: c */
    public final vcw mo28298c() {
        return new vdn(this);
    }

    /* renamed from: d */
    public final vcu mo28301d() {
        return new vdh(this);
    }

    /* renamed from: e */
    public final vcs mo28303e() {
        return new vdf(this);
    }

    /* renamed from: g */
    public final vcv mo28306g() {
        return new vdi(this);
    }

    /* renamed from: k */
    public final void mo28330k() {
        if (this.f49082g) {
            throw new IllegalStateException("Event already sent", null);
        }
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ vcx mo28305f() {
        return new vdo(this);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo28307h() {
        mo28330k();
        bebq bebq = this.f49077b;
        bkxp bkxp = ((bkxq) bebq.f106876b.f164949b).f125409f;
        if (bkxp == null) {
            bkxp = bkxp.f125396e;
        }
        bkxl bkxl = bkxp.f125400c;
        if (bkxl == null) {
            bkxl = bkxl.f125386d;
        }
        if ((bkxl.f125388a & 1) != 0) {
            bxvd bxvd = bebq.f106876b;
            bkxp bkxp2 = ((bkxq) bxvd.f164949b).f125409f;
            if (bkxp2 == null) {
                bkxp2 = bkxp.f125396e;
            }
            bxvd bxvd2 = (bxvd) bkxp2.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bkxp2);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkxp bkxp3 = (bkxp) bxvd2.f164949b;
            bkxp3.f125401d = 2;
            bkxp3.f125398a |= 4;
            bkxp bkxp4 = ((bkxq) bebq.f106876b.f164949b).f125409f;
            if (bkxp4 == null) {
                bkxp4 = bkxp.f125396e;
            }
            bkxl bkxl2 = bkxp4.f125400c;
            if (bkxl2 == null) {
                bkxl2 = bkxl.f125386d;
            }
            bxvd bxvd3 = (bxvd) bkxl2.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) bkxl2);
            long a = bebq.f106875a.mo58543a();
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkxl bkxl3 = (bkxl) bxvd3.f164949b;
            bkxl3.f125388a |= 2;
            bkxl3.f125390c = a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkxp bkxp5 = (bkxp) bxvd2.f164949b;
            bkxl bkxl4 = (bkxl) bxvd3.mo74062i();
            bkxl4.getClass();
            bkxp5.f125400c = bkxl4;
            bkxp5.f125398a |= 2;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkxq bkxq = (bkxq) bxvd.f164949b;
            bkxp bkxp6 = (bkxp) bxvd2.mo74062i();
            bkxq bkxq2 = bkxq.f125402g;
            bkxp6.getClass();
            bkxq.f125409f = bkxp6;
            bkxq.f125404a |= 2048;
            return;
        }
        throw new IllegalStateException("must call setElapsedStartTimeToSystemTime first");
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo28308i() {
        mo28330k();
        bebq bebq = this.f49077b;
        bxvd bxvd = bebq.f106876b;
        bxvd da = bkxp.f125396e.mo74144da();
        bxvd da2 = bkxl.f125386d.mo74144da();
        long a = bebq.f106875a.mo58543a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bkxl bkxl = (bkxl) da2.f164949b;
        bkxl.f125388a |= 1;
        bkxl.f125389b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkxp bkxp = (bkxp) da.f164949b;
        bkxl bkxl2 = (bkxl) da2.mo74062i();
        bkxl2.getClass();
        bkxp.f125400c = bkxl2;
        bkxp.f125398a |= 2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxq bkxq = (bkxq) bxvd.f164949b;
        bkxp bkxp2 = (bkxp) da.mo74062i();
        bkxq bkxq2 = bkxq.f125402g;
        bkxp2.getClass();
        bkxq.f125409f = bkxp2;
        bkxq.f125404a |= 2048;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo28309j() {
        mo28330k();
        this.f49077b.mo58530a();
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
    public final /* bridge */ /* synthetic */ void mo28299c(int i) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setEventDeliveryMechanism() twice");
        if (i != 0) {
            bxvd bxvd = this.f49080e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzo bkzo = (bkzo) bxvd.f164949b;
            bkzo bkzo2 = bkzo.f125631K;
            bkzo.f125648f = 2;
            bkzo.f125643a |= 8;
            return;
        }
        bxvd bxvd2 = this.f49080e;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bkzo bkzo3 = (bkzo) bxvd2.f164949b;
        bkzo bkzo4 = bkzo.f125631K;
        bkzo3.f125648f = 1;
        bkzo3.f125643a |= 8;
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
    public final /* bridge */ /* synthetic */ void mo28302d(int i) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setFileType() twice");
        if (i == 0) {
            bxvd bxvd = this.f49080e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzo bkzo = (bkzo) bxvd.f164949b;
            bkzo bkzo2 = bkzo.f125631K;
            bkzo.f125650h = 1;
            bkzo.f125643a |= 32;
        } else if (i != 1) {
            f49076a.mo25374b("ImpressionLogEvent", "Unknown file type: %d", Integer.valueOf(i));
            bxvd bxvd2 = this.f49080e;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkzo bkzo3 = (bkzo) bxvd2.f164949b;
            bkzo bkzo4 = bkzo.f125631K;
            bkzo3.f125650h = 0;
            bkzo3.f125643a |= 32;
        } else {
            bxvd bxvd3 = this.f49080e;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkzo bkzo5 = (bkzo) bxvd3.f164949b;
            bkzo bkzo6 = bkzo.f125631K;
            bkzo5.f125650h = 2;
            bkzo5.f125643a |= 32;
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
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo28304e(int i) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setUiResult() twice");
        if (i == 0) {
            bxvd bxvd = this.f49080e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzo bkzo = (bkzo) bxvd.f164949b;
            bkzo bkzo2 = bkzo.f125631K;
            bkzo.f125658p = 1;
            bkzo.f125643a |= 8192;
        } else if (i == 1) {
            bxvd bxvd2 = this.f49080e;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkzo bkzo3 = (bkzo) bxvd2.f164949b;
            bkzo bkzo4 = bkzo.f125631K;
            bkzo3.f125658p = 2;
            bkzo3.f125643a |= 8192;
        } else if (i != 2) {
            bxvd bxvd3 = this.f49080e;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkzo bkzo5 = (bkzo) bxvd3.f164949b;
            bkzo bkzo6 = bkzo.f125631K;
            bkzo5.f125658p = 4;
            bkzo5.f125643a |= 8192;
        } else {
            bxvd bxvd4 = this.f49080e;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkzo bkzo7 = (bkzo) bxvd4.f164949b;
            bkzo bkzo8 = bkzo.f125631K;
            bkzo7.f125658p = 3;
            bkzo7.f125643a |= 8192;
        }
    }

    /* renamed from: f */
    public final void mo28275a(int i) {
        bxvd bxvd = this.f49080e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkzo.f125643a |= 33554432;
        bkzo.f125634B = i;
    }

    /* renamed from: b */
    private static final bkyc m40141b(txr txr) {
        vee vee = vee.DISCONNECTED;
        txr txr2 = txr.NULL;
        switch (txr.ordinal()) {
            case 1:
                return bkyc.SET_APP_AUTH_STATE_ACTION;
            case 2:
                return bkyc.METADATA_ACTION;
            case 3:
            case 5:
            case 9:
            case 11:
            case 13:
            default:
                f49076a.mo25374b("ImpressionLogEvent", "Unknown action type: %s", txr);
                return bkyc.UNKNOWN_ACTION_TYPE;
            case 4:
                return bkyc.CONTENT_AND_METADATA_ACTION;
            case 6:
                return bkyc.CREATE_FILE_ACTION;
            case 7:
                return bkyc.CREATE_SHORTCUT_FILE_ACTION;
            case 8:
                return bkyc.CREATE_FOLDER_ACTION;
            case 10:
                return bkyc.TRASH_ACTION;
            case 12:
                return bkyc.DELETE_FILE_ACTION;
            case 14:
                return bkyc.SET_RESOURCE_PARENTS_ACTION;
            case 15:
                return bkyc.CHANGE_RESOURCE_PARENTS_ACTION;
            case 16:
                return bkyc.SET_SUBSCRIBED_ACTION;
            case 17:
                return bkyc.ADD_PERMISSION_ACTION;
            case 18:
                return bkyc.UPDATE_PERMISSION_ACTION;
            case 19:
                return bkyc.REMOVE_PERMISSION_ACTION;
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
    public final void mo28276a(int i, int i2) {
        mo28330k();
        sdo.m34971a(!((((bkzo) this.f49080e.f164949b).f125643a & 67108864) != 0), (Object) "Can't call setPermissionDetails twice");
        bxvd da = bkzc.f125552d.mo74144da();
        switch (i) {
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkzc bkzc = (bkzc) da.f164949b;
                bkzc.f125555b = 1;
                bkzc.f125554a |= 1;
                break;
            case 257:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkzc bkzc2 = (bkzc) da.f164949b;
                bkzc2.f125555b = 2;
                bkzc2.f125554a |= 1;
                break;
            case 258:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkzc bkzc3 = (bkzc) da.f164949b;
                bkzc3.f125555b = 3;
                bkzc3.f125554a |= 1;
                break;
            default:
                f49076a.mo25374b("ImpressionLogEvent", "Unknown account type code: %d", Integer.valueOf(i));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkzc bkzc4 = (bkzc) da.f164949b;
                bkzc4.f125555b = 0;
                bkzc4.f125554a |= 1;
                break;
        }
        if (i2 == -100) {
            bkzc bkzc5 = (bkzc) da.f164949b;
            bkzc5.f125556c = 5;
            bkzc5.f125554a |= 2;
        } else if (i2 == 0) {
            bkzc bkzc6 = (bkzc) da.f164949b;
            bkzc6.f125556c = 1;
            bkzc6.f125554a |= 2;
        } else if (i2 == 1) {
            bkzc bkzc7 = (bkzc) da.f164949b;
            bkzc7.f125556c = 2;
            bkzc7.f125554a |= 2;
        } else if (i2 == 2) {
            bkzc bkzc8 = (bkzc) da.f164949b;
            bkzc8.f125556c = 3;
            bkzc8.f125554a |= 2;
        } else if (i2 != 3) {
            f49076a.mo25374b("ImpressionLogEvent", "Unknown role type code: %d", Integer.valueOf(i2));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzc bkzc9 = (bkzc) da.f164949b;
            bkzc9.f125556c = 0;
            bkzc9.f125554a |= 2;
        } else {
            bkzc bkzc10 = (bkzc) da.f164949b;
            bkzc10.f125556c = 4;
            bkzc10.f125554a |= 2;
        }
        bxvd bxvd = this.f49080e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzc bkzc11 = (bkzc) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzc11.getClass();
        bkzo.f125635C = bkzc11;
        bkzo.f125643a |= 67108864;
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
    public final /* bridge */ /* synthetic */ void mo28300c(int i, int i2) {
        int i3;
        mo28330k();
        sdo.m34971a(!((((bkzo) this.f49080e.f164949b).f125643a & 64) != 0), (Object) "Can't call setType() twice");
        if (i == 0) {
            bxvd bxvd = this.f49080e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzo bkzo = (bkzo) bxvd.f164949b;
            bkzo bkzo2 = bkzo.f125631K;
            bkzo.f125651i = 1;
            bkzo.f125643a |= 64;
        } else if (i == 1) {
            bxvd bxvd2 = this.f49080e;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkzo bkzo3 = (bkzo) bxvd2.f164949b;
            bkzo bkzo4 = bkzo.f125631K;
            bkzo3.f125651i = 2;
            bkzo3.f125643a |= 64;
        } else if (i == 2) {
            bxvd bxvd3 = this.f49080e;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkzo bkzo5 = (bkzo) bxvd3.f164949b;
            bkzo bkzo6 = bkzo.f125631K;
            bkzo5.f125651i = 3;
            bkzo5.f125643a |= 64;
        } else if (i != 3) {
            bxvd bxvd4 = this.f49080e;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkzo bkzo7 = (bkzo) bxvd4.f164949b;
            bkzo bkzo8 = bkzo.f125631K;
            bkzo7.f125651i = 5;
            bkzo7.f125643a |= 64;
        } else {
            bxvd bxvd5 = this.f49080e;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bkzo bkzo9 = (bkzo) bxvd5.f164949b;
            bkzo bkzo10 = bkzo.f125631K;
            bkzo9.f125651i = 4;
            bkzo9.f125643a |= 64;
        }
        switch (i2) {
            case 0:
                i3 = 1326;
                break;
            case 1:
                i3 = 1327;
                break;
            case 2:
                i3 = 1328;
                break;
            case 3:
                i3 = 1329;
                break;
            case 4:
                i3 = 1330;
                break;
            case 5:
                i3 = 1331;
                break;
            case 6:
                i3 = 1332;
                break;
            case 7:
                i3 = 1333;
                break;
            case 8:
                i3 = 1334;
                break;
            case 9:
                i3 = 1335;
                break;
            case 10:
                i3 = 1336;
                break;
            case 11:
                i3 = 1337;
                break;
            case 12:
                i3 = 1338;
                break;
            case 13:
                i3 = 1339;
                break;
            case 14:
                i3 = 1340;
                break;
            case 15:
                i3 = 1341;
                break;
            case 16:
                i3 = 1342;
                break;
            case 17:
                i3 = 1343;
                break;
            case 18:
                i3 = 1344;
                break;
            case 19:
                i3 = 1345;
                break;
            case 20:
                i3 = 1346;
                break;
            case 21:
                i3 = 1347;
                break;
            case 22:
                i3 = 1348;
                break;
            case 23:
                i3 = 1349;
                break;
            case 24:
                i3 = 1350;
                break;
            case 25:
                i3 = 1351;
                break;
            case 26:
                i3 = 1352;
                break;
            case 27:
                i3 = 1353;
                break;
            case 28:
                i3 = 1354;
                break;
            case 29:
                i3 = 1355;
                break;
            case 30:
                i3 = 1356;
                break;
            case 31:
                i3 = 1357;
                break;
            case 32:
                i3 = 1363;
                break;
            case 33:
                i3 = 1545;
                break;
            case 34:
            default:
                f49076a.mo25374b("ImpressionLogEvent", "Unknown event code: %d", Integer.valueOf(i2));
                i3 = 1005;
                break;
            case 35:
                i3 = 1555;
                break;
            case 36:
                i3 = 1559;
                break;
            case FelicaException.TYPE_NOT_CLOSED:
                i3 = 1557;
                break;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                i3 = 1547;
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                i3 = 1692;
                break;
            case FelicaException.TYPE_PUSH_FAILED:
                i3 = 1701;
                break;
            case 41:
                i3 = 1702;
                break;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                i3 = 1703;
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                i3 = 1704;
                break;
            case FelicaException.TYPE_RESET_FAILED:
                i3 = 1706;
                break;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                i3 = 1825;
                break;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                i3 = 1826;
                break;
            case 47:
                i3 = 1827;
                break;
            case 48:
                i3 = 1854;
                break;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                i3 = 1855;
                break;
            case 50:
                i3 = 1856;
                break;
            case 51:
                i3 = 1857;
                break;
            case 52:
                i3 = 1879;
                break;
            case 53:
                i3 = 1880;
                break;
            case 54:
                i3 = 1865;
                break;
            case 55:
                i3 = 1888;
                break;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                i3 = 1935;
                break;
            case 57:
                i3 = 1931;
                break;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                i3 = 1932;
                break;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                i3 = 1933;
                break;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                i3 = 1934;
                break;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                i3 = 1940;
                break;
            case 62:
                i3 = 2107;
                break;
            case 63:
                i3 = 2147;
                break;
            case 64:
                i3 = 2228;
                break;
            case KeyInformation.AES128_DES56:
                i3 = 2279;
                break;
            case 66:
                i3 = 2280;
                break;
            case KeyInformation.AES128_DES112:
                i3 = 2322;
                break;
            case 68:
                i3 = 2306;
                break;
            case 69:
                i3 = 2353;
                break;
            case 70:
                i3 = 2354;
                break;
            case 71:
                i3 = 2355;
                break;
        }
        this.f49077b.mo58531a(i3);
    }

    /* renamed from: b */
    public final vcr mo28294b() {
        return new vde(this.f49080e);
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
    public final /* bridge */ /* synthetic */ void mo28295b(int i) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 512) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setOpenMode() twice");
        if (i == 268435456) {
            bxvd bxvd = this.f49080e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzo bkzo = (bkzo) bxvd.f164949b;
            bkzo bkzo2 = bkzo.f125631K;
            bkzo.f125654l = 1;
            bkzo.f125643a |= 512;
        } else if (i == 536870912) {
            bxvd bxvd2 = this.f49080e;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bkzo bkzo3 = (bkzo) bxvd2.f164949b;
            bkzo bkzo4 = bkzo.f125631K;
            bkzo3.f125654l = 2;
            bkzo3.f125643a |= 512;
        } else if (i != 805306368) {
            f49076a.mo25374b("ImpressionLogEvent", "Unknown open mode: %d", Integer.valueOf(i));
            bxvd bxvd3 = this.f49080e;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bkzo bkzo5 = (bkzo) bxvd3.f164949b;
            bkzo bkzo6 = bkzo.f125631K;
            bkzo5.f125654l = 0;
            bkzo5.f125643a |= 512;
        } else {
            bxvd bxvd4 = this.f49080e;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bkzo bkzo7 = (bkzo) bxvd4.f164949b;
            bkzo bkzo8 = bkzo.f125631K;
            bkzo7.f125654l = 3;
            bkzo7.f125643a |= 512;
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
    public final void mo28296b(int i, int i2) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setRecursiveActionDetails() twice");
        bxvd bxvd = this.f49080e;
        bxvd da = bkzg.f125576d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzg bkzg = (bkzg) da.f164949b;
        int i3 = 1 | bkzg.f125578a;
        bkzg.f125578a = i3;
        bkzg.f125579b = i;
        bkzg.f125578a = i3 | 2;
        bkzg.f125580c = i2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzg bkzg2 = (bkzg) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzg2.getClass();
        bkzo.f125660r = bkzg2;
        bkzo.f125643a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
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
    public final void mo28277a(int i, int i2, int i3, Long l) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 8388608) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setTombstonePurgeDetails() twice");
        bxvd da = bkzk.f125605f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzk bkzk = (bkzk) da.f164949b;
        int i4 = 1 | bkzk.f125607a;
        bkzk.f125607a = i4;
        bkzk.f125608b = i;
        int i5 = i4 | 2;
        bkzk.f125607a = i5;
        bkzk.f125609c = i2;
        bkzk.f125607a = i5 | 4;
        bkzk.f125610d = i3;
        if (l != null) {
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzk bkzk2 = (bkzk) da.f164949b;
            bkzk2.f125607a |= 8;
            bkzk2.f125611e = longValue;
        }
        bxvd bxvd = this.f49080e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzk bkzk3 = (bkzk) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzk3.getClass();
        bkzo.f125668z = bkzk3;
        bkzo.f125643a |= 8388608;
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
    public final void mo28297b(int i, long j) {
        boolean z;
        mo28330k();
        if (((((bkzo) this.f49080e.f164949b).f125644b & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) "Can't call setUnsubscribedItemSyncDetails() twice");
        bxvd bxvd = this.f49080e;
        bxvd da = bkzl.f125612d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzl bkzl = (bkzl) da.f164949b;
        int i2 = bkzl.f125614a | 1;
        bkzl.f125614a = i2;
        bkzl.f125615b = i;
        bkzl.f125614a = i2 | 2;
        bkzl.f125616c = j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzl bkzl2 = (bkzl) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzl2.getClass();
        bkzo.f125641I = bkzl2;
        bkzo.f125644b |= 1;
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
    public final void mo28278a(int i, int i2, Long l, vee vee) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & Integer.MIN_VALUE) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setDownloadDetails() twice");
        bxvd da = bkyw.f125518f.mo74144da();
        if (i != 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw = (bkyw) da.f164949b;
            bkyw.f125521b = 0;
            bkyw.f125520a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw2 = (bkyw) da.f164949b;
            bkyw2.f125521b = 3;
            bkyw2.f125520a |= 1;
        }
        switch (i2) {
            case 2:
                bkyw bkyw3 = (bkyw) da.f164949b;
                bkyw3.f125522c = 1;
                bkyw3.f125520a |= 2;
                break;
            case 3:
                bkyw bkyw4 = (bkyw) da.f164949b;
                bkyw4.f125522c = 2;
                bkyw4.f125520a |= 2;
                break;
            case 4:
                bkyw bkyw5 = (bkyw) da.f164949b;
                bkyw5.f125522c = 3;
                bkyw5.f125520a |= 2;
                break;
            case 5:
                bkyw bkyw6 = (bkyw) da.f164949b;
                bkyw6.f125522c = 4;
                bkyw6.f125520a |= 2;
                break;
            case 6:
                bkyw bkyw7 = (bkyw) da.f164949b;
                bkyw7.f125522c = 5;
                bkyw7.f125520a |= 2;
                break;
            case 7:
                bkyw bkyw8 = (bkyw) da.f164949b;
                bkyw8.f125522c = 6;
                bkyw8.f125520a |= 2;
                break;
            case 8:
                bkyw bkyw9 = (bkyw) da.f164949b;
                bkyw9.f125522c = 7;
                bkyw9.f125520a |= 2;
                break;
            default:
                bkyw bkyw10 = (bkyw) da.f164949b;
                bkyw10.f125522c = 0;
                bkyw10.f125520a |= 2;
                f49076a.mo25374b("ImpressionLogEvent", "Unable to log download state: %d", Integer.valueOf(i2));
                break;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw11 = (bkyw) da.f164949b;
            bkyw11.f125520a |= 4;
            bkyw11.f125523d = longValue;
        }
        vee vee2 = vee.DISCONNECTED;
        txr txr = txr.NULL;
        int ordinal = vee.ordinal();
        if (ordinal == 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw12 = (bkyw) da.f164949b;
            bkyw12.f125524e = 1;
            bkyw12.f125520a |= 8;
        } else if (ordinal == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw13 = (bkyw) da.f164949b;
            bkyw13.f125524e = 2;
            bkyw13.f125520a |= 8;
        } else if (ordinal == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw14 = (bkyw) da.f164949b;
            bkyw14.f125524e = 3;
            bkyw14.f125520a |= 8;
        } else if (ordinal != 3) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw15 = (bkyw) da.f164949b;
            bkyw15.f125524e = 0;
            bkyw15.f125520a |= 8;
            f49076a.mo25374b("ImpressionLogEvent", "Unknown network type: %s", vee);
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyw bkyw16 = (bkyw) da.f164949b;
            bkyw16.f125524e = 4;
            bkyw16.f125520a |= 8;
        }
        bxvd bxvd = this.f49080e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkyw bkyw17 = (bkyw) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkyw17.getClass();
        bkzo.f125640H = bkyw17;
        bkzo.f125643a |= Integer.MIN_VALUE;
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
    public final void mo28281a(CallingAppInfo callingAppInfo) {
        mo28330k();
        boolean z = true;
        if (((((bkzo) this.f49080e.f164949b).f125643a & 1) ^ 1) == 0) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Can't call setAppInfo() twice");
        vcr b = mo28294b();
        b.mo28228a(callingAppInfo.f30768b);
        b.mo28229b(callingAppInfo.f30767a);
        b.mo28227a(callingAppInfo.f30769c);
        b.mo28226a();
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
    public final void mo28284a(String str) {
        mo28330k();
        sdo.m34971a(this.f49079d == null, (Object) "Can't call setAccountName() twice");
        sdo.m34959a((Object) str);
        this.f49079d = str;
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
    public final void mo28279a(int i, long j) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setRecursiveActionCleanupDetails() twice");
        bxvd bxvd = this.f49080e;
        bxvd da = bkzf.f125571d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzf bkzf = (bkzf) da.f164949b;
        int i2 = 1 | bkzf.f125573a;
        bkzf.f125573a = i2;
        bkzf.f125574b = i;
        bkzf.f125573a = i2 | 2;
        bkzf.f125575c = j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzf bkzf2 = (bkzf) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzf2.getClass();
        bkzo.f125665w = bkzf2;
        bkzo.f125643a |= 1048576;
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
    public final /* bridge */ /* synthetic */ void mo28280a(long j, long j2) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setDeviceStatus() twice");
        bxvd bxvd = this.f49080e;
        bxvd da = bkyv.f125513d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkyv bkyv = (bkyv) da.f164949b;
        int i = 1 | bkyv.f125515a;
        bkyv.f125515a = i;
        bkyv.f125516b = j;
        bkyv.f125515a = i | 2;
        bkyv.f125517c = j2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkyv bkyv2 = (bkyv) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkyv2.getClass();
        bkzo.f125647e = bkyv2;
        bkzo.f125643a |= 4;
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
    public final /* bridge */ /* synthetic */ void mo28282a(MetadataBundle metadataBundle) {
        boolean z;
        mo28330k();
        boolean z2 = true;
        if ((((bkzo) this.f49080e.f164949b).f125643a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setMetadataUpdate() twice");
        bxvd da = bkzb.f125546e.mo74144da();
        Boolean bool = (Boolean) metadataBundle.mo18269a(uzm.f48737M);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzb bkzb = (bkzb) da.f164949b;
            bkzb.f125548a |= 1;
            bkzb.f125549b = booleanValue;
        }
        if (metadataBundle.mo18269a(uzm.f48729E) == null) {
            z2 = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzb bkzb2 = (bkzb) da.f164949b;
        bkzb2.f125548a |= 2;
        bkzb2.f125550c = z2;
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) metadataBundle.mo18269a(uzm.f48736L);
        if (appVisibleCustomProperties == null) {
            appVisibleCustomProperties = AppVisibleCustomProperties.f31066a;
        }
        Iterator it = appVisibleCustomProperties.iterator();
        int i = 2;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((CustomProperty) it.next()).f31068a.f31065b == 0) {
                if (i == 2) {
                    i = 3;
                } else if (i == 4) {
                    i = 5;
                    break;
                }
            } else if (i == 2) {
                i = 4;
            } else if (i == 3) {
                i = 5;
                break;
            }
        }
        bxvd bxvd = this.f49080e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzb bkzb3 = (bkzb) da.f164949b;
        bkzb3.f125551d = i - 1;
        bkzb3.f125548a = 4 | bkzb3.f125548a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzb bkzb4 = (bkzb) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzb4.getClass();
        bkzo.f125653k = bkzb4;
        bkzo.f125643a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
    public final /* bridge */ /* synthetic */ void mo28283a(Query query, boolean z, Integer num, Boolean bool, Integer num2) {
        boolean z2;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(!z2, (Object) "Can't call setQueryDetails() twice");
        bxvd da = bkze.f125563g.mo74144da();
        Set<bkzt> set = (Set) query.f31087a.mo18284a(new vdj(this));
        ArrayList arrayList = new ArrayList(set.size());
        for (bkzt bkzt : set) {
            if (bkzt == null) {
                arrayList.add(bkzt.UNKNOWN_METADATA_FIELD);
            } else {
                arrayList.add(bkzt);
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkze bkze = (bkze) da.f164949b;
        if (!bkze.f125566b.mo73666a()) {
            bkze.f125566b = GeneratedMessageLite.m124019a(bkze.f125566b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bkze.f125566b.mo74153d(((bkzt) arrayList.get(i)).f125701o);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkze bkze2 = (bkze) da.f164949b;
        bkze2.f125565a |= 2;
        bkze2.f125567c = z;
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkze bkze3 = (bkze) da.f164949b;
            bkze3.f125565a |= 4;
            bkze3.f125568d = intValue;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkze bkze4 = (bkze) da.f164949b;
            bkze4.f125565a |= 8;
            bkze4.f125569e = booleanValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 == 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkze bkze5 = (bkze) da.f164949b;
                bkze5.f125570f = 1;
                bkze5.f125565a |= 16;
            } else if (intValue2 != 1) {
                f49076a.mo25374b("ImpressionLogEvent", "Unknown query status: %d", num2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkze bkze6 = (bkze) da.f164949b;
                bkze6.f125570f = 0;
                bkze6.f125565a |= 16;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkze bkze7 = (bkze) da.f164949b;
                bkze7.f125570f = 2;
                bkze7.f125565a |= 16;
            }
        }
        bxvd bxvd = this.f49080e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkze bkze8 = (bkze) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkze8.getClass();
        bkzo.f125659q = bkze8;
        bkzo.f125643a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
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
    public final void mo28326a(String str, boolean z, String str2) {
        boolean z2;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 2048) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(!z2, (Object) "Can't call setResourceInfo() twice");
        bxvd da = bkzh.f125581e.mo74144da();
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzh bkzh = (bkzh) da.f164949b;
            str.getClass();
            bkzh.f125583a = 1 | bkzh.f125583a;
            bkzh.f125584b = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzh bkzh2 = (bkzh) da.f164949b;
        int i = bkzh2.f125583a | 4;
        bkzh2.f125583a = i;
        bkzh2.f125586d = z;
        if (str2 != null) {
            str2.getClass();
            bkzh2.f125583a = i | 2;
            bkzh2.f125585c = str2;
        }
        bxvd bxvd = this.f49080e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzh bkzh3 = (bkzh) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzh3.getClass();
        bkzo.f125656n = bkzh3;
        bkzo.f125643a |= 2048;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28285a(twz twz) {
        boolean z;
        String str = twz.mo26854a().f30728a;
        Boolean bool = (Boolean) twz.mo26855a(uzm.f48751j);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        mo28326a(str, z, twz.mo26857c());
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
    public final void mo28286a(txr txr) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setActionType() twice");
        bxvd bxvd = this.f49080e;
        bkyc b = m40141b(txr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkzo.f125664v = b.f125455p;
        bkzo.f125643a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28287a(ujx ujx) {
        mo28326a(ujx.mo27616i(), ujx.mo27573ai(), ujx.mo27530H());
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
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28288a(upx upx, int i, int i2) {
        boolean z;
        bxvd bxvd;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setCompletionEventDetails() twice");
        bxvd da = bkys.f125487g.mo74144da();
        if (upx != null) {
            ArrayList arrayList = new ArrayList(upx.f48506h.size());
            for (txr txr : upx.f48506h) {
                arrayList.add(m40141b(txr));
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bkys) da.f164949b).f125492d = GeneratedMessageLite.m124028dc();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkys bkys = (bkys) da.f164949b;
            if (!bkys.f125492d.mo73666a()) {
                bkys.f125492d = GeneratedMessageLite.m124019a(bkys.f125492d);
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                bkys.f125492d.mo74153d(((bkyc) arrayList.get(i3)).f125455p);
            }
            int size2 = upx.f48505g.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkys bkys2 = (bkys) da.f164949b;
            int i4 = bkys2.f125489a | 2;
            bkys2.f125489a = i4;
            bkys2.f125491c = size2;
            int i5 = upx.f48507i;
            if (i5 == 0) {
                bkys2.f125490b = 1;
            } else if (i5 == 1) {
                bkys2.f125490b = 2;
            } else if (i5 == 2) {
                bkys2.f125490b = 3;
            } else if (i5 != 3) {
                f49076a.mo25374b("ImpressionLogEvent", "Unknown completion event status (%d) in %s", Integer.valueOf(upx.f48507i), this.f49078c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bkys bkys3 = (bkys) da.f164949b;
                bkys3.f125490b = 0;
                bkys3.f125489a |= 1;
            } else {
                bkys2.f125490b = 4;
            }
            bkys2.f125489a = i4 | 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkys bkys4 = (bkys) da.f164949b;
        int i6 = bkys4.f125489a | 8;
        bkys4.f125489a = i6;
        bkys4.f125494f = i;
        if (i2 == 0) {
            bkys4.f125493e = 1;
        } else if (i2 != 1) {
            bkys4.f125493e = 3;
            bkys4.f125489a = i6 | 4;
            bxvd = this.f49080e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bkzo bkzo = (bkzo) bxvd.f164949b;
            bkys bkys5 = (bkys) da.mo74062i();
            bkzo bkzo2 = bkzo.f125631K;
            bkys5.getClass();
            bkzo.f125646d = bkys5;
            bkzo.f125643a |= 2;
        } else {
            bkys4.f125493e = 2;
        }
        bkys4.f125489a = i6 | 4;
        bxvd = this.f49080e;
        if (bxvd.f164950c) {
        }
        bkzo bkzo3 = (bkzo) bxvd.f164949b;
        bkys bkys52 = (bkys) da.mo74062i();
        bkzo bkzo22 = bkzo.f125631K;
        bkys52.getClass();
        bkzo3.f125646d = bkys52;
        bkzo3.f125643a |= 2;
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
    public final void mo28289a(van van) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setActivityLevel() twice");
        bxvd bxvd = this.f49080e;
        int b = m40140b(van);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkzo.f125661s = b - 1;
        bkzo.f125643a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
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
    public final void mo28290a(van van, long j) {
        boolean z;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setActivityLevelChangeDetails() twice");
        bxvd bxvd = this.f49080e;
        bxvd da = bkyq.f125472d.mo74144da();
        int b = m40140b(van);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkyq bkyq = (bkyq) da.f164949b;
        bkyq.f125475b = b - 1;
        int i = bkyq.f125474a | 1;
        bkyq.f125474a = i;
        bkyq.f125474a = i | 2;
        bkyq.f125476c = j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkyq bkyq2 = (bkyq) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkyq2.getClass();
        bkzo.f125663u = bkyq2;
        bkzo.f125643a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
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
    public final /* bridge */ /* synthetic */ void mo28291a(boolean z) {
        boolean z2;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(!z2, (Object) "Can't call setIsCached() twice");
        bxvd bxvd = this.f49080e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzo bkzo2 = bkzo.f125631K;
        bkzo.f125643a |= 128;
        bkzo.f125652j = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28292a(boolean z, String str) {
        mo28326a((String) null, z, str);
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
    public final /* bridge */ /* synthetic */ void mo28293a(boolean z, boolean z2, Integer num) {
        boolean z3;
        int i;
        mo28330k();
        if ((((bkzo) this.f49080e.f164949b).f125643a & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34971a(!z3, (Object) "Can't call setExecutionOptions() twice");
        bxvd da = bkyx.f125525e.mo74144da();
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                i = 2;
            } else if (intValue != 1) {
                f49076a.mo25374b("ImpressionLogEvent", "Unknown conflict strategy: %s", num);
                i = 1;
            } else {
                i = 3;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkyx bkyx = (bkyx) da.f164949b;
            bkyx.f125530d = i - 1;
            bkyx.f125527a |= 4;
        }
        bxvd bxvd = this.f49080e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkyx bkyx2 = (bkyx) da.f164949b;
        int i2 = 1 | bkyx2.f125527a;
        bkyx2.f125527a = i2;
        bkyx2.f125528b = z2;
        bkyx2.f125527a = i2 | 2;
        bkyx2.f125529c = z;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkyx bkyx3 = (bkyx) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkyx3.getClass();
        bkzo.f125649g = bkyx3;
        bkzo.f125643a |= 16;
    }
}
