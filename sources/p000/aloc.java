package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import java.util.List;

/* renamed from: aloc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aloc extends alnc {

    /* renamed from: b */
    private final String f73915b;

    /* renamed from: c */
    private final String f73916c;

    /* renamed from: d */
    private final String f73917d;

    /* renamed from: e */
    private final int f73918e;

    /* renamed from: f */
    private final boolean f73919f;

    /* renamed from: g */
    private final int f73920g;

    /* renamed from: s */
    private final int f73921s;

    /* renamed from: t */
    private final String f73922t;

    /* renamed from: u */
    private final int f73923u;

    /* renamed from: v */
    private final int f73924v;

    /* renamed from: c */
    public final DataHolder[] mo40605c(Context context) {
        int i;
        List list;
        boolean z;
        String str = this.f73915b;
        String str2 = this.f73916c;
        String str3 = this.f73917d;
        int i2 = this.f73918e;
        boolean z2 = this.f73919f;
        int i3 = this.f73920g;
        int i4 = this.f73921s;
        String str4 = this.f73922t;
        int i5 = this.f73923u;
        int i6 = this.f73924v;
        int i7 = i3 | 7;
        String a = ancm.m64002a(str3);
        if (i5 != 0) {
            i = i5;
        } else if (TextUtils.isEmpty(a)) {
            i = 3;
        } else {
            i = 2;
        }
        if (!TextUtils.isEmpty(str4)) {
            list = Arrays.asList(ancm.m64017f(str4));
        } else {
            list = null;
        }
        if (((int) cgbe.f186279a.mo6606a().mo83270a()) != 1) {
            z = false;
        } else {
            z = true;
        }
        String str5 = str4;
        DataHolder a2 = alog.m61419a(context, str, str2, null, list, i7, z2, 0, a, i2, i, i4, z);
        try {
            return new DataHolder[]{a2, alog.m61418a(context, (String) null, str5, i6)};
        } catch (SQLiteException e) {
            SQLiteException sQLiteException = e;
            a2.close();
            throw sQLiteException;
        }
    }

    public aloc(String str, int i, alzm alzm, String str2, String str3, String str4, int i2, boolean z, int i3, int i4, String str5, int i5, int i6) {
        super(str, i, alzm, true, str2, "LoadPeopleForAggregation");
        this.f73915b = str2;
        this.f73916c = str3;
        this.f73917d = str4;
        this.f73918e = i2;
        this.f73919f = z;
        this.f73920g = i3;
        this.f73921s = i4;
        this.f73922t = str5;
        this.f73923u = i5;
        this.f73924v = i6;
    }
}
