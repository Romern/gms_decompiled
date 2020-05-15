package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: eoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eoh {

    /* renamed from: a */
    public static Context f15386a;

    /* renamed from: b */
    private final String f15387b;

    /* renamed from: c */
    private final int f15388c;

    public eoh() {
    }

    /* renamed from: a */
    public static void m10843a(SharedPreferences.Editor editor) {
        int i = Build.VERSION.SDK_INT;
        editor.apply();
    }

    public eoh(String str) {
        this(str, 0);
    }

    /* renamed from: a */
    public final SharedPreferences mo10354a() {
        return f15386a.getSharedPreferences(this.f15387b, this.f15388c);
    }

    @Deprecated
    public eoh(String str, int i) {
        this.f15387b = str;
        this.f15388c = i;
    }

    /* renamed from: a */
    public final eog mo10355a(String str, Boolean bool) {
        return new eoe(this, str, bool);
    }

    /* renamed from: a */
    public final eog mo10356a(String str, Integer num) {
        return new eof(this, str, num);
    }

    /* renamed from: a */
    public final eog mo10357a(String str, Long l) {
        return new eoc(this, str, l);
    }

    /* renamed from: a */
    public final eog mo10358a(String str, String str2) {
        return new eod(this, str, str2);
    }
}
