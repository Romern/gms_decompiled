package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;

/* renamed from: amxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxp extends amxs {

    /* renamed from: m */
    private static final String[] f76312m = {"_id"};

    /* renamed from: a */
    public final anbu f76313a;

    /* renamed from: b */
    public final amvt f76314b;

    /* renamed from: c */
    public final amyw f76315c;

    /* renamed from: d */
    public final Uri f76316d;

    /* renamed from: e */
    public final Context f76317e;

    /* renamed from: f */
    public final bmxv f76318f;

    /* renamed from: g */
    public final amwr f76319g;

    /* renamed from: n */
    private final amys f76320n;

    /* renamed from: o */
    private final bmxv f76321o;

    public amxp(Context context, amwr amwr, ContentResolver contentResolver, Account account, anaz anaz, amvm amvm, amys amys, anav anav, anbu anbu, bmxv bmxv, bmxv bmxv2) {
        super(contentResolver, account, anaz, anav, amvm);
        this.f76317e = context;
        this.f76319g = amwr;
        this.f76320n = amys;
        this.f76314b = new amvt(account, contentResolver, anaz);
        this.f76315c = new amyw(account, this.f76338h, this.f76314b, amvm);
        this.f76313a = anbu;
        this.f76316d = amvt.m63471a(ContactsContract.Data.CONTENT_URI, account);
        this.f76318f = bmxv;
        this.f76321o = bmxv2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0036  */
    /* renamed from: a */
    public final int mo41551a(String str) {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.f76338h;
            Uri uri = this.f76316d;
            String[] strArr = f76312m;
            String[] strArr2 = amvt.f76137a;
            cursor = contentResolver.query(uri, strArr, str, null, null);
            if (cursor == null) {
                try {
                    Log.e("FSA2_PhotoSyncer", "Couldn't get the photo cursor.");
                    return -1;
                } catch (Exception e) {
                    e = e;
                    try {
                        Log.e("FSA2_PhotoSyncer", "Exception found when query photo count", e);
                        if (cursor != null) {
                        }
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } else {
                int count = cursor.getCount();
                cursor.close();
                return count;
            }
        } catch (Exception e2) {
            e = e2;
            Log.e("FSA2_PhotoSyncer", "Exception found when query photo count", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amxp.a(amvx, boolean):void
     arg types: [amwc, int]
     candidates:
      amxp.a(java.lang.String, amjf):void
      amxp.a(amvx, boolean):void */
    /* renamed from: b */
    public final void mo41550b() {
        ContentResolver contentResolver = this.f76338h;
        Uri uri = this.f76316d;
        amwr amwr = this.f76319g;
        anaz anaz = this.f76340j;
        amvm amvm = this.f76341k;
        amys amys = this.f76320n;
        bmxv bmxv = this.f76321o;
        String[] strArr = amwc.f76160b;
        String[] strArr2 = amvt.f76137a;
        Cursor query = contentResolver.query(uri, strArr, "mimetype='vnd.android.cursor.item/photo' AND sourceid IS NOT NULL AND (data_sync4 IS NULL OR data_sync4!=(data_version+10)) ", null, null);
        if (query != null) {
            amwc amwc = new amwc(query, amwr, anaz, amvm, amys, bmxv);
            try {
                mo41552a((amvx) amwc, false);
                amig.m62939a();
                if (((Boolean) amfp.f74866a.mo41191a()).booleanValue()) {
                    amwc.mo41472f();
                }
            } catch (Throwable th) {
                amig.m62939a();
                if (((Boolean) amfp.f74866a.mo41191a()).booleanValue()) {
                    amwc.mo41472f();
                }
                throw th;
            }
        } else {
            Log.e("FSA2_SyncUpPhotoCursor", "Failed to query photos need to sync up in CP2.");
            throw new amyc(new RemoteException("Unable to query CP2."));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* renamed from: a */
    public final void mo41552a(amvx amvx, boolean z) {
        boolean z2;
        String str = "FSA_photoSyncUp";
        this.f76342l.mo41626a();
        amig.m62939a();
        boolean z3 = true;
        int i = 0;
        if (!z || !((Boolean) amgb.f74878a.mo41191a()).booleanValue() || !this.f76318f.mo66813a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !((Boolean) amge.f74881a.mo41191a()).booleanValue() || !this.f76321o.mo66813a()) {
            z3 = false;
        }
        if (z2) {
            ((amxe) this.f76318f.mo66814b()).mo41520c(amvx.mo41467c());
        } else if (z3) {
            ((amxh) this.f76321o.mo66814b()).mo41520c(amvx.mo41467c());
        }
        try {
            ContentProviderOperation.Builder builder = (ContentProviderOperation.Builder) amvx.mo41464b();
            while (builder != null) {
                try {
                    this.f76314b.mo41450a(builder);
                    if (!z) {
                        this.f76314b.mo41449a();
                    } else {
                        this.f76314b.mo41451b();
                    }
                    i++;
                    builder = (ContentProviderOperation.Builder) amvx.mo41464b();
                } catch (Throwable th) {
                    th = th;
                    if (!z2) {
                        ((amxe) this.f76318f.mo66814b()).mo41525g();
                    } else if (z3) {
                        ((amxh) this.f76321o.mo66814b()).mo41525g();
                    }
                    if (z) {
                        str = "FSA_photoSyncDown";
                    }
                    this.f76342l.mo41627a(str, i);
                    amvx.mo41472f();
                    throw th;
                }
            }
            if (!z) {
                this.f76314b.mo41451b();
            }
            if (z2) {
                ((amxe) this.f76318f.mo66814b()).mo41525g();
            } else if (z3) {
                ((amxh) this.f76321o.mo66814b()).mo41525g();
            }
            if (z) {
                str = "FSA_photoSyncDown";
            }
            this.f76342l.mo41627a(str, i);
            amvx.mo41472f();
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
            }
            if (z) {
            }
            this.f76342l.mo41627a(str, i);
            amvx.mo41472f();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo41553a(String str, amjf amjf) {
        this.f76340j.mo41631a(amjf, amkb.AFTER_SYNC, amjd.CP2, mo41551a(str));
    }
}
