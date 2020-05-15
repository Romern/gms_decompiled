package p000;

import android.content.SharedPreferences;
import java.util.Locale;

/* renamed from: nbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbq {

    /* renamed from: a */
    public static final lvn f35205a = new lvn("TertiaryKeyRotationTracker");

    /* renamed from: b */
    public final SharedPreferences f35206b;

    /* renamed from: c */
    public final int f35207c;

    public nbq(SharedPreferences sharedPreferences, int i) {
        sdo.m34975b(i >= 0, String.format(Locale.US, "maxBackupsTillRotation should be non-negative but was %d", Integer.valueOf(i)));
        this.f35206b = sharedPreferences;
        this.f35207c = i;
    }

    /* renamed from: a */
    public final int mo20439a(String str) {
        return this.f35206b.getInt(str, 0);
    }
}
