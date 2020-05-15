package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: anhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhy {
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
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03d7 A[LOOP:2: B:179:0x03cf->B:181:0x03d7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03fa A[LOOP:3: B:183:0x03f4->B:185:0x03fa, LOOP_END] */
    /* renamed from: a */
    public static anhx m64441a(Context context, SQLiteDatabase sQLiteDatabase, braj braj, String str) {
        String str2;
        braj braj2;
        String str3;
        Throwable th;
        Throwable th2;
        int i;
        int i2;
        HashSet hashSet;
        String str4;
        int i3;
        Set set;
        bnrd a;
        bnrd a2;
        String str5;
        byte[] bArr;
        String str6;
        Throwable th3;
        boolean z;
        boolean z2;
        byte[] bArr2;
        int i4;
        boolean z3;
        boolean z4;
        byte[] bArr3;
        byte[] bArr4;
        String str7;
        boolean z5;
        int i5;
        byte[] bArr5;
        Throwable th4;
        Throwable th5;
        String str8;
        boolean z6;
        boolean z7;
        Throwable th6;
        byte[] blob;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        braj braj3 = braj;
        m64445a(braj);
        String str9 = braj3.f142144d;
        if (braj3.f142142b == 7) {
            str2 = (String) braj3.f142143c;
        } else {
            str2 = "";
        }
        String a3 = angb.m64192a(str9, str2);
        if (!a3.equals(str9)) {
            anih.m64472b(sQLiteDatabase2, str9);
            anhj.m64401a();
        }
        if (braj3.f142144d.equals(a3)) {
            braj2 = braj3;
        } else {
            braf braf = (braf) braj.f142139l.mo74141a(braj3);
            if (braf.f164950c) {
                braf.mo74035c();
                braf.f164950c = false;
            }
            braj braj4 = (braj) braf.f164949b;
            a3.getClass();
            braj4.f142141a |= 1;
            braj4.f142144d = a3;
            braj2 = (braj) braf.mo74062i();
        }
        String str10 = braj2.f142144d;
        if (braj2.f142142b == 7) {
            str3 = (String) braj2.f142143c;
        } else {
            str3 = "";
        }
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"androidPackageName"}, "packageName = ?", new String[]{str10}, null, null, null);
        try {
            if (query.getCount() == 1) {
                query.moveToFirst();
                String string = query.getString(0);
                if (!str3.equals(string)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 111 + String.valueOf(string).length());
                    sb.append("Failed registering with Android package: ");
                    sb.append(str3);
                    sb.append(". Config package already registered with a different Android package: ");
                    sb.append(string);
                    throw new anfy(29506, sb.toString());
                }
            }
            if (query != null) {
                query.close();
            }
            String str11 = braj2.f142144d;
            String[] strArr = anfr.f76776a;
            Cursor query2 = sQLiteDatabase.query("LogSources", new String[]{"logSourceName"}, "packageName = ?", new String[]{str11}, null, null, null);
            try {
                HashSet a4 = bnpf.m110048a(query2.getCount());
                while (query2.moveToNext()) {
                    a4.add(query2.getString(0));
                }
                if (query2 != null) {
                    query2.close();
                }
                int a5 = brai.m113818a(braj2.f142150j);
                if (a5 == 0) {
                    str5 = "serializedDeclarativeRegInfo";
                    str4 = "packageName";
                    hashSet = a4;
                } else if (a5 == 3) {
                    str5 = "serializedDeclarativeRegInfo";
                    str4 = "packageName";
                    hashSet = a4;
                    Cursor query3 = sQLiteDatabase.query("Packages", new String[]{"serializedDeclarativeRegInfo"}, "packageName = ?", new String[]{braj2.f142144d}, null, null, null);
                    try {
                        if (query3.moveToNext() && (blob = query3.getBlob(0)) != null && blob.length > 0 && Arrays.equals(braj2.serializeToBytes(), blob)) {
                            if (query3 != null) {
                                query3.close();
                            }
                            set = m64444a(hashSet, braj2.f142144d);
                            i3 = 1;
                            i2 = 2;
                            i = 5;
                            String str12 = braj2.f142144d;
                            bnpd c = bnpf.m110057c(hashSet, set);
                            bnpd c2 = bnpf.m110057c(set, hashSet);
                            a = ((bnoz) c).iterator();
                            while (a.hasNext()) {
                                String[] strArr2 = new String[i2];
                                strArr2[0] = str12;
                                strArr2[1] = (String) a.next();
                                sQLiteDatabase2.delete("LogSources", "packageName = ? AND logSourceName = ?", strArr2);
                            }
                            boolean z8 = true;
                            a2 = ((bnoz) c2).iterator();
                            while (a2.hasNext()) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(str4, str12);
                                contentValues.put("logSourceName", (String) a2.next());
                                sQLiteDatabase2.insertWithOnConflict("LogSources", null, contentValues, i);
                            }
                            if (c.isEmpty() && c2.isEmpty()) {
                                z8 = false;
                            }
                            return new anhx(braj2.f142144d, i3, z8);
                        } else if (query3 != null) {
                            query3.close();
                        }
                    } catch (Throwable th7) {
                        bqye.m113761a(th6, th7);
                    }
                } else {
                    str5 = "serializedDeclarativeRegInfo";
                    str4 = "packageName";
                    hashSet = a4;
                }
                String str13 = braj2.f142144d;
                bxvt bxvt = braj2.f142147g;
                sQLiteDatabase2.delete("WeakExperimentIds", "packageName = ?", new String[]{str13});
                if (bxvt != null) {
                    int size = bxvt.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int intValue = ((Integer) bxvt.get(i6)).intValue();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(str4, str13);
                        contentValues2.put("experimentId", Integer.valueOf(intValue));
                        sQLiteDatabase2.insert("WeakExperimentIds", null, contentValues2);
                    }
                }
                byte[] k = braj2.f142148h.getKey();
                if (k.length != 0) {
                    bArr = k;
                } else {
                    bArr = null;
                }
                String str14 = "version";
                String str15 = str5;
                String[] strArr3 = {"version", "params", "dynamicParams", "weak", str15};
                if (str == null) {
                    str6 = "";
                } else {
                    str6 = " AND isSynced = 1";
                }
                String str16 = str6.length() == 0 ? new String("packageName = ?") : "packageName = ?".concat(str6);
                String str17 = "weak";
                String str18 = "dynamicParams";
                String str19 = str14;
                String str20 = str15;
                String str21 = "params";
                String str22 = "";
                Cursor query4 = sQLiteDatabase.query("Packages", strArr3, str16, new String[]{braj2.f142144d}, null, null, null);
                try {
                    if (!query4.moveToNext()) {
                        bArr3 = null;
                        z4 = false;
                        z3 = false;
                        i4 = 2;
                        bArr2 = null;
                        z2 = false;
                        z = false;
                    } else {
                        if (query4.getInt(0) == braj2.f142145e) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean equals = Arrays.equals(bArr, query4.getBlob(1));
                        i4 = 2;
                        byte[] blob2 = query4.getBlob(2);
                        boolean z9 = braj2.f142149i;
                        if (query4.getInt(3) == 0) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (z9 == z7) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z2 = equals;
                        bArr2 = blob2;
                        z = true;
                        z4 = z6;
                        bArr3 = query4.getBlob(4);
                    }
                    if (query4 != null) {
                        query4.close();
                    }
                    int a6 = brai.m113818a(braj2.f142150j);
                    if (a6 == 0) {
                        bArr4 = null;
                    } else {
                        bArr4 = a6 == i4 ? m64446a(context, braj2) : null;
                    }
                    if (z && z4 && z2 && z3 && Arrays.equals(bArr3, bArr4)) {
                        str7 = str19;
                        i = 5;
                    } else {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put(str4, braj2.f142144d);
                        str7 = str19;
                        contentValues3.put(str7, Integer.valueOf(braj2.f142145e));
                        contentValues3.put(str21, bArr);
                        contentValues3.put(str18, bArr2);
                        contentValues3.put(str17, Integer.valueOf(braj2.f142149i ? 1 : 0));
                        if (braj2.f142142b == 7) {
                            str8 = (String) braj2.f142143c;
                        } else {
                            str8 = str22;
                        }
                        contentValues3.put("androidPackageName", str8);
                        contentValues3.put("isSynced", (Integer) 0);
                        contentValues3.put(str20, bArr4);
                        i = 5;
                        sQLiteDatabase2.insertWithOnConflict("Packages", null, contentValues3, 5);
                    }
                    if (z4) {
                        i2 = 2;
                    } else if (!z2 && bArr2 == null) {
                        i2 = 2;
                    } else if (str == null) {
                        String[] strArr4 = {str7};
                        String[] strArr5 = new String[i4];
                        strArr5[0] = braj2.f142144d;
                        strArr5[1] = Integer.toString(braj2.f142145e);
                        i2 = 2;
                        Cursor query5 = sQLiteDatabase.query("ExperimentTokens", strArr4, "packageName = ? AND version = ?", strArr5, null, null, null);
                        try {
                            boolean z10 = !(query5.getCount() <= 0);
                            if (query5 != null) {
                                query5.close();
                            }
                            z5 = z10;
                            if (str == null) {
                                bArr5 = bArr2;
                                Cursor query6 = sQLiteDatabase.query("RequestTags", new String[]{"user"}, "user = ?", new String[]{str}, null, null, null, "1");
                                try {
                                    int count = query6.getCount();
                                    if (query6 != null) {
                                        query6.close();
                                    }
                                    if (count == 0) {
                                        i5 = 13;
                                        i3 = i5;
                                        set = m64444a(braj2.f142146f, braj2.f142144d);
                                        String str122 = braj2.f142144d;
                                        bnpd c3 = bnpf.m110057c(hashSet, set);
                                        bnpd c22 = bnpf.m110057c(set, hashSet);
                                        a = ((bnoz) c3).iterator();
                                        while (a.hasNext()) {
                                        }
                                        boolean z82 = true;
                                        a2 = ((bnoz) c22).iterator();
                                        while (a2.hasNext()) {
                                        }
                                        z82 = false;
                                        return new anhx(braj2.f142144d, i3, z82);
                                    }
                                } catch (Throwable th8) {
                                    bqye.m113761a(th4, th8);
                                }
                            } else {
                                bArr5 = bArr2;
                            }
                            i5 = z ? str == null ? 7 : 14 : !z5 ? str != null ? 15 : 8 : (!z2 && bArr5 == null) ? str != null ? 16 : 9 : 1;
                            i3 = i5;
                            set = m64444a(braj2.f142146f, braj2.f142144d);
                            String str1222 = braj2.f142144d;
                            bnpd c32 = bnpf.m110057c(hashSet, set);
                            bnpd c222 = bnpf.m110057c(set, hashSet);
                            a = ((bnoz) c32).iterator();
                            while (a.hasNext()) {
                            }
                            boolean z822 = true;
                            a2 = ((bnoz) c222).iterator();
                            while (a2.hasNext()) {
                            }
                            z822 = false;
                            return new anhx(braj2.f142144d, i3, z822);
                        } catch (Throwable th9) {
                            bqye.m113761a(th5, th9);
                        }
                    } else {
                        i2 = 2;
                    }
                    z5 = z4;
                    if (str == null) {
                    }
                    if (z) {
                    }
                    i3 = i5;
                    set = m64444a(braj2.f142146f, braj2.f142144d);
                    String str12222 = braj2.f142144d;
                    bnpd c322 = bnpf.m110057c(hashSet, set);
                    bnpd c2222 = bnpf.m110057c(set, hashSet);
                    a = ((bnoz) c322).iterator();
                    while (a.hasNext()) {
                    }
                    boolean z8222 = true;
                    a2 = ((bnoz) c2222).iterator();
                    while (a2.hasNext()) {
                    }
                    z8222 = false;
                    return new anhx(braj2.f142144d, i3, z8222);
                } catch (Throwable th10) {
                    bqye.m113761a(th3, th10);
                }
            } catch (Throwable th11) {
                bqye.m113761a(th2, th11);
            }
            throw th5;
            throw th6;
            throw th4;
            throw th;
            throw th2;
            throw th3;
        } catch (Throwable th12) {
            bqye.m113761a(th, th12);
        }
    }

    /* renamed from: b */
    public static anhx m64447b(Context context, braj braj, String str) {
        String str2;
        bqzz bqzz;
        HashSet hashSet;
        FileOutputStream fileOutputStream;
        String str3;
        String str4;
        FileInputStream fileInputStream;
        byte[] a;
        m64445a(braj);
        bxvd da = bqzz.f142114e.mo74144da();
        bxvd bxvd = (bxvd) braj.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) braj);
        braf braf = (braf) bxvd;
        String str5 = braj.f142144d;
        String str6 = "";
        int i = 7;
        if (braj.f142142b == 7) {
            str2 = (String) braj.f142143c;
        } else {
            str2 = str6;
        }
        String a2 = angb.m64192a(str5, str2);
        if (!a2.equals(str5)) {
            anhj.m64401a();
        }
        if (braf.f164950c) {
            braf.mo74035c();
            braf.f164950c = false;
        }
        braj braj2 = (braj) braf.f164949b;
        braj braj3 = braj.f142139l;
        a2.getClass();
        braj2.f142141a |= 1;
        braj2.f142144d = a2;
        HashSet hashSet2 = new HashSet(braj.f142146f);
        Set a3 = m64444a(hashSet2, a2);
        if (!hashSet2.equals(a3)) {
            if (braf.f164950c) {
                braf.mo74035c();
                braf.f164950c = false;
            }
            ((braj) braf.f164949b).f142146f = GeneratedMessageLite.m124030de();
            braf.mo69472a(a3);
        }
        braj braj4 = (braj) braf.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqzz bqzz2 = (bqzz) da.f164949b;
        braj4.getClass();
        bqzz2.f142117b = braj4;
        bqzz2.f142116a |= 1;
        int a4 = brai.m113818a(braj4.f142150j);
        if (!(a4 == 0 || a4 != 2 || (a = m64446a(context, braj4)) == null)) {
            ByteString a5 = ByteString.m123261a(a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqzz bqzz3 = (bqzz) da.f164949b;
            a5.getClass();
            bqzz3.f142116a |= 2;
            bqzz3.f142118c = a5;
        }
        try {
            anff anff = anff.REGISTRATION;
            bxxk bxxk = (bxxk) bqzz.f142114e.mo74142c(7);
            fileInputStream = new FileInputStream(new File(anff.mo41772a(context), a2));
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bxxk.mo73656a(fileInputStream);
            fileInputStream.close();
            bqzz = (bqzz) GeneratedMessageLite;
        } catch (FileNotFoundException e) {
            bqzz = null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        if (!(bqzz == null || (bqzz.f142116a & 4) == 0)) {
            ByteString bxtx = bqzz.f142119d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqzz bqzz4 = (bqzz) da.f164949b;
            bxtx.getClass();
            bqzz4.f142116a |= 4;
            bqzz4.f142119d = bxtx;
        }
        if (bqzz != null) {
            braj braj5 = bqzz.f142117b;
            if (braj5 == null) {
                braj5 = braj.f142139l;
            }
            if (braj5.f142142b == 7) {
                str3 = (String) braj5.f142143c;
            } else {
                str3 = str6;
            }
            if (!str3.equals(braj4.f142142b == 7 ? (String) braj4.f142143c : str6)) {
                if (braj4.f142142b == 7) {
                    str4 = (String) braj4.f142143c;
                } else {
                    str4 = str6;
                }
                braj braj6 = bqzz.f142117b;
                if (braj6 == null) {
                    braj6 = braj.f142139l;
                }
                if (braj6.f142142b == 7) {
                    str6 = (String) braj6.f142143c;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 111 + String.valueOf(str6).length());
                sb.append("Failed registering with Android package: ");
                sb.append(str4);
                sb.append(". Config package already registered with a different Android package: ");
                sb.append(str6);
                throw new anfy(29506, sb.toString());
            }
        }
        int a6 = brai.m113818a(braj.f142150j);
        if (a6 == 0 || a6 != 3 || bqzz == null || (bqzz.f142116a & 2) == 0 || !bqzz.f142118c.equals(braj.mo73639aL())) {
            bqzz bqzz5 = (bqzz) da.mo74062i();
            if (bqzz == null || !bqzz.equals(bqzz5)) {
                File a7 = anff.REGISTRATION.mo41772a(context);
                File file = new File(a7, a2);
                if (!a7.exists()) {
                    a7.mkdirs();
                }
                File createTempFile = File.createTempFile("phenotype-", null, context.getCacheDir());
                try {
                    fileOutputStream = new FileOutputStream(createTempFile);
                    bqzz5.mo73638a(fileOutputStream);
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    if (!createTempFile.renameTo(file)) {
                        createTempFile.delete();
                        String valueOf = String.valueOf(createTempFile);
                        String valueOf2 = String.valueOf(file);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
                        sb2.append("Failed to rename file from ");
                        sb2.append(valueOf);
                        sb2.append(" to ");
                        sb2.append(valueOf2);
                        throw new IOException(sb2.toString());
                    }
                } catch (IOException e2) {
                    createTempFile.delete();
                    throw e2;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            if (bqzz != null) {
                braj braj7 = bqzz5.f142117b;
                if (braj7 == null) {
                    braj7 = braj.f142139l;
                }
                int i2 = braj7.f142145e;
                braj braj8 = bqzz.f142117b;
                if (braj8 == null) {
                    braj8 = braj.f142139l;
                }
                if (i2 == braj8.f142145e) {
                    braj braj9 = bqzz5.f142117b;
                    if (braj9 == null) {
                        braj9 = braj.f142139l;
                    }
                    ByteString bxtx2 = braj9.f142148h;
                    braj braj10 = bqzz.f142117b;
                    if (braj10 == null) {
                        braj10 = braj.f142139l;
                    }
                    i = !bxtx2.equals(braj10.f142148h) ? str != null ? 16 : 9 : 1;
                } else {
                    i = str != null ? 15 : 8;
                }
            } else if (str != null) {
                i = 14;
            }
        } else {
            i = 1;
        }
        if (bqzz != null) {
            braj braj11 = bqzz.f142117b;
            if (braj11 == null) {
                braj11 = braj.f142139l;
            }
            hashSet = new HashSet(braj11.f142146f);
        } else {
            hashSet = new HashSet();
        }
        return new anhx(braj4.f142144d, i, !hashSet.equals(a3));
        throw th;
        throw th;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static anhx m64442a(Context context, anfw anfw, braj braj, String str) {
        if (braj != null) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                anhx a = m64441a(context, writableDatabase, braj, str);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (a.f76913b || braj.f142149i) {
                    anhj.m64401a();
                }
                return a;
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Null RegistrationInfo");
        }
    }

    /* renamed from: a */
    static anhx m64443a(Context context, braj braj, String str) {
        anhx b = m64447b(context, braj, str);
        if (b.f76913b || braj.f142149i) {
            anhj.m64401a();
        }
        return b;
    }

    /* renamed from: a */
    private static Set m64444a(Collection collection, String str) {
        HashSet hashSet = new HashSet(collection);
        if (!cget.f186695a.mo6606a().mo83573c()) {
            return hashSet;
        }
        bqzy c = angb.m64194c(str);
        if ((c.f142111a & 1) == 0) {
            String a = angb.m64191a(str);
            if (!str.equals(a)) {
                c = angb.m64194c(a);
            }
        }
        if ((c.f142111a & 1) == 0) {
            return hashSet;
        }
        bqzx bqzx = c.f142112b;
        if (bqzx == null) {
            bqzx = bqzx.f142104c;
        }
        if (bqzx.f142106a) {
            return new HashSet(bqzx.f142107b);
        }
        hashSet.addAll(bqzx.f142107b);
        return hashSet;
    }

    /* renamed from: a */
    private static void m64445a(braj braj) {
        String str;
        if (!braj.f142144d.isEmpty()) {
            bxwc bxwc = braj.f142146f;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                String str2 = (String) bxwc.get(i);
                if (str2 != null) {
                    i++;
                    if (str2.isEmpty()) {
                    }
                }
                throw new anfy(29500, "Invalid log source");
            }
            if (!braj.f142149i && !braj.f142147g.isEmpty()) {
                throw new anfy(29500, "Experiment ids for weak registration only");
            }
            if (braj.f142142b == 7) {
                str = (String) braj.f142143c;
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                int a = brai.m113818a(braj.f142150j);
                if (a == 0 || a == 1) {
                    throw new anfy(29500, "Unknown registration type");
                }
                return;
            }
            throw new anfy(29500, "No Android package");
        }
        throw new anfy(29500, "No package name");
    }

    /* renamed from: a */
    private static byte[] m64446a(Context context, braj braj) {
        int i;
        String str;
        String str2 = "";
        beai beai = new beai(context.getPackageManager());
        try {
            if (!cgeg.m144877b()) {
                i = 128;
            } else {
                i = 132;
            }
            PackageManager packageManager = context.getPackageManager();
            if (braj.f142142b != 7) {
                str = str2;
            } else {
                str = (String) braj.f142143c;
            }
            List a = beai.mo58477a(packageManager.getPackageInfo(str, i));
            int size = a.size();
            int i2 = 0;
            while (i2 < size) {
                braj braj2 = (braj) a.get(i2);
                i2++;
                if (braj2.f142144d.equals(braj.f142144d)) {
                    return braj2.serializeToBytes();
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            if (braj.f142142b == 7) {
                str2 = (String) braj.f142143c;
            }
            throw new anfy(29500, String.valueOf(str2).concat(" not found!."), e);
        }
    }
}
