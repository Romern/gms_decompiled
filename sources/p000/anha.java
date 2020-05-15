package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;

/* renamed from: anha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anha extends angu {

    /* renamed from: a */
    private final angj f76841a;

    /* renamed from: b */
    private final anhb f76842b;

    /* renamed from: c */
    private final String f76843c;

    public anha(angj angj, String str, String str2) {
        super("GetCommittedConfigurationOperationCall", caif.GET_COMMITTED_CONFIGURATION);
        sdo.m34959a(angj);
        this.f76841a = angj;
        this.f76842b = new anhb(str, str2);
        this.f76843c = str;
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhb anhb = this.f76842b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhb.f76844a;
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

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        Configurations configurations;
        String str;
        Cursor query;
        Throwable th;
        Context context2 = context;
        anfw anfw2 = anfw;
        try {
            anhb anhb = this.f76842b;
            if (anhb.f76844a != null) {
                SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
                anfw.m64180a(writableDatabase);
                try {
                    anhb.f76844a = angb.m64192a(anhb.f76844a, anhb.f76845b);
                    if ("all".equals(anhb.f76844a)) {
                        query = writableDatabase.query("Packages", new String[]{"packageName", "version", "androidPackageName"}, null, null, null, null, null);
                        ArrayList arrayList = new ArrayList();
                        while (query.moveToNext()) {
                            braf braf = (braf) braj.f142139l.mo74144da();
                            String string = query.getString(0);
                            if (braf.f164950c) {
                                braf.mo74035c();
                                braf.f164950c = false;
                            }
                            braj braj = (braj) braf.f164949b;
                            string.getClass();
                            braj.f142141a |= 1;
                            braj.f142144d = string;
                            int i = query.getInt(1);
                            if (braf.f164950c) {
                                braf.mo74035c();
                                braf.f164950c = false;
                            }
                            braj braj2 = (braj) braf.f164949b;
                            braj2.f142141a |= 2;
                            braj2.f142145e = i;
                            String string2 = query.getString(2);
                            if (braf.f164950c) {
                                braf.mo74035c();
                                braf.f164950c = false;
                            }
                            braj braj3 = (braj) braf.f164949b;
                            string2.getClass();
                            braj3.f142142b = 7;
                            braj3.f142143c = string2;
                            braj braj4 = (braj) braf.mo74062i();
                            arrayList.add(new Flag(braj4.f142144d, braj4.serializeToBytes(), 0));
                        }
                        configurations = new Configurations("", "", new Configuration[]{new Configuration(0, (Flag[]) arrayList.toArray(new Flag[0]), new String[0])}, false, null, 0);
                        if (query != null) {
                            query.close();
                        }
                    } else if (anhb.m64373a(writableDatabase, anhb.f76844a)) {
                        configurations = anhb.m64374b(writableDatabase, anhb.f76844a);
                    } else {
                        throw new anfy(29503);
                    }
                } catch (anfx e) {
                    if (e.f76790a == 29512) {
                        Pair a = anfl.m64159a(writableDatabase, anhb.f76844a);
                        String str2 = anhb.f76844a;
                        if (a != null) {
                            str = (String) a.first;
                        } else {
                            str = "";
                        }
                        configurations = new anhe(str2, str, null, anhb.f76844a, anhb.f76845b).mo41834a(context2, anfw2);
                        new angx(configurations.f82074a, anhb.f76845b).mo41832a(context2, anfw2);
                    } else {
                        throw e;
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                this.f76841a.mo41792b(Status.f30107a, configurations);
                return;
            }
            throw new anfy(29500, "No package name");
            throw th;
        } catch (anfx e2) {
            if (e2.f76790a == 29512 && anhs.m64428a(this.f76843c, 21)) {
                anij.m64478a(context2, 21, this.f76843c);
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76841a.mo41792b(status, (Configurations) null);
    }
}
