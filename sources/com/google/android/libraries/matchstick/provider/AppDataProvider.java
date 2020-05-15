package com.google.android.libraries.matchstick.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppDataProvider extends ContentProvider {

    /* renamed from: a */
    private final UriMatcher f111129a = new UriMatcher(-1);

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete not supported.");
    }

    public final String getType(Uri uri) {
        int match = this.f111129a.match(uri);
        if (match == 0) {
            return "vnd.android.cursor.dir/google.internal.communications.instantmessaging.v1.nano.Tachyon.InboxMessage";
        }
        if (match != 1) {
            return null;
        }
        return "vnd.android.cursor.dir/vnd.google.android.libraries.matchstick.message_id";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert not supported.");
    }

    public final boolean onCreate() {
        this.f111129a.addURI("com.google.android.gms.matchstick.appdataprovider", "messages/*/*", 0);
        this.f111129a.addURI("com.google.android.gms.matchstick.appdataprovider", "install_context/*/*", 1);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0572  */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        azph azph;
        ArrayList arrayList;
        int i;
        cbkj cbkj;
        int i2;
        int i3;
        cbma cbma;
        cbbt cbbt;
        cbir cbir;
        boolean z;
        bxtx bxtx;
        cbin cbin;
        bxtx bxtx2;
        cbin cbin2;
        cbin cbin3;
        bxtx bxtx3;
        cbin cbin4;
        cbma a;
        List a2;
        Uri uri2 = uri;
        int match = this.f111129a.match(uri2);
        MatrixCursor matrixCursor = null;
        if (match != 0 && match != 1) {
            return null;
        }
        String str5 = uri.getPathSegments().get(1);
        if (TextUtils.isEmpty(str5)) {
            return null;
        }
        if (!"com.google.android.apps.fireball".equalsIgnoreCase(str5)) {
            return null;
        }
        Context applicationContext = getContext().getApplicationContext();
        azph a3 = azph.m85998a(applicationContext);
        String str6 = "FB";
        a3.mo55147a(422, str6);
        a3.mo55147a(431, str6);
        bmxy.m108588a(!TextUtils.isEmpty(str5));
        boolean z2 = false;
        if (!rfz.m33557a(applicationContext).mo24608b(Binder.getCallingUid())) {
            azoj.m85933c("AppData", "Calling app is not allowed to access uri: %s", uri2);
            a3.mo55147a(430, str6);
            a3.mo55147a(424, str6);
            return null;
        } else if (!TextUtils.equals(uri.getPathSegments().get(2), azdl.m85412a(applicationContext).mo54738a())) {
            a3.mo55147a(428, str6);
            a3.mo55147a(424, str6);
            return null;
        } else {
            SQLiteDatabase readableDatabase = azcl.m85289a(applicationContext).getReadableDatabase();
            if (match == 1) {
                a3.mo55147a(423, str6);
                String d = azcd.m85252a(applicationContext).mo54612d(str5);
                if (!(TextUtils.isEmpty(d) || (a2 = azcm.m85300a(applicationContext).mo54646a(d, 5)) == null || a2.size() == 0)) {
                    matrixCursor = new MatrixCursor(azib.f99460b, a2.size());
                    int size = a2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        matrixCursor.addRow(new Object[]{(String) a2.get(i4)});
                    }
                    Object[] objArr = {Integer.valueOf(a2.size()), d};
                }
                return matrixCursor;
            }
            azcm a4 = azcm.m85300a(getContext());
            long currentTimeMillis = System.currentTimeMillis() - cfeo.m138894y();
            Cursor a5 = a4.mo54638a(currentTimeMillis);
            ArrayList arrayList2 = new ArrayList();
            if (a5 != null) {
                if (a5.moveToFirst()) {
                    while (true) {
                        azdb a6 = azdb.m85385a(a5);
                        azdd a7 = a6.mo54711a();
                        aznz a8 = aznz.m85891a(a7.mo54714c());
                        if (a8 == null) {
                            str3 = str6;
                        } else if (a8.mo55108f()) {
                            str3 = str6;
                            byte[] b = a4.mo54659b(a7.f99045a);
                            new Object[1][0] = Arrays.toString(b);
                            if (azpi.m86080b(b)) {
                                arrayList2.add(a7);
                            } else {
                                a6.f99038l = b;
                                arrayList2.add(a6.mo54711a());
                            }
                        } else {
                            str3 = str6;
                        }
                        if (!a5.moveToNext()) {
                            break;
                        }
                        str6 = str3;
                    }
                } else {
                    str3 = str6;
                }
                a5.close();
                Object[] objArr2 = {Long.valueOf(currentTimeMillis), Integer.valueOf(arrayList2.size())};
            } else {
                str3 = str6;
            }
            MatrixCursor matrixCursor2 = new MatrixCursor(azib.f99459a, arrayList2.size());
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                azdd azdd = (azdd) arrayList2.get(i5);
                String str7 = str3;
                if (str7.equals(azdd.f99055k.f99775b)) {
                    bxvd da = cbkj.f177405k.mo74144da();
                    String str8 = azdd.f99046b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z2;
                    }
                    cbkj cbkj2 = (cbkj) da.f164949b;
                    str8.getClass();
                    cbkj2.f177409c = str8;
                    cbkj2.f177416j = cbkh.m127935a(2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z2;
                    }
                    ((cbkj) da.f164949b).f177410d = cbki.m127937a(4);
                    if (azdd.f99057m != -2) {
                        bxvd da2 = cbma.f177591f.mo74144da();
                        String str9 = azdd.f99047c;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z2;
                        }
                        str9.getClass();
                        ((cbma) da2.f164949b).f177594b = str9;
                        int b2 = LocalEntityId.m94550b(azdd.f99048d);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z2;
                        }
                        ((cbma) da2.f164949b).f177593a = cipg.m150690a(b2);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z2;
                        }
                        str7.getClass();
                        ((cbma) da2.f164949b).f177595c = str7;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z2;
                        }
                        cbma cbma2 = (cbma) da2.mo74062i();
                        cbma2.getClass();
                        ((cbkj) da.f164949b).f177413g = cbma2;
                    } else {
                        cbma a9 = azfn.m85574a(azdl.m85412a(applicationContext).mo54738a(), cfeo.m138878i());
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z2;
                        }
                        a9.getClass();
                        ((cbkj) da.f164949b).f177413g = a9;
                    }
                    long j = azdd.f99054j;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z2;
                    }
                    ((cbkj) da.f164949b).f177412f = j;
                    bxvd da3 = cbbn.f176594c.mo74144da();
                    if (azdd.f99055k.mo55104b() && (a = azdd.f99055k.mo55103a()) != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z2;
                        }
                        a.getClass();
                        ((cbkj) da.f164949b).f177415i = a;
                    }
                    if (!azpi.m86080b(azdd.f99059o)) {
                        bxte bxte = (bxte) azol.m85935a((bxxk) bxte.f164763c.mo74142c(7), azdd.f99059o);
                        if (bxte == null || !bxte.f164765a.contains("FireballMessage")) {
                            azoj.m85933c("Message", "Failed to parse export data as any", new Object[0]);
                            i = size2;
                            arrayList = arrayList2;
                            azph = a3;
                            str4 = str7;
                            cbkj = null;
                        } else {
                            bxtx bxtx4 = bxte.f164766b;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxtx4.getClass();
                            ((cbkj) da.f164949b).f177411e = bxtx4;
                            cbkj = (cbkj) da.mo74062i();
                            i = size2;
                            arrayList = arrayList2;
                            azph = a3;
                            str4 = str7;
                        }
                    } else {
                        if (azoy.m85984a(azdd.f99052h)) {
                            String a10 = azpi.m86066a(azdd.f99050f);
                            bxvd da4 = cbbt.f176613d.mo74144da();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            ((cbbt) da4.f164949b).f176617c = cbbs.m127708a(5);
                            bxvd da5 = cbbx.f176625b.mo74144da();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            a10.getClass();
                            ((cbbx) da5.f164949b).f176627a = a10;
                            cbbx cbbx = (cbbx) da5.mo74062i();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            cbbt cbbt2 = (cbbt) da4.f164949b;
                            cbbx.getClass();
                            cbbt2.f176616b = cbbx;
                            cbbt2.f176615a = 3;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            cbbn cbbn = (cbbn) da3.f164949b;
                            cbbt cbbt3 = (cbbt) da4.mo74062i();
                            cbbt3.getClass();
                            cbbn.mo75224c();
                            cbbn.f176596a.add(cbbt3);
                            i = size2;
                            arrayList = arrayList2;
                            azph = a3;
                            str4 = str7;
                        } else if (azoy.m85996l(azdd.f99051g)) {
                            cbil cbil = (cbil) azol.m85935a((bxxk) cbil.f177257h.mo74142c(7), azdd.f99050f);
                            if (cbil == null || cbil.f177259a != 2) {
                                i = size2;
                                arrayList = arrayList2;
                                azph = a3;
                                str4 = str7;
                            } else {
                                cbin cbin5 = (cbin) cbil.f177260b;
                                if (cbin5.f177275d != null) {
                                    i = size2;
                                    if (cbin5.f177272a == 5) {
                                        bxtx = (bxtx) cbin5.f177273b;
                                    } else {
                                        bxtx = bxtx.f164797b;
                                    }
                                    if (!bxtx.mo73779j()) {
                                        bxvd da6 = cbbt.f176613d.mo74144da();
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        ((cbbt) da6.f164949b).f176617c = cbbs.m127708a(6);
                                        bxvd da7 = cbbq.f176602h.mo74144da();
                                        arrayList = arrayList2;
                                        bxxk bxxk = (bxxk) cbmf.f177611d.mo74142c(7);
                                        azph = a3;
                                        if (cbil.f177259a == 2) {
                                            cbin = (cbin) cbil.f177260b;
                                        } else {
                                            cbin = cbin.f177270f;
                                        }
                                        str4 = str7;
                                        if (cbin.f177272a == 5) {
                                            bxtx2 = (bxtx) cbin.f177273b;
                                        } else {
                                            bxtx2 = bxtx.f164797b;
                                        }
                                        cbmf cbmf = (cbmf) azol.m85935a(bxxk, bxtx2.mo73780k());
                                        if (da7.f164950c) {
                                            da7.mo74035c();
                                            da7.f164950c = false;
                                        }
                                        cbbq cbbq = (cbbq) da7.f164949b;
                                        cbmf.getClass();
                                        cbbq.f176605b = cbmf;
                                        cbbq.f176604a = 50;
                                        cbbq.f176610g = 1;
                                        if (cbil.f177259a != 2) {
                                            cbin2 = cbin.f177270f;
                                        } else {
                                            cbin2 = (cbin) cbil.f177260b;
                                        }
                                        String str10 = cbin2.f177274c;
                                        if (da7.f164950c) {
                                            da7.mo74035c();
                                            da7.f164950c = false;
                                        }
                                        str10.getClass();
                                        ((cbbq) da7.f164949b).f176606c = str10;
                                        if (cbil.f177259a != 2) {
                                            cbin3 = cbin.f177270f;
                                        } else {
                                            cbin3 = (cbin) cbil.f177260b;
                                        }
                                        cbio cbio = cbin3.f177275d;
                                        if (cbio == null) {
                                            cbio = cbio.f177277c;
                                        }
                                        cbhy cbhy = cbio.f177279a;
                                        if (cbhy == null) {
                                            cbhy = cbhy.f177214d;
                                        }
                                        if (cbhy.f177216a == 1) {
                                            bxtx3 = (bxtx) cbhy.f177217b;
                                        } else {
                                            bxtx3 = bxtx.f164797b;
                                        }
                                        if (da7.f164950c) {
                                            da7.mo74035c();
                                            da7.f164950c = false;
                                        }
                                        bxtx3.getClass();
                                        ((cbbq) da7.f164949b).f176608e = bxtx3;
                                        if (cbil.f177259a != 2) {
                                            cbin4 = cbin.f177270f;
                                        } else {
                                            cbin4 = (cbin) cbil.f177260b;
                                        }
                                        cbio cbio2 = cbin4.f177275d;
                                        if (cbio2 == null) {
                                            cbio2 = cbio.f177277c;
                                        }
                                        int i6 = cbio2.f177280b;
                                        if (da7.f164950c) {
                                            da7.mo74035c();
                                            da7.f164950c = false;
                                        }
                                        ((cbbq) da7.f164949b).f176607d = i6;
                                        cbbq cbbq2 = (cbbq) da7.mo74062i();
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        cbbt cbbt4 = (cbbt) da6.f164949b;
                                        cbbq2.getClass();
                                        cbbt4.f176616b = cbbq2;
                                        cbbt4.f176615a = 4;
                                        cbbt = (cbbt) da6.mo74062i();
                                    } else {
                                        arrayList = arrayList2;
                                        azph = a3;
                                        str4 = str7;
                                        cbbt = null;
                                    }
                                    if (cbbt == null) {
                                        azoj.m85933c("Message", "Failed to parse MS media message", new Object[0]);
                                        cbkj = null;
                                    } else {
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        cbbn cbbn2 = (cbbn) da3.f164949b;
                                        cbbt.getClass();
                                        cbbn2.mo75224c();
                                        cbbn2.f176596a.add(cbbt);
                                    }
                                } else {
                                    i = size2;
                                    arrayList = arrayList2;
                                    azph = a3;
                                    str4 = str7;
                                }
                            }
                            if (cbil == null || cbil.f177259a != 5) {
                                cbbt = null;
                                if (cbbt == null) {
                                }
                            } else {
                                bxvd da8 = cbbt.f176613d.mo74144da();
                                if (da8.f164950c) {
                                    da8.mo74035c();
                                    da8.f164950c = false;
                                }
                                ((cbbt) da8.f164949b).f176617c = cbbs.m127708a(7);
                                bxvd da9 = cbca.f176632e.mo74144da();
                                if (cbil.f177259a != 5) {
                                    cbir = cbir.f177290b;
                                } else {
                                    cbir = (cbir) cbil.f177260b;
                                }
                                String str11 = cbir.f177292a;
                                if (!da9.f164950c) {
                                    z = false;
                                } else {
                                    da9.mo74035c();
                                    z = false;
                                    da9.f164950c = false;
                                }
                                cbca cbca = (cbca) da9.f164949b;
                                str11.getClass();
                                cbca.f176634a = str11;
                                cbca.f176636c = z ? 1 : 0;
                                "0".getClass();
                                cbca.f176635b = "0";
                                cbca.f176637d = z;
                                cbca cbca2 = (cbca) da9.mo74062i();
                                if (da8.f164950c) {
                                    da8.mo74035c();
                                    da8.f164950c = z;
                                }
                                cbbt cbbt5 = (cbbt) da8.f164949b;
                                cbca2.getClass();
                                cbbt5.f176616b = cbca2;
                                cbbt5.f176615a = 5;
                                cbbt = (cbbt) da8.mo74062i();
                                if (cbbt == null) {
                                }
                            }
                        } else {
                            i = size2;
                            arrayList = arrayList2;
                            azph = a3;
                            str4 = str7;
                            azoj.m85933c("Message", "toInboxString not supported for content type:%s", azdd.f99051g);
                            cbkj = null;
                        }
                        bxtx aL = ((cbbn) da3.mo74062i()).mo73639aL();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aL.getClass();
                        ((cbkj) da.f164949b).f177411e = aL;
                        cbkj = (cbkj) da.mo74062i();
                    }
                } else {
                    i = size2;
                    arrayList = arrayList2;
                    azph = a3;
                    str4 = str7;
                    cbkj = null;
                }
                if (cbkj != null) {
                    byte[] k = cbkj.mo73642k();
                    int i7 = azdd.f99056l;
                    if (i7 < 30) {
                        i3 = 2;
                        i2 = 0;
                    } else if (i7 <= 39) {
                        aznz a11 = aznz.m85891a(azdd.mo54714c());
                        if (a11 != null) {
                            cbma = a11.mo55103a();
                        } else {
                            cbma = null;
                        }
                        byte[] k2 = cbma.mo73642k();
                        if (k2 != null) {
                            matrixCursor2.addRow(new Object[]{k, k2});
                        }
                    } else {
                        i3 = 2;
                        i2 = 0;
                    }
                    Object[] objArr3 = new Object[i3];
                    objArr3[i2] = k;
                    objArr3[1] = new byte[i2];
                    matrixCursor2.addRow(objArr3);
                } else {
                    azoj.m85933c("AppData", "Failed to convert to InboxMessage", new Object[0]);
                }
                if (cfeo.f183719a.mo6606a().mo80919F()) {
                    readableDatabase.beginTransaction();
                    try {
                        readableDatabase.delete("messages", "message_id = ?", new String[]{azdd.f99046b});
                    } finally {
                        readableDatabase.setTransactionSuccessful();
                        readableDatabase.endTransaction();
                    }
                }
                i5++;
                size2 = i;
                arrayList2 = arrayList;
                a3 = azph;
                str3 = str4;
                z2 = false;
            }
            azcm.m85300a(applicationContext).mo54660c();
            azph azph2 = a3;
            String str12 = str3;
            azph2.mo55147a(423, str12);
            if (matrixCursor2.getCount() == 0) {
                azph2.mo55147a(429, str12);
            }
            return matrixCursor2;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update not supported.");
    }
}
