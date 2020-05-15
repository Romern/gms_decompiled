package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: azhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhh extends azhc {

    /* renamed from: b */
    private final String f99363b;

    /* renamed from: c */
    private final Intent f99364c;

    /* renamed from: d */
    private final MessagingService f99365d;

    /* renamed from: e */
    private String f99366e;

    /* renamed from: f */
    private String f99367f;

    /* renamed from: g */
    private LocalEntityId f99368g;

    /* renamed from: h */
    private azcs f99369h;

    public azhh(Context context, azfx azfx, String str, Intent intent, MessagingService messagingService) {
        super(context, azfx, "get appdata");
        this.f99363b = str;
        this.f99364c = intent;
        this.f99365d = messagingService;
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
    /* renamed from: a */
    public static void m85697a(MessagingService messagingService, String str, cbhw cbhw, Context context, LocalEntityId localEntityId, String str2, String str3, String str4) {
        ByteString bxtx;
        ByteString bxtx2;
        String str5 = str;
        cbhw cbhw2 = cbhw;
        LocalEntityId localEntityId2 = localEntityId;
        String str6 = str2;
        new Object[1][0] = cbhw2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("locale", str5);
        if (str5 != null && !str5.startsWith(cbhw2.f177206a)) {
            azph.m85998a(context).mo55143a((int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, localEntityId2, str6);
            String valueOf = String.valueOf(str2);
            azoj.m85932b("GetAppDataV2Handler", valueOf.length() == 0 ? new String("Failed to get app name with given locale") : "Failed to get app name with given locale".concat(valueOf), new Object[0]);
        }
        String str7 = cbhw2.f177208c;
        String str8 = cbhw2.f177207b;
        contentValues.put("image_app_metadata_version", str7);
        contentValues.put("non_image_app_metadata_version", str8);
        cbhl cbhl = cbhw2.f177209d;
        if (cbhl != null) {
            contentValues.put("name", cbhl.f177145a);
            contentValues.put("status", (Integer) 3);
            contentValues.put("last_sync", Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
            if (!TextUtils.equals(str8, str4) && !(cbhl.f177149e == null && cbhl.f177147c == null && cbhl.f177146b == null)) {
                azph.m85998a(context).mo55130a(165, 25, str6);
            }
            if (!TextUtils.equals(str7, str3) && cbhl.f177148d != null) {
                azph.m85998a(context).mo55130a(164, 25, str6);
            }
            cbhq cbhq = cbhl.f177149e;
            if (cbhq != null) {
                contentValues.put("pid", cbhq.f177165c);
                contentValues.put("install_url", cbhq.f177166d);
                if (cbhq.f177164b == null || cbhq.f177163a.size() == 0) {
                    azph.m85998a(context).mo55130a(161, 25, str6);
                } else {
                    cbhp cbhp = cbhq.f177164b;
                    if (cbhp == null) {
                        cbhp = cbhp.f177158b;
                    }
                    contentValues.put("app_string_tag_mapping", cbhp.serializeToBytes());
                    azcd.m85252a(context).mo54603a(str6, cbhq.f177163a);
                }
            }
            cbhk cbhk = cbhl.f177148d;
            if (cbhk != null) {
                cbhx cbhx = cbhk.f177140a;
                if (cbhx == null) {
                    cbhx = cbhx.f177210c;
                }
                if (cbhx.f177212a == null) {
                    String valueOf2 = String.valueOf(str2);
                    azoj.m85933c("GetAppDataV2Handler", valueOf2.length() == 0 ? new String("Failed to get icon from server. ") : "Failed to get icon from server. ".concat(valueOf2), new Object[0]);
                    contentValues.put("status", (Integer) 1);
                    azph.m85998a(context).mo55130a(161, 25, str6);
                } else {
                    cbhx cbhx2 = cbhk.f177140a;
                    if (cbhx2 == null) {
                        cbhx2 = cbhx.f177210c;
                    }
                    cbhy cbhy = cbhx2.f177212a;
                    if (cbhy == null) {
                        cbhy = cbhy.f177214d;
                    }
                    byte[] a = azpi.m86072a(cbhy);
                    if (a != null) {
                        contentValues.put("icon", a);
                    }
                }
                cbhx cbhx3 = cbhk.f177141b;
                if (cbhx3 == null) {
                    cbhx3 = cbhx.f177210c;
                }
                if (cbhx3.f177212a != null) {
                    cbhx cbhx4 = cbhk.f177141b;
                    if (cbhx4 == null) {
                        cbhx4 = cbhx.f177210c;
                    }
                    cbhy cbhy2 = cbhx4.f177212a;
                    if (cbhy2 == null) {
                        cbhy2 = cbhy.f177214d;
                    }
                    byte[] a2 = azpi.m86072a(cbhy2);
                    if (a2 != null) {
                        contentValues.put("nicon", a2);
                        cbhx cbhx5 = cbhk.f177141b;
                        if (cbhx5 == null) {
                            cbhx5 = cbhx.f177210c;
                        }
                        contentValues.put("nicon_color", cbhx5.f177213b);
                    }
                }
                cbhy cbhy3 = cbhk.f177142c;
                if (cbhy3 == null) {
                    cbhy3 = cbhy.f177214d;
                }
                if (cbhy3.f177216a == 1) {
                    bxtx = (ByteString) cbhy3.f177217b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                if (!bxtx.mo73779j()) {
                    cbhy cbhy4 = cbhk.f177142c;
                    if (cbhy4 == null) {
                        cbhy4 = cbhy.f177214d;
                    }
                    if (cbhy4.f177216a == 1) {
                        bxtx2 = (ByteString) cbhy4.f177217b;
                    } else {
                        bxtx2 = bxtx.f164797b;
                    }
                    contentValues.put("background_image", bxtx2.getKey());
                }
            }
            cbhr cbhr = cbhl.f177147c;
            if (cbhr != null) {
                contentValues.put("app_theme", cbhr.serializeToBytes());
            }
            cbht cbht = cbhl.f177146b;
            if (cbht != null) {
                contentValues.put("app_ui_config", cbht.serializeToBytes());
            }
        } else {
            String valueOf3 = String.valueOf(str2);
            azoj.m85933c("GetAppDataV2Handler", valueOf3.length() == 0 ? new String("Null AppMetadata in GetAppMetadataResponseV2 for app ") : "Null AppMetadata in GetAppMetadataResponseV2 for app ".concat(valueOf3), new Object[0]);
            contentValues.put("status", (Integer) 1);
            azph.m85998a(context).mo55130a(161, 6, str6);
        }
        if (azcd.m85252a(context).mo54606a(str6, contentValues)) {
            azqf.m86130a(context);
            if (azqf.m86149c()) {
                azpw a3 = azpw.m86109a(context);
                a3.mo55200a(new azpl(a3, str6));
                azpw.m86109a(context).mo55194a();
            }
            List a4 = azcm.m85300a(context).mo54645a(str6);
            int size = a4.size();
            for (int i = 0; i < size; i++) {
                azho.m85728a(context, messagingService, (String) a4.get(i));
            }
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.notifyChange(DatabaseProvider.m94541e(str2), null);
            contentResolver.notifyChange(DatabaseProvider.m94542f(str2), null);
        } else {
            azoj.m85933c("GetAppDataV2Handler", "Failed to find app %s", str6);
        }
        azph.m85998a(context).mo55143a(160, localEntityId2, str6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        bxvd da = cbgp.f177063h.mo74144da();
        this.f99368g = azcv.m85357a(this.f99339a).mo54700c();
        this.f99369h = azcv.m85357a(this.f99339a).mo54689a(this.f99368g);
        Map j = azcd.m85252a(this.f99339a).mo54618j(this.f99363b);
        this.f99366e = (String) j.get("images_hash_key");
        this.f99367f = (String) j.get("non_images_hash_key");
        bxvd a = azfn.m85571a(this.f99339a, this.f99368g);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo = (cbmo) a.mo74062i();
        cbmo.getClass();
        ((cbgp) da.f164949b).f177065a = cbmo;
        String locale = Locale.getDefault().toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        locale.getClass();
        ((cbgp) da.f164949b).f177067c = locale;
        String a2 = azpi.m86063a(this.f99339a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cbgp) da.f164949b).f177068d = a2;
        int i = Build.VERSION.SDK_INT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbgp cbgp = (cbgp) da.f164949b;
        cbgp.f177069e = i;
        String str = this.f99363b;
        if (str != null) {
            str.getClass();
            cbgp.f177066b = str;
        }
        String str2 = this.f99367f;
        if (str2 != null) {
            str2.getClass();
            cbgp.f177070f = str2;
        }
        String str3 = this.f99366e;
        if (str3 != null) {
            str3.getClass();
            cbgp.f177071g = str3;
        }
        azph.m85998a(this.f99339a).mo55143a((int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, this.f99368g, this.f99363b);
        new Object[1][0] = da.mo74062i();
        return (cbgp) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbgp cbgp = (cbgp) obj;
        afja afja = (afja) azht.m85748a(this.f99339a).mo54933a(4);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(4, this.f99368g);
        if (afja.f64279c == null) {
            afja.f64279c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Matchstick/GetAppMetadataV2", ciie.m150370a(cbgp.f177063h), ciie.m150370a(cbhw.f177204e));
        }
        return (cbhw) afja.f64284a.mo25553a(afja.f64279c, a, cbgp, (long) afja.f64278b, TimeUnit.MILLISECONDS);
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
        cbgp cbgp = (cbgp) obj;
        String valueOf = String.valueOf(this.f99363b);
        azoj.m85931a("GetAppDataV2Handler", exc, valueOf.length() == 0 ? new String("Error sending rpc") : "Error sending rpc".concat(valueOf), new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        azcd.m85252a(this.f99339a).mo54609b(this.f99363b, contentValues);
        azph.m85998a(this.f99339a).mo55156a(161, exc, this.f99363b);
        Context context = this.f99339a;
        azho.m85727a(context, azfo.m85593a(context), exc, this.f99364c, this.f99368g, this.f99369h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        m85697a(this.f99365d, ((cbgp) obj).f177067c, (cbhw) obj2, this.f99339a, this.f99368g, this.f99363b, this.f99366e, this.f99367f);
    }
}
