package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import java.util.List;

/* renamed from: anic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anic extends angu {

    /* renamed from: a */
    private final angj f76925a;

    /* renamed from: b */
    private final anid f76926b;

    public anic(angj angj, String str, String str2, String str3, Flag[] flagArr) {
        super("SetFlagOverridesOperationCall", caif.SET_FLAG_OVERRIDE);
        sdo.m34959a(angj);
        this.f76925a = angj;
        this.f76926b = new anid(str2, str3, flagArr, str);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anid anid = this.f76926b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anid.f76927a;
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
        String str2 = anid.f76929c;
        if (str2 != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp2 = (cahp) caho.f164949b;
            str2.getClass();
            cahp2.f174574a |= 4;
            cahp2.f174579f = str2;
        }
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: d */
    public final List mo41831d() {
        return this.f76926b.f76928b;
    }

    /* JADX INFO: finally extract failed */
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
    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        int i;
        cahq a;
        Context context2 = context;
        anid anid = this.f76926b;
        String str = anid.f76927a;
        if (str == null) {
            i = 29500;
        } else if (str.length() != 0) {
            String str2 = anid.f76929c;
            if (str2 == null) {
                throw new anfy(29500, "No user");
            } else if (str2.equals("*") || anid.f76929c.equals("") || angd.m64196a(anid.f76929c, context2)) {
                Flag[] flagArr = anid.f76930d;
                if (flagArr != null) {
                    int length = flagArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < length) {
                        Flag flag = flagArr[i3];
                        String str3 = flag.f82099a;
                        if (str3 == null || str3.length() == 0) {
                            throw new anfy(29500, "No flag name");
                        } else if (flag.f82105g == 4 && flag.mo46502d() == null) {
                            throw new anfy(29500, "Flag with null string");
                        } else if (flag.f82105g == 5 && flag.mo46503e() == null) {
                            throw new anfy(29500, "Flag with null bytes");
                        } else {
                            if (flag.f82106h == -1000) {
                                if (!anid.f76929c.equals("*")) {
                                    throw new anfy(29500, "Flag commit requires user *");
                                } else if (anhe.m64387b(anid.f76927a)) {
                                    throw new anfy(29500, "Flag commit incompatible with direct boot");
                                }
                            }
                            i3++;
                        }
                    }
                    SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        anid.f76927a = angb.m64192a(anid.f76927a, anid.f76931e);
                        if (cgec.m144835j().f165797a.contains(anid.f76931e)) {
                            if (!anid.f76931e.equals(anfu.m64173b(writableDatabase, anid.f76927a))) {
                                String str4 = anid.f76931e;
                                String str5 = anid.f76927a;
                                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 33 + String.valueOf(str5).length());
                                sb.append(str4);
                                sb.append(" is not authorized to operate on ");
                                sb.append(str5);
                                throw new SecurityException(sb.toString());
                            }
                        }
                        Flag[] flagArr2 = anid.f76930d;
                        int length2 = flagArr2.length;
                        int i4 = 0;
                        while (i4 < length2) {
                            Flag flag2 = flagArr2[i4];
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("packageName", anid.f76927a);
                            contentValues.put("user", anid.f76929c);
                            contentValues.put("name", flag2.f82099a);
                            int i5 = flag2.f82106h;
                            if (i5 == -1000) {
                                i5 = 0;
                            }
                            contentValues.put("flagType", Integer.valueOf(i5));
                            contentValues.put("committed", Integer.valueOf(i2));
                            int i6 = flag2.f82105g;
                            if (i6 == 1) {
                                contentValues.put("intVal", Long.valueOf(flag2.mo46497a()));
                            } else if (i6 == 2) {
                                contentValues.put("boolVal", Boolean.valueOf(flag2.mo46499b()));
                            } else if (i6 == 3) {
                                contentValues.put("floatVal", Double.valueOf(flag2.mo46500c()));
                            } else if (i6 == 4) {
                                contentValues.put("stringVal", flag2.mo46502d());
                            } else if (i6 == 5) {
                                contentValues.put("extensionVal", flag2.mo46503e());
                            } else {
                                throw new anfy(29500, "Unrecognized flag type");
                            }
                            writableDatabase.insertWithOnConflict("FlagOverrides", null, contentValues, 5);
                            if (flag2.f82106h == -1000) {
                                contentValues.put("committed", (Integer) 1);
                                writableDatabase.insertWithOnConflict("FlagOverrides", null, contentValues, 5);
                                anid.f76932f = true;
                            }
                            i4++;
                            i2 = 0;
                        }
                        anfm.m64162b(writableDatabase, anid.f76927a);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (anid.f76932f) {
                            anhj.m64401a();
                        }
                        String b = anfu.m64173b(writableDatabase, anid.f76927a);
                        if (!(b == null || (a = angc.m64195a(context2, anid.f76927a, b, 9, true)) == null)) {
                            anid.f76928b.add(a);
                        }
                        if (this.f76926b.f76932f) {
                            context.getContentResolver().notifyChange(anef.m64088a(this.f76926b.f76927a), null);
                        }
                        angf.m64199a(context).mo41781a(this.f76926b.f76927a);
                        this.f76925a.mo41797g(Status.f30107a);
                        return;
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    throw new anfy(29500, "No flags");
                }
            } else {
                throw new anfy(29500, "User not on device");
            }
        } else {
            i = 29500;
        }
        throw new anfy(i, "No package name");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76925a.mo41797g(status);
    }
}
