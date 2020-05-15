package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;

/* renamed from: anig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anig extends angu {

    /* renamed from: a */
    private final angj f76939a;

    /* renamed from: b */
    private final anih f76940b;

    public anig(angj angj, String str, String str2) {
        super("UnregisterOperationCall", caif.UNREGISTER);
        sdo.m34959a(angj);
        this.f76939a = angj;
        this.f76940b = new anih(str, str2);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anih anih = this.f76940b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anih.f76941a;
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

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        anih anih = this.f76940b;
        if (anih.f76941a != null) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            anfw.m64180a(writableDatabase);
            try {
                anih.f76941a = angb.m64192a(anih.f76941a, anih.f76942b);
                anih.m64471a(writableDatabase, anih.f76941a);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                this.f76939a.mo41794d(Status.f30107a);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } else {
            throw new anfy(29500, "No package name");
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76939a.mo41794d(status);
    }
}
