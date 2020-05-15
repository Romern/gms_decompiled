package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: azhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhg extends azhc {

    /* renamed from: b */
    private final String f99356b;

    /* renamed from: c */
    private final boolean f99357c;

    /* renamed from: d */
    private final Intent f99358d;

    /* renamed from: e */
    private final azfo f99359e;

    /* renamed from: f */
    private final MessagingService f99360f;

    /* renamed from: g */
    private LocalEntityId f99361g;

    /* renamed from: h */
    private azcs f99362h;

    public azhg(Context context, azfx azfx, String str, boolean z, Intent intent, MessagingService messagingService, azfo azfo) {
        super(context, azfx, "get profile");
        this.f99356b = str;
        this.f99357c = z;
        this.f99358d = intent;
        this.f99360f = messagingService;
        this.f99359e = azfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbgo cbgo = (cbgo) obj;
        afja afja = (afja) azht.m85748a(this.f99339a).mo54933a(4);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(4, this.f99361g);
        if (afja.f64282f == null) {
            afja.f64282f = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Matchstick/GetAppMetadata", ciie.m150370a(cbgo.f177056f), ciie.m150370a(cbhv.f177190m));
        }
        return (cbhv) afja.f64284a.mo25553a(afja.f64282f, a, cbgo, (long) afja.f64278b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        bxvd da = cbgo.f177056f.mo74144da();
        this.f99361g = azcv.m85357a(this.f99339a).mo54700c();
        this.f99362h = azcv.m85357a(this.f99339a).mo54689a(this.f99361g);
        bxvd a = azfn.m85571a(this.f99339a, this.f99361g);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo = (cbmo) a.mo74062i();
        cbmo.getClass();
        ((cbgo) da.f164949b).f177058a = cbmo;
        String str = this.f99356b;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbgo) da.f164949b).f177059b = str;
        }
        String locale = Locale.getDefault().toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        locale.getClass();
        ((cbgo) da.f164949b).f177060c = locale;
        if (this.f99357c) {
            String a2 = azpi.m86063a(this.f99339a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((cbgo) da.f164949b).f177061d = a2;
        }
        int i = Build.VERSION.SDK_INT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbgo) da.f164949b).f177062e = i;
        azph.m85998a(this.f99339a).mo55143a((int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, this.f99361g, this.f99356b);
        new Object[1][0] = da.mo74062i();
        return (cbgo) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbgo cbgo = (cbgo) obj;
        String valueOf = String.valueOf(this.f99356b);
        azoj.m85931a("GetAppMetaDataH", exc, valueOf.length() == 0 ? new String("Error sending rpc") : "Error sending rpc".concat(valueOf), new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        azcd.m85252a(this.f99339a).mo54609b(this.f99356b, contentValues);
        azph.m85998a(this.f99339a).mo55156a((int) MfiClientException.TYPE_CARD_NOT_CACHED, exc, this.f99356b);
        azho.m85727a(this.f99339a, this.f99359e, exc, this.f99358d, this.f99361g, this.f99362h);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbhy cbhy;
        bxtx bxtx;
        bxtx bxtx2;
        cbgo cbgo = (cbgo) obj;
        cbhv cbhv = (cbhv) obj2;
        new Object[1][0] = cbhv;
        ContentValues contentValues = new ContentValues();
        contentValues.put("locale", cbgo.f177060c);
        if (!cbgo.f177060c.isEmpty() && !cbgo.f177060c.startsWith(cbhv.f177193b)) {
            azph.m85998a(this.f99339a).mo55143a((int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, this.f99361g, this.f99356b);
            String valueOf = String.valueOf(this.f99356b);
            azoj.m85932b("GetAppMetaDataH", valueOf.length() == 0 ? new String("Failed to get app name with given locale") : "Failed to get app name with given locale".concat(valueOf), new Object[0]);
        }
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        boolean z = this.f99357c;
        String str = this.f99356b;
        contentValues.put("name", cbhv.f177192a);
        contentValues.put("pid", cbhv.f177194c);
        contentValues.put("install_url", cbhv.f177195d);
        contentValues.put("status", (Integer) 3);
        contentValues.put("last_sync", Long.valueOf(micros));
        if (z) {
            cbhx cbhx = cbhv.f177196e;
            if (cbhx == null) {
                cbhx = cbhx.f177210c;
            }
            if (cbhx.f177212a == null) {
                String valueOf2 = String.valueOf(str);
                azoj.m85933c("GetAppMetaDataH", valueOf2.length() == 0 ? new String("Failed to get icon from server. ") : "Failed to get icon from server. ".concat(valueOf2), new Object[0]);
                contentValues.put("status", (Integer) 1);
            } else {
                cbhx cbhx2 = cbhv.f177196e;
                if (cbhx2 == null) {
                    cbhx2 = cbhx.f177210c;
                }
                cbhy cbhy2 = cbhx2.f177212a;
                if (cbhy2 == null) {
                    cbhy2 = cbhy.f177214d;
                }
                byte[] a = azpi.m86072a(cbhy2);
                if (a != null) {
                    contentValues.put("icon", a);
                }
            }
            cbhx cbhx3 = cbhv.f177197f;
            if (cbhx3 == null) {
                cbhx3 = cbhx.f177210c;
            }
            if (cbhx3.f177212a != null) {
                cbhx cbhx4 = cbhv.f177197f;
                if (cbhx4 == null) {
                    cbhx4 = cbhx.f177210c;
                }
                cbhy cbhy3 = cbhx4.f177212a;
                if (cbhy3 == null) {
                    cbhy3 = cbhy.f177214d;
                }
                byte[] a2 = azpi.m86072a(cbhy3);
                if (a2 != null) {
                    contentValues.put("nicon", a2);
                    cbhx cbhx5 = cbhv.f177197f;
                    if (cbhx5 == null) {
                        cbhx5 = cbhx.f177210c;
                    }
                    contentValues.put("nicon_color", cbhx5.f177213b);
                }
            }
        }
        contentValues.put("onboarding_message", cbhv.f177198g);
        contentValues.put("offboarding_message", cbhv.f177199h);
        cbhr cbhr = cbhv.f177203l;
        if (cbhr != null) {
            if (z && (cbhy = cbhr.f177173e) != null) {
                if (cbhy.f177216a == 1) {
                    bxtx = (bxtx) cbhy.f177217b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                if (!bxtx.mo73779j()) {
                    cbhr cbhr2 = cbhv.f177203l;
                    if (cbhr2 == null) {
                        cbhr2 = cbhr.f177167i;
                    }
                    cbhy cbhy4 = cbhr2.f177173e;
                    if (cbhy4 == null) {
                        cbhy4 = cbhy.f177214d;
                    }
                    if (cbhy4.f177216a == 1) {
                        bxtx2 = (bxtx) cbhy4.f177217b;
                    } else {
                        bxtx2 = bxtx.f164797b;
                    }
                    contentValues.put("background_image", bxtx2.mo73780k());
                }
            }
            cbhr cbhr3 = cbhv.f177203l;
            if (cbhr3 == null) {
                cbhr3 = cbhr.f177167i;
            }
            bxvd bxvd = (bxvd) cbhr3.mo74142c(5);
            bxvd.mo73625a((bxvk) cbhr3);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((cbhr) bxvd.f164949b).f177173e = null;
            contentValues.put("app_theme", ((cbhr) bxvd.mo74062i()).mo73642k());
        }
        cbht cbht = cbhv.f177202k;
        if (cbht != null) {
            contentValues.put("app_ui_config", cbht.mo73642k());
        }
        cbhp cbhp = cbhv.f177201j;
        if (cbhp != null) {
            contentValues.put("app_string_tag_mapping", cbhp.mo73642k());
        }
        if (azcd.m85252a(this.f99339a).mo54606a(this.f99356b, contentValues)) {
            azcd.m85252a(this.f99339a).mo54603a(this.f99356b, cbhv.f177200i);
            List a3 = azcm.m85300a(this.f99339a).mo54645a(this.f99356b);
            int size = a3.size();
            for (int i = 0; i < size; i++) {
                azho.m85728a(this.f99339a, this.f99360f, (String) a3.get(i));
            }
            Context context = this.f99339a;
            String str2 = this.f99356b;
            if (cfeo.m138876g()) {
                ContentResolver contentResolver = context.getContentResolver();
                contentResolver.notifyChange(DatabaseProvider.m94541e(str2), null);
                contentResolver.notifyChange(DatabaseProvider.m94542f(str2), null);
            } else {
                context.getContentResolver().notifyChange(DatabaseProvider.m94541e(str2), null);
            }
        } else {
            azoj.m85933c("GetAppMetaDataH", "Failed to find app %s", this.f99356b);
        }
        azph.m85998a(this.f99339a).mo55143a((int) MfiClientException.TYPE_NO_ACCOUNT_INFO, this.f99361g, this.f99356b);
    }
}
