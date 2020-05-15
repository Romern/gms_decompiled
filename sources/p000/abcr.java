package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcr implements Closeable {

    /* renamed from: a */
    private static final String[] f57043a = {"_id", "app_package_name", "user_account_id", "product_specific_context", "session_id", "user_action_type", "sub_user_action_type", "shown_content_list", "query", "url", "click_rank", "contact_mode_type", "elapsed_millis", "content_unit_type_enum", "fragment_type", "network_type_enum", "timestamp_millis", "gcore_version", "client_version", "offline", "feedback_policy_set_version", "experiment_token", "flow", "feedback_psd_count", "feedback_psbd_count", "feedback_screenshot_present", "ocarina_elapsed_millis", "ocarina_num_bytes"};
    @Deprecated

    /* renamed from: b */
    private final abcq f57044b;

    /* renamed from: c */
    private final Context f57045c;

    public abcr(Context context) {
        this.f57045c = context;
        this.f57044b = new abcq(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SQLiteDatabase mo32039a() {
        try {
            return mo32043b().getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("gH_MetricsDatabase", "Error opening Metrics database.", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final srp mo32043b() {
        return aaya.m47229b(ceiw.f182736a.mo6606a().mo79183b()) ? abcq.m47450a(this.f57045c) : this.f57044b;
    }

    /* renamed from: c */
    public final synchronized void mo32045c(String str) {
        SQLiteDatabase a = mo32039a();
        if (a != null && a.isOpen() && !a.isReadOnly()) {
            a.delete("metrics", "app_package_name=? AND timestamp_millis<?", new String[]{str, String.valueOf(System.currentTimeMillis() - ceeg.f182447a.mo6606a().mo78957Y())});
        }
    }

    public final synchronized void close() {
        aart.m46807a(mo32043b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0596, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x059d A[SYNTHETIC, Splitter:B:196:0x059d] */
    /* renamed from: a */
    public final synchronized List mo32040a(String str) {
        Cursor cursor;
        SQLiteDatabase readableDatabase = mo32043b().getReadableDatabase();
        if (readableDatabase.isOpen()) {
            try {
                cursor = readableDatabase.query("metrics", f57043a, "app_package_name=?", new String[]{str}, null, null, null);
                try {
                    int columnIndex = cursor.getColumnIndex("_id");
                    int columnIndex2 = cursor.getColumnIndex("app_package_name");
                    int columnIndex3 = cursor.getColumnIndex("user_account_id");
                    int columnIndex4 = cursor.getColumnIndex("product_specific_context");
                    int columnIndex5 = cursor.getColumnIndex("session_id");
                    int columnIndex6 = cursor.getColumnIndex("user_action_type");
                    int columnIndex7 = cursor.getColumnIndex("sub_user_action_type");
                    int columnIndex8 = cursor.getColumnIndex("shown_content_list");
                    int columnIndex9 = cursor.getColumnIndex("query");
                    int columnIndex10 = cursor.getColumnIndex("url");
                    int columnIndex11 = cursor.getColumnIndex("click_rank");
                    int columnIndex12 = cursor.getColumnIndex("contact_mode_type");
                    int columnIndex13 = cursor.getColumnIndex("elapsed_millis");
                    int columnIndex14 = cursor.getColumnIndex("content_unit_type_enum");
                    int columnIndex15 = cursor.getColumnIndex("fragment_type");
                    int columnIndex16 = cursor.getColumnIndex("network_type_enum");
                    int columnIndex17 = cursor.getColumnIndex("timestamp_millis");
                    int columnIndex18 = cursor.getColumnIndex("gcore_version");
                    int columnIndex19 = cursor.getColumnIndex("client_version");
                    int columnIndex20 = cursor.getColumnIndex("offline");
                    int columnIndex21 = cursor.getColumnIndex("feedback_policy_set_version");
                    int columnIndex22 = cursor.getColumnIndex("experiment_token");
                    int columnIndex23 = cursor.getColumnIndex("flow");
                    int columnIndex24 = cursor.getColumnIndex("feedback_psd_count");
                    int columnIndex25 = cursor.getColumnIndex("feedback_psbd_count");
                    int columnIndex26 = cursor.getColumnIndex("feedback_screenshot_present");
                    int columnIndex27 = cursor.getColumnIndex("ocarina_elapsed_millis");
                    int columnIndex28 = cursor.getColumnIndex("ocarina_num_bytes");
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        ArrayList arrayList2 = arrayList;
                        bxvd da = abeh.f57196I.mo74144da();
                        int i = columnIndex14;
                        int i2 = cursor.getInt(columnIndex);
                        int i3 = columnIndex;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh = (abeh) da.f164949b;
                        int i4 = columnIndex13;
                        abeh.f57206a |= 1;
                        abeh.f57208c = i2;
                        String string = cursor.getString(columnIndex2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh2 = (abeh) da.f164949b;
                        string.getClass();
                        abeh2.f57206a |= 2;
                        abeh2.f57209d = string;
                        String string2 = cursor.getString(columnIndex3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh3 = (abeh) da.f164949b;
                        string2.getClass();
                        abeh3.f57206a |= 4;
                        abeh3.f57210e = string2;
                        String string3 = cursor.getString(columnIndex4);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh4 = (abeh) da.f164949b;
                        string3.getClass();
                        abeh4.f57206a |= 8;
                        abeh4.f57211f = string3;
                        String string4 = cursor.getString(columnIndex5);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh5 = (abeh) da.f164949b;
                        string4.getClass();
                        abeh5.f57206a |= 64;
                        abeh5.f57214i = string4;
                        int a = bzqd.m126036a(cursor.getInt(columnIndex6));
                        if (a != 0) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh6 = (abeh) da.f164949b;
                            abeh6.f57215j = a - 1;
                            abeh6.f57206a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh7 = (abeh) da.f164949b;
                            abeh7.f57215j = 0;
                            abeh7.f57206a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        }
                        int a2 = bzqb.m126034a(cursor.getInt(columnIndex7));
                        if (a2 != 0) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh8 = (abeh) da.f164949b;
                            abeh8.f57216k = a2 - 1;
                            abeh8.f57206a |= 1024;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh9 = (abeh) da.f164949b;
                            abeh9.f57216k = 0;
                            abeh9.f57206a |= 1024;
                        }
                        String string5 = cursor.getString(columnIndex8);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh10 = (abeh) da.f164949b;
                        string5.getClass();
                        abeh10.f57206a |= 2048;
                        abeh10.f57217l = string5;
                        String string6 = cursor.getString(columnIndex9);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh11 = (abeh) da.f164949b;
                        string6.getClass();
                        abeh11.f57206a |= 4096;
                        abeh11.f57218m = string6;
                        String string7 = cursor.getString(columnIndex10);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh12 = (abeh) da.f164949b;
                        string7.getClass();
                        abeh12.f57206a |= 8192;
                        abeh12.f57219n = string7;
                        int i5 = cursor.getInt(columnIndex11);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh13 = (abeh) da.f164949b;
                        abeh13.f57206a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        abeh13.f57220o = i5;
                        bzps a3 = bzps.m126020a(cursor.getInt(columnIndex12));
                        if (a3 != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh14 = (abeh) da.f164949b;
                            abeh14.f57221p = a3.f170959i;
                            abeh14.f57206a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        } else {
                            bzps bzps = bzps.UNKNOWN_CONTACT_MODE;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh15 = (abeh) da.f164949b;
                            abeh15.f57221p = bzps.f170959i;
                            abeh15.f57206a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        }
                        int i6 = columnIndex2;
                        long j = cursor.getLong(i4);
                        int i7 = i4;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh16 = (abeh) da.f164949b;
                        int i8 = columnIndex3;
                        abeh16.f57206a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        abeh16.f57222q = j;
                        int i9 = i;
                        int a4 = bzpu.m126024a(cursor.getInt(i9));
                        if (a4 != 0) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh17 = (abeh) da.f164949b;
                            abeh17.f57229x = a4 - 1;
                            abeh17.f57206a |= 536870912;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh18 = (abeh) da.f164949b;
                            abeh18.f57229x = 0;
                            abeh18.f57206a = 536870912 | abeh18.f57206a;
                        }
                        int i10 = columnIndex15;
                        int i11 = cursor.getInt(i10);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh19 = (abeh) da.f164949b;
                        int i12 = i9;
                        abeh19.f57206a |= 2097152;
                        abeh19.f57223r = i11;
                        int i13 = columnIndex16;
                        int a5 = bzpx.m126028a(cursor.getInt(i13));
                        if (a5 != 0) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh20 = (abeh) da.f164949b;
                            abeh20.f57224s = a5 - 1;
                            abeh20.f57206a |= 8388608;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh21 = (abeh) da.f164949b;
                            abeh21.f57224s = 0;
                            abeh21.f57206a |= 8388608;
                        }
                        int i14 = columnIndex4;
                        int i15 = columnIndex17;
                        long j2 = cursor.getLong(i15);
                        columnIndex16 = i13;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh22 = (abeh) da.f164949b;
                        int i16 = i10;
                        abeh22.f57206a |= 16777216;
                        abeh22.f57225t = j2;
                        int i17 = columnIndex5;
                        int i18 = columnIndex6;
                        long max = Math.max(0L, System.currentTimeMillis() - cursor.getLong(i15));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh23 = (abeh) da.f164949b;
                        abeh23.f57206a |= 33554432;
                        abeh23.f57226u = max;
                        int i19 = columnIndex18;
                        int i20 = cursor.getInt(i19);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh24 = (abeh) da.f164949b;
                        abeh24.f57206a |= 67108864;
                        abeh24.f57227v = i20;
                        int i21 = columnIndex19;
                        int i22 = cursor.getInt(i21);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh25 = (abeh) da.f164949b;
                        int i23 = i17;
                        abeh25.f57206a |= JGCastService.FLAG_PRIVATE_DISPLAY;
                        abeh25.f57230y = i22;
                        int i24 = columnIndex20;
                        boolean z = cursor.getInt(i24) == 1;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh26 = (abeh) da.f164949b;
                        columnIndex20 = i24;
                        abeh26.f57206a |= Integer.MIN_VALUE;
                        abeh26.f57231z = z;
                        int i25 = columnIndex21;
                        int i26 = cursor.getInt(i25);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh27 = (abeh) da.f164949b;
                        columnIndex21 = i25;
                        abeh27.f57206a |= 134217728;
                        abeh27.f57228w = i26;
                        int i27 = columnIndex22;
                        String string8 = cursor.getString(i27);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh28 = (abeh) da.f164949b;
                        string8.getClass();
                        columnIndex22 = i27;
                        abeh28.f57207b |= 1;
                        abeh28.f57198A = string8;
                        int i28 = columnIndex23;
                        String string9 = cursor.getString(i28);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh29 = (abeh) da.f164949b;
                        string9.getClass();
                        columnIndex23 = i28;
                        abeh29.f57206a |= 16;
                        abeh29.f57212g = string9;
                        int i29 = columnIndex24;
                        int i30 = cursor.getInt(i29);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh30 = (abeh) da.f164949b;
                        columnIndex24 = i29;
                        abeh30.f57207b |= 4;
                        abeh30.f57200C = i30;
                        int i31 = columnIndex25;
                        int i32 = cursor.getInt(i31);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh31 = (abeh) da.f164949b;
                        columnIndex25 = i31;
                        abeh31.f57207b |= 8;
                        abeh31.f57201D = i32;
                        int i33 = columnIndex26;
                        boolean z2 = cursor.getInt(i33) == 1;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh32 = (abeh) da.f164949b;
                        columnIndex26 = i33;
                        abeh32.f57207b |= 16;
                        abeh32.f57202E = z2;
                        long j3 = (long) cursor.getInt(columnIndex27);
                        columnIndex27 = columnIndex27;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh33 = (abeh) da.f164949b;
                        int i34 = i18;
                        abeh33.f57207b |= 32;
                        abeh33.f57203F = j3;
                        int i35 = columnIndex28;
                        int i36 = cursor.getInt(i35);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh34 = (abeh) da.f164949b;
                        abeh34.f57207b |= 64;
                        abeh34.f57204G = i36;
                        if (cehy.m136890b()) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abeh abeh35 = (abeh) da.f164949b;
                            abeh35.f57213h = 6;
                            abeh35.f57206a |= 32;
                        }
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add((abeh) da.mo74062i());
                        columnIndex28 = i35;
                        arrayList = arrayList3;
                        columnIndex5 = i23;
                        columnIndex6 = i34;
                        columnIndex14 = i12;
                        columnIndex = i3;
                        columnIndex18 = i19;
                        columnIndex19 = i21;
                        columnIndex3 = i8;
                        columnIndex4 = i14;
                        columnIndex15 = i16;
                        columnIndex17 = i15;
                        columnIndex2 = i6;
                        columnIndex13 = i7;
                    }
                    ArrayList arrayList4 = arrayList;
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo32044b(String str) {
        SQLiteDatabase a = mo32039a();
        if (a != null && a.isOpen() && !a.isReadOnly()) {
            if (TextUtils.isEmpty(str)) {
                Log.w("gH_MetricsDatabase", "Empty package name, cannot clear entry.");
            } else {
                a.delete("metrics", "app_package_name=?", new String[]{str});
            }
        }
    }

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.a(android.content.Context, abeh, boolean):void
     arg types: [android.content.Context, abeh, int]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.a(android.content.Context, abeh, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c5, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo32041a(abeh abeh) {
        SQLiteDatabase a = mo32039a();
        if (a != null && !a.isReadOnly()) {
            if (!a.isOpen()) {
                MetricsIntentOperation.m66596a(this.f57045c, abeh, false);
            } else if (TextUtils.isEmpty(abeh.f57209d)) {
                Log.e("gH_MetricsDatabase", "Application package name is empty, not logging metrics.");
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_package_name", abeh.f57209d);
                contentValues.put("user_account_id", abeh.f57210e);
                contentValues.put("product_specific_context", abeh.f57211f);
                contentValues.put("session_id", abeh.f57214i);
                int i = 1;
                if ((abeh.f57206a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    contentValues.put("user_action_type", (Integer) 0);
                } else {
                    int a2 = bzqd.m126036a(abeh.f57215j);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    contentValues.put("user_action_type", Integer.valueOf(a2 - 1));
                }
                if ((abeh.f57206a & 1024) != 0) {
                    int a3 = bzqb.m126034a(abeh.f57216k);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    contentValues.put("sub_user_action_type", Integer.valueOf(a3 - 1));
                } else {
                    contentValues.put("sub_user_action_type", (Integer) 0);
                }
                contentValues.put("shown_content_list", abeh.f57217l);
                contentValues.put("query", abeh.f57218m);
                contentValues.put("url", abeh.f57219n);
                contentValues.put("click_rank", Integer.valueOf(abeh.f57220o));
                if ((abeh.f57206a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0) {
                    contentValues.put("contact_mode_type", (Integer) 0);
                } else {
                    bzps a4 = bzps.m126020a(abeh.f57221p);
                    if (a4 == null) {
                        a4 = bzps.UNKNOWN_CONTACT_MODE;
                    }
                    contentValues.put("contact_mode_type", Integer.valueOf(a4.f170959i));
                }
                contentValues.put("elapsed_millis", Long.valueOf(abeh.f57222q));
                if ((abeh.f57206a & 536870912) == 0) {
                    contentValues.put("content_unit_type_enum", (Integer) 0);
                } else {
                    int a5 = bzpu.m126024a(abeh.f57229x);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    contentValues.put("content_unit_type_enum", Integer.valueOf(a5 - 1));
                }
                contentValues.put("fragment_type", Integer.valueOf(abeh.f57223r));
                if ((abeh.f57206a & 8388608) == 0) {
                    contentValues.put("network_type_enum", (Integer) 0);
                } else {
                    int a6 = bzpx.m126028a(abeh.f57224s);
                    if (a6 != 0) {
                        i = a6;
                    }
                    contentValues.put("network_type_enum", Integer.valueOf(i - 1));
                }
                contentValues.put("timestamp_millis", Long.valueOf(abeh.f57225t));
                contentValues.put("gcore_version", Integer.valueOf(abeh.f57227v));
                contentValues.put("client_version", Integer.valueOf(abeh.f57230y));
                contentValues.put("offline", Boolean.valueOf(abeh.f57231z));
                contentValues.put("feedback_policy_set_version", Integer.valueOf(abeh.f57228w));
                contentValues.put("experiment_token", abeh.f57198A);
                contentValues.put("flow", abeh.f57212g);
                contentValues.put("feedback_psd_count", Integer.valueOf(abeh.f57200C));
                contentValues.put("feedback_psbd_count", Integer.valueOf(abeh.f57201D));
                contentValues.put("feedback_screenshot_present", Boolean.valueOf(abeh.f57202E));
                contentValues.put("ocarina_elapsed_millis", Long.valueOf(abeh.f57203F));
                contentValues.put("ocarina_num_bytes", Integer.valueOf(abeh.f57204G));
                a.insert("metrics", null, contentValues);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo32042a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(((abeh) list.get(i)).f57208c));
        }
        SQLiteDatabase a = mo32039a();
        if (a != null && a.isOpen() && !a.isReadOnly()) {
            String join = TextUtils.join("\",\"", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 11);
            sb.append("_id IN (\"");
            sb.append(join);
            sb.append("\")");
            a.delete("metrics", sb.toString(), null);
        }
    }
}
