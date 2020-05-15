package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.wallet.shared.common.ExceptionHandlingAsyncTask;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: awpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpd extends ExceptionHandlingAsyncTask implements Comparator {

    /* renamed from: a */
    private final SharedPreferences f94797a;

    /* renamed from: b */
    private final int f94798b;

    public awpd(Context context, SharedPreferences sharedPreferences, int i) {
        super(context);
        this.f94797a = sharedPreferences;
        this.f94798b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52117a(Object[] objArr) {
        String str;
        Void[] voidArr = (Void[]) objArr;
        Map<String, ?> all = this.f94797a.getAll();
        int size = all.size() - this.f94798b;
        TreeSet treeSet = new TreeSet(this);
        SharedPreferences.Editor edit = this.f94797a.edit();
        boolean z = false;
        for (String str2 : all.keySet()) {
            if (!(str2 == null || (str = (String) all.get(str2)) == null)) {
                long a = bjwb.m104763a(str).mo65575a(-1);
                if (a >= 0) {
                    treeSet.add(Pair.create(str2, Long.valueOf(a)));
                }
            }
            edit.remove(str2);
            size--;
            z = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Long) pair.second).longValue() >= currentTimeMillis && size <= 0) {
                break;
            }
            edit.remove((String) pair.first);
            size--;
            z = true;
        }
        if (!z) {
            return null;
        }
        edit.apply();
        return null;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        long longValue = ((Long) pair.second).longValue() - ((Long) pair2.second).longValue();
        if (longValue < 0) {
            return -1;
        }
        if (longValue > 0) {
            return 1;
        }
        return ((String) pair.first).compareTo((String) pair2.first);
    }
}
