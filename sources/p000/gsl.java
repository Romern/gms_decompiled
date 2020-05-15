package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: gsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsl {

    /* renamed from: a */
    public static final imn f18953a = new gsk();

    /* renamed from: b */
    public final SharedPreferences f18954b;

    /* renamed from: c */
    private final svq f18955c;

    public gsl(Context context) {
        svq b = svr.m36484b(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth.account.visibility.whitelist.prefs", 0);
        sdo.m34959a(b);
        this.f18955c = b;
        sdo.m34959a(sharedPreferences);
        this.f18954b = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo12169a(String str) {
        try {
            PackageInfo b = this.f18955c.mo26176b(str, 0);
            if (b != null) {
                return b.firstInstallTime;
            }
            throw new gkn("Invalid Info");
        } catch (PackageManager.NameNotFoundException e) {
            throw new gkn("Invalid package name.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    public final boolean mo12171b(String str) {
        sdo.m34969a(str, (Object) "Package name must not be empty");
        long j = this.f18954b.getLong(str, 0);
        if (j == 0 || j != mo12169a(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List mo12170a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f18954b.getAll().entrySet()) {
            String key = entry.getKey();
            try {
                if (!((Long) entry.getValue()).equals(Long.valueOf(mo12169a(key)))) {
                    arrayList.add(key);
                } else {
                    arrayList2.add(key);
                }
            } catch (gkn e) {
                arrayList.add(key);
            }
        }
        if (!arrayList.isEmpty()) {
            SharedPreferences.Editor edit = this.f18954b.edit();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                edit.remove((String) arrayList.get(i));
            }
            edit.commit();
        }
        return arrayList2;
    }
}
