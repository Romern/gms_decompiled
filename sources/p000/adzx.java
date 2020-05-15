package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: adzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adzx extends ContentObserver {

    /* renamed from: a */
    private final adzu f62972a;

    public adzx(String str, String str2, Handler handler) {
        super(handler);
        this.f62972a = adzw.f62971d.mo16697a(getClass(), 20, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13611a(boolean z, Uri uri);

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        String str;
        adzu adzu;
        if (!z) {
            adzu = this.f62972a;
            str = "onChange";
        } else {
            adzu = this.f62972a;
            str = "onSelfChange";
        }
        blji b = adzu.mo16696b(str);
        try {
            mo13611a(z, uri);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
