package p000;

import android.content.SharedPreferences;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bdbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbl implements bdbk {

    /* renamed from: a */
    private final SharedPreferences f105266a;

    public bdbl(SharedPreferences sharedPreferences) {
        this.f105266a = sharedPreferences;
    }

    /* renamed from: a */
    public final List mo57849a(String str) {
        Set<String> stringSet = this.f105266a.getStringSet(str, new HashSet());
        ArrayList arrayList = new ArrayList(stringSet.size());
        for (String str2 : stringSet) {
            try {
                arrayList.add(InetAddress.getByAddress(boan.f132472f.mo68796b(str2)));
            } catch (UnknownHostException e) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo57850a(String str, List list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(boan.f132472f.mo68794a(((InetAddress) list.get(i)).getAddress()));
        }
        this.f105266a.edit().putStringSet(str, hashSet).apply();
    }
}
