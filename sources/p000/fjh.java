package p000;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: fjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjh {

    /* renamed from: a */
    private final TreeSet f16712a;

    public fjh(Context context, Collection collection) {
        TreeSet treeSet = new TreeSet();
        this.f16712a = treeSet;
        treeSet.clear();
        HashSet<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            Iterator it = this.f16712a.iterator();
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str.startsWith(str2)) {
                    z = false;
                } else if (str2.startsWith(str)) {
                    this.f16712a.remove(str2);
                }
            }
            if (z) {
                this.f16712a.add(str);
            }
        }
    }

    /* renamed from: a */
    protected static final Throwable m11810a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: a */
    public final String mo10888a(String str, Throwable th) {
        int length;
        int length2;
        Throwable a = m11810a(th);
        StackTraceElement[] stackTrace = m11810a(th).getStackTrace();
        StackTraceElement stackTraceElement = null;
        if (stackTrace != null && (length2 = stackTrace.length) != 0) {
            int i = 0;
            loop0:
            while (true) {
                if (i >= length2) {
                    stackTraceElement = stackTrace[0];
                    break;
                }
                StackTraceElement stackTraceElement2 = stackTrace[i];
                String className = stackTraceElement2.getClassName();
                Iterator it = this.f16712a.iterator();
                while (it.hasNext()) {
                    if (className.startsWith((String) it.next())) {
                        stackTraceElement = stackTraceElement2;
                        break loop0;
                    }
                }
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            sb.append(String.format(" (@%s:%s:%s)", (split == null || (length = split.length) <= 0) ? "unknown" : split[length - 1], stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
        }
        if (str != null) {
            sb.append(String.format(" {%s}", str));
        }
        return sb.toString();
    }
}
