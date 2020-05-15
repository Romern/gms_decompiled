package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TimingLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: axxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxr extends axxl {

    /* renamed from: a */
    final /* synthetic */ axxv f96671a;

    /* renamed from: b */
    private final axxi f96672b;

    /* renamed from: c */
    private final boolean f96673c;

    /* renamed from: d */
    private final String f96674d;

    /* renamed from: e */
    private axxi f96675e;

    /* renamed from: f */
    private IOException f96676f;

    public axxr(axxv axxv, axxi axxi, boolean z, String str) {
        this.f96671a = axxv;
        sdo.m34959a(axxi);
        this.f96672b = axxi;
        this.f96673c = z;
        this.f96674d = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo53717a(TimingLogger timingLogger, SQLiteDatabase sQLiteDatabase, LinkedHashMap linkedHashMap) {
        HashSet<String> hashSet;
        TimingLogger timingLogger2 = timingLogger;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        this.f96671a.f96698f.incrementAndGet();
        IOException iOException = this.f96676f;
        if (iOException == null) {
            axxi axxi = this.f96675e;
            HashSet<String> hashSet2 = null;
            if (axxi == null) {
                mo69138b(new axxs(this.f96672b, null, null));
                return;
            }
            if (!axxi.f96649d) {
                hashSet2 = new HashSet();
                hashSet = new HashSet();
                axxv axxv = this.f96671a;
                axue axue = axxi.f96646a;
                axxf axxf = axxi.f96647b;
                String str = axxf.f96639a;
                String str2 = axxf.f96640b;
                if (Log.isLoggable("DataItems", 3)) {
                    String valueOf = String.valueOf(axue);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(str).length() + String.valueOf(str2).length());
                    sb.append("requestMissingAssets: ");
                    sb.append(valueOf);
                    sb.append(", ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(str2);
                    Log.d("DataItems", sb.toString());
                }
                Cursor a = axxv.m83490a(axxv.f96695c.getReadableDatabase(), axue, str, str2, false, false, false);
                try {
                    HashSet<String> hashSet3 = new HashSet();
                    while (a.moveToNext()) {
                        String string = a.getString(12);
                        if (Log.isLoggable("DataItems", 3)) {
                            String valueOf2 = String.valueOf(string);
                            Log.d("DataItems", valueOf2.length() == 0 ? new String("requestMissingAssets: found digest of missing asset, ") : "requestMissingAssets: found digest of missing asset, ".concat(valueOf2));
                        }
                        if (!TextUtils.isEmpty(string)) {
                            hashSet3.add(string);
                        }
                    }
                    if (Log.isLoggable("DataItems", 3)) {
                        int size = hashSet3.size();
                        StringBuilder sb2 = new StringBuilder(54);
                        sb2.append("requestMissingAssets: found ");
                        sb2.append(size);
                        sb2.append(" missing assets");
                        Log.d("DataItems", sb2.toString());
                    }
                    for (String str3 : hashSet3) {
                        if (Log.isLoggable("DataItems", 3)) {
                            String valueOf3 = String.valueOf(str3);
                            Log.d("DataItems", valueOf3.length() == 0 ? new String("requestMissingAssets: calling onAssetMissing ") : "requestMissingAssets: calling onAssetMissing ".concat(valueOf3));
                        }
                        if (!axxv.m83502a(sQLiteDatabase2, str3)) {
                            hashSet2.add(str3);
                        } else if (!axxv.m83501a(sQLiteDatabase2, axue, str3)) {
                            hashSet.add(str3);
                        }
                    }
                    a.close();
                    timingLogger2.addSplit("findMissingAssetsLocked");
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            } else {
                hashSet = null;
            }
            mo69138b(new axxs(axxi, hashSet2, hashSet));
            if (axxi.f96649d || axxi.f96648c) {
                axxl.m83478a(linkedHashMap, axxi);
            } else if (this.f96673c) {
                if (hashSet2 != null) {
                    for (String str4 : hashSet2) {
                        this.f96671a.f96697e.mo53587a(axxi.f96646a, str4);
                        timingLogger2.addSplit("onAssetMissing");
                    }
                }
                if (hashSet != null) {
                    for (String str5 : hashSet) {
                        this.f96671a.f96697e.mo53592b(axxi.f96646a, str5);
                        timingLogger2.addSplit("onAssetPermissionMissing");
                    }
                }
                timingLogger2.addSplit("requestMissingAssets");
            }
        } else {
            mo69136a((Throwable) iOException);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(axxi, int, boolean, java.lang.String):boolean
     arg types: [axxi, int, int, java.lang.String]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, axue[]):axxu
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[], java.lang.String):java.util.Map
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String):void
      axxv.a(axue, java.lang.String, java.lang.String, boolean):void
      axxv.a(axxi, int, boolean, java.lang.String):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, axue[]):axxu
     arg types: [android.database.sqlite.SQLiteDatabase, java.lang.String, int, axue[]]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[], java.lang.String):java.util.Map
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String):void
      axxv.a(axue, java.lang.String, java.lang.String, boolean):void
      axxv.a(axxi, int, boolean, java.lang.String):boolean
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, axue[]):axxu */
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
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02f0, code lost:
        if (r0.f96689c != false) goto L_0x02f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0562 A[Catch:{ all -> 0x058c }] */
    /* renamed from: a */
    public final boolean mo53718a(TimingLogger timingLogger, SQLiteDatabase sQLiteDatabase) {
        axxi axxi;
        boolean z;
        String str;
        Iterator it;
        String str2;
        String str3;
        bobb a;
        TimingLogger timingLogger2 = timingLogger;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str4 = "dataitems";
        String str5 = "host";
        String str6 = ", ";
        int i = 3;
        if (this.f96674d != null) {
            axxv axxv = this.f96671a;
            axxi axxi2 = this.f96672b;
            int i2 = Build.VERSION.SDK_INT;
            if (axxv.mo53740a(axxi2, 1, true, this.f96674d)) {
                if (Log.isLoggable("DataItems", 3)) {
                    String str7 = this.f96674d;
                    String valueOf = String.valueOf(this.f96672b);
                    StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 45 + String.valueOf(valueOf).length());
                    sb.append("setDataItem: filtering data item from peer=");
                    sb.append(str7);
                    sb.append(str6);
                    sb.append(valueOf);
                    Log.d("DataItems", sb.toString());
                }
                this.f96671a.mo53734a(sQLiteDatabase2, this.f96672b);
                return false;
            }
            Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT node, seqId FROM nodeinfo WHERE node=?", new String[]{this.f96672b.f96650e});
            long j = -1;
            while (rawQuery.moveToNext()) {
                try {
                    j = rawQuery.getLong(1);
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            if (this.f96672b.f96651f <= j) {
                if (Log.isLoggable("DataItems", 3)) {
                    String str8 = this.f96674d;
                    String valueOf2 = String.valueOf(this.f96672b);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 89 + String.valueOf(valueOf2).length());
                    sb2.append("setDataItem: dropping data with old seqId from peer=");
                    sb2.append(str8);
                    sb2.append(", currentSeqId=");
                    sb2.append(j);
                    sb2.append(str6);
                    sb2.append(valueOf2);
                    Log.d("DataItems", sb2.toString());
                }
                return false;
            }
        }
        try {
            axxv axxv2 = this.f96671a;
            axxi axxi3 = this.f96672b;
            axue axue = axxi3.f96646a;
            axxf axxf = axxi3.f96647b;
            if (Log.isLoggable("DataItems", 3)) {
                String valueOf3 = String.valueOf(axxf);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                sb3.append("processAssetsInDataItem: ");
                sb3.append(valueOf3);
                Log.d("DataItems", sb3.toString());
            }
            Iterator it2 = axxf.mo53710a().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                axuh axuh = (axuh) entry.getValue();
                if (Log.isLoggable("DataItems", i)) {
                    String valueOf4 = String.valueOf(axuh);
                    str = str6;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 13);
                    sb4.append("  processing ");
                    sb4.append(valueOf4);
                    Log.d("DataItems", sb4.toString());
                } else {
                    str = str6;
                }
                byte[] bArr = axuh.f96386a;
                ParcelFileDescriptor parcelFileDescriptor = axuh.f96388c;
                if (bArr != null) {
                    if (Log.isLoggable("DataItems", 3)) {
                        String valueOf5 = String.valueOf(axue);
                        int length = bArr.length;
                        it = it2;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 34);
                        sb5.append("addRawAsset: ");
                        sb5.append(valueOf5);
                        sb5.append(", length: ");
                        sb5.append(length);
                        Log.d("DataItems", sb5.toString());
                    } else {
                        it = it2;
                    }
                    axui axui = axxv2.f96696d;
                    String str9 = new String(Base64.encode(axzr.m83642b().digest(bArr), 11));
                    if (Log.isLoggable("assets", 3)) {
                        Log.d("assets", str9.length() == 0 ? new String("saveAsset: digest=") : "saveAsset: digest=".concat(str9));
                    }
                    File b = ((axzr) axui).mo53806b(str9);
                    if (!b.exists()) {
                        if (Log.isLoggable("assets", 3)) {
                            Log.d("assets", String.format("Writing asset to file: %s; size=%d", b.getName(), Integer.valueOf(bArr.length)));
                        }
                        str2 = str4;
                        str3 = str5;
                        File file = new File(b.getParent(), String.valueOf(b.getName()).concat(".tmp"));
                        try {
                            a = bobb.m111033a();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            a.mo68842a(fileOutputStream);
                            fileOutputStream.write(bArr);
                            a.close();
                        } catch (Exception e) {
                            throw a.mo68841a(e);
                        } catch (FileNotFoundException e2) {
                            String valueOf6 = String.valueOf(file);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 25);
                            sb6.append("Fail to open asset file: ");
                            sb6.append(valueOf6);
                            Log.e("assets", sb6.toString(), e2);
                        } catch (IOException e3) {
                            String valueOf7 = String.valueOf(file);
                            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 29);
                            sb7.append("Fail to write asset to file: ");
                            sb7.append(valueOf7);
                            Log.e("assets", sb7.toString(), e3);
                            axzr.m83641a(file);
                        } catch (Exception e4) {
                            Log.e("assets", "General exception", e4);
                            axzr.m83641a(file);
                        } catch (Throwable th2) {
                            a.close();
                            throw th2;
                        }
                        if (!file.renameTo(b)) {
                            String valueOf8 = String.valueOf(file);
                            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 37);
                            sb8.append("Fail to move tmp file to asset file: ");
                            sb8.append(valueOf8);
                            Log.e("assets", sb8.toString());
                            axzr.m83641a(file);
                            throw new IOException("unable to write asset file");
                        } else if (Log.isLoggable("assets", 3)) {
                            String valueOf9 = String.valueOf(axzr.m83644c(str9));
                            Log.d("assets", valueOf9.length() == 0 ? new String("Wrote asset file: ") : "Wrote asset file: ".concat(valueOf9));
                        }
                    } else if (Log.isLoggable("assets", 3)) {
                        String valueOf10 = String.valueOf(axzr.m83644c(str9));
                        Log.d("assets", valueOf10.length() == 0 ? new String("Skipping write: asset file already exists: ") : "Skipping write: asset file already exists: ".concat(valueOf10));
                        str2 = str4;
                        str3 = str5;
                    } else {
                        str2 = str4;
                        str3 = str5;
                    }
                    axxu a2 = axxv.m83492a(sQLiteDatabase2, str9, true, axue);
                    boolean z2 = a2.f96688b;
                    if (z2) {
                    }
                    axxv2.f96697e.mo53591a(str9, z2, axxf, axue);
                    axxf.mo53711a((String) entry.getKey(), axuh.m83243a(str9));
                    it2 = it;
                    str6 = str;
                    str5 = str3;
                    str4 = str2;
                    i = 3;
                } else {
                    String str10 = str4;
                    String str11 = str5;
                    Iterator it3 = it2;
                    if (parcelFileDescriptor != null) {
                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                        i = 3;
                        if (Log.isLoggable("DataItems", 3)) {
                            String valueOf11 = String.valueOf(autoCloseInputStream);
                            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf11).length() + 10);
                            sb9.append("addAsset: ");
                            sb9.append(valueOf11);
                            Log.d("DataItems", sb9.toString());
                        }
                        String a3 = axxv2.f96696d.mo53579a(autoCloseInputStream, (AtomicLong) null);
                        axxu a4 = axxv.m83492a(sQLiteDatabase2, a3, true, axue);
                        boolean z3 = a4.f96688b;
                        if (!z3) {
                            if (!a4.f96689c) {
                                axxf.mo53711a((String) entry.getKey(), axuh.m83243a(a3));
                                it2 = it3;
                                str6 = str;
                                str5 = str11;
                                str4 = str10;
                            }
                        }
                        axxv2.f96697e.mo53591a(a3, z3, axxf, axue);
                        axxf.mo53711a((String) entry.getKey(), axuh.m83243a(a3));
                        it2 = it3;
                        str6 = str;
                        str5 = str11;
                        str4 = str10;
                    } else {
                        i = 3;
                        it2 = it3;
                        str6 = str;
                        str5 = str11;
                        str4 = str10;
                    }
                }
            }
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            timingLogger2.addSplit("processAssetsInDataItem");
            axxi axxi4 = this.f96672b;
            axue axue2 = axxi4.f96646a;
            axxf axxf2 = axxi4.f96647b;
            String str15 = "DataItems";
            Cursor a5 = axxv.m83490a(sQLiteDatabase, axue2, axxf2.f96639a, axxf2.f96640b, true, null, false);
            timingLogger2.addSplit("getDataItemsByHostAndPath");
            try {
                if (a5.moveToFirst()) {
                    timingLogger2.addSplit("moveToFirst");
                    String b2 = axxj.m83477b(a5);
                    axxi a6 = axxj.m83472a(a5);
                    timingLogger2.addSplit("toDataItemAndMoveToNext");
                    String str16 = str15;
                    String str17 = str14;
                    axxi = this.f96671a.mo53727a(timingLogger, sQLiteDatabase, b2, this.f96672b, a6);
                    timingLogger2.addSplit("updateExistingDataItem");
                    if (Log.isLoggable(str16, 3)) {
                        if (axxi != null) {
                            String valueOf12 = String.valueOf(axxi);
                            StringBuilder sb10 = new StringBuilder(String.valueOf(b2).length() + 23 + String.valueOf(valueOf12).length());
                            sb10.append("setDataItem: updated ");
                            sb10.append(b2);
                            sb10.append(str17);
                            sb10.append(valueOf12);
                            Log.d(str16, sb10.toString());
                        }
                    }
                } else {
                    String str18 = str15;
                    axxv axxv3 = this.f96671a;
                    axxi axxi5 = this.f96672b;
                    if (Log.isLoggable(str18, 3)) {
                        String valueOf13 = String.valueOf(axxi5);
                        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf13).length() + 19);
                        sb11.append("createNewDataItem: ");
                        sb11.append(valueOf13);
                        Log.d(str18, sb11.toString());
                    }
                    axxv3.mo53737a(axxi5);
                    axxv3.mo53734a(sQLiteDatabase2, axxi5);
                    long a7 = axxv.m83488a(sQLiteDatabase2, axxi5.f96646a);
                    ContentValues b3 = axxj.m83475b(axxi5);
                    b3.put("appkeys_id", Long.valueOf(a7));
                    b3.put(str13, axxi5.f96647b.f96639a);
                    b3.put("path", axxi5.f96647b.f96640b);
                    b3.put("timestampMs", Long.valueOf(axxi5.f96653h));
                    String str19 = str12;
                    long insert = sQLiteDatabase2.insert(str19, str13, b3);
                    if (Log.isLoggable(str18, 3)) {
                        String valueOf14 = String.valueOf(axxi5);
                        StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf14).length() + 48);
                        sb12.append("inserted data item row ");
                        sb12.append(insert);
                        sb12.append(" for ");
                        sb12.append(valueOf14);
                        Log.d(str18, sb12.toString());
                    }
                    String l = Long.toString(insert);
                    if (!axxi5.f96648c) {
                        for (Map.Entry entry2 : axxi5.f96647b.mo53710a().entrySet()) {
                            axxv.m83499a(sQLiteDatabase2, l, (String) entry2.getKey(), ((axuh) entry2.getValue()).f96387b);
                        }
                        if (axxi5.f96647b.mo53710a().isEmpty() || axxv.m83504b(sQLiteDatabase2, l)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        axxi5.f96649d = z;
                        if (z) {
                        }
                        timingLogger2.addSplit("createNewDataItem");
                        if (Log.isLoggable(str18, 3)) {
                            String valueOf15 = String.valueOf(axxi5);
                            StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf15).length() + 21);
                            sb13.append("setDataItem: created ");
                            sb13.append(valueOf15);
                            Log.d(str18, sb13.toString());
                        }
                        axxi = axxi5;
                    } else {
                        axxi5.f96649d = true;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("assetsPresent", (Integer) 1);
                    sQLiteDatabase2.update(str19, contentValues, "_id =?", new String[]{l});
                    timingLogger2.addSplit("createNewDataItem");
                    if (Log.isLoggable(str18, 3)) {
                    }
                    axxi = axxi5;
                }
                this.f96675e = axxi;
                return false;
            } finally {
                a5.close();
            }
        } catch (IOException e5) {
            this.f96676f = e5;
            timingLogger2.addSplit("failed with IOException");
            return false;
        }
    }
}
