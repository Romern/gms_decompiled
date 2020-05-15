package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhe extends azhc {

    /* renamed from: b */
    private final LocalEntityId f99347b;

    /* renamed from: c */
    private final azfo f99348c;

    /* renamed from: d */
    private final azcv f99349d;

    /* renamed from: e */
    private final Intent f99350e;

    /* renamed from: f */
    private SQLiteDatabase f99351f;

    /* renamed from: g */
    private final LocalEntityId f99352g;

    /* renamed from: h */
    private azcs f99353h;

    public azhe(Context context, azfx azfx, azfo azfo, azcv azcv, Intent intent, azcl azcl, LocalEntityId localEntityId, LocalEntityId localEntityId2) {
        super(context, azfx, "Block entity");
        this.f99350e = intent;
        this.f99349d = azcv;
        this.f99352g = localEntityId2;
        try {
            this.f99351f = azcl.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f99351f = null;
        }
        this.f99347b = localEntityId;
        this.f99348c = azfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076 A[SYNTHETIC, Splitter:B:28:0x0076] */
    /* renamed from: c */
    private final void m85684c() {
        Cursor cursor;
        int size;
        azdj a = azdj.m85399a(this.f99339a);
        LocalEntityId localEntityId = this.f99347b;
        SQLiteDatabase readableDatabase = a.f99085a.getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            cursor = azdj.m85397a(readableDatabase, localEntityId, new String[]{"_id"});
            long j = -1;
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        j = cursor.getLong(0);
                        cursor.close();
                        List b = a.mo54723b(j);
                        readableDatabase.setTransactionSuccessful();
                        readableDatabase.endTransaction();
                        size = b.size();
                        for (int i = 0; i < size; i++) {
                            aznz a2 = aznz.m85891a((String) b.get(i));
                            if (a2 != null && a2.mo55105c()) {
                                DatabaseProvider.m94531a(this.f99339a.getContentResolver(), a2.f99774a, true);
                                azan.m85141a(this.f99339a).mo54541b(a2.f99774a);
                            }
                        }
                    }
                } catch (Throwable th) {
                    readableDatabase.setTransactionSuccessful();
                    readableDatabase.endTransaction();
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            List b2 = a.mo54723b(j);
            readableDatabase.setTransactionSuccessful();
            readableDatabase.endTransaction();
            size = b2.size();
            while (i < size) {
            }
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
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbgx cbgx = (cbgx) obj;
        afiz afiz = (afiz) azht.m85748a(this.f99339a).mo54933a(2);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(2, this.f99352g);
        if (afiz.f64274f == null) {
            afiz.f64274f = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.MatchstickAbuse/BlockEntity", ciie.m150370a(cbgx.f177097c), ciie.m150370a(cbgy.f177101a));
        }
        cbgy cbgy = (cbgy) afiz.f64277a.mo25553a(afiz.f64274f, a, cbgx, (long) afiz.f64270b, TimeUnit.MILLISECONDS);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        byte[] bArr = null;
        if (this.f99351f == null) {
            return null;
        }
        azdj.m85399a(this.f99339a).mo54719a(this.f99347b, 2);
        azcs a = this.f99349d.mo54689a(this.f99352g);
        this.f99353h = a;
        if (a != null) {
            bArr = a.f99002a;
        }
        LocalEntityId localEntityId = this.f99347b;
        bxvd da = cbgx.f177097c.mo74144da();
        cbmo a2 = azfn.m85575a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cbgx) da.f164949b).f177099a = a2;
        cbhu a3 = localEntityId.mo60370a();
        if (a3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a3.getClass();
            ((cbgx) da.f164949b).f177100b = a3;
        }
        cbgx cbgx = (cbgx) da.mo74062i();
        new Object[1][0] = cbgx;
        return cbgx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbgx cbgx = (cbgx) obj;
        azoj.m85931a("BlockEntityHandler", exc, "Error sending rpc", new Object[0]);
        azph.m85998a(this.f99339a).mo55156a(127, exc, this.f99347b.f111076c);
        azho.m85727a(this.f99339a, this.f99348c, exc, this.f99350e, this.f99352g, this.f99353h);
        m85684c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbgx cbgx = (cbgx) obj;
        Void voidR = (Void) obj2;
        new Object[1][0] = this.f99347b.f111074a;
        azdj.m85399a(this.f99339a).mo54719a(this.f99347b, 1);
        m85684c();
    }
}
