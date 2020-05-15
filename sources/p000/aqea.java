package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aqea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqea {

    /* renamed from: a */
    private final Context f85836a;

    /* renamed from: b */
    private final AppOpsManager f85837b;

    /* renamed from: c */
    private final Method f85838c = AppOpsManager.class.getMethod("getOpsForPackage", Integer.TYPE, String.class, int[].class);

    /* renamed from: d */
    private Method f85839d;

    public aqea(Context context) {
        this.f85836a = context;
        this.f85837b = (AppOpsManager) context.getSystemService("appops");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmu.a(java.lang.Object, java.lang.Iterable):void
     arg types: [java.lang.String, java.util.ArrayList]
     candidates:
      bndu.a(int, int):bndu
      bnci.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(bndd, int):void
      bndd.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(java.lang.Object, java.lang.Object):boolean
      bndl.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Iterable):void */
    /* renamed from: a */
    public final bnkd mo47766a(long j) {
        char c;
        int i;
        ArrayList arrayList;
        if (this.f85837b == null) {
            return bndu.m109109r();
        }
        bndu r = bndu.m109109r();
        int i2 = 0;
        List<PackageInfo> installedPackages = this.f85836a.getPackageManager().getInstalledPackages(0);
        ArrayList arrayList2 = new ArrayList();
        Iterator<PackageInfo> it = installedPackages.iterator();
        while (true) {
            c = 1;
            if (!it.hasNext()) {
                break;
            }
            PackageInfo next = it.next();
            if (next.applicationInfo != null && (1 & next.applicationInfo.flags) == 0) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            PackageInfo packageInfo = (PackageInfo) arrayList2.get(i3);
            Method method = this.f85838c;
            AppOpsManager appOpsManager = this.f85837b;
            Object[] objArr = new Object[3];
            objArr[i] = Integer.valueOf(packageInfo.applicationInfo.uid);
            objArr[c] = packageInfo.packageName;
            objArr[2] = null;
            List list = (List) method.invoke(appOpsManager, objArr);
            ArrayList arrayList3 = new ArrayList();
            if (list != null) {
                for (Object obj : list) {
                    if (this.f85839d == null) {
                        this.f85839d = obj.getClass().getMethod("getOps", new Class[i]);
                    }
                    long max = Math.max(j, packageInfo.lastUpdateTime);
                    List<Object> list2 = (List) this.f85839d.invoke(obj, new Object[i]);
                    if (list2 != null) {
                        for (Object obj2 : list2) {
                            aqdz aqdz = new aqdz(obj2);
                            if (aqdz.f85831a != null) {
                                ArrayList arrayList4 = arrayList2;
                                if (aqdz.f85832b >= max || aqdz.f85833c >= max || aqdz.f85834d >= max) {
                                    arrayList3.add(aqdz);
                                    arrayList2 = arrayList4;
                                } else {
                                    arrayList2 = arrayList4;
                                }
                            }
                        }
                        i = 0;
                    } else {
                        i = 0;
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
            }
            if (!arrayList3.isEmpty()) {
                r.mo67308a((Object) packageInfo.packageName, (Iterable) arrayList3);
            }
            i3++;
            arrayList2 = arrayList;
            i2 = 0;
            c = 1;
        }
        return r;
    }
}
