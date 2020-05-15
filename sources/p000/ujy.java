package p000;

import android.content.ContentValues;
import java.util.Locale;

/* renamed from: ujy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ujy extends uny {

    /* renamed from: c */
    public static final /* synthetic */ int f47832c = 0;

    /* renamed from: a */
    public final long f47833a;

    /* renamed from: b */
    public final String f47834b;

    public ujy(uno uno, long j, long j2, String str) {
        super(uno, ukb.f47839a, j);
        this.f47833a = j2;
        this.f47834b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(uka.ENTRY_ID.f47838c.mo27700a(), Long.valueOf(this.f47833a));
        contentValues.put(uka.SDK_APP_ID.f47838c.mo27700a(), this.f47834b);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "EntryAuthorizedApp [entrySqlId=%d, sdkAppId=%s]", Long.valueOf(this.f47833a), this.f47834b);
    }

    public ujy(uno uno, long j, String str) {
        this(uno, -1, j, str);
    }
}
