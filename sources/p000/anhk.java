package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;

/* renamed from: anhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhk extends angu {

    /* renamed from: a */
    private final angj f76877a;

    /* renamed from: b */
    private final anhl f76878b;

    public anhk(angj angj, String str, String str2, int i, String str3) {
        super("GetFlagOperationCall", caif.GET_FLAG);
        sdo.m34959a(angj);
        this.f76877a = angj;
        this.f76878b = new anhl(str, str2, i, str3);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhl anhl = this.f76878b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhl.f76879a;
        if (str != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            str.getClass();
            cahp.f174574a |= 1;
            cahp.f174575b = str;
        }
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r3 != null) goto L_0x008e;
     */
    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        anhl anhl = this.f76878b;
        if (anhl.f76879a == null) {
            throw new anfy(29500, "No package name");
        } else if (anhl.f76880b != null) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            anfw.m64180a(writableDatabase);
            try {
                anhl.f76879a = angb.m64192a(anhl.f76879a, anhl.f76882d);
                if (anhb.m64373a(writableDatabase, anhl.f76879a)) {
                    query = writableDatabase.query("FlagOverrides", anfq.f76775b, "packageName = ? AND name = ? AND flagType = ? AND committed = 1", new String[]{anhl.f76879a, anhl.f76880b, Integer.toString(anhl.f76881c)}, null, null, null);
                    Flag flag = null;
                    if (query.moveToFirst()) {
                        flag = anhe.m64382a(query);
                        if (query != null) {
                            query.close();
                        }
                    } else {
                        if (query != null) {
                            query.close();
                        }
                        query2 = writableDatabase.query("Flags", anfq.f76775b, "packageName = ? AND name = ? AND flagType = ? AND committed = 1", new String[]{anhl.f76879a, anhl.f76880b, Integer.toString(anhl.f76881c)}, null, null, null);
                        if (query2.moveToFirst()) {
                            flag = anhe.m64382a(query2);
                        } else if (query2 != null) {
                        }
                        query2.close();
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    this.f76877a.mo41788a(Status.f30107a, flag);
                    return;
                }
                throw new anfy(29503);
            } catch (Throwable th3) {
                writableDatabase.endTransaction();
                throw th3;
            }
        } else {
            throw new anfy(29500, "No flag name");
        }
        throw th2;
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76877a.mo41788a(status, (Flag) null);
    }
}
