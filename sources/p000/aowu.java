package p000;

import android.util.Log;

/* renamed from: aowu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowu {
    /* renamed from: a */
    private static String m69732a(String str, Object... objArr) {
        String format = String.format(str, objArr);
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        long id = currentThread.getId();
        int priority = currentThread.getPriority();
        String name2 = currentThread.getThreadGroup().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 56 + String.valueOf(name2).length());
        sb.append("[T ");
        sb.append(name);
        sb.append(":id=");
        sb.append(id);
        sb.append(":priority=");
        sb.append(priority);
        sb.append(":group=");
        sb.append(name2);
        sb.append("]");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(format).length() + 1 + String.valueOf(sb2).length());
        sb3.append(format);
        sb3.append(" ");
        sb3.append(sb2);
        return sb3.toString();
    }

    /* renamed from: b */
    public static void m69735b(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 4)) {
            Log.i(str, m69732a(str2, objArr));
        }
    }

    /* renamed from: c */
    public static void m69736c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, m69732a(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m69733a(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, m69732a(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m69734a(String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, m69732a(str2, objArr), th);
        }
    }
}
