package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ayhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhz extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97642c;

    /* renamed from: d */
    final /* synthetic */ ayja f97643d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhz(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97643d = ayja;
        this.f97642c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        Cursor query;
        axxv axxv;
        String str;
        String str2;
        Map map;
        String str3;
        Map map2;
        HashMap hashMap;
        Map map3;
        ArrayList arrayList;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Iterator it;
        String str4;
        String str5;
        String str6;
        ApplicationInfo applicationInfo;
        String str7;
        String str8 = ",name:";
        String str9 = "Id:";
        axrs axrs = this.f97642c;
        ayja ayja = this.f97643d;
        axxv axxv2 = ayja.f97727f;
        PackageManager packageManager = ayja.f97725d;
        ArrayList arrayList2 = new ArrayList();
        SQLiteDatabase readableDatabase = axxv2.f96695c.getReadableDatabase();
        Map a = axxv.m83496a(readableDatabase, "dataitems", axzc.f96809a, "appkeys_id");
        Map a2 = axxv.m83496a(readableDatabase, "appkeys", axyy.f96805a, "_id");
        Map a3 = axxv.m83496a(readableDatabase, "assets", axzb.f96808a, "digest");
        Map a4 = axxv.m83496a(readableDatabase, "assetsacls", axyz.f96806a, "assets_digest");
        Map a5 = axxv.m83496a(readableDatabase, "assetrefs", axza.f96807a, "assets_digest");
        Map map4 = a4;
        Map map5 = a3;
        Map map6 = a2;
        Map map7 = a;
        Cursor query2 = readableDatabase.query("appkeys", null, null, null, null, null, null);
        HashMap hashMap2 = new HashMap();
        while (query2.moveToNext()) {
            try {
                String string = query2.getString(0);
                String string2 = query2.getString(1);
                if (Log.isLoggable("DataItems", 3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 28 + String.valueOf(string2).length());
                    sb.append("Package id: ");
                    sb.append(string);
                    sb.append(", Package name: ");
                    sb.append(string2);
                    Log.d("DataItems", sb.toString());
                }
                hashMap2.put(string, string2);
            } catch (Exception e) {
                Log.e("WearableService", "getStorageInformationInternal: exception during processing", e);
                this.f97642c.mo53398a(new StorageInfoResponse(8, -1, null));
                return;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query2.close();
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf = String.valueOf(hashMap2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb2.append("PackageIdToName: ");
            sb2.append(valueOf);
            Log.d("DataItems", sb2.toString());
        }
        String str10 = "DataItems";
        HashMap hashMap3 = hashMap2;
        query = readableDatabase.query("assetsacls", null, null, null, null, null, null);
        HashMap hashMap4 = new HashMap();
        while (query.moveToNext()) {
            String string3 = query.getString(0);
            String string4 = query.getString(1);
            Set set = (Set) hashMap4.get(string3);
            if (set == null) {
                set = new HashSet();
                hashMap4.put(string3, set);
            }
            set.add(string4);
        }
        query.close();
        if (Log.isLoggable(str10, 3)) {
            String valueOf2 = String.valueOf(hashMap4);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
            sb3.append("Package id to digests: ");
            sb3.append(valueOf2);
            Log.d(str10, sb3.toString());
        }
        File databasePath = axxv2.f96695c.f96810a.getDatabasePath("node.db");
        long length = databasePath != null ? databasePath.length() : 0;
        if (Log.isLoggable(str10, 3)) {
            StringBuilder sb4 = new StringBuilder(43);
            sb4.append("NODE database storage: ");
            sb4.append(length);
            Log.d(str10, sb4.toString());
        }
        for (Iterator it2 = hashMap3.keySet().iterator(); it2.hasNext(); it2 = it) {
            String str11 = (String) it2.next();
            String str12 = (String) hashMap3.get(str11);
            hashMap3 = hashMap3;
            axrs axrs2 = axrs;
            PackageManager packageManager2 = packageManager;
            long a6 = axxv.m83489a((Long) map7.get(str11));
            map7 = map7;
            Map map8 = map6;
            String str13 = str8;
            long a7 = axxv.m83489a((Long) map8.get(str11));
            Set set2 = (Set) hashMap4.get(str11);
            if (set2 == null) {
                hashMap = hashMap4;
                if (Log.isLoggable(str10, 4)) {
                    map2 = map8;
                    String valueOf3 = String.valueOf(str12);
                    Log.i(str10, valueOf3.length() == 0 ? new String("No asset digest found for package: ") : "No asset digest found for package: ".concat(valueOf3));
                } else {
                    map2 = map8;
                }
                str3 = str9;
                axxv = axxv2;
                arrayList = arrayList2;
                str2 = str10;
                str = str12;
                map = map4;
                j3 = 0;
                j2 = 0;
                j = 0;
                map3 = a5;
                j4 = 0;
            } else {
                hashMap = hashMap4;
                map2 = map8;
                Iterator it3 = set2.iterator();
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                while (it3.hasNext()) {
                    String str14 = (String) it3.next();
                    Iterator it4 = it3;
                    j6 += axxv.m83489a((Long) map5.get(str14));
                    map5 = map5;
                    Map map9 = map4;
                    j7 += axxv.m83489a((Long) map9.get(str14));
                    j8 += axxv.m83489a((Long) a5.get(str14));
                    Map map10 = a5;
                    File a8 = axxv2.f96696d.mo53578a(str14);
                    axxv axxv3 = axxv2;
                    if (Log.isLoggable(str10, 3)) {
                        if (a8 != null) {
                            String valueOf4 = String.valueOf(a8.getAbsolutePath());
                            Log.d(str10, valueOf4.length() == 0 ? new String("Asset file name: ") : "Asset file name: ".concat(valueOf4));
                        } else {
                            String valueOf5 = String.valueOf(str14);
                            Log.d(str10, valueOf5.length() == 0 ? new String("No asset file for digest: ") : "No asset file for digest: ".concat(valueOf5));
                        }
                    }
                    j9 += a8 != null ? a8.length() : 0;
                    a5 = map10;
                    axxv2 = axxv3;
                    map4 = map9;
                    it3 = it4;
                }
                axxv = axxv2;
                map3 = a5;
                arrayList = arrayList2;
                j3 = j7;
                str2 = str10;
                str = str12;
                j2 = j9;
                str3 = str9;
                map = map4;
                j = j6;
                j4 = j8;
            }
            long j10 = j4;
            long j11 = a6 + a7 + j + j3 + j4 + j2;
            long j12 = length + j11;
            String str15 = str2;
            if (Log.isLoggable(str15, 3)) {
                it = it2;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str11).length() + 47 + String.valueOf(str).length());
                str4 = str3;
                sb5.append(str4);
                sb5.append(str11);
                j5 = j11;
                str6 = str13;
                sb5.append(str6);
                str5 = str;
                sb5.append(str5);
                sb5.append(",dataitem storage:");
                sb5.append(a6);
                Log.d(str15, sb5.toString());
                StringBuilder sb6 = new StringBuilder(String.valueOf(str11).length() + 45 + String.valueOf(str5).length());
                sb6.append(str4);
                sb6.append(str11);
                sb6.append(str6);
                sb6.append(str5);
                sb6.append(",appkey storage:");
                sb6.append(a7);
                Log.d(str15, sb6.toString());
                StringBuilder sb7 = new StringBuilder(String.valueOf(str11).length() + 44 + String.valueOf(str5).length());
                sb7.append(str4);
                sb7.append(str11);
                sb7.append(str6);
                sb7.append(str5);
                sb7.append(",asset storage:");
                sb7.append(j);
                Log.d(str15, sb7.toString());
                StringBuilder sb8 = new StringBuilder(String.valueOf(str11).length() + 48 + String.valueOf(str5).length());
                sb8.append(str4);
                sb8.append(str11);
                sb8.append(str6);
                sb8.append(str5);
                sb8.append(",asset acl storage:");
                sb8.append(j3);
                Log.d(str15, sb8.toString());
                StringBuilder sb9 = new StringBuilder(String.valueOf(str11).length() + 48 + String.valueOf(str5).length());
                sb9.append(str4);
                sb9.append(str11);
                sb9.append(str6);
                sb9.append(str5);
                sb9.append(",asset ref storage:");
                sb9.append(j10);
                Log.d(str15, sb9.toString());
                StringBuilder sb10 = new StringBuilder(String.valueOf(str11).length() + 49 + String.valueOf(str5).length());
                sb10.append(str4);
                sb10.append(str11);
                sb10.append(str6);
                sb10.append(str5);
                sb10.append(",asset file storage:");
                sb10.append(j2);
                Log.d(str15, sb10.toString());
            } else {
                j5 = j11;
                it = it2;
                str6 = str13;
                str4 = str3;
                str5 = str;
            }
            PackageManager packageManager3 = packageManager2;
            try {
                applicationInfo = packageManager3.getApplicationInfo(str5, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                CharSequence loadLabel = applicationInfo.loadLabel(packageManager3);
                if (loadLabel != null) {
                    str7 = loadLabel.toString();
                    arrayList.add(new PackageStorageInfo(str5, str7, j5));
                    packageManager = packageManager3;
                    str8 = str6;
                    arrayList2 = arrayList;
                    str10 = str15;
                    str9 = str4;
                    axrs = axrs2;
                    a5 = map3;
                    hashMap4 = hashMap;
                    map6 = map2;
                    map4 = map;
                    length = j12;
                    axxv2 = axxv;
                }
            }
            str7 = str5;
            arrayList.add(new PackageStorageInfo(str5, str7, j5));
            packageManager = packageManager3;
            str8 = str6;
            arrayList2 = arrayList;
            str10 = str15;
            str9 = str4;
            axrs = axrs2;
            a5 = map3;
            hashMap4 = hashMap;
            map6 = map2;
            map4 = map;
            length = j12;
            axxv2 = axxv;
        }
        axrs.mo53398a(new StorageInfoResponse(0, length, arrayList2));
    }
}
