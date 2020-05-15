package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aaof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaof {

    /* renamed from: b */
    private static aaof f28679b;

    /* renamed from: a */
    public final Context f28680a;

    /* renamed from: c */
    private final aeat f28681c;

    /* renamed from: d */
    private final aakz f28682d;

    public aaof(Context context, aeat aeat, aakz aakz) {
        this.f28680a = context.getApplicationContext();
        this.f28681c = aeat;
        this.f28682d = aakz;
    }

    /* renamed from: a */
    public static synchronized aaof m21749a(Context context) {
        aaof aaof;
        synchronized (aaof.class) {
            if (f28679b == null) {
                f28679b = new aaof(context, aeat.m51532a(context), aakz.m21424a(context));
            }
            aaof = f28679b;
        }
        return aaof;
    }

    /* renamed from: b */
    private static final List m21752b(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferences.getString("accountList", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("\\|")) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final boolean m21753c() {
        return aaoe.m21744a(this.f28680a) != null;
    }

    /* renamed from: a */
    public static final void m21750a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("groups_state", 3);
        edit.remove("accountList");
        edit.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0182, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e A[SYNTHETIC, Splitter:B:47:0x012e] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135 A[Catch:{ IOException -> 0x00a9 }] */
    /* renamed from: b */
    public final synchronized boolean mo17173b() {
        String str;
        ArrayList arrayList;
        boolean z;
        synchronized (this) {
            if (m21753c()) {
                SharedPreferences b = aakw.m21417b(this.f28680a);
                List b2 = m21752b(b);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                m21751a(b2, arrayList2, arrayList3);
                if (cecz.f182285a.mo6606a().mo78784C() == 1) {
                    String a = aaoe.m21744a(this.f28680a);
                    if (!TextUtils.isEmpty(a)) {
                        str = a;
                    }
                } else {
                    str = null;
                }
                String B = cecz.f182285a.mo6606a().mo78783B();
                String l = Long.toString(System.currentTimeMillis() / 1000);
                int size = arrayList3.size();
                int i = 0;
                int i2 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (i2 < size) {
                    String str2 = (String) arrayList3.get(i2);
                    int i3 = i + 1;
                    StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 12);
                    sb.append(l);
                    sb.append("-");
                    sb.append(i);
                    String sb2 = sb.toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("a", str2);
                    if (str != null) {
                        bundle.putString("id", str);
                    }
                    ArrayList arrayList4 = arrayList3;
                    bundle.putString("r", "1");
                    try {
                        this.f28682d.mo16962a(B, sb2, bundle);
                        b2.remove(str2);
                        z3 = true;
                    } catch (IOException e) {
                        Log.i("GCM-GMS", "Failed to send remove message", e);
                        z2 = true;
                    }
                    i2++;
                    i = i3;
                    arrayList3 = arrayList4;
                }
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Account account = (Account) arrayList2.get(i4);
                    int i5 = i + 1;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(l).length() + 12);
                    sb3.append(l);
                    sb3.append("-");
                    sb3.append(i);
                    String sb4 = sb3.toString();
                    Bundle bundle2 = new Bundle();
                    int i6 = size2;
                    bundle2.putString("a", account.name);
                    if (str != null) {
                        bundle2.putString("id", str);
                    }
                    try {
                        arrayList = arrayList2;
                        try {
                            bundle2.putString("t", gie.m13187a(this.f28680a, account, "oauth2:https://www.googleapis.com/auth/gcm"));
                            z = true;
                        } catch (gid | IOException e2) {
                            e = e2;
                            bundle2.putString("e", e.getMessage());
                            Log.i("GCM-GMS", "Failed to subscribe to group.", e);
                            z = false;
                            this.f28682d.mo16962a(B, sb4, bundle2);
                            if (z) {
                            }
                            i4++;
                            i = i5;
                            size2 = i6;
                            arrayList2 = arrayList;
                        }
                    } catch (gid | IOException e3) {
                        e = e3;
                        arrayList = arrayList2;
                        bundle2.putString("e", e.getMessage());
                        Log.i("GCM-GMS", "Failed to subscribe to group.", e);
                        z = false;
                        this.f28682d.mo16962a(B, sb4, bundle2);
                        if (z) {
                        }
                        i4++;
                        i = i5;
                        size2 = i6;
                        arrayList2 = arrayList;
                    }
                    try {
                        this.f28682d.mo16962a(B, sb4, bundle2);
                        if (z) {
                            b2.add(account.name);
                            z3 = true;
                        } else {
                            z2 = true;
                        }
                    } catch (IOException e4) {
                        Log.i("GCM-GMS", "Failed to send add message", e4);
                        z2 = true;
                    }
                    i4++;
                    i = i5;
                    size2 = i6;
                    arrayList2 = arrayList;
                }
                SharedPreferences.Editor edit = b.edit();
                if (z2) {
                    edit.putInt("groups_state", 2);
                    Log.i("GCM-GMS", "Groups upload failed");
                } else {
                    edit.putInt("groups_state", 1);
                    edit.putLong("groups_last_upload", System.currentTimeMillis());
                }
                if (z3) {
                    edit.putString("accountList", TextUtils.join("|", b2));
                }
                edit.apply();
                if (!z2) {
                    return true;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m21751a(List list, List list2, List list3) {
        try {
            Account[] d = gie.m13199d(this.f28680a, "com.google");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                int length = d.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (str.equals(d[i2].name)) {
                            break;
                        }
                        i2++;
                    } else {
                        list3.add(str);
                        break;
                    }
                }
            }
            for (Account account : d) {
                if (!list.contains(account.name)) {
                    list2.add(account);
                }
            }
        } catch (RemoteException | rfv | rfw e) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public final void mo17172a() {
        if (m21753c()) {
            SharedPreferences b = aakw.m21417b(this.f28680a);
            int i = b.getInt("groups_state", 0);
            if (i != 0) {
                if (i == 1) {
                    long D = cecz.f182285a.mo6606a().mo78785D();
                    if (D > 0) {
                        if (System.currentTimeMillis() > b.getLong("groups_last_upload", -1) + (D * 1000)) {
                            m21750a(b);
                        }
                    }
                    List b2 = m21752b(b);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    m21751a(b2, arrayList, arrayList2);
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        return;
                    }
                } else if (!(i == 2 || i == 3)) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Unknown groups state: ");
                    sb.append(i);
                    Log.e("GCM-GMS", sb.toString());
                }
            }
            aebi aebi = new aebi();
            aebi.f63099k = "groups_upload";
            aebi.f63097i = "com.google.android.gms.gcm.gmsproc.GcmInGmsTaskService";
            aebi.mo34004a(0L, 30L);
            aebi.mo34024a(0, 0);
            aebi.mo34023a(0);
            aebi.f63102n = true;
            this.f28681c.mo33984a(aebi.mo33974b());
        }
    }
}
