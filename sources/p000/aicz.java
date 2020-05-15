package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: aicz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aicz {

    /* renamed from: a */
    public final String f68758a;

    /* renamed from: b */
    public final String f68759b;

    /* renamed from: c */
    public final String f68760c;

    /* renamed from: d */
    public final String f68761d;

    /* renamed from: e */
    public final String f68762e;

    /* renamed from: f */
    public final int f68763f;

    /* renamed from: g */
    public final Bitmap f68764g;

    /* renamed from: h */
    public final boolean f68765h;

    /* renamed from: i */
    public final List f68766i;

    /* renamed from: j */
    public final Intent f68767j;

    /* renamed from: k */
    public final Intent f68768k;

    /* renamed from: l */
    public final boolean f68769l;

    /* renamed from: m */
    public final boolean f68770m;

    /* renamed from: n */
    public final int f68771n;

    /* renamed from: o */
    public String f68772o;

    /* renamed from: p */
    public final boolean f68773p;

    /* renamed from: q */
    public final boolean f68774q;

    /* renamed from: r */
    public final boolean f68775r;

    /* renamed from: s */
    private final int f68776s = 0;

    /* renamed from: t */
    private final String f68777t;

    public aicz(String str, String str2, String str3, String str4, String str5, int i, Bitmap bitmap, Intent intent, Intent intent2, boolean z, String str6, boolean z2, boolean z3, boolean z4) {
        sdo.m34959a((Object) str);
        this.f68758a = str;
        this.f68759b = str2;
        this.f68760c = str3;
        this.f68761d = str4;
        this.f68762e = str5;
        this.f68763f = i;
        this.f68764g = bitmap;
        this.f68777t = null;
        this.f68765h = false;
        this.f68766i = null;
        sdo.m34959a(intent);
        this.f68767j = intent;
        sdo.m34959a(intent2);
        this.f68768k = intent2;
        this.f68769l = z;
        this.f68770m = true;
        this.f68771n = 1;
        this.f68772o = str6;
        this.f68773p = z2;
        this.f68774q = z3;
        this.f68775r = z4;
    }

    /* renamed from: a */
    private static boolean m57014a(Intent intent, Intent intent2) {
        return sdg.m34949a(intent, intent2) || intent.filterEquals(intent2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aicz) {
            aicz aicz = (aicz) obj;
            int i = aicz.f68776s;
            if (this.f68763f == aicz.f68763f) {
                boolean z = aicz.f68765h;
                if (this.f68769l == aicz.f68769l) {
                    boolean z2 = aicz.f68770m;
                    int i2 = aicz.f68771n;
                    if (sdg.m34949a(this.f68758a, aicz.f68758a) && sdg.m34949a(this.f68759b, aicz.f68759b) && sdg.m34949a(this.f68760c, aicz.f68760c) && sdg.m34949a(this.f68761d, aicz.f68761d) && sdg.m34949a(this.f68762e, aicz.f68762e)) {
                        String str = aicz.f68777t;
                        if (sdg.m34949a(null, null)) {
                            List list = aicz.f68766i;
                            if (sdg.m34949a(null, null) && m57014a(this.f68767j, aicz.f68767j) && m57014a(this.f68768k, aicz.f68768k)) {
                                Bitmap bitmap = this.f68764g;
                                Bitmap bitmap2 = aicz.f68764g;
                                return (sdg.m34949a(bitmap, bitmap2) || (bitmap != null && bitmap.sameAs(bitmap2))) && sdg.m34949a(this.f68772o, aicz.f68772o) && this.f68773p == aicz.f68773p && this.f68774q == aicz.f68774q && this.f68775r == aicz.f68775r;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68758a, this.f68759b, this.f68760c, this.f68761d, this.f68762e, 0, Integer.valueOf(this.f68763f), null, false, null, Boolean.valueOf(this.f68769l), true, 1, this.f68772o, Boolean.valueOf(this.f68773p), Boolean.valueOf(this.f68775r)});
    }

    public final String toString() {
        return String.format(Locale.US, "DiscoveryNotificationItem{notificationId=%s, itemId=%s, title=%s, description=%s, priority=%d, smallIcon=%d, group=%s, isGroupSummary=%s, lines=%s, hasMuteNotificationButton=%s, autoCancel=%s, channelId=%s, isDevice=%s, isLarge=%s, isFirstParty=%s}", this.f68758a, this.f68759b, this.f68760c, this.f68761d, 0, Integer.valueOf(this.f68763f), null, false, null, Boolean.valueOf(this.f68769l), true, this.f68772o, Boolean.valueOf(this.f68773p), Boolean.valueOf(this.f68774q), Boolean.valueOf(this.f68775r));
    }
}
