package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.phenotype.Flag;

/* renamed from: angx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angx {

    /* renamed from: g */
    private static final String f76821g;

    /* renamed from: h */
    private static final String f76822h;

    /* renamed from: i */
    private static final String f76823i;

    /* renamed from: j */
    private static final String f76824j;

    /* renamed from: k */
    private static final String f76825k;

    /* renamed from: l */
    private static final String f76826l;

    /* renamed from: a */
    public final String f76827a;

    /* renamed from: b */
    public String f76828b;

    /* renamed from: c */
    String f76829c = null;

    /* renamed from: d */
    int f76830d;

    /* renamed from: e */
    String f76831e;

    /* renamed from: f */
    public int f76832f;

    /* renamed from: m */
    private final String f76833m;

    static {
        String join = TextUtils.join(", ", anfq.f76774a);
        f76821g = join;
        f76822h = join.replace("committed", "1");
        String join2 = TextUtils.join(", ", anfo.f76772a);
        f76823i = join2;
        f76824j = join2.replace("isCommitted", "1");
        String join3 = TextUtils.join(", ", anfn.f76771a);
        f76825k = join3;
        f76826l = join3.replace("isCommitted", "1");
    }

    public angx(String str, String str2) {
        this.f76827a = str;
        this.f76833m = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, boolean):boolean
     arg types: [android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, int]
     candidates:
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, boolean):android.database.Cursor
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, boolean):boolean */
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
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        if (r5[7].equals("1") != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0128, code lost:
        if (r5 != null) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x027a A[SYNTHETIC, Splitter:B:100:0x027a] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0287 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, anfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0319 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, anfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x031b A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, anfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013c A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, anfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0183 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, anfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c6 A[SYNTHETIC, Splitter:B:82:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d4 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, anfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e7 A[SYNTHETIC, Splitter:B:88:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f5 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, anfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020f A[SYNTHETIC, Splitter:B:94:0x020f] */
    /* renamed from: a */
    public final void mo41832a(Context context, anfw anfw) {
        Cursor a;
        Throwable th;
        SQLiteStatement compileStatement;
        Throwable th2;
        Flag[] a2;
        SQLiteStatement compileStatement2;
        Throwable th3;
        SQLiteStatement compileStatement3;
        Throwable th4;
        String str;
        if (this.f76827a != null) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                if (this.f76827a.startsWith("CURRENT")) {
                    String[] split = this.f76827a.split(":", 3);
                    if (split.length != 3) {
                        String valueOf = String.valueOf(this.f76827a);
                        throw new anfy(29500, valueOf.length() == 0 ? new String("Empty or malformed snapshot token: ") : "Empty or malformed snapshot token: ".concat(valueOf));
                    }
                    String str2 = split[1];
                    this.f76831e = str2;
                    if (!str2.equals("")) {
                        if (!angd.m64196a(this.f76831e, context)) {
                            throw new anfy(29500, "Invalid user");
                        }
                    }
                    String a3 = angb.m64192a(split[2], this.f76833m);
                    this.f76829c = a3;
                    this.f76828b = a3;
                    this.f76830d = anhe.m64386b(writableDatabase, a3, this.f76831e);
                } else {
                    String[] a4 = anhe.m64385a(this.f76827a);
                    if (a4 == null) {
                        String valueOf2 = String.valueOf(this.f76827a);
                        throw new anfy(29500, valueOf2.length() == 0 ? new String("Empty (package not registered?) or malformed snapshot token: ") : "Empty (package not registered?) or malformed snapshot token: ".concat(valueOf2));
                    }
                    this.f76831e = a4[0];
                    this.f76828b = a4[1];
                    this.f76829c = a4[5];
                    this.f76830d = Integer.parseInt(a4[2]);
                    long parseLong = Long.parseLong(a4[3]);
                    long a5 = anfm.m64161a(writableDatabase, this.f76828b);
                    if (a5 == parseLong) {
                        if (a4.length <= 7) {
                        }
                        String str3 = a4[6];
                        Pair a6 = anfw.m64176a(writableDatabase, this.f76829c, this.f76831e);
                        if (a6 != null) {
                            str = anfo.m64164a(writableDatabase, this.f76829c, ((Integer) a6.second).intValue(), (String) a6.first, true);
                        } else {
                            str = "";
                        }
                        if (!str3.equals(str)) {
                            throw new anfy(29501, "Stale snapshot (committed configuration changed)");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(99);
                        sb.append("Stale snapshot (change count changed - expected ");
                        sb.append(a5);
                        sb.append("  but was ");
                        sb.append(parseLong);
                        sb.append(")");
                        throw new anfy(29501, sb.toString());
                    }
                }
                a = anfo.m64163a(writableDatabase, this.f76829c, this.f76830d, this.f76831e, false, "servingVersion");
                int i = -1;
                if (a.moveToFirst()) {
                    i = a.getInt(0);
                } else {
                    if (a != null) {
                    }
                    this.f76832f = i;
                    if (anhe.m64387b(this.f76829c)) {
                        if (!this.f76831e.equals("")) {
                            String str4 = this.f76831e;
                            String str5 = this.f76829c;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 47 + String.valueOf(str5).length());
                            sb2.append("Can't commit to ");
                            sb2.append(str4);
                            sb2.append(" for direct boot aware package ");
                            sb2.append(str5);
                            throw new anfy(29500, sb2.toString());
                        }
                    }
                    if (cgem.m144888c()) {
                        if (!anfe.m64149a(writableDatabase, this.f76828b, this.f76830d, this.f76831e, false)) {
                            String str6 = this.f76829c;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + 66);
                            sb3.append("Can't commit to flags for package ");
                            sb3.append(str6);
                            sb3.append(" due to detected flag corruption");
                            throw new anfx(sb3.toString());
                        }
                    }
                    if (!bdyj.m91582b(this.f76829c)) {
                        writableDatabase.delete("Flags", "packageName = ? AND user = ? AND committed = 1", new String[]{this.f76829c, this.f76831e});
                    } else {
                        writableDatabase.delete("Flags", "packageName = ? AND committed = 1", new String[]{this.f76829c});
                    }
                    if (!bdyj.m91582b(this.f76829c)) {
                        writableDatabase.delete("FlagOverrides", "packageName = ? AND user = ? AND committed = 1", new String[]{this.f76829c, this.f76831e});
                    } else {
                        writableDatabase.delete("FlagOverrides", "packageName = ? AND committed = 1", new String[]{this.f76829c});
                    }
                    String str7 = f76822h;
                    if (!this.f76829c.equals(this.f76828b)) {
                        String str8 = this.f76829c;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str8).length() + 2);
                        sb4.append("'");
                        sb4.append(str8);
                        sb4.append("'");
                        str7 = str7.replace("packageName", sb4.toString());
                    }
                    String str9 = f76821g;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str9).length() + 108 + String.valueOf(str7).length());
                    sb5.append("INSERT INTO Flags (");
                    sb5.append(str9);
                    sb5.append(") SELECT ");
                    sb5.append(str7);
                    sb5.append(" FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0");
                    compileStatement = writableDatabase.compileStatement(sb5.toString());
                    compileStatement.bindString(1, this.f76828b);
                    compileStatement.bindLong(2, (long) this.f76830d);
                    compileStatement.bindString(3, this.f76831e);
                    compileStatement.execute();
                    if (compileStatement != null) {
                        compileStatement.close();
                    }
                    a2 = anhe.m64384a(writableDatabase, this.f76829c, this.f76831e);
                    if (a2 != null) {
                        for (Flag flag : a2) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("packageName", this.f76829c);
                            contentValues.put("user", this.f76831e);
                            contentValues.put("name", flag.f82099a);
                            contentValues.put("flagType", Integer.valueOf(flag.f82106h));
                            contentValues.put("committed", (Integer) 1);
                            int i2 = flag.f82105g;
                            if (i2 == 1) {
                                contentValues.put("intVal", Long.valueOf(flag.mo46497a()));
                            } else if (i2 == 2) {
                                contentValues.put("boolVal", Integer.valueOf(flag.mo46499b() ? 1 : 0));
                            } else if (i2 == 3) {
                                contentValues.put("floatVal", Double.valueOf(flag.mo46500c()));
                            } else if (i2 == 4) {
                                contentValues.put("stringVal", flag.mo46502d());
                            } else if (i2 == 5) {
                                contentValues.put("extensionVal", flag.mo46503e());
                            } else {
                                throw new RuntimeException("bad Flag type - should not happen!");
                            }
                            writableDatabase.insertWithOnConflict("FlagOverrides", null, contentValues, 5);
                        }
                    }
                    if (a2 != null) {
                        if (bdyj.m91582b(this.f76829c)) {
                            writableDatabase.delete("ExperimentTokens", "packageName = ? AND user = ? AND isCommitted = 1", new String[]{this.f76829c, this.f76831e});
                        } else {
                            writableDatabase.delete("ExperimentTokens", "packageName = ? AND isCommitted = 1", new String[]{this.f76829c});
                        }
                        String str10 = f76824j;
                        if (!this.f76828b.equals(this.f76829c)) {
                            String str11 = this.f76829c;
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str11).length() + 2);
                            sb6.append("'");
                            sb6.append(str11);
                            sb6.append("'");
                            str10 = str10.replace("packageName", sb6.toString());
                        }
                        String str12 = f76823i;
                        StringBuilder sb7 = new StringBuilder(String.valueOf(str12).length() + 132 + String.valueOf(str10).length());
                        sb7.append("INSERT INTO ExperimentTokens (");
                        sb7.append(str12);
                        sb7.append(") SELECT ");
                        sb7.append(str10);
                        sb7.append(" FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0");
                        compileStatement2 = writableDatabase.compileStatement(sb7.toString());
                        compileStatement2.bindString(1, this.f76828b);
                        compileStatement2.bindLong(2, (long) this.f76830d);
                        compileStatement2.bindString(3, this.f76831e);
                        compileStatement2.execute();
                        if (compileStatement2 != null) {
                            compileStatement2.close();
                        }
                        int i3 = this.f76830d;
                        String str13 = this.f76831e;
                        writableDatabase.delete("CrossLoggedExperimentTokens", "fromPackageName = ? AND isCommitted = 1", new String[]{this.f76829c});
                        if (!bdyj.m91582b(this.f76829c)) {
                            String str14 = f76825k;
                            String str15 = f76826l;
                            StringBuilder sb8 = new StringBuilder(String.valueOf(str14).length() + 166 + String.valueOf(str15).length());
                            sb8.append("INSERT INTO CrossLoggedExperimentTokens (");
                            sb8.append(str14);
                            sb8.append(") SELECT ");
                            sb8.append(str15);
                            sb8.append(" FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND fromVersion = ? AND fromUser = ? AND isCommitted = 0");
                            compileStatement3 = writableDatabase.compileStatement(sb8.toString());
                            compileStatement3.bindString(1, this.f76829c);
                            compileStatement3.bindLong(2, (long) i3);
                            compileStatement3.bindString(3, str13);
                            compileStatement3.execute();
                            if (compileStatement3 != null) {
                                compileStatement3.close();
                            }
                        }
                    }
                    mo41833a(writableDatabase, this.f76831e, (long) this.f76830d);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    anhj.m64401a();
                    return;
                }
                a.close();
                this.f76832f = i;
                if (anhe.m64387b(this.f76829c)) {
                }
                if (cgem.m144888c()) {
                }
                if (!bdyj.m91582b(this.f76829c)) {
                }
                if (!bdyj.m91582b(this.f76829c)) {
                }
                String str72 = f76822h;
                if (!this.f76829c.equals(this.f76828b)) {
                }
                String str92 = f76821g;
                StringBuilder sb52 = new StringBuilder(String.valueOf(str92).length() + 108 + String.valueOf(str72).length());
                sb52.append("INSERT INTO Flags (");
                sb52.append(str92);
                sb52.append(") SELECT ");
                sb52.append(str72);
                sb52.append(" FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0");
                compileStatement = writableDatabase.compileStatement(sb52.toString());
                compileStatement.bindString(1, this.f76828b);
                compileStatement.bindLong(2, (long) this.f76830d);
                compileStatement.bindString(3, this.f76831e);
                compileStatement.execute();
                if (compileStatement != null) {
                }
                a2 = anhe.m64384a(writableDatabase, this.f76829c, this.f76831e);
                if (a2 != null) {
                }
                if (a2 != null) {
                }
                mo41833a(writableDatabase, this.f76831e, (long) this.f76830d);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                anhj.m64401a();
                return;
            } catch (NumberFormatException e) {
                NumberFormatException numberFormatException = e;
                String valueOf3 = String.valueOf(this.f76827a);
                throw new anfy(29500, valueOf3.length() == 0 ? new String("Malformed snapshot token (version): ") : "Malformed snapshot token (version): ".concat(valueOf3), numberFormatException);
            } catch (NumberFormatException e2) {
                NumberFormatException numberFormatException2 = e2;
                String valueOf4 = String.valueOf(this.f76827a);
                throw new anfy(29500, valueOf4.length() == 0 ? new String("Malformed snapshot token (change): ") : "Malformed snapshot token (change): ".concat(valueOf4), numberFormatException2);
            } catch (anfx e3) {
                anfx anfx = e3;
                try {
                    if (anfx.f76790a == 29512) {
                        writableDatabase.endTransaction();
                        writableDatabase.beginTransaction();
                        anfw.m64181a(writableDatabase, this.f76828b, this.f76831e, this.f76830d);
                        writableDatabase.setTransactionSuccessful();
                    }
                    throw anfx;
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    writableDatabase.endTransaction();
                    throw th6;
                }
            } catch (Throwable th7) {
                bqye.m113761a(th4, th7);
            }
        } else {
            throw new anfy(29500, "No snapshot token");
        }
        throw th2;
        throw th3;
        throw th4;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41833a(SQLiteDatabase sQLiteDatabase, String str, long j) {
        if (bdyj.m91582b(this.f76829c)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("packageName", this.f76829c);
            contentValues.put("user", str);
            contentValues.put("version", Long.valueOf(j));
            sQLiteDatabase.insertWithOnConflict("MultiCommitApplicationStates", null, contentValues, 5);
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("packageName", this.f76829c);
        contentValues2.put("user", str);
        contentValues2.put("version", Long.valueOf(j));
        sQLiteDatabase.insertWithOnConflict("ApplicationStates", null, contentValues2, 5);
    }
}
