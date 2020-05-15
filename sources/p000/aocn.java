package p000;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;
import com.google.android.gms.plus.service.PlusChimeraService;
import java.io.IOException;

/* renamed from: aocn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocn extends aoba {

    /* renamed from: a */
    private final ClientContext f78194a;

    /* renamed from: b */
    private final ClientContext f78195b;

    /* renamed from: c */
    private final String f78196c;

    /* renamed from: d */
    private final String[] f78197d;

    /* renamed from: e */
    private final sck f78198e;

    /* renamed from: f */
    private final String f78199f;

    /* renamed from: g */
    private final aoay f78200g;

    /* renamed from: h */
    private final boolean f78201h;

    /* renamed from: i */
    private final boolean f78202i;

    public aocn(ClientContext clientContext, ClientContext clientContext2, String[] strArr, sck sck, String str, aoay aoay, boolean z, boolean z2) {
        this.f78194a = clientContext;
        this.f78195b = clientContext2;
        this.f78198e = sck;
        this.f78196c = clientContext2.f30215e;
        this.f78197d = strArr;
        this.f78199f = str;
        this.f78200g = aoay;
        this.f78201h = z;
        boolean z3 = false;
        if (!z2 && ((Boolean) ansx.f77678aa.mo25081c()).booleanValue()) {
            z3 = true;
        }
        this.f78202i = z3;
    }

    /* renamed from: a */
    private final void m65804a(Context context, ConnectionResult connectionResult) {
        m65805a(context, connectionResult, null, null);
    }

    /* renamed from: a */
    private final void m65805a(Context context, ConnectionResult connectionResult, IBinder iBinder, byte[] bArr) {
        int i = connectionResult.f30065c;
        if (i == 0 || i == 5 || connectionResult.mo17670a()) {
            if (!connectionResult.mo17671b() && "<<default account>>".equals(this.f78195b.mo17795a())) {
                soz.m35799c(context, this.f78196c);
            }
            Bundle bundle = new Bundle();
            if (connectionResult.mo17670a()) {
                bundle.putParcelable("pendingIntent", connectionResult.f30066d);
            }
            if (bArr != null) {
                bundle.putByteArray("loaded_person", bArr);
            }
            this.f78198e.mo16678a(connectionResult.f30065c, iBinder, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("no resolution provided for status ");
        sb.append(i);
        Log.e("ValidateAccountOperatio", sb.toString());
        throw new IllegalStateException("no resolution provided!");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoaz.a(android.content.Context, com.google.android.gms.common.internal.ClientContext, boolean, boolean):com.google.android.gms.common.ConnectionResult
     arg types: [android.content.Context, com.google.android.gms.common.internal.ClientContext, int, boolean]
     candidates:
      aoaz.a(android.content.Context, java.lang.String, int, android.content.Intent):com.google.android.gms.common.ConnectionResult
      aoaz.a(android.content.Context, com.google.android.gms.common.internal.ClientContext, boolean, boolean):com.google.android.gms.common.ConnectionResult */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a3, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r4 = r0.networkResponse;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ae, code lost:
        p000.aoam.m65704a(r5, r2.mo17795a(), r2.f30215e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02c5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02c8, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ca, code lost:
        m65804a(r9, p000.aoaz.m65723a(r9, r1.f78195b, r15.equals(r2.mo17795a()), r1.f78202i));
        r7 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02e2, code lost:
        r3 = new p000.anui(r9, r2);
        r3.f77745b = r0.mo7366a();
        m65804a(r9, p000.aoaz.m65724a(r9, r1.f78196c, 6, r3.mo42290a()));
        r7 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        r15 = "<<default account>>";
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r18 = r6;
        r15 = "<<default account>>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r18 = r6;
        r15 = "<<default account>>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0101, code lost:
        r3.mo42291b();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027b A[Catch:{ all -> 0x0290 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02c0 A[ExcHandler: gid (e gid), Splitter:B:100:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02c2 A[ExcHandler: UserRecoverableAuthException (r0v13 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:71:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0306 A[EDGE_INSN: B:169:0x0306->B:164:0x0306 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8 A[ExcHandler: gid (e gid), Splitter:B:26:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd A[ExcHandler: IOException (e java.io.IOException), Splitter:B:26:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1 A[SYNTHETIC, Splitter:B:79:0x01a1] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        byte[] bArr;
        int length;
        byte[] bArr2;
        int i;
        ContentProviderClient acquireContentProviderClient;
        Cursor query;
        String b;
        String str2;
        ContentProviderClient acquireContentProviderClient2;
        ContentValues contentValues;
        SQLiteDatabase writableDatabase;
        ConnectionResult connectionResult;
        ClientContext clientContext;
        Context context2 = context;
        this.f78195b.mo17802b();
        if (this.f78201h) {
            str = "<<default account>>";
        } else {
            ConnectionResult connectionResult2 = soz.m35807f(context) ? new ConnectionResult(20, null) : ConnectionResult.f30063a;
            if (!connectionResult2.mo17671b()) {
                m65804a(context2, connectionResult2);
                return;
            }
            String b2 = soz.m35794b(context2, this.f78195b.mo17795a(), this.f78196c);
            if (b2 != null) {
                this.f78195b.mo17808e(b2);
                this.f78194a.mo17808e(b2);
                if (!this.f78202i) {
                    ConnectionResult a = this.f78200g.mo42518a(context2, this.f78195b, this.f78197d);
                    if (a.f30065c != 0) {
                        m65804a(context2, a);
                        return;
                    }
                }
                ClientContext clientContext2 = this.f78195b;
                try {
                    ClientContext clientContext3 = clientContext2;
                    str = "<<default account>>";
                    try {
                        connectionResult = this.f78200g.mo42519a(context, clientContext2.f30216f, clientContext2.f30212b, clientContext2.mo17812g(), clientContext2.mo17802b(), clientContext2.mo17813h());
                    } catch (UserRecoverableAuthException e) {
                        e = e;
                        clientContext = clientContext3;
                        anui anui = new anui(context2, clientContext);
                        anui.f77745b = e.mo7366a();
                        anui.f77744a = 2;
                        if (str.equals(clientContext.mo17795a())) {
                        }
                        connectionResult = aoaz.m65724a(context2, this.f78196c, 6, anui.mo42290a());
                        if (!connectionResult.mo17671b()) {
                        }
                        String[] e2 = this.f78195b.mo17809e();
                        length = e2.length;
                        bArr2 = null;
                        i = 0;
                        while (true) {
                            if (i < length) {
                            }
                            i++;
                        }
                        ClientContext clientContext4 = this.f78195b;
                        try {
                            anse anse = anru.f77553d;
                            ContentResolver contentResolver = context.getContentResolver();
                            String b3 = clientContext4.mo17802b();
                            String str3 = clientContext4.f30215e;
                            acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
                            query = ((PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient)).f82604b.getReadableDatabase().query("plus_profiles", null, "accountName=? AND packageName=?", new String[]{b3, str3}, null, null, null);
                            acquireContentProviderClient.release();
                            if (query != null) {
                            }
                            SafeParcelResponse safeParcelResponse = (SafeParcelResponse) anse.f77574a.mo42546a(clientContext4, "me", SafeParcelResponse.class, SafeParcelResponse.m22678a(PersonEntity.class));
                            String sio = ((PersonEntity) safeParcelResponse.mo17872a(PersonEntity.CREATOR)).toString();
                            b = clientContext4.mo17802b();
                            ContentValues contentValues2 = new ContentValues(3);
                            contentValues2.put("accountName", b);
                            contentValues2.put("packageName", clientContext4.f30215e);
                            contentValues2.put("profileJson", sio);
                            str2 = clientContext4.f30215e;
                            acquireContentProviderClient2 = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
                            try {
                                PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient2);
                                contentValues = new ContentValues(contentValues2);
                                contentValues.put("updated", Long.valueOf(System.currentTimeMillis()));
                                writableDatabase = plusChimeraContentProvider.f82604b.getWritableDatabase();
                                writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
                                try {
                                    if (writableDatabase.update("plus_profiles", contentValues, "accountName=? AND packageName=?", new String[]{b, str2}) != 0) {
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                    try {
                                        writableDatabase.endTransaction();
                                        acquireContentProviderClient2.release();
                                        bArr = safeParcelResponse.mo17878b().marshall();
                                    } catch (Throwable th) {
                                        th = th;
                                        acquireContentProviderClient2.release();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bArr2 = null;
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bArr2 = null;
                                acquireContentProviderClient2.release();
                                throw th;
                            }
                        } catch (VolleyError e3) {
                            e = e3;
                            throw e;
                        } catch (UserRecoverableAuthException e4) {
                        } catch (gid e5) {
                        } catch (Throwable th4) {
                            acquireContentProviderClient.release();
                            throw th4;
                        }
                        return;
                    } catch (IOException e6) {
                        anui anui2 = new anui(context2, clientContext3);
                        anui2.f77744a = 2;
                        connectionResult = aoaz.m65724a(context2, this.f78196c, 8, anui2.mo42290a());
                        if (!connectionResult.mo17671b()) {
                        }
                        String[] e22 = this.f78195b.mo17809e();
                        length = e22.length;
                        bArr2 = null;
                        i = 0;
                        while (true) {
                            if (i < length) {
                            }
                            i++;
                        }
                        ClientContext clientContext42 = this.f78195b;
                        anse anse2 = anru.f77553d;
                        ContentResolver contentResolver2 = context.getContentResolver();
                        String b32 = clientContext42.mo17802b();
                        String str32 = clientContext42.f30215e;
                        acquireContentProviderClient = contentResolver2.acquireContentProviderClient("com.google.android.gms.plus");
                        query = ((PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient)).f82604b.getReadableDatabase().query("plus_profiles", null, "accountName=? AND packageName=?", new String[]{b32, str32}, null, null, null);
                        acquireContentProviderClient.release();
                        if (query != null) {
                        }
                        SafeParcelResponse safeParcelResponse2 = (SafeParcelResponse) anse2.f77574a.mo42546a(clientContext42, "me", SafeParcelResponse.class, SafeParcelResponse.m22678a(PersonEntity.class));
                        String sio2 = ((PersonEntity) safeParcelResponse2.mo17872a(PersonEntity.CREATOR)).toString();
                        b = clientContext42.mo17802b();
                        ContentValues contentValues22 = new ContentValues(3);
                        contentValues22.put("accountName", b);
                        contentValues22.put("packageName", clientContext42.f30215e);
                        contentValues22.put("profileJson", sio2);
                        str2 = clientContext42.f30215e;
                        acquireContentProviderClient2 = contentResolver2.acquireContentProviderClient("com.google.android.gms.plus");
                        PlusChimeraContentProvider plusChimeraContentProvider2 = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient2);
                        contentValues = new ContentValues(contentValues22);
                        contentValues.put("updated", Long.valueOf(System.currentTimeMillis()));
                        writableDatabase = plusChimeraContentProvider2.f82604b.getWritableDatabase();
                        writableDatabase.beginTransactionWithListener(plusChimeraContentProvider2);
                        if (writableDatabase.update("plus_profiles", contentValues, "accountName=? AND packageName=?", new String[]{b, str2}) != 0) {
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        acquireContentProviderClient2.release();
                        bArr = safeParcelResponse2.mo17878b().marshall();
                        return;
                    } catch (gid e7) {
                        connectionResult = aoaz.m65723a(context2, this.f78195b, str.equals(clientContext3.mo17795a()), this.f78202i);
                        if (!connectionResult.mo17671b()) {
                        }
                        String[] e222 = this.f78195b.mo17809e();
                        length = e222.length;
                        bArr2 = null;
                        i = 0;
                        while (true) {
                            if (i < length) {
                            }
                            i++;
                        }
                        ClientContext clientContext422 = this.f78195b;
                        anse anse22 = anru.f77553d;
                        ContentResolver contentResolver22 = context.getContentResolver();
                        String b322 = clientContext422.mo17802b();
                        String str322 = clientContext422.f30215e;
                        acquireContentProviderClient = contentResolver22.acquireContentProviderClient("com.google.android.gms.plus");
                        query = ((PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient)).f82604b.getReadableDatabase().query("plus_profiles", null, "accountName=? AND packageName=?", new String[]{b322, str322}, null, null, null);
                        acquireContentProviderClient.release();
                        if (query != null) {
                        }
                        SafeParcelResponse safeParcelResponse22 = (SafeParcelResponse) anse22.f77574a.mo42546a(clientContext422, "me", SafeParcelResponse.class, SafeParcelResponse.m22678a(PersonEntity.class));
                        String sio22 = ((PersonEntity) safeParcelResponse22.mo17872a(PersonEntity.CREATOR)).toString();
                        b = clientContext422.mo17802b();
                        ContentValues contentValues222 = new ContentValues(3);
                        contentValues222.put("accountName", b);
                        contentValues222.put("packageName", clientContext422.f30215e);
                        contentValues222.put("profileJson", sio22);
                        str2 = clientContext422.f30215e;
                        acquireContentProviderClient2 = contentResolver22.acquireContentProviderClient("com.google.android.gms.plus");
                        PlusChimeraContentProvider plusChimeraContentProvider22 = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient2);
                        contentValues = new ContentValues(contentValues222);
                        contentValues.put("updated", Long.valueOf(System.currentTimeMillis()));
                        writableDatabase = plusChimeraContentProvider22.f82604b.getWritableDatabase();
                        writableDatabase.beginTransactionWithListener(plusChimeraContentProvider22);
                        if (writableDatabase.update("plus_profiles", contentValues, "accountName=? AND packageName=?", new String[]{b, str2}) != 0) {
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        acquireContentProviderClient2.release();
                        bArr = safeParcelResponse22.mo17878b().marshall();
                        return;
                    }
                } catch (UserRecoverableAuthException e8) {
                    e = e8;
                    clientContext = clientContext2;
                    str = "<<default account>>";
                    anui anui3 = new anui(context2, clientContext);
                    anui3.f77745b = e.mo7366a();
                    anui3.f77744a = 2;
                    if (str.equals(clientContext.mo17795a())) {
                    }
                    connectionResult = aoaz.m65724a(context2, this.f78196c, 6, anui3.mo42290a());
                    if (!connectionResult.mo17671b()) {
                    }
                    String[] e2222 = this.f78195b.mo17809e();
                    length = e2222.length;
                    bArr2 = null;
                    i = 0;
                    while (true) {
                        if (i < length) {
                        }
                        i++;
                    }
                    ClientContext clientContext4222 = this.f78195b;
                    anse anse222 = anru.f77553d;
                    ContentResolver contentResolver222 = context.getContentResolver();
                    String b3222 = clientContext4222.mo17802b();
                    String str3222 = clientContext4222.f30215e;
                    acquireContentProviderClient = contentResolver222.acquireContentProviderClient("com.google.android.gms.plus");
                    query = ((PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient)).f82604b.getReadableDatabase().query("plus_profiles", null, "accountName=? AND packageName=?", new String[]{b3222, str3222}, null, null, null);
                    acquireContentProviderClient.release();
                    if (query != null) {
                    }
                    SafeParcelResponse safeParcelResponse222 = (SafeParcelResponse) anse222.f77574a.mo42546a(clientContext4222, "me", SafeParcelResponse.class, SafeParcelResponse.m22678a(PersonEntity.class));
                    String sio222 = ((PersonEntity) safeParcelResponse222.mo17872a(PersonEntity.CREATOR)).toString();
                    b = clientContext4222.mo17802b();
                    ContentValues contentValues2222 = new ContentValues(3);
                    contentValues2222.put("accountName", b);
                    contentValues2222.put("packageName", clientContext4222.f30215e);
                    contentValues2222.put("profileJson", sio222);
                    str2 = clientContext4222.f30215e;
                    acquireContentProviderClient2 = contentResolver222.acquireContentProviderClient("com.google.android.gms.plus");
                    PlusChimeraContentProvider plusChimeraContentProvider222 = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient2);
                    contentValues = new ContentValues(contentValues2222);
                    contentValues.put("updated", Long.valueOf(System.currentTimeMillis()));
                    writableDatabase = plusChimeraContentProvider222.f82604b.getWritableDatabase();
                    writableDatabase.beginTransactionWithListener(plusChimeraContentProvider222);
                    if (writableDatabase.update("plus_profiles", contentValues, "accountName=? AND packageName=?", new String[]{b, str2}) != 0) {
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    acquireContentProviderClient2.release();
                    bArr = safeParcelResponse222.mo17878b().marshall();
                    return;
                } catch (IOException e9) {
                } catch (gid e10) {
                }
                if (!connectionResult.mo17671b()) {
                    m65804a(context2, connectionResult);
                    return;
                }
            } else if (!"<<default account>>".equals(this.f78195b.mo17795a())) {
                m65805a(context2, aoaz.m65724a(context2, this.f78196c, 5, (Intent) null), null, null);
                return;
            } else {
                m65805a(context2, aoaz.m65723a(context2, this.f78195b, true, this.f78202i), null, null);
                return;
            }
        }
        if (this.f78195b.f30212b != this.f78194a.f30212b && !rfz.m33557a(context).mo24610b(this.f78196c)) {
            String[] e22222 = this.f78195b.mo17809e();
            length = e22222.length;
            bArr2 = null;
            i = 0;
            while (true) {
                if (i < length) {
                    break;
                }
                String str4 = e22222[i];
                if ("profile".equals(str4) || "https://www.googleapis.com/auth/userinfo.profile".equals(str4) || "https://www.googleapis.com/auth/plus.me".equals(str4) || "https://www.googleapis.com/auth/plus.login".equals(str4)) {
                    ClientContext clientContext42222 = this.f78195b;
                } else {
                    i++;
                }
            }
            ClientContext clientContext422222 = this.f78195b;
            anse anse2222 = anru.f77553d;
            ContentResolver contentResolver2222 = context.getContentResolver();
            String b32222 = clientContext422222.mo17802b();
            String str32222 = clientContext422222.f30215e;
            acquireContentProviderClient = contentResolver2222.acquireContentProviderClient("com.google.android.gms.plus");
            query = ((PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient)).f82604b.getReadableDatabase().query("plus_profiles", null, "accountName=? AND packageName=?", new String[]{b32222, str32222}, null, null, null);
            acquireContentProviderClient.release();
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        long currentTimeMillis = System.currentTimeMillis() - query.getLong(query.getColumnIndex("updated"));
                        String string = query.getString(query.getColumnIndex("profileJson"));
                        if (currentTimeMillis <= 3600000 && currentTimeMillis > 0 && !TextUtils.isEmpty(string)) {
                            FieldMappingDictionary a2 = SafeParcelResponse.m22678a(PersonEntity.class);
                            SafeParcelResponse safeParcelResponse3 = new SafeParcelResponse(a2, a2.f30326c);
                            new sja().mo25626a(string, safeParcelResponse3);
                            byte[] marshall = safeParcelResponse3.mo17878b().marshall();
                            query.close();
                            bArr = marshall;
                            if (bArr != null && bArr.length == 0) {
                                return;
                            }
                            m65805a(context2, ConnectionResult.f30063a, PlusChimeraService.m68556a(this.f78199f, context2, this.f78194a, this.f78195b, new aoav()), bArr);
                        }
                    }
                } catch (siy e11) {
                    if (Log.isLoggable("PlusV1Agent", 6)) {
                        Log.e("PlusV1Agent", "Unable to parse the cached profile data", e11);
                    }
                } catch (Throwable th5) {
                    query.close();
                    throw th5;
                }
                query.close();
            }
            SafeParcelResponse safeParcelResponse2222 = (SafeParcelResponse) anse2222.f77574a.mo42546a(clientContext422222, "me", SafeParcelResponse.class, SafeParcelResponse.m22678a(PersonEntity.class));
            String sio2222 = ((PersonEntity) safeParcelResponse2222.mo17872a(PersonEntity.CREATOR)).toString();
            b = clientContext422222.mo17802b();
            ContentValues contentValues22222 = new ContentValues(3);
            contentValues22222.put("accountName", b);
            contentValues22222.put("packageName", clientContext422222.f30215e);
            contentValues22222.put("profileJson", sio2222);
            str2 = clientContext422222.f30215e;
            acquireContentProviderClient2 = contentResolver2222.acquireContentProviderClient("com.google.android.gms.plus");
            PlusChimeraContentProvider plusChimeraContentProvider2222 = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient2);
            contentValues = new ContentValues(contentValues22222);
            contentValues.put("updated", Long.valueOf(System.currentTimeMillis()));
            writableDatabase = plusChimeraContentProvider2222.f82604b.getWritableDatabase();
            writableDatabase.beginTransactionWithListener(plusChimeraContentProvider2222);
            if (writableDatabase.update("plus_profiles", contentValues, "accountName=? AND packageName=?", new String[]{b, str2}) != 0) {
                bArr2 = null;
                try {
                    writableDatabase.insert("plus_profiles", null, contentValues);
                } catch (Throwable th6) {
                    th = th6;
                    writableDatabase.endTransaction();
                    throw th;
                }
            } else {
                bArr2 = null;
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            acquireContentProviderClient2.release();
            bArr = safeParcelResponse2222.mo17878b().marshall();
            return;
        }
        bArr = null;
        m65805a(context2, ConnectionResult.f30063a, PlusChimeraService.m68556a(this.f78199f, context2, this.f78194a, this.f78195b, new aoav()), bArr);
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        this.f78198e.mo16678a(8, (IBinder) null, (Bundle) null);
    }
}
