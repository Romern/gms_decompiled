package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: axul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axul implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axuk f96395a;

    /* renamed from: b */
    final /* synthetic */ ayev f96396b;

    /* renamed from: c */
    final /* synthetic */ axyt f96397c;

    /* renamed from: d */
    final /* synthetic */ axuo f96398d;

    public axul(axuo axuo, axuk axuk, ayev ayev, axyt axyt) {
        this.f96398d = axuo;
        this.f96395a = axuk;
        this.f96396b = ayev;
        this.f96397c = axyt;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, axue[]):axxu
     arg types: [android.database.sqlite.SQLiteDatabase, java.lang.String, int, axue[]]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[], java.lang.String):java.util.Map
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String):void
      axxv.a(axue, java.lang.String, java.lang.String, boolean):void
      axxv.a(axxi, int, boolean, java.lang.String):boolean
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, axue[]):axxu */
    public final void run() {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase writableDatabase2;
        axuo axuo = this.f96398d;
        axuk axuk = this.f96395a;
        ayfb ayfb = this.f96396b.f97379b;
        if (ayfb == null) {
            ayfb = ayfb.f97441e;
        }
        axyt axyt = this.f96397c;
        ayeb ayeb = ayfb.f97445c;
        if (ayeb == null) {
            ayeb = ayeb.f97275b;
        }
        int size = ayeb.f97277a.size();
        axue[] axueArr = new axue[size];
        for (int i = 0; i < size; i++) {
            ayeb ayeb2 = ayfb.f97445c;
            if (ayeb2 == null) {
                ayeb2 = ayeb.f97275b;
            }
            String str = ((ayec) ayeb2.f97277a.get(i)).f97282b;
            ayeb ayeb3 = ayfb.f97445c;
            if (ayeb3 == null) {
                ayeb3 = ayeb.f97275b;
            }
            axueArr[i] = axue.m83239a(str, ((ayec) ayeb3.f97277a.get(i)).f97283c);
        }
        if (axyt == null) {
            axxv axxv = axuo.f96404a;
            String str2 = ayfb.f97444b;
            try {
                writableDatabase2 = axxv.f96695c.getWritableDatabase();
                writableDatabase2.beginTransaction();
                axxu a = axxv.m83492a(writableDatabase2, str2, false, axueArr);
                writableDatabase2.setTransactionSuccessful();
                writableDatabase2.endTransaction();
                axxv.mo53739a(a.f96687a);
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(str2);
                Log.w("DataItems", valueOf.length() == 0 ? new String("Failed to add asset: ") : "Failed to add asset: ".concat(valueOf), e);
            } catch (Throwable th) {
                writableDatabase2.endTransaction();
                throw th;
            }
        } else if (!ayfb.f97444b.equals(axyt.f96801a)) {
            Log.w("assets", String.format("SetAsset message has digest differing than the actual digest of the file: %s vs %s (Ignoring)", ayfb.f97444b, axyt.f96801a));
            return;
        } else {
            try {
                axxv axxv2 = axuo.f96404a;
                File file = axyt.f96802b;
                String str3 = axyt.f96801a;
                writableDatabase = axxv2.f96695c.getWritableDatabase();
                writableDatabase.beginTransaction();
                axxv2.f96696d.mo53581a(str3, file);
                axxu a2 = axxv.m83492a(writableDatabase, str3, true, axueArr);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                axxv2.mo53739a(a2.f96687a);
            } catch (IOException e2) {
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        }
        axuo.f96405b.remove(ayfb.f97444b);
        bxvd da = ayev.f97376n.mo74144da();
        bxvd da2 = ayea.f97270c.mo74144da();
        String str4 = ayfb.f97444b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ayea ayea = (ayea) da2.f164949b;
        str4.getClass();
        ayea.f97272a = 1 | ayea.f97272a;
        ayea.f97273b = str4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayev ayev = (ayev) da.f164949b;
        ayea ayea2 = (ayea) da2.mo74062i();
        ayea2.getClass();
        ayev.f97380c = ayea2;
        ayev.f97378a |= 2;
        ayev ayev2 = (ayev) da.mo74062i();
        if (Log.isLoggable("assets", 3)) {
            String valueOf2 = String.valueOf(ayfb.f97444b);
            Log.d("assets", valueOf2.length() == 0 ? new String("Sending AckAsset message for ") : "Sending AckAsset message for ".concat(valueOf2));
        }
        axuk.mo53582a(ayev2, null);
    }
}
