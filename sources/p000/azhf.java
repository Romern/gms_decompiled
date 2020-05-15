package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: azhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhf extends azhc {

    /* renamed from: b */
    Set f99354b;

    /* renamed from: c */
    private final LocalEntityId f99355c;

    public azhf(Context context, azfx azfx, LocalEntityId localEntityId) {
        super(context, azfx, "get profile");
        this.f99355c = localEntityId;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbgz cbgz = (cbgz) obj;
        afiz afiz = (afiz) azht.m85748a(this.f99339a).mo54933a(2);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(2, this.f99355c);
        if (afiz.f64273e == null) {
            afiz.f64273e = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.MatchstickAbuse/GetBlockedApps", ciie.m150370a(cbgz.f177103b), ciie.m150370a(cbha.f177106b));
        }
        return (cbha) afiz.f64277a.mo25553a(afiz.f64273e, a, cbgz, (long) afiz.f64270b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        Cursor cursor;
        azcd a = azcd.m85252a(this.f99339a);
        HashSet hashSet = new HashSet();
        try {
            cursor = a.f98961a.getReadableDatabase().query("appData", new String[]{"sid"}, "blocked = ?", new String[]{"1"}, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        hashSet.add(cursor.getString(cursor.getColumnIndexOrThrow("sid")));
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            this.f99354b = hashSet;
            bxvd da = cbgz.f177103b.mo74144da();
            cbmo cbmo = (cbmo) azfn.m85571a(this.f99339a, this.f99355c).mo74062i();
            if (cbmo != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbmo.getClass();
                ((cbgz) da.f164949b).f177105a = cbmo;
            }
            return (cbgz) da.mo74062i();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbgz cbgz = (cbgz) obj;
        azoj.m85931a("FetchBAMarkUnsyncedH", exc, "Error sending rpc", new Object[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azcd.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      azcd.a(android.content.ContentResolver, java.lang.String[]):android.database.Cursor
      azcd.a(java.lang.String, java.lang.String[]):android.database.Cursor
      azcd.a(java.lang.String, int):java.lang.String
      azcd.a(java.lang.String, long):java.lang.String
      azcd.a(java.lang.String, java.util.List):void
      azcd.a(java.lang.String, android.content.ContentValues):boolean
      azcd.a(java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbgz cbgz = (cbgz) obj;
        azdl a = azdl.m85412a(this.f99339a);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = a.f99088a.edit();
        edit.putLong("last_get_blocked_apps_timestamp_ms", currentTimeMillis);
        edit.apply();
        bxwc bxwc = ((cbha) obj2).f177108a;
        HashSet<String> hashSet = new HashSet();
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            String str = (String) bxwc.get(i);
            if (this.f99354b.contains(str)) {
                this.f99354b.remove(str);
            } else {
                hashSet.add(str);
            }
        }
        if (!this.f99354b.isEmpty()) {
            for (String str2 : this.f99354b) {
                azcd.m85252a(this.f99339a).mo54604a(str2, false);
                Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_APP");
                intent.putExtra("server_app_id", str2);
                intent.putExtra("sync_app_block_state_with_server", true);
                MessagingService.m94560d(intent, this.f99339a);
            }
        }
        if (!hashSet.isEmpty()) {
            for (String str3 : hashSet) {
                azcd.m85252a(this.f99339a).mo54604a(str3, false);
                Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.UNBLOCK_APP");
                intent2.putExtra("server_app_id", str3);
                intent2.putExtra("sync_app_block_state_with_server", true);
                MessagingService.m94560d(intent2, this.f99339a);
            }
        }
    }
}
