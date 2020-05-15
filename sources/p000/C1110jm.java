package p000;

import android.app.Notification;

/* renamed from: jm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1110jm {

    /* renamed from: a */
    final String f22783a;

    /* renamed from: b */
    final int f22784b;

    /* renamed from: c */
    final String f22785c;

    /* renamed from: d */
    final Notification f22786d;

    public C1110jm(String str, int i, String str2, Notification notification) {
        this.f22783a = str;
        this.f22784b = i;
        this.f22785c = str2;
        this.f22786d = notification;
    }

    public final String toString() {
        return "NotifyTask[" + "packageName:" + this.f22783a + ", id:" + this.f22784b + ", tag:" + this.f22785c + "]";
    }
}
